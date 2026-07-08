package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.LsLynxImageMonitorExp;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import com.ss.android.ugc.aweme.offline.thor.IThorService;
import com.ss.android.ugc.aweme.poi.hybrid.IPoiHybridService;
import com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings.TtlsSparkAppendAllowlistPagesSettings;
import com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings.TtlsSparkAppendDefaultParamsSettings;
import com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings.TtlsSparkAppendSpecifiedParamsSettings;
import com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings.TtlsSparkPluginEnableSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195460hDM implements IPoiHybridService {
    @Override // com.ss.android.ugc.aweme.poi.hybrid.IPoiHybridService
    public final void registerSparkPlugin() {
        if (TtlsSparkPluginEnableSettings.INSTANCE.getEnable()) {
            try {
                if (C1195470hDN.LIZ) {
                    return;
                }
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                AbstractC1538690q8x abstractC1538690q8x = new AbstractC1538690q8x() { // from class: X.0kvO
                    public final List<InterfaceC1338100kvQ> LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC1338100kvQ() { // from class: X.07lK
                        public final List<String> LIZ = new ArrayList();
                        public final Map<String, List<String>> LIZIZ = new LinkedHashMap();
                        public List<String> LIZJ;

                        public static Map LIZIZ(String str) {
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp1")) {
                                return (Map) C07NF.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp2")) {
                                return (Map) C07NH.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp3")) {
                                return (Map) C07NI.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp4")) {
                                return (Map) C07NJ.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp5")) {
                                return (Map) C07NK.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp6")) {
                                return (Map) C07NL.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp7")) {
                                return (Map) C07NM.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp8")) {
                                return (Map) C07NN.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp9")) {
                                return (Map) C07NO.LIZIZ.getValue();
                            }
                            if (Intrinsics.LJFF(str, "ttls_spark_append_precise_exp10")) {
                                return (Map) C07NG.LIZIZ.getValue();
                            }
                            return null;
                        }

                        public final Pair<String, String> LIZ(String str) {
                            try {
                                Uri uriLJ = C1946007jm.LJ(str);
                                if (Intrinsics.LJFF(uriLJ, Uri.EMPTY)) {
                                    return null;
                                }
                                String strLIZJ = C1946007jm.LIZJ(uriLJ, "channel");
                                String strLIZJ2 = C1946007jm.LIZJ(uriLJ, "bundle");
                                if (strLIZJ != null && strLIZJ2 != null) {
                                    return new Pair<>(strLIZJ, strLIZJ2);
                                }
                                String strLIZJ3 = C1946007jm.LIZJ(uriLJ, "url");
                                if (strLIZJ3 == null && (strLIZJ3 = C1946007jm.LIZJ(uriLJ, "surl")) == null) {
                                    return null;
                                }
                                List<String> listLJIILJJIL = this.LIZJ;
                                if (listLJIILJJIL == null) {
                                    listLJIILJJIL = C1697810uHb.LJIILJJIL("ecom_prefix");
                                    for (Pattern pattern : (ArrayList) C1553670qX7.LIZJ()) {
                                        if (pattern.toString().length() > 0) {
                                            listLJIILJJIL.add(pattern.toString());
                                        }
                                    }
                                    this.LIZJ = listLJIILJJIL;
                                }
                                Iterator<String> it2 = listLJIILJJIL.iterator();
                                while (it2.hasNext()) {
                                    C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(strLIZJ3, it2.next());
                                    if (c1533510q0bLIZIZ != null) {
                                        if (strLIZJ2 == null) {
                                            strLIZJ2 = c1533510q0bLIZIZ.LIZJ;
                                        }
                                        if (strLIZJ == null) {
                                            strLIZJ = c1533510q0bLIZIZ.LIZIZ;
                                        }
                                        return new Pair<>(strLIZJ, strLIZJ2);
                                    }
                                }
                                return new Pair<>(strLIZJ, strLIZJ2);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
                                return null;
                            }
                        }

                        @Override // X.InterfaceC1338100kvQ
                        public final boolean matchInterceptRules(String str) {
                            String first;
                            List<String> list;
                            if (str == null) {
                                return false;
                            }
                            try {
                                Pair<String, String> pairLIZ = LIZ(str);
                                if (pairLIZ != null && (first = pairLIZ.getFirst()) != null) {
                                    Iterator it2 = ((ArrayList) this.LIZ).iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.LJFF(first, (String) it2.next())) {
                                            return true;
                                        }
                                    }
                                    List<String> list2 = TtlsSparkAppendAllowlistPagesSettings.INSTANCE.getAllowlist().channelsWithoutBundles;
                                    if (list2 != null) {
                                        for (String str2 : list2) {
                                            if (Intrinsics.LJFF(first, str2)) {
                                                ((ArrayList) this.LIZ).add(str2);
                                                return true;
                                            }
                                        }
                                    }
                                    String second = pairLIZ.getSecond();
                                    if (second == null) {
                                        return false;
                                    }
                                    List list3 = (List) ((LinkedHashMap) this.LIZIZ).get(first);
                                    if (list3 != null) {
                                        Iterator it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            if (Intrinsics.LJFF(second, (String) it3.next())) {
                                                return true;
                                            }
                                        }
                                    }
                                    Map<String, List<String>> map = TtlsSparkAppendAllowlistPagesSettings.INSTANCE.getAllowlist().channelsWithBundles;
                                    if (map != null && (list = map.get(first)) != null) {
                                        for (String str3 : list) {
                                            if (Intrinsics.LJFF(second, str3)) {
                                                List list4 = (List) ((LinkedHashMap) this.LIZIZ).get(first);
                                                if (list4 == null) {
                                                    this.LIZIZ.put(first, C1697810uHb.LJIILJJIL(str3));
                                                    return true;
                                                }
                                                list4.add(str3);
                                                return true;
                                            }
                                        }
                                    }
                                }
                                return false;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
                                return false;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.functions.Function1] */
                        @Override // X.InterfaceC1338100kvQ
                        public final void handleSparkContext(SparkContext sparkContext, String str) {
                            long jCurrentTimeMillis;
                            String first;
                            CharSequence charSequence;
                            Double d;
                            Boolean bool;
                            String str2;
                            Map<String, Map<String, List<String>>> map;
                            Map<String, List<String>> map2;
                            List<String> list;
                            List<String> list2;
                            Map<String, Map<String, Map<String, Object>>> map3;
                            Map<String, Map<String, Object>> map4;
                            Map<String, Object> map5;
                            Map<String, Object> map6;
                            try {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            } catch (Exception e) {
                                e = e;
                            }
                            try {
                                Pair<String, String> pairLIZ = LIZ(str);
                                if (pairLIZ != null && (first = pairLIZ.getFirst()) != null) {
                                    String second = pairLIZ.getSecond();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    TtlsSparkAppendDefaultParamsSettings ttlsSparkAppendDefaultParamsSettings = TtlsSparkAppendDefaultParamsSettings.INSTANCE;
                                    Map<String, Map<String, Object>> map7 = ttlsSparkAppendDefaultParamsSettings.getDefaultParams().channelsWithoutBundles;
                                    if (map7 != null && (map6 = map7.get(first)) != null) {
                                        linkedHashMap.putAll(map6);
                                    }
                                    if (second != null && (map3 = ttlsSparkAppendDefaultParamsSettings.getDefaultParams().channelsWithBundles) != null && (map4 = map3.get(first)) != null && (map5 = map4.get(second)) != null) {
                                        linkedHashMap.putAll(map5);
                                    }
                                    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                                    Map<String, List<String>> map8 = TtlsSparkAppendSpecifiedParamsSettings.INSTANCE.getKeys().channelsWithoutBundles;
                                    if (map8 != null && (list2 = map8.get(first)) != null) {
                                        Iterator<String> it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            linkedHashSet.add(it2.next());
                                        }
                                    }
                                    if (second != null && (map = TtlsSparkAppendSpecifiedParamsSettings.INSTANCE.getKeys().channelsWithBundles) != null && (map2 = map.get(first)) != null && (list = map2.get(second)) != null) {
                                        Iterator<String> it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            linkedHashSet.add(it3.next());
                                        }
                                    }
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    for (String str3 : linkedHashSet) {
                                        Map mapLIZIZ = LIZIZ(str3);
                                        if (mapLIZIZ != null) {
                                            linkedHashMap.putAll(mapLIZIZ);
                                        } else {
                                            linkedHashSet2.add(str3);
                                        }
                                    }
                                    Iterator it4 = linkedHashMap.entrySet().iterator();
                                    while (true) {
                                        charSequence = null;
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it4.next();
                                        Object value = entry.getValue();
                                        if (value instanceof Number) {
                                            Object value2 = entry.getValue();
                                            if ((value2 instanceof Double) && (d = (Double) value2) != null) {
                                                double dDoubleValue = d.doubleValue();
                                                int i = (int) dDoubleValue;
                                                if (Double.compare(dDoubleValue, i) == 0) {
                                                    sparkContext.LJJJLZIJ(i, (String) entry.getKey());
                                                } else {
                                                    sparkContext.LJJJLL(dDoubleValue, (String) entry.getKey());
                                                }
                                            }
                                        } else if (value instanceof Boolean) {
                                            Object value3 = entry.getValue();
                                            if ((value3 instanceof Boolean) && (bool = (Boolean) value3) != null) {
                                                sparkContext.LJJL((String) entry.getKey(), bool.booleanValue());
                                            }
                                        } else if (value instanceof String) {
                                            Object value4 = entry.getValue();
                                            if ((value4 instanceof String) && (str2 = (String) value4) != null) {
                                                sparkContext.LJJJZ((String) entry.getKey(), str2);
                                            }
                                        }
                                    }
                                    if (!linkedHashSet2.isEmpty()) {
                                        charSequence = null;
                                        sparkContext.LJJJZ("ab_params", C13LP.LJJLIIIJ(linkedHashSet2, ",", null, null, 0, null, null, 62));
                                    }
                                    if (second == null) {
                                        second = "";
                                    }
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01JN("spark_append_params", first, second, str, System.currentTimeMillis() - jCurrentTimeMillis, C2097608Jq.LJIIIIZZ(new Pair("append_params", linkedHashMap.toString()), new Pair("ab_params", C13LP.LJJLIIIJ(linkedHashSet2, ",", charSequence, charSequence, 0, charSequence, charSequence, 62))), null), 3);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
                            }
                        }
                    }, new InterfaceC1338100kvQ() { // from class: X.0kvN
                        public List<String> LIZ;

                        public final Pair<String, String> LIZ(String str) {
                            try {
                                Uri uriLJ = C1946007jm.LJ(str);
                                if (Intrinsics.LJFF(uriLJ, Uri.EMPTY)) {
                                    return null;
                                }
                                String strLIZJ = C1946007jm.LIZJ(uriLJ, "channel");
                                String strLIZJ2 = C1946007jm.LIZJ(uriLJ, "bundle");
                                if (strLIZJ != null && strLIZJ2 != null) {
                                    return new Pair<>(strLIZJ, strLIZJ2);
                                }
                                String strLIZJ3 = C1946007jm.LIZJ(uriLJ, "url");
                                if (strLIZJ3 == null && (strLIZJ3 = C1946007jm.LIZJ(uriLJ, "surl")) == null) {
                                    return null;
                                }
                                List<String> listLJIILJJIL = this.LIZ;
                                if (listLJIILJJIL == null) {
                                    listLJIILJJIL = C1697810uHb.LJIILJJIL("ecom_prefix");
                                    for (Pattern pattern : (ArrayList) C1553670qX7.LIZJ()) {
                                        if (pattern.toString().length() > 0) {
                                            listLJIILJJIL.add(pattern.toString());
                                        }
                                    }
                                    this.LIZ = listLJIILJJIL;
                                }
                                Iterator<String> it2 = listLJIILJJIL.iterator();
                                while (it2.hasNext()) {
                                    C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(strLIZJ3, it2.next());
                                    if (c1533510q0bLIZIZ != null) {
                                        if (strLIZJ2 == null) {
                                            strLIZJ2 = c1533510q0bLIZIZ.LIZJ;
                                        }
                                        if (strLIZJ == null) {
                                            strLIZJ = c1533510q0bLIZIZ.LIZIZ;
                                        }
                                        return new Pair<>(strLIZJ, strLIZJ2);
                                    }
                                }
                                return new Pair<>(strLIZJ, strLIZJ2);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
                                return null;
                            }
                        }

                        @Override // X.InterfaceC1338100kvQ
                        public final boolean matchInterceptRules(String str) {
                            String first;
                            LsLynxImageMonitorExp.ChannelConfig channelConfig;
                            List<String> list;
                            List<String> list2;
                            if (str == null) {
                                return false;
                            }
                            C01GW c01gw = LsLynxImageMonitorExp.LIZIZ;
                            if (!Intrinsics.LJFF(((LsLynxImageMonitorExp.Config) c01gw.getValue()).enable, Boolean.TRUE)) {
                                return false;
                            }
                            try {
                                Pair<String, String> pairLIZ = LIZ(str);
                                if (pairLIZ != null && (first = pairLIZ.getFirst()) != null) {
                                    String second = pairLIZ.getSecond();
                                    Map<String, LsLynxImageMonitorExp.ChannelConfig> map = ((LsLynxImageMonitorExp.Config) c01gw.getValue()).blockLynxUrlList;
                                    if (map == null || (channelConfig = map.get(first)) == null || (second != null && second.length() != 0 && (((list = channelConfig.bundleList) == null || !list.isEmpty()) && ((list2 = channelConfig.bundleList) == null || !list2.contains(second))))) {
                                        Map<String, LsLynxImageMonitorExp.ChannelConfig> map2 = ((LsLynxImageMonitorExp.Config) c01gw.getValue()).allowLynxUrlList;
                                        if (map2 != null) {
                                            LsLynxImageMonitorExp.ChannelConfig channelConfig2 = map2.get(first);
                                            if (channelConfig2 != null) {
                                                if (second != null) {
                                                    if (second.length() != 0) {
                                                        List<String> list3 = channelConfig2.bundleList;
                                                        if (list3 != null) {
                                                            if (!list3.isEmpty()) {
                                                            }
                                                        }
                                                        List<String> list4 = channelConfig2.bundleList;
                                                        if (list4 != null && list4.contains(second)) {
                                                        }
                                                    }
                                                }
                                                C1186030gy9.LIZ(new AwS564S0100000_20(pairLIZ, (Pair<String, String>) 36));
                                                return true;
                                            }
                                        }
                                    }
                                    C1186030gy9.LIZ(new AwS564S0100000_20(pairLIZ, (Pair<String, String>) 35));
                                    return false;
                                }
                                return false;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                                C1EMR c1emr = C1EMR.SPARK_INTERCEPTOR_ERR;
                                c1205490hTX.getClass();
                                C1205490hTX.LIZLLL(c1emr, null, null, e);
                                return false;
                            }
                        }

                        @Override // X.InterfaceC1338100kvQ
                        public final void handleSparkContext(SparkContext sparkContext, String str) {
                            try {
                                if (!Intrinsics.LJFF(((LsLynxImageMonitorExp.Config) LsLynxImageMonitorExp.LIZIZ.getValue()).enable, Boolean.TRUE)) {
                                    return;
                                }
                                sparkContext.LJJJJZ(new C1339400kxW(2));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
                            }
                        }
                    }, new InterfaceC1338100kvQ() { // from class: X.0zMu
                        public List<C1809510xBl> LIZ;
                        public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(612));

                        @Override // X.InterfaceC1338100kvQ
                        public final boolean matchInterceptRules(String str) {
                            List<C1809510xBl> listLJIIJJI;
                            ILocalServicePassThroughService iLocalServicePassThroughService = (ILocalServicePassThroughService) this.LIZIZ.getValue();
                            boolean z = false;
                            if (iLocalServicePassThroughService == null || !iLocalServicePassThroughService.LJIIJ() || str == null) {
                                return false;
                            }
                            try {
                                C1955807lM c1955807lMLIZ = C1955707lL.LIZ(str);
                                if (c1955807lMLIZ == null) {
                                    return false;
                                }
                                ILocalServicePassThroughService iLocalServicePassThroughService2 = (ILocalServicePassThroughService) this.LIZIZ.getValue();
                                if (iLocalServicePassThroughService2 != null) {
                                    listLJIIJJI = iLocalServicePassThroughService2.LJIIJJI(c1955807lMLIZ);
                                } else {
                                    listLJIIJJI = null;
                                }
                                this.LIZ = listLJIIJJI;
                                if (listLJIIJJI == null || listLJIIJJI.isEmpty()) {
                                    z = true;
                                }
                                return !z;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return z;
                            }
                        }

                        @Override // X.InterfaceC1338100kvQ
                        public final void handleSparkContext(SparkContext sparkContext, String str) {
                            List<C1809510xBl> list;
                            View viewE1;
                            InterfaceC1541990qEH kitView;
                            boolean z;
                            try {
                                ILocalServicePassThroughService iLocalServicePassThroughService = (ILocalServicePassThroughService) this.LIZIZ.getValue();
                                if (iLocalServicePassThroughService != null && iLocalServicePassThroughService.LJIIJ() && (list = this.LIZ) != null && !list.isEmpty()) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    List<C1809510xBl> list2 = this.LIZ;
                                    if (list2 != null) {
                                        ArrayList<C1809510xBl> arrayList = new ArrayList();
                                        Iterator<C1809510xBl> it2 = list2.iterator();
                                        while (true) {
                                            Boolean boolValueOf = null;
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            C1809510xBl next = it2.next();
                                            List<String> list3 = next.LIZIZ;
                                            if (list3 != null) {
                                                if (!list3.isEmpty()) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                boolValueOf = Boolean.valueOf(z);
                                            }
                                            if (C1189060h32.LJIILJJIL(boolValueOf)) {
                                                arrayList.add(next);
                                            }
                                        }
                                        for (C1809510xBl c1809510xBl : arrayList) {
                                            ILocalServicePassThroughService iLocalServicePassThroughService2 = (ILocalServicePassThroughService) this.LIZIZ.getValue();
                                            if (iLocalServicePassThroughService2 != null) {
                                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ = C1893200zMk.LIZIZ(sparkContext);
                                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ.getKitView()) != null) {
                                                    viewE1 = kitView.e1();
                                                } else {
                                                    viewE1 = null;
                                                }
                                                Map<String, Object> mapLJFF = iLocalServicePassThroughService2.LJFF(PageFinder.via(viewE1), c1809510xBl.LIZIZ, c1809510xBl.LIZ);
                                                if (mapLJFF != null) {
                                                    linkedHashMap.putAll(mapLJFF);
                                                }
                                            }
                                        }
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("local_service_passthrough_params", linkedHashMap);
                                    sparkContext.LJJLIIIJILLIZJL(linkedHashMap2);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }, new InterfaceC1338100kvQ() { // from class: X.0kvP
                        @Override // X.InterfaceC1338100kvQ
                        public final boolean matchInterceptRules(String str) {
                            IThorService iThorService = (IThorService) PluggableExtentionKt.pluggableSpi$default(IThorService.class, false, false, false, 14, null);
                            if (iThorService != null) {
                                iThorService.isOpen();
                            }
                            return false;
                        }

                        @Override // X.InterfaceC1338100kvQ
                        public final void handleSparkContext(SparkContext sparkContext, String str) {
                            IThorService iThorService = (IThorService) PluggableExtentionKt.pluggableSpi$default(IThorService.class, false, false, false, 14, null);
                            if (iThorService != null) {
                                iThorService.isOpen();
                            }
                        }
                    });

                    @Override // X.AbstractC1538690q8x
                    public final String LJI() {
                        return "local_service";
                    }

                    @Override // X.AbstractC1538690q8x
                    public final void LJ(SparkContext sparkContext, String str) {
                        super.LJ(sparkContext, str);
                        for (InterfaceC1338100kvQ interfaceC1338100kvQ : this.LIZIZ) {
                            if (interfaceC1338100kvQ.matchInterceptRules(sparkContext.LJIJI())) {
                                interfaceC1338100kvQ.handleSparkContext(sparkContext, sparkContext.LJIJI());
                            }
                        }
                    }
                };
                c1537900q7g.getClass();
                C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
                C1195470hDN.LIZ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
            }
        }
    }
}
