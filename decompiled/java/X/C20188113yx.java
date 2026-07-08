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
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel$fetchMediaModelBitmap$tempFile$1", f = "SceneryPictureViewModel.kt", l = {}, m = "invokeSuspend")
public final class C20188113yx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IHostSubscription.Result.PhotoFile>, Object> {
    public final /* synthetic */ LiveSubMediaModel LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ IHostSubscription.Params LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20188113yx(LiveSubMediaModel liveSubMediaModel, Context context, IHostSubscription.Params params, InterfaceC1364105Vn<? super C20188113yx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveSubMediaModel;
        this.LLILLJJLI = context;
        this.LLILLL = params;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20188113yx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        ContentResolver contentResolver;
        Cursor cursorLJJJ;
        int columnIndex;
        C1C7U.LIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$tempFile$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveSubMediaModel liveSubMediaModel = this.LL;
        Context context = this.LLILLJJLI;
        Uri uri = UriProtector.parse(liveSubMediaModel.getFileLocalUriPath());
        String string = null;
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme == null || "file".equals(scheme)) {
                string = uri.getPath();
            } else if ("content".equals(scheme) && context != null && (contentResolver = context.getContentResolver()) != null && (cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, new String[]{"_data"}, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXSSo1Mo2Z/soXDXKIstsq13889TSiT34P9sO8SVnB1mZ+kLNbjYFhibsdIMYGlBvkVmzVExgTLG+CFNSs=", null))) != null) {
                if (cursorLJJJ.moveToFirst() && (columnIndex = cursorLJJJ.getColumnIndex("_data")) > -1) {
                    string = cursorLJJJ.getString(columnIndex);
                }
                cursorLJJJ.close();
            }
        }
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(string, 1080, 1080);
        IHostSubscription.Result.PhotoFile photoFile = new IHostSubscription.Result.PhotoFile();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uri", UriProtector.parse(liveSubMediaModel.getFileLocalUriPath()).getPath());
        jSONObject.put("file_name", liveSubMediaModel.getFileName());
        photoFile.path = C786410Ut5.J3(jSONObject);
        photoFile.size = bitmapFromSD.getByteCount();
        photoFile.bitmap = bitmapFromSD;
        photoFile.withTextSticker = liveSubMediaModel.getWithTextSticker();
        C1C7U.LIZIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$tempFile$1");
        return photoFile;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IHostSubscription.Result.PhotoFile> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
