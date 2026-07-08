package X;

import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0J0F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0F {
    public static C0J0E LIZ(String str) {
        if (str.length() == 0) {
            return null;
        }
        int iLJJJJ = a0.LJJJJ(str, '.', 0, 6);
        C0J0E c0j0e = new C0J0E();
        if (iLJJJJ > 0) {
            c0j0e.LIZ = str.substring(iLJJJJ + 1, str.length());
        } else {
            c0j0e.LIZ = str;
        }
        int iLJJJ = a0.LJJJ(str, e3.c, 0, false, 6);
        if (iLJJJ > 0) {
            c0j0e.LIZIZ = str.substring(0, iLJJJ);
            if (iLJJJJ > 0) {
                c0j0e.LIZJ = str.substring(iLJJJ + 1, iLJJJJ);
            }
        } else if (iLJJJJ > 0) {
            c0j0e.LIZJ = str.substring(0, iLJJJJ);
            return c0j0e;
        }
        return c0j0e;
    }
}
