package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import u4.q0;

/* JADX INFO: renamed from: X.0so7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641090so7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(604));
    public static final HashMap<Float, Float> LIZIZ = new HashMap<>();

    public static final boolean LIZJ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final float LIZIZ(float f, Context context) {
        if (f >= 0.0f) {
            HashMap<Float, Float> map = LIZIZ;
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

    public static final Pair<FrameLayout, C1662850tND> LIZLLL(C1641120soA c1641120soA, Context context) {
        return LIZ(c1641120soA, context, c1641120soA.LJFF, c1641120soA.LJI, -2.0f, -2.0f, 0, 0, false, AFwS266S0000000_25.get$arr$(619), 4064);
    }

    public static Pair LIZ(C1641120soA c1641120soA, Context context, float f, float f2, float f3, float f4, int i, int i2, boolean z, Function1 function1, int i3) {
        int i4;
        int i5;
        AFwS266S0000000_25 aFwS266S0000000_25;
        boolean z2 = z;
        int i6 = i;
        float f5 = f4;
        Function1 function12 = function1;
        int i7 = i2;
        float f6 = f3;
        float f7 = f2;
        float f8 = f;
        if ((i3 & 2) != 0) {
            f8 = c1641120soA.LJFF;
        }
        if ((i3 & 4) != 0) {
            f7 = c1641120soA.LJI;
        }
        if ((i3 & 8) != 0) {
            f6 = c1641120soA.LJII;
        }
        if ((i3 & 16) != 0) {
            f5 = c1641120soA.LJIIIIZZ;
        }
        if ((i3 & 32) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        if ((i3 & 128) != 0) {
            i6 = 58;
        }
        if ((i3 & 256) != 0) {
            i7 = 58;
        }
        if ((i3 & 1024) != 0) {
            z2 = false;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(617);
        } else {
            aFwS266S0000000_25 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            function12 = AFwS266S0000000_25.get$arr$(618);
        }
        C1641130soB c1641130soB = new C1641130soB(context, f8, f7, (int) (((ScreenUtils.getScreenWidth(context) - (c1641120soA.LJJIIJZLJL * LIZIZ(c1641120soA.LJIIJJI, context))) - LIZIZ(8.0f, context)) / c1641120soA.LJJIIJZLJL), c1641120soA, i4, i5, false, i6, i7, z2, function12);
        C1641150soD c1641150soD = new C1641150soD(context);
        c1641130soB.invoke(c1641150soD);
        C1662860tNE c1662860tNELIZ = c1641150soD.LIZ();
        TextView textView = c1662860tNELIZ.getTextView();
        if (textView != null) {
            textView.setTextSize(11.0f);
        }
        TextView textView2 = c1662860tNELIZ.getTextView();
        if (textView2 != null) {
            textView2.setTypeface(Typeface.defaultFromStyle(0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) LIZIZ(f6, context), (int) LIZIZ(f5, context));
        layoutParams.gravity = 17;
        aFwS266S0000000_25.getClass();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662860tNELIZ);
        c1662860tNELIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(c1662860tNELIZ);
        q0.LJIJ(frameLayout, new C1698450uId(c1662860tNELIZ, 2));
        return new Pair(frameLayout, c1662860tNELIZ);
    }
}
