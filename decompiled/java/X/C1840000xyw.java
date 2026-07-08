package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840000xyw {
    public static final /* synthetic */ C1840000xyw LIZ = new C1840000xyw();
    public static final Map<Integer, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(0, "unknown"), new Pair(1, "to_be_started"), new Pair(10, "no_bidder"), new Pair(11, "have_bidder"), new Pair(15, "success"), new Pair(16, "success_ordering"), new Pair(20, "complete"), new Pair(2, "extended_bidding_enabled"), new Pair(12, "bid_reset_ns"), new Pair(13, "bid_reset_ns_second"), new Pair(21, "order_failed_other"), new Pair(22, "surprise_highest_bid_wins"), new Pair(23, "surprise_be_first_win"), new Pair(100, "final_price"), new Pair(101, "processing"), new Pair(102, "random_assigning"), new Pair(103, "instant_reward"));

    public static String LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            String str = LIZIZ.get(num);
            if (str == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown_");
                sbLIZ.append(num);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return "unknown_null";
    }
}
