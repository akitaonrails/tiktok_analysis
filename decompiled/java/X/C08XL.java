package X;

import cs.bd.o.q;

/* JADX INFO: renamed from: X.08XL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08XL extends q.a<C08XL> {
    public C08XL(String str, String str2) {
        super(str, str2);
    }

    public final C08XM LIZIZ() {
        if (this.LJIIJ == -1 || this.LJIIJJI == 99999) {
            throw new IllegalArgumentException("CSConfig init error!");
        }
        if (this.LJIIIZ != -1) {
            return new C08XM(this);
        }
        throw new IllegalArgumentException("CSConfig init error");
    }
}
