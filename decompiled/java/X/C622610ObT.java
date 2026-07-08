package X;

/* JADX INFO: renamed from: X.0ObT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622610ObT extends AbstractC624280OeA<C622610ObT> {
    public static String LJII;
    public static String LJIIIZ;
    public static final C622610ObT LJI = new C622610ObT();
    public static final C0OPG LJIIIIZZ = new C0OPG();

    public C622610ObT() {
        super("activity_change_tab_perf");
    }

    @Override // X.AbstractC624280OeA
    public final void LJII() {
        String str = this.LIZ;
        C2241008qG c2241008qG = new C2241008qG();
        String str2 = LJII;
        if (str2 == null) {
            str2 = "";
        }
        c2241008qG.LIZLLL("state", str2);
        c2241008qG.LIZJ(Long.valueOf(LJIIIIZZ.LIZ()), "total_time");
        c2241008qG.LIZLLL("tab_name", LJIIIZ);
        C20684815ws.LJIJ(str, c2241008qG.LJ());
    }

    @Override // X.AbstractC624280OeA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        LJIIIIZZ.LIZLLL();
        LJIIIZ = null;
        LJII = null;
    }
}
