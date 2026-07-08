package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.07ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1901807ce implements Iterator<Character>, C03W4 {
    public abstract char LIZ();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(LIZ());
    }
}
