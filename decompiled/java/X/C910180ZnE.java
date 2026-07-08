package X;

import Y.AgS295S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.common.display.ActionBarCommonDisplayManagerAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.common.display.ActionBarCommonDisplayManagerAssem$subscribeToPanelState$1", f = "ActionBarCommonDisplayManagerAssem.kt", l = {151}, m = "invokeSuspend")
public final class C910180ZnE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ActionBarCommonDisplayManagerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910180ZnE(ActionBarCommonDisplayManagerAssem actionBarCommonDisplayManagerAssem, InterfaceC1364105Vn<? super C910180ZnE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = actionBarCommonDisplayManagerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910180ZnE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionBarCommonDisplayManagerAssem@8560.subscribeToPanelState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ActionBarCommonDisplayManagerAssem.LLJIJIL;
            AnonymousClass0951 anonymousClass0951 = ((PanelStateViewModel) assemVMLazy.getValue()).LLIZ;
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 81);
            this.LL = 1;
            if (anonymousClass0951.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ActionBarCommonDisplayManagerAssem@8560.subscribeToPanelState$1");
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
