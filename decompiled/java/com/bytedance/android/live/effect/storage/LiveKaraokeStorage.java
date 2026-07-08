package com.bytedance.android.live.effect.storage;

import X.C0VSJ;
import X.C13VI;
import X.C15438062q;
import X.C19719612Di;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C768270UBt;
import X.C771340UNo;
import X.C784850UqZ;
import X.EnumC1335420kr6;
import X.EnumC771350UNp;
import X.InterfaceC766480U4w;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastClearExpiredResourceNormal;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResourcesExpiredDays;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveKaraokeStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "live_storage_business_tag";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(EnumC771350UNp.LIVE_KARAOKE.getFullPath());
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        File fileLJIIIIZZ;
        long jLongValue;
        long jLJIILL = 0;
        if (LiveBroadcastClearExpiredResourceNormal.enable()) {
            return 0L;
        }
        try {
            fileLJIIIIZZ = LJIIIIZZ();
        } catch (Throwable th) {
            th = th;
        }
        if (fileLJIIIIZZ.exists()) {
            try {
            } catch (Throwable th2) {
                th = th2;
                jLJIILL = 0;
            }
            if (fileLJIIIIZZ.isDirectory()) {
                C784850UqZ c784850UqZ = new C784850UqZ(InterfaceC766480U4w.LJJL.LIZIZ());
                Map mapLJ = C771340UNo.LJ("karaoke");
                long jValue = LiveBroadcastResourcesExpiredDays.value();
                long jCurrentTimeMillis = System.currentTimeMillis();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapLJ.entrySet()) {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL((String) entry.getValue());
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jCurrentTimeMillis - jLongValue < jValue) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Long, List<String>> entry2 : c784850UqZ.entrySet()) {
                    if (linkedHashMap.containsKey(String.valueOf(entry2.getKey().longValue()))) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry<Long, List<String>> entry3 : c784850UqZ.entrySet()) {
                    if (!linkedHashMap.containsKey(String.valueOf(entry3.getKey().longValue()))) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Set<Map.Entry> setEntrySet = linkedHashMap3.entrySet();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry4 : setEntrySet) {
                    long jLongValue2 = ((Number) entry4.getKey()).longValue();
                    List list = (List) entry4.getValue();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new Pair((String) it3.next(), Long.valueOf(jLongValue2)));
                    }
                    C19719612Di.LJJI(arrayList3, arrayList2);
                }
                Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList2);
                jLJIILL = LJIILL(false, (C0VSJ) fileLJIIIIZZ, arrayList, mapLJIILLIIL, c784850UqZ);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LiveKaraokeStorage search size: ");
                    sbLIZ.append(jLJIILL);
                    sbLIZ.append(", doClean: ");
                    sbLIZ.append(z);
                    C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ));
                    if (jLJIILL > 0) {
                        if (z) {
                            try {
                                jLJIILL = LJIILL(true, (C0VSJ) fileLJIIIIZZ, arrayList, mapLJIILLIIL, c784850UqZ);
                            } catch (Throwable th3) {
                                th = th3;
                                TryCatchGuardChecker.doCheck(th);
                                C768270UBt.LIZ.getClass();
                                C768270UBt.LIZ(0, "catch_crash");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("LiveKaraokeStorage, error log: ");
                                sbLIZ2.append(Log.getStackTraceString(th));
                                C20441214yg.LJ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ2));
                                return jLJIILL;
                            }
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("LiveKaraokeStorage delete size: ");
                        sbLIZ3.append(jLJIILL);
                        sbLIZ3.append(", canClean: ");
                        sbLIZ3.append(z);
                        C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ3));
                        InterfaceC766480U4w.LJJL.LJFF(c784850UqZ.toList());
                        C768270UBt.LIZ.getClass();
                        C768270UBt.LIZ((int) jLJIILL, "LiveKaraokeStorage");
                        return jLJIILL;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                return jLJIILL;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r9.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIILL(boolean r13, X.C0VSJ r14, java.util.List r15, java.util.Map r16, X.C784850UqZ r17) {
        /*
            java.io.File[] r10 = r14.listFiles()
            r11 = 0
            if (r10 == 0) goto Lb1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r8 = r10.length
            r3 = 0
            r7 = 0
        L10:
            r6 = 0
            if (r7 >= r8) goto L3b
            r5 = r10[r7]
            java.lang.String r4 = r5.getAbsolutePath()
            r0 = r15
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r0, r3)
            if (r0 == 0) goto L20
            if (r1 != 0) goto L38
        L35:
            r9.add(r5)
        L38:
            int r7 = r7 + 1
            goto L10
        L3b:
            java.util.Iterator r5 = r9.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            boolean r0 = X.C771340UNo.LIZJ()
            if (r0 != 0) goto L3f
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L3f
            boolean r0 = r2.exists()
            if (r0 == 0) goto L3f
            java.lang.String r4 = r2.getAbsolutePath()
            long r0 = r2.length()
            long r11 = r11 + r0
            if (r13 == 0) goto L3f
            r2.delete()
            java.util.Set r0 = r16.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L73:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r0, r3)
            if (r0 == 0) goto L73
        L8c:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L3f
            java.lang.Object r0 = r1.getValue()
            r2 = r17
            r2.remove(r0)
            int r0 = X.C771340UNo.LIZ
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "karaoke"
            X.C771340UNo.LIZIZ(r0, r1)
            goto L3f
        Laf:
            r1 = r6
            goto L8c
        Lb1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.storage.LiveKaraokeStorage.LJIILL(boolean, X.0VSJ, java.util.List, java.util.Map, X.0UqZ):long");
    }
}
