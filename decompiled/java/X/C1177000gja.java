package X;

import android.view.View;

/* JADX INFO: renamed from: X.0gja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177000gja {
    public final String LIZ;
    public final View LIZIZ;
    public final C1177960gl8 LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final EnumC1177490gkN LJIIIZ;
    public C1176520gio LJIIJ;

    public final C1176520gio LIZ(InterfaceC1177250gjz interfaceC1177250gjz) {
        C1177080gji c1177080gjiLJIIJ = interfaceC1177250gjz.LJIIJ(this.LIZJ);
        int measuredWidth = this.LIZIZ.getMeasuredWidth();
        int measuredHeight = this.LIZIZ.getMeasuredHeight();
        double d = c1177080gjiLJIIJ.LIZ - ((double) (this.LIZLLL * measuredWidth));
        double d2 = c1177080gjiLJIIJ.LIZIZ - ((double) (this.LJ * measuredHeight));
        return new C1176520gio(d, d2, d + ((double) measuredWidth), d2 + ((double) measuredHeight));
    }

    public C1177000gja(String str, View view, C1177960gl8 c1177960gl8, float f, float f2, boolean z, boolean z2, boolean z3, EnumC1177490gkN enumC1177490gkN, int i) {
        boolean z4;
        f = (i & 8) != 0 ? 0.5f : f;
        f2 = (i & 16) != 0 ? 1.0f : f2;
        if ((i & 32) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z = (i & 64) != 0 ? false : z;
        z2 = (i & 128) != 0 ? false : z2;
        z3 = (i & 256) != 0 ? false : z3;
        this.LIZ = str;
        this.LIZIZ = view;
        this.LIZJ = c1177960gl8;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = z4;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = enumC1177490gkN;
    }
}
