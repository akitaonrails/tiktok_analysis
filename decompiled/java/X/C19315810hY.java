package X;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.10hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19315810hY {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN");
    public static final boolean LIZIZ = true;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(663));

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue() && LIZ.contains(C2222691Bz1.LIZ().toUpperCase(Locale.ROOT));
    }
}
