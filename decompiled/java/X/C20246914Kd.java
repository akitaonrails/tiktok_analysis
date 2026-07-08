package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20246914Kd extends FrameLayout {
    public Drawable LL;
    public Rect LLILLJJLI;
    public final Rect LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public void LIZ(C20246014Ju c20246014Ju) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LL != null) {
            this.LL.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LL != null) {
            this.LL.setCallback(null);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.LLILLJJLI != null && this.LL != null) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.LLILZ) {
                this.LLILLL.set(0, 0, width, this.LLILLJJLI.top);
                this.LL.setBounds(this.LLILLL);
                this.LL.draw(canvas);
            }
            if (this.LLILZIL) {
                this.LLILLL.set(0, height - this.LLILLJJLI.bottom, width, height);
                this.LL.setBounds(this.LLILLL);
                this.LL.draw(canvas);
            }
            Rect rect = this.LLILLL;
            Rect rect2 = this.LLILLJJLI;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.LL.setBounds(this.LLILLL);
            this.LL.draw(canvas);
            Rect rect3 = this.LLILLL;
            Rect rect4 = this.LLILLJJLI;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.LL.setBounds(this.LLILLL);
            this.LL.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.LLILZIL = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.LLILZ = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.LL = drawable;
    }

    public C20246914Kd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20246914Kd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = new Rect();
        this.LLILZ = true;
        this.LLILZIL = true;
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.ScrimInsetsFrameLayout, i, R.style.a2i, new int[0]);
        this.LL = typedArrayLIZLLL.getDrawable(R$styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayLIZLLL.recycle();
        setWillNotDraw(true);
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.14KD
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20246914Kd c20246914Kd = this.LL;
                if (c20246914Kd.LLILLJJLI == null) {
                    c20246914Kd.LLILLJJLI = new Rect();
                }
                this.LL.LLILLJJLI.set(c20246014Ju.LIZLLL(), c20246014Ju.LJFF(), c20246014Ju.LJ(), c20246014Ju.LIZJ());
                this.LL.LIZ(c20246014Ju);
                C20246914Kd c20246914Kd2 = this.LL;
                boolean z = true;
                if ((!c20246014Ju.LIZ.LJIIJJI().equals(C20244914Jj.LJ)) && this.LL.LL != null) {
                    z = false;
                }
                c20246914Kd2.setWillNotDraw(z);
                this.LL.postInvalidateOnAnimation();
                return c20246014Ju.LIZ.LIZJ();
            }
        });
    }
}
