package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performance.ab.PhotoImageLightenConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335200kqk extends C09AY implements Function0<PhotoImageLightenConfig> {
    public C1335200kqk() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PhotoImageLightenConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PhotoImageLightenConfig photoImageLightenConfig = C1335190kqj.LIZ;
            PhotoImageLightenConfig photoImageLightenConfig2 = (PhotoImageLightenConfig) c0c64LJIILLIIL.LJJII(PhotoImageLightenConfig.class, photoImageLightenConfig, "photomode_lighten_config_opt_v4", true);
            return photoImageLightenConfig2 != null ? photoImageLightenConfig2 : photoImageLightenConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1335190kqj.LIZ;
        }
    }
}
