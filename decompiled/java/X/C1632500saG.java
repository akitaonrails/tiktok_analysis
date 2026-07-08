package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.gamora.recorder.sticker.abtest.EffectSafeModeConfig;
import kotlin.jvm.internal.AFwS214S0000000_25;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0saG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632500saG implements InterfaceC1411260mpQ {
    public final InterfaceC1650230t2r LIZ;

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "requestUserInformation";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    public C1632500saG(InterfaceC1650230t2r interfaceC1650230t2r) {
        this.LIZ = interfaceC1650230t2r;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) throws JSONException {
        if (!o.LJIIZILJ.isLogin()) {
            C371410EhH.LIZJ(AFwS214S0000000_25.get$arr$(567));
            return;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interface", "requestUserInformation");
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
            JSONObject jSONObject2 = new JSONObject();
            String uid = currentUser.getUid();
            String str2 = "";
            if (uid == null) {
                uid = "";
            }
            jSONObject2.put("userID", uid);
            C0CHQ.LIZ().getApplicationService().getClass();
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId != null) {
                str2 = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
            }
            jSONObject2.put("deviceID", str2);
            C0CHQ.LIZ().getApplicationService();
            jSONObject2.put("appID", String.valueOf(C19221910Hx.LIZ()));
            jSONObject2.put("safeMode", EffectSafeModeConfig.enabled() ? 1 : 0);
            if (C2340509Fb.LIZ()) {
                C0CHQ.LIZ().getApplicationService();
                jSONObject2.put("appVersion", C19221910Hx.LIZIZ());
            }
            jSONObject.put("body", jSONObject2);
            C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(jSONObject));
            return;
        }
        C201955140j.LIZIZ("EffectUserIDHandler", "handleEffectMessage::currentUser is null");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("interface", "requestUserInformation");
        jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(jSONObject3));
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }
}
