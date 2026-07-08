package X;

import Y.ARunnableS29S0201000_23;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.geckox.model.CleanPolicyModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551200qT8 {
    public static List LIZIZ(File file, Map map) {
        CleanPolicyModel cleanPolicyModel;
        List<CleanPolicyModel.ChannelCleanPolicy> list;
        long j;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            C0VSJ c0vsj = new C0VSJ(file, str);
            if (c0vsj.isDirectory() && (cleanPolicyModel = (CleanPolicyModel) entry.getValue()) != null && (list = cleanPolicyModel.specifiedClean) != null && !list.isEmpty()) {
                for (CleanPolicyModel.ChannelCleanPolicy channelCleanPolicy : cleanPolicyModel.specifiedClean) {
                    String str2 = channelCleanPolicy.channel;
                    int i = channelCleanPolicy.cleanType;
                    List<Long> list2 = channelCleanPolicy.versions;
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, str2);
                    C1550730qSN.LIZ.getClass();
                    C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, str2);
                    if (c1550720qSMLIZIZ != null) {
                        j = CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL);
                    } else {
                        j = 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                C0VSJ c0vsj3 = new C0VSJ(c0vsj, str2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str2);
                                sbLIZ.append("--pending-delete");
                                C0VSJ c0vsj4 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
                                c0vsj3.renameTo(c0vsj4);
                                arrayList.add(new C1551220qTA(str, str2, 3, 0L, c0vsj4));
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(str2);
                                C1550730qSN.LIZ(str, arrayList2);
                                C1551330qTL.LIZ.getClass();
                                SharedPreferences sharedPreferencesLJI = C1551330qTL.LJI(str);
                                if (sharedPreferencesLJI != null) {
                                    sharedPreferencesLJI.edit().remove(str2).apply();
                                }
                            }
                        } else if (list2 != null) {
                            List<C1550640qSE> listLIZIZ = C1550600qSA.LIZIZ(c0vsj2);
                            if (!listLIZIZ.isEmpty()) {
                                for (C1550640qSE c1550640qSE : listLIZIZ) {
                                    long j2 = c1550640qSE.LIZ;
                                    if (((Long) ListProtector.get(list2, 0)).longValue() > j2) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(j2);
                                        sbLIZ2.append("--pending-delete");
                                        C0VSJ c0vsj5 = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ2));
                                        if (c1550640qSE.LIZIZ) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append(j2);
                                            sbLIZ3.append("--compress");
                                            new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ3)).renameTo(c0vsj5);
                                        } else {
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(j2);
                                            sbLIZ4.append("");
                                            new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ4)).renameTo(c0vsj5);
                                        }
                                        arrayList.add(new C1551220qTA(str, str2, 2, j2, c0vsj5));
                                    }
                                }
                                if (((Long) ListProtector.get(list2, 0)).longValue() > j) {
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(str2);
                                    C1550730qSN.LIZ.getClass();
                                    C1550730qSN.LIZ(str, arrayList3);
                                }
                            }
                        }
                    } else if (list2 != null) {
                        List<C1550640qSE> listLIZIZ2 = C1550600qSA.LIZIZ(c0vsj2);
                        if (!listLIZIZ2.isEmpty()) {
                            for (C1550640qSE c1550640qSE2 : listLIZIZ2) {
                                long j3 = c1550640qSE2.LIZ;
                                if (list2.contains(Long.valueOf(j3))) {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(j3);
                                    sbLIZ5.append("--pending-delete");
                                    C0VSJ c0vsj6 = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ5));
                                    if (c1550640qSE2.LIZIZ) {
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append(j3);
                                        sbLIZ6.append("--compress");
                                        new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ6)).renameTo(c0vsj6);
                                        if (j3 == j) {
                                            ArrayList arrayList4 = new ArrayList();
                                            arrayList4.add(str2);
                                            C1550730qSN.LIZ.getClass();
                                            C1550730qSN.LIZ(str, arrayList4);
                                        }
                                    } else {
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append(j3);
                                        sbLIZ7.append("");
                                        new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ7)).renameTo(c0vsj6);
                                    }
                                    arrayList.add(new C1551220qTA(str, str2, 1, j3, c0vsj6));
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(int i, List<C1551220qTA> list, AbstractC1552040qUU abstractC1552040qUU) {
        int i2;
        if (list != null && !list.isEmpty()) {
            HashMap map = new HashMap();
            for (C1551220qTA c1551220qTA : list) {
                File file = c1551220qTA.LJ;
                long jUptimeMillis = SystemClock.uptimeMillis();
                boolean zLJ = C0X9F.LJ(file);
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                if (zLJ) {
                    if (abstractC1552040qUU != null) {
                        abstractC1552040qUU.LIZ(c1551220qTA.LIZIZ);
                    }
                    List arrayList = (List) map.get(c1551220qTA.LIZ);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(c1551220qTA.LIZ, arrayList);
                    }
                    arrayList.add(c1551220qTA.LIZIZ);
                    i2 = 200;
                } else {
                    i2 = 201;
                }
                C1551780qU4.LJFF(new C1551210qT9(c1551220qTA.LIZJ, i2, i, c1551220qTA.LIZLLL, jUptimeMillis2 - jUptimeMillis, c1551220qTA.LIZ, c1551220qTA.LIZIZ));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                C1550730qSN.LIZ.getClass();
                C1550730qSN.LIZ(str, list2);
            }
        }
    }

    public static void LIZ(int i, Map<String, CleanPolicyModel> map, File file, AbstractC1552040qUU abstractC1552040qUU) {
        if (map != null && !map.isEmpty()) {
            try {
                List listLIZIZ = LIZIZ(file, map);
                if (listLIZIZ != null) {
                    ExecutorC1550590qS9.LIZ().execute(new ARunnableS29S0201000_23(i, listLIZIZ, abstractC1552040qUU, 7));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
