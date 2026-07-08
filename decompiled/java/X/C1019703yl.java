package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.03yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1019703yl implements InterfaceC1053404Aa {
    public final C817603Hi LIZ = new C817603Hi();
    public BcmParams LIZIZ;

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

    public final void LJIIIIZZ(Map<String, String> map) {
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
        c817603Hi.LJIIL(fragment, "a2270.b9667", str);
    }

    @Override // X.InterfaceC1053404Aa
    public final String LJI(String str, BcmParams bcmParams) {
        return C1020303yr.LIZ(this, str, bcmParams);
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
}
