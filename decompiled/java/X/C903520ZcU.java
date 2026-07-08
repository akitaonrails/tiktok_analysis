package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem$onViewCreated$3", f = "IMMessagePowerListAssem.kt", l = {357}, m = "invokeSuspend")
public final class C903520ZcU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMMessagePowerListAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C903520ZcU(IMMessagePowerListAssem iMMessagePowerListAssem, InterfaceC1364105Vn<? super C903520ZcU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMMessagePowerListAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C903520ZcU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> function2;
        C1C7U.LIZ("IMMessagePowerListAssem@bf3d.onViewCreated$3");
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
            C05YD<Boolean> c05ydW42 = this.LLILLJJLI.Lo().LIZ().W42();
            C13066059k c13066059k = new C13066059k(null);
            this.LL = 1;
            if (C09IC.LJIJ(c05ydW42, this, c13066059k) == objLJFF) {
                C1C7U.LIZIZ("IMMessagePowerListAssem@bf3d.onViewCreated$3");
                return objLJFF;
            }
        }
        C903590Zcb c903590Zcb = (C903590Zcb) this.LLILLJJLI.LLJJL.getValue();
        if (c903590Zcb != null && (function2 = c903590Zcb.LIZJ) != null) {
            IMMessagePowerListAssem iMMessagePowerListAssem = this.LLILLJJLI;
            function2.invoke(iMMessagePowerListAssem, iMMessagePowerListAssem.Jo());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMessagePowerListAssem@bf3d.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
