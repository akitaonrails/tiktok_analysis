package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0KRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517450KRb {
    public static Pair LIZ(int i, Throwable th) {
        String string;
        String string2;
        if (th instanceof C517460KRc) {
            C517460KRc c517460KRc = (C517460KRc) th;
            i = c517460KRc.getErrorCode();
            string = c517460KRc.getErrorMessage();
        } else if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            i = c501470JlZ.getErrorCode();
            string = c501470JlZ.getPrompt();
        } else {
            string = "";
            if (th instanceof C1494450ozb) {
                string2 = th.getMessage();
                if (string2 != null) {
                }
                i = -312;
            } else if (th instanceof C1811850xFX) {
                i = ((C1811850xFX) th).statusCode;
                string = th.toString();
            } else if (th instanceof C1494690ozz) {
                string2 = th.toString();
            } else if (th instanceof Exception) {
                String message = th.getMessage();
                if (message != null) {
                    string = message;
                }
                i = -313;
            }
            string = string2;
            i = -312;
        }
        return new Pair(Integer.valueOf(i), string);
    }
}
