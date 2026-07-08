package X;

import X.InterfaceC613740O5k;

/* JADX INFO: renamed from: X.0O8D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8D<DTO, PO, Q extends InterfaceC613740O5k<DTO>> implements C0O8Q {
    public static final C0O8U LIZJ = new C0O8V<C0O8D<?, ?, ?>>() { // from class: X.0O8U
    };
    public final C0O70<DTO, PO, Q> LIZIZ;

    @Override // X.C0O8Q
    public final C0O8V<?> getKey() {
        return LIZJ;
    }

    public C0O8D(C0O70<DTO, PO, Q> c0o70) {
        this.LIZIZ = c0o70;
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
