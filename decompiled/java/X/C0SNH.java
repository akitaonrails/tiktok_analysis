package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performance.ab.PhotoModeImgFypPriorityConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SNH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SNH extends C09AY implements Function0<PhotoModeImgFypPriorityConfig> {
    public C0SNH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PhotoModeImgFypPriorityConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PhotoModeImgFypPriorityConfig photoModeImgFypPriorityConfig = C0SNG.LIZ;
            PhotoModeImgFypPriorityConfig photoModeImgFypPriorityConfig2 = (PhotoModeImgFypPriorityConfig) c0c64LJIILLIIL.LJJII(PhotoModeImgFypPriorityConfig.class, photoModeImgFypPriorityConfig, "photomode_img_fyp_priority_exp", true);
            return photoModeImgFypPriorityConfig2 != null ? photoModeImgFypPriorityConfig2 : photoModeImgFypPriorityConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C0SNG.LIZ;
        }
    }
}
