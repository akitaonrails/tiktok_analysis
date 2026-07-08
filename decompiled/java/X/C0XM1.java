package X;

import android.os.Build;
import com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0XM1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XM1 {
    public static volatile boolean LIZJ;
    public static final INetworkExpsDepend LJ;
    public static volatile boolean LJFF;
    public static final List<String> LJI;
    public static final C0XM1 LIZ = new C0XM1();
    public static final Object LIZIZ = new Object();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0XM2());

    static {
        INetworkExpsDepend iNetworkExpsDepend = (INetworkExpsDepend) PluggableExtentionKt.pluggableSpi$default(INetworkExpsDepend.class, false, false, false, 14, null);
        if (iNetworkExpsDepend == null) {
            "INetworkExpsDepend delegator can't be null.".toString();
            throw new IllegalStateException("INetworkExpsDepend delegator can't be null.");
        }
        LJ = iNetworkExpsDepend;
        LJI = C1697810uHb.LJIIJJI("MI PAD 2", "YT3-X90L", "YT3-X90F", "GT-810");
    }

    public static final C1495130p0h LIZ() {
        LIZ.getClass();
        return LIZIZ();
    }

    public static C1495130p0h LIZIZ() {
        return (C1495130p0h) LIZLLL.getValue();
    }

    public static final C0XPI LIZJ() {
        LIZ.getClass();
        return LIZIZ().LIZLLL;
    }

    public static void LJ() {
        if (LIZJ) {
            return;
        }
        Object obj = LIZIZ;
        synchronized (obj) {
            try {
                if (!LIZJ) {
                    try {
                        obj.wait();
                        LIZJ = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static boolean LIZLLL(boolean z) {
        try {
            List listAsList = Arrays.asList(Build.SUPPORTED_ABIS);
            if (!listAsList.contains("x86") && !listAsList.contains("x86_64")) {
                if (!LJI.contains(Build.MODEL)) {
                    return false;
                }
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cronet unsupported CPU arch: ");
            sbLIZ.append(listAsList);
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C0XM3.LIZ;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }
}
