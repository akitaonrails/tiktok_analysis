package X;

import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: renamed from: X.0ugt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713490ugt {
    public static C1713690uhD LIZIZ(String str) {
        if (str == null) {
            str = "Unsupported native verify type";
        }
        return new C1713690uhD((Fragment) null, "UNSUPPORTED", "", (String) null, (String) null, new C1708530uYt(str, new IllegalArgumentException("Unsupported native verify type"), 4), (Map) null, 184);
    }

    public static C1713690uhD LIZ(String str, Throwable th, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        return new C1713690uhD((Fragment) null, "REJECT", "", (String) null, (String) null, new C1708530uYt(str, null), (Map) null, 184);
    }
}
