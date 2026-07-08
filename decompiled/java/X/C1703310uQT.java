package X;

import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.entrance.ChangeRegionEntrance$onFetchResult$2", f = "ChangeRegionEntrance.kt", l = {}, m = "invokeSuspend")
public final class C1703310uQT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1238730iL9 LL;
    public final /* synthetic */ AbstractC1703340uQW<C1238730iL9> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703310uQT(C1238730iL9 c1238730iL9, AbstractC1703340uQW<C1238730iL9> abstractC1703340uQW, InterfaceC1364105Vn<? super C1703310uQT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1238730iL9;
        this.LLILLJJLI = abstractC1703340uQW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703310uQT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Country country;
        C1C7U.LIZ("ChangeRegionEntrance@aea.onFetchResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1238730iL9 c1238730iL9 = this.LL;
        C1238730iL9 c1238730iL92 = (C1238730iL9) this.LLILLJJLI.LIZ.getValue();
        if (c1238730iL92 != null) {
            country = c1238730iL92.LIZJ;
        } else {
            country = null;
        }
        c1238730iL9.LIZJ = country;
        this.LLILLJJLI.LIZ.setValue((T) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeRegionEntrance@aea.onFetchResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
