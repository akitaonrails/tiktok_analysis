package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0vuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.view.SeaPdpLynxPopup$handleShowComponent$1", f = "SeaPdpLynxPopup.kt", l = {49}, m = "invokeSuspend")
public final class C1760180vuC extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1760170vuB LLILLL;
    public final /* synthetic */ InterfaceC1760220vuG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1760180vuC(long j, C1760170vuB c1760170vuB, InterfaceC1760220vuG interfaceC1760220vuG, InterfaceC1364105Vn<? super C1760180vuC> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1760170vuB;
        this.LLILZ = interfaceC1760220vuG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1760180vuC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpLynxPopup@9de5.handleShowComponent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpLynxPopup@9de5.handleShowComponent$1");
                return objLJFF;
            }
        }
        this.LLILLL.LJIIL = true;
        C1760170vuB c1760170vuB = this.LLILLL;
        c1760170vuB.LJIILIIL = null;
        this.LLILZ.LIZJ(c1760170vuB.LJFF, "load timeout", null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpLynxPopup@9de5.handleShowComponent$1");
        return unit;
    }
}
