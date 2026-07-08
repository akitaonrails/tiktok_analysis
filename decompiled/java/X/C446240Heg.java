package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* JADX INFO: renamed from: X.0Heg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446240Heg {
    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static void LIZ(C422780Ghw c422780Ghw, String str) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (c422780Ghw != null && !TextUtils.isEmpty(str)) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c422780Ghw.getController();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c422780Ghw.setController(c1320810kTXLIZJ.LIZ());
        }
    }
}
