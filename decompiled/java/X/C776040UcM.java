package X;

import android.app.Activity;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776040UcM {
    public final Activity LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 14));

    public C776040UcM(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    public static void LIZ(Activity activity) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (attributes.screenBrightness != -1.0f) {
                attributes.screenBrightness = -1.0f;
                activity.getWindow().setAttributes(attributes);
                C20441214yg.LIZIZ("BrightnessDowngrade", "restoreScreenBrightness success");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BrightnessDowngrade", "restoreScreenBrightness error", e);
        }
    }
}
