package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20509915Nh {
    public final boolean LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Unit> LIZJ;
    public boolean LIZLLL;
    public final AwS645S0100000_31 LJ = new AwS645S0100000_31(this, 53);

    public final void LIZ() {
        C20510015Ni c20510015Ni = C20510015Ni.LIZ;
        if (c20510015Ni.LJIIIIZZ() || this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        c20510015Ni.LJII(this.LJ);
    }

    public final void LIZIZ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            C20510015Ni.LIZ.LIZJ(this.LJ);
        }
    }

    public C20509915Nh(Function0 function0, Function0 function02, boolean z) {
        this.LIZ = z;
        this.LIZIZ = function0;
        this.LIZJ = function02;
    }
}
