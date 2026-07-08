package X;

import jkp.j;

/* JADX INFO: renamed from: X.0thQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675380thQ {
    public final AbstractC1868100yiG LIZ;
    public final InterfaceC1665500tRU<C1675370thP> LIZIZ;
    public final String LIZJ;
    public final InterfaceC1664410tPj<String> LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C1675380thQ() {
        this(0);
    }

    public C1675380thQ(int i) {
        this(null, j.LLILLL, "", C19970913Bz.LLILZIL, "", false, false);
    }

    public C1675380thQ(AbstractC1868100yiG abstractC1868100yiG, InterfaceC1665500tRU<C1675370thP> interfaceC1665500tRU, String str, InterfaceC1664410tPj<String> interfaceC1664410tPj, String str2, boolean z, boolean z2) {
        this.LIZ = abstractC1868100yiG;
        this.LIZIZ = interfaceC1665500tRU;
        this.LIZJ = str;
        this.LIZLLL = interfaceC1664410tPj;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = z2;
    }

    public static C1675380thQ LIZ(C1675380thQ c1675380thQ, AbstractC1868100yiG abstractC1868100yiG, InterfaceC1665500tRU interfaceC1665500tRU, String str, InterfaceC1664410tPj interfaceC1664410tPj, String str2, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        String str3 = str2;
        InterfaceC1664410tPj interfaceC1664410tPj2 = interfaceC1664410tPj;
        String str4 = str;
        InterfaceC1665500tRU interfaceC1665500tRU2 = interfaceC1665500tRU;
        AbstractC1868100yiG abstractC1868100yiG2 = abstractC1868100yiG;
        if ((i & 1) != 0) {
            abstractC1868100yiG2 = c1675380thQ.LIZ;
        }
        if ((i & 2) != 0) {
            interfaceC1665500tRU2 = c1675380thQ.LIZIZ;
        }
        if ((i & 4) != 0) {
            str4 = c1675380thQ.LIZJ;
        }
        if ((i & 8) != 0) {
            interfaceC1664410tPj2 = c1675380thQ.LIZLLL;
        }
        if ((i & 16) != 0) {
            str3 = c1675380thQ.LJ;
        }
        if ((i & 32) != 0) {
            z4 = c1675380thQ.LJFF;
        }
        if ((i & 64) != 0) {
            z3 = c1675380thQ.LJI;
        }
        c1675380thQ.getClass();
        return new C1675380thQ(abstractC1868100yiG2, interfaceC1665500tRU2, str4, interfaceC1664410tPj2, str3, z4, z3);
    }
}
