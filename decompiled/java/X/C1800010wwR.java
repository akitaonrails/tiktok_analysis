package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0wwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800010wwR {
    public static final C1800010wwR LIZ = new C1800010wwR();
    public static final Keva LIZIZ = KevaImpl.getRepo("minis_revisit_mission", 1);
    public static final C1799890wwF LIZJ = C1799890wwF.LIZ;
    public static final Object LIZLLL = new Object();

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_entry_shown:");
        sbLIZ.append(EnumC1799930wwJ.ADD_TO_HOME_SCREEN.getConfigKey());
        sbLIZ.append(':');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.EnumC1799930wwJ r14, java.lang.String r15) {
        /*
            X.0wwJ r0 = X.EnumC1799930wwJ.ADD_TO_HOME_SCREEN
            r7 = 1
            if (r14 == r0) goto L6
            return r7
        L6:
            r9 = 0
            if (r15 == 0) goto L87
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r15)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L87
            int r0 = r1.length()
            if (r0 <= 0) goto L87
            com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings$MinisTtmgConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawRevisitMissionConfig r8 = r0.revisitMission
            if (r8 != 0) goto L2a
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawRevisitMissionConfig r8 = new com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawRevisitMissionConfig
            r10 = 0
            r11 = r10
            r12 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13)
        L2a:
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawAddToHomeMissionConfig r8 = r8.missionAddToHomeScreen
            if (r8 != 0) goto L3a
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawAddToHomeMissionConfig r8 = new com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawAddToHomeMissionConfig
            r10 = 0
            r14 = 31
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L3a:
            java.lang.Integer r0 = r8.bannerShowCount
            r6 = 2
            if (r0 == 0) goto L49
            int r0 = r0.intValue()
            if (r0 < 0) goto L4b
        L45:
            r6 = r0
            if (r0 > 0) goto L4b
            return r9
        L49:
            r0 = 2
            goto L45
        L4b:
            X.0wwF r0 = X.C1800010wwR.LIZJ
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r5 = X.C1800010wwR.LIZLLL
            monitor-enter(r5)
            X.0wwR r0 = X.C1800010wwR.LIZ     // Catch: java.lang.Throwable -> L81
            r0.getClass()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = LIZLLL(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r1 = r8.coolDownDays     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L7b
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L81
            if (r0 <= 0) goto L7b
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L81
        L6e:
            java.util.List r0 = LIZIZ(r0, r2, r4)     // Catch: java.lang.Throwable -> L81
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L81
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L81
            if (r0 < r6) goto L7f
            goto L7e
        L7b:
            r0 = 14
            goto L6e
        L7e:
            r7 = 0
        L7f:
            monitor-exit(r5)
            return r7
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)
            throw r0
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1800010wwR.LIZ(X.0wwJ, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.EnumC1799930wwJ r13, java.lang.String r14) {
        /*
            X.0wwJ r0 = X.EnumC1799930wwJ.ADD_TO_HOME_SCREEN
            if (r13 == r0) goto L5
            return
        L5:
            if (r14 == 0) goto L91
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r14)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L91
            int r0 = r1.length()
            if (r0 <= 0) goto L91
            com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings$MinisTtmgConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawRevisitMissionConfig r2 = r0.revisitMission
            if (r2 != 0) goto L29
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawRevisitMissionConfig r2 = new com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawRevisitMissionConfig
            r4 = 0
            r3 = 0
            r5 = r4
            r6 = r4
            r7 = r4
            r2.<init>(r3, r4, r5, r6, r7)
        L29:
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawAddToHomeMissionConfig r7 = r2.missionAddToHomeScreen
            if (r7 != 0) goto L3a
            com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawAddToHomeMissionConfig r7 = new com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings$RawAddToHomeMissionConfig
            r8 = 0
            r9 = 0
            r13 = 31
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L3a:
            java.lang.Integer r0 = r7.bannerShowCount
            r6 = 2
            if (r0 == 0) goto L49
            int r0 = r0.intValue()
            if (r0 < 0) goto L4b
        L45:
            r6 = r0
            if (r0 > 0) goto L4b
            return
        L49:
            r0 = 2
            goto L45
        L4b:
            X.0wwF r0 = X.C1800010wwR.LIZJ
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r5 = X.C1800010wwR.LIZLLL
            monitor-enter(r5)
            X.0wwR r0 = X.C1800010wwR.LIZ     // Catch: java.lang.Throwable -> L8b
            r0.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = LIZLLL(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r1 = r7.coolDownDays     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L86
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L8b
            if (r0 <= 0) goto L86
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L8b
        L6e:
            java.util.List r0 = LIZIZ(r0, r2, r4)     // Catch: java.lang.Throwable -> L8b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L8b
            r1.add(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.List r0 = X.C13LP.LLD(r6, r1)     // Catch: java.lang.Throwable -> L8b
            LJ(r4, r0)     // Catch: java.lang.Throwable -> L8b
            goto L89
        L86:
            r0 = 14
            goto L6e
        L89:
            monitor-exit(r5)
            return
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r5)
            throw r0
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1800010wwR.LIZJ(X.0wwJ, java.lang.String):void");
    }

    public static void LJ(String str, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((Number) it2.next()).longValue());
        }
        LIZIZ.storeString(str, jSONArray.toString());
    }

    public static List LIZIZ(int i, long j, String str) {
        Object obj;
        List list;
        boolean z;
        long millis = j - TimeUnit.DAYS.toMillis(i);
        String str2 = "";
        String string = LIZIZ.getString(str, "");
        if (string != null) {
            str2 = string;
        }
        if (a0.LJJJIL(str2)) {
            list = C13BV.INSTANCE;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    long jOptLong = jSONArray.optLong(i2, 0L);
                    if (jOptLong > 0) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
                C189200o6.m2constructorimpl(arrayList);
                obj = arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            C13BV c13bv = C13BV.INSTANCE;
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = c13bv;
            }
            list = (List) obj2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((Number) obj3).longValue() >= millis) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(obj3);
            }
        }
        LJ(str, arrayList2);
        return arrayList2;
    }
}
