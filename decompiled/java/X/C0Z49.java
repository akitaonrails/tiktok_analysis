package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Z49, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z49 {
    public static final Set<C0Z4A> LIZ = new LinkedHashSet();

    public static void LIZ(boolean z, boolean z2) {
        Iterator<C0Z4A> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(z, z2);
        }
    }
}
