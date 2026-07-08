package X;

import Y.ATListenerS450S0100000_17;
import android.animation.Animator;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145830fvJ extends HorizontalScrollView {
    public static final /* synthetic */ int LLIZ = 0;
    public final C16F5 LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public Animator LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        Animator animator = this.LLILZIL;
        if (animator != null) {
            animator.cancel();
        }
        setScrollX(this.LLILLJJLI ? this.LL.getWidth() - getWidth() : 0);
    }

    public final Spannable getSpan() {
        return SpannableString.valueOf(this.LL.getText());
    }

    public final String getText() {
        return this.LL.getText().toString();
    }

    @Override // android.view.View, android.view.ViewParent
    public int getLayoutDirection() {
        return this.LLILLL;
    }

    @Override // android.view.View, android.view.ViewParent
    public int getTextDirection() {
        return this.LLILZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZLL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setConsumeTouchEvent(boolean z) {
        this.LLILZLL = z;
    }

    public final void setSpan(Spannable spannable) {
        this.LL.setText(spannable);
    }

    public final void setText(String str) {
        this.LL.setText(str);
    }

    public C1145830fvJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C16F5 c16f5 = new C16F5(context, null);
        this.LL = c16f5;
        this.LLILLL = 1;
        this.LLILZ = 4;
        this.LLILZLL = true;
        setOnTouchListener(new ATListenerS450S0100000_17(this, 24));
        addView(c16f5);
        boolean zLJJ = C497740JfY.LJJ();
        this.LLILLJJLI = zLJJ;
        this.LLILLL = zLJJ ? 1 : 0;
        this.LLILZ = zLJJ ? 4 : 3;
        c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, context));
        c16f5.LJJJI(R.style.a9i);
    }
}
