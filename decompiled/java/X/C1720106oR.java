package X;

import android.util.Log;

/* JADX INFO: renamed from: X.06oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1720106oR {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1720206oS());

    public static boolean LJ() {
        return !C2213981Bky.LIZIZ.LIZLLL() && C2344809Gs.LIZ;
    }

    public static boolean LJFF() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final void LIZLLL(Throwable th) {
        if (LJFF()) {
            C2344809Gs.LJI(th);
        } else if (LJ()) {
            C2344809Gs.LJI(th);
        }
    }

    public static final void LIZ(String str, String str2) {
        if (LJFF()) {
            C2344809Gs.LIZLLL(6, str, str2);
        } else if (LJ()) {
            C2344809Gs.LIZLLL(6, str, str2);
        }
    }

    public static final void LIZJ(String str, Throwable th) {
        if (LJFF()) {
            C2344809Gs.LIZLLL(6, str, Log.getStackTraceString(th));
        } else if (LJ()) {
            C2344809Gs.LIZLLL(6, str, Log.getStackTraceString(th));
        }
    }

    public static final void LJI(String str, String str2) {
        if (LJFF()) {
            C2344809Gs.LIZLLL(4, str, str2);
        } else if (LJ()) {
            C2344809Gs.LIZLLL(4, str, str2);
        }
    }

    public static final void LIZIZ(String str, String str2, Throwable th) {
        if (LJFF()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, str, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LJ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(": ");
            sbLIZ2.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, str, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
