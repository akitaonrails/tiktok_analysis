package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889830YvV {
    public static void LIZ(FilterTabType filterTabType, String str) {
        C889870YvZ c889870YvZ;
        Object obj;
        C889860YvY c889860YvY = InboxFilterBarViewModel.LLILZIL;
        if (c889860YvY != null && filterTabType != null && (c889870YvZ = c889860YvY.LIZ) != null && !c889870YvZ.LJ && c889870YvZ.LIZ == filterTabType) {
            if (Intrinsics.LJFF(str, "register_new_page")) {
                c889870YvZ.LIZLLL = true;
            }
            Pair[] pairArr = new Pair[8];
            pairArr[0] = new Pair("exp_value", String.valueOf(C880900Yh6.LIZLLL()));
            pairArr[1] = new Pair("enter_method", c889870YvZ.LIZJ);
            pairArr[2] = new Pair("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
            pairArr[3] = new Pair("tab_name", c889870YvZ.LIZ.getMobValue());
            pairArr[4] = new Pair("step", str);
            String str2 = "1";
            if (c889870YvZ.LIZLLL) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[5] = new Pair("register_new_page", obj);
            if (!c889870YvZ.LIZLLL || !c889860YvY.LIZIZ.isEmpty()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[6] = new Pair("is_first_switch", str2);
            pairArr[7] = new Pair("lag_after_switch", String.valueOf(SystemClock.elapsedRealtime() - c889870YvZ.LIZIZ));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("switch_im_tab_lag", mapLJIIIIZZ);
            if (Intrinsics.LJFF(str, "dm_cell_show")) {
                c889870YvZ.LJ = true;
                c889860YvY.LIZIZ.add(filterTabType);
            }
        }
    }
}
