package X;

import X.InterfaceC613710O5h;

/* JADX INFO: renamed from: X.0O8B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8B<D extends InterfaceC613710O5h> implements C0O8Q {
    public static final C0O7I LIZJ = new C0O8V<C0O8B<?>>() { // from class: X.0O7I
    };
    public final InterfaceC613660O5c<D> LIZIZ;

    @Override // X.C0O8Q
    public final C0O8V<?> getKey() {
        return LIZJ;
    }

    public C0O8B(InterfaceC613660O5c<D> interfaceC613660O5c) {
        this.LIZIZ = interfaceC613660O5c;
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
