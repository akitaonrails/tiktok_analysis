package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0ObR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622590ObR extends AbstractC624280OeA<C622610ObT> {
    public static String LJII;
    public static boolean LJIIIZ;
    public static final C622590ObR LJI = new C622590ObR();
    public static final C0OPG LJIIIIZZ = new C0OPG();

    public C622590ObR() {
        super("inbox_enter_cell_perf");
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
        c2241008qG.LIZLLL("is_preload", LJIIIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2241008qG.LIZLLL("enter_from", "brand_partnership_page");
        C20684815ws.LJIJ(str, c2241008qG.LJ());
    }

    @Override // X.AbstractC624280OeA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        LJIIIIZZ.LIZLLL();
        LJIIIZ = false;
        LJII = null;
    }

    public final void LJIIIZ(String str) {
        if (LJ()) {
            LJII = str;
            LJIIIIZZ.LIZIZ();
            LJII();
            LJIIIIZZ();
        }
    }
}
