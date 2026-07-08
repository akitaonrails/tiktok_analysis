package X;

import android.util.Log;

/* JADX INFO: renamed from: X.10dT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19290510dT {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1732506qR());

    public static final void LIZ(String str, String str2) {
        C19290610dU c19290610dU = C19290610dU.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(str2);
        c19290610dU.LIZIZ(3, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(String str, String str2) {
        LIZJ(str, str2, null);
        C19290610dU c19290610dU = C19290610dU.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(str2);
        c19290610dU.LIZIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZLLL(String str, String str2) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            C2344809Gs.LIZLLL(4, "inner_push_platform", str + ' ' + str2);
            return;
        }
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, "inner_push_platform", str + ' ' + str2);
        }
    }

    public static final void LIZJ(String str, String str2, Throwable th) {
        String localizedMessage;
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            C2344809Gs.LIZLLL(6, "inner_push_platform", str + ' ' + str2 + ": " + Log.getStackTraceString(th));
            return;
        }
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, "inner_push_platform", str + ' ' + str2 + ": " + Log.getStackTraceString(th));
        }
        C19290610dU c19290610dU = C19290610dU.LIZIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append(' ');
        if (th != null) {
            localizedMessage = th.getLocalizedMessage();
        } else {
            localizedMessage = null;
        }
        sb.append(localizedMessage);
        c19290610dU.LIZIZ(4, sb.toString());
    }
}
