package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793600VBe {
    public static volatile C793600VBe LJ;
    public C793620VBg LIZIZ;
    public final Map<String, C793620VBg> LIZ = new ConcurrentHashMap();
    public long LIZJ = -1;
    public long LIZLLL = -1;

    public static C793600VBe LIZIZ() {
        if (LJ == null) {
            synchronized (C793600VBe.class) {
                try {
                    if (LJ == null) {
                        LJ = new C793600VBe();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02df A[Catch: Exception -> 0x02e5, TRY_LEAVE, TryCatch #2 {Exception -> 0x02e5, blocks: (B:87:0x0296, B:89:0x02a6, B:90:0x02ac, B:92:0x02b4, B:93:0x02b9, B:95:0x02c2, B:96:0x02c8, B:98:0x02d1, B:99:0x02d7, B:101:0x02df), top: B:128:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023b A[PHI: r8
      0x023b: PHI (r8v1 java.lang.String) = 
      (r8v0 java.lang.String)
      (r8v0 java.lang.String)
      (r8v2 java.lang.String)
      (r8v0 java.lang.String)
      (r8v0 java.lang.String)
     binds: [B:21:0x0097, B:70:0x0237, B:67:0x0225, B:32:0x00e8, B:34:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a6 A[Catch: Exception -> 0x02e5, TryCatch #2 {Exception -> 0x02e5, blocks: (B:87:0x0296, B:89:0x02a6, B:90:0x02ac, B:92:0x02b4, B:93:0x02b9, B:95:0x02c2, B:96:0x02c8, B:98:0x02d1, B:99:0x02d7, B:101:0x02df), top: B:128:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b4 A[Catch: Exception -> 0x02e5, TryCatch #2 {Exception -> 0x02e5, blocks: (B:87:0x0296, B:89:0x02a6, B:90:0x02ac, B:92:0x02b4, B:93:0x02b9, B:95:0x02c2, B:96:0x02c8, B:98:0x02d1, B:99:0x02d7, B:101:0x02df), top: B:128:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2 A[Catch: Exception -> 0x02e5, TryCatch #2 {Exception -> 0x02e5, blocks: (B:87:0x0296, B:89:0x02a6, B:90:0x02ac, B:92:0x02b4, B:93:0x02b9, B:95:0x02c2, B:96:0x02c8, B:98:0x02d1, B:99:0x02d7, B:101:0x02df), top: B:128:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1 A[Catch: Exception -> 0x02e5, TryCatch #2 {Exception -> 0x02e5, blocks: (B:87:0x0296, B:89:0x02a6, B:90:0x02ac, B:92:0x02b4, B:93:0x02b9, B:95:0x02c2, B:96:0x02c8, B:98:0x02d1, B:99:0x02d7, B:101:0x02df), top: B:128:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793600VBe.LIZJ():void");
    }

    public final C793620VBg LIZ(String str) {
        C793620VBg c793620VBg;
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            c793620VBg = (C793620VBg) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c793620VBg != null) {
            }
            return c793620VBg;
        }
        C793650VBj c793650VBj = C793670VBl.LIZ;
        c793650VBj.LIZ();
        if (c793650VBj.LIZIZ != null) {
            C0VSJ c0vsj = c793650VBj.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".bin");
            byte[] bArrLIZIZ = C2404609bY.LIZIZ(new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ)));
            if (bArrLIZIZ != null) {
                try {
                    c793620VBg = new C793620VBg();
                    JSONObject jSONObject = new JSONObject(new String(bArrLIZIZ));
                    c793620VBg.LJI = C792450V6t.LJI("version_code", jSONObject);
                    c793620VBg.LJII = C792450V6t.LJI("version_name", jSONObject);
                    c793620VBg.LJFF = C792450V6t.LJI("manifest_version_code", jSONObject);
                    c793620VBg.LIZLLL = C792450V6t.LJI("update_version_code", jSONObject);
                    c793620VBg.LJ = C792450V6t.LJI("app_version", jSONObject);
                    c793620VBg.LJIIIZ = C792450V6t.LJI("os", jSONObject);
                    c793620VBg.LJIIJ = C792450V6t.LJI("device_platform", jSONObject);
                    c793620VBg.LJIIJJI = C792450V6t.LJI("os_version", jSONObject);
                    c793620VBg.LJIIL = C792450V6t.LJ("os_api", jSONObject);
                    c793620VBg.LJIILIIL = C792450V6t.LJI("device_model", jSONObject);
                    c793620VBg.LJIILJJIL = C792450V6t.LJI("device_brand", jSONObject);
                    c793620VBg.LJIILL = C792450V6t.LJI("device_manufacturer", jSONObject);
                    c793620VBg.LJIILLIIL = C792450V6t.LJI("process_name", jSONObject);
                    c793620VBg.LJIIZILJ = C792450V6t.LJFF("sid", jSONObject);
                    c793620VBg.LJIJ = C792450V6t.LJI("rom_version", jSONObject);
                    c793620VBg.LJIJI = C792450V6t.LJI("package", jSONObject);
                    c793620VBg.LJIJJ = C792450V6t.LJI("monitor_version", jSONObject);
                    c793620VBg.LIZJ = C792450V6t.LJI("channel", jSONObject);
                    c793620VBg.LIZ = C792450V6t.LJ("aid", jSONObject);
                    c793620VBg.LIZIZ = C792450V6t.LJI("device_id", jSONObject);
                    c793620VBg.LJIL = C792450V6t.LJFF("phone_startup_time", jSONObject);
                    c793620VBg.LJIIIIZZ = C792450V6t.LJI("release_build", jSONObject);
                    c793620VBg.LJIJJLI = C792450V6t.LJFF("uid", jSONObject);
                    c793620VBg.LJJ = C792450V6t.LJI("verify_info", jSONObject);
                    c793620VBg.LJJII = C792450V6t.LJI("current_update_version_code", jSONObject);
                    if (jSONObject.has("config_time")) {
                        c793620VBg.LJJIII = C792450V6t.LJ("config_time", jSONObject);
                    }
                    try {
                        c793620VBg.LJJIFFI = new JSONObject((String) jSONObject.remove("filters"));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    c793620VBg.LJJI = jSONObject;
                    ((ConcurrentHashMap) this.LIZ).put(str, c793620VBg);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return this.LIZIZ;
        if (TextUtils.isEmpty(c793620VBg.LIZIZ)) {
            c793620VBg.LIZIZ = C792420V6q.LJFF();
        }
        long j = this.LIZLLL;
        if (j != -1) {
            c793620VBg.LJJIIJ = j;
            c793620VBg.LJJIIJZLJL = this.LIZJ;
        }
        if (C792190V5t.LIZ()) {
            C792910V8n.LIZ("APM-Slardar", "nptTime:" + this.LIZLLL + " nptOffset:" + this.LIZJ);
        }
        c793620VBg.LJIJJLI = C792420V6q.LJIIL();
        c793620VBg.LJJIII = C792420V6q.LJIILL;
        C793620VBg c793620VBg2 = this.LIZIZ;
        if (c793620VBg2 != null) {
            c793620VBg.LJJII = c793620VBg2.LIZLLL;
            return c793620VBg;
        }
        return c793620VBg;
    }
}
