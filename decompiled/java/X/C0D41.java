package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D41, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.preload.PdpPreloadScheduler$launchSkuTask$1", f = "PdpPreloadScheduler.kt", l = {175}, m = "invokeSuspend")
public final class C0D41 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0D47 LLILLJJLI;
    public final /* synthetic */ C0D43 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D41(C0D47 c0d47, C0D43 c0d43, InterfaceC1364105Vn<? super C0D41> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d47;
        this.LLILLL = c0d43;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D41(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[LOOP:1: B:53:0x00b8->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D41.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
