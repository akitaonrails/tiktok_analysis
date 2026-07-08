package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U9O, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9O extends FrameLayout {
    public C21538619Qy LL;
    public View LLILLJJLI;

    public final View getIconBlackShape() {
        return this.LLILLJJLI;
    }

    public final C21538619Qy getIconView() {
        return this.LL;
    }

    public final void setIconBlackShape(View view) {
        this.LLILLJJLI = view;
    }

    public final void setIconView(C21538619Qy c21538619Qy) {
        this.LL = c21538619Qy;
    }

    public C0U9O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.hn8, this);
        this.LL = (C21538619Qy) findViewById(R.id.k55);
        this.LLILLJJLI = findViewById(R.id.c2w);
        if (C497740JfY.LJJ()) {
            View view = this.LLILLJJLI;
            if (view != null) {
                view.setBackground(C800330VaR.LIZIZ(context, R.drawable.fbg));
                return;
            }
            return;
        }
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            return;
        }
        view2.setBackground(C800330VaR.LIZIZ(context, R.drawable.fbf));
    }
}
