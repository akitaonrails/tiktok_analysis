package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0wCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771330wCB {
    public static final /* synthetic */ C1771330wCB LIZ = new C1771330wCB();
    public static final ShopMallApiWithPreload LIZIZ = (ShopMallApiWithPreload) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build().retrofit.LIZ(ShopMallApiWithPreload.class);

    public static n LIZIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        n nVar = new n();
        nVar.LJJIII(Integer.valueOf(C12ES.LJIILJJIL(C12ES.LJIIJ(contextLIZ), contextLIZ)), "screen_width_pt");
        nVar.LJJIII(Integer.valueOf(C12ES.LJIILJJIL(C12ES.LJIIIIZZ(contextLIZ), contextLIZ)), "screen_height_pt");
        nVar.LJJIII(Float.valueOf(contextLIZ.getResources().getDisplayMetrics().density), "screen_scale");
        IEcMallPadService iEcMallPadService = (IEcMallPadService) PluggableExtentionKt.pluggableSpi$default(IEcMallPadService.class, false, false, false, 14, null);
        if (iEcMallPadService != null && iEcMallPadService.LIZJ()) {
            nVar.LJJIIJ("is_pad", String.valueOf(C1771910wD7.LIZJ()));
            nVar.LJJIIJ("screen_orientation", String.valueOf(((InterfaceC827860Wdk) C1771910wD7.LIZ.getValue()).LIZ()));
        }
        return nVar;
    }

    public static Map LJ() {
        Map<String, Object> map;
        Object obj;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (c1767790w6T != null && (map = c1767790w6T.LJIILIIL) != null && (obj = map.get("homepage_data_preload_key")) != null && (string = obj.toString()) != null && string.length() > 0) {
            linkedHashMap.put("preload_key", string);
        }
        return linkedHashMap;
    }

    public static String LJFF() {
        IKVStore iKVStoreCreateInMemoryKVStore;
        Object valueForKey;
        String string;
        FeatureCoreFactory featureCoreFactory = FeatureCoreFactory.INSTANCE;
        C844470XAv.LIZ.getClass();
        IFeatureCore featureCore = featureCoreFactory.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
        return (featureCore == null || (iKVStoreCreateInMemoryKVStore = featureCore.createInMemoryKVStore("ec_real_time_feature_fetch")) == null || (valueForKey = iKVStoreCreateInMemoryKVStore.getValueForKey("cache_key_features_dict")) == null || (string = valueForKey.toString()) == null) ? "" : string;
    }

    public static List LJI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        return arrayList;
    }

    public static Map LIZ(Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Double) {
                    Number number = (Number) value;
                    if (number.doubleValue() % 1.0d == 0.0d) {
                        value = Integer.valueOf((int) number.doubleValue());
                    }
                }
                linkedHashMap.put(key, value);
            }
            return linkedHashMap;
        }
        return null;
    }

    public static Map LIZJ(Bundle bundle) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle != null && (string = bundle.getString("preload_key")) != null && string.length() > 0) {
            linkedHashMap.put("preload_key", string);
        }
        return linkedHashMap;
    }

    public static void LJII(long j, String str, Map map) {
        map.put(String.valueOf(u.LJJI(u.LJJI(str, '.', '_', false), ':', '_', false)), Long.valueOf(j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0341, code lost:
    
        if (r1.equals("cold_start") != false) goto L141;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0357  */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0wCB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.gson.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.n LIZLLL(java.lang.String r12, java.lang.String r13, java.lang.String r14, X.C1771590wCb r15, X.InterfaceC599750Nfh r16) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771330wCB.LIZLLL(java.lang.String, java.lang.String, java.lang.String, X.0wCb, X.0Nfh):com.google.gson.n");
    }
}
