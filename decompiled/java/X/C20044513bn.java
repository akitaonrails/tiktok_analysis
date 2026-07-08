package X;

/* JADX INFO: renamed from: X.13bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20044513bn {
    public final C20044813bq LIZ = new C20044813bq();
    public final C19991913Kb<Object, C20044813bq> LIZIZ = C19992013Kc.LIZIZ();
    public Object LIZJ;
    public C20044813bq LIZLLL;

    public final C20044813bq LIZ(Object obj) {
        C20044813bq c20044813bq = this.LIZLLL;
        if (this.LIZJ == obj && c20044813bq != null) {
            return c20044813bq;
        }
        C19991913Kb<Object, C20044813bq> c19991913Kb = this.LIZIZ;
        C20044813bq c20044813bqLIZLLL = c19991913Kb.LIZLLL(obj);
        if (c20044813bqLIZLLL == null) {
            C20044813bq c20044813bq2 = this.LIZ;
            c20044813bq2.getClass();
            c20044813bqLIZLLL = new C20044813bq();
            c20044813bqLIZLLL.LIZ = c20044813bq2.LIZ;
            c20044813bqLIZLLL.LIZIZ = c20044813bq2.LIZIZ;
            c19991913Kb.LJIIJJI(obj, c20044813bqLIZLLL);
        }
        C20044813bq c20044813bq3 = c20044813bqLIZLLL;
        this.LIZJ = obj;
        this.LIZLLL = c20044813bq3;
        return c20044813bq3;
    }
}
