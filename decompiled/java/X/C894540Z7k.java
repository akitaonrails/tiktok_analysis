package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894540Z7k {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(EnumC894560Z7m enumC894560Z7m) {
        int i = C894550Z7l.LIZ[enumC894560Z7m.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "settings_page";
                }
                throw new C1954807lC();
            }
            return "report_banner";
        }
        return "block_banner";
    }

    public static void LIZ(EnumC894560Z7m enumC894560Z7m, String str) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_dm_filtered_keyword_banner", C894490Z7f.LIZ(new Pair("enter_method", LIZIZ(enumC894560Z7m)), new Pair("action", str)));
    }
}
