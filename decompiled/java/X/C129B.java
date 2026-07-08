package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.129B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C129B extends FrameLayout {
    public final View LL;
    public final C0HZQ LLILLJJLI;
    public final TuxSpinner LLILLL;
    public AwS395S0200000_29 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C129B(Context context) {
        C0HZQ c0hzq;
        super(context, null, 0);
        TuxSpinner tuxSpinner = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i_b, this, true);
        this.LL = viewTd;
        if (viewTd != null && (c0hzq = (C0HZQ) viewTd.findViewById(R.id.djx)) != null) {
            c0hzq.setClickable(false);
        } else {
            c0hzq = null;
        }
        this.LLILLJJLI = c0hzq;
        if (viewTd != null) {
            TextView textView = (TextView) viewTd.findViewById(R.id.zhs);
            if (textView != null) {
                textView.setText(C555520LqY.LIZIZ(2131836950));
            }
            tuxSpinner = (TuxSpinner) viewTd.findViewById(R.id.v_loading);
        }
        this.LLILLL = tuxSpinner;
        if (viewTd != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 291), viewTd);
        }
    }
}
