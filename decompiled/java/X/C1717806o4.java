package X;

import Y.AgS193S0200000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAssem$subscribePanelShow$1", f = "BusinessLandingMsgAssem.kt", l = {187}, m = "invokeSuspend")
public final class C1717806o4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BusinessLandingMsgAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717806o4(BusinessLandingMsgAssem businessLandingMsgAssem, InterfaceC1364105Vn<? super C1717806o4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = businessLandingMsgAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717806o4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessLandingMsgAssem@525d.subscribePanelShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C013C c013c = new C013C();
            c013c.element = true;
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessLandingMsgAssem.LLJJJIL;
            AnonymousClass0951 anonymousClass0951 = ((PanelStateViewModel) assemVMLazy.getValue()).LLIZ;
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(c013c, this.LLILLJJLI, 26);
            this.LL = 1;
            if (anonymousClass0951.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("BusinessLandingMsgAssem@525d.subscribePanelShow$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
