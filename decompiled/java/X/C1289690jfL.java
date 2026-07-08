package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* JADX INFO: renamed from: X.0jfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289690jfL {
    public static final /* synthetic */ int LIZ = 0;

    public static C1325710kbR LIZ(String str) {
        Uri uri = UriProtector.parse(str);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.LJFF = true;
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        C1324770kZv.LIZ(c1325700kbQLIZLLL);
        imageDecodeOptionsBuilder.getClass();
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        return c1325700kbQLIZLLL.LIZ();
    }
}
