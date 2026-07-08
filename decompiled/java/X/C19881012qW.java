package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19881012qW extends C19880412qQ<Object, Object>.b<Map.Entry<Object, Object>> {
    public final /* synthetic */ C19880412qQ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19881012qW(C19880412qQ c19880412qQ) {
        super();
        this.LLILZIL = c19880412qQ;
    }

    @Override // X.C19880412qQ.b
    public final Map.Entry<Object, Object> LIZ(final int i) {
        final C19880412qQ c19880412qQ = this.LLILZIL;
        return new AbstractC19868112oR<K, V>(i) { // from class: X.12qT
            public final K LL;
            public int LLILLJJLI;

            public final void LIZ() {
                int i2 = this.LLILLJJLI;
                if (i2 == -1 || i2 >= this.LLILLL.size() || !C19837412jU.LIZ(this.LL, this.LLILLL.LJIILIIL(this.LLILLJJLI))) {
                    this.LLILLJJLI = this.LLILLL.LJIIIZ(this.LL);
                }
            }

            @Override // X.AbstractC19868112oR, java.util.Map.Entry
            public final V getValue() {
                Map<K, V> mapLJFF = this.LLILLL.LJFF();
                if (mapLJFF != null) {
                    return mapLJFF.get(this.LL);
                }
                LIZ();
                int i2 = this.LLILLJJLI;
                if (i2 == -1) {
                    return null;
                }
                return (V) this.LLILLL.LJJIFFI(i2);
            }

            @Override // X.AbstractC19868112oR, java.util.Map.Entry
            public final K getKey() {
                return this.LL;
            }

            @Override // X.AbstractC19868112oR, java.util.Map.Entry
            public final V setValue(V v) {
                Map<K, V> mapLJFF = this.LLILLL.LJFF();
                if (mapLJFF != null) {
                    return mapLJFF.put(this.LL, v);
                }
                LIZ();
                int i2 = this.LLILLJJLI;
                if (i2 == -1) {
                    this.LLILLL.put(this.LL, v);
                    return null;
                }
                V v2 = (V) this.LLILLL.LJJIFFI(i2);
                C19880412qQ c19880412qQ2 = this.LLILLL;
                c19880412qQ2.LJIL()[this.LLILLJJLI] = v;
                return v2;
            }

            {
                this.LL = (K) this.LLILLL.LJIILIIL(i);
                this.LLILLJJLI = i;
            }
        };
    }
}
