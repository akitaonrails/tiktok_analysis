package X;

/* JADX INFO: renamed from: X.0O8P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8P implements C0O8O {
    public final C0O8O LIZIZ;
    public final C0O8Q LIZJ;

    @Override // X.C0O8O
    public final <E extends C0O8Q> E LIZ(C0O8V<E> c0o8v) {
        C0O8P c0o8p = this;
        while (true) {
            E e = (E) c0o8p.LIZJ.LIZ(c0o8v);
            if (e != null) {
                return e;
            }
            C0O8O c0o8o = c0o8p.LIZIZ;
            if (c0o8o instanceof C0O8P) {
                c0o8p = (C0O8P) c0o8o;
            } else {
                return (E) c0o8o.LIZ(c0o8v);
            }
        }
    }

    @Override // X.C0O8O
    public final C0O8O LIZIZ(C0O8V<?> c0o8v) {
        if (this.LIZJ.LIZ(c0o8v) != null) {
            return this.LIZIZ;
        }
        C0O8O c0o8oLIZIZ = this.LIZIZ.LIZIZ(c0o8v);
        if (c0o8oLIZIZ == this.LIZIZ) {
            return this;
        }
        if (c0o8oLIZIZ == C0O8R.LIZIZ) {
            return this.LIZJ;
        }
        return new C0O8P(this.LIZJ, c0o8oLIZIZ);
    }

    @Override // X.C0O8O
    public final C0O8O LIZJ(C0O8Q c0o8q) {
        return C0O8T.LIZ(this, c0o8q);
    }

    public C0O8P(C0O8Q c0o8q, C0O8O c0o8o) {
        this.LIZIZ = c0o8o;
        this.LIZJ = c0o8q;
    }

    @Override // X.C0O8O
    public final Object LIZLLL(Object obj, C0O8S c0o8s) {
        return c0o8s.invoke(this.LIZIZ.LIZLLL(obj, c0o8s), this.LIZJ);
    }
}
