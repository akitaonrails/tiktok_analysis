package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel$pullRefresh$1", f = "NearbyContainerViewModel.kt", l = {128}, m = "invokeSuspend")
public final class C1204190hRR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NearbyContainerViewModel LLILLJJLI;
    public final /* synthetic */ C1203960hR4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204190hRR(NearbyContainerViewModel nearbyContainerViewModel, C1203960hR4 c1203960hR4, InterfaceC1364105Vn<? super C1204190hRR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nearbyContainerViewModel;
        this.LLILLL = c1203960hR4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204190hRR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContainerViewModel@5125.pullRefresh$1");
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
            NearbyContainerViewModel nearbyContainerViewModel = this.LLILLJJLI;
            EnumC1204260hRY enumC1204260hRY = EnumC1204260hRY.PULL_DOWN_LOAD;
            C1204080hRG c1204080hRGLIZ = nearbyContainerViewModel.getState().LL.LIZ();
            C1203960hR4 c1203960hR4 = this.LLILLL;
            C1204200hRS c1204200hRS = new C1204200hRS(this.LLILLJJLI, c1203960hR4, null);
            this.LL = 1;
            if (nearbyContainerViewModel.GQ2(enumC1204260hRY, c1204080hRGLIZ, c1203960hR4, c1204200hRS, this) == objLJFF) {
                C1C7U.LIZIZ("NearbyContainerViewModel@5125.pullRefresh$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.pullRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
