package X;

/* JADX INFO: renamed from: X.135Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C135Y<K, V> extends C08J6 implements C139P<K, V> {
    @Override // X.C08J6
    /* JADX INFO: renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public abstract C199596137q LJIIL();

    @Override // X.C139P
    public final void LIZJ() {
        LJIIL().LIZJ();
    }

    @Override // X.C139P
    public final long size() {
        return LJIIL().size();
    }

    @Override // X.C139P
    public final V LJIIIZ(Object obj) {
        return (V) LJIIL().LJIIIZ(obj);
    }

    @Override // X.C139P
    public final void put(K k, V v) {
        LJIIL().LL.put(k, v);
    }
}
