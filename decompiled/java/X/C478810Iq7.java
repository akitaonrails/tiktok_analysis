package X;

import com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveInteractModuleAssem;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveInteractModuleAssem$initTopModuleAssemWithCache$1", f = "MultiTopLiveInteractModuleAssem.kt", l = {522}, m = "invokeSuspend")
public final class C478810Iq7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiTopLiveInteractModuleAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478810Iq7(MultiTopLiveInteractModuleAssem multiTopLiveInteractModuleAssem, InterfaceC1364105Vn<? super C478810Iq7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiTopLiveInteractModuleAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478810Iq7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveInteractModuleAssem@861d.initTopModuleAssemWithCache$1");
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
            MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVMOp = this.LLILLJJLI.op();
            EnumC479370Ir1 enumC479370Ir1 = EnumC479370Ir1.INIT;
            this.LL = 1;
            if (MultiTopLiveInteractModuleVM.yQ2(multiTopLiveInteractModuleVMOp, enumC479370Ir1, "top_module_ui_landing", this) == objLJFF) {
                C1C7U.LIZIZ("MultiTopLiveInteractModuleAssem@861d.initTopModuleAssemWithCache$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveInteractModuleAssem@861d.initTopModuleAssemWithCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
