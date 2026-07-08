package X;

import Y.AgS305S0100000_25;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel$observeTrendingCreatorListFromUG$1", f = "FollowCreatorsViewModel.kt", l = {168}, m = "invokeSuspend")
public final class C1673960tf8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowCreatorsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673960tf8(FollowCreatorsViewModel followCreatorsViewModel, InterfaceC1364105Vn<? super C1673960tf8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followCreatorsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673960tf8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowCreatorsViewModel@bf59.observeTrendingCreatorListFromUG$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1673980tfA.LIZ.getClass();
            AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(C1673980tfA.LIZIZ);
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 7);
            this.LL = 1;
            if (anonymousClass0951LIZIZ.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.observeTrendingCreatorListFromUG$1");
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
