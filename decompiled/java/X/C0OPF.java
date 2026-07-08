package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0OPF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPF extends AbstractC624280OeA<C0OPF> {
    public static String LJIIJ;
    public static Integer LJIIJJI;
    public static int LJIILJJIL;
    public static final C0OPF LJI = new C0OPF();
    public static final C0OPG LJII = new C0OPG();
    public static final C0OPG LJIIIIZZ = new C0OPG();
    public static final Map<String, Integer> LJIIIZ = new LinkedHashMap();
    public static EnumC617060OIe LJIIL = EnumC617060OIe.INVALID;
    public static final C0OPG LJIILIIL = new C0OPG();
    public static String LJIILL = "";

    public C0OPF() {
        super("enter_bulletin_board_perf");
    }

    @Override // X.AbstractC624280OeA
    public final void LJII() {
        C0OPF c0opf = LJI;
        String str = c0opf.LIZ;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZIZ((Integer) ((LinkedHashMap) LJIIIZ).get(LJIIJ), "is_cold_launch");
        c2241008qG.LIZLLL("enter_from", c0opf.LIZJ);
        c2241008qG.LIZIZ(0, "is_preload");
        c2241008qG.LIZJ(Long.valueOf(LJII.LIZ()), "total_time");
        c2241008qG.LIZJ(Long.valueOf(LJIIIIZZ.LIZ()), "request_time");
        c2241008qG.LIZIZ(LJIIJJI, "load_state");
        c2241008qG.LIZLLL("is_author", LJIIL == EnumC617060OIe.IDENTITY_CREATOR ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2241008qG.LIZLLL("channel_id", LJIIJ);
        c2241008qG.LIZJ(Long.valueOf(LJIILIIL.LIZ()), "total_render_time");
        c2241008qG.LIZIZ(Integer.valueOf(LJIILJJIL), "card_count_in_first_screen");
        if (LJIILJJIL > 0) {
            c2241008qG.LIZLLL("first_screen_card_pages", LJIILL);
        }
        C20684815ws.LJIJ(str, c2241008qG.LJ());
    }

    @Override // X.AbstractC624280OeA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        LJII.LIZLLL();
        LJIIJJI = null;
        LJIIL = EnumC617060OIe.INVALID;
        LJIIJ = null;
    }

    public final void LJIIIZ(String str, EnumC617060OIe enumC617060OIe, int i, int i2, String str2) {
        if (LJ() && str != null) {
            Map<String, Integer> map = LJIIIZ;
            if (map.containsKey(str)) {
                map.put(str, 0);
            } else {
                map.put(str, 1);
            }
            LJIIJ = str;
            LJIIJJI = Integer.valueOf(i);
            LJIIL = enumC617060OIe;
            LJIILJJIL = i2;
            LJIILL = str2;
            LJIILIIL.LIZIZ();
            LJII();
        }
    }
}
