package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0Mls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578100Mls {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static void LIZ(Context context) {
        int i;
        int iLIZIZ;
        C1660610tJb c1660610tJb = C1660610tJb.LIZ;
        c1660610tJb.p2();
        int iLIZIZ2 = c1660610tJb.LIZIZ();
        if (iLIZIZ2 == 1 || iLIZIZ2 != 2) {
        }
        if (C0CHQ.LIZ().LJJJJJ().getABService().getButtonPositionGoDownExperiment()) {
            i = 25;
        } else {
            i = 40;
        }
        int iLIZ = C0LEO.LIZ() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (C1462920oAk.LIZLLL()) {
            iLIZIZ = ((iLIZ + ((int) C11VU.LIZIZ(100.0f, context))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(5.0f)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        } else {
            iLIZIZ = iLIZ + ((int) C11VU.LIZIZ(100.0f, context)) + ((int) C11VU.LIZIZ(-12.5f, context));
        }
        LIZIZ = (int) (iLIZIZ + C11VU.LIZ(11.0f));
    }

    public static void LIZIZ(Context context) {
        int statusBarHeight;
        if (ScreenUtils.getScreenWidth(context) / (ScreenUtils.getFullScreenHeight(context) - c0.LIZ.o2()) >= 0.5625f) {
            statusBarHeight = ScreenUtils.getStatusBarHeight(context);
        } else {
            float screenWidth = ScreenUtils.getScreenWidth(context) / 0.75f;
            int i = LIZIZ;
            if (i < 0) {
                LIZ(context);
                i = LIZIZ;
            }
            statusBarHeight = (int) ((r2 - i) - screenWidth);
        }
        LIZ = statusBarHeight;
    }

    public static int LIZJ(Context context) {
        int i = LIZ;
        if (i >= 0) {
            return i;
        }
        LIZIZ(context);
        return LIZ;
    }
}
