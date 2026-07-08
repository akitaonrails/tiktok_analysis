package X;

/* JADX INFO: renamed from: X.12px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19877512px extends C19877612py<Object> {
    public C19877512px(final AbstractC19877412pw abstractC19877412pw) {
        new AbstractC19877412pw<K>(abstractC19877412pw) { // from class: X.12py
            public final AbstractC19877412pw<K> LIZJ;

            {
                this.LIZJ = abstractC19877412pw;
            }

            @Override // X.AbstractC19877412pw
            public final Class<?> LIZLLL(K k) {
                return this.LIZJ.LIZLLL(k);
            }

            @Override // X.AbstractC19877412pw
            public final K LJ(K k) {
                return this.LIZJ.LJ(k);
            }
        };
    }

    @Override // X.AbstractC19877412pw
    public final AbstractC19875512pd LIZIZ(AbstractC19875812pg abstractC19875812pg) {
        C19876312pl c19876312plBuilder = AbstractC19875512pd.builder();
        for (Object obj : abstractC19875812pg) {
            if (!LIZLLL(obj).isInterface()) {
                c19876312plBuilder.LIZLLL(obj);
            }
        }
        return super.LIZIZ(c19876312plBuilder.LJI());
    }

    @Override // X.AbstractC19877412pw
    public final Iterable<Object> LIZJ(Object obj) {
        return AbstractC19875112pZ.of();
    }
}
