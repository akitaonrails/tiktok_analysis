package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.mob.IMLandingMsgPreloadCacheAnalytics$reportPreloadLandingMsg$1", f = "IMLandingMsgPerfAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1744306sL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1001040c9m LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744306sL(EnumC1001040c9m enumC1001040c9m, Integer num, InterfaceC1364105Vn<? super C1744306sL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1001040c9m;
        this.LLILLJJLI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744306sL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("IMLandingMsgPreloadCacheAnalytics@7454.reportPreloadLandingMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC1001040c9m enumC1001040c9m = this.LL;
        Integer num = this.LLILLJJLI;
        if (enumC1001040c9m != null) {
            linkedHashMap.put("preload_type", enumC1001040c9m.getKey());
        }
        if (num != null && (numLJ = C2286608xc.LJ(num.intValue())) != null) {
            if (numLJ.intValue() == 2) {
                linkedHashMap.put("traffic_type", "ads_traffic");
            } else {
                numLJ.intValue();
            }
        }
        C0I0B.LJFF.LIZIZ().sendEvent("im_preload_landing_message", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMLandingMsgPreloadCacheAnalytics@7454.reportPreloadLandingMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
