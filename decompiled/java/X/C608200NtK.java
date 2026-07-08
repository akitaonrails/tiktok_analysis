package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608200NtK {
    public static final C608200NtK LIZ = new C608200NtK();

    public static void LIZ(C608200NtK c608200NtK, String str, String str2, String str3, Long l, Integer num, String str4, int i) {
        String str5;
        String currentUserID;
        if ((i & 2) != 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String str6 = "";
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        c608200NtK.getClass();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
            str6 = currentUserID;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
            str5 = "before_live";
        } else {
            str5 = "during_live";
        }
        pairArr[1] = new Pair("live_status", str5);
        pairArr[2] = new Pair("room_id", str2);
        pairArr[3] = new Pair("author_id", str6);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.put("step", str);
        if (l != null) {
            mapLJIIJ.put("duration", Long.valueOf(l.longValue()));
        }
        if (num != null) {
            mapLJIIJ.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (str4 != null) {
            mapLJIIJ.put("error_info", str4);
        }
        if (str3 != null) {
            mapLJIIJ.put("icon_url", str3);
        }
        C1421105hJ.LIZJ("rd_tiktokec_anchor_shopping_bag_step_event", mapLJIIJ);
    }
}
