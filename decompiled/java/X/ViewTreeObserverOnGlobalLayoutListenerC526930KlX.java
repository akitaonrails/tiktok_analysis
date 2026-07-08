package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC526930KlX extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public ImageView LL;
    public C0M4X LLILLJJLI;
    public RoundedFrameLayout LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public final ViewGroup.MarginLayoutParams LLILZLL;
    public final ViewGroup.MarginLayoutParams LLIZ;
    public RecyclerView LLIZLLLIL;
    public C531250KsV LLJ;
    public float LLJI;
    public TikTokMediaModel LLJIJIL;
    public int LLJILJIL;

    public final RoundedFrameLayout getItemFrameViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l0x);
            this.LLILLL = (RoundedFrameLayout) callbackFindViewById;
        }
        return (RoundedFrameLayout) callbackFindViewById;
    }

    public final ImageView getIvProgressLineFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l74);
            this.LL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C531250KsV getPreviewVideoClipAdapter() {
        C531250KsV c531250KsV = this.LLJ;
        if (c531250KsV != null) {
            return c531250KsV;
        }
        return null;
    }

    public final C0M4X getRealScrollViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.suh);
            this.LLILLJJLI = (C0M4X) callbackFindViewById;
        }
        return (C0M4X) callbackFindViewById;
    }

    public final View getVScollCoverViewFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vScollCoverView);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final C0M4X getScrollCoverView() {
        return getRealScrollViewFromXml();
    }

    public final int getScrollRange() {
        return getItemFrameViewFromXml().getWidth() > 0 ? getItemFrameViewFromXml().getWidth() : C12ES.LJIIJ(getContext()) - C366700EZg.LIZ(32.0d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C786410Ut5.C3(getViewTreeObserver(), this);
        this.LLILZIL = true;
    }

    public final TikTokMediaModel getCurrentSelectTimeMedia() {
        return this.LLJIJIL;
    }

    public final void setItemFrameViewFromXml(RoundedFrameLayout roundedFrameLayout) {
        this.LLILLL = roundedFrameLayout;
    }

    public final void setIvProgressLineFromXml(ImageView imageView) {
        this.LL = imageView;
    }

    public final void setRealScrollViewFromXml(C0M4X c0m4x) {
        this.LLILLJJLI = c0m4x;
    }

    public final void setVScollCoverViewFromXml(View view) {
        this.LLILZ = view;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC526930KlX(Context context, AttributeSet attributeSet) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        float f;
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.i5y, C786410Ut5.ne(getContext()), this);
        ViewGroup.LayoutParams layoutParams = getIvProgressLineFromXml().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        this.LLILZLL = marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2 = getRealScrollViewFromXml().getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        this.LLIZ = marginLayoutParams2;
        C786410Ut5.x3(getViewTreeObserver(), this);
        getItemFrameViewFromXml().setRadius(C366700EZg.LIZ(6.0d));
        this.LLIZLLLIL = (RecyclerView) findViewById(R.id.ikd);
        float scrollRange = getScrollRange();
        this.LLJI = scrollRange;
        this.LLJILJIL = (int) (scrollRange / C418440Gaw.LIZIZ(Float.valueOf(30.0f)));
        if (this.LLJI % C814420VxA.LIZIZ(C418440Gaw.LIZIZ(r1)) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(r1)) / 2.0f) {
            f = this.LLJI / this.LLJILJIL;
        } else {
            int i = this.LLJILJIL + 1;
            this.LLJILJIL = i;
            f = this.LLJI / i;
        }
        int i2 = this.LLJILJIL;
        Context context2 = getContext();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            this.LLJ = new C531250KsV(f, i2, context2, C20622515mp.LJIJ(c19egLIZIZ).getLifecycle());
            RecyclerView recyclerView = this.LLIZLLLIL;
            recyclerView = recyclerView == null ? null : recyclerView;
            final Context context3 = recyclerView.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context3) { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.VideoClipView$initView$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return false;
                }
            };
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            C531250KsV c531250KsV = this.LLJ;
            recyclerView.setAdapter(c531250KsV != null ? c531250KsV : null);
            C423520Gj8 c423520Gj8 = new C423520Gj8();
            c423520Gj8.LLILZLL = 300L;
            recyclerView.setItemAnimator(c423520Gj8);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZ(int i, int i2) {
        if (this.LLILZIL) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.LLIZ;
            if (marginLayoutParams != null) {
                marginLayoutParams.width = i + C366700EZg.LIZ(32.0d);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = this.LLIZ;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(i2);
            }
            C0M4X realScrollViewFromXml = getRealScrollViewFromXml();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = this.LLIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(realScrollViewFromXml);
            realScrollViewFromXml.setLayoutParams(marginLayoutParams3);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = this.LLILZLL;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.setMarginStart(i2);
            }
            C786410Ut5.c6(getIvProgressLineFromXml(), this.LLILZLL);
            requestLayout();
        }
    }
}
