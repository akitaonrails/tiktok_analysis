package X;

import Y.ALAdapterS16S0100000_20;
import Y.ALAdapterS1S0000000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.api.anchor_data.FinishEncourageLiveJourney;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: renamed from: X.0ku7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337290ku7 extends AbstractC1337430kuL implements InterfaceC1838190xw1 {
    public FinishEncourageLiveJourney LJIJ;
    public C16F5 LJIJI;
    public C16F5 LJIJJ;
    public TuxTextView LJIJJLI;
    public C1295960jpS LJIL;
    public ConstraintLayout LJJ;
    public LinearLayout LJJI;
    public ConstraintLayout LJJIFFI;
    public final ArrayList<C1838180xw0> LJJII = new ArrayList<>();
    public int LJJIII;
    public AnimatorSet LJJIIJ;

    @Override // X.InterfaceC1838190xw1
    public final void LIZ() {
        ConstraintLayout constraintLayout = this.LJJIFFI;
        if (constraintLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_X, 1.0f, 1.2f);
            objectAnimatorOfFloat.setDuration(230L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_Y, 1.0f, 1.2f);
            objectAnimatorOfFloat2.setDuration(230L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_X, 1.2f, 0.9f);
            objectAnimatorOfFloat3.setDuration(170L);
            objectAnimatorOfFloat3.setStartDelay(610L);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_Y, 1.2f, 0.9f);
            objectAnimatorOfFloat4.setDuration(170L);
            objectAnimatorOfFloat4.setStartDelay(610L);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_X, 0.9f, 1.0f);
            objectAnimatorOfFloat5.setDuration(250L);
            objectAnimatorOfFloat5.setStartDelay(780L);
            objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_Y, 0.9f, 1.0f);
            objectAnimatorOfFloat6.setDuration(250L);
            objectAnimatorOfFloat6.setStartDelay(780L);
            objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJIILIIL());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            animatorSet.addListener(new ALAdapterS1S0000000_16(5));
            this.LJJIIJ = animatorSet;
            animatorSet.start();
        }
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final long LJFF() {
        FinishEncourageLiveJourney finishEncourageLiveJourney = this.LJIJ;
        return (finishEncourageLiveJourney == null || !finishEncourageLiveJourney.isLevelUp) ? 2250L : 2750L;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LJI() {
        try {
            C1295960jpS c1295960jpS = this.LJIL;
            if (c1295960jpS != null) {
                c1295960jpS.pauseAnimation();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            AnimatorSet animatorSet = this.LJJIIJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LJJIIJ = null;
        try {
            Iterator<C1838180xw0> it2 = this.LJJII.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        super.LJI();
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILIIL() {
        C1295960jpS c1295960jpS = this.LJIL;
        if (c1295960jpS != null) {
            C1296260jpw.LIZ(c1295960jpS);
        }
        C16F5 c16f5 = this.LJIJI;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        TuxTextView tuxTextView = this.LJIJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILJJIL() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        AnimatorSet animatorSetLJIIJ = AbstractC1337430kuL.LJIIJ(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorSetLJIIJ);
        animatorSet.addListener(new ALAdapterS16S0100000_20(this, 14));
        this.LIZIZ = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482815Cw
    public final AbstractC1337320kuA getContainerType() {
        return C1337380kuG.LIZJ;
    }

    @Override // X.InterfaceC1838190xw1
    public final void LIZLLL(int i) {
        this.LJJIII++;
        int size = this.LJJII.size();
        int i2 = this.LJJIII;
        if (i2 >= 0 && i2 < size) {
            ((C1838180xw0) ListProtector.get(this.LJJII, i2)).i0(this.LJJIII);
        }
        if (i == C1697810uHb.LJIIJ(this.LJJII)) {
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC20482815Cw
    public final View LJIIIIZZ(Context context, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ghr, viewGroup, false);
        this.LJIJI = (C16F5) viewTd.findViewById(R.id.zv8);
        this.LJIJJLI = (TuxTextView) viewTd.findViewById(R.id.zv_);
        this.LJIL = (C1295960jpS) viewTd.findViewById(R.id.nrz);
        this.LJJ = (ConstraintLayout) viewTd.findViewById(R.id.trs);
        this.LJJI = (LinearLayout) viewTd.findViewById(R.id.ney);
        this.LJJIFFI = (ConstraintLayout) viewTd.findViewById(R.id.tok);
        viewTd.findViewById(R.id.lnb);
        this.LJIJJ = (C16F5) viewTd.findViewById(R.id.zv9);
        this.LIZ = viewTd;
        C786410Ut5.T4(viewTd, 0.0f);
        return viewTd;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LIZIZ(int i, int i2, Object obj) {
        FinishEncourageLiveJourney finishEncourageLiveJourney;
        boolean z;
        List<FinishEncourageTask> list;
        Context context;
        int iLIZIZ;
        Integer numValueOf;
        String str;
        super.LIZIZ(i, i2, obj);
        if (obj instanceof FinishEncourageLiveJourney) {
            finishEncourageLiveJourney = (FinishEncourageLiveJourney) obj;
        } else {
            finishEncourageLiveJourney = null;
        }
        this.LJIJ = finishEncourageLiveJourney;
        if (finishEncourageLiveJourney != null && finishEncourageLiveJourney.isLevelUp) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            C1295960jpS c1295960jpS = this.LJIL;
            if (c1295960jpS != null) {
                C1143680frq.LJIILL(c1295960jpS, "tiktok_live_broadcast_demand_12", "ttlive_finish_encourage_journey_weak.zip", false, new C1339340kxQ(c1295960jpS, this, 3));
            }
            C16F5 c16f5 = this.LJIJI;
            FinishEncourageLiveJourney finishEncourageLiveJourney2 = this.LJIJ;
            if (finishEncourageLiveJourney2 != null && (str = finishEncourageLiveJourney2.finishTitle) != null) {
                str2 = str;
            }
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
                c16f5.setTextSize(1, this.LJI);
            }
            Typeface typefaceLJIIJJI = LJIIJJI();
            if (c16f5 != null) {
                c16f5.setTypeface(typefaceLJIIJJI);
                c16f5.setText(str2);
                ViewTreeObserver viewTreeObserver = c16f5.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnPreDrawListenerC462840IDa viewTreeObserverOnPreDrawListenerC462840IDa = new ViewTreeObserverOnPreDrawListenerC462840IDa(this, c16f5, 2);
                    viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462840IDa);
                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462840IDa, ViewTreeObserver.OnPreDrawListener.class);
                }
            }
            C500260Jjc.LJIILIIL(this.LJJ);
            C1295960jpS c1295960jpS2 = this.LJIL;
            if (c1295960jpS2 != null) {
                C500260Jjc.LLFFF(c1295960jpS2);
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LJIJI;
        if (c16f52 != null) {
            C500260Jjc.LJIILIIL(c16f52);
        }
        C1295960jpS c1295960jpS3 = this.LJIL;
        if (c1295960jpS3 != null) {
            C500260Jjc.LJIILIIL(c1295960jpS3);
        }
        C16F5 c16f53 = this.LJIJJ;
        if (c16f53 != null) {
            c16f53.setTextSize(1, 30.0f);
        }
        Typeface typefaceLJIIJJI2 = LJIIJJI();
        C16F5 c16f54 = this.LJIJJ;
        if (c16f54 != null) {
            c16f54.setTypeface(typefaceLJIIJJI2);
        }
        C16F5 c16f55 = this.LJIJJ;
        if (c16f55 != null) {
            FinishEncourageLiveJourney finishEncourageLiveJourney3 = this.LJIJ;
            if (finishEncourageLiveJourney3 != null) {
                numValueOf = Integer.valueOf(finishEncourageLiveJourney3.level);
            } else {
                numValueOf = null;
            }
            c16f55.setText(String.valueOf(numValueOf));
        }
        TuxTextView tuxTextView = this.LJIJJLI;
        FinishEncourageLiveJourney finishEncourageLiveJourney4 = this.LJIJ;
        if (finishEncourageLiveJourney4 != null && (str2 = finishEncourageLiveJourney4.progressTitle) == null) {
            str2 = finishEncourageLiveJourney4.finishTitle;
        }
        C500260Jjc.LLFFF(tuxTextView);
        if (tuxTextView != null) {
            tuxTextView.setText(str2);
        }
        C500260Jjc.LLFFF(this.LJJ);
        FinishEncourageLiveJourney finishEncourageLiveJourney5 = this.LJIJ;
        if (finishEncourageLiveJourney5 != null) {
            list = finishEncourageLiveJourney5.taskList;
        } else {
            list = null;
        }
        LinearLayout linearLayout = this.LJJI;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        this.LJJII.clear();
        if (list == null) {
            return;
        }
        int i3 = 0;
        for (FinishEncourageTask finishEncourageTask : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                FinishEncourageTask finishEncourageTask2 = finishEncourageTask;
                View view = this.LIZ;
                if (view != null && (context = view.getContext()) != null) {
                    C1838180xw0 c1838180xw0 = new C1838180xw0(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (i3 != 0) {
                        iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                    } else {
                        iLIZIZ = 0;
                    }
                    layoutParams.topMargin = iLIZIZ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1838180xw0);
                    c1838180xw0.setLayoutParams(layoutParams);
                    C1838180xw0.j0(c1838180xw0, finishEncourageTask2, this);
                    LinearLayout linearLayout2 = this.LJJI;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(c1838180xw0);
                    }
                    this.LJJII.add(c1838180xw0);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
