package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0XHH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XHH {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append("/aweme/v1/commit/user/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("https://");
        sbLIZ2.append("api-va.tiktokv.com");
        sbLIZ2.append("/passport/login_name/update/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("https://");
        sbLIZ3.append("api-va.tiktokv.com");
        sbLIZ3.append("/tiktok/v1/username/save_async");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.profile.UserResponse LIZIZ(java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XHH.LIZIZ(java.util.Map):com.ss.android.ugc.aweme.profile.UserResponse");
    }

    public static User LIZ(String str, boolean z, boolean z2) {
        String str2;
        boolean zLJI = MethodIDManager.LJI(196655);
        C0XI4 c0xi4 = new C0XI4(str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xi4.LJ("is_after_login", str2);
        if (z2) {
            c0xi4.LJ("scene_id", "3");
        }
        C848040XOo.LIZ.getClass();
        C0XHB c0xhb = C848040XOo.LIZJ;
        String strLJFF = c0xi4.LJFF();
        NetworkProxyAccount networkProxyAccount = (NetworkProxyAccount) c0xhb;
        networkProxyAccount.getClass();
        User user = ((UserResponse) GsonProtectorUtils.fromJson(((NetworkProxyAccount) C848040XOo.LIZJ).LJII(), networkProxyAccount.LIZLLL(strLJFF, new ArrayList()).LIZIZ, UserResponse.class)).getUser();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return user;
    }
}
