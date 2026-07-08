package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793610VBf {
    public static long LIZ = -1;

    public static long LIZ() {
        if (LIZ == -1) {
            LIZ = (C792420V6q.LJIIIZ() << 16) | ((long) Process.myPid());
        }
        return LIZ;
    }

    public static JSONObject LIZIZ(C793620VBg c793620VBg) {
        if (c793620VBg == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = c793620VBg.LJJI;
            if (jSONObject2 != null) {
                jSONObject = C792450V6t.LIZ(jSONObject, jSONObject2);
            }
            jSONObject.put("version_code", c793620VBg.LJI);
            jSONObject.put("version_name", c793620VBg.LJII);
            jSONObject.put("manifest_version_code", c793620VBg.LJFF);
            jSONObject.put("update_version_code", c793620VBg.LIZLLL);
            jSONObject.put("app_version", c793620VBg.LJ);
            jSONObject.put("os", c793620VBg.LJIIIZ);
            jSONObject.put("device_platform", c793620VBg.LJIIJ);
            jSONObject.put("os_version", c793620VBg.LJIIJJI);
            jSONObject.put("os_api", c793620VBg.LJIIL);
            jSONObject.put("device_model", c793620VBg.LJIILIIL);
            jSONObject.put("device_brand", c793620VBg.LJIILJJIL);
            jSONObject.put("device_manufacturer", c793620VBg.LJIILL);
            jSONObject.put("process_name", c793620VBg.LJIILLIIL);
            jSONObject.put("sid", c793620VBg.LJIIZILJ);
            jSONObject.put("rom_version", c793620VBg.LJIJ);
            jSONObject.put("package", c793620VBg.LJIJI);
            jSONObject.put("monitor_version", c793620VBg.LJIJJ);
            jSONObject.put("channel", c793620VBg.LIZJ);
            jSONObject.put("aid", c793620VBg.LIZ);
            if (!TextUtils.isEmpty(c793620VBg.LIZIZ)) {
                jSONObject.put("device_id", c793620VBg.LIZIZ);
            }
            jSONObject.put("uid", c793620VBg.LJIJJLI);
            jSONObject.put("phone_startup_time", c793620VBg.LJIL);
            jSONObject.put("release_build", c793620VBg.LJIIIIZZ);
            long j = c793620VBg.LJJIII;
            if (j != -1) {
                jSONObject.put("config_time", String.valueOf(j));
            }
            if (!TextUtils.isEmpty(c793620VBg.LJJ)) {
                jSONObject.put("verify_info", c793620VBg.LJJ);
            }
            jSONObject.put("current_update_version_code", c793620VBg.LJJII);
            long j2 = c793620VBg.LJJIIJ;
            if (j2 != -1) {
                jSONObject.put("ntp_time", j2);
            }
            long j3 = c793620VBg.LJJIIJZLJL;
            if (j3 != -1) {
                jSONObject.put("ntp_offset", j3);
            }
            JSONObject jSONObject3 = c793620VBg.LJJIFFI;
            if (jSONObject3 != null) {
                jSONObject.put("filters", jSONObject3);
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
