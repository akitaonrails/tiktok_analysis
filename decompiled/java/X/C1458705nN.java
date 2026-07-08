package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsScreenKt$FollowTrendingCreatorsScreen$2$1", f = "FollowCreatorsScreen.kt", l = {211}, m = "invokeSuspend")
public final class C1458705nN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ FollowCreatorsViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458705nN(C1690080u58 c1690080u58, FollowCreatorsViewModel followCreatorsViewModel, InterfaceC1364105Vn<? super C1458705nN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = followCreatorsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458705nN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowCreatorsScreenKt@b558.FollowTrendingCreatorsScreen$2$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 658)));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLL, 36);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("FollowCreatorsScreenKt@b558.FollowTrendingCreatorsScreen$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowCreatorsScreenKt@b558.FollowTrendingCreatorsScreen$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
