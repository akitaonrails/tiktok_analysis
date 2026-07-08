package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20031013Zc implements InterfaceC1680530tpj, Iterable<Object>, C03W4 {
    public final C13ZI LL;
    public final int LLILLJJLI;
    public final C20031613Zi LLILLL;
    public final AbstractC20035913aP LLILZ;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C13ZS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    public C20031013Zc(C13ZI c13zi, int i, C20031613Zi c20031613Zi, C20035613aM c20035613aM) {
        this.LL = c13zi;
        this.LLILLJJLI = i;
        this.LLILLL = c20031613Zi;
        this.LLILZ = c20035613aM;
    }
}
