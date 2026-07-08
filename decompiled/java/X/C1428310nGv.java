package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0nGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428310nGv {
    public static final RectF LIZLLL(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
        }
        return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static final int LJ(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public static final void LIZ(C1322110kVd c1322110kVd, UrlModel urlModel) {
        if (urlModel == null) {
            C1324750kZt.LIZIZ(c1322110kVd, 2130971789);
        } else {
            C1324750kZt.LJI(c1322110kVd, urlModel, (int) C11VU.LIZIZ(49.0f, c1322110kVd.getContext()), (int) C11VU.LIZIZ(49.0f, c1322110kVd.getContext()));
        }
    }

    public static final StaticLayout LIZIZ(AppCompatTextView appCompatTextView, int i) {
        return StaticLayout.Builder.obtain(appCompatTextView.getText(), 0, appCompatTextView.getText().length(), appCompatTextView.getPaint(), i).setIncludePad(appCompatTextView.getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(appCompatTextView.getLineSpacingExtra(), appCompatTextView.getLineSpacingMultiplier()).build();
    }

    public static final int LIZJ(TuxTextView tuxTextView, C1428240nGo c1428240nGo) {
        int maxWidth;
        C444830HcP c444830HcP = new C444830HcP();
        CharSequence text = c1428240nGo.LIZ;
        if (text == null) {
            text = tuxTextView.getText();
        }
        c444830HcP.LJIILIIL(text);
        c444830HcP.LJII(c1428240nGo.LIZIZ);
        Integer num = c1428240nGo.LIZJ;
        if (num != null) {
            maxWidth = num.intValue();
        } else {
            maxWidth = tuxTextView.getMaxWidth();
        }
        c444830HcP.LIZIZ.LJ = maxWidth;
        c444830HcP.LJIIIZ(tuxTextView.getMaxLines());
        c444830HcP.LIZIZ.LJII = tuxTextView.getEllipsize();
        return c444830HcP.LIZIZ().getHeight() + tuxTextView.getTotalPaddingTop() + tuxTextView.getTotalPaddingBottom();
    }

    public static final void LJIIIIZZ(View view, boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LJI(int i, View view, boolean z) {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(view.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (z) {
            i += statusBarHeight;
        }
        marginLayoutParams.topMargin = i;
        C786410Ut5.W5(view, marginLayoutParams);
    }

    public static final void LJII(View view, Number number, Number number2) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (number.intValue() != -1 && layoutParams != null) {
            layoutParams.width = number.intValue();
        }
        if (number2.intValue() != -1 && layoutParams != null) {
            layoutParams.height = number2.intValue();
        }
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static void LJFF(Rect rect, Context context, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if (C444960Hcc.LIZJ(context)) {
            rect.set(i2, 0, i, 0);
        } else {
            rect.set(i, 0, i2, 0);
        }
    }
}
