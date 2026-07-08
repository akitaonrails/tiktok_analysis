package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;

/* JADX INFO: renamed from: X.1830, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1830 extends ConstraintLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public View.OnClickListener LL;
    public View.OnClickListener LLILLJJLI;
    public View.OnClickListener LLILLL;

    public abstract String e0(View view);

    public abstract Map<String, String> h0(View view);

    public abstract int i0(View view);

    public abstract void j0(C182N c182n, long j);

    public abstract void onDestroy();

    public final View.OnClickListener getActionClickListener() {
        return this.LLILLL;
    }

    public final View.OnClickListener getCardClickListener() {
        return this.LLILLJJLI;
    }

    public final View.OnClickListener getCloseClickListener() {
        return this.LL;
    }

    public final void setActionClickListener(View.OnClickListener onClickListener) {
        this.LLILLL = onClickListener;
    }

    public final void setCardClickListener(View.OnClickListener onClickListener) {
        this.LLILLJJLI = onClickListener;
    }

    public final void setCloseClickListener(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    public AnonymousClass1830(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
