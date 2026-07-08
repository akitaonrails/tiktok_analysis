package X;

import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0CqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326160CqU {
    public static final Regex LIZ;
    public static final Regex LIZIZ;

    static {
        EnumC688760Qzy enumC688760Qzy = EnumC688760Qzy.IGNORE_CASE;
        LIZ = new Regex("aweme://roma_redirect.*spark_page=tiktok_ogc_ip_leaderboard_detail_page_lynx(?:[&;#]|$)", enumC688760Qzy);
        LIZIZ = new Regex("promotion_entity_id", enumC688760Qzy);
    }

    public static EnumC326120CqQ LIZ(String str) {
        if (str != null && str.length() != 0) {
            if (LIZ.containsMatchIn(str)) {
                return EnumC326120CqQ.LEADERBOARD;
            }
            if (LIZIZ.containsMatchIn(str)) {
                return EnumC326120CqQ.SPOTLIGHT_IP;
            }
            return EnumC326120CqQ.MOVIE_TOK;
        }
        return EnumC326120CqQ.UNKNOWN;
    }
}
