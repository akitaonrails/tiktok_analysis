package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215990hkT extends FrameLayout {
    public FrameLayout LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public FrameLayout LLILZIL;
    public TuxTextView LLILZLL;
    public ImageView LLIZ;
    public TuxTextView LLIZLLLIL;

    public final FrameLayout getFlCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i1s);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getFmTagLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idh);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ImageView getIvCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l61);
            this.LLILLJJLI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final ImageView getIvProductFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l72);
            this.LLIZ = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final TuxTextView getTvClicksFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2z);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvDurationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z3n);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5j);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvTagViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z78);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setFlCoverFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setFmTagLayoutFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setIvCoverFromXml(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setIvProductFromXml(ImageView imageView) {
        this.LLIZ = imageView;
    }

    public final void setProductSummary(String str) {
        getTvProductFromXml().setText(str);
    }

    public final void setTagView(String str) {
        if (C123100dR.LIZ(str)) {
            C786410Ut5.LJZ(0, getFmTagLayoutFromXml());
            getTvTagViewFromXml().setText(str);
            C786410Ut5.LLLLZLL(getTvClicksFromXml(), 8);
        } else {
            C786410Ut5.LJZ(8, getFmTagLayoutFromXml());
            C786410Ut5.LLLLZLL(getTvClicksFromXml(), 0);
        }
    }

    public final void setTvClicksFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvDurationFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvProductFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvTagViewFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setVideoClicks(String str) {
        getTvClicksFromXml().setText(str);
    }

    public final void setVideoDuration(String str) {
        getTvDurationFromXml().setText(str);
    }

    public C1215990hkT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.bv2, this);
        C786410Ut5.x3(getFlCoverFromXml().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(this, 10));
    }
}
