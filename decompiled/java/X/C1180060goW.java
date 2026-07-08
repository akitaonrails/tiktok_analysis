package X;

import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0goW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180060goW {
    public static final int LIZLLL(View view) {
        int marginStart;
        int marginEnd = 0;
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return marginStart + marginEnd;
    }

    public static final int LJ(View view) {
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }

    public static final int LJFF(View view) {
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        return view.getMeasuredWidth();
    }

    public static final int LJI(View view) {
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        return view.getPaddingStart() + view.getPaddingEnd();
    }

    public static final int LJII(String str) {
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static final void LJIILIIL(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
    }

    public static final int LJIILJJIL(View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        return view.getMeasuredWidth();
    }

    public static void LIZ(View view, Function0 function0) {
        C2211631BhB.LJ(view, new AwS384S0200000_18((Function1) null, (Function1<? super C20248814Kw, Unit>) function0, (Function0<Unit>) 35));
    }

    public static final void LJIIIZ(int i, View view) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIIJJI(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIILL(View view, Function1<? super Integer, Unit> function1) {
        if (view == null) {
            function1.invoke(0);
        } else if (view.getWidth() > 0) {
            function1.invoke(Integer.valueOf(view.getWidth()));
        } else {
            HandlerHook.viewPost(view, new ARunnableS79S0200000_10(view, function1, 17));
        }
    }

    public static final Drawable LIZJ(float f, int i, Context context) {
        if (f > 0.0f) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(i);
            c384050F3z.LIZJ = Float.valueOf(f);
            return c384050F3z.LIZ(context);
        }
        return new ColorDrawable(i);
    }

    public static final Integer LJIIIIZZ(Context context, String str, Integer num) {
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            if (str == null) {
                str = "";
            }
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
            if (c698190Ra5LJFF != null) {
                num = Integer.valueOf(c698190Ra5LJFF.LIZ);
                return num;
            }
            return num;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return num;
        }
    }

    public static final void LJIIJ(float f, int i, C197039127h c197039127h) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o_, c197039127h.getContext());
        if (numLIZJ != null) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LIZJ(f, C2441009hQ.LJIIJ(numLIZJ.intValue(), i), c197039127h.getContext()));
            stateListDrawable.addState(new int[0], LIZJ(f, i, c197039127h.getContext()));
            c197039127h.setBackground(stateListDrawable);
        }
    }

    public static final void LJIIL(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
    }

    public static C443120HZe LIZIZ(TuxTextView tuxTextView, TuxTextView tuxTextView2, int i, boolean z) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        int iLJFF = LJFF(tuxTextView);
        int iLJFF2 = LJFF(tuxTextView2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expectView1Width = ");
        sbLIZ.append(iLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("expectView2Width = ");
        sbLIZ2.append(iLJFF2);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("minZipWidth = ");
        sbLIZ3.append(iLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("availableMaxWidth = ");
        sbLIZ4.append(i);
        C2188811AlT.LIZIZ(sbLIZ4);
        int i2 = iLJFF + iLJFF2;
        if (i2 > i) {
            if (z) {
                int iMin = Math.min(Math.max(i - iLJFF2, iLIZIZ), iLJFF);
                LJIIJJI(tuxTextView, iMin);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("finalV1Width = ");
                sbLIZ5.append(iMin);
                C2188811AlT.LIZIZ(sbLIZ5);
                int i3 = i - iMin;
                LJIIJJI(tuxTextView2, i3);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("finalV2Width = ");
                sbLIZ6.append(i3);
                C2188811AlT.LIZIZ(sbLIZ6);
                return new C443120HZe(Integer.valueOf(iMin), Integer.valueOf(i3), Integer.valueOf(iMin + i3));
            }
            int iMin2 = Math.min(Math.max(i - iLJFF, iLIZIZ), iLJFF2);
            LJIIJJI(tuxTextView2, iMin2);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("finalV2Width = ");
            sbLIZ7.append(iMin2);
            C2188811AlT.LIZIZ(sbLIZ7);
            int i4 = i - iMin2;
            LJIIJJI(tuxTextView, i4);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("finalV1Width = ");
            sbLIZ8.append(i4);
            C2188811AlT.LIZIZ(sbLIZ8);
            return new C443120HZe(Integer.valueOf(i4), Integer.valueOf(iMin2), Integer.valueOf(i4 + iMin2));
        }
        LJIIJJI(tuxTextView, iLJFF);
        LJIIJJI(tuxTextView2, iLJFF2);
        return new C443120HZe(Integer.valueOf(iLJFF), Integer.valueOf(iLJFF2), Integer.valueOf(i2));
    }
}
