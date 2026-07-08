package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2474609mq {
    public static UrlModel LIZ(Uri uri) {
        if (uri == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uri.toString());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public static boolean LIZIZ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            return true;
        }
        return false;
    }
}
