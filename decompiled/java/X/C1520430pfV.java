package X;

import android.os.Build;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0pfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520430pfV extends AbstractC1520660pfs {
    public final n LIZJ() {
        if (this.LIZIZ.LIZ == null) {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("ISettingRequestService", "monitor setting aid should not be null");
        }
        n nVar = new n();
        String str = this.LIZIZ.LIZ;
        if (str != null) {
            nVar.LJJIIJ("aid", str);
        }
        String str2 = this.LIZIZ.LIZJ;
        if (str2 != null) {
            nVar.LJJIIJ("os", str2);
        }
        String str3 = this.LIZIZ.LIZLLL;
        if (str3 != null) {
            nVar.LJJIIJ("os_version", str3);
        }
        this.LIZIZ.getClass();
        String str4 = this.LIZIZ.LJ;
        if (str4 != null) {
            nVar.LJJIIJ("device_id", str4);
        }
        String str5 = this.LIZIZ.LJFF;
        if (str5 != null) {
            nVar.LJJIIJ("channel", str5);
        }
        String str6 = this.LIZIZ.LJI;
        if (str6 != null) {
            nVar.LJJIIJ("version_code", str6);
        }
        String str7 = this.LIZIZ.LJII;
        if (str7 != null) {
            nVar.LJJIIJ("update_version_code", str7);
        }
        String str8 = this.LIZIZ.LJIIIIZZ;
        if (str8 != null) {
            nVar.LJJIIJ("region", str8);
        }
        String str9 = this.LIZIZ.LJIIIZ;
        if (str9 != null) {
            nVar.LJJIIJ("language", str9);
        }
        nVar.LJJIIJ("device_model", Build.MODEL);
        nVar.LJJIIJ("sdk_version", "1.0-tiktok-monorepo");
        nVar.LJJIIJ("device_brand", Build.BRAND);
        return nVar;
    }

    public C1520430pfV(HybridSettingInitConfig hybridSettingInitConfig) {
        super(hybridSettingInitConfig);
    }
}
