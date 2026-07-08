package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;

/* JADX INFO: renamed from: X.0uYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708480uYo {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(CashierKey cashierKey, CommuteType commuteType) {
        String str;
        if (commuteType == CommuteType.IN_APP_BROWSER) {
            return "snssdk1233://pipo/cashier/iab_transition_page";
        }
        if (C1707770uXf.LIZ()) {
            str = "aweme://pipo/cashier/pay_finish";
        } else {
            str = "aweme://pipo/cashier/pay_result";
        }
        return UriProtector.parse(str).buildUpon().appendQueryParameter("pay_request_id", cashierKey.payRequestId).appendQueryParameter("notification_id", cashierKey.notificationId).appendQueryParameter("close_pre_pipo_container", CardStruct.IStatusCode.DEFAULT).build().toString();
    }
}
