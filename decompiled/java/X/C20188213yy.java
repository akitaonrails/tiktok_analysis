package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20188213yy {
    public static final /* synthetic */ int LIZ = 0;

    public static IHostSubscription.Result.PhotoFile LIZ(Context context, LiveSubMediaModel liveSubMediaModel, IHostSubscription.Params params) throws JSONException {
        Bitmap bitmapCreateBitmap;
        ContentResolver contentResolver;
        Cursor cursorLJJJ;
        int columnIndex;
        Uri uri = UriProtector.parse(liveSubMediaModel.getFileLocalUriPath());
        String string = null;
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme == null || "file".equals(scheme)) {
                string = uri.getPath();
            } else if ("content".equals(scheme) && context != null && (contentResolver = context.getContentResolver()) != null && (cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, new String[]{"_data"}, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbha6GwAgZTWyYhlaEZtsqXeOD5IFa8qiLXpFy61u", null))) != null) {
                if (cursorLJJJ.moveToFirst() && (columnIndex = cursorLJJJ.getColumnIndex("_data")) > -1) {
                    string = cursorLJJJ.getString(columnIndex);
                }
                cursorLJJJ.close();
            }
        }
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(string, 1080, 1080);
        new IHostSubscription.Result.PhotoFile();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uri", UriProtector.parse(liveSubMediaModel.getFileLocalUriPath()).getPath());
        jSONObject.put("file_name", liveSubMediaModel.getFileName());
        C786410Ut5.J3(jSONObject);
        bitmapFromSD.getByteCount();
        liveSubMediaModel.getWithTextSticker();
        if (bitmapFromSD.getWidth() < params.max_width && bitmapFromSD.getHeight() < params.max_height) {
            if (bitmapFromSD.getWidth() < bitmapFromSD.getHeight()) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, 0, (bitmapFromSD.getHeight() - bitmapFromSD.getWidth()) / 2, bitmapFromSD.getWidth(), bitmapFromSD.getWidth());
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, (bitmapFromSD.getWidth() - bitmapFromSD.getHeight()) / 2, 0, bitmapFromSD.getHeight(), bitmapFromSD.getHeight());
            }
            bitmapFromSD.getWidth();
            bitmapFromSD.getHeight();
        } else if (bitmapFromSD.getWidth() > params.max_width && bitmapFromSD.getHeight() < params.max_height) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, (bitmapFromSD.getWidth() - bitmapFromSD.getHeight()) / 2, 0, bitmapFromSD.getHeight(), bitmapFromSD.getHeight());
        } else if (bitmapFromSD.getWidth() < params.max_width && bitmapFromSD.getHeight() > params.max_height) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, 0, (bitmapFromSD.getHeight() - bitmapFromSD.getWidth()) / 2, bitmapFromSD.getWidth(), bitmapFromSD.getWidth());
        } else {
            int width = (bitmapFromSD.getWidth() - params.max_width) / 2;
            int height = bitmapFromSD.getHeight();
            int i = params.max_height;
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, width, (height - i) / 2, params.max_width, i);
        }
        IHostSubscription.Result.PhotoFile photoFile = new IHostSubscription.Result.PhotoFile();
        photoFile.size = bitmapCreateBitmap.getByteCount();
        photoFile.bitmap = bitmapCreateBitmap;
        photoFile.withTextSticker = liveSubMediaModel.getWithTextSticker();
        return photoFile;
    }
}
