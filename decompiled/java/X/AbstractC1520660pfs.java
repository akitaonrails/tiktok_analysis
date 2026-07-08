package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1520660pfs {
    public long LIZ;
    public final HybridSettingInitConfig LIZIZ;
    public C1520760pg2 LIZJ;
    public String LIZLLL;

    public final C1520760pg2 LIZ() {
        C1520760pg2 c1520760pg2 = null;
        try {
            if (TextUtils.isEmpty(this.LIZLLL) || this.LIZJ == null) {
                return null;
            }
            C1520760pg2 c1520760pg2LJ = C1520740pg0.LJ(this.LIZLLL);
            c1520760pg2 = this.LIZJ;
            c1520760pg2.LIZ = c1520760pg2LJ.LIZ;
            return c1520760pg2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZ("startup_handle", th);
            return c1520760pg2;
        }
    }

    public AbstractC1520660pfs(HybridSettingInitConfig hybridSettingInitConfig) {
        this.LIZIZ = hybridSettingInitConfig;
    }

    public final C1520760pg2 LIZIZ(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorPutString;
        try {
            if (C1520640pfq.LJFF("errno", new JSONObject(str)) == 200) {
                int i = C2187451AjH.LIZ;
                C1521730phb.LIZ("ISettingRequestService", "monitor setting request: succeeded");
                C1520760pg2 c1520760pg2LIZLLL = C1520740pg0.LIZLLL(str);
                SharedPreferences sharedPreferencesLIZ = C1519430pdt.LIZ();
                if (sharedPreferencesLIZ != null && (editorEdit2 = sharedPreferencesLIZ.edit()) != null && (editorPutString = editorEdit2.putString("monitor_setting_response", str)) != null) {
                    editorPutString.apply();
                }
                String str2 = this.LIZIZ.LJ;
                if (!TextUtils.isEmpty(str2) && !CardStruct.IStatusCode.DEFAULT.equals(str2)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    this.LIZ = jCurrentTimeMillis;
                    SharedPreferences sharedPreferencesLIZ2 = C1519430pdt.LIZ();
                    if (sharedPreferencesLIZ2 != null && (editorEdit = sharedPreferencesLIZ2.edit()) != null && (editorPutLong = editorEdit.putLong("monitor_setting_response_fetch_time", jCurrentTimeMillis)) != null) {
                        editorPutLong.apply();
                    }
                }
                this.LIZLLL = str;
                this.LIZJ = c1520760pg2LIZLLL;
                return c1520760pg2LIZLLL;
            }
            int i2 = C2187451AjH.LIZ;
            C1521730phb.LIZ("ISettingRequestService", "monitor setting request: failed, checking sp...");
            String strLIZIZ = C1519430pdt.LIZIZ();
            if (!C2093608Ic.LJ(strLIZIZ)) {
                C1520760pg2 c1520760pg2LIZLLL2 = C1520740pg0.LIZLLL(strLIZIZ);
                this.LIZLLL = strLIZIZ;
                this.LIZJ = c1520760pg2LIZLLL2;
                return c1520760pg2LIZLLL2;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZ("startup_handle", th);
            int i3 = C2187451AjH.LIZ;
            C1521730phb.LIZ("ISettingRequestService", "monitor setting request: failed, checking sp...");
            String strLIZIZ2 = C1519430pdt.LIZIZ();
            if (!C2093608Ic.LJ(strLIZIZ2)) {
                C1520760pg2 c1520760pg2LIZLLL3 = C1520740pg0.LIZLLL(strLIZIZ2);
                this.LIZLLL = strLIZIZ2;
                this.LIZJ = c1520760pg2LIZLLL3;
                return c1520760pg2LIZLLL3;
            }
            return null;
        }
    }
}
