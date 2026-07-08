package X;

import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857900Xl6 {
    public static final boolean LIZ(AbstractC858390Xlt abstractC858390Xlt) {
        if (!abstractC858390Xlt.LJIL() && !LIZIZ(abstractC858390Xlt)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(AbstractC858390Xlt abstractC858390Xlt) {
        if (!(abstractC858390Xlt instanceof C858350Xlp) || !u.LJJIIJZLJL(abstractC858390Xlt.LJIILJJIL(), " ", false)) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(AbstractC858390Xlt abstractC858390Xlt) {
        if (LIZIZ(abstractC858390Xlt)) {
            C858350Xlp c858350Xlp = (C858350Xlp) abstractC858390Xlt;
            c858350Xlp.LJIIIZ = (String) AFwS248S0000000_14.get$arr$(580).invoke(c858350Xlp.LJIIIZ);
        }
    }
}
