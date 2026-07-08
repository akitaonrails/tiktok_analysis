package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0taq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1671300taq {
    public static boolean LIZ = true;

    public abstract int LIZIZ();

    public abstract int LIZJ();

    public final int LIZLLL() {
        return LIZ ? LIZIZ() : LIZJ();
    }

    public AbstractC1671300taq() {
        C1385040m98.LIZJ(true);
        C1385040m98.LIZJ(false);
    }

    public final C1361400lX0 LJFF(Context context) {
        int iLIZJ;
        if (context == null) {
            return null;
        }
        if (LIZ) {
            iLIZJ = LIZIZ();
        } else {
            iLIZJ = LIZJ();
        }
        return new C1361400lX0(context, iLIZJ);
    }

    public static Object LIZ(Object obj, Object obj2) {
        if (!LIZ) {
            return obj2;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000a, B:8:0x0018, B:10:0x001e, B:14:0x002b, B:19:0x0043, B:20:0x004a, B:22:0x0050, B:26:0x005a, B:28:0x005f, B:30:0x0066, B:29:0x0064, B:23:0x0055, B:15:0x0030, B:17:0x003a), top: B:36:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.scene.Scene r4, java.lang.Boolean r5) {
        /*
            r3 = this;
            android.app.Activity r1 = r4.mActivity     // Catch: java.lang.Throwable -> L75
            boolean r0 = r1 instanceof X.C19EG     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L74
            X.19EG r1 = (X.C19EG) r1     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L74
            com.bytedance.immersionbar.ImmersionBar r0 = com.bytedance.immersionbar.ImmersionBar.LJIILJJIL(r1)     // Catch: java.lang.Throwable -> L75
            com.bytedance.tux.system.TuxImmersionBar r2 = new com.bytedance.tux.system.TuxImmersionBar     // Catch: java.lang.Throwable -> L75
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L75
            r2.LJIIL()     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L30
            android.content.Context r1 = r4.getSceneContext()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L4a
            boolean r0 = r5.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L28
            r0 = 2131100540(0x7f06037c, float:1.7813464E38)
            goto L2b
        L28:
            r0 = 2131100549(0x7f060385, float:1.7813483E38)
        L2b:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> L75
            goto L41
        L30:
            android.content.Context r0 = r4.getSceneContext()     // Catch: java.lang.Throwable -> L75
            X.0lX0 r1 = r3.LJFF(r0)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L4a
            r0 = 2131108588(0x7f0622ec, float:1.7829788E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> L75
        L41:
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L75
            r2.LJFF(r0)     // Catch: java.lang.Throwable -> L75
        L4a:
            r1 = 0
            r2.LIZ(r1)     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L55
            boolean r0 = r5.booleanValue()     // Catch: java.lang.Throwable -> L75
            goto L57
        L55:
            boolean r0 = X.AbstractC1671300taq.LIZ     // Catch: java.lang.Throwable -> L75
        L57:
            if (r0 != 0) goto L5a
            r1 = 1
        L5a:
            r2.LJIIJ(r1)     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L64
            boolean r0 = r5.booleanValue()     // Catch: java.lang.Throwable -> L75
            goto L66
        L64:
            boolean r0 = X.AbstractC1671300taq.LIZ     // Catch: java.lang.Throwable -> L75
        L66:
            r0 = r0 ^ 1
            r2.LJI(r0)     // Catch: java.lang.Throwable -> L75
            r2.LIZLLL()     // Catch: java.lang.Throwable -> L75
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L75
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L75
            return
        L74:
            return
        L75:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1671300taq.LJ(com.bytedance.scene.Scene, java.lang.Boolean):void");
    }
}
