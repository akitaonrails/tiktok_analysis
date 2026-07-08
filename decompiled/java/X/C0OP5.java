package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0OP5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OP5 extends AbstractC624280OeA<C0OP5> {
    public static final C0OP5 LJI = new C0OP5();
    public static final C0OPG LJII = new C0OPG();
    public static final C0OPG LJIIIIZZ = new C0OPG();
    public static final C0OPG LJIIIZ = new C0OPG();
    public static String LJIIJ = "";
    public static int LJIIJJI = -1;
    public static final Map<String, Integer> LJIIL = new LinkedHashMap();
    public static final Map<String, String> LJIILIIL = new LinkedHashMap();
    public static String LJIILJJIL = "";
    public static boolean LJIILL;

    public C0OP5() {
        super("bulletin_create_page_event");
    }

    @Override // X.AbstractC624280OeA
    public final void LJII() {
        String str = LJI.LIZ;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZJ(Long.valueOf(LJIIIIZZ.LIZ()), "stay_time");
        c2241008qG.LIZJ(Long.valueOf(LJII.LIZ()), "enter_total_time");
        c2241008qG.LIZJ(Long.valueOf(LJIIIZ.LIZ()), "stay_time_include_enter");
        c2241008qG.LIZIZ(Integer.valueOf(LJIIJJI), "create_state");
        c2241008qG.LIZLLL("enter_method", LJIIJ);
        c2241008qG.LIZLLL("last_click_view", LJIILJJIL);
        for (Map.Entry entry : ((LinkedHashMap) LJIIL).entrySet()) {
            c2241008qG.LIZIZ((Integer) entry.getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) LJIILIIL).entrySet()) {
            c2241008qG.LIZLLL((String) entry2.getKey(), (String) entry2.getValue());
        }
        C20684815ws.LJIJ(str, c2241008qG.LJ());
    }

    @Override // X.AbstractC624280OeA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        LJII.LIZLLL();
        LJIIIIZZ.LIZLLL();
        LJIIIZ.LIZLLL();
        ((LinkedHashMap) LJIIL).clear();
        ((LinkedHashMap) LJIILIIL).clear();
        LJIIJJI = -1;
        LJIIJ = "";
        LJIILJJIL = "";
        LJIILL = false;
    }

    public final void LJIIJ() {
        if (LJI()) {
            LJII.LIZIZ();
            LJIIIIZZ.LIZJ();
        }
    }

    public final void LJIIIZ(int i) {
        if (LJ()) {
            LJIIIIZZ.LIZIZ();
            LJIIIZ.LIZIZ();
            if (LJIILL && i == 0) {
                i = 2;
            }
            LJIIJJI = i;
            LJII();
        }
    }

    public final void LJIIJJI(String str) {
        if (LJI()) {
            LJIILJJIL = str;
        }
    }

    public final void LJIIL(int i, String str) {
        if (LJI()) {
            LJIIL.put(str, Integer.valueOf(i));
        }
    }
}
