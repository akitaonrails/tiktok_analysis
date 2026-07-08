package X;

/* JADX INFO: renamed from: X.134s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199520134s {
    public Object LIZ;
    public C199518134q LIZIZ;
    public C199522134u LIZJ = new C199522134u();
    public boolean LIZLLL;

    public final void finalize() {
        C199522134u c199522134u;
        C199518134q c199518134q = this.LIZIZ;
        if (c199518134q != null && !c199518134q.isDone()) {
            final String strConcat = "The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.LIZ));
            C199527134z c199527134z = new C199527134z(new Throwable(strConcat) { // from class: X.1352
                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
            AbstractC199513134l abstractC199513134l = C134X.LLILZLL;
            C199519134r c199519134r = c199518134q.LLILLJJLI;
            if (abstractC199513134l.LIZLLL(c199519134r, null, c199527134z)) {
                C134X.LIZIZ(c199519134r);
            }
        }
        if (this.LIZLLL || (c199522134u = this.LIZJ) == null) {
            return;
        }
        c199522134u.LJII(null);
    }

    public final void LIZ(Object obj) {
        this.LIZLLL = true;
        C199518134q c199518134q = this.LIZIZ;
        if (c199518134q != null) {
            C199519134r c199519134r = c199518134q.LLILLJJLI;
            c199519134r.getClass();
            if (obj == null) {
                obj = C134X.LLIZ;
            }
            if (C134X.LLILZLL.LIZLLL(c199519134r, null, obj)) {
                C134X.LIZIZ(c199519134r);
                this.LIZ = null;
                this.LIZIZ = null;
                this.LIZJ = null;
            }
        }
    }
}
