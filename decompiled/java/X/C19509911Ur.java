package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.bidding.BidViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.11Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19509911Ur {
    public static final C19509911Ur LIZ = new C19509911Ur();

    public static void LIZ(String str, BidViewModel bidViewModel) {
        Map<String, String> linkedHashMap;
        if (bidViewModel != null) {
            LIZ.getClass();
            linkedHashMap = bidViewModel.vQ2(null);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put("step", str);
        C1421105hJ.LIZJ("tiktokec_rd_auction_step_event", linkedHashMap);
    }
}
