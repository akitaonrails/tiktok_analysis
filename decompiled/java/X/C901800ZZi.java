package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901800ZZi extends ConstraintLayout {
    public final C01GW LL;

    @Override // android.view.View
    public int getSourceLayoutResId() {
        return R.layout.clv;
    }

    public final TuxTextView getRestrictedTitle() {
        return (TuxTextView) this.LL.getValue();
    }

    public C901800ZZi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1319));
        C20742916Ex.LIZ(context, getSourceLayoutResId(), this, true, -1);
    }
}
