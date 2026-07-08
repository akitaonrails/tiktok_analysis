package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1280, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1280 extends C19518211Xw {
    public AnonymousClass1281 LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public final ARunnableS129S0100000_29 LLJILLL;

    public final void LJJJIL() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        AnonymousClass1281 anonymousClass1281 = this.LLIZLLLIL;
        if (anonymousClass1281 != null && !anonymousClass1281.LJII) {
            anonymousClass1281.LJII = true;
        }
        if (getLayoutDirection() == 1) {
            setTextDirection(4);
            setLayoutDirection(1);
            invalidate();
            requestLayout();
        }
        HandlerHook.viewPostDelay(this, this.LLJILLL, 0L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJILJILJ) {
            LJJJIL();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        AnonymousClass1281 anonymousClass1281 = this.LLIZLLLIL;
        if (anonymousClass1281 != null && !anonymousClass1281.LJII) {
            anonymousClass1281.LJII = true;
        }
        setHorizontallyScrolling(false);
        setHorizontalFadingEdgeEnabled(false);
    }

    public final int getCount() {
        return this.LLJI;
    }

    public final int getEndPosition() {
        return this.LLJ;
    }

    public final int getSpeed() {
        return this.LLJIJIL;
    }

    public final int getTaskInterval() {
        return this.LLJILJIL;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.LLJILJILJ;
    }

    public AnonymousClass1280(Context context) {
        super(context, null, 0);
        this.LLJI = -1;
        this.LLJIJIL = 40;
        this.LLJILJIL = 25;
        this.LLJILLL = new ARunnableS129S0100000_29(this, 120);
    }

    public final void setCount(int i) {
        this.LLJI = i;
    }

    public final void setEndPosition(int i) {
        this.LLJ = i;
    }

    public final void setMarqueeEnable$lib_runtime_release(boolean z) {
        if (this.LLJILJILJ != z) {
            this.LLJILJILJ = z;
            if (z) {
                LJJJIL();
                return;
            }
            HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
            AnonymousClass1281 anonymousClass1281 = this.LLIZLLLIL;
            if (anonymousClass1281 != null && !anonymousClass1281.LJII) {
                anonymousClass1281.LJII = true;
            }
            setHorizontallyScrolling(false);
            setHorizontalFadingEdgeEnabled(false);
        }
    }

    public final void setSpeed(int i) {
        this.LLJIJIL = i;
    }

    public final void setTaskInterval(int i) {
        this.LLJILJIL = i;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        AnonymousClass1281 anonymousClass1281 = this.LLIZLLLIL;
        if (anonymousClass1281 != null && !anonymousClass1281.LJII) {
            anonymousClass1281.LJII = true;
        }
        this.LLIZLLLIL = null;
        super.setText(charSequence, bufferType);
    }
}
