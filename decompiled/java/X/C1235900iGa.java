package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1235900iGa extends FrameLayout implements InterfaceC1213370hgF {
    public View LL;
    public int LLILLJJLI;

    public C1235900iGa() {
        throw null;
    }

    @Override // X.InterfaceC1213370hgF
    public final void LIZ(int i) {
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LL.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.W5(this.LL, layoutParams);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.LL;
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public C1235900iGa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1235900iGa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = C20742916Ex.LIZ(context, R.layout.d6b, this, true, -1).findViewById(R.id.g3w);
    }
}
