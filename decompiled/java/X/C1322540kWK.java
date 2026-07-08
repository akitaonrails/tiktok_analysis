package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* JADX INFO: renamed from: X.0kWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322540kWK {
    public static C1325710kbR LIZ(Uri uri, InterfaceC1291910jiv interfaceC1291910jiv) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.LJFF = true;
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.LIZIZ(1);
        imageDecodeOptionsBuilder.LJ = false;
        C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJFF = c1329360khK;
        c1325700kbQLIZLLL.LJIILIIL = interfaceC1291910jiv;
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
        return c1325700kbQLIZLLL.LIZ();
    }
}
