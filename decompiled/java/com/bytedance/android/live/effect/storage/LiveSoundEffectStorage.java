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
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveSoundEffectStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "live_storage_business_tag";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(EnumC771350UNp.SOUND_EFFECT.getFullPath());
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        long jLJIILL;
        long jValue;
        Map mapLJ;
        long jLJIILL2 = 0;
        if (LiveBroadcastClearExpiredResourceNormal.enable()) {
            return 0L;
        }
        try {
            jValue = LiveBroadcastResourcesExpiredDays.value();
            mapLJ = C771340UNo.LJ("sound_effect");
            jLJIILL = LJIILL(jValue, false, mapLJ);
        } catch (Throwable th) {
            th = th;
            jLJIILL = jLJIILL2;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveSoundEffectStorage search size: ");
            sbLIZ.append(jLJIILL);
            sbLIZ.append(", doClean: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ));
            if (jLJIILL > 0) {
                if (z) {
                    jLJIILL2 = LJIILL(jValue, true, mapLJ);
                } else {
                    jLJIILL2 = jLJIILL;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LiveSoundEffectStorage delete size: ");
                sbLIZ2.append(jLJIILL2);
                sbLIZ2.append(", canClean: ");
                sbLIZ2.append(z);
                C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ2));
                C768270UBt.LIZ.getClass();
                C768270UBt.LIZ((int) jLJIILL2, "LiveSoundEffectStorage");
                return jLJIILL2;
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C768270UBt.LIZ.getClass();
            C768270UBt.LIZ(0, "catch_crash");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LiveSoundEffectStorage, error log: ");
            sbLIZ3.append(Log.getStackTraceString(th));
            C20441214yg.LJ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ3));
        }
        return jLJIILL;
    }

    public final long LJIILL(long j, boolean z, Map map) {
        long jLIZ;
        File[] fileArrListFiles;
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            jLIZ = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) entry.getValue());
            if (lLJIILIIL != null) {
                jLIZ = lLJIILIIL.longValue();
            }
            if (jCurrentTimeMillis - jLIZ < j && u.LJJIIJZLJL((String) entry.getKey(), LJIIIIZZ().getAbsolutePath(), false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (LJIIIIZZ().exists() && LJIIIIZZ().isFile() && !linkedHashMap.containsKey(LJIIIIZZ().getAbsolutePath())) {
            jLIZ = 0 + C771280UNi.LIZ(LJIIIIZZ(), z);
        }
        if (LJIIIIZZ().exists() && LJIIIIZZ().isDirectory() && (fileArrListFiles = LJIIIIZZ().listFiles()) != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.exists() && !linkedHashMap.containsKey(file.getAbsolutePath())) {
                    arrayList.add(file);
                }
            }
            for (File file2 : arrayList) {
                if (!C771340UNo.LIZJ()) {
                    jLIZ += C771280UNi.LIZ(file2, z);
                    if (z) {
                        Iterator it3 = map.entrySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (a0.LJJIIZI(file2.getAbsolutePath(), (CharSequence) ((Map.Entry) next).getKey(), false)) {
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
                            C771340UNo.LIZIZ("sound_effect", (String) entry2.getKey());
                        }
                    }
                }
            }
        }
        return jLIZ;
    }
}
