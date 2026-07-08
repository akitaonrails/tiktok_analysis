package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0c9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1000980c9g extends FrameLayout {
    public View LL;
    public TextView LLILLJJLI;
    public C1295960jpS LLILLL;
    public ARunnableS106S0100000_6 LLILZ;
    public ARunnableS116S0100000_16 LLILZIL;
    public AwemeRawAd LLILZLL;
    public Aweme LLIZ;
    public AwemeSearchAdModel LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;

    public abstract void LIZJ(int i, int i2);

    public abstract boolean LIZLLL();

    public abstract int getLayoutId$commercialize_search_impl_release();

    public abstract void setTransformButtonVisibility$commercialize_search_impl_release(int i);

    private final float getColorChangeMillSeconds() {
        AwemeSearchAdModel awemeSearchAdModel = this.LLIZLLLIL;
        return (awemeSearchAdModel != null ? awemeSearchAdModel.buttonColorShowSeconds : 0.0f) * 1000.0f;
    }

    private final float getShowMillSeconds() {
        AwemeSearchAdModel awemeSearchAdModel = this.LLIZLLLIL;
        return (awemeSearchAdModel != null ? awemeSearchAdModel.showButtonSeconds : 0.0f) * 1000.0f;
    }

    private final String getTransformButtonText() {
        String buttonText;
        AwemeSearchAdModel awemeSearchAdModel = this.LLIZLLLIL;
        if (awemeSearchAdModel == null || (buttonText = awemeSearchAdModel.getSearchAdTransformButtonText()) == null) {
            AwemeRawAd awemeRawAd = this.LLILZLL;
            if (awemeRawAd == null) {
                return "";
            }
            buttonText = awemeRawAd.getButtonText();
        }
        return (buttonText == null || buttonText.length() <= 0) ? "" : buttonText;
    }

    public final void LIZIZ() {
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = this.LLILZIL;
        if (aRunnableS116S0100000_16 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS116S0100000_16);
        }
        if (this.LLJI) {
            return;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new ARunnableS116S0100000_16(this, 177);
        }
        HandlerHook.viewPostDelay(this, this.LLILZIL, 0L);
    }

    public final int getBackGroundColor() {
        int i = this.LLJIJIL;
        Drawable background = getBackground();
        return background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : i;
    }

    public final int getBgColor() {
        String searchAdTransformButtonColor;
        AwemeSearchAdModel awemeSearchAdModel = this.LLIZLLLIL;
        return (awemeSearchAdModel == null || (searchAdTransformButtonColor = awemeSearchAdModel.getSearchAdTransformButtonColor()) == null || searchAdTransformButtonColor.length() <= 0) ? C475630Ikz.LIZIZ(R.attr.a04, getContext()) : ColorProtector.parseColor(searchAdTransformButtonColor);
    }

    public int getBtnBottomMargin() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin;
    }

    public final int getDefaultBackgroundColor() {
        return this.LLJIJIL;
    }

    public final AwemeSearchAdModel getMAmemeSearchAdInfo$commercialize_search_impl_release() {
        return this.LLIZLLLIL;
    }

    public final AwemeRawAd getMAwemeRawAd$commercialize_search_impl_release() {
        return this.LLILZLL;
    }

    public final void LJ(int i) {
        Aweme aweme;
        if (this.LLILLL != null && (aweme = this.LLIZ) != null && C1009740cNo.LJII(aweme)) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            setLivePlayingViewVisibility(0);
            if (i == 2) {
                this.LLJI = true;
                LIZJ(this.LLJIJIL, 0);
            }
        }
    }

    public final void setDefaultBackgroundColor(int i) {
        this.LLJIJIL = i;
    }

    public void setLivePlayingViewVisibility(int i) {
        C1295960jpS c1295960jpS = this.LLILLL;
        if (c1295960jpS != null) {
            if (i == 0) {
                if (!c1295960jpS.isAnimating()) {
                    c1295960jpS.playAnimation();
                }
            } else if (c1295960jpS.isAnimating()) {
                c1295960jpS.cancelAnimation();
            }
            C786410Ut5.LLD(i, c1295960jpS);
        }
    }

    public final void setMAmemeSearchAdInfo$commercialize_search_impl_release(AwemeSearchAdModel awemeSearchAdModel) {
        this.LLIZLLLIL = awemeSearchAdModel;
    }

    public final void setMAwemeRawAd$commercialize_search_impl_release(AwemeRawAd awemeRawAd) {
        this.LLILZLL = awemeRawAd;
    }

    public AbstractC1000980c9g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void LIZ(Aweme aweme, View.OnClickListener onClickListener) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        TextView textView;
        this.LLIZ = aweme;
        C1295960jpS c1295960jpS = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LLILZLL = awemeRawAd;
        if (awemeRawAd != null) {
            searchAdInfo = awemeRawAd.getSearchAdInfo();
        } else {
            searchAdInfo = null;
        }
        this.LLIZLLLIL = searchAdInfo;
        if (!LIZLLL()) {
            setTransformButtonVisibility$commercialize_search_impl_release(8);
            return;
        }
        if (this.LLILZLL != null) {
            if (!this.LLJ) {
                View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), getLayoutId$commercialize_search_impl_release(), this);
                this.LL = viewLJLLJ;
                if (viewLJLLJ != null) {
                    textView = (TextView) viewLJLLJ.findViewById(R.id.u6l);
                } else {
                    textView = null;
                }
                this.LLILLJJLI = textView;
                View view = this.LL;
                if (view != null) {
                    c1295960jpS = (C1295960jpS) view.findViewById(R.id.u5z);
                }
                this.LLILLL = c1295960jpS;
                this.LLJ = true;
            }
            setTransformButtonVisibility$commercialize_search_impl_release(0);
            TextView textView2 = this.LLILLJJLI;
            if (textView2 != null) {
                textView2.setText(getTransformButtonText());
            }
            LIZJ(this.LLJIJIL, 0);
        } else {
            setTransformButtonVisibility$commercialize_search_impl_release(8);
        }
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        a aVar = new a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public AbstractC1000980c9g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
