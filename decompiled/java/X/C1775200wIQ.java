package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKSingleVideoView$preloadAweme$1", f = "MMKSingleVideoView.kt", l = {924}, m = "invokeSuspend")
public final class C1775200wIQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1775300wIa LLILLL;
    public final /* synthetic */ EnumC1775210wIR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775200wIQ(C1775300wIa c1775300wIa, EnumC1775210wIR enumC1775210wIR, InterfaceC1364105Vn<? super C1775200wIQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1775300wIa;
        this.LLILZ = enumC1775210wIR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1775200wIQ c1775200wIQ = new C1775200wIQ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1775200wIQ.LLILLJJLI = obj;
        return c1775200wIQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775200wIQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
