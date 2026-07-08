package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Rpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707960Rpq {
    public final C13E8<C707900Rpk> LIZ = new C13E8<>();
    public final C13E8<C707890Rpj> LIZIZ = new C13E8<>();
    public final C13E8<C707890Rpj> LIZJ = new C13E8<>();
    public final C13E8<C707890Rpj> LIZLLL = new C13E8<>();
    public final C13E8<C707920Rpm> LJ = new C13E8<>();
    public final C13E8<C707980Rps> LJFF = new C13E8<>();
    public final C13E8<List<C707890Rpj>> LJI = new C13E8<>();

    public final C707920Rpm LIZ() {
        C707920Rpm c707920RpmLJIIZILJ = this.LJ.LJIIZILJ();
        return c707920RpmLJIIZILJ == null ? new C707920Rpm(0) : c707920RpmLJIIZILJ;
    }

    public final C707980Rps LIZIZ() {
        C707980Rps c707980RpsLJIIZILJ = this.LJFF.LJIIZILJ();
        return c707980RpsLJIIZILJ == null ? new C707980Rps(null) : c707980RpsLJIIZILJ;
    }

    public final void LIZJ(C707920Rpm c707920Rpm) {
        if (c707920Rpm == null) {
            return;
        }
        C707980Rps c707980Rps = c707920Rpm.LIZIZ;
        if (c707980Rps != null) {
            c707980Rps.LIZ = null;
            c707980Rps.LIZIZ = null;
            if (this.LJFF.size() < 800) {
                this.LJFF.addLast(c707980Rps);
            }
        }
        c707920Rpm.LIZ = null;
        c707920Rpm.LIZIZ = null;
        if (this.LJ.size() < 800) {
            this.LJ.addLast(c707920Rpm);
        }
    }
}
