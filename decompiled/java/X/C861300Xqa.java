package X;

import Y.AgS168S0300000_14;
import android.view.ViewGroup;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.userlevel.EffectUserLevelNoticeController$init$1", f = "EffectUserLevelNoticeController.kt", l = {41}, m = "invokeSuspend")
public final class C861300Xqa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectProfileListViewModel LLILLJJLI;
    public final /* synthetic */ Lifecycle LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ C861340Xqe LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861300Xqa(EffectProfileListViewModel effectProfileListViewModel, Lifecycle lifecycle, ViewGroup viewGroup, C861340Xqe c861340Xqe, InterfaceC1364105Vn<? super C861300Xqa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectProfileListViewModel;
        this.LLILLL = lifecycle;
        this.LLILZ = viewGroup;
        this.LLILZIL = c861340Xqe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861300Xqa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectUserLevelNoticeController@37f.init$1");
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
            InterfaceC346201Wa interfaceC346201WaFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.LLILLJJLI.LLJIJIL, this.LLILLL, Lifecycle.State.RESUMED);
            AgS168S0300000_14 agS168S0300000_14 = new AgS168S0300000_14(this.LLILLJJLI, this.LLILZ, this.LLILZIL, 1);
            this.LL = 1;
            if (interfaceC346201WaFlowWithLifecycle.collect(agS168S0300000_14, this) == objLJFF) {
                C1C7U.LIZIZ("EffectUserLevelNoticeController@37f.init$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectUserLevelNoticeController@37f.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
