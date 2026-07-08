package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.outreach.dispersion.data.DispersionModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachGroupModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachMultiGroupListModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.RuleModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.Scene;
import com.ss.android.ugc.aweme.outreach.dispersion.data.TimeWindow;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AwS19S0120000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20648815r4 {
    public static final C20648815r4 LIZ = new C20648815r4();
    public static C20652415re LIZIZ;
    public static volatile Map<String, ? extends Map<String, ? extends Map<String, ? extends List<OutreachModel>>>> LIZJ;

    public static void LJIILJJIL() {
        C20648315qz.LIZ.getClass();
        if (!Intrinsics.LJFF(C20648315qz.LJ(), C20648315qz.LJ)) {
            C20648315qz.LJ = C20648315qz.LJ();
            C20648315qz.LJIIJJI(false);
            C20650415rK.LIZ.getClass();
            DispersionModel dispersionModelLIZ = C20650415rK.LIZ();
            if (dispersionModelLIZ != null) {
                LIZ.getClass();
                LJIIL(dispersionModelLIZ);
                C20648715r3.LIZ.getClass();
                C20648715r3.LIZLLL();
            }
        }
    }

    public static void LJIIL(DispersionModel dispersionModel) {
        ArrayList<C20648515r1> arrayList;
        List<String> list;
        ArrayList<C20648515r1> arrayList2;
        ArrayList<C20648515r1> arrayList3;
        LIZIZ = new C20652415re();
        List<RuleModel> list2 = dispersionModel.ruleList;
        if (list2 != null && !list2.isEmpty()) {
            for (RuleModel ruleModel : list2) {
                if (ruleModel != null) {
                    String str = ruleModel.ruleId;
                    List<String> list3 = ruleModel.outreachTypes;
                    if (str != null && str.length() != 0) {
                        C20647815qu.LIZ.getClass();
                        if (!C20647815qu.LIZJ && (list3 == null || list3.isEmpty())) {
                            C20571715ed.LIZ.getClass();
                            C20571715ed.LIZ("initRuleList, outreachTypeList is null");
                        } else {
                            Scene scene = ruleModel.scene;
                            if (scene != null) {
                                if (Intrinsics.LJFF(scene.type, "total")) {
                                    C20648515r1 c20648515r1 = new C20648515r1(str, ruleModel.outreachTypes, ruleModel.ruleGroups);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append('_');
                                    sbLIZ.append(EnumC1780960wRi.SCENE_TOTAL.getTypeName());
                                    C1781500wSa c1781500wSa = new C1781500wSa(C2188811AlT.LIZIZ(sbLIZ));
                                    List<String> list4 = scene.sceneList;
                                    if (list4 != null) {
                                        Iterator<String> it2 = list4.iterator();
                                        while (it2.hasNext()) {
                                            c1781500wSa.LIZIZ.add(it2.next());
                                        }
                                    }
                                    c20648515r1.LIZLLL = c1781500wSa;
                                    LJIIJJI(c20648515r1, ruleModel, list3);
                                    C20652415re c20652415re = LIZIZ;
                                    if (c20652415re != null && (arrayList = c20652415re.LIZ) != null) {
                                        arrayList.add(c20648515r1);
                                    }
                                } else if (Intrinsics.LJFF(scene.type, "single") && (list = scene.sceneList) != null) {
                                    for (String str2 : list) {
                                        C20648515r1 c20648515r12 = new C20648515r1(str, ruleModel.outreachTypes, ruleModel.ruleGroups);
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(str);
                                        sbLIZ2.append('_');
                                        sbLIZ2.append(EnumC1780960wRi.SCENE_SINGLE.getTypeName());
                                        sbLIZ2.append('_');
                                        sbLIZ2.append(str2);
                                        c20648515r12.LIZLLL = new C1781510wSb(C2188811AlT.LIZIZ(sbLIZ2), str2);
                                        LIZ.getClass();
                                        LJIIJJI(c20648515r12, ruleModel, list3);
                                        C20652415re c20652415re2 = LIZIZ;
                                        if (c20652415re2 != null && (arrayList2 = c20652415re2.LIZ) != null) {
                                            arrayList2.add(c20648515r12);
                                        }
                                    }
                                }
                            } else {
                                C20648515r1 c20648515r13 = new C20648515r1(str, list3, ruleModel.ruleGroups);
                                LJIIJJI(c20648515r13, ruleModel, list3);
                                C20652415re c20652415re3 = LIZIZ;
                                if (c20652415re3 != null && (arrayList3 = c20652415re3.LIZ) != null) {
                                    arrayList3.add(c20648515r13);
                                }
                            }
                        }
                    } else {
                        C20571715ed.LIZ.getClass();
                        C20571715ed.LIZ("initRuleList, ruleId is null");
                    }
                }
            }
            if (C0BMG.LIZ()) {
                HashMap map = new HashMap();
                List<OutreachMultiGroupListModel> list5 = dispersionModel.multiGroupList;
                if (list5 != null) {
                    for (OutreachMultiGroupListModel outreachMultiGroupListModel : list5) {
                        String str3 = outreachMultiGroupListModel.groupKey;
                        if (str3 != null) {
                            Object map2 = map.get(str3);
                            if (map2 == null) {
                                map2 = new HashMap();
                                map.put(str3, map2);
                            }
                            HashMap map3 = (HashMap) map2;
                            List<OutreachGroupModel> list6 = outreachMultiGroupListModel.dataGroupList;
                            if (list6 != null) {
                                for (OutreachGroupModel outreachGroupModel : list6) {
                                    String str4 = outreachGroupModel.outreachType;
                                    if (str4 != null) {
                                        Object map4 = map3.get(str4);
                                        if (map4 == null) {
                                            map4 = new HashMap();
                                            map3.put(str4, map4);
                                        }
                                        HashMap map5 = (HashMap) map4;
                                        List<OutreachModel> list7 = outreachGroupModel.outreachList;
                                        if (list7 != null) {
                                            for (OutreachModel outreachModel : list7) {
                                                String str5 = outreachModel.key;
                                                if (str5 != null) {
                                                    Object arrayList4 = map5.get(str5);
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                        map5.put(str5, arrayList4);
                                                    }
                                                    ((List) arrayList4).add(outreachModel);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                LIZJ = map;
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("buildOutreachInfoIndex done, groups=");
                sbLIZ3.append(map.size());
                C2188811AlT.LIZIZ(sbLIZ3);
                c20571715ed.getClass();
                return;
            }
            return;
        }
        C20571715ed.LIZ.getClass();
    }

    public static void LIZ(String str, C20650015rG c20650015rG) {
        ArrayList<C20648515r1> arrayList;
        List<String> list;
        C20647815qu.LIZ.getClass();
        if (C20647815qu.LIZJ) {
            C20571715ed.LIZ.getClass();
            if (str == null) {
                return;
            }
            C20652415re c20652415re = LIZIZ;
            if (c20652415re != null && (arrayList = c20652415re.LIZ) != null) {
                for (C20648515r1 c20648515r1 : arrayList) {
                    List<String> list2 = c20648515r1.LIZJ;
                    if (list2 == null || list2.contains(str)) {
                        if (!C866950Xzh.LIZIZ(c20648515r1.LIZIZ) || (list = c20648515r1.LIZIZ) == null || list.contains(c20650015rG.LIZIZ.getTypeName())) {
                            C20571715ed c20571715ed = C20571715ed.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("bindRuleInTriggerData. bind ");
                            sbLIZ.append(c20648515r1.LIZ);
                            sbLIZ.append(" to ");
                            sbLIZ.append(str);
                            sbLIZ.append('_');
                            sbLIZ.append(c20650015rG.LIZIZ);
                            sbLIZ.append('_');
                            sbLIZ.append(c20650015rG.LIZ);
                            sbLIZ.append('_');
                            sbLIZ.append(c20650015rG.LIZJ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            c20571715ed.getClass();
                            ((List) c20650015rG.LJFF.getValue()).add(c20648515r1);
                        }
                    }
                }
            }
            if (((List) c20650015rG.LJFF.getValue()).isEmpty()) {
                C20571715ed c20571715ed2 = C20571715ed.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bindRuleInTriggerData. no rule matched. outreach:");
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(c20650015rG.LIZ);
                sbLIZ2.append('_');
                sbLIZ2.append(c20650015rG.LIZIZ);
                sbLIZ2.append('_');
                sbLIZ2.append(c20650015rG.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ2);
                c20571715ed2.getClass();
            }
        }
    }

    public static boolean LJI(OutreachRecordData outreachRecordData, C20648515r1 c20648515r1) {
        AbstractC1781520wSc abstractC1781520wSc = c20648515r1.LIZLLL;
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkMatchScene, sceneDimension: ");
        sbLIZ.append(abstractC1781520wSc);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        if (abstractC1781520wSc instanceof C1781510wSb) {
            C1781510wSb c1781510wSb = (C1781510wSb) abstractC1781520wSc;
            if (Intrinsics.LJFF(c1781510wSb.LIZIZ, outreachRecordData.getScene())) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("single scene match: ");
                sbLIZ2.append(c1781510wSb.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                return true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("single scene not match, outreachScene: ");
            sbLIZ3.append(outreachRecordData.getScene());
            sbLIZ3.append(", ruleScene: ");
            sbLIZ3.append(c1781510wSb.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            return false;
        }
        if (!(abstractC1781520wSc instanceof C1781500wSa)) {
            return true;
        }
        if (C13LP.LJJJJ(outreachRecordData.getScene(), ((C1781500wSa) abstractC1781520wSc).LIZIZ)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("single scene match: ");
            sbLIZ4.append(outreachRecordData.getScene());
            C2188811AlT.LIZIZ(sbLIZ4);
            return true;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("single scene not match: ");
        sbLIZ5.append(outreachRecordData.getScene());
        C2188811AlT.LIZIZ(sbLIZ5);
        return false;
    }

    public static boolean LJII(OutreachRecordData outreachRecordData, C20648515r1 c20648515r1) {
        List<OutreachMultiGroupListModel> list;
        Object next;
        List<OutreachGroupModel> list2;
        OutreachGroupModel next2;
        List<OutreachModel> list3;
        List<String> list4 = c20648515r1.LIZJ;
        if (list4 == null) {
            return false;
        }
        for (String str : list4) {
            C20650415rK.LIZ.getClass();
            DispersionModel dispersionModelLIZ = C20650415rK.LIZ();
            OutreachModel outreachModel = null;
            if (dispersionModelLIZ != null && (list = dispersionModelLIZ.multiGroupList) != null) {
                Iterator<Object> it2 = new C1939607ik(list).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((OutreachMultiGroupListModel) next).groupKey, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                OutreachMultiGroupListModel outreachMultiGroupListModel = (OutreachMultiGroupListModel) next;
                if (outreachMultiGroupListModel != null && (list2 = outreachMultiGroupListModel.dataGroupList) != null) {
                    Iterator<OutreachGroupModel> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.outreachType, outreachRecordData.getOutreachType())) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    OutreachGroupModel outreachGroupModel = next2;
                    if (outreachGroupModel != null && (list3 = outreachGroupModel.outreachList) != null) {
                        Iterator<OutreachModel> it4 = list3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            OutreachModel next3 = it4.next();
                            OutreachModel outreachModel2 = next3;
                            if (Intrinsics.LJFF(outreachModel2.key, outreachRecordData.getKey())) {
                                C20648815r4 c20648815r4 = LIZ;
                                List<String> list5 = outreachModel2.triggerIds;
                                String triggerId = outreachRecordData.getTriggerId();
                                c20648815r4.getClass();
                                if (LJIIJ(triggerId, list5)) {
                                    outreachModel = next3;
                                    break;
                                }
                            }
                        }
                        if (outreachModel != null) {
                            return !r6.forbidCount;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(OutreachRecordData outreachRecordData, C20648515r1 c20648515r1) {
        ArrayList<EnumC20654715s1> arrayList;
        ArrayList<EnumC20654715s1> arrayList2;
        EnumC20654715s1 enumC20654715s1LIZ = C20654615s0.LIZ(outreachRecordData.getOutreachType());
        if (enumC20654715s1LIZ == null) {
            return false;
        }
        C20652515rf c20652515rf = c20648515r1.LJFF;
        if (c20652515rf == null || ((arrayList = c20652515rf.LIZ) != null && arrayList.isEmpty())) {
            return true;
        }
        C20652515rf c20652515rf2 = c20648515r1.LJFF;
        if (c20652515rf2 == null || (arrayList2 = c20652515rf2.LIZ) == null || !arrayList2.contains(enumC20654715s1LIZ)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(OutreachRecordData outreachRecordData, C20648515r1 c20648515r1) {
        boolean zLJIIIIZZ;
        Map map;
        List list;
        boolean zLJIIIIZZ2;
        if (!C282010B3n.LIZ()) {
            C20647815qu.LIZ.getClass();
            if (C20647815qu.LIZJ) {
                zLJIIIIZZ2 = LJII(outreachRecordData, c20648515r1);
            } else {
                zLJIIIIZZ2 = LJIIIIZZ(outreachRecordData, c20648515r1);
            }
            boolean zLJI = LJI(outreachRecordData, c20648515r1);
            C20648315qz.LIZ.getClass();
            boolean zLIZIZ = C20648315qz.LIZIZ(outreachRecordData, c20648515r1);
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkRuleMatched, recordData:");
            sbLIZ.append(outreachRecordData);
            sbLIZ.append(", rule:");
            sbLIZ.append(c20648515r1);
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkRuleMatched, outreachInfoResult: ");
            sbLIZ2.append(zLJIIIIZZ2);
            sbLIZ2.append(", timeWindowResult: ");
            sbLIZ2.append(zLIZIZ);
            sbLIZ2.append(", sceneResult: ");
            sbLIZ2.append(zLJI);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (zLJIIIIZZ2 && zLIZIZ && zLJI) {
                return true;
            }
            return false;
        }
        if (!LJI(outreachRecordData, c20648515r1)) {
            C20571715ed c20571715ed2 = C20571715ed.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkRuleMatched, sceneResult: false. recordData:");
            sbLIZ3.append(outreachRecordData);
            sbLIZ3.append(", rule:");
            sbLIZ3.append(c20648515r1);
            C2188811AlT.LIZIZ(sbLIZ3);
            c20571715ed2.getClass();
            return false;
        }
        C20647815qu.LIZ.getClass();
        if (C20647815qu.LIZJ) {
            if (C0BMG.LIZ()) {
                if (c20648515r1.LIZJ != null) {
                    Map<String, ? extends Map<String, ? extends Map<String, ? extends List<OutreachModel>>>> map2 = LIZJ;
                    if (map2 == null) {
                        zLJIIIIZZ = LJII(outreachRecordData, c20648515r1);
                    } else {
                        Iterator<String> it2 = c20648515r1.LIZJ.iterator();
                        while (it2.hasNext()) {
                            Map map3 = (Map) ((HashMap) map2).get(it2.next());
                            Object obj = null;
                            if (map3 != null && (map = (Map) map3.get(outreachRecordData.getOutreachType())) != null && (list = (List) map.get(outreachRecordData.getKey())) != null) {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next = it3.next();
                                    C20648815r4 c20648815r4 = LIZ;
                                    List<String> list2 = ((OutreachModel) next).triggerIds;
                                    String triggerId = outreachRecordData.getTriggerId();
                                    c20648815r4.getClass();
                                    if (LJIIJ(triggerId, list2)) {
                                        obj = next;
                                        break;
                                    }
                                }
                                OutreachModel outreachModel = (OutreachModel) obj;
                                if (outreachModel != null) {
                                    zLJIIIIZZ = !outreachModel.forbidCount;
                                }
                            }
                        }
                    }
                }
                C20571715ed c20571715ed3 = C20571715ed.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("checkRuleMatched, outreachInfoResult: false. recordData:");
                sbLIZ4.append(outreachRecordData);
                sbLIZ4.append(", rule:");
                sbLIZ4.append(c20648515r1);
                C2188811AlT.LIZIZ(sbLIZ4);
                c20571715ed3.getClass();
                return false;
            }
            zLJIIIIZZ = LJII(outreachRecordData, c20648515r1);
        } else {
            zLJIIIIZZ = LJIIIIZZ(outreachRecordData, c20648515r1);
        }
        if (zLJIIIIZZ) {
            C20648315qz.LIZ.getClass();
            boolean zLIZIZ2 = C20648315qz.LIZIZ(outreachRecordData, c20648515r1);
            C20571715ed c20571715ed4 = C20571715ed.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("checkRuleMatched, timeWindowResult: ");
            sbLIZ5.append(zLIZIZ2);
            sbLIZ5.append(", recordData:");
            sbLIZ5.append(outreachRecordData);
            sbLIZ5.append(", rule:");
            sbLIZ5.append(c20648515r1);
            C2188811AlT.LIZIZ(sbLIZ5);
            c20571715ed4.getClass();
            return zLIZIZ2;
        }
        C20571715ed c20571715ed32 = C20571715ed.LIZ;
        StringBuilder sbLIZ42 = C2188811AlT.LIZ();
        sbLIZ42.append("checkRuleMatched, outreachInfoResult: false. recordData:");
        sbLIZ42.append(outreachRecordData);
        sbLIZ42.append(", rule:");
        sbLIZ42.append(c20648515r1);
        C2188811AlT.LIZIZ(sbLIZ42);
        c20571715ed32.getClass();
        return false;
    }

    public static boolean LJIIJ(String str, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        return list.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20648115qx LIZIZ(com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData r14, boolean r15, X.C20651315rT r16) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20648815r4.LIZIZ(com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData, boolean, X.15rT):X.15qx");
    }

    public static C20648115qx LIZJ(OutreachRecordData outreachRecordData, boolean z, boolean z2) {
        C20648115qx c20648115qxLJFF;
        if (((Boolean) C279740Axo.LIZ.getValue()).booleanValue()) {
            return LIZLLL(outreachRecordData, z, z2);
        }
        if (!C282010B3n.LIZ()) {
            synchronized (C20648815r4.class) {
                try {
                    LIZ.getClass();
                    LJIILJJIL();
                    c20648115qxLJFF = LJFF(outreachRecordData, z, z2);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return c20648115qxLJFF;
        }
        if (!z && !z2) {
            C20648315qz.LIZ.getClass();
            if (!(!Intrinsics.LJFF(C20648315qz.LJ(), C20648315qz.LJ))) {
                ReentrantReadWriteLock reentrantReadWriteLock = C2163908dp.LIZ;
                AwS19S0120000_31 awS19S0120000_31 = new AwS19S0120000_31(outreachRecordData, z, z2, 1);
                ReentrantReadWriteLock.ReadLock lock = C2163908dp.LIZ.readLock();
                lock.lock();
                try {
                    Object objInvoke = awS19S0120000_31.invoke();
                    lock.unlock();
                    return (C20648115qx) objInvoke;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = C2163908dp.LIZ;
            return (C20648115qx) C2163908dp.LIZ(new AwS19S0120000_31(outreachRecordData, z, z2, 2));
        }
        ReentrantReadWriteLock reentrantReadWriteLock3 = C2163908dp.LIZ;
        return (C20648115qx) C2163908dp.LIZ(new AwS19S0120000_31(outreachRecordData, z, z2, 0));
    }

    public static C20648115qx LIZLLL(OutreachRecordData outreachRecordData, boolean z, boolean z2) {
        C20648115qx c20648115qxLJ;
        if (!C282010B3n.LIZ()) {
            synchronized (C20648815r4.class) {
                if (!z2) {
                    try {
                        LIZ.getClass();
                        LJIILJJIL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                LIZ.getClass();
                c20648115qxLJ = LJ(outreachRecordData, z, z2);
            }
            return c20648115qxLJ;
        }
        if (!z && !z2) {
            C20648315qz.LIZ.getClass();
            if (!(!Intrinsics.LJFF(C20648315qz.LJ(), C20648315qz.LJ))) {
                ReentrantReadWriteLock reentrantReadWriteLock = C2163908dp.LIZ;
                AwS19S0120000_31 awS19S0120000_31 = new AwS19S0120000_31(outreachRecordData, z, z2, 4);
                ReentrantReadWriteLock.ReadLock lock = C2163908dp.LIZ.readLock();
                lock.lock();
                try {
                    Object objInvoke = awS19S0120000_31.invoke();
                    lock.unlock();
                    return (C20648115qx) objInvoke;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    lock.unlock();
                    throw th2;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = C2163908dp.LIZ;
            return (C20648115qx) C2163908dp.LIZ(new AwS19S0120000_31(outreachRecordData, z, z2, 5));
        }
        ReentrantReadWriteLock reentrantReadWriteLock3 = C2163908dp.LIZ;
        return (C20648115qx) C2163908dp.LIZ(new AwS19S0120000_31(outreachRecordData, z2, z, 3));
    }

    public static C20648115qx LJ(OutreachRecordData outreachRecordData, boolean z, boolean z2) {
        ArrayList<C20648515r1> arrayList;
        boolean z3;
        String strLIZIZ;
        ArrayList<C20648515r1> arrayList2;
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkCanShowInRules, recordData: ");
        sbLIZ.append(outreachRecordData);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        if (z2) {
            return new C20648115qx(5, "no need init quota");
        }
        if (C0B7J.LIZ() && z) {
            C20647815qu.LIZ.getClass();
            if (!C20647815qu.LIZIZ) {
                C20652815ri.LIZ.add(outreachRecordData);
                return new C20648115qx(4, "dispersion has not init");
            }
        }
        C20651315rT c20651315rTLIZIZ = C20649115r7.LIZIZ(outreachRecordData, z2);
        if (c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LIZLLL = true;
        }
        C20647815qu.LIZ.getClass();
        if (!C20647815qu.LIZIZ) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LIZIZ = 1;
            }
            return new C20648115qx(4, "dispersion has not init");
        }
        if (C20647815qu.LIZJ) {
            return LIZIZ(outreachRecordData, z, c20651315rTLIZIZ);
        }
        C20652415re c20652415re = LIZIZ;
        if (c20652415re != null) {
            arrayList = c20652415re.LIZ;
        } else {
            arrayList = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkCanShowInRules, recordData: ");
        sbLIZ2.append(outreachRecordData);
        sbLIZ2.append(", ");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (arrayList != null && !arrayList.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LIZIZ = 2;
                c20651315rTLIZIZ.LJ = 1;
            }
            C20648115qx c20648115qx = new C20648115qx(1, "ruleList is null or empty");
            LJIILIIL(c20648115qx, outreachRecordData, z);
            return c20648115qx;
        }
        C20650015rG c20650015rGLIZ = C20649215r8.LIZ(outreachRecordData.getKey(), outreachRecordData.getTriggerId(), C20654615s0.LIZ(outreachRecordData.getOutreachType()));
        int i = 3;
        if (c20650015rGLIZ == null) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LIZIZ = 3;
                c20651315rTLIZIZ.LJ = 1;
            }
            C20648115qx c20648115qx2 = new C20648115qx(1, "outreach is not in dispersion outreach list");
            LJIILIIL(c20648115qx2, outreachRecordData, z);
            return c20648115qx2;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("checkCanShowInRules, triggerData: ");
        sbLIZ3.append(c20650015rGLIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        ArrayList<C20648515r1> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        boolean zLIZ = true;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                C20648515r1 c20648515r1 = (C20648515r1) ListProtector.get(arrayList, i2);
                if (LJIIIZ(outreachRecordData, c20648515r1)) {
                    arrayList3.add(c20648515r1);
                    C20648315qz.LIZ.getClass();
                    zLIZ = C20648315qz.LIZ(outreachRecordData, c20648515r1);
                    if (zLIZ) {
                        C20571715ed c20571715ed2 = C20571715ed.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("checkCanShowInRules. result: true, ");
                        sbLIZ4.append(c20648515r1.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        c20571715ed2.getClass();
                    } else {
                        C20571715ed c20571715ed3 = C20571715ed.LIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("checkCanShowInRules. result: false, ");
                        sbLIZ5.append(c20648515r1.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        c20571715ed3.getClass();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("match ");
                        sbLIZ6.append(c20648515r1.LIZ);
                        sbLIZ6.append(", can not show");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                        break;
                    }
                }
                i2++;
            } else {
                strLIZIZ = "";
                break;
            }
        }
        if (c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LIZJ = arrayList3;
        }
        if (arrayList3.isEmpty() && c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LIZIZ = 2;
        }
        if (z && zLIZ && !c20650015rGLIZ.LJ) {
            C20648715r3.LIZ.getClass();
            C20648715r3.LJ(outreachRecordData);
            if (C0BMG.LIZ()) {
                C20652415re c20652415re2 = LIZIZ;
                if (c20652415re2 != null) {
                    arrayList2 = c20652415re2.LIZ;
                } else {
                    arrayList2 = null;
                }
                C20648415r0.LIZ(outreachRecordData, arrayList2);
            }
        }
        C20571715ed c20571715ed4 = C20571715ed.LIZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("checkCanShow: ");
        sbLIZ7.append(zLIZ);
        C2188811AlT.LIZIZ(sbLIZ7);
        c20571715ed4.getClass();
        boolean z4 = c20650015rGLIZ.LIZLLL;
        if (z4) {
            i = 2;
            strLIZIZ = "must show outreach";
        } else if (zLIZ) {
            i = 0;
        }
        C20648115qx c20648115qx3 = new C20648115qx(i, strLIZIZ);
        if (!zLIZ && !z4) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LJ = 2;
            }
        } else if (c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LJ = 1;
        }
        c20648115qx3.LIZJ = arrayList3;
        LJIILIIL(c20648115qx3, outreachRecordData, z);
        return c20648115qx3;
    }

    public static C20648115qx LJFF(OutreachRecordData outreachRecordData, boolean z, boolean z2) {
        ArrayList<C20648515r1> arrayList;
        int i;
        if (C0B7J.LIZ() && z && !z2) {
            C20647815qu.LIZ.getClass();
            if (!C20647815qu.LIZIZ && C0B7J.LIZ()) {
                C20652815ri.LIZ.add(outreachRecordData);
                return new C20648115qx(4, "dispersion has not init");
            }
        }
        C20651315rT c20651315rTLIZIZ = C20649115r7.LIZIZ(outreachRecordData, z2);
        if (c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LIZLLL = true;
        }
        if (!z2) {
            C20647815qu.LIZ.getClass();
            if (!C20647815qu.LIZIZ) {
                if (c20651315rTLIZIZ != null) {
                    c20651315rTLIZIZ.LIZIZ = 1;
                }
                return new C20648115qx(4, "dispersion has not init");
            }
        }
        C20647815qu.LIZ.getClass();
        if (C20647815qu.LIZJ) {
            if (z2) {
                return new C20648115qx(5, "no need init quota");
            }
            return LIZIZ(outreachRecordData, z, c20651315rTLIZIZ);
        }
        C20652415re c20652415re = LIZIZ;
        C20648515r1 c20648515r1 = null;
        if (c20652415re != null) {
            arrayList = c20652415re.LIZ;
        } else {
            arrayList = null;
        }
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkCanShowInRules, recordData: ");
        sbLIZ.append(outreachRecordData);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        if ((arrayList == null || arrayList.isEmpty()) && 1 != 0) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LIZIZ = 2;
                c20651315rTLIZIZ.LJ = 1;
            }
            C20648115qx c20648115qx = new C20648115qx(1, "ruleList is null or empty");
            LJIILIIL(c20648115qx, outreachRecordData, z);
            return c20648115qx;
        }
        C20650015rG c20650015rGLIZ = C20649215r8.LIZ(outreachRecordData.getKey(), outreachRecordData.getTriggerId(), C20654615s0.LIZ(outreachRecordData.getOutreachType()));
        if (c20650015rGLIZ == null) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LIZIZ = 3;
                c20651315rTLIZIZ.LJ = 1;
            }
            C20648115qx c20648115qx2 = new C20648115qx(1, "outreach is not in dispersion outreach list");
            LJIILIIL(c20648115qx2, outreachRecordData, z);
            return c20648115qx2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkCanShowInRules, triggerData: ");
        sbLIZ2.append(c20650015rGLIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        ArrayList<C20648515r1> arrayList2 = new ArrayList();
        ArrayList<C20648515r1> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        String string = "";
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            C20648515r1 c20648515r12 = (C20648515r1) ListProtector.get(arrayList, i2);
            AbstractC20652915rj abstractC20652915rj = c20648515r12.LJ;
            if ((!z2 || !(abstractC20652915rj instanceof C20651115rR)) && LJIIIZ(outreachRecordData, c20648515r12)) {
                AbstractC20652915rj abstractC20652915rj2 = c20648515r12.LJ;
                if (!z2 && (abstractC20652915rj2 instanceof C20651115rR)) {
                    C20648315qz c20648315qz = C20648315qz.LIZ;
                    int i3 = ((C20651115rR) abstractC20652915rj2).LIZIZ;
                    c20648315qz.getClass();
                    C20648315qz.LJIIL(i3, c20648515r12, z2);
                }
                arrayList2.add(c20648515r12);
                if (c20648515r12.LJII > 0) {
                    C20571715ed c20571715ed2 = C20571715ed.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("checkCanShowInRules: true, ");
                    sbLIZ3.append(c20648515r12.LIZ);
                    sbLIZ3.append(", current quota: ");
                    sbLIZ3.append(c20648515r12.LJII);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    c20571715ed2.getClass();
                } else {
                    C20571715ed c20571715ed3 = C20571715ed.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("checkCanShowInRules: false, ");
                    sbLIZ4.append(c20648515r12.LIZ);
                    sbLIZ4.append(", current quota: ");
                    sbLIZ4.append(c20648515r12.LJII);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c20571715ed3.getClass();
                    if (c20648515r1 == null) {
                        c20648515r1 = c20648515r12;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("match ");
                    sbLIZ5.append(c20648515r12.LIZ);
                    sbLIZ5.append(", current quota: ");
                    sbLIZ5.append(c20648515r12.LJII);
                    sbLIZ5.append(", can not show");
                    string = C2188811AlT.LIZIZ(sbLIZ5);
                    if (z && (!c20650015rGLIZ.LIZLLL || c20650015rGLIZ.LJ)) {
                        z3 = false;
                        break;
                    }
                    z3 = false;
                }
            }
        }
        if (c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LIZJ = arrayList2;
        }
        if (arrayList2.isEmpty() && c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LIZIZ = 2;
        }
        if (c20650015rGLIZ.LIZLLL) {
            if (!c20650015rGLIZ.LJ) {
                if (z) {
                    C20648715r3.LIZ.getClass();
                    C20648715r3.LJ(outreachRecordData);
                }
                for (C20648515r1 c20648515r13 : arrayList2) {
                    int i4 = c20648515r13.LJII;
                    if (i4 > 0) {
                        c20648515r13.LJII = i4 - 1;
                        c20648515r13.LJIIIIZZ.add(outreachRecordData);
                        arrayList3.add(c20648515r13);
                    }
                }
                outreachRecordData.setUpdateQuotaRuleList(arrayList3);
            }
            StringBuffer stringBuffer = new StringBuffer("must show outreach, ");
            for (C20648515r1 c20648515r14 : arrayList2) {
                C20571715ed c20571715ed4 = C20571715ed.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(c20648515r14.LIZ);
                sbLIZ6.append(" left quota: ");
                sbLIZ6.append(c20648515r14.LJII);
                C2188811AlT.LIZIZ(sbLIZ6);
                c20571715ed4.getClass();
                stringBuffer.append("update rule quota:");
                stringBuffer.append(c20648515r14.LIZ);
                stringBuffer.append(", left quota:");
                stringBuffer.append(c20648515r14.LJII);
                stringBuffer.append(" | ");
            }
            C20648115qx c20648115qx3 = new C20648115qx(2, stringBuffer.toString());
            LJIILIIL(c20648115qx3, outreachRecordData, z);
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LJ = 1;
            }
            return c20648115qx3;
        }
        if (z3 || !z) {
            StringBuffer stringBuffer2 = new StringBuffer("can show outreach, ");
            for (C20648515r1 c20648515r15 : arrayList2) {
                int i5 = c20648515r15.LJII;
                if (i5 > 0) {
                    if (!c20650015rGLIZ.LJ) {
                        c20648515r15.LJII = i5 - 1;
                        c20648515r15.LJIIIIZZ.add(outreachRecordData);
                        arrayList3.add(c20648515r15);
                        stringBuffer2.append("update rule:");
                        stringBuffer2.append(c20648515r15.LIZ);
                        stringBuffer2.append(", left quota:");
                        stringBuffer2.append(c20648515r15.LJII);
                        stringBuffer2.append(" | ");
                    } else {
                        stringBuffer2.append("forbid count, don't update rule:");
                        stringBuffer2.append(c20648515r15.LIZ);
                        stringBuffer2.append(", left quota:");
                        stringBuffer2.append(c20648515r15.LJII);
                        stringBuffer2.append(" | ");
                    }
                }
            }
            outreachRecordData.setUpdateQuotaRuleList(arrayList3);
            string = stringBuffer2.toString();
            if (z && z3 && !c20650015rGLIZ.LJ) {
                C20648715r3.LIZ.getClass();
                C20648715r3.LJ(outreachRecordData);
            }
        }
        C20571715ed.LIZ.getClass();
        for (C20648515r1 c20648515r16 : arrayList) {
            C20571715ed.LIZ.getClass();
        }
        if (z3) {
            i = 0;
        } else {
            i = 3;
        }
        C20648115qx c20648115qx4 = new C20648115qx(i, string);
        if (z3) {
            if (c20651315rTLIZIZ != null) {
                c20651315rTLIZIZ.LJ = 1;
            }
        } else if (c20651315rTLIZIZ != null) {
            c20651315rTLIZIZ.LJ = 2;
        }
        LJIILIIL(c20648115qx4, outreachRecordData, z);
        outreachRecordData.setDispersalRule(c20648515r1);
        return c20648115qx4;
    }

    public static void LJIIJJI(C20648515r1 c20648515r1, RuleModel ruleModel, List list) {
        TimeWindow timeWindow = ruleModel.timeWindow;
        if (timeWindow == null) {
            C20571715ed.LIZ.getClass();
        } else {
            Integer num = timeWindow.size;
            if (num != null && num.intValue() >= 0) {
                if (Intrinsics.LJFF(timeWindow.type, "calendar_day")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(ruleModel.ruleId);
                    sbLIZ.append('_');
                    sbLIZ.append(EnumC1780960wRi.TIME_WINDOW_CALENDAR_DAY.getTypeName());
                    c20648515r1.LJ = new C20651015rQ(C2188811AlT.LIZIZ(sbLIZ), num.intValue());
                } else if (Intrinsics.LJFF(timeWindow.type, "active_day")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(ruleModel.ruleId);
                    sbLIZ2.append('_');
                    sbLIZ2.append(EnumC1780960wRi.TIME_WINDOW_ACTIVE_DAY.getTypeName());
                    c20648515r1.LJ = new C20650915rP(C2188811AlT.LIZIZ(sbLIZ2), num.intValue());
                } else if (Intrinsics.LJFF(timeWindow.type, "session")) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(ruleModel.ruleId);
                    sbLIZ3.append('_');
                    sbLIZ3.append(EnumC1780960wRi.TIME_WINDOW_SESSION.getTypeName());
                    c20648515r1.LJ = new C20651215rS(C2188811AlT.LIZIZ(sbLIZ3), num.intValue());
                } else if (Intrinsics.LJFF(timeWindow.type, "second")) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(ruleModel.ruleId);
                    sbLIZ4.append('_');
                    sbLIZ4.append(EnumC1780960wRi.TIME_WINDOW_SECOND.getTypeName());
                    c20648515r1.LJ = new C20651115rR(C2188811AlT.LIZIZ(sbLIZ4), num.intValue());
                } else {
                    C20571715ed c20571715ed = C20571715ed.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("init timeWindow error, type is ");
                    sbLIZ5.append(timeWindow.type);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    c20571715ed.getClass();
                    C20571715ed.LIZ(strLIZIZ);
                }
            } else {
                C20571715ed.LIZ.getClass();
                C20571715ed.LIZ("init timeWindow, size is null");
            }
        }
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(c20648515r1.LIZ);
            sbLIZ6.append('_');
            sbLIZ6.append(EnumC1780960wRi.OUTREACH_TYPE.getTypeName());
            C2188811AlT.LIZIZ(sbLIZ6);
            C20652515rf c20652515rf = new C20652515rf(0);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                EnumC20654715s1 enumC20654715s1LIZ = C20654615s0.LIZ(str);
                if (enumC20654715s1LIZ == null) {
                    C20571715ed c20571715ed2 = C20571715ed.LIZ;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("initOutreachTypeForRule getOutreachType error, ");
                    sbLIZ7.append(str);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                    c20571715ed2.getClass();
                    C20571715ed.LIZ(strLIZIZ2);
                } else {
                    c20652515rf.LIZ.add(enumC20654715s1LIZ);
                }
            }
            c20648515r1.LJFF = c20652515rf;
        } else {
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("initOutreachTypeForRule error, list is null");
        }
        Integer num2 = ruleModel.limit;
        if (num2 == null || num2.intValue() < 0) {
            num2 = 0;
        }
        c20648515r1.LJII = num2.intValue();
        c20648515r1.LJI = num2.intValue();
    }

    public static void LJIILIIL(C20648115qx c20648115qx, OutreachRecordData outreachRecordData, boolean z) {
        if (z) {
            outreachRecordData.setShowResult(c20648115qx.LIZ());
            outreachRecordData.setResultInfo(c20648115qx.LIZIZ);
            C20648715r3.LIZ.getClass();
            ListProtector.add(C20648715r3.LJII, 0, outreachRecordData);
        }
    }
}
