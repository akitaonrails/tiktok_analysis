package X;

import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686480tzK {
    public static final long LJIJ;
    public static final /* synthetic */ int LJIJI = 0;
    public final InterfaceC497601wk LIZ;
    public final InterfaceC1681130tqh LIZIZ;
    public final Function0<Unit> LIZJ;
    public InterfaceC1675680thu<Float> LIZLLL;
    public InterfaceC1675680thu<C1676820tjk> LJ;
    public InterfaceC1675680thu<Float> LJFF;
    public boolean LJI;
    public final C05P0 LJII;
    public final C05P0 LJIIIIZZ;
    public final C05P0 LJIIIZ;
    public final C05P0 LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public C1695970uEd LJIILIIL;
    public final C1677480tko<C1676820tjk, C1677270tkT> LJIILJJIL;
    public final C1677480tko<Float, C1677280tkU> LJIILL;
    public final C05P0 LJIILLIIL;
    public long LJIIZILJ;

    public final void LIZ() {
        C1695970uEd c1695970uEd = this.LJIILIIL;
        InterfaceC1675680thu<Float> interfaceC1675680thu = this.LIZLLL;
        if (((Boolean) ((C13FE) this.LJIIIIZZ).getValue()).booleanValue() || interfaceC1675680thu == null || c1695970uEd == null) {
            if (LIZIZ()) {
                if (c1695970uEd != null) {
                    c1695970uEd.LJI(1.0f);
                }
                C23250099c.LIZLLL(this.LIZ, null, null, new C1686510tzN(this, null), 3);
                return;
            }
            return;
        }
        LIZLLL(true);
        boolean z = !LIZIZ();
        if (z) {
            c1695970uEd.LJI(0.0f);
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1686490tzL(z, this, interfaceC1675680thu, c1695970uEd, null), 3);
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LJIIIZ.getValue()).booleanValue();
    }

    public final void LIZJ() {
        InterfaceC1681130tqh interfaceC1681130tqh;
        if (((Boolean) ((C13FE) this.LJII).getValue()).booleanValue()) {
            LJFF(false);
            C23250099c.LIZLLL(this.LIZ, null, null, new C1686450tzH(this, null), 3);
        }
        if (((Boolean) ((C13FE) this.LJIIIIZZ).getValue()).booleanValue()) {
            LIZLLL(false);
            C23250099c.LIZLLL(this.LIZ, null, null, new C1686460tzI(this, null), 3);
        }
        if (LIZIZ()) {
            LJ(false);
            C23250099c.LIZLLL(this.LIZ, null, null, new C1686470tzJ(this, null), 3);
        }
        this.LJI = false;
        LJI(0L);
        this.LJIIJJI = LJIJ;
        C1695970uEd c1695970uEd = this.LJIILIIL;
        if (c1695970uEd != null && (interfaceC1681130tqh = this.LIZIZ) != null) {
            interfaceC1681130tqh.LIZ(c1695970uEd);
        }
        this.LJIILIIL = null;
        this.LIZLLL = null;
        this.LJFF = null;
        this.LJ = null;
    }

    static {
        long j = Integer.MAX_VALUE;
        LJIJ = (j & 4294967295L) | (j << 32);
    }

    public final void LIZLLL(boolean z) {
        ((C13FE) this.LJIIIIZZ).setValue(Boolean.valueOf(z));
    }

    public final void LJ(boolean z) {
        ((C13FE) this.LJIIIZ).setValue(Boolean.valueOf(z));
    }

    public final void LJFF(boolean z) {
        ((C13FE) this.LJII).setValue(Boolean.valueOf(z));
    }

    public final void LJI(long j) {
        ((C13FE) this.LJIILLIIL).setValue(new C1676820tjk(j));
    }

    public C1686480tzK(InterfaceC497601wk interfaceC497601wk, InterfaceC1681130tqh interfaceC1681130tqh, AwS569S0100000_25 awS569S0100000_25) {
        C1695970uEd c1695970uEdLIZIZ;
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = interfaceC1681130tqh;
        this.LIZJ = awS569S0100000_25;
        Boolean bool = Boolean.FALSE;
        this.LJII = C20028913Yh.LJI(bool);
        this.LJIIIIZZ = C20028913Yh.LJI(bool);
        this.LJIIIZ = C20028913Yh.LJI(bool);
        this.LJIIJ = C20028913Yh.LJI(bool);
        long j = LJIJ;
        this.LJIIJJI = j;
        this.LJIIL = 0L;
        Object obj = null;
        if (interfaceC1681130tqh != null) {
            c1695970uEdLIZIZ = interfaceC1681130tqh.LIZIZ();
        } else {
            c1695970uEdLIZIZ = null;
        }
        this.LJIILIIL = c1695970uEdLIZIZ;
        int i = 12;
        this.LJIILJJIL = new C1677480tko<>(new C1676820tjk(0L), n2.LJI, obj, i);
        this.LJIILL = new C1677480tko<>(Float.valueOf(1.0f), n2.LIZ, obj, i);
        this.LJIILLIIL = C20028913Yh.LJI(new C1676820tjk(0L));
        this.LJIIZILJ = j;
    }
}
