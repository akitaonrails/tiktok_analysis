package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PXI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXI {
    public static final void LIZ(TuxTextView tuxTextView) {
        LinearLayout.LayoutParams layoutParams;
        tuxTextView.setGravity(8388627);
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            if (layoutParams != null) {
                layoutParams.gravity = 8388611;
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.R6(tuxTextView, layoutParams);
    }

    public static final void LIZIZ(TuxTextView tuxTextView, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i);
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
    }

    public static final void LIZJ(Aweme aweme, Boolean bool, String str, String str2, Integer num) {
        ISearchContextAbility iSearchContextAbilityLIZJ;
        C0PCY<C0PYD> c0pcyY30;
        if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null && (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) != null) {
            c0pcyY30.LIZ(new C640020P8m(new C0PXE(str, str2, num, null, bool)));
        }
    }
}
