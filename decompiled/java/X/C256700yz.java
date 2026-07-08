package X;

import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.00yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256700yz {
    public static final C13BV LIZ = C13BV.INSTANCE;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(530));

    public static final boolean LIZ(String str) {
        String lowerCase;
        C01GW c01gw = LIZIZ;
        Iterable iterable = (Iterable) c01gw.getValue();
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (!C13LP.LJJJJ(lowerCase, iterable) && !((List) c01gw.getValue()).contains("all")) {
            return false;
        }
        return true;
    }
}
