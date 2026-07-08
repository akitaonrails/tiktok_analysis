package X;

import com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectSearchTrendingItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectSearchTrendingComponent$initTrendingList$1$1", f = "EditEffectSearchTrendingComponent.kt", l = {}, m = "invokeSuspend")
public final class C1412310mr7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1426100nDM LL;
    public final /* synthetic */ List<EditEffectSearchTrendingItem> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412310mr7(C1426100nDM c1426100nDM, List<EditEffectSearchTrendingItem> list, InterfaceC1364105Vn<? super C1412310mr7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1426100nDM;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412310mr7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Z4(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
