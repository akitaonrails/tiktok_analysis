package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858870yTN {
    public static final FrameLayout.LayoutParams LIZJ(List<Integer> list) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 0))));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 1)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 2))));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 3)));
        return layoutParams;
    }

    public static final View LIZLLL(Context context) {
        View view = new View(context);
        view.setId(R.id.esl);
        C19ME c19me = new C19ME(-1, 0);
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        c19me.startToStart = 0;
        C786410Ut5.W5(view, c19me);
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, new TypedValue(), true);
        view.setBackgroundColor(0);
        C786410Ut5.LJLLLLLL(8, view);
        view.setClickable(true);
        view.setFocusable(true);
        return view;
    }

    public static View LJI(Context context) {
        return LIZIZ(context, R.id.er8, LIZJ(C1697810uHb.LJIIJJI(12, 12, 12, 10)));
    }

    public static View LJII(Context context) {
        return LIZIZ(context, R.id.etd, LIZJ(C1697810uHb.LJIIJJI(0, 0, 0, 0)));
    }

    public static final View LJFF(Context context, List<Integer> list) {
        return LIZIZ(context, R.id.er7, LIZJ(list));
    }

    public static final View LJIIIIZZ(Context context, List<Integer> list) {
        FrameLayout.LayoutParams layoutParamsLIZJ = LIZJ(list);
        layoutParamsLIZJ.width = -2;
        return LIZIZ(context, R.id.eth, layoutParamsLIZJ);
    }

    public static View LJIILIIL(Context context, List list) {
        FrameLayout frameLayoutLIZIZ = LIZIZ(context, R.id.eta, LIZJ(list));
        C1857280yQo.LIZJ(frameLayoutLIZIZ, C444960Hcc.LIZIZ());
        return frameLayoutLIZIZ;
    }

    public static View LJIILJJIL(Context context, List list) {
        return LIZIZ(context, R.id.etr, LIZJ(list));
    }

    public static final FrameLayout LIZIZ(Context context, int i, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(i);
        C786410Ut5.a6(frameLayout, layoutParams);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View LJIIIZ(Context context, List list, Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (C07ID.LIZ()) {
                list = C1918907fP.LJIIIIZZ;
            } else {
                list = C1697810uHb.LJIIJJI(Integer.valueOf(((Number) ListProtector.get(list, 0)).intValue() + 16), ListProtector.get(list, 1), Integer.valueOf(((Number) ListProtector.get(list, 2)).intValue() + 12), ListProtector.get(list, 3));
            }
        }
        FrameLayout.LayoutParams layoutParamsLIZJ = LIZJ(list);
        C1858390ySb.LIZ.getClass();
        if (C1858390ySb.LIZ()) {
            layoutParamsLIZJ.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        return LIZIZ(context, R.id.esa, layoutParamsLIZJ);
    }

    public static final View LJIIJJI(Context context, List list, Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            list = C1697810uHb.LJIIJJI(0, 0, 0, 0);
        }
        return LIZIZ(context, R.id.esn, LIZJ(list));
    }

    public static final C19ME LIZ(Integer num, Integer num2, Integer num3, List list) {
        int iIntValue;
        int iIntValue2;
        C19ME c19me = new C19ME(-1, -2);
        if (num == null) {
            c19me.topToTop = 0;
        } else {
            c19me.topToBottom = num.intValue();
        }
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 0;
        }
        c19me.endToEnd = iIntValue;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        c19me.startToEnd = iIntValue2;
        c19me.horizontalBias = 0.0f;
        c19me.constrainedWidth = true;
        c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 0))));
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 1)));
        c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 2))));
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 3)));
        return c19me;
    }

    public static final C14J2 LJ(Context context, List<Integer> list, Integer num, Integer num2, Integer num3, boolean z, boolean z2) {
        float fLIZIZ;
        C14J2 c14j2 = new C14J2(0, 14, context, null);
        c14j2.setId(R.id.ety);
        C19ME c19meLIZ = LIZ(num, num2, num3, list);
        c19meLIZ.goneTopMargin = 0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14j2);
        c14j2.setLayoutParams(c19meLIZ);
        if (C299000Bnm.LIZ()) {
            C1857280yQo.LIZJ(c14j2, C444960Hcc.LIZIZ());
        }
        if (C07ID.LIZ()) {
            c14j2.setPaddingRelative(0, 0, 0, 0);
            return c14j2;
        }
        if (z2) {
            fLIZIZ = C418440Gaw.LIZIZ(4);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(0);
        }
        int iLIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (z) {
            c14j2.setPaddingRelative(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            return c14j2;
        }
        c14j2.setPaddingRelative(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        return c14j2;
    }
}
