package X;

import Y.ARunnableS57S0300000_24;
import android.text.Layout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592990rYX extends C1592940rYS {
    @Override // X.C1592940rYS, X.AbstractC1592930rYR
    public final TuxTextView LJIIJ() {
        TuxTextView tuxTextViewLJIIJ = super.LJIIJ();
        tuxTextViewLJIIJ.addTextChangedListener(new C1620820sHQ(this, 1));
        return tuxTextViewLJIIJ;
    }

    @Override // X.C1592940rYS, X.AbstractC1592930rYR
    public final void LJJIJIL() {
        LJIILIIL();
        LJIILL();
        C1592950rYT c1592950rYT = this.LL;
        if (!LJIJ()) {
            TuxTextView tabTitleView = c1592950rYT.getTabTitleView();
            if (!Intrinsics.LJFF(tabTitleView != null ? tabTitleView.getText() : null, c1592950rYT.getContext().getResources().getString(2131837937))) {
                LJJJJLI(c1592950rYT, true);
            }
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c1592950rYT, new ARunnableS57S0300000_24(c1592950rYT, this, c1592950rYT, 11));
    }

    public C1592990rYX(C1592950rYT c1592950rYT) {
        super(c1592950rYT);
    }

    public static void LJJJJL(C1592950rYT c1592950rYT) {
        CharSequence text;
        Layout layout;
        TuxTextView tabTitleView = c1592950rYT.getTabTitleView();
        if (tabTitleView != null) {
            TuxTextView tabTitleView2 = c1592950rYT.getTabTitleView();
            if (tabTitleView2 != null) {
                text = tabTitleView2.getText();
            } else {
                text = null;
            }
            if (!Intrinsics.LJFF(text, c1592950rYT.getContext().getResources().getString(2131837937)) && (layout = tabTitleView.getLayout()) != null && layout.getEllipsisCount(tabTitleView.getLineCount() - 1) > 0) {
                tabTitleView.setText(tabTitleView.getContext().getResources().getString(2131837937));
            }
        }
    }

    public final void LJJJJLI(C1592950rYT c1592950rYT, boolean z) {
        c1592950rYT.setTitleTuxFont(LJIILLIIL(z));
        TuxTextView tabTitleView = c1592950rYT.getTabTitleView();
        if (tabTitleView != null && tabTitleView.getText().toString().length() > 16 && tabTitleView.getPaint().measureText(tabTitleView.getText().toString()) > 230.0f) {
            tabTitleView.setTextSize(1, 8.0f);
        }
    }
}
