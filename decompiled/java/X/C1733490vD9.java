package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;

/* JADX INFO: renamed from: X.0vD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733490vD9 implements InterfaceC599000NeU {
    public final ISeaLiveContextAbility LIZ;

    public C1733490vD9(ISeaLiveContextAbility iSeaLiveContextAbility) {
        this.LIZ = iSeaLiveContextAbility;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // X.InterfaceC599000NeU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map r8, X.InterfaceC1364105Vn r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1733510vDB
            if (r0 == 0) goto L21
            r6 = r9
            X.0vDB r6 = (X.C1733510vDB) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L5f
        L21:
            X.0vDB r6 = new X.0vDB
            r6.<init>(r7, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility r0 = r7.LIZ     // Catch: java.lang.Exception -> L8f
            X.0vC9 r0 = r0.JC2()     // Catch: java.lang.Exception -> L8f
            X.0vC8 r1 = r0.LIZ()     // Catch: java.lang.Exception -> L8f
            java.lang.Class<X.0vDF> r0 = X.InterfaceC1733550vDF.class
            X.0vC6 r0 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L8f
            X.0vDF r0 = (X.InterfaceC1733550vDF) r0     // Catch: java.lang.Exception -> L8f
            if (r0 != 0) goto L56
            X.0Nec r3 = new X.0Nec     // Catch: java.lang.Exception -> L8f
            X.0vD7 r0 = X.EnumC1733470vD7.FOLLOW_ANIM_ERROR_NO_HANDLER     // Catch: java.lang.Exception -> L8f
            int r1 = r0.getCode()     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> L8f
            r3.<init>(r1, r0, r4)     // Catch: java.lang.Exception -> L8f
            return r3
        L56:
            r6.LLILLL = r2     // Catch: java.lang.Exception -> L8f
            java.lang.Object r5 = r0.LLLZ(r6)     // Catch: java.lang.Exception -> L8f
            if (r5 != r3) goto L62
            return r3
        L5f:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L8f
        L62:
            kotlin.Pair r5 = (kotlin.Pair) r5     // Catch: java.lang.Exception -> L8f
            java.lang.Object r0 = r5.getFirst()     // Catch: java.lang.Exception -> L8f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L8f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L77
            X.0Nea r3 = new X.0Nea     // Catch: java.lang.Exception -> L8f
            r0 = 3
            r3.<init>(r4, r0)     // Catch: java.lang.Exception -> L8f
            return r3
        L77:
            X.0Nec r3 = new X.0Nec     // Catch: java.lang.Exception -> L8f
            X.0vD7 r2 = X.EnumC1733470vD7.FOLLOW_ANIM_ERROR_FOLLOW_FAILED     // Catch: java.lang.Exception -> L8f
            int r1 = r2.getCode()     // Catch: java.lang.Exception -> L8f
            java.lang.Object r0 = r5.getSecond()     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L8f
            if (r0 != 0) goto L8b
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Exception -> L8f
        L8b:
            r3.<init>(r1, r0, r4)     // Catch: java.lang.Exception -> L8f
            return r3
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Nec r3 = new X.0Nec
            X.0vD7 r2 = X.EnumC1733470vD7.FOLLOW_ANIM_ERROR_FOLLOW_EXCEPTION
            int r1 = r2.getCode()
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto La5
            java.lang.String r0 = r2.getMessage()
        La5:
            r3.<init>(r1, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733490vD9.LIZ(java.util.Map, X.05Vn):java.lang.Object");
    }
}
