package X;

/* JADX INFO: renamed from: X.0iih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253330iih {
    public static final /* synthetic */ int LIZLLL = 0;
    public C1253340iii LIZ;
    public final String LIZIZ;
    public final InterfaceC1253320iig LIZJ;

    public final void LIZIZ(int i) {
        C1253340iii c1253340iii = this.LIZ;
        if (c1253340iii != null) {
            c1253340iii.LIZJ = System.currentTimeMillis();
        }
        this.LIZJ.LIZ(i);
        this.LIZ = null;
    }

    public final void LIZ(int i, boolean z) {
        C1253340iii c1253340iii = this.LIZ;
        if (c1253340iii != null) {
            c1253340iii.LIZLLL = System.currentTimeMillis();
        }
        if (!z) {
            C1253340iii c1253340iii2 = this.LIZ;
            if (c1253340iii2 != null) {
                long j = c1253340iii2.LIZJ;
                long j2 = c1253340iii2.LIZIZ;
                if (1 <= j2 && j2 < j && j - j2 >= 0 && c1253340iii2 != null) {
                    long j3 = c1253340iii2.LIZIZ;
                    long j4 = c1253340iii2.LIZ;
                    if (1 <= j4 && j4 < j3 && j3 - j4 >= 0 && c1253340iii2 != null) {
                        long j5 = c1253340iii2.LIZLLL;
                        long j6 = c1253340iii2.LIZJ;
                        if (1 > j6 || j6 >= j5 || j5 - j6 < 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.LIZJ.LIZ(i);
        this.LIZ = null;
    }

    public C1253330iih(C1253340iii c1253340iii, String str, InterfaceC1253320iig interfaceC1253320iig) {
        this.LIZ = c1253340iii;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1253320iig;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1253330iih.LIZJ(int, java.lang.String, boolean):void");
    }
}
