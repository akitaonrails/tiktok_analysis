package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.web.realtimeres.model.AdLandPagePrefetchModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05sH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule$prefetchInGecko$1", f = "CommerceLandPageRealtimeResourceModule.kt", l = {}, m = "invokeSuspend")
public final class C1489105sH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ CommerceLandPageRealtimeResourceModule LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AwemeRawAd LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489105sH(String str, CommerceLandPageRealtimeResourceModule commerceLandPageRealtimeResourceModule, String str2, String str3, String str4, AwemeRawAd awemeRawAd, InterfaceC1364105Vn<? super C1489105sH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = commerceLandPageRealtimeResourceModule;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = awemeRawAd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1489105sH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        String strJ3;
        C1C7U.LIZ("CommerceLandPageRealtimeResourceModule@7cec.prefetchInGecko$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strP0 = this.LL;
        if (strP0 == null) {
            strP0 = this.LLILLJJLI.p0(this.LLILLL, this.LLILZ);
        }
        JSONObject jSONObjectP0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).P0(strP0);
        if (jSONObjectP0 != null && jSONObjectP0.length() != 0) {
            linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectP0.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectP0.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                } else {
                    strJ3 = null;
                }
                if (next != null && strJ3 != null) {
                    try {
                        Object objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strJ3, (Class<Object>) AdLandPagePrefetchModel.PrefetchModel.class);
                        if (objFromJson != null) {
                            linkedHashMap.put(next, objFromJson);
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }
            }
        } else {
            linkedHashMap = null;
        }
        C118300cf c118300cf = new C118300cf();
        Map<String, String> mapLIZ = WebAdUserAgentServiceImpl.LIZIZ().LIZ(null, this.LLILZIL, this.LLILZLL.isEnableWebGoogleLogin());
        if (linkedHashMap != null) {
            CommerceLandPageRealtimeResourceModule commerceLandPageRealtimeResourceModule = this.LLILLJJLI;
            AwemeRawAd awemeRawAd = this.LLILZLL;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                AdLandPagePrefetchModel.PrefetchModel prefetchModel = (AdLandPagePrefetchModel.PrefetchModel) entry.getValue();
                if (c118300cf.element < 30) {
                    String str = prefetchModel.url;
                    Long adId = awemeRawAd.getAdId();
                    Map linkedHashMap3 = prefetchModel.reqHeader;
                    if (!C19719512Dh.LJII(linkedHashMap3) || linkedHashMap3 == null) {
                        linkedHashMap3 = new LinkedHashMap();
                    }
                    commerceLandPageRealtimeResourceModule.bU1(adId, str, linkedHashMap3, mapLIZ, false, false, null, null);
                }
                int i = c118300cf.element;
                c118300cf.element = i + 1;
                linkedHashMap2.put(key, C2286608xc.LJ(i));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceLandPageRealtimeResourceModule@7cec.prefetchInGecko$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
