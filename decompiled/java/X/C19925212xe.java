package X;

import X.AbstractC19924712xZ;

/* JADX INFO: renamed from: X.12xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19925212xe<T extends AbstractC19924712xZ<T, ?>> extends AbstractC19925812xk<T> {
    public final T LIZIZ;

    public C19925212xe(T t) {
        this.LIZIZ = t;
    }

    @Override // X.InterfaceC19925712xj
    public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return AbstractC19924712xZ.parsePartialFrom(this.LIZIZ, abstractC19927312xz, c19926312xp);
    }

    @Override // X.AbstractC19925812xk
    public final InterfaceC19925612xi LJIILJJIL(byte[] bArr, int i, C19926312xp c19926312xp) {
        return AbstractC19924712xZ.parsePartialFrom(this.LIZIZ, bArr, 0, i, c19926312xp);
    }
}
