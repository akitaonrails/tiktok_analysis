package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.EcomLynxImagePreloader$updateBitmapCacheForBiz$1", f = "EcomLynxImagePreloader.kt", l = {}, m = "invokeSuspend")
public final class C1742340vRQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742340vRQ(String str, String str2, String str3, InterfaceC1364105Vn<? super C1742340vRQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742340vRQ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C1763450vzT> listLIZ;
        C1C7U.LIZ("EcomLynxImagePreloader@510d.updateBitmapCacheForBiz$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1742310vRN abstractC1742310vRN = (AbstractC1742310vRN) ((LinkedHashMap) C1191504lN.LIZJ).get(this.LL);
        if (abstractC1742310vRN != null && (listLIZ = abstractC1742310vRN.LIZ()) != null) {
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LL;
            for (C1763450vzT c1763450vzT : listLIZ) {
                C1191504lN.LIZ.getClass();
                String str4 = str;
                C1322390kW5.LJIJJ((C1322390kW5) C1191504lN.LIZIZ.getValue(), str4, str2, str3, c1763450vzT.LIZ, c1763450vzT.LIZIZ, c1763450vzT.LIZJ, c1763450vzT.LIZLLL, c1763450vzT.LJ, false, c1763450vzT.LJFF, c1763450vzT.LJI, c1763450vzT.LJII, c1763450vzT.LJIIIIZZ, c1763450vzT.LJIILIIL, c1763450vzT.LJIIL, null, null, false, null, null, null, 2064384);
                str = str4;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomLynxImagePreloader@510d.updateBitmapCacheForBiz$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
