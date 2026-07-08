package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.actionbar.common.display.ActionBarCommonDisplayManagerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.common.display.ActionBarCommonDisplayManagerAssem$subscribeToReplyState$1", f = "ActionBarCommonDisplayManagerAssem.kt", l = {169}, m = "invokeSuspend")
public final class C910190ZnF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ActionBarCommonDisplayManagerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910190ZnF(ActionBarCommonDisplayManagerAssem actionBarCommonDisplayManagerAssem, InterfaceC1364105Vn<? super C910190ZnF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = actionBarCommonDisplayManagerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910190ZnF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionBarCommonDisplayManagerAssem@8560.subscribeToReplyState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ActionBarCommonDisplayManagerAssem actionBarCommonDisplayManagerAssem = this.LLILLJJLI;
            C0I20 c0i20Bo = actionBarCommonDisplayManagerAssem.LLILZLL;
            if (c0i20Bo == null) {
                synchronized (actionBarCommonDisplayManagerAssem) {
                    c0i20Bo = actionBarCommonDisplayManagerAssem.LLILZLL;
                    if (c0i20Bo == null) {
                        c0i20Bo = actionBarCommonDisplayManagerAssem.bo();
                        actionBarCommonDisplayManagerAssem.LLILZLL = c0i20Bo;
                    }
                }
            }
            AnonymousClass0951 anonymousClass0951Sc0 = c0i20Bo.Sc0();
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 82);
            this.LL = 1;
            if (anonymousClass0951Sc0.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ActionBarCommonDisplayManagerAssem@8560.subscribeToReplyState$1");
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
