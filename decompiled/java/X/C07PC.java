package X;

import java.util.List;

/* JADX INFO: renamed from: X.07PC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07PC {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C07PD());

    public static final boolean LIZ(String str) {
        if (((Number) LIZ.getValue()).intValue() == 0) {
            return false;
        }
        if (str == null) {
            List<String> list = C07PB.LIZ;
            return false;
        }
        return ((List) C07PB.LIZIZ.getValue()).contains(str);
    }
}
