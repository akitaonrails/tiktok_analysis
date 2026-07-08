package X;

import android.view.animation.LinearInterpolator;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421770GgJ {
    public static void LIZIZ(SmartImageView smartImageView) {
        smartImageView.animate().cancel();
        C786410Ut5.Ob(smartImageView, 1.0f);
        C786410Ut5.pc(smartImageView, 1.0f);
        C786410Ut5.Jc(smartImageView, 0.0f);
        C786410Ut5.ed(smartImageView, 0.0f);
    }

    public static void LIZ(SmartImageView smartImageView, long j, Pair pair) {
        LIZIZ(smartImageView);
        smartImageView.animate().scaleX(((Number) pair.getFirst()).floatValue()).scaleY(((Number) pair.getSecond()).floatValue()).setDuration(j).setInterpolator(new LinearInterpolator()).start();
    }
}
