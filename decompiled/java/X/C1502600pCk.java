package X;

import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0pCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502600pCk {
    public final int LIZ;
    public final String LIZIZ;
    public final C1502140pC0 LIZJ;
    public final C1293960jmE LIZLLL;
    public final Throwable LJ;

    public final long LIZ() {
        C1293960jmE c1293960jmE;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(String.valueOf(C13LP.LJJJLL(this.LIZJ.LIZ("Content-Length"))));
        if (lLJIILIIL == null && ((c1293960jmE = this.LIZLLL) == null || (lLJIILIIL = Long.valueOf(c1293960jmE.LLILLJJLI)) == null)) {
            return 0L;
        }
        return lLJIILIIL.longValue();
    }

    public final String LIZIZ() {
        C1293960jmE c1293960jmE = this.LIZLLL;
        if (c1293960jmE == null) {
            return "";
        }
        String str = c1293960jmE.LLIZLLLIL;
        if (str != null) {
            return str;
        }
        String str2 = new String(c1293960jmE.LIZ(), Charsets.UTF_8);
        c1293960jmE.LLIZLLLIL = str2;
        return str2;
    }

    public C1502600pCk(int i, String str, C1502140pC0 c1502140pC0, C1293960jmE c1293960jmE, Throwable th) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c1502140pC0;
        this.LIZLLL = c1293960jmE;
        this.LJ = th;
    }
}
