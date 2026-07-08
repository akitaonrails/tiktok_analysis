package X;

/* JADX INFO: renamed from: X.13FC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FC<K, V> extends C13F3<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.LLILLL + 2;
        this.LLILLL = i;
        return (V) this.LL[i - 1];
    }
}
