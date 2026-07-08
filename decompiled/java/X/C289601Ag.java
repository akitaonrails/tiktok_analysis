package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C289601Ag extends ConstraintLayout {
    public final TuxTextView LL;

    public final TuxTextView getCurrentDurationTV() {
        return this.LL;
    }

    public C289601Ag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C289601Ag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i_t, this, true);
        this.LL = (TuxTextView) findViewById(R.id.fb0);
    }
}
