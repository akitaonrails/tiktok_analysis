package X;

import Y.ARunnableS132S0100000_32;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1967, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1967 implements InterfaceC194555119t {
    public final Effect LL;
    public final ExtraParams LLILLJJLI;
    public View LLILLL;
    public FrameLayout LLILZ;
    public ConstraintLayout LLILZIL;
    public TextView LLILZLL;
    public final AnonymousClass1963 LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public Function2<? super Integer, ? super ViewGroup, ? extends View> LLJIJIL;
    public ValueAnimator LLJILJIL;
    public final ARunnableS132S0100000_32 LLJILJILJ = new ARunnableS132S0100000_32(this, 47);
    public final ARunnableS132S0100000_32 LLJILLL = new ARunnableS132S0100000_32(this, 48);

    public static final boolean LIZIZ() {
        C2281551ESb c2281551ESb = C2281551ESb.LIZIZ;
        return c2281551ESb.LJIIJ() || c2281551ESb.LJIILIIL();
    }

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLJ;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        ExtraParams extraParams;
        Effect effect = this.LL;
        if (effect != null && !TextUtils.isEmpty(effect.getExtra()) && (extraParams = this.LLILLJJLI) != null && extraParams.isGifValid()) {
            this.LLILZ = frameLayout;
            Function2<? super Integer, ? super ViewGroup, ? extends View> function2 = this.LLJIJIL;
            if (function2 != null && function2.invoke(Integer.valueOf(R.layout.d96), frameLayout) != null) {
                this.LLILLL = this.LLJIJIL.invoke(Integer.valueOf(R.layout.d96), frameLayout);
            } else {
                this.LLILLL = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d96, frameLayout, false);
            }
            this.LLILZ.addView(this.LLILLL, 0);
            this.LLILZLL = (TextView) this.LLILLL.findViewById(R.id.w6v);
            String hint = this.LL.getHint();
            if (TextUtils.isEmpty(hint)) {
                this.LLJI = false;
                C786410Ut5.LLIL(this.LLILZLL, 8);
            } else {
                this.LLJI = true;
                C786410Ut5.LLIL(this.LLILZLL, 0);
                this.LLILZLL.setText(hint);
            }
            FrameLayout frameLayout2 = (FrameLayout) this.LLILLL.findViewById(R.id.w5o);
            this.LLILZIL = (ConstraintLayout) this.LLILLL.findViewById(R.id.i2v);
            if (2 == this.LLILLJJLI.gifType) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(this.LLILZIL);
                c19mb.LJIILIIL(R.id.w5o, (int) C11VU.LIZIZ(192.0f, frameLayout.getContext()));
                c19mb.LJJ(R.id.w5o, "3:4");
                c19mb.LIZIZ(this.LLILZIL);
            }
            int iLIZIZ = (int) C11VU.LIZIZ(264.0f, frameLayout.getContext());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILZIL.getLayoutParams();
            layoutParams.height = (ScreenUtils.getFullScreenHeight(frameLayout.getContext()) - iLIZIZ) - ((int) C11VU.LIZIZ(112.0f, frameLayout.getContext()));
            C786410Ut5.m6(this.LLILZIL, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
            layoutParams2.height = ScreenUtils.getFullScreenHeight(frameLayout.getContext()) - iLIZIZ;
            C786410Ut5.W5(this.LLILLL, layoutParams2);
            HandlerHook.viewPost(this.LLILZIL, this.LLJILJILJ);
            this.LLJ = true;
            Effect effect2 = this.LL;
            if (effect2 != null) {
                if (effect2.getHintIcon() != null && this.LL.getHintIcon().getUrlList() != null && !this.LL.getHintIcon().getUrlList().isEmpty()) {
                    if (C2281551ESb.LIZIZ.LJIIJ() && this.LLJI) {
                        HandlerHook.viewPostDelay(this.LLILZIL, this.LLJILLL, Mp4ScreenVideoLoadTimeout.CONTROL);
                        return;
                    }
                    C1322090kVb c1322090kVb = (C1322090kVb) this.LLILLL.findViewById(R.id.w6w);
                    UrlModel urlModelLIZ = C1441230nbl.LIZ(this.LL.getHintIcon());
                    AnonymousClass1968 anonymousClass1968 = new AnonymousClass1968(this, frameLayout2);
                    if (c1322090kVb == null || urlModelLIZ.getUrlList() == null || urlModelLIZ.getUrlList().size() == 0) {
                        return;
                    }
                    if (c1322090kVb.getContext() != null) {
                        C786410Ut5.N3(c1322090kVb.getContext());
                    }
                    C1325710kbR[] c1325710kbRArrLJIILLIIL = C1324750kZt.LJIILLIIL(urlModelLIZ, null, EnumC1331380kka.MEDIUM, Bitmap.Config.ARGB_8888);
                    if (c1325710kbRArrLJIILLIIL == null || c1325710kbRArrLJIILLIIL.length == 0) {
                        return;
                    }
                    C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ.LJIILJJIL = c1322090kVb.getController();
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILLIIL, true);
                    c1320810kTXLIZJ.LJIIJJI = true;
                    c1320810kTXLIZJ.LJIIIIZZ = anonymousClass1968;
                    c1322090kVb.setController(c1320810kTXLIZJ.LIZ());
                    return;
                }
                HandlerHook.viewPostDelay(this.LLILZIL, this.LLJILLL, Mp4ScreenVideoLoadTimeout.CONTROL);
            }
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        Effect effect = this.LL;
        if (effect != null && !TextUtils.isEmpty(effect.getExtra())) {
            this.LLILZLL.clearAnimation();
            HandlerHook.viewRemoveCallbacks(this.LLILZIL, this.LLJILLL);
            HandlerHook.viewRemoveCallbacks(this.LLILZIL, this.LLJILJILJ);
            C786410Ut5.LJJJZ(this.LLILLL, this.LLILZ);
            ValueAnimator valueAnimator = this.LLJILJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLJ = false;
        }
    }

    public AnonymousClass1967(Effect effect, ExtraParams extraParams, AnonymousClass1963 anonymousClass1963) {
        this.LL = effect;
        this.LLILLJJLI = extraParams;
        this.LLIZ = anonymousClass1963;
    }
}
