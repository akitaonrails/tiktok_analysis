package X;

import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel$updateFollowButtonStateFromUserAction$1", f = "FollowCreatorsViewModel.kt", l = {195}, m = "invokeSuspend")
public final class C1673880tf0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowCreatorsViewModel LLILLJJLI;
    public final /* synthetic */ C1673800tes LLILLL;
    public final /* synthetic */ EnumC1673820teu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673880tf0(FollowCreatorsViewModel followCreatorsViewModel, C1673800tes c1673800tes, EnumC1673820teu enumC1673820teu, InterfaceC1364105Vn<? super C1673880tf0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followCreatorsViewModel;
        this.LLILLL = c1673800tes;
        this.LLILZ = enumC1673820teu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673880tf0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowCreatorsViewModel@bf59.updateFollowButtonStateFromUserAction$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            C1673900tf2 c1673900tf2 = new C1673900tf2(this.LLILLL.LIZ, this.LLILZ.getStatusInt());
            this.LL = 1;
            if (c2252331DDr.emit(c1673900tf2, this) == objLJFF) {
                C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.updateFollowButtonStateFromUserAction$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.updateFollowButtonStateFromUserAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
