package X;

import java.util.Map;

/* JADX INFO: renamed from: X.13CL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CL<K, V> extends C11U4<K, V> implements C08J0 {
    public final Map<K, C13CR<V>> LLILLL;
    public C13CR<V> LLILZ;

    @Override // X.C11U4, java.util.Map.Entry
    public final V getValue() {
        return this.LLILZ.LIZ;
    }

    @Override // X.C11U4, java.util.Map.Entry
    public final V setValue(V v) {
        C13CR<V> c13cr = this.LLILZ;
        V v2 = c13cr.LIZ;
        C13CR<V> c13cr2 = new C13CR<>(v, c13cr.LIZIZ, c13cr.LIZJ);
        this.LLILZ = c13cr2;
        this.LLILLL.put(this.LL, c13cr2);
        return v2;
    }

    public C13CL(C13CF c13cf, Object obj, C13CR c13cr) {
        super(obj, c13cr.LIZ);
        this.LLILLL = c13cf;
        this.LLILZ = c13cr;
    }
}
