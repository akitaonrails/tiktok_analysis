package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C341710DaT extends FrameLayout {
    public View LL;

    public final FrameLayout.LayoutParams getProgressLayoutParams() {
        View view = this.LL;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public final View getProgress() {
        return this.LL;
    }

    public final void setProgress(View view) {
        this.LL = view;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.LL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public C341710DaT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fva, this, true).findViewById(R.id.g3w);
    }
}
