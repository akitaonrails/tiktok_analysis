package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS115S0400000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel$pullRefresh$1$1", f = "NearbyContainerViewModel.kt", l = {132}, m = "invokeSuspend")
public final class C1204200hRS extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NearbyContainerViewModel LLILLJJLI;
    public final /* synthetic */ C1203960hR4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204200hRS(NearbyContainerViewModel nearbyContainerViewModel, C1203960hR4 c1203960hR4, InterfaceC1364105Vn<? super C1204200hRS> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = nearbyContainerViewModel;
        this.LLILLL = c1203960hR4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204200hRS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1204080hRG c1204080hRGLIZ;
        Object objYQ2 = obj;
        C1C7U.LIZ("NearbyContainerViewModel@5125.pullRefresh$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objYQ2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objYQ2);
            this.LLILLJJLI.setState(AFwS256S0000000_18.get$arr$(797));
            NearbyContainerViewModel nearbyContainerViewModel = this.LLILLJJLI;
            C1203960hR4 c1203960hR4 = this.LLILLL;
            this.LL = 1;
            objYQ2 = nearbyContainerViewModel.yQ2(0L, c1203960hR4, this);
            if (objYQ2 == objLJFF) {
                C1C7U.LIZIZ("NearbyContainerViewModel@5125.pullRefresh$1$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objYQ2;
        NearbyContainerViewModel nearbyContainerViewModel2 = this.LLILLJJLI;
        Object first = pair.getFirst();
        nearbyContainerViewModel2.getClass();
        if (first != null && first == EnumC1204140hRM.LOC_UNAVAILABLE) {
            c1204080hRGLIZ = null;
        } else {
            c1204080hRGLIZ = this.LLILLJJLI.getState().LL.LIZ();
        }
        NearbyContainerViewModel nearbyContainerViewModel3 = this.LLILLJJLI;
        nearbyContainerViewModel3.setState(new AwS115S0400000_18(nearbyContainerViewModel3, (NearbyContainerViewModel) pair, (Pair<? extends EnumC1204140hRM, C1204080hRG>) c1204080hRGLIZ, (C1204080hRG) this.LLILLL, (C1203960hR4) 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.pullRefresh$1$1");
        return unit;
    }
}
