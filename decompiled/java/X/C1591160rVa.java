package X;

/* JADX INFO: renamed from: X.0rVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591160rVa {
    public static final C1591160rVa LIZ = new C1591160rVa();

    public static void LIZ(boolean z, String str, String str2, String str3, EnumC593570NPv enumC593570NPv, boolean z2, EnumC1591170rVb enumC1591170rVb) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("clean_tab_name", str);
        c2344009Gk.LJIIIIZZ("current_bottom_tab", str3);
        c2344009Gk.LJIIIIZZ("current_top_tab", str2);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_top_tab");
        c2344009Gk.LIZJ(enumC593570NPv.getMobValue(), "trigger_source");
        c2344009Gk.LIZJ(z2 ? 1 : 0, "is_success");
        if (!z2 && enumC1591170rVb != null) {
            c2344009Gk.LIZJ(enumC1591170rVb.getMobValue(), "failed_reason");
        }
        C20684815ws.LJIILLIIL("tab_memory_clean_result", c2344009Gk.LIZ);
    }
}
