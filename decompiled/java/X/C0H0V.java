package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.JoinRemixCTAButtonType$onShowButton$2", f = "JoinRemixCTAButtonType.kt", l = {78}, m = "invokeSuspend")
public final class C0H0V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0H0X LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H0V(C0H0X c0h0x, InterfaceC1364105Vn<? super C0H0V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0h0x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H0V(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "JoinRemixCTAButtonType@f8ae.onShowButton$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 != r4) goto L52
            X.C155000ia.LIZIZ(r7)
        L13:
            java.lang.Integer r7 = (java.lang.Integer) r7
        L15:
            X.0H0X r1 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.LJFF
            if (r3 == 0) goto L33
            X.0H0Z r0 = com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi r2 = X.C0H0Z.LIZ()
            if (r2 == 0) goto L33
            java.lang.String r1 = r1.LIZLLL
            if (r7 == 0) goto L39
            int r0 = r7.intValue()
            if (r0 != 0) goto L39
        L30:
            r2.LJ(r3, r1, r4)
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L39:
            r4 = 0
            goto L30
        L3b:
            X.C155000ia.LIZIZ(r7)
            X.0H0X r0 = r6.LLILLJJLI
            X.099G r0 = r0.LJ
            if (r0 == 0) goto L50
            r6.LL = r4
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r1) goto L13
            X.C1C7U.LIZIZ(r5)
            return r1
        L50:
            r7 = 0
            goto L15
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H0V.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
