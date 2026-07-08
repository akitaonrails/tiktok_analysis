package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745960vXG extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxSpinner LLILZ;

    public final void setGrantBtnClickListener(Function0<Unit> function0) {
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C786410Ut5.I7(new AjS70S0100000_26(function0, 8), linearLayout);
        }
    }

    public final void setGrantBtnLoading(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.LLILLL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            TuxSpinner tuxSpinner = this.LLILZ;
            if (tuxSpinner != null) {
                C786410Ut5.LLZILL(tuxSpinner, 0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LLILLL;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        TuxSpinner tuxSpinner2 = this.LLILZ;
        if (tuxSpinner2 == null) {
            return;
        }
        C786410Ut5.LLZILL(tuxSpinner2, 8);
    }

    public C1745960vXG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        C786410Ut5.Sd(R.layout.aiq, C786410Ut5.ne(context), this);
        this.LL = (SmartImageView) findViewById(R.id.noc);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.j4z);
        this.LLILLL = (LinearLayout) findViewById(R.id.j4x);
        this.LLILZ = (TuxSpinner) findViewById(R.id.nnd);
    }
}
