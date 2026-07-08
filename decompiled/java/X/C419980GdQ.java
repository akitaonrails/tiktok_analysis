package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419980GdQ extends FrameLayout {
    public TuxTextView LL;
    public FrameLayout LLILLJJLI;

    public final void setFont(int i) {
        if (i == 62) {
            TuxTextView tuxTextView = this.LL;
            if (tuxTextView != null) {
                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            }
        } else {
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 != null) {
                tuxTextView2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            }
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(i);
        }
    }

    public final void setMarginStart(int i) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, marginLayoutParams);
        }
    }

    public final void setText(int i) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(getContext().getString(i));
        }
    }

    public C419980GdQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C419980GdQ(Context context, AttributeSet attributeSet, int i) {
        Drawable background;
        Drawable background2;
        super(context, attributeSet, 0);
        if (C786410Ut5.Sd(R.layout.dr1, C786410Ut5.ne(context), this) != null) {
            this.LL = (TuxTextView) findViewById(R.id.p7m);
            this.LLILLJJLI = (FrameLayout) findViewById(R.id.p7l);
            if (C960203pA.LIZIZ(context)) {
                FrameLayout frameLayout = this.LLILLJJLI;
                if (frameLayout != null && (background2 = frameLayout.getBackground()) != null) {
                    background2.setAlpha(71);
                }
                TuxTextView tuxTextView = this.LL;
                if (tuxTextView != null) {
                    C786410Ut5.B5(tuxTextView, 1.0f);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.LLILLJJLI;
            if (frameLayout2 != null && (background = frameLayout2.getBackground()) != null) {
                background.setAlpha(51);
            }
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 == null) {
                return;
            }
            C786410Ut5.B5(tuxTextView2, 1.0f);
        }
    }
}
