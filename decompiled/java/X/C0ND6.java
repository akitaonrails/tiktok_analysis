package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.jvm.internal.AwS94S1000000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ND6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ND6 {
    public static int LIZLLL;
    public static final Set<String> LIZ = C093Y.LJ("default");
    public static int LIZIZ = -1;
    public static String LIZJ = "";
    public static final Object LJ = new Object();

    public static final void LIZIZ(String str) {
        if (!C07JV.LIZ()) {
            return;
        }
        synchronized (LJ) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        Set<String> set = LIZ;
                        if (set.contains(str) || a0.LJJIIZI(C590440NDu.LJFF(), str, false)) {
                            set.remove(str);
                            C593360NPa.LIZIZ(new AwS94S1000000_9(str, 0));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(int r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ND6.LIZ(int, java.lang.String):boolean");
    }
}
