package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428750GrZ extends ConstraintLayout {
    public final C16F5 LL;
    public final FrameLayout LLILLJJLI;

    public final void setTitle(CharSequence charSequence) {
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(charSequence);
        }
    }

    public final void setTitlePosition(int i) {
        C19ME c19me;
        C19ME c19me2;
        int id = -1;
        ViewGroup.LayoutParams layoutParams = null;
        if (i != 0) {
            if (i == 1) {
                C16F5 c16f5 = this.LL;
                if (c16f5 != null) {
                    c16f5.setTextAlignment(5);
                }
                C16F5 c16f52 = this.LL;
                if (c16f52 != null) {
                    layoutParams = c16f52.getLayoutParams();
                }
                if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
                    c19me2.endToEnd = -1;
                    FrameLayout frameLayout = this.LLILLJJLI;
                    if (frameLayout != null) {
                        id = frameLayout.getId();
                    }
                    c19me2.endToStart = id;
                    C16F5 c16f53 = this.LL;
                    if (c16f53 != null) {
                        C786410Ut5.y6(c16f53, c19me2);
                    }
                }
                C16F5 c16f54 = this.LL;
                if (c16f54 != null) {
                    c16f54.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        C16F5 c16f55 = this.LL;
        if (c16f55 != null) {
            c16f55.setTextAlignment(4);
        }
        C16F5 c16f56 = this.LL;
        if (c16f56 != null) {
            layoutParams = c16f56.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            c19me.endToStart = -1;
            c19me.endToEnd = 0;
            C16F5 c16f57 = this.LL;
            if (c16f57 != null) {
                C786410Ut5.y6(c16f57, c19me);
            }
        }
        C16F5 c16f58 = this.LL;
        if (c16f58 == null) {
            return;
        }
        c16f58.requestLayout();
    }

    public C428750GrZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C428750GrZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h7e, this, true);
        this.LL = (C16F5) findViewById(R.id.tv_title);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.i9q);
    }
}
