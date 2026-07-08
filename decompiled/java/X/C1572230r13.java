package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0r13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572230r13 {
    public static final void LIZ(List<C0ZP4> list) {
        Iterator<C0ZP4> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
    }
}
