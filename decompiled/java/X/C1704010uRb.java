package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfEventConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingSceneConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onLandingFinished$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1704010uRb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallLandingPerfTracker LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704010uRb(MallLandingPerfTracker mallLandingPerfTracker, String str, String str2, String str3, int i, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1704010uRb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mallLandingPerfTracker;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704010uRb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1704040uRe enumC1704040uRe;
        MallLandingPerfEventConfig next;
        List<MallLandingSceneConfig> list;
        MallLandingSceneConfig next2;
        String str;
        Object obj2;
        String string;
        Object obj3;
        String string2;
        C1C7U.LIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        String str2 = this.LLILLJJLI;
        mallLandingPerfTracker.getClass();
        if (!MallLandingPerfTracker.LJII(str2, false, true)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
            return unit;
        }
        if (Intrinsics.LJFF(this.LLILLL, "rd_tiktokec_page_update")) {
            enumC1704040uRe = EnumC1704040uRe.LANDING_PAGE_UPDATED;
        } else {
            enumC1704040uRe = EnumC1704040uRe.LANDING_MEANINGFUL_RENDERED;
        }
        if (!this.LL.LJIIIIZZ(enumC1704040uRe)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
            return unit2;
        }
        if (!((List) C1704070uRh.LJ.getValue()).contains(this.LLILZ)) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
            return unit3;
        }
        if (!((List) C1704070uRh.LIZLLL.getValue()).contains(this.LLILLL)) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
            return unit4;
        }
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        List<MallLandingPerfEventConfig> list2 = C1704070uRh.LIZ().allowList;
        if (list2 != null) {
            Iterator<MallLandingPerfEventConfig> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.eventName, str3)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MallLandingPerfEventConfig mallLandingPerfEventConfig = next;
            if (mallLandingPerfEventConfig != null && (list = mallLandingPerfEventConfig.scenes) != null) {
                Iterator<MallLandingSceneConfig> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.pageName, str4)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                MallLandingSceneConfig mallLandingSceneConfig = next2;
                if (mallLandingSceneConfig != null) {
                    Map<String, String> mapLJ = mallLandingPerfEventConfig.rules;
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    Map<String, String> mapLJ2 = mallLandingSceneConfig.rules;
                    if (mapLJ2 == null) {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    MallLandingSceneConfig mallLandingSceneConfig2 = new MallLandingSceneConfig(mallLandingSceneConfig.pageName, C2097608Jq.LJIIL(mapLJ, mapLJ2), mallLandingSceneConfig.interceptType);
                    int i = this.LLILZIL;
                    Integer num = mallLandingSceneConfig2.interceptType;
                    if (num != null && i == num.intValue()) {
                        MallLandingPerfTracker mallLandingPerfTracker2 = this.LL;
                        Map<String, Object> map = this.LLILZLL;
                        Map<String, String> mapLJ3 = mallLandingSceneConfig2.rules;
                        if (mapLJ3 == null) {
                            mapLJ3 = C2097608Jq.LJ();
                        }
                        mallLandingPerfTracker2.getClass();
                        String str5 = C1704020uRc.LJIILIIL;
                        String str6 = mapLJ3.get("landing_start_time");
                        if (str6 != null && (str = mapLJ3.get("landing_duration")) != null && (obj2 = map.get(str6)) != null && (string = obj2.toString()) != null && (obj3 = map.get(str)) != null && (string2 = obj3.toString()) != null) {
                            try {
                                long j = (long) (CastLongProtector.parseLong(string) + CastDoubleProtector.parseDouble(string2));
                                C1704020uRc.LJIIIZ = j;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(map);
                                linkedHashMap.put("total_duration", Long.valueOf(j - C1704020uRc.LIZJ));
                                linkedHashMap.put("landing_duration", string2);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                mallLandingPerfTracker2.LJIIIZ(enumC1704040uRe, str5, linkedHashMap);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            C1704020uRc.LIZ.LIZ();
                        }
                        Unit unit5 = Unit.LIZ;
                        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
                        return unit5;
                    }
                    Unit unit6 = Unit.LIZ;
                    C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
                    return unit6;
                }
            }
        }
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onLandingFinished$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
