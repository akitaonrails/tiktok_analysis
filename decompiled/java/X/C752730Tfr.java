package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSContainerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment$observerRequestFromActivity$1$1", f = "PNSAgeGateContainerFragment.kt", l = {167}, m = "invokeSuspend")
public final class C752730Tfr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PNSAgeGateContainerFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752730Tfr(PNSAgeGateContainerFragment pNSAgeGateContainerFragment, InterfaceC1364105Vn<? super C752730Tfr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pNSAgeGateContainerFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752730Tfr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSAgeGateContainerFragment@b6e9.observerRequestFromActivity$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = ((PNSContainerViewModel) this.LLILLJJLI.LLILZLL.getValue()).LLILZ;
            AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLJJLI, 12);
            this.LL = 1;
            if (anonymousClass0950.collect(agS308S0100000_28, this) == objLJFF) {
                C1C7U.LIZIZ("PNSAgeGateContainerFragment@b6e9.observerRequestFromActivity$1$1");
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
