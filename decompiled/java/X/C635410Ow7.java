package X;

import Y.AfS0S0112000_9;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Ow7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635410Ow7 {
    public static TuxSheet LIZ;
    public static C424620Gku LIZIZ;
    public static TuxTextView LIZJ;
    public static TuxTextView LIZLLL;
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(283));
    public static GroupUnsubscribeSetting LJFF;

    public static void LIZ(String str) {
        String str2;
        GroupUnsubscribeSetting groupUnsubscribeSetting = LJFF;
        if (groupUnsubscribeSetting == null) {
            return;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("account_type", groupUnsubscribeSetting.accountType);
        pairArr[2] = new Pair("action_type", str);
        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
        if (c1246360iXS != null) {
            str2 = c1246360iXS.LIZJ;
        } else {
            str2 = null;
        }
        pairArr[3] = new Pair("cell_type", str2);
        C20684815ws.LJFF().execute(new RunnableC514801zW(C2097608Jq.LJIIJ(pairArr), 65));
    }

    public static void LIZIZ(int i, int i2, boolean z, InterfaceC1631620sYq interfaceC1631620sYq, Function0 function0, C11NJ c11nj) {
        C11NZ<BaseResponse> c11nzUpdateSubscribeSettingsgStatus;
        boolean z2 = !z;
        if (C635610OwR.LIZ()) {
            c11nzUpdateSubscribeSettingsgStatus = NotificationApi.LIZ().updateSubscribeInfo(i, i2, Integer.valueOf(!z2 ? 1 : 0));
        } else {
            c11nzUpdateSubscribeSettingsgStatus = NotificationApi.LIZ().updateSubscribeSettingsgStatus(i, i2, z2);
        }
        c11nj.LIZ(c11nzUpdateSubscribeSettingsgStatus.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S0112000_9(i, i2, interfaceC1631620sYq, z2, 0), new AfS0S0112000_9(i, i2, function0, z2, 1)));
    }
}
