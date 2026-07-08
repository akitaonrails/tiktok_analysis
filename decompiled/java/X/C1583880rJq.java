package X;

import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583880rJq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC592410NLj enumC592410NLj, boolean z) {
        C1018703yb.LIZIZ("tiktokec_tab_icon_data_collect", C2097608Jq.LJIIIIZZ(new Pair("tab_position", enumC592410NLj.name().toLowerCase(Locale.ROOT)), new Pair("has_data", Integer.valueOf(z ? 1 : 0))));
    }

    public static void LIZIZ(EnumC592410NLj enumC592410NLj, boolean z) {
        C1018703yb.LIZIZ("tiktokec_tab_icon_show_result", C2097608Jq.LJIIIIZZ(new Pair("tab_position", enumC592410NLj.name().toLowerCase(Locale.ROOT)), new Pair("is_success", Integer.valueOf(z ? 1 : 0))));
    }
}
