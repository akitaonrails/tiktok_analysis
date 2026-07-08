package X;

import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856620yPk {
    public static C1856260yPA LIZ(int i, BaseImage baseImage) {
        float f;
        float fLIZIZ;
        double dMax;
        int i2;
        int iLIZIZ;
        boolean z = true;
        if (i > 1) {
            float fLIZIZ2 = C418440Gaw.LIZIZ(12);
            float screenWidth = ScreenUtils.getScreenWidth(C2213981Bky.LIZIZ.getApplicationContext()) - (C418440Gaw.LIZIZ(6) * 2);
            if (C07ID.LIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            int i3 = ((int) (screenWidth - (iLIZIZ * 2))) / 3;
            return new C1856260yPA(i3, i3, fLIZIZ2, fLIZIZ2, fLIZIZ2, fLIZIZ2);
        }
        int i4 = baseImage.width;
        if (i4 > 0 && (i2 = baseImage.height) > 0) {
            f = i4 / i2;
        } else {
            f = 1.0f;
        }
        C1856640yPm.LIZ.getClass();
        C1153090g71.LIZ.getClass();
        if (C1153090g71.LIZIZ(0, C1856640yPm.class) != 1) {
            z = false;
        }
        if (z) {
            Pair pairLIZ = C306850C1b.LIZ(f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(162)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(162)));
            fLIZIZ = ((Number) pairLIZ.getFirst()).intValue();
            dMax = ((Number) pairLIZ.getSecond()).intValue();
        } else {
            double d = f;
            if (d <= 0.5d) {
                fLIZIZ = C418440Gaw.LIZIZ(162);
                dMax = C418440Gaw.LIZIZ(288);
            } else if (f < 1.0f) {
                fLIZIZ = C418440Gaw.LIZIZ(162);
                dMax = Math.max(C418440Gaw.LIZIZ(162), Math.min((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(288)));
            } else if (d <= 1.2d) {
                fLIZIZ = C418440Gaw.LIZIZ(162);
                dMax = Math.max(C418440Gaw.LIZIZ(126), Math.min((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(162)));
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(260);
                dMax = Math.max(C418440Gaw.LIZIZ(80), Math.min((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(162)));
            }
        }
        float fLIZIZ3 = C418440Gaw.LIZIZ(12);
        float fLIZIZ4 = C418440Gaw.LIZIZ(12);
        return new C1856260yPA((int) fLIZIZ, (int) dMax, fLIZIZ3, fLIZIZ4, fLIZIZ3, fLIZIZ4);
    }
}
