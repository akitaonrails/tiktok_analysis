package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0Von, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809230Von {
    public final C809220Vom LIZ;

    public final Map<String, String> LIZ() {
        HashMap map = new HashMap();
        C808950VoL.LIZIZ().getClass();
        C809040VoU.LIZ().LIZIZ(map);
        HashMap map2 = new HashMap();
        map2.put("push_sdk_version", String.valueOf(30204));
        map2.put("push_sdk_version_name", "3.2.4-alpha.56.4-bugfix");
        String str = (String) map.get("install_id");
        if (!C2093608Ic.LJ(str)) {
            map2.put("iid", str);
        }
        String str2 = (String) map.get("device_id");
        if (!C2093608Ic.LJ(str2)) {
            map2.put("device_id", str2);
        }
        String strB3 = C786410Ut5.b3(this.LIZ.LIZ);
        if (!C2093608Ic.LJ(strB3)) {
            map2.put("ac", strB3);
        }
        InterfaceC809060VoW interfaceC809060VoW = C809030VoT.LJIIJ.LIZIZ.LJIJJ;
        if (interfaceC809060VoW != null) {
            String secUid = interfaceC809060VoW.getSecUid();
            if (!C2093608Ic.LJ(secUid)) {
                map2.put("sec_uid", secUid);
            }
        }
        String str3 = this.LIZ.LJI;
        if (str3 != null) {
            map2.put("channel", str3);
        }
        map2.put("aid", String.valueOf(this.LIZ.LIZIZ));
        String str4 = this.LIZ.LJIIIIZZ;
        if (str4 != null) {
            map2.put("app_name", str4);
        }
        map2.put("version_code", String.valueOf(this.LIZ.LIZJ));
        map2.put("version_name", this.LIZ.LJ);
        map2.put("update_version_code", String.valueOf(this.LIZ.LIZLLL));
        map2.put("device_type", Build.MODEL);
        map2.put("device_brand", Build.BRAND);
        map2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String strSubstring = Build.VERSION.RELEASE;
            if (strSubstring != null && strSubstring.length() > 10) {
                strSubstring = strSubstring.substring(0, 10);
            }
            map2.put("os_version", strSubstring);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int iLJII = C12ES.LJII(this.LIZ.LIZ);
        if (iLJII > 0) {
            map2.put("dpi", String.valueOf(iLJII));
        }
        map2.put("rom", C786410Ut5.u2());
        map2.put("os", "android");
        map2.put("package", this.LIZ.LIZ.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            map2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / LSPassThroughRecordSizeConfig.DEFAULT));
            map2.put("tz_name", timeZone.getID());
        }
        try {
            InterfaceC809260Voq interfaceC809260Voq = this.LIZ.LJIILL;
            if (interfaceC809260Voq != null) {
                map2.putAll(C812910Vuj.LIZ());
            }
            map2.put("rom_version", C2162408da.LIZJ);
            return map2;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return map2;
        }
    }

    public C809230Von(C809220Vom c809220Vom) {
        this.LIZ = c809220Vom;
    }
}
