package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: renamed from: X.0NL2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.Trigger$DelayTrigger", f = "Trigger.kt", l = {60}, m = "trigger")
public final class C0NL2 extends AbstractC23140094w {
    public C0NLD LL;
    public PdpViewModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0NL1 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NL2(C0NL1 c0nl1, InterfaceC1364105Vn<? super C0NL2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0nl1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Trigger$DelayTrigger@b641.trigger$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, null, this);
        C1C7U.LIZIZ("Trigger$DelayTrigger@b641.trigger$1");
        return objLIZ;
    }
}
