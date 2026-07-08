package X;

import Y.ACListenerS159S0100000_25;
import Y.ALAdapterS20S0100000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638190sjR implements InterfaceC1635920sfm {
    public static final /* synthetic */ int LJIIJ = 0;
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final int LIZLLL;
    public View LJ;
    public final InterpolatorC1088790eRJ LJFF;
    public final InterpolatorC1088790eRJ LJI;
    public final InterpolatorC1088790eRJ LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public final float LJ() {
        return this.LIZIZ.getHeight() > 0 ? this.LIZIZ.getHeight() : this.LIZ.getResources().getDimension(R.dimen.ahk);
    }

    public final AnimatorSet LJFF() {
        C786410Ut5.LJLLLLLL(0, this.LIZIZ);
        C786410Ut5.T4(this.LIZIZ, 0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(210L);
        objectAnimatorOfFloat.setInterpolator(this.LJI);
        objectAnimatorOfFloat.setStartDelay(90L);
        View view = this.LJ;
        if (view == null) {
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(90L);
        objectAnimatorOfFloat2.setInterpolator(this.LJFF);
        objectAnimatorOfFloat2.addListener(new ALAdapterS20S0100000_25(this, 12));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LIZJ.getHeight(), (int) LJ());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(this.LJII);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS273S0100000_25(this, 12));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    @Override // X.InterfaceC1635920sfm
    public final boolean LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1635920sfm
    public final void LIZIZ(boolean z) {
        if (!this.LJIIIIZZ && !this.LJIIIZ) {
            return;
        }
        int i = this.LIZLLL;
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                if (z) {
                    LJFF().start();
                } else {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LIZJ.getHeight(), (int) LJ());
                    valueAnimatorOfInt.setDuration(300L);
                    valueAnimatorOfInt.setInterpolator(this.LJII);
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS273S0100000_25(this, 14));
                    valueAnimatorOfInt.start();
                }
                this.LJIIIZ = false;
            }
        } else {
            if (z) {
                LJFF().start();
            } else {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(210L);
                objectAnimatorOfFloat.setInterpolator(this.LJI);
                objectAnimatorOfFloat.setStartDelay(90L);
                objectAnimatorOfFloat.addListener(new ALAdapterS20S0100000_25(this, 14));
                View view = this.LJ;
                if (view == null) {
                    view = null;
                }
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat2.setDuration(90L);
                objectAnimatorOfFloat2.setInterpolator(this.LJFF);
                objectAnimatorOfFloat2.addListener(new ALAdapterS20S0100000_25(this, 13));
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.LIZJ.getHeight(), (int) LJ());
                valueAnimatorOfInt2.setDuration(300L);
                valueAnimatorOfInt2.setInterpolator(this.LJII);
                valueAnimatorOfInt2.addUpdateListener(new AUListenerS273S0100000_25(this, 13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfInt2, objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.start();
            }
            this.LJIIIZ = false;
        }
        this.LJIIIZ = false;
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC1635920sfm
    public final void LIZJ(int i) {
        this.LJIIIIZZ = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(90L);
        objectAnimatorOfFloat.setInterpolator(this.LJFF);
        objectAnimatorOfFloat.addListener(new ALAdapterS20S0100000_25(this, 16));
        View view = this.LJ;
        if (view == null) {
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(210L);
        objectAnimatorOfFloat2.setStartDelay(90L);
        objectAnimatorOfFloat2.setInterpolator(this.LJI);
        objectAnimatorOfFloat2.addListener(new ALAdapterS20S0100000_25(this, 15));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LIZJ.getHeight(), i);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(this.LJII);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS273S0100000_25(this, 15));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        this.LJIIIZ = true;
    }

    public C1638190sjR(int i, View view, View view2, View view3) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LIZLLL = i;
        view.getResources().getDimension(R.dimen.aen);
        this.LJFF = new InterpolatorC1088790eRJ(0.3f, 0.0f, 0.9f, 0.6f);
        this.LJI = new InterpolatorC1088790eRJ(0.0f, 0.4f, 0.2f, 1.0f);
        this.LJII = new InterpolatorC1088790eRJ(0.4f, 0.0f, 0.2f, 1.0f);
        View viewFindViewById = view.findViewById(R.id.mfv);
        ((TextView) view.findViewById(R.id.wa0)).setText("Search");
        viewFindViewById.getLayoutParams();
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final SearchStickerViewContainer LIZLLL(C19EG c19eg, ViewGroup viewGroup, C1630880sXe c1630880sXe, InterfaceC1636820shE interfaceC1636820shE, C1635820sfc c1635820sfc, LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwnerLIZ = lifecycleOwner;
        if (!C294080Bfq.LIZ() && (lifecycleOwnerLIZ = C0EBE.LIZ(viewGroup)) == null) {
            lifecycleOwnerLIZ = c19eg;
        }
        SearchStickerViewContainer searchStickerViewContainer = new SearchStickerViewContainer(c19eg, viewGroup, c1630880sXe, interfaceC1636820shE, 2, this.LIZLLL, c1635820sfc, null, lifecycleOwnerLIZ);
        C786410Ut5.I7(new ACListenerS159S0100000_25(searchStickerViewContainer, 37), this.LIZ);
        return searchStickerViewContainer;
    }
}
