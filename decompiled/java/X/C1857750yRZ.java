package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yRZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857750yRZ {
    public static final Context LIZ;

    static {
        C844470XAv.LIZ.getClass();
        LIZ = C844470XAv.LIZ();
    }

    public static final int LJ() {
        C07QH.LIZ.getClass();
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C07QH.LIZ() ? 6 : 4)));
    }

    public static final int LIZLLL() {
        return C07ID.LIZ() ? C1918907fP.LIZ() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public static final int LJFF() {
        return C07ID.LIZ() ? C1918907fP.LIZ() : C1913307eV.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public static final Boolean LIZ(View view) {
        if (C0OBG.LIZIZ(view)) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final String LJII(int i) {
        return LIZ.getString(i);
    }

    public static final void LIZIZ(View view, Function1<? super ViewGroup.MarginLayoutParams, Unit> function1) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                function1.invoke(layoutParams);
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    public static final String LJIIIIZZ(int i, Object... objArr) {
        try {
            return LIZ.getString(i, Arrays.copyOf(objArr, objArr.length));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get string fail: ");
            sbLIZ.append(i);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ), null, 6);
            return "";
        }
    }

    public static final void LJIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJIIJJI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJIIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.leftMargin = i;
        }
        view.requestLayout();
    }

    public static final void LJIILIIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.rightMargin = i;
        }
        view.requestLayout();
    }

    public static final void LJIILJJIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJIILL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static void LIZJ(String str, Exception exc, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DM_ENSURE_TAG:");
        sbLIZ.append(str);
        C1AF0.LJFF(exc, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIIIZ(View view, boolean z, boolean z2) {
        if (C07ID.LIZ()) {
            if ((z || z2) && view != null) {
                C426750GoL.LJIIL(view, 0, 0, 0, 0, 16);
            }
        }
    }

    public static final StaticLayout LJI(CharSequence charSequence, AppCompatTextView appCompatTextView, int i, Integer num) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0 && 0 == 0) {
            numValueOf = Integer.valueOf(appCompatTextView.getWidth());
            if (numValueOf.intValue() <= 0) {
                return null;
            }
        }
        String str = (String) charSequence;
        StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(str, 0, str.length(), appCompatTextView.getPaint(), numValueOf.intValue()).setIncludePad(appCompatTextView.getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(appCompatTextView.getLineSpacingExtra(), appCompatTextView.getLineSpacingMultiplier());
        if (num != null && num.intValue() > 0) {
            lineSpacing.setMaxLines(num.intValue());
            lineSpacing.setEllipsize(TextUtils.TruncateAt.END);
        }
        return lineSpacing.build();
    }
}
