package X;

/* JADX INFO: renamed from: X.137W, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137W<K, V> extends AbstractC199589137j<K, V, C137W<K, V>> implements C137O<K, V, C137W<K, V>> {
    public volatile C137R<K, V, C137W<K, V>> LLILZ;

    @Override // X.C137C
    public final V getValue() {
        return this.LLILZ.get();
    }

    @Override // X.C137O
    public final C137R<K, V, C137W<K, V>> LIZJ() {
        return this.LLILZ;
    }

    public C137W(K k, int i, C137W<K, V> c137w) {
        super(k, i, c137w);
        this.LLILZ = AnonymousClass1375.LLJI;
    }
}
