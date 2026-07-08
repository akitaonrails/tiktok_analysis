package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1521240pgo {
    monitor(true, 0),
    webMonitor(true, 1),
    webBlank(true, 2),
    webFetch(true, 3),
    webJSB(true, 4),
    webInject(true, 5),
    lynxMonitor(true, 6),
    lynxPerf(true, 7),
    lynxBlank(true, 8),
    lynxFetch(true, 9),
    lynxJsb(true, 10),
    webAutoReport(true, 11),
    webUpdatePageData(true, 12),
    webTTWebDelegate(true, 24),
    teaReport(true, 25),
    webResourceLoader(true, 26),
    lynxResourceLoader(true, 27),
    checkSelf(true, 28),
    eventStream(true, 29),
    blankBitmap(true, 30),
    webDomainWhiteList(false, 31),
    logType(false, 32),
    vidReport(false, 35);

    public EnumC1287990jcb LL = EnumC1287990jcb.DEFAULT;
    public boolean enabled;

    public boolean isEnabled() {
        boolean z = this.enabled;
        EnumC1287990jcb enumC1287990jcb = this.LL;
        return enumC1287990jcb != EnumC1287990jcb.DEFAULT ? enumC1287990jcb == EnumC1287990jcb.ON : z;
    }

    public boolean not() {
        return !isEnabled();
    }

    public static void resetAll(long j) {
        for (int i = 0; i <= C1521650phT.LIZIZ; i++) {
            try {
                boolean z = true;
                if (i != 0) {
                    j >>= 1;
                }
                EnumC1521240pgo enumC1521240pgo = (EnumC1521240pgo) ((ConcurrentHashMap) C1521650phT.LIZ).get(Integer.valueOf(i));
                if (enumC1521240pgo != null) {
                    if (j % 2 == 0) {
                        z = false;
                    }
                    enumC1521240pgo.enabled = z;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZ("startup_handle", th);
                return;
            }
        }
    }

    public static EnumC1521240pgo valueOf(String str) {
        return (EnumC1521240pgo) C08FF.LIZ(EnumC1521240pgo.class, str);
    }

    public void setEnableManually(EnumC1287990jcb enumC1287990jcb) {
        this.LL = enumC1287990jcb;
    }

    EnumC1521240pgo(boolean z, int i) {
        this.enabled = z;
        ((ConcurrentHashMap) C1521650phT.LIZ).put(Integer.valueOf(i), this);
        if (i > C1521650phT.LIZIZ) {
            C1521650phT.LIZIZ = i;
        }
    }
}
