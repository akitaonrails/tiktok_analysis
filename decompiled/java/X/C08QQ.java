package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08QQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QQ {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(String str) {
        if (a0.LJJJIL(str)) {
            return 0L;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return 0L;
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c0vsj.isFile()) {
            return c0vsj.length();
        }
        if (c0vsj.isDirectory()) {
            C08QE c08qeLJIILIIL = C08QB.LJIILIIL(c0vsj);
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C08QE(c08qeLJIILIIL.LIZ, c08qeLJIILIIL.LIZIZ, new C08QR(), c08qeLJIILIIL.LIZLLL, c08qeLJIILIIL.LJ, c08qeLJIILIIL.LJFF), AFwS231S0000000_3.get$arr$(178)));
            long length = 0;
            while (c08qt.hasNext()) {
                length += ((File) c08qt.next()).length();
            }
            return length;
        }
        return 0L;
    }
}
