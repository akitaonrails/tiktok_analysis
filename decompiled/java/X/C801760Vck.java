package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Vck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801760Vck {
    public static volatile boolean LIZ = true;
    public static int LIZIZ = 1048576;

    public static void LIZ(File file, CrashType crashType) {
        List<C801770Vcl> list;
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null && LIZ) {
            try {
                C802410Vdn c802410Vdn = c802790VeP.LIZJ;
                synchronized (c802410Vdn.LJFF) {
                    try {
                        list = c802410Vdn.LJFF.getList(crashType);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                Iterator<C801770Vcl> it2 = list.iterator();
                int length = 0;
                while (it2.hasNext()) {
                    File[] fileArrLIZ = it2.next().LIZ(crashType);
                    if (fileArrLIZ != null) {
                        for (File file2 : fileArrLIZ) {
                            C0VSJ c0vsj = new C0VSJ(file, file2.getName());
                            if (!c0vsj.exists()) {
                                length = (int) (((long) length) + file2.length());
                                if (length <= LIZIZ) {
                                    C08SE.LIZ(file2, c0vsj, false);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
    }
}
