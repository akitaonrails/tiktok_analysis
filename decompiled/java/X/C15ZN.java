package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS184S0101000_31;

/* JADX INFO: renamed from: X.15ZN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZN extends C15ZY {
    public final Function0<Unit> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Function0<Integer> LJIIJ;
    public final C15ZL LJIIJJI;
    public final Function0<Integer> LJIIL;
    public final AwS184S0101000_31 LJIILIIL;

    @Override // X.C15ZW
    public final Function2<C20540515Zb, C15ZW, Unit> LIZ() {
        return this.LJIILIIL;
    }

    @Override // X.C15ZY
    public final Function0<Integer> LJ() {
        return this.LJIIL;
    }

    @Override // X.C15ZW
    public final boolean LIZIZ(C15ZP c15zp) {
        C15ZL c15zl;
        C15ZM c15zm;
        if ((c15zp instanceof C15ZL) && (c15zl = (C15ZL) c15zp) != null && (c15zm = c15zl.LIZJ) != null && c15zm.LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.C15ZW
    public final boolean LIZJ(C15ZP c15zp) {
        boolean z;
        C15ZL c15zl;
        if ((c15zp instanceof C15ZL) && (c15zl = (C15ZL) c15zp) != null && c15zl.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public C15ZN(C15ZP c15zp, Function0 function0, String str, String str2, Function0 function02, int i) {
        C15ZL c15zl;
        super(str, str2, 1);
        this.LJII = function0;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
        this.LJIIJ = function02;
        if (c15zp instanceof C15ZL) {
            c15zl = (C15ZL) c15zp;
        } else {
            c15zl = null;
        }
        this.LJIIJJI = c15zl;
        this.LJIIL = function02;
        this.LJIILIIL = new AwS184S0101000_31(this, i, 0);
    }
}
