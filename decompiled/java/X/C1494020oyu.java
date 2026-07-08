package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0oyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494020oyu {
    public final Set<C1495560p1O> LIZ = new LinkedHashSet();

    public final synchronized void LIZ(C1495560p1O c1495560p1O) {
        this.LIZ.remove(c1495560p1O);
    }

    public final synchronized boolean LIZIZ(C1495560p1O c1495560p1O) {
        return this.LIZ.contains(c1495560p1O);
    }
}
