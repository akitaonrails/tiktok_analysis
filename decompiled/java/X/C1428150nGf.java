package X;

import android.content.Context;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS210S0000000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0nGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428150nGf {
    public static int LIZ;
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(69));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final int LJ;
    public static int LJFF;
    public static int LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1810));
        LJIIIIZZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(559));
    }

    public static int LIZLLL() {
        return LIZ + LIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LJI <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) ? 8 : 12)));
    }

    public static int LIZIZ() {
        if (!C1462920oAk.LIZLLL()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        }
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        return c1660590tJZ != null ? c1660590tJZ.LIZIZ() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
    }

    public static RectF LIZJ() {
        int iLIZIZ = LIZIZ() + LIZLLL + LIZJ + LJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LJI <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) ? 12 : 16)));
        int iLIZLLL = LIZLLL();
        int i = (LJFF - iLIZIZ) - iLIZLLL;
        int i2 = (LJI * 4) / 3;
        if (i <= i2) {
            float f = iLIZLLL;
            return new RectF(0.0f, f, LJI, i + f);
        }
        float f2 = iLIZLLL;
        float f3 = (i - i2) / 2;
        return new RectF(0.0f, f2 + f3, LJI, (f2 + i) - f3);
    }

    public static void LIZ(Context context) {
        int statusBarHeight;
        int statusBarHeight2;
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (C1462920oAk.LIZLLL() && c1660590tJZ != null && context != null) {
            statusBarHeight2 = c1660590tJZ.LJ(context).topMargin + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            if (c1660590tJZ.LJI()) {
                statusBarHeight = ScreenUtils.getStatusBarHeight(context);
            } else {
                statusBarHeight = 0;
            }
        } else {
            statusBarHeight = C1428160nGg.LIZ;
            statusBarHeight2 = ScreenUtils.getStatusBarHeight(context);
        }
        LIZ = statusBarHeight2 + statusBarHeight + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        LJI = ScreenUtils.getScreenWidth(context);
        LJFF = ScreenUtils.getFullScreenHeight(context) - C14KQ.LIZLLL(context);
    }
}
