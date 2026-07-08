package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0v7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729930v7P extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public View LLILZ;
    public ImageView LLILZIL;
    public FrameLayout LLILZLL;
    public C1295960jpS LLIZ;
    public C197039127h LLIZLLLIL;
    public TemplateListViewModel LLJ;

    public final C197039127h getBtnDisplayFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cm2);
            this.LLIZLLLIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final View getCoverGradientFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f55);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getFlLottieContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i1y);
            this.LLILZLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final SmartImageView getIvPreviewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l71);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ImageView getIvUsingBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l7q);
            this.LLILZIL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C1295960jpS getLottieUsingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nr7);
            this.LLIZ = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final TuxTextView getTvKeyMessageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4g);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvSummaryFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z77);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C21681819tI c21681819tI;
        View view;
        super.onAttachedToWindow();
        Object parent = getParent();
        ViewGroup.LayoutParams layoutParams = null;
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            layoutParams = view.getLayoutParams();
        }
        if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) {
            return;
        }
        c21681819tI.LLILLJJLI = true;
    }

    public final TemplateListViewModel getViewModel() {
        return this.LLJ;
    }

    public C1729930v7P(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.btx, C786410Ut5.ne(context), this);
    }

    public final void setBtnDisplayFromXml(C197039127h c197039127h) {
        this.LLIZLLLIL = c197039127h;
    }

    public final void setCoverGradientFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setFlLottieContainerFromXml(FrameLayout frameLayout) {
        this.LLILZLL = frameLayout;
    }

    public final void setIvPreviewFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setIvUsingBgFromXml(ImageView imageView) {
        this.LLILZIL = imageView;
    }

    public final void setLottieUsingFromXml(C1295960jpS c1295960jpS) {
        this.LLIZ = c1295960jpS;
    }

    public final void setTvKeyMessageFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTvSummaryFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setViewModel(TemplateListViewModel templateListViewModel) {
        this.LLJ = templateListViewModel;
    }
}
