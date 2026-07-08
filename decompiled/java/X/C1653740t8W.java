package X;

import Y.ARunnableS119S0100000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0t8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653740t8W implements InterfaceC194555119t {
    public View LL;
    public FrameLayout LLILLJJLI;
    public View LLILLL;
    public ValueAnimator LLILZ;
    public boolean LLILZIL;
    public C1653750t8X LLILZLL;
    public final Boolean LLIZ;

    public C1653740t8W() {
        this.LLIZ = Boolean.FALSE;
    }

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLILZIL;
    }

    public C1653740t8W(C1653750t8X c1653750t8X) {
        this.LLIZ = Boolean.FALSE;
        this.LLILZLL = c1653750t8X;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        int i;
        boolean z;
        float f;
        this.LLILLJJLI = frameLayout;
        if (this.LLILZLL == null) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "effect_lint_font_fix", true, true)) {
            i = R.layout.d99;
        } else {
            i = R.layout.d98;
        }
        int i2 = 0;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), i, frameLayout, false);
        this.LL = viewTd;
        this.LLILLJJLI.addView(viewTd, 0);
        this.LLILLL = this.LL.findViewById(R.id.i2v);
        TextView textView = (TextView) this.LL.findViewById(R.id.w6v);
        if (C291020Bau.LIZ()) {
            if (this.LLILZLL.LIZ != null && !this.LLIZ.booleanValue()) {
                textView.setText(this.LLILZLL.LIZ);
            }
        } else {
            String str = this.LLILZLL.LIZ;
            if (str != null) {
                textView.setText(str);
            }
        }
        C1322110kVd c1322110kVd = (C1322110kVd) this.LL.findViewById(R.id.w6w);
        UrlModel urlModel = this.LLILZLL.LIZIZ;
        if (urlModel != null && !C580130Mp9.LIZ(urlModel.getUrlList())) {
            z = true;
        } else {
            z = false;
            i2 = 8;
        }
        C1741940vQm.LIZLLL(i2, c1322110kVd);
        if (z) {
            C1324780kZw.LIZ(c1322110kVd, C1324750kZt.LJIILLIIL(C1441230nbl.LIZ(this.LLILZLL.LIZIZ), null, EnumC1331380kka.MEDIUM, Bitmap.Config.ARGB_8888), null, true, null);
        }
        C786410Ut5.T4(this.LLILLL, 0.3f);
        if (!C2281551ESb.LIZIZ.LJI()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 5500);
            this.LLILZ = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(5500L);
            this.LLILZ.setInterpolator(new LinearInterpolator());
            this.LLILZ.addUpdateListener(new AUListenerS268S0100000_19(this, 0));
            this.LLILZ.start();
        } else {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "effect_lint_font_fix", true, true)) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.T4(this.LLILLL, f);
            HandlerHook.viewPostDelay(this.LLILLL, new ARunnableS119S0100000_19(this, 2), 5500L);
        }
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        if (this.LLILZLL != null && this.LLILLL != null && this.LLILLJJLI != null) {
            ValueAnimator valueAnimator = this.LLILZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C786410Ut5.LJJJZ(this.LL, this.LLILLJJLI);
            this.LLILZIL = false;
        }
    }

    public C1653740t8W(C1653750t8X c1653750t8X, Boolean bool) {
        this.LLIZ = Boolean.FALSE;
        this.LLILZLL = c1653750t8X;
        this.LLIZ = bool;
    }
}
