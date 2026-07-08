package X;

import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.frequency.model.BindConfig;
import com.ss.android.ugc.aweme.frequency.model.ExitRule;
import com.ss.android.ugc.aweme.frequency.model.FrequencyConfig;
import com.ss.android.ugc.aweme.frequency.model.FrequencyProtocol;
import com.ss.android.ugc.aweme.frequency.model.FrequencyRule;
import com.ss.android.ugc.aweme.outreach.frequency.config.Abilities;
import com.ss.android.ugc.aweme.outreach.frequency.config.ClientFrequencyControl;
import com.ss.android.ugc.aweme.outreach.frequency.config.ClientLocalStorage;
import com.ss.android.ugc.aweme.outreach.frequency.config.CommonFrequencyAbilityConfig;
import com.ss.android.ugc.aweme.outreach.frequency.config.CustomConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20678515vr extends C09AY implements Function0<C807950Vmj> {
    public final /* synthetic */ C20678415vq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20678515vr(C20678415vq c20678415vq) {
        super(0);
        this.LL = c20678415vq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends X.0WPi>>>] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final C807950Vmj invoke() {
        ?? arrayList;
        List<CustomConfig> list;
        ClientLocalStorage clientLocalStorage;
        ClientLocalStorage clientLocalStorage2;
        ?? LJ;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ExitRule exitRule;
        FrequencyRule frequencyRule;
        List<CustomConfig> list2;
        CustomConfig next;
        Abilities abilities;
        ClientFrequencyControl clientFrequencyControl;
        C20678415vq c20678415vq = this.LL;
        Context context = c20678415vq.LIZ;
        FrequencyProtocol frequencyProtocol = c20678415vq.LIZIZ;
        C822780WPk c822780WPk = ((C822770WPj) c20678415vq.LIZLLL.getValue()).LIZIZ;
        new AwS573S0100000_29(c20678415vq, 963);
        c822780WPk.getClass();
        if (frequencyProtocol != null) {
            C822720WPe c822720WPeLJIIIIZZ = c20678415vq.LJIIIIZZ();
            c822720WPeLJIIIIZZ.LIZIZ = (C822770WPj) c20678415vq.LIZLLL.getValue();
            List<FrequencyConfig> list3 = frequencyProtocol.frequencyConfigs;
            if (list3 != null) {
                List listLJJJJLI = C13LP.LJJJJLI(list3);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJJJLI, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
                Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
                while (true) {
                    String str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    String str2 = ((FrequencyConfig) next2).outreachType;
                    if (str2 != null) {
                        str = str2;
                    }
                    linkedHashMap3.put(str, next2);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    Object key = entry.getKey();
                    CommonFrequencyAbilityConfig commonFrequencyAbilityConfig = (CommonFrequencyAbilityConfig) C20677515vh.LIZ.getValue();
                    if (commonFrequencyAbilityConfig != null && (list2 = commonFrequencyAbilityConfig.customConfigs) != null) {
                        Iterator<CustomConfig> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (Intrinsics.LJFF(next.outreachType, key)) {
                                break;
                            }
                        }
                        CustomConfig customConfig = next;
                        if (customConfig != null && (abilities = customConfig.abilities) != null && (clientFrequencyControl = abilities.clientFrequencyControl) != null && clientFrequencyControl.enable) {
                            linkedHashMap4.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                LJ = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap4.size()));
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    Object key2 = entry2.getKey();
                    FrequencyConfig frequencyConfig = (FrequencyConfig) entry2.getValue();
                    String str3 = frequencyConfig.outreachType;
                    if (str3 == null) {
                        str3 = "";
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    List<BindConfig> list4 = frequencyConfig.bindConfigs;
                    if (list4 != null) {
                        for (BindConfig bindConfig : list4) {
                            List list5 = bindConfig.ruleIds;
                            if (list5 == null) {
                                list5 = C13BV.INSTANCE;
                            }
                            List list6 = bindConfig.keys;
                            if (list6 == null) {
                                list6 = C13BV.INSTANCE;
                            }
                            for (Object obj : list6) {
                                Object arrayList2 = linkedHashMap5.get(obj);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    linkedHashMap5.put(obj, arrayList2);
                                }
                                ((List) arrayList2).addAll(list5);
                            }
                            for (Object obj2 : list5) {
                                Object arrayList3 = linkedHashMap6.get(obj2);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    linkedHashMap6.put(obj2, arrayList3);
                                }
                                ((List) arrayList3).addAll(list6);
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap5.size()));
                    for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                        linkedHashMap7.put(entry3.getKey(), C13LP.LLIIII((Iterable) entry3.getValue()));
                    }
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap6.size()));
                    for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
                        linkedHashMap8.put(entry4.getKey(), C13LP.LLIIII((Iterable) entry4.getValue()));
                    }
                    Pair pair = new Pair(linkedHashMap7, linkedHashMap8);
                    Map map = (Map) pair.getFirst();
                    Map map2 = (Map) pair.getSecond();
                    LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                    List<BindConfig> list7 = frequencyConfig.bindConfigs;
                    if (list7 != null) {
                        Iterator<BindConfig> it4 = list7.iterator();
                        while (it4.hasNext()) {
                            List<String> list8 = it4.next().scenes;
                            if (list8 != null) {
                                for (String str4 : list8) {
                                    List<FrequencyRule> list9 = frequencyConfig.frequencyRules;
                                    if (list9 != null) {
                                        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list9, 10));
                                        if (iLIZIZ2 < 16) {
                                            iLIZIZ2 = 16;
                                        }
                                        linkedHashMap = new LinkedHashMap(iLIZIZ2);
                                        for (FrequencyRule frequencyRule2 : list9) {
                                            String ruleId = frequencyRule2.getRuleId();
                                            if (ruleId == null) {
                                                ruleId = "";
                                            }
                                            linkedHashMap.put(ruleId, frequencyRule2);
                                        }
                                    } else {
                                        linkedHashMap = null;
                                    }
                                    List<ExitRule> list10 = frequencyConfig.exitRules;
                                    if (list10 != null) {
                                        int iLIZIZ3 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list10, 10));
                                        if (iLIZIZ3 < 16) {
                                            iLIZIZ3 = 16;
                                        }
                                        linkedHashMap2 = new LinkedHashMap(iLIZIZ3);
                                        for (ExitRule exitRule2 : list10) {
                                            String ruleId2 = exitRule2.getRuleId();
                                            if (ruleId2 == null) {
                                                ruleId2 = "";
                                            }
                                            linkedHashMap2.put(ruleId2, exitRule2);
                                        }
                                    } else {
                                        linkedHashMap2 = null;
                                    }
                                    Pair pair2 = new Pair(linkedHashMap, linkedHashMap2);
                                    Map map3 = (Map) pair2.getFirst();
                                    Map map4 = (Map) pair2.getSecond();
                                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                    LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                    for (Map.Entry entry5 : map.entrySet()) {
                                        String str5 = (String) entry5.getKey();
                                        for (String str6 : (List) entry5.getValue()) {
                                            List<String> list11 = (List) map2.get(str6);
                                            if (list11 == null) {
                                                list11 = C13BV.INSTANCE;
                                            }
                                            InterfaceC822740WPg interfaceC822740WPgLIZIZ = c822720WPeLJIIIIZZ.LIZIZ(str3, str4, str6, list11);
                                            InterfaceC822840WPq interfaceC822840WPq = map3 != null ? (InterfaceC822840WPq) map3.get(str6) : null;
                                            if ((interfaceC822840WPq instanceof FrequencyRule) && (frequencyRule = (FrequencyRule) interfaceC822840WPq) != null) {
                                                C822720WPe.LIZ(str5, frequencyRule, list11, linkedHashMap10, linkedHashMap11, new AwS222S0300000_13(frequencyRule, interfaceC822740WPgLIZIZ, c822720WPeLJIIIIZZ, 8));
                                            }
                                            List<String> list12 = (List) map2.get(str6);
                                            if (list12 == null) {
                                                list12 = C13BV.INSTANCE;
                                            }
                                            InterfaceC822840WPq interfaceC822840WPq2 = map4 != null ? (InterfaceC822840WPq) map4.get(str6) : null;
                                            if ((interfaceC822840WPq2 instanceof ExitRule) && (exitRule = (ExitRule) interfaceC822840WPq2) != null) {
                                                C822720WPe.LIZ(str5, exitRule, list12, linkedHashMap10, linkedHashMap11, new AwS222S0300000_13(exitRule, c822720WPeLJIIIIZZ.LIZIZ(str3, str4, str6, list12), c822720WPeLJIIIIZZ, 7));
                                            }
                                        }
                                    }
                                    linkedHashMap9.put(str4, linkedHashMap10);
                                }
                            }
                        }
                    }
                    LJ.put(key2, linkedHashMap9);
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            c822720WPeLJIIIIZZ.LIZ = LJ;
        }
        CommonFrequencyAbilityConfig commonFrequencyAbilityConfig2 = (CommonFrequencyAbilityConfig) C20677515vh.LIZ.getValue();
        if (commonFrequencyAbilityConfig2 == null || (list = commonFrequencyAbilityConfig2.customConfigs) == null) {
            arrayList = C13BV.INSTANCE;
            if (arrayList == 0) {
                arrayList = C13BV.INSTANCE;
            }
        } else {
            ArrayList<CustomConfig> arrayList4 = new ArrayList();
            for (CustomConfig customConfig2 : list) {
                Abilities abilities2 = customConfig2.abilities;
                if (abilities2 != null && (clientLocalStorage2 = abilities2.clientLocalStorage) != null && clientLocalStorage2.enable && abilities2.clientLocalStorage.maxCount > 0) {
                    arrayList4.add(customConfig2);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
            for (CustomConfig customConfig3 : arrayList4) {
                String str7 = customConfig3.outreachType;
                Abilities abilities3 = customConfig3.abilities;
                arrayList.add(new C1864407Ry(str7, (abilities3 == null || (clientLocalStorage = abilities3.clientLocalStorage) == null) ? 0 : clientLocalStorage.maxCount));
            }
        }
        C807950Vmj c807950Vmj = new C807950Vmj(context, c20678415vq.LJIIIIZZ(), (C822770WPj) c20678415vq.LIZLLL.getValue(), arrayList);
        C20679415w0.LIZ(new C20678915vv(null, null, null, null, null, 63), Collections.singletonList(new InterfaceC20680215w8<C20678915vv>() { // from class: X.15vi
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                BPEAHandler bPEAHandler = C20547083d.LIZ;
                C786410Ut5.LJJZZIII(C20547083d.LIZ, new RunnableC20548083e(new C20675715vP()));
            }
        })).LIZ();
        return c807950Vmj;
    }
}
