package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.GlobalPropsParamsConfigRule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.LSPassThroughGlobalPropsSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809500xBk {
    public static final C1809500xBk LIZ = new C1809500xBk();
    public static Map<String, Map<String, Map<String, List<C00EG>>>> LIZIZ = new LinkedHashMap();
    public static volatile boolean LIZJ;

    public static void LIZIZ() {
        Object next;
        LSPassThroughGlobalPropsSettings lSPassThroughGlobalPropsSettings = LSPassThroughGlobalPropsSettings.INSTANCE;
        if (lSPassThroughGlobalPropsSettings.enable()) {
            try {
                LIZJ = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<GlobalPropsParamsConfigRule> rules = lSPassThroughGlobalPropsSettings.getRules();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (rules != null) {
                    for (GlobalPropsParamsConfigRule globalPropsParamsConfigRule : rules) {
                        String str = globalPropsParamsConfigRule.path;
                        String str2 = "*";
                        if (str == null || str.length() <= 0) {
                            str = "*";
                        }
                        String str3 = globalPropsParamsConfigRule.channel;
                        if (str3 == null || str3.length() <= 0) {
                            str3 = "*";
                        }
                        String str4 = globalPropsParamsConfigRule.bundle;
                        if (str4 != null && str4.length() > 0) {
                            str2 = str4;
                        }
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) LIZIZ;
                        Object linkedHashMap3 = linkedHashMap2.get(str);
                        if (linkedHashMap3 == null) {
                            linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap2.put(str, linkedHashMap3);
                        }
                        Map map = (Map) linkedHashMap3;
                        Object linkedHashMap4 = map.get(str3);
                        if (linkedHashMap4 == null) {
                            linkedHashMap4 = new LinkedHashMap();
                            map.put(str3, linkedHashMap4);
                        }
                        Map map2 = (Map) linkedHashMap4;
                        Object arrayList = map2.get(str2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map2.put(str2, arrayList);
                        }
                        ArrayList arrayList2 = new ArrayList((Collection) arrayList);
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((C00EG) next).LIZ, globalPropsParamsConfigRule.query)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C00EG c00eg = (C00EG) next;
                        C1809510xBl c1809510xBl = new C1809510xBl(globalPropsParamsConfigRule.dataBtm, globalPropsParamsConfigRule.params);
                        if (c00eg != null) {
                            c00eg.LIZIZ.add(c1809510xBl);
                        } else {
                            arrayList2.add(new C00EG(globalPropsParamsConfigRule.query, C1697810uHb.LJIILJJIL(c1809510xBl)));
                        }
                        map2.put(str2, arrayList2);
                        map.put(str3, map2);
                        linkedHashMap.put(str, map);
                    }
                }
                LIZIZ = linkedHashMap;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C21314018b4.LIZ.getClass();
                C21314018b4.LIZLLL(-1, jCurrentTimeMillis2 - jCurrentTimeMillis, "parse_global_props_settings", null, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_SETTINGS_ERROR, e);
            }
        }
    }

    public static List LIZ(String str) {
        List listLJIIJJI;
        if (str != null && str.length() > 0 && !Intrinsics.LJFF(str, "/") && (listLJIIJJI = C1697810uHb.LJIIJJI(str, "*")) != null) {
            return listLJIIJJI;
        }
        return Collections.singletonList("*");
    }
}
