package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.07cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1901707cd implements Iterator<Float>, C03W4 {
    public abstract float LIZ();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(LIZ());
    }
}
