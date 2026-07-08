package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.effectplatform.task.Version;

/* JADX INFO: renamed from: X.13OH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OH {
    public static Version LIZ(C13RD c13rd, String str) {
        C20008813Qo c20008813QoLJIILIIL;
        C13R7 c13r7;
        try {
            InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
            if (interfaceC20004513Ox != null && (c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(str)) != null) {
                try {
                    String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                    c20008813QoLJIILIIL.close();
                    if (strLJIIIZ != null && (c13r7 = c13rd.LJIJI) != null) {
                        return (Version) c13r7.LIZ.convertJsonToObj(strLJIIIZ, Version.class);
                    }
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readVersion failed: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("Version", strLIZIZ, null);
        }
        return null;
    }
}
