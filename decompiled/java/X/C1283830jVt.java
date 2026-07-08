package X;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1283830jVt {
    public final Map<String, String> LIZ = new HashMap();
    public String LIZIZ = "";
    public String LIZJ = "";
    public int[] LIZLLL = {4};
    public int LJ = 0;
    public int LJFF = 0;
    public int LJI = 1;
    public int LJII = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    public int LJIIIIZZ = 75;
    public int LJIIIZ = 75;
    public int LJIIJ = 0;
    public float LJIIJJI = 0.5f;
    public float LJIIL = 0.0f;
    public float LJIILIIL = 1.0f;
    public int LJIILJJIL = 0;
    public int LJIILL = 0;
    public float LJIILLIIL = 0.0f;
    public float LJIIZILJ = 0.0f;
    public float LJIJ = 0.0f;
    public float LJIJI = 0.0f;
    public float LJIJJ = 0.0f;
    public float LJIJJLI = 0.0f;
    public float LJIL = 0.0f;
    public int LJJ = 1;
    public float LJJI = 1.0f;
    public int LJJIFFI = 1;
    public int LJJII = 1;

    public final C1283840jVu LIZ() throws C1283910jW1 {
        if (this.LJ > 0) {
            if (!((HashMap) this.LIZ).containsKey("host") || !((HashMap) this.LIZ).containsKey("accessKey") || TextUtils.isEmpty((CharSequence) ((HashMap) this.LIZ).get("host")) || TextUtils.isEmpty((CharSequence) ((HashMap) this.LIZ).get("accessKey"))) {
                throw new C1283910jW1(-100020, "host or accessKey is null,aesboost need set");
            }
            if (this.LIZLLL == null) {
                throw new C1283910jW1(-100020, "groupIds is null");
            }
            String str = this.LIZIZ;
            if (str == null || str.isEmpty()) {
                throw new C1283910jW1(-100020, "modelNamePrefix is null,aesboost need set");
            }
        }
        C1283840jVu c1283840jVu = new C1283840jVu(this.LIZ);
        c1283840jVu.LIZIZ = this.LIZIZ;
        c1283840jVu.LIZJ = this.LIZJ;
        c1283840jVu.LIZLLL = this.LIZLLL;
        c1283840jVu.LJ = this.LJ;
        c1283840jVu.LJFF = this.LJFF;
        c1283840jVu.LJI = this.LJI;
        c1283840jVu.LJIIIIZZ = this.LJIIIIZZ;
        c1283840jVu.LJIIIZ = this.LJIIIZ;
        c1283840jVu.LJII = this.LJII;
        c1283840jVu.LJIIJ = this.LJIIJ;
        c1283840jVu.LJIIJJI = this.LJIIJJI;
        c1283840jVu.LJIIL = this.LJIIL;
        c1283840jVu.LJIILIIL = this.LJIILIIL;
        c1283840jVu.LJIILJJIL = this.LJIILJJIL;
        c1283840jVu.LJIILL = this.LJIILL;
        c1283840jVu.LJIILLIIL = this.LJIILLIIL;
        c1283840jVu.LJIIZILJ = this.LJIIZILJ;
        c1283840jVu.LJIJ = this.LJIJ;
        c1283840jVu.LJIJI = this.LJIJI;
        c1283840jVu.LJIJJ = this.LJIJJ;
        c1283840jVu.LJIJJLI = this.LJIJJLI;
        c1283840jVu.LJIL = this.LJIL;
        c1283840jVu.LJJ = this.LJJ;
        c1283840jVu.LJJI = this.LJJI;
        c1283840jVu.LJJIFFI = this.LJJIFFI;
        c1283840jVu.LJJII = this.LJJII;
        return c1283840jVu;
    }

    public final void LIZJ(C1283870jVx c1283870jVx) {
        this.LJIILJJIL = c1283870jVx.LIZ;
        this.LJIILL = c1283870jVx.LIZIZ;
        this.LJIILLIIL = c1283870jVx.LIZJ;
        this.LJIIZILJ = c1283870jVx.LIZLLL;
        this.LJIJ = c1283870jVx.LJ;
        this.LJIJI = c1283870jVx.LJFF;
        this.LJJ = c1283870jVx.LJIIIZ;
        this.LJJI = c1283870jVx.LJIIJ;
        this.LJIJJ = c1283870jVx.LJI;
        this.LJIJJLI = c1283870jVx.LJII;
        this.LJIL = c1283870jVx.LJIIIIZZ;
    }

    public final void LIZIZ(String str, String str2) {
        ((HashMap) this.LIZ).put("host", str);
        ((HashMap) this.LIZ).put("accessKey", str2);
        ((HashMap) this.LIZ).put("platformSdkVersion", null);
        ((HashMap) this.LIZ).put("deviceId", null);
        ((HashMap) this.LIZ).put("appID", null);
        ((HashMap) this.LIZ).put("appVersion", null);
    }
}
