package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914080zuQ implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final FrameLayout LLILLJJLI;
    public final ScrollView LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public final TuxIconView LLILZLL;
    public final TuxIconView LLIZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1914080zuQ LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i64, viewGroup, false);
        int i = R.id.cfq;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.cfq, viewTd);
        if (frameLayout != null) {
            i = R.id.u3i;
            ScrollView scrollView = (ScrollView) C1616006Uk.LIZ(R.id.u3i, viewTd);
            if (scrollView != null) {
                i = R.id.yc8;
                FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.yc8, viewTd);
                if (frameLayout2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                    i = R.id.universal_popup_sub_fragment;
                    FrameLayout frameLayout3 = (FrameLayout) C1616006Uk.LIZ(R.id.universal_popup_sub_fragment, viewTd);
                    if (frameLayout3 != null) {
                        i = R.id.upper_left_back_button;
                        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.upper_left_back_button, viewTd);
                        if (tuxIconView != null) {
                            i = R.id.upper_right_close_button;
                            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.upper_right_close_button, viewTd);
                            if (tuxIconView2 != null) {
                                return new C1914080zuQ(constraintLayout, frameLayout, scrollView, frameLayout2, frameLayout3, tuxIconView, tuxIconView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public C1914080zuQ(ConstraintLayout constraintLayout, FrameLayout frameLayout, ScrollView scrollView, FrameLayout frameLayout2, FrameLayout frameLayout3, TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = scrollView;
        this.LLILZ = frameLayout2;
        this.LLILZIL = frameLayout3;
        this.LLILZLL = tuxIconView;
        this.LLIZ = tuxIconView2;
    }
}
