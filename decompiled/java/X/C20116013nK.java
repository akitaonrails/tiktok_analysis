package X;

/* JADX INFO: renamed from: X.13nK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20116013nK {
    public String LIZ;
    public C1154750g9h LIZIZ;
    public long LIZJ;
    public Integer LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public final boolean LJIIIZ;
    public InterfaceC20114913n9 LJIIJ;
    public boolean LJIIJJI;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[loaderConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dynamic=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",onlyLocal=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(",bundle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", group=");
        sbLIZ.append((Object) this.LJII);
        sbLIZ.append(",cdnUrl=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(",enableCached:");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20116013nK(String str) {
        this.LIZ = str;
        this.LIZIZ = new C1154750g9h();
        this.LIZJ = 1000L;
        this.LJFF = "";
        this.LJI = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = true;
        this.LJIIJJI = true;
    }

    public void LIZ(C20116013nK c20116013nK) {
        this.LIZIZ = c20116013nK.LIZIZ;
        this.LIZJ = c20116013nK.LIZJ;
        this.LIZLLL = c20116013nK.LIZLLL;
        this.LJ = c20116013nK.LJ;
        this.LJFF = c20116013nK.LJFF;
        this.LJI = c20116013nK.LJI;
        this.LJII = c20116013nK.LJII;
        this.LJIIIIZZ = c20116013nK.LJIIIIZZ;
        this.LJIIJ = c20116013nK.LJIIJ;
        this.LJIIJJI = c20116013nK.LJIIJJI;
    }

    public /* synthetic */ C20116013nK(int i) {
        this("");
    }
}
