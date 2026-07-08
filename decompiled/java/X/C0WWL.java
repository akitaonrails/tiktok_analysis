package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0WWL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWL {
    public static C0WWL LIZIZ;
    public final int LIZ;

    public static synchronized C0WWL LIZIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C0WWL();
        }
        return LIZIZ;
    }

    public C0WWL() {
        int i = 7;
        while (C0WWM.LIZ(i) && i - 1 >= 2) {
        }
        this.LIZ = i + 1;
    }

    public static void LIZ(String str, Object... objArr) {
        LIZIZ().LIZJ(3, str, null, objArr);
    }

    public static void LIZLLL(String str, Object... objArr) {
        LIZIZ().LIZJ(5, str, null, objArr);
    }

    public final void LIZJ(int i, String str, Throwable th, Object... objArr) {
        if (this.LIZ > i) {
            return;
        }
        if (objArr.length >= 1) {
            str = C786410Ut5.j4(str, objArr);
        }
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("\n");
            sbLIZ.append(Log.getStackTraceString(th));
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
