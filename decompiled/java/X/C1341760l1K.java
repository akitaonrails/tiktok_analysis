package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341760l1K {
    public static C1361550lXF LIZ(ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        int i4;
        View viewTd;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        int i5 = C1361550lXF.LLJILJIL;
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        if ((i3 & 16) != 0) {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        if ((i3 & 64) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        if ((i3 & 128) != 0) {
            i2 = R.attr.a1j;
        }
        if (z2) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn9, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn8, viewGroup, false);
            C1362230lYL c1362230lYL = sharePanelViewModel.LLJI;
            if (c1362230lYL != null) {
                viewTd.getLayoutParams().width = c1362230lYL.LJIIJJI;
                TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.upvote_entrance_tv);
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
                View viewFindViewById = viewTd.findViewById(R.id.upvote_entrance_img);
                if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                    int i6 = c1362230lYL.LJIIL;
                    layoutParams.width = i6;
                    layoutParams.height = i6;
                }
                ((RadiusLayout) viewTd.findViewById(R.id.upvote_entrance_img_container)).setRadius(c1362230lYL.LJIIL / 2.0f);
            } else if (z) {
                viewTd.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                View viewFindViewById2 = viewTd.findViewById(R.id.upvote_entrance_tv);
                if (viewFindViewById2 != null) {
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) viewFindViewById2.getLayoutParams();
                    layoutParams5.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.W5(viewFindViewById2, layoutParams5);
                    ((TuxTextView) viewFindViewById2).setTextColorRes(i2);
                }
            } else {
                if (z3) {
                    int dimensionPixelOffset = viewGroup.getResources().getDimensionPixelOffset(R.dimen.a2s);
                    viewTd.getLayoutParams().width = i;
                    View viewFindViewById3 = viewTd.findViewById(R.id.upvote_entrance_img);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams6 = viewFindViewById3.getLayoutParams();
                        if (layoutParams6 != null) {
                            layoutParams6.height = dimensionPixelOffset;
                        }
                        ViewGroup.LayoutParams layoutParams7 = viewFindViewById3.getLayoutParams();
                        if (layoutParams7 != null) {
                            layoutParams7.width = dimensionPixelOffset;
                        }
                    }
                }
                TextView textView = (TextView) viewTd.findViewById(R.id.upvote_entrance_tv);
                if (textView != null) {
                    textView.setMaxLines(i4);
                    ((TuxTextView) textView).setTextColorRes(i2);
                }
            }
        }
        return new C1361550lXF(viewTd, sharePanelViewModel, z2, i);
    }
}
