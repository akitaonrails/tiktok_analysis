package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0l4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344030l4z {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String str2) {
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, str, str2);
        }
    }

    public static final void LIZJ(String str, String str2) {
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, str, str2);
        }
    }

    public static final void LIZLLL(String str, String str2) {
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(5, str, str2);
        }
    }

    public static final void LIZIZ(String str, String str2, Throwable th) {
        if (C2344809Gs.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
