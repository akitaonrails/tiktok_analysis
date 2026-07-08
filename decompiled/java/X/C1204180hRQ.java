package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel$innerFullLoad$1", f = "NearbyContainerViewModel.kt", l = {274}, m = "invokeSuspend")
public final class C1204180hRQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NearbyContainerViewModel LLILLJJLI;
    public final /* synthetic */ C1203960hR4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204180hRQ(NearbyContainerViewModel nearbyContainerViewModel, C1203960hR4 c1203960hR4, InterfaceC1364105Vn<? super C1204180hRQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nearbyContainerViewModel;
        this.LLILLL = c1203960hR4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204180hRQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContainerViewModel@5125.innerFullLoad$1");
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
            EnumC1204260hRY enumC1204260hRY = EnumC1204260hRY.FULL_LOAD;
            C1203960hR4 c1203960hR4 = this.LLILLL;
            C1204210hRT c1204210hRT = new C1204210hRT(nearbyContainerViewModel, c1203960hR4, null);
            this.LL = 1;
            if (nearbyContainerViewModel.GQ2(enumC1204260hRY, null, c1203960hR4, c1204210hRT, this) == objLJFF) {
                C1C7U.LIZIZ("NearbyContainerViewModel@5125.innerFullLoad$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.innerFullLoad$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
