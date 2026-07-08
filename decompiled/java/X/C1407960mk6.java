package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.celebration.CreationPreloadAssetManager$fetchAllIfNeeded$1", f = "CreationPreloadAssetManager.kt", l = {}, m = "invokeSuspend")
public final class C1407960mk6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1420320n42 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407960mk6(EnumC1420320n42 enumC1420320n42, InterfaceC1364105Vn<? super C1407960mk6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1420320n42;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407960mk6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationPreloadAssetManager@86de.fetchAllIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1420280n3y c1420280n3y = C1420280n3y.LIZ;
        EnumC1420320n42 enumC1420320n42 = this.LL;
        c1420280n3y.getClass();
        C1420280n3y.LIZIZ(enumC1420320n42);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationPreloadAssetManager@86de.fetchAllIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
