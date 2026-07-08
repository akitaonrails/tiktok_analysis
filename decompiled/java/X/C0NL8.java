package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: renamed from: X.0NL8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.Trigger$BatchDelayTrigger", f = "Trigger.kt", l = {123, 148}, m = "trigger")
public final class C0NL8 extends AbstractC23140094w {
    public PdpViewModel LL;
    public C259800zU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0NL9 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NL8(C0NL9 c0nl9, InterfaceC1364105Vn<? super C0NL8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0nl9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Trigger$BatchDelayTrigger@95c8.trigger$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("Trigger$BatchDelayTrigger@95c8.trigger$1");
        return objLIZ;
    }
}
