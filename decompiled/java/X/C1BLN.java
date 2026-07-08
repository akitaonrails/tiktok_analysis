package X;

import Y.ARunnableS134S0100000_34;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.morpheus.PluginEntity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1BLN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLN {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final List<InterfaceC2192641Are> LIZIZ = new CopyOnWriteArrayList();
    public static final Map<String, C1BLM> LIZJ;

    static {
        HashMap map = new HashMap();
        Set<String> setLIZLLL = C08PT.LIZLLL();
        for (PluginEntity pluginEntity : (List) C08EV.LIZ.getValue()) {
            String packageName = pluginEntity.getPackageName();
            if (setLIZLLL.contains(pluginEntity.getAabName())) {
                map.put(packageName, new C1BLM(packageName, C08PT.LJ(), 5));
            } else {
                map.put(packageName, new C1BLM(packageName, C08PT.LJ(), 0));
            }
        }
        LIZJ = map;
    }

    public static void LIZ(C1BLM c1blm) {
        String str = c1blm.LIZ;
        if (str == null) {
            return;
        }
        if (str.startsWith("com.ss.android.ugc.aweme.dflanguage")) {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS134S0100000_34(c1blm, 3));
            return;
        }
        Map<String, C1BLM> map = LIZJ;
        synchronized (map) {
            try {
                C1BLM c1blm2 = (C1BLM) ((HashMap) map).get(c1blm.LIZ);
                if (c1blm2 != null) {
                    c1blm2.LIZJ = c1blm.LIZJ;
                    c1blm2.LIZIZ = c1blm.LIZIZ;
                    c1blm2.LJI = c1blm.LJI;
                    c1blm2.LJIIIIZZ = c1blm.LJIIIIZZ;
                    c1blm2.LJII = c1blm.LJII;
                    c1blm2.LJ = c1blm.LJ;
                    c1blm2.LIZLLL = c1blm.LIZLLL;
                    C786410Ut5.LJJZZIII(LIZ, new ARunnableS134S0100000_34(c1blm2, 3));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
