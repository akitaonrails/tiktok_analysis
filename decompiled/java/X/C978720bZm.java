package X;

import Y.ACListenerS148S0100000_13;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978720bZm extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public Function0<Unit> LLILLL;

    private final C16F5 getDurationTextView() {
        return (C16F5) this.LL.getValue();
    }

    private final LiveIconView getEditIcon() {
        return (LiveIconView) this.LLILLJJLI.getValue();
    }

    public final void h0() {
        C16F5 durationTextView = getDurationTextView();
        if (durationTextView != null) {
            durationTextView.setText(C497740JfY.LJIJI(2131856712));
        }
    }

    public final Function0<Unit> getOnClick() {
        return this.LLILLL;
    }

    public final void e0(long j) {
        String strLJIJJ = C497740JfY.LJIJJ(2131856850, C972470bPh.LIZJ(j));
        C16F5 durationTextView = getDurationTextView();
        if (durationTextView != null) {
            durationTextView.setText(strLJIJJ);
        }
    }

    public final void i0(boolean z) {
        if (z) {
            setEnabled(true);
            setFocusable(true);
            setClickable(true);
            C786410Ut5.o8(this, new ACListenerS148S0100000_13(this, 3));
            C500260Jjc.LLFFF(getEditIcon());
            return;
        }
        setEnabled(false);
        setFocusable(false);
        setClickable(false);
        C786410Ut5.o8(this, null);
        C500260Jjc.LJIILIIL(getEditIcon());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnClick(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public C978720bZm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C978720bZm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C1935407i4.LIZ(new AwS559S0100000_15(this, 118));
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 119));
        this.LLILLL = AFwS203S0000000_15.get$arr$(31);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gvv, this, true);
    }
}
