package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.profile.business.avatar.AvatarTrackerBaseParams;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0imL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255590imL implements InterfaceC1255580imK {
    public final HashMap<String, String> LIZ;
    public final AvatarTrackerBaseParams LIZIZ;

    @Override // X.InterfaceC1255580imK
    public final void LIZIZ(EnumC1255640imQ enumC1255640imQ, Object obj) {
    }

    @Override // X.InterfaceC1255580imK
    public final void LJ(EnumC1255610imN enumC1255610imN, HashMap<String, String> map) {
    }

    @Override // X.InterfaceC1255580imK
    public final void LJFF() {
    }

    @Override // X.InterfaceC1255580imK
    public final void LIZJ() {
        C20684815ws.LJIILLIIL("set_avatar_success", C0TVC.LIZ(this.LIZ).LIZ);
    }

    public C1255590imL(HashMap<String, String> map) {
        this.LIZ = map;
        this.LIZIZ = new AvatarTrackerBaseParams(map);
    }

    public static int LJIIIIZZ(Throwable th) {
        BaseResponse baseResponse;
        if (th instanceof C1494690ozz) {
            return -1;
        }
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            Object rawResponse = c0xir.getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (baseResponse = (BaseResponse) rawResponse) != null) {
                return baseResponse.status_code;
            }
            return c0xir.getErrorCode();
        }
        return C2252408s6.LJ(th);
    }

    public static String LJIIIZ(Throwable th) {
        BaseResponse baseResponse;
        String str;
        if (th instanceof C1494690ozz) {
            return "CronetIOException";
        }
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            Object rawResponse = c0xir.getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (baseResponse = (BaseResponse) rawResponse) != null && (str = baseResponse.status_msg) != null) {
                return str;
            }
            String errorMsg = c0xir.getErrorMsg();
            if (errorMsg != null) {
                return errorMsg;
            }
            return "";
        }
        return "";
    }

    public static String LJIIJ(Throwable th) {
        String str;
        UserResponse userResponse;
        LogPbBean logPbBean;
        String imprId;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (!(th instanceof C1494690ozz) && (th instanceof C0XIR)) {
            Object rawResponse = ((C0XIR) th).getRawResponse();
            if ((!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null || (serverTimeExtra = baseResponse.extra) == null || (imprId = serverTimeExtra.logid) == null) && (!(rawResponse instanceof UserResponse) || (userResponse = (UserResponse) rawResponse) == null || (logPbBean = userResponse.logPb) == null || (imprId = logPbBean.getImprId()) == null)) {
                if ((rawResponse instanceof String) && (str = (String) rawResponse) != null) {
                    return str;
                }
            } else {
                return imprId;
            }
        }
        return "";
    }

    @Override // X.InterfaceC1255580imK
    public final void LIZ(EnumC1255610imN enumC1255610imN) {
        String str;
        C0XGR c0xgrLIZ = C0TVC.LIZ(this.LIZ);
        int i = C1255600imM.LIZ[enumC1255610imN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "photo";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "camera";
        }
        c0xgrLIZ.LIZLLL("type", str);
        C20684815ws.LJIILLIIL("set_avatar_auth_request", c0xgrLIZ.LIZ);
    }

    @Override // X.InterfaceC1255580imK
    public final void LJI(Throwable th) {
        C0XGR c0xgrLIZ = C0TVC.LIZ(this.LIZ);
        c0xgrLIZ.LIZLLL("error_api", "upload");
        c0xgrLIZ.LIZLLL("error_message", LJIIIZ(th));
        c0xgrLIZ.LIZ(LJIIIIZZ(th), "error_code");
        c0xgrLIZ.LIZLLL("erorr_log_id", LJIIJ(th));
        C20684815ws.LJIILLIIL("set_avatar_fail", c0xgrLIZ.LIZ);
    }

    @Override // X.InterfaceC1255580imK
    public final void LJII(Throwable th) {
        C0XGR c0xgrLIZ = C0TVC.LIZ(this.LIZ);
        c0xgrLIZ.LIZLLL("error_api", "commit");
        c0xgrLIZ.LIZLLL("error_message", LJIIIZ(th));
        c0xgrLIZ.LIZ(LJIIIIZZ(th), "error_code");
        c0xgrLIZ.LIZLLL("erorr_log_id", LJIIJ(th));
        C20684815ws.LJIILLIIL("set_avatar_fail", c0xgrLIZ.LIZ);
    }

    @Override // X.InterfaceC1255580imK
    public final void LIZLLL(EnumC1255610imN enumC1255610imN, boolean z) {
        String str;
        String str2;
        C0XGR c0xgrLIZ = C0TVC.LIZ(this.LIZ);
        int i = C1255600imM.LIZ[enumC1255610imN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "photo";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "camera";
        }
        c0xgrLIZ.LIZLLL("type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xgrLIZ.LIZLLL("is_permit", str2);
        C20684815ws.LJIILLIIL("set_avatar_auth_result", c0xgrLIZ.LIZ);
    }
}
