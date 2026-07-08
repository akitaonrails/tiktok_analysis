package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS155S1100000_6;

/* JADX INFO: renamed from: X.0HzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459080HzO {
    public static final C1972607o4 LIZ = C1972607o4.LL;

    public static final Context LJ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        return (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? C1383370m6R.LIZ : activityLIZIZ;
    }

    public static final Drawable LIZJ(Context context) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zs);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ(context);
    }

    public static final void LIZ(Fragment fragment, Float f) {
        View view;
        GradientDrawable gradientDrawable;
        DialogFragment dialogFragment;
        Dialog dialog;
        View viewFindViewById;
        C04RF.LIZ.getClass();
        if (((Boolean) C04RF.LIZIZ.getValue()).booleanValue() && f != null) {
            float fFloatValue = f.floatValue();
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null && (view = parentFragment.getView()) != null) {
                RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.spp);
                if (radiusLayout != null) {
                    radiusLayout.LIZ(fFloatValue, fFloatValue, 0.0f, 0.0f);
                }
                Fragment parentFragment2 = fragment.getParentFragment();
                Drawable background = null;
                if ((parentFragment2 instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment2) != null && (dialog = dialogFragment.getDialog()) != null && (viewFindViewById = dialog.findViewById(R.id.fpl)) != null) {
                    background = viewFindViewById.getBackground();
                }
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    gradientDrawable.setCornerRadii(new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, 0.0f});
                }
            }
        }
    }

    public static InputFilter[] LIZIZ(int i, C0I7D c0i7d) {
        return new InputFilter[]{LIZ, new C458940HzA(c0i7d, i, new AwS155S1100000_6(c0i7d, C20642515q3.LJ(2131755237, i, Integer.valueOf(i)), 0))};
    }

    public static final Drawable LIZLLL(Context context, Integer num) {
        C384050F3z c384050F3z = new C384050F3z();
        if (num == null) {
            num = Integer.valueOf(R.attr.a1e);
        }
        c384050F3z.LIZIZ = num;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ(context);
    }

    public static final void LJFF(String str, Pair<String, String>... pairArr) {
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        for (Pair<String, String> pair : pairArr) {
            String first = pair.getFirst();
            String second = pair.getSecond();
            if (second != null) {
                c830490Whz.put(first, second);
            }
        }
        C20684815ws.LJIILLIIL(str, c830490Whz);
    }
}
