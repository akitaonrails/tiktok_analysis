package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.quickreply.AIQuickReplyManager$loadCacheFromDB$1", f = "AIQuickReplyManager.kt", l = {64, 69}, m = "invokeSuspend")
public final class C611440NyY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C611440NyY(InterfaceC1364105Vn<? super C611440NyY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C611440NyY(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "AIQuickReplyManager@476a.loadCacheFromDB$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 0
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L45
            if (r0 != r7) goto La1
            X.C155000ia.LIZIZ(r12)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r12)
            X.0Nye r0 = X.C611500Nye.LIZ
            r0.getClass()
            X.01GW r0 = X.C611500Nye.LJI
            java.lang.Object r1 = r0.getValue()
            X.0NyZ r1 = (X.InterfaceC611450NyZ) r1
            if (r1 == 0) goto L74
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r0 = r0.getCurUserId()
            r11.LL = r2
            java.lang.Object r12 = r1.LIZIZ(r0, r11)
            if (r12 != r6) goto L48
            X.C1C7U.LIZIZ(r10)
            return r6
        L45:
            X.C155000ia.LIZIZ(r12)
        L48:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L75
            java.util.Iterator r9 = r12.iterator()
        L50:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r9.next()
            X.0Nyb r1 = (X.C611470Nyb) r1
            X.0Nye r0 = X.C611500Nye.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, X.0Nyc> r5 = X.C611500Nye.LIZJ
            java.lang.String r4 = r1.LIZIZ
            X.0Nyc r3 = new X.0Nyc
            X.0Nyd r2 = X.EnumC611490Nyd.SUCCESS
            java.util.List<java.lang.String> r1 = r1.LIZJ
            r0 = 8
            r3.<init>(r2, r1, r0)
            r5.put(r4, r3)
            goto L50
        L74:
            r12 = r8
        L75:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Loaded "
            r1.append(r0)
            if (r12 == 0) goto L88
            int r0 = r12.size()
            java.lang.Integer r8 = X.C2286608xc.LJ(r0)
        L88:
            r1.append(r8)
            java.lang.String r0 = " replies from cache."
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0Nye r0 = X.C611500Nye.LIZ
            r11.LL = r7
            java.lang.Object r0 = r0.LIZJ(r11)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r10)
            return r6
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611440NyY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C611440NyY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
