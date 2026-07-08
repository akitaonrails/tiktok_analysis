package X;

import androidx.lifecycle.FlowLiveDataConversions;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel$observeFollowStateUpdatesFromRelationService$1", f = "FollowCreatorsViewModel.kt", l = {461}, m = "invokeSuspend")
public final class C1673930tf5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowCreatorsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673930tf5(FollowCreatorsViewModel followCreatorsViewModel, InterfaceC1364105Vn<? super C1673930tf5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followCreatorsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673930tf5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowCreatorsViewModel@bf59.observeFollowStateUpdatesFromRelationService$1");
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
            InterfaceC346201Wa interfaceC346201WaAsFlow = FlowLiveDataConversions.asFlow(C1076010e6h.LIZJ.LIZIZ().getRelationObservable());
            C1673920tf4 c1673920tf4 = new C1673920tf4(this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(interfaceC346201WaAsFlow, this, c1673920tf4) == objLJFF) {
                C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.observeFollowStateUpdatesFromRelationService$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.observeFollowStateUpdatesFromRelationService$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
