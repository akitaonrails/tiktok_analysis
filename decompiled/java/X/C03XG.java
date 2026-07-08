package X;

/* JADX INFO: renamed from: X.03XG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XG {
    public final String LIZ;
    public final C03RW LIZIZ;
    public final C03R6 LIZJ;
    public final Integer LIZLLL;

    public C03XG(String str, C03RW c03rw, C03R6 c03r6, Integer num, int i) {
        str = (i & 1) != 0 ? null : str;
        c03rw = (i & 2) != 0 ? null : c03rw;
        c03r6 = (i & 8) != 0 ? null : c03r6;
        num = (i & 16) != 0 ? null : num;
        this.LIZ = str;
        this.LIZIZ = c03rw;
        this.LIZJ = c03r6;
        this.LIZLLL = num;
    }
}
