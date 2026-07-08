package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.popcard.click.BroadcastProductCardClickListener$pin$2$1", f = "BroadcastProductCardClickListener.kt", l = {}, m = "invokeSuspend")
public final class C593980NRk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21212617zo LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593980NRk(C21212617zo c21212617zo, String str, InterfaceC1364105Vn<? super C593980NRk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21212617zo;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593980NRk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "BroadcastProductCardClickListener@d5c3.pin$2$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.17zo r0 = r5.LL
            X.17xY<X.17y8> r0 = r0.LIZ
            T extends android.view.View r0 = r0.LLILZIL
            if (r0 == 0) goto L42
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L42
            android.app.Activity r3 = X.C1388190mED.LIZ(r0)
            if (r3 == 0) goto L42
            java.lang.String r2 = r5.LLILLJJLI
            X.17zo r1 = r5.LL
            X.0mGx r0 = new X.0mGx
            r0.<init>(r3)
            r0.LJIIJ(r2)
            r0.LJIIJJI()
            X.17xY<X.17y8> r0 = r1.LIZ
            kotlin.jvm.internal.AwS611S0100000_32 r1 = r0.LLJJI
            if (r1 == 0) goto L42
            r0 = 1
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L3e:
            X.C1C7U.LIZIZ(r4)
            return r0
        L42:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593980NRk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
