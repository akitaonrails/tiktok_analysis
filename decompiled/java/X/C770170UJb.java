package X;

import android.os.Process;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0UJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770170UJb {
    public static final C770170UJb LIZ = new C770170UJb();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static String LIZ(String str) {
        StringBuilder sb = new StringBuilder(50);
        sb.append(e3.e);
        sb.append(Process.myTid());
        sb.append("][");
        if (LIZIZ.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre: ");
            sbLIZ.append(LIZIZ);
            sbLIZ.append(", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (LIZJ.length() > 0) {
            sb.append("cur: ");
            sb.append(LIZJ);
            if (LIZLLL.length() > 0) {
                sb.append("#{");
                sb.append(LIZLLL);
                sb.append("}");
            }
        }
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void LIZIZ(String str) {
        C20441214yg.LJIIIZ("effect_log", LIZ(str));
        LIZLLL = "";
    }

    public static final void LIZJ(String str) {
        if (!Intrinsics.LJFF(str, LIZJ)) {
            LIZLLL = "";
            LIZIZ = LIZJ;
            LIZJ = str;
        }
    }
}
