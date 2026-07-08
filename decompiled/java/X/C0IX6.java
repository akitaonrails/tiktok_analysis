package X;

/* JADX INFO: renamed from: X.0IX6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IX6 {
    public volatile int LJIJ;
    public int LIZ = 0;
    public volatile int LIZIZ = 0;
    public volatile String LIZJ = "";
    public volatile int LIZLLL = 0;
    public volatile String LJ = "-1";
    public volatile String LJFF = "-1";
    public volatile String LJI = "-1";
    public volatile String LJII = "-1";
    public volatile String LJIIIIZZ = "-1";
    public volatile int LJIIIZ = 0;
    public volatile long LJIIJ = 0;
    public volatile long LJIIJJI = 0;
    public volatile long LJIIL = 0;
    public volatile boolean LJIILIIL = false;
    public String LJIILJJIL = null;
    public int LJIILL = -1;
    public long LJIILLIIL = -1;
    public String LJIIZILJ = "2";
    public volatile long LJIJI = -1;

    public final void LIZ(int i) {
        if (i < this.LJIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pullStreamState will be update from ");
            sbLIZ.append(this.LJIJ);
            sbLIZ.append(" to ");
            sbLIZ.append(i);
            C20441214yg.LJ("LivePlayFullLinkManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJIJ = i;
    }
}
