package X;

/* JADX INFO: renamed from: X.01VP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01VP {
    public static final C01VP LIZ = new C01VP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(202));

    public static C2344009Gk LIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("step", str);
        c2344009Gk.LJIIIIZZ("ids", str2);
        c2344009Gk.LJIIIIZZ("session_id", (String) LIZIZ.getValue());
        return c2344009Gk;
    }

    public static void LIZIZ(int i, String str, String str2, String str3) {
        C2344009Gk c2344009GkLIZ = LIZ("prefetch_completed", str);
        c2344009GkLIZ.LJIIIIZZ("strategy_key", str2);
        c2344009GkLIZ.LIZJ(i, "prefetch_success");
        c2344009GkLIZ.LJIIIIZZ("prefetch_error", str3);
        C20684815ws.LJIILLIIL("music_ogc_lynx_initial_data", c2344009GkLIZ.LIZ);
    }
}
