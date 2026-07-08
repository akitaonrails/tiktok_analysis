package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03gB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C904503gB extends FrameLayout {
    public TuxTextView LL;

    public final TuxTextView getBalanceTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bqq);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final String getBalanceTextValue() {
        return getBalanceTextFromXml().getText().toString();
    }

    public C904503gB(Context context) {
        super(context, null, 0);
        C0H1U.LIZJ(R.layout.aq9, this, true);
    }

    public final void setBalanceTextColor(int i) {
        getBalanceTextFromXml().setTextColor(i);
    }

    public final void setBalanceTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setBalanceTextValue(String str) {
        getBalanceTextFromXml().setText(str);
    }
}
