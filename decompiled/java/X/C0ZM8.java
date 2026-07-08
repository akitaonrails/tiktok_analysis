package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZM8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZM8<VIEW extends View> {
    public static void LIZ(LightInteractionCommonResource lightInteractionCommonResource, C869590Y9l c869590Y9l) {
        if (C123100dR.LIZ(lightInteractionCommonResource.getGeckoAnimationChannel()) && C123100dR.LIZ(lightInteractionCommonResource.getFullscreenAnimateId())) {
            C1440005kM.LIZ(new C15628069y(c869590Y9l));
        }
    }

    public static void LIZIZ(View view, LightInteractionCommonResource lightInteractionCommonResource) {
        if (Intrinsics.LJFF(lightInteractionCommonResource.getNeedVibrate(), Boolean.TRUE)) {
            Vibrator vibrator = (Vibrator) C786410Ut5.H2(view.getContext(), "vibrator");
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(25L, 100));
            } else {
                vibrator.vibrate(25L);
            }
        }
    }
}
