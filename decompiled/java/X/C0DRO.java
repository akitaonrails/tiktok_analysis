package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DRO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0DRO extends FrameLayout {
    public View LL;

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.LL;
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public C0DRO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DRO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fva, this, true).findViewById(R.id.g3w);
    }
}
