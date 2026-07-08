package X;

import android.util.Log;

/* JADX INFO: renamed from: X.1DJG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DJG {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public long LJFF;
    public boolean LJIIIIZZ;
    public boolean LJI = true;
    public boolean LJII = true;
    public boolean LJIIIZ = true;
    public EnumC21617819iy LJIIJ = EnumC21617819iy.VIEW;
    public InterfaceC2189431AmT LJIIJJI = new InterfaceC2189431AmT() { // from class: X.0k5E
        @Override // X.InterfaceC2189431AmT
        public final void LIZ(int i, int i2, String str) {
            if (i > 0) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Focus done, cost: ");
                sbLIZ.append(i);
                sbLIZ.append("ms");
                C2183341Ace.LIZ("TEFocusNullCallback", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Focus failed, error code: ");
                sbLIZ2.append(i);
                sbLIZ2.append(", msg: ");
                sbLIZ2.append(str);
                C2183341Ace.LIZLLL("TEFocusNullCallback", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C2183341Ace.LIZ("Debug", Log.getStackTraceString(new Throwable()));
        }
    };

    public final int LIZ() {
        return (int) (System.currentTimeMillis() - this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TEFocusSettings{width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", x=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", need focus=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", need meter=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", lock=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", from user=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", CoordinatesMode=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1DJG(int i, int i2, int i3, int i4, float f) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = f;
    }
}
