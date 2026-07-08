package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.06uF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1756106uF implements InterfaceC1757206uQ, InterfaceC1757406uS {
    public final String LIZ;
    public C1DW6 LIZIZ;

    @Override // X.InterfaceC1757206uQ
    public final void LJI() {
        this.LIZIZ = null;
        C1756906uN c1756906uNRemove = C1756206uG.LIZ.remove(this.LIZ);
        if (c1756906uNRemove != null) {
            c1756906uNRemove.LIZIZ.remove(this);
        }
    }

    @Override // X.InterfaceC1757206uQ
    public final void refresh() {
    }

    public C1756106uF(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1757206uQ
    public final void LIZ(C1DW6 c1dw6) {
        C1756906uN c1756906uNPutIfAbsent;
        this.LIZIZ = c1dw6;
        String str = this.LIZ;
        ConcurrentHashMap<String, C1756906uN> concurrentHashMap = C1756206uG.LIZ;
        C1756906uN c1756906uN = concurrentHashMap.get(str);
        if (c1756906uN == null && (c1756906uNPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1756906uN = new C1756906uN()))) != null) {
            c1756906uN = c1756906uNPutIfAbsent;
        }
        C1756906uN c1756906uN2 = c1756906uN;
        if (!c1756906uN2.LIZIZ.contains(this)) {
            c1756906uN2.LIZIZ.add(this);
        }
    }

    @Override // X.InterfaceC1757406uS
    public final void LIZIZ(C869590Y9l c869590Y9l) {
        C1DW6 c1dw6 = this.LIZIZ;
        if (c1dw6 != null) {
            c1dw6.gb(new C0Y3I("fake message"), C1697810uHb.LJIILJJIL(c869590Y9l), null, -1);
        }
    }

    @Override // X.InterfaceC1757406uS
    public final void LIZJ(C869590Y9l c869590Y9l) {
        C1DW6 c1dw6 = this.LIZIZ;
        if (c1dw6 != null) {
            c1dw6.mf(c869590Y9l);
        }
    }
}
