package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0FKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388300FKi {
    public static final C391040FUw LIZ = C391040FUw.LIZ;

    public static String LIZIZ() {
        LIZ.getClass();
        return C391040FUw.LIZIZ.getString("fallback_fonts_config", "");
    }

    public static String LIZJ() {
        LIZ.getClass();
        return C391040FUw.LIZIZ.getString("fallback_fonts_unzip_path", "");
    }

    public static void LIZ(View view) {
        LIZ.getClass();
        Keva keva = C391040FUw.LIZIZ;
        if (keva.getBoolean("read_text_guide_shown_v2", false)) {
            return;
        }
        keva.storeBoolean("read_text_guide_shown_v2", true);
        LIZLLL(view);
    }

    public static void LIZLLL(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
        duration.setInterpolator(new TimeInterpolator() { // from class: X.0FKh
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                if ((0.0f <= f && f <= 0.18f) || (0.18f <= f && f <= 0.36f)) {
                    return f * 1.11f;
                }
                if (0.36f <= f && f <= 0.56f) {
                    f2 = 0.04f;
                } else {
                    if (0.56f > f || f > 0.8f) {
                        return f;
                    }
                    f *= 0.833f;
                    f2 = 0.1336f;
                }
                return f + f2;
            }
        });
        animatorSet.play(duration).after(duration.clone()).after(1500L);
        animatorSet.start();
    }
}
