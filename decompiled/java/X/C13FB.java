package X;

/* JADX INFO: renamed from: X.13FB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FB<K, V> extends C13F3<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.LLILLL + 2;
        this.LLILLL = i;
        return (K) this.LL[i - 2];
    }
}
