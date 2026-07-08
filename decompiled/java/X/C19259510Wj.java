package X;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10Wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19259510Wj {
    public static void LIZ(Context context, String str, C10XK c10xk, String str2, String str3, String str4) {
        List listLJIIJJI = C1697810uHb.LJIIJJI("preinstall", "preload_conf", "preload_pai", "id_matching");
        if (u.LJIJI("id_matching", str4, true)) {
            c10xk.LIZ.LJIIJJI = 8;
        }
        if (listLJIIJJI.contains(str4.toLowerCase(Locale.ROOT)) || c10xk.LIZ.LIZ.length() > 0) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C19259410Wi(context, str, c10xk, str2, str3, null), 2);
        }
    }
}
