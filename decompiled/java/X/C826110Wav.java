package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.pumbaa.aspect.thirdpartynetwork.ThirdPartyNetworkSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Wav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826110Wav implements InterfaceC826190Wb3 {
    public static final ExecutorService LIZ = C786410Ut5.i4(new ThreadFactoryC2500609r2(1));
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("pumbaa_version_code", "pumbaa_app_version", "store_region", "is_guest_mode", "is_not_consent", "is_login", "priority_region");

    @Override // X.InterfaceC826190Wb3
    public final boolean LIZ(C826120Waw c826120Waw) {
        C826130Wax c826130WaxLIZ;
        Object objLIZ;
        Object objLIZ2;
        String str;
        Object objLIZ3;
        EnumC826150Waz enumC826150Waz;
        Object c098200Yq;
        EnumC826230Wb7 enumC826230Wb7LIZ;
        Object c098200Yq2;
        Set<String> setKeySet;
        List listLLIIII;
        Set<String> setKeySet2;
        List listLLIIII2;
        Set<String> setKeySet3;
        List listLLIIII3;
        Map<String, String> map;
        C0WR6 c0wr6;
        C0WR6 c0wr62;
        C0WR6 c0wr63;
        EnumC826230Wb7 enumC826230Wb7LIZ2 = C826160Wb0.LIZ(c826120Waw);
        if (enumC826230Wb7LIZ2 == null) {
            return true;
        }
        CopyOnWriteArrayList<InterfaceC826190Wb3> copyOnWriteArrayList = C826260WbA.LIZ;
        ThirdPartyNetworkSettings.ThirdPartyNetworkConfig thirdPartyNetworkConfig = C826260WbA.LIZLLL;
        if (thirdPartyNetworkConfig == null) {
            return false;
        }
        if (thirdPartyNetworkConfig.monitorSampleRate < 1.0d && AbstractC19994813Le.Default.nextDouble() >= thirdPartyNetworkConfig.monitorSampleRate) {
            return true;
        }
        Object obj = c826120Waw.LIZ;
        if (obj != null) {
            c826130WaxLIZ = C826140Way.LIZ(obj);
        } else {
            c826130WaxLIZ = null;
        }
        if (c826130WaxLIZ != null && (c0wr63 = (C0WR6) ((LinkedHashMap) c826130WaxLIZ.LIZ).get("hybrid_channel")) != null) {
            objLIZ = c0wr63.LIZ();
        } else {
            objLIZ = null;
        }
        if (!(objLIZ instanceof String)) {
            objLIZ = null;
        }
        if (c826130WaxLIZ != null && (c0wr62 = (C0WR6) ((LinkedHashMap) c826130WaxLIZ.LIZ).get("hybrid_origin_url")) != null) {
            objLIZ2 = c0wr62.LIZ();
        } else {
            objLIZ2 = null;
        }
        if (objLIZ2 instanceof String) {
            str = (String) objLIZ2;
        } else {
            str = null;
        }
        if (c826130WaxLIZ != null && (c0wr6 = (C0WR6) ((LinkedHashMap) c826130WaxLIZ.LIZ).get("sdk_dfid")) != null) {
            objLIZ3 = c0wr6.LIZ();
        } else {
            objLIZ3 = null;
        }
        if (!(objLIZ3 instanceof String)) {
            objLIZ3 = null;
        }
        if (objLIZ != null && str != null) {
            enumC826150Waz = EnumC826150Waz.HYBRID;
        } else if (objLIZ3 != null) {
            enumC826150Waz = EnumC826150Waz.SDK;
        } else {
            enumC826150Waz = EnumC826150Waz.NATIVE;
        }
        if (enumC826150Waz == EnumC826150Waz.HYBRID) {
            try {
                c098200Yq = new URI(str).getHost();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            if (str2 != null && (enumC826230Wb7LIZ = C826210Wb5.LIZ(str2)) != null && enumC826230Wb7LIZ == EnumC826230Wb7.EXTERNAL_THIRD_PARTY) {
                return false;
            }
        }
        C826130Wax c826130Wax = new C826130Wax();
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        c826130Wax.LIZ("report_category", enumC823400WRu, "network_third_party_event", EnumC826170Wb1.CATEGORY);
        c826130Wax.LIZ("trigger_biz", enumC823400WRu, "Network", EnumC826170Wb1.CATEGORY);
        c826130Wax.LIZ("trigger_id", enumC823400WRu, c826120Waw.LIZIZ, EnumC826170Wb1.CATEGORY);
        c826130Wax.LIZ("domain_type", enumC823400WRu, enumC826230Wb7LIZ2.getValue(), EnumC826170Wb1.CATEGORY);
        for (String str3 : LIZIZ) {
            C0WR6 c0wr6Query = C823230WRd.LIZIZ.query(str3);
            if (c0wr6Query != null) {
                EnumC826170Wb1 enumC826170Wb1 = EnumC826170Wb1.CATEGORY;
                c826130Wax.LIZ.put(str3, c0wr6Query);
                c826130Wax.LIZIZ.put(str3, enumC826170Wb1);
            }
        }
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.String;
        AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(thirdPartyNetworkConfig, 1);
        EnumC826170Wb1 enumC826170Wb12 = EnumC826170Wb1.CATEGORY;
        c826130Wax.LIZ.put("config_hash", new C0WR8(enumC823400WRu2, awS557S0100000_13));
        c826130Wax.LIZIZ.put("config_hash", enumC826170Wb12);
        c826130Wax.LIZ("event_source", enumC823400WRu2, enumC826150Waz.getValue(), EnumC826170Wb1.CATEGORY);
        if (enumC826150Waz == EnumC826150Waz.HYBRID) {
            if (objLIZ != null) {
                c826130Wax.LIZ("hybrid_channel", enumC823400WRu2, objLIZ, EnumC826170Wb1.EXTRA);
            }
            if (str != null) {
                c826130Wax.LIZ("hybrid_origin_url", enumC823400WRu2, str, EnumC826170Wb1.EXTRA);
            }
        }
        if (objLIZ3 != null || ((map = c826120Waw.LJI) != null && (objLIZ3 = map.get("x-tt-dataflow-id")) != null)) {
            c826130Wax.LIZ("dfid", enumC823400WRu2, objLIZ3, EnumC826170Wb1.CATEGORY);
        }
        EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.Double;
        c826130Wax.LIZ("report_sample", enumC823400WRu3, Double.valueOf(thirdPartyNetworkConfig.monitorSampleRate), EnumC826170Wb1.CATEGORY);
        c826130Wax.LIZ("runtime_sample", enumC823400WRu3, Double.valueOf(thirdPartyNetworkConfig.monitorSampleRate), EnumC826170Wb1.CATEGORY);
        String str4 = c826120Waw.LIZLLL;
        if (str4 != null) {
            c826130Wax.LIZ("domain_after_tnc", enumC823400WRu2, str4, EnumC826170Wb1.CATEGORY);
        }
        String str5 = c826120Waw.LJ;
        if (str5 != null) {
            c826130Wax.LIZ("scheme", enumC823400WRu2, str5, EnumC826170Wb1.CATEGORY);
        }
        String str6 = c826120Waw.LJFF;
        if (str6 != null) {
            c826130Wax.LIZ("method", enumC823400WRu2, str6, EnumC826170Wb1.CATEGORY);
        }
        String str7 = c826120Waw.LIZJ;
        if (str7 != null) {
            try {
                c098200Yq2 = new URI(str7).getPath();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            String str8 = (String) c098200Yq2;
            if (str8 != null && str8.length() > 0) {
                c826130Wax.LIZ("path", EnumC823400WRu.String, str8, EnumC826170Wb1.EXTRA);
            }
        }
        if (enumC826150Waz != EnumC826150Waz.SDK) {
            Map<String, String> map2 = c826120Waw.LJII;
            if (map2 != null && (setKeySet3 = map2.keySet()) != null && (listLLIIII3 = C13LP.LLIIII(setKeySet3)) != null && (!listLLIIII3.isEmpty())) {
                c826130Wax.LIZ("query_fields", EnumC823400WRu.String, C788050Uvj.LIZ(listLLIIII3), EnumC826170Wb1.EXTRA);
            }
            Map<String, String> map3 = c826120Waw.LJI;
            if (map3 != null && (setKeySet2 = map3.keySet()) != null && (listLLIIII2 = C13LP.LLIIII(setKeySet2)) != null && (!listLLIIII2.isEmpty())) {
                c826130Wax.LIZ("header_fields", EnumC823400WRu.String, C788050Uvj.LIZ(listLLIIII2), EnumC826170Wb1.EXTRA);
            }
            Map<String, String> map4 = c826120Waw.LJIIIIZZ;
            if (map4 != null && (setKeySet = map4.keySet()) != null && (listLLIIII = C13LP.LLIIII(setKeySet)) != null && (!listLLIIII.isEmpty())) {
                c826130Wax.LIZ("cookie_fields", EnumC823400WRu.String, C788050Uvj.LIZ(listLLIIII), EnumC826170Wb1.EXTRA);
            }
        }
        if (c826130WaxLIZ != null) {
            for (Map.Entry entry : ((LinkedHashMap) c826130WaxLIZ.LIZ).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!c826130Wax.LIZ.containsKey(key)) {
                    c826130Wax.LIZ.put((String) key, (C0WR6) value);
                    Object obj2 = ((LinkedHashMap) c826130WaxLIZ.LIZIZ).get(key);
                    if (obj2 != null) {
                        c826130Wax.LIZIZ.put((String) key, (EnumC826170Wb1) obj2);
                    }
                }
            }
        }
        LIZ.execute(new ARunnableS113S0100000_13(c826130Wax, 16));
        return false;
    }
}
