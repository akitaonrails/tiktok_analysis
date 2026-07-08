package X;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06oQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1720006oQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalShare-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(String str, String str2) {
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, LIZ(str), str2);
        }
    }

    public static final void LIZLLL(Function0<String> function0, boolean z) {
        if (z) {
            LJ("ShareFacade", function0.invoke());
        } else {
            function0.invoke();
        }
    }

    public static final void LJ(String str, String str2) {
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, LIZ(str), str2);
        }
    }

    public static final void LIZJ(String str, String str2, Throwable th) {
        if (C2344809Gs.LIZ) {
            String strLIZ = LIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, strLIZ, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
