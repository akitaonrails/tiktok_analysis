package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ml.infra.MLSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;

/* JADX INFO: renamed from: X.0pQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511320pQo implements InterfaceC1512350pST {
    public final C1510230pP3 LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC1512350pST
    public final String LIZJ() {
        return "bytenn";
    }

    @Override // X.InterfaceC1512350pST
    public final String LIZ() {
        return this.LIZ.LIZ;
    }

    @Override // X.InterfaceC1512350pST
    public final String LIZIZ() {
        String str = this.LIZIZ;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1512350pST
    public final boolean enable() {
        return !TextUtils.isEmpty(this.LIZIZ);
    }

    public C1511320pQo(C1510230pP3 c1510230pP3) {
        String packageUrl;
        SmartSdkConfig sdkConfig;
        MLSdkConfig mlSdkConfig;
        this.LIZ = c1510230pP3;
        SmartSceneConfig smartSceneConfigLIZJ = C1511360pQs.LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ != null && (sdkConfig = smartSceneConfigLIZJ.getSdkConfig()) != null && (mlSdkConfig = sdkConfig.getMlSdkConfig()) != null) {
            packageUrl = mlSdkConfig.getPackageUrl();
        } else {
            packageUrl = null;
        }
        this.LIZIZ = packageUrl;
        SmartSceneConfig smartSceneConfigLIZJ2 = C1511360pQs.LIZJ(c1510230pP3);
        this.LIZJ = smartSceneConfigLIZJ2 != null ? smartSceneConfigLIZJ2.outType : null;
    }
}
