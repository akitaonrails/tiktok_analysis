package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336440DGw extends LinearLayout {
    public final C336450DGx LL;

    public C336440DGw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i5t, this, false);
        addView(viewTd);
        int i = R.id.ucp_error_message;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_error_message, viewTd);
        if (tuxTextView != null) {
            i = R.id.ucp_error_retry;
            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.ucp_error_retry, viewTd);
            if (c197039127h != null) {
                this.LL = new C336450DGx((LinearLayout) viewTd, tuxTextView, c197039127h);
                setOrientation(0);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public final void LIZ(String str, String str2, Function0<Unit> function0) {
        String string;
        this.LL.LLILLJJLI.setText(str);
        if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            string = "";
        }
        if (a0.LJJJIL(string)) {
            C786410Ut5.LLLLLLJ(this.LL.LLILLL, 8);
            C786410Ut5.U8(this.LL.LLILLL, null);
        } else {
            C786410Ut5.LLLLLLJ(this.LL.LLILLL, 0);
            this.LL.LLILLL.setText(string);
            C786410Ut5.U8(this.LL.LLILLL, new ACListenerS139S0100000_4(function0, 14));
        }
    }
}
