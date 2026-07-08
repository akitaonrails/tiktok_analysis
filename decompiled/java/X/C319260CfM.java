package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C319260CfM {
    public long LIZJ;
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public String LIZLLL = "";

    public final void LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("comment_sli_monitor", true) || Intrinsics.LJFF(this.LIZ.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), "1")) {
            return;
        }
        if (this.LIZJ > 0 && !this.LIZIZ.containsKey("duration")) {
            this.LIZIZ.put("duration", String.valueOf(System.currentTimeMillis() - this.LIZJ));
        }
        if (!this.LIZIZ.containsKey("uid") && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            this.LIZIZ.put("uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        if (!this.LIZIZ.containsKey("did")) {
            this.LIZIZ.put("did", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        }
        try {
            if (this.LIZLLL.length() > 0) {
                C793770VBv.LJII(this.LIZLLL, new JSONObject(C2097608Jq.LJIIZILJ(this.LIZ)), null, new JSONObject(C2097608Jq.LJIIZILJ(this.LIZIZ)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZ.put(str, obj);
        }
    }
}
