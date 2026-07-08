package X;

import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Wz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841040Wz0 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("v16.tiktokv.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("tiktok.com", "tiktokv.com");

    public static final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        Iterator<String> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
