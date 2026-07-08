package X;

import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.entrance.ChangeRegionEntrance$update$1", f = "ChangeRegionEntrance.kt", l = {}, m = "invokeSuspend")
public final class C1703330uQV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1703340uQW<C1238730iL9> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Country LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703330uQV(AbstractC1703340uQW<C1238730iL9> abstractC1703340uQW, boolean z, Country country, InterfaceC1364105Vn<? super C1703330uQV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1703340uQW;
        this.LLILLJJLI = z;
        this.LLILLL = country;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703330uQV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeRegionEntrance@aea.update$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1703420uQe c1703420uQeLIZ = this.LL.LIZ();
        if (this.LLILLJJLI) {
            c1703420uQeLIZ.LIZJ = this.LLILLL;
        } else {
            c1703420uQeLIZ.LIZIZ = this.LLILLL;
        }
        this.LL.LIZ.setValue(c1703420uQeLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeRegionEntrance@aea.update$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
