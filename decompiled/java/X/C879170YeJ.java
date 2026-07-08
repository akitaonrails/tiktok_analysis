package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0YeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879170YeJ {
    public static final /* synthetic */ int LIZ = 0;

    public static C459160HzW LIZIZ(String str) {
        return new C459160HzW(str.substring(2));
    }

    public static boolean LIZJ(String str) {
        if (!u.LJJIIJZLJL(str, "3:", false) || Intrinsics.LJFF(str, "3:")) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(String str) {
        if (!u.LJJIIJZLJL(str, "e:", false) || Intrinsics.LJFF(str, "e:love")) {
            return false;
        }
        return true;
    }

    public static C455420HtU LIZ(long j, String str, C0Z70 c0z70) {
        long jLongValue;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str.substring(2));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = -1;
        }
        return new C455420HtU(j, jLongValue, c0z70, null);
    }
}
