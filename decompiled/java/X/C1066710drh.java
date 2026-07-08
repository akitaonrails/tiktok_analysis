package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0drh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1066710drh extends C2202311BHh {
    public String LIZ;

    public String LJ() {
        String str = this.LIZ;
        boolean z = false;
        if (str != null && a0.LJJIIZI(str, "target=", false)) {
            z = true;
        }
        if (z) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LIZ), "target");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZJ("profile_bio_link", e);
            }
        } else {
            String str2 = this.LIZ;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public C1066710drh(String str) {
        this.LIZ = str;
    }

    @Override // X.C2202311BHh, X.InterfaceC2202301BHg
    public void LIZJ(String str) {
        this.LIZ = str;
    }
}
