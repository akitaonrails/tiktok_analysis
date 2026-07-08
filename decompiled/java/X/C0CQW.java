package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0CQW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQW<T> {
    public final Set<T> LIZ = new LinkedHashSet();

    public final synchronized void LIZ(Collection<? extends T> collection) {
        this.LIZ.addAll(collection);
    }
}
