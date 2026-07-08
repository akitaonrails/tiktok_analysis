package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0EJB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJB {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final C01GW LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r0 = 0;
     */
    static {
        /*
            X.0EJB r0 = new X.0EJB
            boolean r0 = X.C0EJA.LJI()
            r2 = 0
            if (r0 == 0) goto L35
            r0 = 0
        La:
            X.C0EJB.LIZ = r0
            int r1 = X.C0EJA.LJFF()
            r0 = 1
            if (r1 == r0) goto L2a
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 3
            if (r1 == r0) goto L2a
        L19:
            r0 = 18
        L1b:
            X.C0EJB.LIZIZ = r0
            r0 = 231(0xe7, float:3.24E-43)
            kotlin.jvm.internal.AFwS191S0000000_5 r0 = kotlin.jvm.internal.AFwS191S0000000_5.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            X.C0EJB.LIZJ = r0
            return
        L2a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L19
            int r0 = r0.intValue()
            goto L1b
        L35:
            r0 = 10
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EJB.<clinit>():void");
    }

    public static int LIZIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static int LIZ(Context context) {
        Integer numValueOf;
        C0EJE c0ejeLJ = C0EJA.LJ(C390810FTz.LIZJ(context));
        int iLJFF = C0EJA.LJFF();
        int i = 32;
        if (iLJFF != 1 && iLJFF != 2 && iLJFF != 3) {
            numValueOf = 32;
        } else {
            int i2 = C0EJD.LIZ[c0ejeLJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i = 43;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = 38;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
