package X;

/* JADX INFO: renamed from: X.1CvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245821CvE {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public final String LIZ() {
        if (this.LIZ) {
            return "horizontal_mode";
        }
        if (this.LIZIZ) {
            return "comment_panel";
        }
        if (this.LIZJ) {
            return "long_press_panel";
        }
        if (this.LIZLLL) {
            return "share_panel";
        }
        if (this.LJ) {
            return "mini_window";
        }
        if (this.LJFF) {
            return "drag_status";
        }
        if (this.LJII) {
            return "clear_mode";
        }
        if (this.LJIIIIZZ) {
            return "edge_speed_mode";
        }
        return null;
    }

    public final boolean LIZIZ() {
        boolean zLIZ = C587970N4h.LIZ();
        this.LJII = zLIZ;
        return this.LIZIZ || this.LIZJ || this.LIZLLL || this.LIZ || this.LJ || this.LJFF || this.LJI || zLIZ || this.LJIIIIZZ;
    }

    public final boolean LIZJ() {
        boolean zLIZ = C587970N4h.LIZ();
        this.LJII = zLIZ;
        return this.LIZIZ || this.LIZJ || this.LIZLLL || this.LIZ || this.LJ || this.LJI || zLIZ || this.LJIIIIZZ;
    }
}
