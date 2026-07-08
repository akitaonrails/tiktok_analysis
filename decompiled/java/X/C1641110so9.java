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

/* JADX INFO: renamed from: X.0so9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641110so9 {
    public static final HashMap<Float, Float> LIZ = new HashMap<>();

    public static final float LIZ(float f, Context context) {
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

    public static final Pair<FrameLayout, C1244090iTn> LIZIZ(C1641120soA c1641120soA, Context context) {
        float f = c1641120soA.LJII;
        float f2 = c1641120soA.LJIIIIZZ;
        float f3 = c1641120soA.LJFF;
        float f4 = c1641120soA.LJI;
        float f5 = c1641120soA.LJIIIZ;
        float f6 = c1641120soA.LJIIJ;
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(620);
        AFwS266S0000000_25 aFwS266S0000000_252 = AFwS266S0000000_25.get$arr$(621);
        C1641140soC c1641140soC = C1641140soC.LIZ;
        AwS3S0300002_25 awS3S0300002_25 = new AwS3S0300002_25(context, f3, f4, c1641120soA, aFwS266S0000000_252, 1);
        c1641140soC.getClass();
        C1641180soG c1641180soG = new C1641180soG(context);
        awS3S0300002_25.invoke(c1641180soG);
        C1244090iTn c1244090iTnLIZ = c1641180soG.LIZ();
        if (C12VA.LIZ().LJFF) {
            TextView textView = c1244090iTnLIZ.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = c1244090iTnLIZ.getTextView();
            if (textView2 != null) {
                C19734012Iw.LIZJ(textView2);
            }
        } else {
            TextView textView3 = c1244090iTnLIZ.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = c1244090iTnLIZ.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) LIZ(f, context), (int) LIZ(f2, context));
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = (int) C11VU.LIZIZ(17.0f, context);
        layoutParams.rightMargin = (int) C11VU.LIZIZ(17.0f, context);
        layoutParams.topMargin = (int) C11VU.LIZIZ(9.0f, context);
        aFwS266S0000000_25.getClass();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1244090iTnLIZ);
        c1244090iTnLIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams((int) LIZ(f5, context), (int) LIZ(f6, context)));
        frameLayout.addView(c1244090iTnLIZ);
        return new Pair<>(frameLayout, c1244090iTnLIZ);
    }
}
