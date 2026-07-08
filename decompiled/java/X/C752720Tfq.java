package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment$observerRequestFromActivity$1", f = "PNSAgeGateContainerFragment.kt", l = {166}, m = "invokeSuspend")
public final class C752720Tfq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PNSAgeGateContainerFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752720Tfq(PNSAgeGateContainerFragment pNSAgeGateContainerFragment, InterfaceC1364105Vn<? super C752720Tfq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pNSAgeGateContainerFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752720Tfq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSAgeGateContainerFragment@b6e9.observerRequestFromActivity$1");
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
            Lifecycle lifecycle = this.LLILLJJLI.getLifecycle();
            Lifecycle.State state = Lifecycle.State.CREATED;
            C752730Tfr c752730Tfr = new C752730Tfr(this.LLILLJJLI, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c752730Tfr, this) == objLJFF) {
                C1C7U.LIZIZ("PNSAgeGateContainerFragment@b6e9.observerRequestFromActivity$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSAgeGateContainerFragment@b6e9.observerRequestFromActivity$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
