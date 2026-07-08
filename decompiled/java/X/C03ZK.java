package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03ZK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZK extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public final TuxTextView getTvPaymentGroupItemAmountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z56);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentGroupItemTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z57);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final String getAmount() {
        return this.LLILZ;
    }

    public final String getTitle() {
        return this.LLILLL;
    }

    public /* synthetic */ C03ZK(Context context) {
        this(context, null, 0);
    }

    private final void setGroupAmount(String str) {
        if (str == null || str.length() == 0) {
            C0H1U.LIZIZ(getTvPaymentGroupItemAmountFromXml());
        }
        getTvPaymentGroupItemAmountFromXml().setText(str);
        C12ES.LJIILL(0, getTvPaymentGroupItemAmountFromXml());
    }

    private final void setGroupTitle(String str) {
        getTvPaymentGroupItemTitleFromXml().setText(str);
    }

    public final void setAmount(String str) {
        setGroupAmount(str);
    }

    public final void setTitle(String str) {
        setGroupTitle(str);
    }

    public final void setTvPaymentGroupItemAmountFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvPaymentGroupItemTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C03ZK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = "";
        this.LLILZ = "";
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.aox, this, true);
    }
}
