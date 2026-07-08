package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16FP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16FP extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public C16FP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final TuxIconView getRetryBtn() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getRetryText() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final FrameLayout getRootLayout() {
        return (FrameLayout) this.LL.getValue();
    }

    private final TuxSpinner getSpinner() {
        return (TuxSpinner) this.LLILZ.getValue();
    }

    public final void LIZ(Function0<Unit> function0) {
        C786410Ut5.O7(getRootLayout(), new ACListenerS165S0100000_31(function0, 71));
    }

    public final void LIZIZ(C16FR c16fr) {
        int i = C16FQ.LIZ[c16fr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C337180DJs.LIZJ(this);
                        C337180DJs.LIZJ(getRetryBtn());
                        C337180DJs.LIZJ(getRetryText());
                        C337180DJs.LIZ(getSpinner());
                        return;
                    }
                    throw new C1954807lC();
                }
                C337180DJs.LIZ(this);
                C337180DJs.LIZ(getRetryBtn());
                C337180DJs.LIZ(getRetryText());
                C337180DJs.LIZ(getSpinner());
                return;
            }
            C337180DJs.LIZJ(this);
            C337180DJs.LIZ(getRetryBtn());
            C337180DJs.LIZ(getRetryText());
            C337180DJs.LIZ(getSpinner());
            return;
        }
        C337180DJs.LIZJ(this);
        C337180DJs.LIZ(getRetryBtn());
        C337180DJs.LIZ(getRetryText());
        C337180DJs.LIZJ(getSpinner());
    }

    public C16FP(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 690));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 688));
        this.LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 689));
        this.LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 691));
        FrameLayout.inflate(context, R.layout.cb6, this);
    }
}
