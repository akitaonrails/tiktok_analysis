package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachGroupModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15r8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20649215r8 {
    public static volatile boolean LIZ;
    public static HashMap<EnumC20654715s1, HashMap<String, C20650615rM>> LIZIZ;

    public static C20650015rG LIZ(String str, String str2, EnumC20654715s1 enumC20654715s1) {
        String typeName;
        HashMap<EnumC20654715s1, HashMap<String, C20650615rM>> map;
        HashMap<String, C20650615rM> map2;
        C20650615rM c20650615rM;
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getOutreachTriggerData, key: ");
        sbLIZ.append(str);
        sbLIZ.append(", triggerId: ");
        sbLIZ.append(str2);
        sbLIZ.append(", outreachType: ");
        if (enumC20654715s1 != null) {
            typeName = enumC20654715s1.getTypeName();
        } else {
            typeName = null;
        }
        sbLIZ.append(typeName);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        if (enumC20654715s1 == null || !LIZ || (map = LIZIZ) == null || (map2 = map.get(enumC20654715s1)) == null || (c20650615rM = map2.get(str)) == null) {
            return null;
        }
        if (str2 != null && str2.length() != 0) {
            List<C20650015rG> list = c20650615rM.LIZIZ.get(str2);
            if (list != null && !list.isEmpty()) {
                return (C20650015rG) ListProtector.get(list, 0);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getOutreachTriggerData, triggerData is null, triggerId: ");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (c20650615rM.LIZ().isEmpty()) {
                return null;
            }
            return (C20650015rG) ListProtector.get(c20650615rM.LIZ(), 0);
        }
        if (c20650615rM.LIZ().isEmpty()) {
            return null;
        }
        return (C20650015rG) ListProtector.get(c20650615rM.LIZ(), 0);
    }

    public static void LIZIZ(String str, HashMap map, List list) {
        List<C20650015rG> list2;
        List<C20650015rG> list3;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                OutreachGroupModel outreachGroupModel = (OutreachGroupModel) it2.next();
                String str2 = outreachGroupModel.outreachType;
                EnumC20654715s1 enumC20654715s1LIZ = C20654615s0.LIZ(str2);
                if (C123100dR.LIZ(str2) && enumC20654715s1LIZ != null) {
                    Object map2 = map.get(enumC20654715s1LIZ);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(enumC20654715s1LIZ, map2);
                    }
                    List<OutreachModel> list4 = outreachGroupModel.outreachList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (OutreachModel outreachModel : list4) {
                            String str3 = outreachModel.key;
                            if (C123100dR.LIZ(str3)) {
                                C20650615rM c20650615rM = (C20650615rM) ((HashMap) map2).get(str3);
                                if (c20650615rM == null) {
                                    String str4 = outreachModel.key;
                                    if (str4 != null && str4.length() != 0) {
                                        c20650615rM = new C20650615rM(str4);
                                        List<String> list5 = outreachModel.triggerIds;
                                        if (list5 != null && !list5.isEmpty()) {
                                            Iterator<String> it3 = outreachModel.triggerIds.iterator();
                                            while (it3.hasNext()) {
                                                C20650115rH.LIZ(outreachModel, c20650615rM, str4, enumC20654715s1LIZ, it3.next(), str);
                                            }
                                        } else {
                                            List<C20650015rG> listLIZ = c20650615rM.LIZ();
                                            C20650015rG c20650015rG = new C20650015rG(str4, enumC20654715s1LIZ, "", outreachModel.mustShow, outreachModel.forbidCount);
                                            C20648815r4.LIZ.getClass();
                                            C20648815r4.LIZ(str, c20650015rG);
                                            listLIZ.add(c20650015rG);
                                        }
                                    }
                                } else if (!Intrinsics.LJFF(outreachModel.key, c20650615rM.LIZ)) {
                                    C20571715ed.LIZ.getClass();
                                } else {
                                    List<String> list6 = outreachModel.triggerIds;
                                    if (list6 == null) {
                                        C20647815qu.LIZ.getClass();
                                        if (!C20647815qu.LIZJ && (!c20650615rM.LIZ().isEmpty())) {
                                            ListProtector.remove(c20650615rM.LIZ(), 0);
                                        }
                                        String str5 = outreachModel.key;
                                        List<C20650015rG> listLIZ2 = c20650615rM.LIZ();
                                        C20650015rG c20650015rG2 = new C20650015rG(str5, enumC20654715s1LIZ, "", outreachModel.mustShow, outreachModel.forbidCount);
                                        C20648815r4.LIZ.getClass();
                                        C20648815r4.LIZ(str, c20650015rG2);
                                        listLIZ2.add(c20650015rG2);
                                    } else {
                                        int i = 0;
                                        for (String str6 : list6) {
                                            C20647815qu.LIZ.getClass();
                                            if (!C20647815qu.LIZJ && (list2 = c20650615rM.LIZIZ.get(str6)) != null && (!list2.isEmpty()) && (list3 = c20650615rM.LIZIZ.get(str6)) != null) {
                                                ListProtector.remove(list3, i);
                                            }
                                            C20650115rH.LIZ(outreachModel, c20650615rM, outreachModel.key, enumC20654715s1LIZ, str6, str);
                                            i = 0;
                                        }
                                    }
                                }
                                ((Map) map2).put(str3, c20650615rM);
                            }
                        }
                    }
                } else {
                    C20571715ed c20571715ed = C20571715ed.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("outreachType is null, outreachTypeStr: ");
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c20571715ed.getClass();
                }
            }
        }
    }
}
