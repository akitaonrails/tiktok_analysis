package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846790XJt {
    public static void LIZ(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str) && (str.contains("check/in") || str.contains("story") || str.contains("rec/new") || str.contains("follow/feed"))) {
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (i != 8 || !iUserService.isLogin()) {
            return;
        }
        try {
            C0XQ7.LIZJ().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDesc", "api return errorcode==8");
            jSONObject.put("errorUrl", str);
            jSONObject.put("errorCookies", C2204961BRm.LLIZ(C786410Ut5.A2(), NetworkUtils.getShareCookieHost(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkh5S4V9eXlgzmFC/4agdmuDy/8YR2Q==", null)));
            jSONObject.put("errorResponse", str2);
            C794240VDq.LIZIZ("aweme_user_logout", "", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(int i, BaseResponse baseResponse, String str) {
        if (!TextUtils.isEmpty(str) && (str.contains("check/in") || str.contains("story") || str.contains("rec/new") || str.contains("follow/feed"))) {
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (i != 8 || !iUserService.isLogin()) {
            return;
        }
        try {
            C0XQ7.LIZJ().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDesc", "api return errorcode==8");
            jSONObject.put("errorUrl", str);
            jSONObject.put("errorCookies", C2204961BRm.LLIZ(C786410Ut5.A2(), NetworkUtils.getShareCookieHost(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkh5S4V9eXlgzmFC/4agdmuDy/8YR2Q==", null)));
            jSONObject.put("errorResponse", baseResponse.toString());
            C794240VDq.LIZIZ("aweme_user_logout", "", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
