package X;

import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onLandingMallAndInsert$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1703970uRX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ MallLandingPerfTracker LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703970uRX(String str, Map<String, ? extends Object> map, MallLandingPerfTracker mallLandingPerfTracker, String str2, InterfaceC1364105Vn<? super C1703970uRX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = mallLandingPerfTracker;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703970uRX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MallLandingPerfTracker@76af.onLandingMallAndInsert$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!((List) C1704070uRh.LIZLLL.getValue()).contains(this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingMallAndInsert$1");
            return unit;
        }
        if (Intrinsics.LJFF(this.LL, "tiktokec_card_show") && Intrinsics.LJFF(this.LLILLJJLI.get("item_order"), C2286608xc.LJ(1)) && Intrinsics.LJFF(this.LLILLJJLI.get("is_use_cache"), CardStruct.IStatusCode.DEFAULT)) {
            MallLandingPerfTracker mallLandingPerfTracker = this.LLILLL;
            String str = this.LLILZ;
            mallLandingPerfTracker.getClass();
            if (!MallLandingPerfTracker.LJII(str, false, true)) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingMallAndInsert$1");
                return unit2;
            }
            EnumC1704040uRe enumC1704040uRe = EnumC1704040uRe.LANDING_MEANINGFUL_RENDERED;
            if (!this.LLILLL.LJIIIIZZ(enumC1704040uRe)) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingMallAndInsert$1");
                return unit3;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1704020uRc c1704020uRc = C1704020uRc.LIZ;
            C1704020uRc.LJIIIZ = jCurrentTimeMillis;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("total_duration", C2286608xc.LJFF(jCurrentTimeMillis - C1704020uRc.LIZJ));
            MallLandingPerfTracker mallLandingPerfTracker2 = this.LLILLL;
            String str2 = C1704020uRc.LJIILIIL;
            if (str2 == null) {
                str2 = "";
            }
            mallLandingPerfTracker2.LJIIIZ(enumC1704040uRe, str2, linkedHashMap);
            c1704020uRc.LIZ();
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingMallAndInsert$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
