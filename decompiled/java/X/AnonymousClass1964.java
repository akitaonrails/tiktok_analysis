package X;

import Y.ALAdapterS26S0100000_32;
import Y.ALAdapterS26S0200000_32;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS132S0100000_32;
import Y.AUListenerS227S0200000_20;
import android.animation.ValueAnimator;
import android.text.InputFilter;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.1964, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1964 implements InterfaceC194555119t, InterfaceC379610EuV {
    public final Effect LL;
    public final ExtraParams LLILLJJLI;
    public final AnonymousClass1963 LLILLL;
    public final C1DRG LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public FrameLayout LLIZ;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public C1292030jj7<C1294720jnS> LLJI;
    public C1295960jpS LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public boolean LLJILJILJ;
    public ValueAnimator LLJJ;
    public long LLJILLL = 3000;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 593));
    public final ARunnableS132S0100000_32 LLJJIII = new ARunnableS132S0100000_32(this, 66);
    public final C21524819Lq LLJJIJI = new C21524819Lq(this, 3);
    public final C21524819Lq LLJJIJIIJIL = new C21524819Lq(this, 2);

    public final View LIZIZ() {
        return (View) this.LLJJI.getValue();
    }

    public final void LIZLLL() {
        TuxTextView tuxTextView;
        C1295960jpS c1295960jpS = this.LLJIJIL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(4, c1295960jpS);
        }
        if (this.LL.getHint().length() <= 0) {
            this.LLJILJILJ = false;
            return;
        }
        TuxTextView tuxTextView2 = this.LLJ;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        }
        ConstraintLayout constraintLayout = this.LLJILJIL;
        if (constraintLayout == null || (tuxTextView = this.LLJ) == null) {
            return;
        }
        View viewLIZIZ = LIZIZ();
        if (viewLIZIZ != null) {
            C786410Ut5.LJLLLLLL(0, viewLIZIZ);
        }
        View viewLIZIZ2 = LIZIZ();
        if (viewLIZIZ2 != null) {
            C786410Ut5.T4(viewLIZIZ2, 0.3f);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJJIIJZLJL(tuxTextView.getId(), 3, 0);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 3, constraintLayout.getId(), 3);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 4, constraintLayout.getId(), 4);
        c19mb.LIZIZ(constraintLayout);
        HandlerHook.viewPost(tuxTextView, new ARunnableS101S0200000_32(tuxTextView, this, 39));
        this.LLJILJILJ = true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        ExtraParams extraParams;
        C1295960jpS c1295960jpS;
        ConstraintLayout constraintLayout;
        List<String> urlList;
        String str;
        if (frameLayout != null && (extraParams = this.LLILLJJLI) != null && true == extraParams.isLottieValid()) {
            this.LLIZ = frameLayout;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d9q, frameLayout, false);
            this.LLIZLLLIL = viewTd;
            FrameLayout frameLayout2 = this.LLIZ;
            if (frameLayout2 != null) {
                frameLayout2.addView(viewTd);
            }
            View view = this.LLIZLLLIL;
            TuxTextView tuxTextView = null;
            if (view != null) {
                c1295960jpS = (C1295960jpS) view.findViewById(R.id.w5x);
            } else {
                c1295960jpS = null;
            }
            this.LLJIJIL = c1295960jpS;
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                constraintLayout = (ConstraintLayout) view2.findViewById(R.id.eux);
            } else {
                constraintLayout = null;
            }
            this.LLJILJIL = constraintLayout;
            C1295960jpS c1295960jpS2 = this.LLJIJIL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.addAnimatorListener(new ALAdapterS26S0100000_32(this, 13));
            }
            C1295960jpS c1295960jpS3 = this.LLJIJIL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setRepeatCount(1);
            }
            View view3 = this.LLIZLLLIL;
            if (view3 != null) {
                tuxTextView = (TuxTextView) view3.findViewById(R.id.w6v);
            }
            this.LLJ = tuxTextView;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 4);
                if (this.LL.getHint().length() > 0) {
                    tuxTextView.setText(this.LL.getHint());
                    tuxTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
                    tuxTextView.setTuxFont(12);
                } else {
                    tuxTextView.setText("");
                }
            }
            if ((C297890Blz.LIZ != 1 || this.LL.getHint().length() <= 0) && (urlList = C1441230nbl.LIZ(this.LL.getHintFile()).getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(frameLayout.getContext(), str);
                c1292030jj7LJIIJJI.LIZIZ(this.LLJJIJI);
                c1292030jj7LJIIJJI.LIZ(this.LLJJIJIIJIL);
                this.LLJI = c1292030jj7LJIIJJI;
            } else {
                LIZLLL();
            }
            this.LLJILJILJ = true;
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        FrameLayout frameLayout;
        this.LLJILJILJ = false;
        C1292030jj7<C1294720jnS> c1292030jj7 = this.LLJI;
        if (c1292030jj7 != null) {
            c1292030jj7.LJII(this.LLJJIJI);
            c1292030jj7.LJI(this.LLJJIJIIJIL);
        }
        View viewLIZIZ = LIZIZ();
        if (viewLIZIZ != null) {
            C786410Ut5.LJLLLLLL(4, viewLIZIZ);
        }
        C1295960jpS c1295960jpS = this.LLJIJIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        FrameLayout frameLayout2 = this.LLIZ;
        if (frameLayout2 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout2, this.LLJJIII);
        }
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LLIZLLLIL;
        if (view != null && (frameLayout = this.LLIZ) != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
    }

    public final boolean LIZJ(int i, C1295960jpS c1295960jpS) {
        boolean z;
        if (c1295960jpS == null) {
            return false;
        }
        int i2 = C297890Blz.LIZ;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 != 2) {
            return false;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) c1295960jpS.getMinFrame(), (int) c1295960jpS.getMaxFrame());
        valueAnimatorOfInt.setDuration(c1295960jpS.getDuration());
        valueAnimatorOfInt.setRepeatCount(i);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        C013C c013c = new C013C();
        c013c.element = true;
        valueAnimatorOfInt.addUpdateListener(new AUListenerS227S0200000_20(c013c, c1295960jpS, 1));
        valueAnimatorOfInt.addListener(new ALAdapterS26S0200000_32(this, c1295960jpS, 3));
        this.LLJJ = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
        return true;
    }

    public AnonymousClass1964(Effect effect, ExtraParams extraParams, C214879197l c214879197l, C1DRG c1drg, View view, View view2) {
        this.LL = effect;
        this.LLILLJJLI = extraParams;
        this.LLILLL = c214879197l;
        this.LLILZ = c1drg;
        this.LLILZIL = view;
        this.LLILZLL = view2;
    }
}
