package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.entrance.ChangeRegionEntrance$update$2", f = "ChangeRegionEntrance.kt", l = {}, m = "invokeSuspend")
public final class C1703320uQU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1703340uQW<C1238730iL9> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703320uQU(AbstractC1703340uQW<C1238730iL9> abstractC1703340uQW, boolean z, InterfaceC1364105Vn<? super C1703320uQU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1703340uQW;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703320uQU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeRegionEntrance@aea.update$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1703420uQe c1703420uQeLIZ = this.LL.LIZ();
        c1703420uQeLIZ.LIZ = this.LLILLJJLI;
        this.LL.LIZ.setValue(c1703420uQeLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeRegionEntrance@aea.update$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
