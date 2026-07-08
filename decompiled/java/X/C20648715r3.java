package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachSyncConfigModel;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15r3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20648715r3 {
    public static boolean LJ;
    public static boolean LJFF;
    public static OutreachRecordConfig LJI;
    public static final C20648715r3 LIZ = new C20648715r3();
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C20652715rh());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C20650715rN());
    public static final ArrayList<OutreachRecordData> LJII = new ArrayList<>();

    public static Keva LIZIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZLLL() {
        List<OutreachRecordData> outreachRecordList;
        ArrayList<C20648515r1> arrayList;
        Long showTimeMiles;
        OutreachRecordConfig outreachRecordConfig = LJI;
        if (outreachRecordConfig == null || (outreachRecordList = outreachRecordConfig.getOutreachRecordList()) == null) {
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("initRecord fail, recordList is null");
            return;
        }
        for (OutreachRecordData outreachRecordData : outreachRecordList) {
            if (outreachRecordData != null) {
                C20648815r4.LIZ.getClass();
                C20648115qx c20648115qxLIZJ = C20648815r4.LIZJ(outreachRecordData, false, true);
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateRuleQuota, result: ");
                sbLIZ.append(c20648115qxLIZJ.LIZ);
                sbLIZ.append(", ");
                sbLIZ.append(c20648115qxLIZJ.LIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571715ed.getClass();
                C20571715ed.LIZ(strLIZIZ);
                C20649015r6.LIZ.getClass();
                C20649415rA.LIZ.getClass();
                if (C20649415rA.LIZ() && C20649415rA.LIZJ(outreachRecordData.getKey(), outreachRecordData.getOutreachType()) && (showTimeMiles = outreachRecordData.getShowTimeMiles()) != null && showTimeMiles.longValue() > C20649415rA.LIZIZ()) {
                    C20649315r9.LIZ.getClass();
                    if (!C866950Xzh.LIZIZ(C20649315r9.LIZJ) || !C20649315r9.LIZJ.contains(outreachRecordData)) {
                        EnumC20650315rJ enumC20650315rJ = EnumC20650315rJ.SYNCED;
                        C20649315r9.LIZ(enumC20650315rJ).add(outreachRecordData);
                        C20649315r9.LIZJ(enumC20650315rJ);
                    }
                }
            }
        }
        if (!((Boolean) C279740Axo.LIZ.getValue()).booleanValue()) {
            C20648815r4.LIZ.getClass();
            C20652415re c20652415re = C20648815r4.LIZIZ;
            if (c20652415re != null && (arrayList = c20652415re.LIZ) != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C20648515r1 c20648515r1 = (C20648515r1) ListProtector.get(arrayList, i);
                    AbstractC20652915rj abstractC20652915rj = c20648515r1.LJ;
                    if (abstractC20652915rj instanceof C20651115rR) {
                        C20648315qz c20648315qz = C20648315qz.LIZ;
                        int i2 = ((C20651115rR) abstractC20652915rj).LIZIZ;
                        c20648315qz.getClass();
                        C20648315qz.LJIIL(i2, c20648515r1, true);
                    }
                }
            }
        }
        if (C0BMG.LIZ()) {
            C20648815r4.LIZ.getClass();
            C20652415re c20652415re2 = C20648815r4.LIZIZ;
            ArrayList<C20648515r1> arrayList2 = c20652415re2 != null ? c20652415re2.LIZ : null;
            C20648415r0.LIZ.clear();
            C20648415r0.LIZIZ.clear();
            if (arrayList2 == null || arrayList2.isEmpty() || outreachRecordList.isEmpty()) {
                return;
            }
            for (C20648515r1 c20648515r12 : arrayList2) {
                if (!(c20648515r12.LJ instanceof C20651115rR)) {
                    String str = c20648515r12.LIZ;
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (OutreachRecordData outreachRecordData2 : outreachRecordList) {
                        C20648815r4.LIZ.getClass();
                        if (C20648815r4.LJIIIZ(outreachRecordData2, c20648515r12)) {
                            i3++;
                            arrayList3.add(outreachRecordData2);
                        }
                    }
                    C20648415r0.LIZ.put(str, Integer.valueOf(i3));
                    C20648415r0.LIZIZ.put(str, arrayList3);
                }
            }
            C20571715ed c20571715ed2 = C20571715ed.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("RuleQuotaManager.buildQuotaCache done, rules=");
            sbLIZ2.append(C20648415r0.LIZ.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            c20571715ed2.getClass();
        }
    }

    public static void LJ(OutreachRecordData outreachRecordData) {
        OutreachRecordConfig outreachRecordConfig = LJI;
        if (outreachRecordConfig == null) {
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("recordOutreachData, config is null");
            return;
        }
        outreachRecordConfig.addRecord(outreachRecordData);
        C20649015r6.LIZ.getClass();
        if (C282000B3m.LIZ()) {
            C20649415rA c20649415rA = C20649415rA.LIZ;
            String key = outreachRecordData.getKey();
            String outreachType = outreachRecordData.getOutreachType();
            c20649415rA.getClass();
            if (C20649415rA.LIZJ(key, outreachType)) {
                C20649315r9 c20649315r9 = C20649315r9.LIZ;
                EnumC20650315rJ enumC20650315rJ = EnumC20650315rJ.UN_SYNCED;
                c20649315r9.getClass();
                C20649315r9.LIZ(enumC20650315rJ).add(outreachRecordData);
                C20649315r9.LIZJ(enumC20650315rJ);
                EnumC1779290wP1 enumC1779290wP1 = EnumC1779290wP1.INCREMENTAL_SYNC;
                C20649415rA.LIZ.getClass();
                C20649015r6.LIZIZ(enumC1779290wP1, ((OutreachSyncConfigModel) C20649415rA.LIZLLL.getValue()).retryTimes);
                C20571715ed.LIZ.getClass();
            } else {
                C20571715ed.LIZ.getClass();
            }
        }
        if (C279730Axn.LIZ()) {
            ((Number) LIZLLL.getValue()).longValue();
        }
    }

    public static void LJFF(OutreachRecordData outreachRecordData) {
        List<OutreachRecordData> outreachRecordList;
        OutreachRecordConfig outreachRecordConfig = LJI;
        if (outreachRecordConfig != null && (outreachRecordList = outreachRecordConfig.getOutreachRecordList()) != null && !outreachRecordList.isEmpty()) {
            synchronized (C20648815r4.class) {
                try {
                    outreachRecordList.remove(outreachRecordData);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C823050WQl.LJFF().submit(new ARunnableS112S0100000_12(outreachRecordData, 482));
            return;
        }
        C20571715ed.LIZ.getClass();
        C20571715ed.LIZ("removeRecord, recordList is null or empty");
    }

    public static boolean LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashSet<String> hashSet = LIZIZ;
        if (hashSet.contains(strLIZIZ)) {
            return false;
        }
        hashSet.add(strLIZIZ);
        return true;
    }

    public static OutreachRecordData LIZJ(String str, String str2) {
        List<OutreachRecordData> outreachRecordList;
        try {
            OutreachRecordConfig outreachRecordConfig = LJI;
            if (outreachRecordConfig != null && (outreachRecordList = outreachRecordConfig.getOutreachRecordList()) != null && !outreachRecordList.isEmpty()) {
                synchronized (C20648815r4.class) {
                    try {
                        for (OutreachRecordData outreachRecordData : outreachRecordList) {
                            if (Intrinsics.LJFF(str, outreachRecordData.getKey()) && Intrinsics.LJFF(str2, outreachRecordData.getTriggerId())) {
                                return outreachRecordData;
                            }
                        }
                        C20571715ed.LIZ.getClass();
                        C20571715ed.LIZ("has no popup record");
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("removeRecord, recordList is null or empty");
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeRecord exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
            return null;
        }
    }

    public static void LJI(OutreachRecordData outreachRecordData, boolean z) {
        List<OutreachRecordData> outreachRecordList;
        OutreachRecordConfig outreachRecordConfig = LJI;
        if (outreachRecordConfig != null && (outreachRecordList = outreachRecordConfig.getOutreachRecordList()) != null) {
            C19719612Di.LJJIIJ(outreachRecordList, AFwS276S0000000_31.get$arr$(360), true);
        }
        LIZIZ().storeString("outreach_record_cache", GsonProtectorUtils.toJson(C09C2.LIZ(), LJI));
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordOutreachData: ");
        sbLIZ.append(outreachRecordData);
        sbLIZ.append(", isRemove: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
    }
}
