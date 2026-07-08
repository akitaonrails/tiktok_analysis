package X;

import android.content.Context;

/* JADX INFO: renamed from: X.10KY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KY {
    public final C10KU LIZ = new C10KU();

    public final Integer LIZ(Context context) {
        int i;
        if (C19228210Ki.LIZJ()) {
            if (C19228210Ki.LIZ(context) == EnumC19227710Kd.NARROW) {
                i = 295;
            } else if (C19228210Ki.LIZ(context) == EnumC19227710Kd.NORMAL) {
                i = 323;
            } else {
                i = 370;
            }
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((C1389340mG4.LIZJ(context, null).LIZIZ() - i) / 2))));
        }
        if (context == null) {
            return null;
        }
        return Integer.valueOf((C497820Jfg.LIZIZ(context) - LIZJ(context)) / 2);
    }

    public final int LIZIZ(Context context) {
        double dLIZ;
        double d;
        if (C497820Jfg.LIZ(context) > C497820Jfg.LIZIZ(context)) {
            dLIZ = ((double) C497820Jfg.LIZIZ(context)) * 0.5d;
            d = this.LIZ.LIZJ;
        } else {
            dLIZ = C497820Jfg.LIZ(context);
            d = 0.6d;
        }
        return (int) (dLIZ * d);
    }

    public final int LIZJ(Context context) {
        double dLIZ;
        if (C497820Jfg.LIZ(context) > C497820Jfg.LIZIZ(context)) {
            dLIZ = ((double) C497820Jfg.LIZIZ(context)) * 0.5d;
        } else {
            dLIZ = ((double) C497820Jfg.LIZ(context)) * 0.6d * (1.0d / ((double) this.LIZ.LIZJ));
        }
        return (int) dLIZ;
    }
}
