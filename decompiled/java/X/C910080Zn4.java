package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarUIAssem$subscribeToActionBarVMState$3", f = "ActionBarUIAssem.kt", l = {193}, m = "invokeSuspend")
public final class C910080Zn4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ActionBarUIAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910080Zn4(ActionBarUIAssem actionBarUIAssem, InterfaceC1364105Vn<? super C910080Zn4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = actionBarUIAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910080Zn4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionBarUIAssem@82b0.subscribeToActionBarVMState$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDrYQ2 = this.LLILLJJLI.hp().yQ2();
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 32);
            this.LL = 1;
            c2252331DDrYQ2.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrYQ2, agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ActionBarUIAssem@82b0.subscribeToActionBarVMState$3");
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
