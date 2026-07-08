package X;

import Y.AgS300S0100000_19;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment$observeViewModel$2", f = "FanGroupChooseGroupFragment.kt", l = {377}, m = "invokeSuspend")
public final class C1218950hpF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FanGroupChooseGroupViewModel LLILLJJLI;
    public final /* synthetic */ FanGroupChooseGroupFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218950hpF(FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel, FanGroupChooseGroupFragment fanGroupChooseGroupFragment, InterfaceC1364105Vn<? super C1218950hpF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fanGroupChooseGroupViewModel;
        this.LLILLL = fanGroupChooseGroupFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1218950hpF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanGroupChooseGroupFragment@28bb.observeViewModel$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.LLILZ;
            AgS300S0100000_19 agS300S0100000_19 = new AgS300S0100000_19(this.LLILLL, 5);
            this.LL = 1;
            if (anonymousClass0950.collect(agS300S0100000_19, this) == objLJFF) {
                C1C7U.LIZIZ("FanGroupChooseGroupFragment@28bb.observeViewModel$2");
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
