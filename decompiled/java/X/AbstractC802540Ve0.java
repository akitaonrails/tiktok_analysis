package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0Ve0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC802540Ve0 {
    public File LIZ;
    public String LIZIZ;
    public String LIZJ;
    public C0VSJ LIZLLL;
    public C2126508Ut LJ;
    public boolean LJFF;
    public boolean LJI;

    public void LIZIZ() {
    }

    public boolean LIZJ() {
        return true;
    }

    public static void LIZ(String str) {
        try {
            File fileLIZ = C0VXM.LIZ();
            if (fileLIZ != null && fileLIZ.exists() && fileLIZ.length() > 128) {
                C08SE.LIZ(fileLIZ, new C0VSJ(str, "process_track.txt"), true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZ("dumpActivityInfo", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C802970Veh r14) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC802540Ve0.LIZLLL(X.0Veh):void");
    }

    public final void LJ(C802970Veh c802970Veh) {
        String str;
        try {
            String str2 = this.LIZJ;
            if (c802970Veh.LJ == null) {
                int i = c802970Veh.LJFF;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = "unknown";
                                    } else {
                                        str = "ref_monitor.config";
                                    }
                                } else {
                                    str = "tls_monitor.config";
                                }
                            } else {
                                str = "vmm.config";
                            }
                        } else {
                            str = "fd_track.config";
                        }
                    } else {
                        str = "heap_track.config";
                    }
                } else {
                    str = "xasan.config";
                }
                c802970Veh.LJ = str;
            }
            C0VSJ c0vsj = new C0VSJ(str2, c802970Veh.LJ);
            this.LIZLLL = c0vsj;
            if (!c0vsj.exists()) {
                this.LIZLLL.createNewFile();
            }
            C08SE.LJIIIIZZ(this.LIZLLL, c802970Veh.toString(), false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
