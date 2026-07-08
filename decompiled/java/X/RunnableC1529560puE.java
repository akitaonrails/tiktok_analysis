package X;

import android.content.SharedPreferences;
import com.bytedance.geckox.policy.meta.file.ChannelFileAccessRecord;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0puE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1529560puE implements Runnable {
    public static final RunnableC1529560puE LL = new RunnableC1529560puE();

    public static void LIZ() {
        ChannelFileAccessRecord channelFileAccessRecord;
        Object c098200Yq;
        C1551360qTO.LIZ.getClass();
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = C1551360qTO.LJIIIZ;
        Set<String> setLLIIJI = C13LP.LLIIJI(keySetView);
        keySetView.clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flushDirtyRecordsToDisk: channelCount=");
        sbLIZ.append(setLLIIJI.size());
        sbLIZ.append(", keys=");
        sbLIZ.append(setLLIIJI);
        C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ));
        for (String str : setLLIIJI) {
            int iLJJJ = a0.LJJJ(str, "\u001e", 0, false, 6);
            if (iLJJJ > 0 && iLJJJ < a0.LJJIJL(str)) {
                Pair pair = new Pair(str.substring(0, iLJJJ), str.substring(iLJJJ + 1));
                String str2 = (String) pair.getFirst();
                String str3 = (String) pair.getSecond();
                ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMap = C1551360qTO.LJ.get(str2);
                if (concurrentHashMap != null && (channelFileAccessRecord = concurrentHashMap.get(str3)) != null) {
                    C1551360qTO.LIZ.getClass();
                    SharedPreferences sharedPreferencesLIZLLL = C1551360qTO.LIZLLL(str2);
                    if (sharedPreferencesLIZLLL != null) {
                        try {
                            c098200Yq = C1551400qTS.LIZIZ.LIZ.LJIILL(channelFileAccessRecord);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        String str4 = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                        if (str4 != null) {
                            sharedPreferencesLIZLLL.edit().putString(str3, str4).apply();
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ChannelFileAccessManager@6fd1.flushRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChannelFileAccessManager@6fd1.flushRunnable$1");
    }
}
