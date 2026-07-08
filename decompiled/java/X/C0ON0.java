package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0ON0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.DataGateKt$asyncFlow$1", f = "DataGate.kt", l = {187}, m = "invokeSuspend")
public final class C0ON0 extends C09AX implements Function2<C094D<? super AbstractC1623806Xk<Object>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AssemViewModel<Object> LLILLL;
    public final /* synthetic */ InterfaceC2217241BqE<Object, AbstractC1623806Xk<Object>> LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0ON0(AssemViewModel<Object> assemViewModel, InterfaceC2217241BqE<Object, ? extends AbstractC1623806Xk<Object>> interfaceC2217241BqE, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C0ON0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = assemViewModel;
        this.LLILZ = interfaceC2217241BqE;
        this.LLILZIL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ON0 c0on0 = new C0ON0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0on0.LLILLJJLI = obj;
        return c0on0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataGateKt@399a.asyncFlow$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(AssemViewModel.asyncSubscribe$default(this.LLILLL, this.LLILZ, this.LLILZIL, null, new AwS588S0100000_9(c094d, (C094D<? super AbstractC1623806Xk<Object>>) 176), new AwS553S0100000_9(c094d, (C094D<? super AbstractC1623806Xk<Object>>) 512), new AwS588S0100000_9(c094d, (C094D<? super AbstractC1623806Xk<Object>>) 177), 4, null), 511);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS553S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("DataGateKt@399a.asyncFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DataGateKt@399a.asyncFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super AbstractC1623806Xk<Object>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
