package X;

import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BaseCommonRules;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BaseRule;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BtmParamsRule;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BusinessCommonRules;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BusinessRule;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.PageMapData;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.PassParamsChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.Rule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughAbilityOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughEnableCommonParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughParamGuardExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughUnzipParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassthroughParamsBtmExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.GlobalPropsParamsConfigRule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.LSPassThroughGlobalPropsSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21313818b2 {
    public static final C21313818b2 LIZ = new C21313818b2();
    public static volatile boolean LIZIZ;
    public static Map<String, ? extends List<BtmParamsRule>> LIZJ;
    public static Map<String, ? extends List<C21314318b7>> LIZLLL;
    public static C1865450ydz LJ;
    public static Set<String> LJFF;
    public static volatile Set<String> LJI;

    static {
        C08CX c08cx = C08CX.INSTANCE;
        LJFF = c08cx;
        LJI = c08cx;
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.18bE
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                C21313818b2.LIZ.getClass();
                C21313818b2.LJIIIZ();
            }
        });
    }

    public static void LIZ() {
        PassParamsChannel passParamsChannel;
        List<String> list;
        Map<Integer, C21314618bA> map;
        Collection<C21314618bA> collectionValues;
        Collection collectionValues2;
        Collection<? extends List<BtmParamsRule>> collectionValues3;
        if (LSPassThroughParamGuardExp.INSTANCE.hitExperiment()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Map<String, ? extends List<BtmParamsRule>> map2 = LIZJ;
            if (map2 != null && (collectionValues3 = map2.values()) != null) {
                Iterator<T> it2 = collectionValues3.iterator();
                while (it2.hasNext()) {
                    for (BtmParamsRule btmParamsRule : (List) it2.next()) {
                        linkedHashSet.addAll(btmParamsRule.params);
                        linkedHashSet.addAll(btmParamsRule.unzipParams);
                    }
                }
            }
            Map<String, ? extends List<C21314318b7>> map3 = LIZLLL;
            if (map3 != null && (collectionValues2 = ((LinkedHashMap) map3).values()) != null) {
                Iterator it3 = collectionValues2.iterator();
                while (it3.hasNext()) {
                    for (C21314318b7 c21314318b7 : (List) it3.next()) {
                        List<String> list2 = c21314318b7.LIZIZ;
                        if (list2 != null) {
                            linkedHashSet.addAll(list2);
                        }
                        List<String> list3 = c21314318b7.LJI;
                        if (list3 != null) {
                            linkedHashSet.addAll(list3);
                        }
                    }
                }
            }
            C1865450ydz c1865450ydz = LJ;
            if (c1865450ydz != null && (map = c1865450ydz.LIZIZ) != null && (collectionValues = map.values()) != null) {
                Iterator<T> it4 = collectionValues.iterator();
                while (it4.hasNext()) {
                    List<String> list4 = ((C21314618bA) it4.next()).LIZ;
                    if (list4 != null) {
                        linkedHashSet.addAll(list4);
                    }
                }
            }
            List<Rule> list5 = C21313918b3.LIZ;
            EventParamsConfig eventParamsConfigLIZ = C21314218b6.LIZ();
            if (eventParamsConfigLIZ != null && (passParamsChannel = eventParamsConfigLIZ.passParamsChannel) != null && (list = passParamsChannel.params) != null) {
                linkedHashSet.addAll(list);
            }
            List<GlobalPropsParamsConfigRule> rules = LSPassThroughGlobalPropsSettings.INSTANCE.getRules();
            if (rules != null) {
                Iterator<GlobalPropsParamsConfigRule> it5 = rules.iterator();
                while (it5.hasNext()) {
                    List<String> list6 = it5.next().params;
                    if (list6 != null) {
                        linkedHashSet.addAll(list6);
                    }
                }
            }
            LJI = linkedHashSet;
        }
    }

    public static void LJI() {
        BaseCommonRules baseCommonRules;
        LinkedHashMap linkedHashMap;
        try {
            if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
                List<Rule> list = C21313918b3.LIZ;
                EventParamsConfig eventParamsConfigLIZ = C21314218b6.LIZ();
                if (eventParamsConfigLIZ == null || (baseCommonRules = eventParamsConfigLIZ.baseCommonRules) == null || !baseCommonRules.enable || baseCommonRules == null) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (BaseRule baseRule : baseCommonRules.rules) {
                    Integer num = baseRule.type;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        List<PageMapData> list2 = baseRule.currentPageMapping;
                        if (list2 != null) {
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iLIZIZ);
                            for (PageMapData pageMapData : list2) {
                                Pair pair = new Pair(pageMapData.btm, pageMapData.currentPage);
                                linkedHashMap.put(pair.getFirst(), pair.getSecond());
                            }
                        } else {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap2.put(Integer.valueOf(iIntValue), new C21314618bA(baseRule.params, linkedHashMap));
                    }
                }
                LJFF = C15442062u.LJIIIZ(LJFF, C13LP.LLIIJI(baseCommonRules.btmList));
                LJ = new C1865450ydz(baseCommonRules.btmList, linkedHashMap2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJII() {
        List<BusinessRule> arrayList;
        List<String> list;
        BusinessCommonRules businessCommonRules;
        try {
            if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
                List<Rule> list2 = C21313918b3.LIZ;
                EventParamsConfig eventParamsConfigLIZ = C21314218b6.LIZ();
                if (eventParamsConfigLIZ == null || (businessCommonRules = eventParamsConfigLIZ.businessCommonRules) == null || !businessCommonRules.enable || (arrayList = businessCommonRules.businessRules) == null) {
                    arrayList = new ArrayList();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (BusinessRule businessRule : arrayList) {
                    Boolean bool = businessRule.strictMode;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    List<String> list3 = businessRule.btmList;
                    if (list3 != null) {
                        for (String str : list3) {
                            if (LSPassthroughParamsBtmExp.INSTANCE.hitExperiment()) {
                                linkedHashSet.add(str);
                            }
                            List<String> list4 = businessRule.dataBtmList;
                            List<String> list5 = businessRule.params;
                            String str2 = businessRule.businessScene;
                            String str3 = businessRule.dataSource;
                            C21313818b2 c21313818b2 = LIZ;
                            List<String> list6 = businessRule.unzipParams;
                            c21313818b2.getClass();
                            C21314318b7 c21314318b7 = new C21314318b7(list4, list5, str2, linkedHashSet, bool, str3, LJ(list6));
                            if (linkedHashMap.containsKey(str)) {
                                List list7 = (List) linkedHashMap.get(str);
                                if (list7 != null) {
                                    list7.add(c21314318b7);
                                }
                            } else {
                                linkedHashMap.put(str, C1697810uHb.LJIILJJIL(c21314318b7));
                            }
                        }
                    }
                    if (LSPassthroughParamsBtmExp.INSTANCE.hitExperiment() && (list = businessRule.btmListV2) != null) {
                        for (String str4 : list) {
                            linkedHashSet.add(str4);
                            List<String> list8 = businessRule.dataBtmList;
                            List<String> list9 = businessRule.params;
                            String str5 = businessRule.businessScene;
                            String str6 = businessRule.dataSource;
                            C21313818b2 c21313818b22 = LIZ;
                            List<String> list10 = businessRule.unzipParams;
                            c21313818b22.getClass();
                            C21314318b7 c21314318b72 = new C21314318b7(list8, list9, str5, linkedHashSet, bool, str6, LJ(list10));
                            if (linkedHashMap.containsKey(str4)) {
                                List list11 = (List) linkedHashMap.get(str4);
                                if (list11 != null) {
                                    list11.add(c21314318b72);
                                }
                            } else {
                                linkedHashMap.put(str4, C1697810uHb.LJIILJJIL(c21314318b72));
                            }
                        }
                    }
                    LJFF = C15442062u.LJIIIZ(LJFF, linkedHashSet);
                }
                LIZLLL = linkedHashMap;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIJ() {
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (!LIZIZ) {
                    LIZ.getClass();
                    LJIIIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int LIZLLL() {
        Integer num;
        EventParamsConfig eventParamsConfigLIZ = C21314218b6.LIZ();
        if (eventParamsConfigLIZ == null || (num = eventParamsConfigLIZ.configVersion) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static void LJIIIIZZ() {
        LinkedHashMap linkedHashMap;
        try {
            List listLIZ = C21313918b3.LIZ();
            if (LSPassThroughAbilityOptConfig.INSTANCE.enable()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj : (ArrayList) listLIZ) {
                    String str = ((Rule) obj).eventName;
                    Object arrayList = linkedHashMap2.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap2.put(str, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
                for (Object obj2 : linkedHashMap2.entrySet()) {
                    Object key = ((Map.Entry) obj2).getKey();
                    Iterable<Rule> iterable = (Iterable) ((Map.Entry) obj2).getValue();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                    for (Rule rule : iterable) {
                        String str2 = rule.btm;
                        List<String> listLJLIL = (!C123100dR.LIZ(str2) || str2 == null) ? rule.btmList : C13LP.LJLIL(rule.btmList, Collections.singletonList(str2));
                        String str3 = rule.dataBtm;
                        List<String> listLJLIL2 = (!C123100dR.LIZ(str3) || str3 == null) ? rule.dataBtmList : C13LP.LJLIL(rule.dataBtmList, Collections.singletonList(str3));
                        String str4 = rule.LIZ;
                        List<String> list = rule.params;
                        C21313818b2 c21313818b2 = LIZ;
                        List<String> list2 = rule.unzipParams;
                        c21313818b2.getClass();
                        arrayList2.add(new BtmParamsRule(listLJLIL, listLJLIL2, str4, list, LJ(list2)));
                    }
                    linkedHashMap.put(key, new ArrayList(arrayList2));
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Rule rule2 : (ArrayList) listLIZ) {
                    List listSingletonList = Collections.singletonList(rule2.btm);
                    String str5 = rule2.LIZ;
                    List<String> list3 = rule2.params;
                    C21313818b2 c21313818b22 = LIZ;
                    List<String> list4 = rule2.unzipParams;
                    c21313818b22.getClass();
                    BtmParamsRule btmParamsRule = new BtmParamsRule(listSingletonList, null, str5, list3, LJ(list4), 2, null);
                    if (linkedHashMap.containsKey(rule2.eventName)) {
                        List list5 = (List) linkedHashMap.get(rule2.eventName);
                        if (list5 != null) {
                            list5.add(btmParamsRule);
                        }
                    } else {
                        linkedHashMap.put(rule2.eventName, C1697810uHb.LJIILJJIL(btmParamsRule));
                    }
                }
            }
            LIZJ = linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIZ() {
        if (C296990BkX.LIZ()) {
            try {
                LIZIZ = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initSettings ");
                sbLIZ.append(Log.getStackTraceString(new Throwable()));
                C2188811AlT.LIZIZ(sbLIZ);
                LJIIIIZZ();
                LJII();
                LJI();
                LIZ();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("initSettings cost: ");
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                sbLIZ2.append(j);
                C2188811AlT.LIZIZ(sbLIZ2);
                C21314018b4.LIZ.getClass();
                C21314018b4.LIZLLL(-1, j, "parse_settings", null, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("initSettings error: ");
                sbLIZ3.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
                C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_SETTINGS_ERROR, e);
            }
        }
    }

    public static List LJ(List list) {
        if (LSPassThroughUnzipParamsConfig.INSTANCE.enable()) {
            if (list == null) {
                return C13BV.INSTANCE;
            }
            return list;
        }
        return C13BV.INSTANCE;
    }

    public final List<C21314318b7> LIZJ(String str) {
        if (str == null || !LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
            return null;
        }
        try {
            LJIIJ();
            Map<String, ? extends List<C21314318b7>> map = LIZLLL;
            if (map == null) {
                return null;
            }
            return (List) ((LinkedHashMap) map).get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_SETTINGS_ERROR, e);
            return null;
        }
    }

    public final List<BtmParamsRule> LJFF(String str) {
        if (!C296990BkX.LIZ()) {
            return null;
        }
        try {
            LJIIJ();
            Map<String, ? extends List<BtmParamsRule>> map = LIZJ;
            if (map == null) {
                return null;
            }
            return map.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_SETTINGS_ERROR, e);
            return null;
        }
    }

    public final C21314618bA LIZIZ(String str, EnumC993900byG enumC993900byG) {
        boolean z;
        List<String> list;
        C1865450ydz c1865450ydz;
        Map<Integer, C21314618bA> map;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || !LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
            return null;
        }
        try {
            LJIIJ();
            C1865450ydz c1865450ydz2 = LJ;
            if (c1865450ydz2 == null || (list = c1865450ydz2.LIZ) == null || !list.contains(str) || (c1865450ydz = LJ) == null || (map = c1865450ydz.LIZIZ) == null) {
                return null;
            }
            return map.get(Integer.valueOf(enumC993900byG.getValue()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_SETTINGS_ERROR, e);
            return null;
        }
    }
}
