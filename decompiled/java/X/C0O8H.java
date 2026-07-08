package X;

/* JADX INFO: renamed from: X.0O8H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8H implements C0O8Q {
    public static final C0O7Q LIZJ = new C0O8V<C0O8H>() { // from class: X.0O7Q
    };
    public final AbstractC614100O6u LIZIZ;

    @Override // X.C0O8Q
    public final C0O8V<?> getKey() {
        return LIZJ;
    }

    public C0O8H(AbstractC614100O6u abstractC614100O6u) {
        this.LIZIZ = abstractC614100O6u;
    }

    @Override // X.C0O8Q, X.C0O8O
    public final <E extends C0O8Q> E LIZ(C0O8V<E> c0o8v) {
        return (E) C0O8N.LIZ(this, c0o8v);
    }

    @Override // X.C0O8O
    public final C0O8O LIZIZ(C0O8V<?> c0o8v) {
        return C0O8N.LIZIZ(this, c0o8v);
    }

    @Override // X.C0O8O
    public final C0O8O LIZJ(C0O8Q c0o8q) {
        return C0O8T.LIZ(this, c0o8q);
    }

    @Override // X.C0O8O
    public final Object LIZLLL(Object obj, C0O8S c0o8s) {
        return c0o8s.invoke(obj, this);
    }
}
