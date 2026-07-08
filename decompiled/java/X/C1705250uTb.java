package X;

import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705250uTb {
    public static volatile C1705250uTb LIZIZ;
    public static final C1705270uTd LIZ = new C1705270uTd();
    public static final C01GW<C1705230uTZ> LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS215S0000000_26.get$arr$(427));

    public static boolean LIZJ() {
        return C1705270uTd.LIZ().LIZIZ(EnumC1705190uTV.PAINTER) && C1705270uTd.LIZ().LIZIZ(EnumC1705190uTV.ERASER);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.effectmanager.effect.model.Effect LIZIZ(int r3) {
        /*
            boolean r0 = LIZJ()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            X.0uTZ r0 = X.C1705270uTd.LIZ()
            java.util.Map r1 = r0.LIZ()
            if (r3 == 0) goto L2c
            r0 = 1
            if (r3 == r0) goto L2c
            r0 = 2
            if (r3 == r0) goto L2c
            r0 = 3
            if (r3 == r0) goto L1f
            r0 = 4
            if (r3 == r0) goto L2c
        L1e:
            return r2
        L1f:
            X.0uTV r0 = X.EnumC1705190uTV.ERASER
            java.lang.Object r0 = r1.get(r0)
            X.0uTR r0 = (X.C1705150uTR) r0
            if (r0 == 0) goto L1e
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.LIZ
            return r2
        L2c:
            X.0uTV r0 = X.EnumC1705190uTV.PAINTER
            java.lang.Object r0 = r1.get(r0)
            X.0uTR r0 = (X.C1705150uTR) r0
            if (r0 == 0) goto L1e
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.LIZ
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705250uTb.LIZIZ(int):com.ss.android.ugc.effectmanager.effect.model.Effect");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2182208gm
            if (r0 == 0) goto L3b
            r4 = r6
            X.08gm r4 = (X.C2182208gm) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            boolean r0 = LIZJ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            X.0uTZ r0 = X.C1705270uTd.LIZ()
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LIZJ(r4)
            if (r0 != r2) goto L22
            return r2
        L3b:
            X.08gm r4 = new X.08gm
            r4.<init>(r5, r6)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705250uTb.LIZ(X.05Vn):java.lang.Object");
    }
}
