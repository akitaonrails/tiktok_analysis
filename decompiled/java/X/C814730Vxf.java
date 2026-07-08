package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.awemepushapi.model.SilentMsg;
import com.ss.android.ugc.awemepushlib.experiments.PushCustomUISettings;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814730Vxf implements Serializable {
    public int alertType;
    public transient JSONObject appData;
    public String callback;
    public C814840Vxq extra;
    public String extraStr;
    public boolean functionalPush;
    public long id;
    public int imageType;
    public String imageUrl;
    public int isPing;
    public String itemType;
    public C814910Vxx latencyAnalytics;
    public boolean led;
    public String openUrl;
    public transient JSONObject originData;
    public String postBack;
    public boolean preloadArticle;
    public String rawJson;
    public String reachType;
    public long revokeId;
    public int revokeType;
    public long rid64;
    public SilentMsg silentMsg;
    public int silentType;
    public boolean sound;
    public int soundType;
    public String targetSecUid;
    public String text;
    public String title;
    public boolean vibrator;
    public int voipType;
    public int filter = 1;
    public int pass_through = 1;
    public long timeoutAfter = -1;
    public String pitayaTraceID = "";

    public boolean isExclusiveGroupMsg() {
        return Objects.equals(this.extra.pushGroupId, "android_exclusive_group");
    }

    public boolean isSilentMsg() {
        return this.silentType > EnumC048500Fn.NORMAL_PUSH.ordinal();
    }

    public boolean isStandardUIType() {
        return this.imageType != 9;
    }

    public boolean canSetCustomGroup() {
        return isStandardUIType() || ((PushCustomUISettings.MetaData) PushCustomUISettings.LIZIZ.getValue()).canCustomGroup;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushMsg{, id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", rid64=");
        sbLIZ.append(this.rid64);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.imageType);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append("originData=");
        sbLIZ.append(this.originData);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JSONObject getOriginData() {
        return this.originData;
    }

    public static C814730Vxf from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C814730Vxf c814730Vxf = new C814730Vxf();
        c814730Vxf.rawJson = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c814730Vxf.latencyAnalytics = new C814910Vxx();
            c814730Vxf.originData = jSONObject;
            c814730Vxf.id = jSONObject.optLong(FollowStatusChangeMethod.PARAM_UID, 0L);
            c814730Vxf.rid64 = jSONObject.optLong("rid64", 0L);
            c814730Vxf.title = jSONObject.optString("title");
            c814730Vxf.text = jSONObject.optString("text");
            c814730Vxf.pass_through = jSONObject.optInt("pass_through", 1);
            c814730Vxf.openUrl = jSONObject.optString("open_url");
            c814730Vxf.reachType = jSONObject.optString("reach_type");
            c814730Vxf.itemType = jSONObject.optString("item_type");
            c814730Vxf.imageUrl = jSONObject.optString("image_url");
            c814730Vxf.callback = jSONObject.optString("callback");
            c814730Vxf.isPing = jSONObject.optInt("is_ping", 0);
            c814730Vxf.imageType = jSONObject.optInt("image_type");
            c814730Vxf.filter = jSONObject.optInt("filter", 1);
            c814730Vxf.alertType = jSONObject.optInt("alert_type", 0);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("push_sound_kill_switch", true)) {
                c814730Vxf.soundType = jSONObject.optInt("sound_type", C810830VrN.LIZIZ(c814730Vxf));
            } else {
                c814730Vxf.soundType = jSONObject.optInt("sound_type", 0);
            }
            String strOptString = jSONObject.optString("extra_str");
            c814730Vxf.extraStr = strOptString;
            c814730Vxf.postBack = jSONObject.optString("post_back");
            c814730Vxf.led = C814710Vxd.LJI(jSONObject, "use_led", false);
            c814730Vxf.sound = C814710Vxd.LJI(jSONObject, "sound", false);
            c814730Vxf.vibrator = C814710Vxd.LJI(jSONObject, "use_vibrator", false);
            c814730Vxf.preloadArticle = C814710Vxd.LJI(jSONObject, "preload_article", false);
            c814730Vxf.appData = jSONObject.optJSONObject("app_data");
            c814730Vxf.extra = C814840Vxq.LIZ(strOptString);
            c814730Vxf.targetSecUid = jSONObject.optString("ttpush_sec_target_uid");
            c814730Vxf.revokeId = jSONObject.optLong("revoke_id", 0L);
            c814730Vxf.revokeType = jSONObject.optInt("revoke_type", 0);
            c814730Vxf.timeoutAfter = jSONObject.optLong("timeout_after", -1L);
            c814730Vxf.voipType = jSONObject.optInt("voip_type");
            int i = c814730Vxf.extra.style;
            if (i >= 0) {
                c814730Vxf.imageType = i;
            }
            c814730Vxf.silentType = jSONObject.optInt("silent_type", EnumC048500Fn.NORMAL_PUSH.ordinal());
            if (c814730Vxf.isSilentMsg()) {
                SilentMsg silentMsg = (SilentMsg) C08JS.LIZ(jSONObject.optString("silent_content"), SilentMsg.class);
                c814730Vxf.silentMsg = silentMsg;
                if (silentMsg != null) {
                    silentMsg.setType(c814730Vxf.silentType);
                    c814730Vxf.silentMsg.setData(c814730Vxf.extra.silentData);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive silent msg: ");
                    sbLIZ.append(c814730Vxf.silentMsg);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            if (!TextUtils.isEmpty(c814730Vxf.openUrl)) {
                try {
                    c814730Vxf.functionalPush = "1".equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c814730Vxf.openUrl), "functional_push"));
                    return c814730Vxf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return c814730Vxf;
                }
            }
            return c814730Vxf;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parse msg error: ");
            sbLIZ2.append(th2.getMessage());
            C1720106oR.LIZ("silent_push", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static int getShortMsgID(long j) {
        return (int) (j % 2147483647L);
    }
}
