package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0kZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324780kZw {
    public static C1325710kbR[] LIZIZ(Bitmap.Config config, String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.LIZIZ(1);
        imageDecodeOptionsBuilder.LJ = false;
        if (config != null) {
            imageDecodeOptionsBuilder.setBitmapConfig(config);
        }
        C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJFF = c1329360khK;
        C1324750kZt.LJIILL(c1325700kbQLIZLLL);
        return new C1325710kbR[]{c1325700kbQLIZLLL.LIZ()};
    }

    public static void LIZ(C1322110kVd c1322110kVd, C1325710kbR[] c1325710kbRArr, C1320700kTM c1320700kTM, boolean z, Object obj) {
        if (c1325710kbRArr == null) {
            C1324750kZt.LIZIZ(c1322110kVd, R.drawable.dhr);
            return;
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
        c1320810kTXLIZJ.LJIIJJI = z;
        c1320810kTXLIZJ.LIZJ = obj;
        c1320810kTXLIZJ.LJFF(c1325710kbRArr, true);
        if (c1320700kTM != null) {
            c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
        }
        c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
    }
}
