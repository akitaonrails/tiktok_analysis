package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0GrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428740GrY {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1355));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1356));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1358));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1357));

    public static final ViewGroup.MarginLayoutParams LIZJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) LIZ.getValue()).intValue());
        int iIntValue = ((Number) LIZIZ.getValue()).intValue();
        marginLayoutParams.setMarginStart(iIntValue);
        marginLayoutParams.setMarginEnd(iIntValue);
        return marginLayoutParams;
    }

    public static final ConstraintLayout LIZIZ(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackground(LIZ(C418440Gaw.LIZIZ(10), context));
        int iGenerateViewId = View.generateViewId();
        int iGenerateViewId2 = View.generateViewId();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(iGenerateViewId);
        tuxIconView.setIconRes(R.raw.icon_twinkle_star_fill);
        C01GW c01gw = LIZJ;
        tuxIconView.setIconWidth(((Number) c01gw.getValue()).intValue());
        tuxIconView.setIconHeight(((Number) c01gw.getValue()).intValue());
        tuxIconView.setTintColorRes(R.attr.z_);
        C19ME c19me = new C19ME(-2, -2);
        c19me.setMarginEnd(((Number) LIZLLL.getValue()).intValue());
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.endToStart = iGenerateViewId2;
        c19me.bottomToBottom = 0;
        c19me.horizontalChainStyle = 2;
        constraintLayout.addView(tuxIconView, c19me);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(iGenerateViewId2);
        tuxTextView.setText(2131835864);
        tuxTextView.setTuxFont(103);
        tuxTextView.setTextColorRes(R.attr.z_);
        C19ME c19me2 = new C19ME(-2, -2);
        c19me2.startToEnd = iGenerateViewId;
        c19me2.topToTop = 0;
        c19me2.endToEnd = 0;
        c19me2.bottomToBottom = 0;
        c19me2.horizontalChainStyle = 2;
        constraintLayout.addView(tuxTextView, c19me2);
        return constraintLayout;
    }

    public static final StateListDrawable LIZ(float f, Context context) {
        int[] iArr;
        GradientDrawable.Orientation orientation;
        if (!C440480HPa.LIZJ()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cc, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ce, context);
                if (numLIZJ2 != null) {
                    iArr = new int[]{iIntValue, numLIZJ2.intValue()};
                }
            }
            return null;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.cq, context);
        if (numLIZJ3 != null) {
            int iIntValue2 = numLIZJ3.intValue();
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.cc, context);
            if (numLIZJ4 != null) {
                int iIntValue3 = numLIZJ4.intValue();
                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ce, context);
                if (numLIZJ5 != null) {
                    iArr = new int[]{iIntValue2, iIntValue3, numLIZJ5.intValue()};
                }
            }
        }
        return null;
        if (C440480HPa.LIZJ()) {
            orientation = GradientDrawable.Orientation.BL_TR;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, iArr);
        gradientDrawable2.setAlpha(102);
        gradientDrawable2.setCornerRadius(f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        return stateListDrawable;
    }

    public static final String LIZLLL(Context context, String str) {
        int iN3 = C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName());
        String string = null;
        if (iN3 == 0) {
            return null;
        }
        try {
            string = context.getString(iN3);
            return string;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }
}
