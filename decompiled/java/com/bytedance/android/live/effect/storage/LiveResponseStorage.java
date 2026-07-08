package com.bytedance.android.live.effect.storage;

import X.C0VSJ;
import X.C13VI;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C768270UBt;
import X.C771280UNi;
import X.C771340UNo;
import X.EnumC1335420kr6;
import X.EnumC771350UNp;
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
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveResponseStorage extends C13VI {
    public final List<File> LIZIZ = new ArrayList();

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "live_storage_business_tag";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(EnumC771350UNp.LIVE_RESPONSE.getFullPath());
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        long jValue;
        Map mapLJ;
        long jLJIILL;
        long jLJIILL2 = 0;
        if (LiveBroadcastClearExpiredResourceNormal.enable()) {
            return 0L;
        }
        try {
            jValue = LiveBroadcastResourcesExpiredDays.value();
            mapLJ = C771340UNo.LJ("response");
            ((ArrayList) this.LIZIZ).clear();
            jLJIILL = LJIILL(false, mapLJ, true, jValue);
        } catch (Throwable th) {
            th = th;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveResponseStorage search size: ");
            sbLIZ.append(jLJIILL);
            sbLIZ.append(", doClean: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ));
            if (jLJIILL > 0) {
                if (z) {
                    jLJIILL2 = LJIILL(true, mapLJ, false, jValue);
                } else {
                    jLJIILL2 = jLJIILL;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LiveResponseStorage delete size: ");
                sbLIZ2.append(jLJIILL2);
                sbLIZ2.append(", canClean: ");
                sbLIZ2.append(z);
                C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ2));
                C768270UBt.LIZ.getClass();
                C768270UBt.LIZ((int) jLJIILL2, "LiveResponseStorage");
                return jLJIILL2;
            }
            return jLJIILL;
        } catch (Throwable th2) {
            th = th2;
            jLJIILL2 = jLJIILL;
            TryCatchGuardChecker.doCheck(th);
            C768270UBt.LIZ.getClass();
            C768270UBt.LIZ(0, "catch_crash");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LiveResponseStorage, error log: ");
            sbLIZ3.append(Log.getStackTraceString(th));
            C20441214yg.LJ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ3));
            return jLJIILL2;
        }
    }

    public final void LJIILLIIL(File file, AwS582S0100000_3 awS582S0100000_3) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (((Boolean) awS582S0100000_3.invoke(file2)).booleanValue()) {
                    ((ArrayList) this.LIZIZ).add(file2);
                } else if (file2.isDirectory()) {
                    LJIILLIIL(file2, awS582S0100000_3);
                }
            }
        }
    }

    public final long LJIILL(boolean z, Map map, boolean z2, long j) {
        long length;
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            length = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) entry.getValue());
            if (lLJIILIIL != null) {
                length = lLJIILIIL.longValue();
            }
            if (jCurrentTimeMillis - length < j && u.LJJIIJZLJL((String) entry.getKey(), LJIIIIZZ().getAbsolutePath(), false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (LJIIIIZZ().exists() && LJIIIIZZ().isFile() && !linkedHashMap.containsKey(LJIIIIZZ().getAbsolutePath())) {
            length = 0 + C771280UNi.LIZ(LJIIIIZZ(), z);
        }
        if (LJIIIIZZ().exists() && LJIIIIZZ().isDirectory()) {
            if (z2) {
                LJIILLIIL(LJIIIIZZ(), new AwS582S0100000_3(linkedHashMap, (Map<String, String>) 102));
            }
            for (File file : (ArrayList) this.LIZIZ) {
                if (!C771340UNo.LIZJ()) {
                    length += file.length();
                    if (z) {
                        file.delete();
                        Iterator it3 = map.entrySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (a0.LJJIIZI(file.getAbsolutePath(), (CharSequence) ((Map.Entry) next).getKey(), false)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        if (entry2 != null) {
                            int i = C771340UNo.LIZ;
                            C771340UNo.LIZIZ("response", (String) entry2.getKey());
                        }
                    }
                }
            }
        }
        return length;
    }
}
