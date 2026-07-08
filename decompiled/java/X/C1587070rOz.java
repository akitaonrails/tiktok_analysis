package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587070rOz implements InterfaceC1584860rLQ {
    public final String LIZ = "FRIENDS_FEED";
    public int LIZIZ;

    public final TuxTextView LJFF() {
        View view;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null) {
            return null;
        }
        HomeTabViewModel homeTabViewModelLIZ = HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ);
        View view2 = homeTabViewModelLIZ.LLILLL.get(homeTabViewModelLIZ.LLILLJJLI.get(this.LIZ));
        if (!(view2 instanceof View) || (view = view2) == null) {
            return null;
        }
        return (TuxTextView) view.findViewById(R.id.tv_tab_dot_count);
    }

    public final void LJI() {
        if (this.LIZIZ > 0) {
            return;
        }
        View viewLJII = LJII();
        if (viewLJII != null) {
            C337180DJs.LIZJ(viewLJII);
        }
        TuxTextView tuxTextViewLJFF = LJFF();
        if (tuxTextViewLJFF != null) {
            C337180DJs.LIZ(tuxTextViewLJFF);
        }
    }

    public final View LJII() {
        View view;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null) {
            return null;
        }
        HomeTabViewModel homeTabViewModelLIZ = HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ);
        View view2 = homeTabViewModelLIZ.LLILLL.get(homeTabViewModelLIZ.LLILLJJLI.get(this.LIZ));
        if (!(view2 instanceof View) || (view = view2) == null) {
            return null;
        }
        return view.findViewById(R.id.tv_tab_dot);
    }

    public final void LIZIZ() {
        View viewLJII = LJII();
        if (viewLJII != null) {
            C337180DJs.LIZ(viewLJII);
        }
        TuxTextView tuxTextViewLJFF = LJFF();
        if (tuxTextViewLJFF != null) {
            C337180DJs.LIZ(tuxTextViewLJFF);
        }
        this.LIZIZ = 0;
    }

    public final void LIZJ() {
        View viewLJII = LJII();
        if (viewLJII != null) {
            C337180DJs.LIZ(viewLJII);
        }
    }

    public final boolean LIZLLL() {
        View viewLJII = LJII();
        return viewLJII != null && viewLJII.getVisibility() == 0;
    }

    public final boolean LJ() {
        TuxTextView tuxTextViewLJFF = LJFF();
        return tuxTextViewLJFF != null && tuxTextViewLJFF.getVisibility() == 0;
    }

    @Override // X.InterfaceC1584860rLQ
    public final int getDotCount() {
        return this.LIZIZ;
    }

    public final void LIZ(int i) {
        if (i > 99) {
            i = 99;
        } else if (i <= 0) {
            TuxTextView tuxTextViewLJFF = LJFF();
            if (tuxTextViewLJFF != null) {
                C337180DJs.LIZ(tuxTextViewLJFF);
            }
            this.LIZIZ = 0;
            return;
        }
        TuxTextView tuxTextViewLJFF2 = LJFF();
        if (tuxTextViewLJFF2 != null) {
            C337180DJs.LIZJ(tuxTextViewLJFF2);
        }
        TuxTextView tuxTextViewLJFF3 = LJFF();
        if (tuxTextViewLJFF3 != null) {
            tuxTextViewLJFF3.setText(String.valueOf(i));
        }
        this.LIZIZ = i;
    }
}
