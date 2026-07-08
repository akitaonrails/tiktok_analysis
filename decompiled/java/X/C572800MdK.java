package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572800MdK {
    public String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public int LJJ;
    public long LJJI;
    public boolean LJJIFFI;
    public Function0<Long> LJJII;
    public int LJJIJ;
    public String LJIILJJIL = "";
    public String LJJIII = "";
    public String LJJIIJ = "";
    public String LJJIIJZLJL = "";
    public String LJJIIZ = "";
    public String LJJIIZI = "";

    public final void LIZJ() {
        this.LJJIJ = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572800MdK.LJI():void");
    }

    public final void LIZIZ() {
        if (this.LJJIFFI) {
            return;
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LIZJ = 1;
    }

    public final void LIZLLL() {
        long j = this.LJJI;
        if (j <= 0) {
            return;
        }
        Function0<Long> function0 = this.LJJII;
        long jLongValue = function0 != null ? function0.invoke().longValue() : 0L;
        if (jLongValue < j) {
            jLongValue = System.currentTimeMillis();
        }
        this.LJII = j;
        this.LJIIIIZZ = jLongValue;
        this.LIZJ = 1;
        this.LJJIFFI = true;
        this.LJJI = 0L;
        this.LJJII = null;
    }

    public final void LIZ() {
        this.LJIIL = System.currentTimeMillis();
        this.LJ = 1;
    }

    public final void LJIIIZ() {
        this.LJIIJJI = System.currentTimeMillis();
    }

    public final void LJIIJ() {
        this.LJII = System.currentTimeMillis();
    }

    public final void LJIIJJI() {
        this.LJIIIZ = System.currentTimeMillis();
    }

    public final void LJ(boolean z, Exception exc) {
        int cronetInternalErrorCode;
        if (exc instanceof C0XIR) {
            cronetInternalErrorCode = ((C23112093u) exc).getErrorCode();
        } else if (exc instanceof C1494430ozZ) {
            cronetInternalErrorCode = ((C1494430ozZ) exc).getStatusCode();
        } else if (exc instanceof C1811850xFX) {
            cronetInternalErrorCode = ((C1811850xFX) exc).statusCode;
        } else if (exc instanceof C1494450ozb) {
            cronetInternalErrorCode = ((C1494450ozb) exc).getCronetInternalErrorCode();
        } else if (exc instanceof C1494690ozz) {
            cronetInternalErrorCode = ((C1494690ozz) exc).getCronetInternalErrorCode();
        } else {
            cronetInternalErrorCode = -1;
        }
        this.LJIILIIL = cronetInternalErrorCode;
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        this.LJIILJJIL = message;
        if (z && ((Boolean) C04RB.LIZ.getValue()).booleanValue()) {
            return;
        }
        LJI();
        this.LIZ = "";
    }

    public final void LJIIIIZZ(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0;
        this.LJIILJJIL = "";
        this.LJIILL = 0;
        this.LJJIFFI = false;
        this.LJJIII = "";
        this.LJJIIJ = "";
        this.LJJIIJZLJL = "";
        this.LJJIIZ = "";
        this.LJJIIZI = "";
        this.LJIILLIIL = z ? 1 : 0;
        this.LJIJJ = true;
        this.LJFF = System.currentTimeMillis();
    }

    public final void LJII(String str, String str2, String str3) {
        String str4;
        String str5;
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        this.LJJIII = str4;
        if ((!Intrinsics.LJFF(str, "page") && !Intrinsics.LJFF(str, "preview_card")) || str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        this.LJJIIJ = str5;
        if (str2 == null) {
            str2 = "";
        }
        this.LJJIIJZLJL = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.LJJIIZI = str3;
    }
}
