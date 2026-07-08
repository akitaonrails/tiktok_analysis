package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.ui.SearchMinisCardAssem$setMinisCard$2", f = "SearchMinisCardAssem.kt", l = {}, m = "invokeSuspend")
public final class C2196721AyE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2196721AyE(List<String> list, InterfaceC1364105Vn<? super C2196721AyE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2196721AyE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMinisCardAssem@36bc.setMinisCard$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C0BVF.LIZ()) {
            EnumC2196771AyJ enumC2196771AyJ = EnumC2196771AyJ.SEARCH;
            C2196741AyG c2196741AyG = new C2196741AyG(enumC2196771AyJ, this.LL);
            c2196741AyG.LIZJ();
            c2196741AyG.LJ();
            c2196741AyG.LIZJ();
            c2196741AyG.LJFF().LIZJ = true;
            c2196741AyG.LIZIZ();
            c2196741AyG.LJFF().LJII = true;
            c2196741AyG.LIZ(C1528860pt6.LIZ(enumC2196771AyJ));
            c2196741AyG.LJI();
        } else {
            IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
            if (iMinisApiService != null) {
                iMinisApiService.LJII(this.LL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMinisCardAssem@36bc.setMinisCard$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
