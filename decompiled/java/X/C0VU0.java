package X;

import Y.AObjectS388S0100000_13;
import com.bytedance.crash.ICommonParams;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VU0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VU0 implements ICommonParams {
    public final String LIZ;
    public String LIZIZ;

    @Override // com.bytedance.crash.ICommonParams
    public final List<String> getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final Map<String, Integer> getPluginInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final long getUserId() {
        try {
            return CastLongProtector.parseLong(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId());
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // com.bytedance.crash.ICommonParams
    public final Map<String, Object> getCommonParams() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C0XDN.LIZJ(map2, true);
        map.putAll(map2);
        if (!map.containsKey("release_build")) {
            map.put("release_build", C2210471BfJ.LJIIJ);
        }
        if ("3902".equals(this.LIZ)) {
            map.put("aid", "3902");
        } else if (!map.containsKey("aid")) {
            C844470XAv.LIZ.getClass();
            map.put("aid", "3902".equals(this.LIZ) ? "3902" : String.valueOf(C844470XAv.LJIIJ));
        }
        C307350C2z.LIZ().LJIIJJI();
        map.put("isGrayExtra", Boolean.TRUE);
        if (this.LIZIZ == null) {
            C0S78.LIZJ(new AObjectS388S0100000_13(this, 0), true);
        }
        String str = this.LIZIZ;
        if (str != null) {
            map.put("scoped_device_id", str);
        }
        return map;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getSessionId() {
        C827040WcQ.LIZ.getClass();
        return C827040WcQ.LIZJ;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    public C0VU0(String str) {
        this.LIZ = str;
    }
}
