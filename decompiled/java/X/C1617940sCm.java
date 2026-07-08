package X;

import Y.ALAdapterS9S0200000_12;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0sCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617940sCm {
    public final Context LIZ;
    public int LIZIZ;
    public C1769270w8r LIZJ;
    public boolean LIZLLL;

    public final void LIZLLL() {
        if (this.LIZIZ > 0) {
            return;
        }
        View viewLJFF = LJFF();
        if (viewLJFF != null) {
            C786410Ut5.LJLLLLLL(0, viewLJFF);
        }
        TuxTextView tuxTextViewLIZJ = LIZJ();
        if (tuxTextViewLIZJ != null) {
            C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 8);
        }
        TuxTextView tuxTextViewLJI = LJI();
        if (tuxTextViewLJI != null) {
            C786410Ut5.LLLLZLL(tuxTextViewLJI, 8);
        }
    }

    public final View LJ() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ != null) {
            HomeTabViewModel homeTabViewModelLIZ = HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ);
            View view = homeTabViewModelLIZ.LLILLL.get(homeTabViewModelLIZ.LLILLJJLI.get("Shop"));
            if (view instanceof View) {
                return view;
            }
        }
        return null;
    }

    public final void LIZ() {
        View viewLJFF = LJFF();
        if (viewLJFF != null) {
            C786410Ut5.LJLLLLLL(8, viewLJFF);
        }
        TuxTextView tuxTextViewLIZJ = LIZJ();
        if (tuxTextViewLIZJ != null) {
            C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 8);
        }
        this.LIZIZ = 0;
        LIZIZ(false);
    }

    public final TuxTextView LIZJ() {
        View viewLJ = LJ();
        if (viewLJ != null) {
            return (TuxTextView) viewLJ.findViewById(R.id.tv_tab_dot_count);
        }
        return null;
    }

    public final View LJFF() {
        View viewLJ = LJ();
        if (viewLJ != null) {
            return viewLJ.findViewById(R.id.tv_tab_dot);
        }
        return null;
    }

    public final TuxTextView LJI() {
        View viewLJ = LJ();
        if (viewLJ != null) {
            return (TuxTextView) viewLJ.findViewById(R.id.tv_tab_dot_text);
        }
        return null;
    }

    public C1617940sCm(Context context) {
        this.LIZ = context;
        C1581510rG1.LJFF(LJFF());
        C1581510rG1.LJFF(LIZJ());
        C1581510rG1.LJFF(LJI());
    }

    public final void LIZIZ(boolean z) {
        TuxTextView tuxTextViewLJI;
        if (this.LIZLLL && (tuxTextViewLJI = LJI()) != null) {
            if (z) {
                tuxTextViewLJI.clearAnimation();
                AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(tuxTextViewLJI, this, 78);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(tuxTextViewLJI, 115));
                valueAnimatorOfFloat.addListener(new ALAdapterS9S0200000_12(awS425S0200000_24, tuxTextViewLJI, 3));
                valueAnimatorOfFloat.start();
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextViewLJI, 8);
            this.LIZLLL = false;
            C1583900rJs.LIZ.getClass();
            C1303740k20 c1303740k20 = C1583900rJs.LJFF;
            if (c1303740k20 != null) {
                AnonymousClass0956 anonymousClass0956 = c1303740k20.LIZJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1303740k20.LJ = false;
            }
            C1583900rJs.LJFF = null;
        }
    }
}
