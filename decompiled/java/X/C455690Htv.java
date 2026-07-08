package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Htv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.common.DMCommonBannerAnalytics$reportDMInboxCommonBannerClick$1", f = "DMCommonBannerAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C455690Htv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ InterfaceC1493105sv LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455690Htv(Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv, String str, String str2, InterfaceC1364105Vn<? super C455690Htv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = interfaceC1493105sv;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455690Htv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMCommonBannerAnalytics@3fce.reportDMInboxCommonBannerClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> map = this.LL;
        C455710Htx.LIZIZ.getClass();
        Map<? extends String, ? extends String> mapLJIIL = C2097608Jq.LJIIL(map, C455710Htx.LIZ());
        InterfaceC1493105sv interfaceC1493105sv = this.LLILLJJLI;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action_type", this.LLILLL), new Pair("show_count", this.LLILZ));
        mapLJIIJ.putAll(mapLJIIL);
        interfaceC1493105sv.sendEvent("dm_banner_click", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMCommonBannerAnalytics@3fce.reportDMInboxCommonBannerClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
