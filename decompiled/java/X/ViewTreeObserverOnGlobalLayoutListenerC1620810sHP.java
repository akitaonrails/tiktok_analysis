package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.series.profile.view.SeriesProfileTabRowCell;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0sHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1620810sHP implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1620810sHP viewTreeObserverOnGlobalLayoutListenerC1620810sHP) {
        ((SeriesProfileTabRowCell) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).R5();
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1620810sHP viewTreeObserverOnGlobalLayoutListenerC1620810sHP) {
        C786410Ut5.C3(((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLILZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1620810sHP);
        if (((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLILZ.getLineCount() > 3) {
            ViewGroup.LayoutParams layoutParams = ((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLILLL.getLayoutParams();
            layoutParams.height = (int) C12ES.LIZJ(84.0f, ((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LL);
            C786410Ut5.d6(((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLILLL, layoutParams);
            ((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLILZ.getLayoutParams().height = (int) C12ES.LIZJ(68.0f, ((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LL);
            C21382118m3.LIZIZ(((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLILZ, 2, 13, 1, 2);
            ((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).getContentView().measure(0, 0);
            C1619250sEt c1619250sEt = (C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0;
            c1619250sEt.getClass();
            c1619250sEt.LJJIIJZLJL();
            ((C1619250sEt) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LJJIIZ();
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1620810sHP viewTreeObserverOnGlobalLayoutListenerC1620810sHP) {
        RecyclerView.ViewHolder childViewHolder;
        C786410Ut5.C3(((C1598650rhf) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLJJJJJIL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1620810sHP);
        C1598650rhf c1598650rhf = (C1598650rhf) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0;
        c1598650rhf.getClass();
        AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(c1598650rhf, 620);
        RecyclerView.LayoutManager layoutManager = c1598650rhf.LLJJJJJIL.getLayoutManager();
        if (layoutManager != null) {
            int childCount = layoutManager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = layoutManager.getChildAt(i);
                if (childAt != null && (childViewHolder = c1598650rhf.LLJJJJJIL.getChildViewHolder(childAt)) != null) {
                    awS603S0100000_24.invoke(childViewHolder);
                }
            }
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1620810sHP viewTreeObserverOnGlobalLayoutListenerC1620810sHP) {
        ProfileNaviActivity profileNaviActivity = (ProfileNaviActivity) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0;
        float fMax = (float) (((double) Math.max(profileNaviActivity.LLLLZIL().getWidth(), profileNaviActivity.LLLLZIL().getHeight())) * 1.1d);
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(profileNaviActivity.LLLLZIL(), profileNaviActivity.LLLLZIL().getWidth() / 2, (profileNaviActivity.LLLLZIL().getHeight() / 3) * 2, 0.0f, fMax);
        animatorCreateCircularReveal.setDuration(400L);
        animatorCreateCircularReveal.setInterpolator(new AccelerateInterpolator());
        C786410Ut5.LJZ(0, profileNaviActivity.LLLLZIL());
        animatorCreateCircularReveal.start();
        C786410Ut5.C3(((ProfileNaviActivity) viewTreeObserverOnGlobalLayoutListenerC1620810sHP.l0).LLLLZIL().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1620810sHP);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1620810sHP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
