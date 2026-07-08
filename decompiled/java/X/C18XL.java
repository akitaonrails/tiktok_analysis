package X;

/* JADX INFO: renamed from: X.18XL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18XL {
    public C18XH LIZ;
    public C18XH LIZIZ;
    public C18XH LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final Integer LJI;
    public final Integer LJII;
    public final AbstractC1776520wKY LJIIIIZZ;

    public static C18XL LIZ(C18XL c18xl, C18XH c18xh, C18XH c18xh2, C18XH c18xh3, String str, boolean z, boolean z2, int i) {
        Integer num;
        Integer num2;
        boolean z3 = z2;
        boolean z4 = z;
        String str2 = str;
        C18XH c18xh4 = c18xh3;
        C18XH c18xh5 = c18xh2;
        C18XH c18xh6 = c18xh;
        if ((i & 1) != 0) {
            c18xh6 = c18xl.LIZ;
        }
        if ((i & 2) != 0) {
            c18xh5 = c18xl.LIZIZ;
        }
        if ((i & 4) != 0) {
            c18xh4 = c18xl.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c18xl.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c18xl.LJ;
        }
        if ((i & 32) != 0) {
            z3 = c18xl.LJFF;
        }
        AbstractC1776520wKY abstractC1776520wKY = null;
        if ((i & 64) != 0) {
            num = c18xl.LJI;
        } else {
            num = null;
        }
        if ((i & 128) != 0) {
            num2 = c18xl.LJII;
        } else {
            num2 = null;
        }
        if ((i & 256) != 0) {
            abstractC1776520wKY = c18xl.LJIIIIZZ;
        }
        c18xl.getClass();
        return new C18XL(c18xh6, c18xh5, c18xh4, str2, z4, z3, num, num2, abstractC1776520wKY);
    }

    public C18XL(C18XH c18xh, C18XH c18xh2, C18XH c18xh3, String str, boolean z, boolean z2, Integer num, Integer num2, AbstractC1776520wKY abstractC1776520wKY) {
        this.LIZ = c18xh;
        this.LIZIZ = c18xh2;
        this.LIZJ = c18xh3;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = num;
        this.LJII = num2;
        this.LJIIIIZZ = abstractC1776520wKY;
    }
}
