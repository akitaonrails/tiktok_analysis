package X;

import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824850WXj {
    public static final boolean LIZ(String str) {
        List<String> list = C1740280vO6.LIZ.disableScenes;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
