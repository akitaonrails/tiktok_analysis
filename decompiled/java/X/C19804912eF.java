package X;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.12eF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19804912eF extends AbstractC19810512f9 {
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public String LJFF;
    public long LJI;
    public final long LJII;
    public List<String> LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public long LJIILJJIL;
    public String LJIILL;

    @Override // X.AbstractC19810512f9
    public final boolean LJIILL() {
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0053. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804912eF.LJIJJ():void");
    }

    public final String LJIILLIIL() {
        LJIIJJI();
        C0W3J.LJIIIIZZ(this.LIZJ);
        return this.LIZJ;
    }

    public final String LJIIZILJ() {
        LJ();
        LJIIJJI();
        C0W3J.LJIIIIZZ(this.LJIIJJI);
        return this.LJIIJJI;
    }

    public final void LJIJI() {
        String strK4;
        LJ();
        if (LIZIZ().LJIJJLI().LJIIIZ(EnumC19776112Zb.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            LIZJ().LJLIL().nextBytes(bArr);
            strK4 = C786410Ut5.k4(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        } else {
            LJIILJJIL().LJIIL.LIZJ("Analytics Storage consent is not granted");
            strK4 = null;
        }
        C19811612fK c19811612fK = LJIILJJIL().LJIIL;
        Object[] objArr = new Object[1];
        objArr[0] = strK4 == null ? "null" : "not null";
        c19811612fK.LIZJ(C786410Ut5.j4("Resetting session stitching token to %s", objArr));
        this.LJIILIIL = strK4;
        this.LIZ.LJIILIIL.getClass();
        this.LJIILJJIL = System.currentTimeMillis();
    }

    public C19804912eF(C19804712eD c19804712eD, long j) {
        super(c19804712eD);
        this.LJII = j;
    }
}
