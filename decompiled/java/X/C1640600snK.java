package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0snK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640600snK {
    public static float LIZ = 80.0f;
    public static float LIZIZ = 44.0f;

    public static final Pair<FrameLayout, C1662850tND> LIZIZ(Context context) {
        float fLJII = (((C11VU.LJII(C497820Jfg.LIZIZ(context), context) - 32.0f) - 48.0f) - 72.0f) / 3;
        return LIZ(context, fLJII, fLJII, (int) C11VU.LIZIZ(24.0f + fLJII, context), (int) C11VU.LIZIZ(fLJII, context), Float.valueOf(12.0f), Float.valueOf(0.0f), Float.valueOf(12.0f), Float.valueOf(0.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LIZJ(Context context) {
        float fLJII = (((C11VU.LJII(C497820Jfg.LIZIZ(context), context) - 40.0f) - 0.0f) - 60.0f) / 4;
        return LIZ(context, fLJII, fLJII, (int) C11VU.LIZIZ(20.0f + fLJII, context), (int) C11VU.LIZIZ(fLJII, context), Float.valueOf(10.0f), Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(0.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LIZLLL(Context context) {
        return LIZ(context, 40.0f, 40.0f, (int) C11VU.LIZIZ(57.0f, context), (int) C11VU.LIZIZ(75.0f, context), null, Float.valueOf(8.0f), null, Float.valueOf(8.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LJ(Context context) {
        return LIZ(context, 93.0f, 93.0f, (int) C11VU.LIZIZ(125.0f, context), (int) C11VU.LIZIZ(109.0f, context), Float.valueOf(16.0f), Float.valueOf(8.0f), Float.valueOf(16.0f), Float.valueOf(8.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LJFF(Context context) {
        return LIZ(context, 80.0f, 80.0f, (int) C11VU.LIZIZ(86.0f, context), (int) C11VU.LIZIZ(86.0f, context), Float.valueOf(3.0f), Float.valueOf(3.0f), Float.valueOf(3.0f), Float.valueOf(3.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LJI(Context context) {
        float f = LIZ;
        float f2 = LIZ;
        return LIZ(context, f, f2, (int) C11VU.LIZIZ(f2 + 20.0f, context), (int) C11VU.LIZIZ(LIZ + 20.0f, context), Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(10.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LJII(Context context) {
        float fLJII = (((C11VU.LJII(C497820Jfg.LIZIZ(context), context) - 32.0f) - 48.0f) - 72.0f) / 3;
        float f = 24.0f + fLJII;
        return LIZ(context, fLJII, fLJII, (int) C11VU.LIZIZ(f, context), (int) C11VU.LIZIZ(f, context), Float.valueOf(12.0f), Float.valueOf(12.0f), Float.valueOf(12.0f), Float.valueOf(12.0f));
    }

    public static final Pair<FrameLayout, C1662850tND> LIZ(Context context, float f, float f2, int i, int i2, Float f3, Float f4, Float f5, Float f6) {
        C1641160soE c1641160soE = new C1641160soE(context);
        c1641160soE.LJ = (int) C11VU.LIZIZ(f, context);
        c1641160soE.LJFF = (int) C11VU.LIZIZ(f2, context);
        c1641160soE.LJIIIZ = false;
        c1641160soE.LJIIZILJ = false;
        c1641160soE.LJIIIIZZ = R.drawable.cd_;
        c1641160soE.LJJ = true;
        View viewLIZ = c1641160soE.LIZ();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewLIZ);
        viewLIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(i, i2));
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(context, 588);
        frameLayout.setPadding(((Number) awS598S0100000_19.invoke(f3)).intValue(), ((Number) awS598S0100000_19.invoke(f4)).intValue(), ((Number) awS598S0100000_19.invoke(f5)).intValue(), ((Number) awS598S0100000_19.invoke(f6)).intValue());
        frameLayout.addView(viewLIZ);
        return new Pair<>(frameLayout, viewLIZ);
    }
}
