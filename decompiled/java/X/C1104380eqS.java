package X;

import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxMessage4FE;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104380eqS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Boolean bool, String str, List list) {
        String str2;
        int iIntValue;
        String str3;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE;
        String str4;
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE2;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE2;
        Integer num;
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE3;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE3;
        HashMap map = new HashMap(7);
        String str5 = "";
        if (list == null || (activityTreasureBoxMessage4FE3 = (ActivityTreasureBoxMessage4FE) ListProtector.get(list, 0)) == null || (activityTreasureBoxInfo4FE3 = activityTreasureBoxMessage4FE3.envelopInfo) == null || (str2 = activityTreasureBoxInfo4FE3.envelopeId) == null) {
            str2 = "";
        }
        map.put("envelope_id", str2);
        if (list != null && (activityTreasureBoxMessage4FE2 = (ActivityTreasureBoxMessage4FE) ListProtector.get(list, 0)) != null && (activityTreasureBoxInfo4FE2 = activityTreasureBoxMessage4FE2.envelopInfo) != null && (num = activityTreasureBoxInfo4FE2.businessType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put("business_type", String.valueOf(iIntValue));
        if (list != null && (activityTreasureBoxMessage4FE = (ActivityTreasureBoxMessage4FE) ListProtector.get(list, 0)) != null && (activityTreasureBoxInfo4FE = activityTreasureBoxMessage4FE.envelopInfo) != null && (str4 = activityTreasureBoxInfo4FE.sendUserId) != null) {
            str5 = str4;
        }
        map.put("send_user_id", str5);
        map.put("drop_reason", str);
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_data_drop");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_treasure_box_data_drop", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[PHI: r1
      0x0070: PHI (r1v9 java.lang.String) = (r1v7 java.lang.String), (r1v10 java.lang.String) binds: [B:20:0x006e, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.util.List r10, java.lang.String r11, int r12, java.lang.Boolean r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104380eqS.LIZIZ(java.util.List, java.lang.String, int, java.lang.Boolean):void");
    }
}
