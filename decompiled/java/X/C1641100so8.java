package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS3S0300002_25;

/* JADX INFO: renamed from: X.0so8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641100so8 {
    public static final HashMap<Float, Float> LIZ = new HashMap<>();

    public static final float LIZIZ(float f, Context context) {
        if (f >= 0.0f) {
            HashMap<Float, Float> map = LIZ;
            Float f2 = map.get(Float.valueOf(f));
            if (f2 != null) {
                return f2.floatValue();
            }
            float fLIZIZ = C11VU.LIZIZ(f, context);
            map.put(Float.valueOf(f), Float.valueOf(fLIZIZ));
            return fLIZIZ;
        }
        return f;
    }

    public static final Pair<FrameLayout, C1662850tND> LIZJ(C1641120soA c1641120soA, Context context) {
        return LIZ(c1641120soA, context, 0.0f, 0.0f, c1641120soA.LJII, c1641120soA.LJIIIIZZ, 0.0f, 0.0f, null, 486);
    }

    public static Pair LIZ(C1641120soA c1641120soA, Context context, float f, float f2, float f3, float f4, float f5, float f6, AFwS266S0000000_25 aFwS266S0000000_25, int i) {
        AFwS266S0000000_25 aFwS266S0000000_252;
        AFwS266S0000000_25 aFwS266S0000000_253 = aFwS266S0000000_25;
        float f7 = f6;
        float f8 = f5;
        float f9 = f4;
        float f10 = f3;
        float f11 = f2;
        float f12 = f;
        if ((i & 2) != 0) {
            f12 = c1641120soA.LJFF;
        }
        if ((i & 4) != 0) {
            f11 = c1641120soA.LJI;
        }
        if ((i & 8) != 0) {
            f10 = c1641120soA.LJII;
        }
        if ((i & 16) != 0) {
            f9 = c1641120soA.LJIIIIZZ;
        }
        if ((i & 32) != 0) {
            f8 = c1641120soA.LJIIIZ;
        }
        if ((i & 64) != 0) {
            f7 = c1641120soA.LJIIJ;
        }
        if ((i & 128) != 0) {
            aFwS266S0000000_252 = AFwS266S0000000_25.get$arr$(615);
        } else {
            aFwS266S0000000_252 = null;
        }
        if ((i & 256) != 0) {
            aFwS266S0000000_253 = AFwS266S0000000_25.get$arr$(616);
        }
        AwS3S0300002_25 awS3S0300002_25 = new AwS3S0300002_25(context, f12, f11, c1641120soA, aFwS266S0000000_253, 0);
        C1641160soE c1641160soE = new C1641160soE(context);
        awS3S0300002_25.invoke(c1641160soE);
        C1662850tND c1662850tNDLIZ = c1641160soE.LIZ();
        if (C12VA.LIZ().LJFF) {
            TextView textView = c1662850tNDLIZ.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = c1662850tNDLIZ.getTextView();
            if (textView2 != null) {
                C19734012Iw.LIZJ(textView2);
            }
        } else {
            TextView textView3 = c1662850tNDLIZ.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = c1662850tNDLIZ.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) LIZIZ(f10, context), (int) LIZIZ(f9, context));
        layoutParams.gravity = 17;
        aFwS266S0000000_252.getClass();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tNDLIZ);
        c1662850tNDLIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams((int) LIZIZ(f8, context), (int) LIZIZ(f7, context)));
        frameLayout.addView(c1662850tNDLIZ);
        return new Pair(frameLayout, c1662850tNDLIZ);
    }
}
