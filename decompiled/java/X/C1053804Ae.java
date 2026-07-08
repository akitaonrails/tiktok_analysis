package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.04Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1053804Ae implements InterfaceC1053404Aa {
    public final C817603Hi LIZ = new C817603Hi();
    public BcmParams LIZIZ;

    public final String LJIIIZ() {
        return LJI("c1732.d0", null);
    }

    @Override // X.InterfaceC1053404Aa
    public final BcmParams getBcmParams() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1053404Aa
    public final C817603Hi gv() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1053404Aa
    public final Map<String, Object> LIZJ(C817803Hk c817803Hk) {
        return this.LIZ.LIZIZ(c817803Hk);
    }

    @Override // X.InterfaceC1053404Aa
    public final Map<String, Object> LJ(String str) {
        return gv().LIZ(str);
    }

    public final void LJIIJJI(Map<String, String> map) {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(this.LIZ.LIZLLL);
        BcmParams.Companion.getClass();
        btmSDK.setBcmPageParams(pageFinderVia, C212367188v.LIZJ(map), null);
        this.LIZIZ = C212367188v.LIZJ(map);
    }

    @Override // X.InterfaceC1053404Aa
    public final String LIZ(String str, BcmParams bcmParams) {
        return this.LIZ.LIZJ(str, bcmParams);
    }

    @Override // X.InterfaceC1053404Aa
    public final String LIZIZ(String str, String str2) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (C123100dR.LIZ(str2)) {
            builderBuildUpon.appendQueryParameter("source_btm_token", str2);
        }
        return builderBuildUpon.build().toString();
    }

    @Override // X.InterfaceC1053404Aa
    public final void LIZLLL(Map<String, String> map, boolean z) {
        BcmParams bcmParamsLIZJ = this.LIZIZ;
        if (bcmParamsLIZJ != null) {
            bcmParamsLIZJ.merge(map);
        } else {
            BcmParams.Companion.getClass();
            bcmParamsLIZJ = C212367188v.LIZJ(map);
        }
        BtmSDK.INSTANCE.setBcmPageParams(PageFinder.via(this.LIZ.LIZLLL), bcmParamsLIZJ, Boolean.valueOf(z));
        this.LIZIZ = bcmParamsLIZJ;
    }

    @Override // X.InterfaceC1053404Aa
    public final void LJFF(Fragment fragment, String str) {
        C817603Hi c817603Hi = this.LIZ;
        if (c817603Hi.LIZ) {
            return;
        }
        c817603Hi.LJIIL(fragment, "a2270.b6661", str);
    }

    @Override // X.InterfaceC1053404Aa
    public final String LJI(String str, BcmParams bcmParams) {
        return C1020303yr.LIZ(this, str, bcmParams);
    }

    public final String LJIIJ(int i, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 14) {
                        if (i != 17 || str == null) {
                            return null;
                        }
                        return LJI(str, null);
                    }
                    return LJI("c3256.d5861", null);
                }
                return LJI("c3256.d6034", null);
            }
            return LJI("c3256.d2546", null);
        }
        return LJI("c7438.d9566", null);
    }

    @Override // X.InterfaceC1053404Aa
    public final String LJII(String str, String str2, BcmParams bcmParams) {
        if (bcmParams == null) {
            bcmParams = this.LIZIZ;
        }
        String strLJ = this.LIZ.LJ(str, str2, bcmParams);
        if (strLJ != null) {
            return strLJ;
        }
        return str2;
    }

    public final String LJIIIIZZ(String str, EnumC1751780vge enumC1751780vge, String str2) {
        int i = C1751790vgf.LIZ[enumC1751780vge.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LJII("c35259.d11651", str, null);
                        }
                        throw new C1954807lC();
                    }
                    if (str2 == null) {
                        str2 = "c2857.d0";
                    }
                    return LJII(str2, str, null);
                }
                return LJII("c2791.d9360", str, null);
            }
            return LJII("c1732.d0", str, null);
        }
        return LJII("c8498.d60354", str, null);
    }
}
