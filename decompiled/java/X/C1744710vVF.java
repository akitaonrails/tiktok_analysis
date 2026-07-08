package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0vVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744710vVF extends TuxTextView {
    public int LLJJJJ;

    public final void LJJJJJ(int i) {
        if (this.LLJJJJ <= 0) {
            return;
        }
        setText(C786410Ut5.k4(Locale.getDefault(), "%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf((i % this.LLJJJJ) + 1), Integer.valueOf(this.LLJJJJ)}, 2)));
    }

    public final void setRealSize(int i) {
        if (i > 0) {
            this.LLJJJJ = i;
        }
    }

    public C1744710vVF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        setTextColor(C960203pA.LIZ(R.attr.ef, getContext()));
        setTuxFont(33);
    }
}
