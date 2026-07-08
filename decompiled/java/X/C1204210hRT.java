package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel$innerFullLoad$1$1", f = "NearbyContainerViewModel.kt", l = {280}, m = "invokeSuspend")
public final class C1204210hRT extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NearbyContainerViewModel LLILLJJLI;
    public final /* synthetic */ C1203960hR4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204210hRT(NearbyContainerViewModel nearbyContainerViewModel, C1203960hR4 c1203960hR4, InterfaceC1364105Vn<? super C1204210hRT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = nearbyContainerViewModel;
        this.LLILLL = c1203960hR4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204210hRT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContainerViewModel@5125.innerFullLoad$1$1");
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
            this.LLILLJJLI.setState(AFwS256S0000000_18.get$arr$(960));
            NearbyContainerViewModel nearbyContainerViewModel = this.LLILLJJLI;
            C1203960hR4 c1203960hR4 = this.LLILLL;
            this.LL = 1;
            obj = nearbyContainerViewModel.yQ2(0L, c1203960hR4, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NearbyContainerViewModel@5125.innerFullLoad$1$1");
                return objLJFF;
            }
        }
        NearbyContainerViewModel nearbyContainerViewModel2 = this.LLILLJJLI;
        nearbyContainerViewModel2.setState(new AwS227S0300000_18(nearbyContainerViewModel2, (NearbyContainerViewModel) obj, (Pair<? extends EnumC1204140hRM, C1204080hRG>) this.LLILLL, (C1203960hR4) 60));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.innerFullLoad$1$1");
        return unit;
    }
}
