package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341770l1L {
    public static C1362520lYo LIZ(int i, int i2, int i3, ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel, boolean z, boolean z2) {
        View viewTd;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        if (z2) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn3, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn2, viewGroup, false);
            View viewFindViewById = viewTd.findViewById(R.id.i33);
            C1362230lYL c1362230lYL = sharePanelViewModel.LLJI;
            if (c1362230lYL != null) {
                viewTd.getLayoutParams().width = c1362230lYL.LJIIJJI;
                TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.tv_title);
                if (tuxTextView != null) {
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams4 = null;
                    if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        layoutParams4 = layoutParams2;
                    }
                    C786410Ut5.R6(tuxTextView, layoutParams4);
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    Integer num = c1362230lYL.LJIIZILJ;
                    if (num != null) {
                        tuxTextView.setTuxFont(num.intValue());
                    }
                }
                View viewFindViewById2 = viewTd.findViewById(R.id.biz);
                if (viewFindViewById2 != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
                    int i4 = c1362230lYL.LJIIL;
                    layoutParams.width = i4;
                    layoutParams.height = i4;
                }
            } else if (z) {
                viewTd.getLayoutParams().width = i;
                int dimensionPixelOffset = viewGroup.getResources().getDimensionPixelOffset(R.dimen.a2s);
                ViewGroup.LayoutParams layoutParams5 = viewFindViewById.getLayoutParams();
                layoutParams5.width = dimensionPixelOffset;
                layoutParams5.height = dimensionPixelOffset;
            }
            TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.tv_title);
            tuxTextView2.setMaxLines(i2);
            tuxTextView2.setTextColorRes(i3);
        }
        return new C1362520lYo(viewTd, sharePanelViewModel, z2);
    }
}
