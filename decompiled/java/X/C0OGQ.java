package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGQ extends FrameLayout {
    public float LL;
    public TuxTextView LLILLJJLI;
    public C1841350y17 LLILLL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final C1841350y17 getRadio() {
        return this.LLILLL;
    }

    public final TuxTextView getSpeedTV() {
        return this.LLILLJJLI;
    }

    public final float getSpeedValue() {
        return this.LL;
    }

    public C0OGQ(Context context) {
        super(context);
        this.LL = 1.0f;
        C786410Ut5.LJLLJ(getContext(), R.layout.b7n, this);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.vu3);
        this.LLILLL = (C1841350y17) findViewById(R.id.vu0);
    }

    public final void setRadio(C1841350y17 c1841350y17) {
        this.LLILLL = c1841350y17;
    }

    public final void setSpeedTV(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setSpeedText(String str) {
        this.LLILLJJLI.setText(str);
        this.LLILLL.setChecked(false);
    }

    public final void setSpeedValue(float f) {
        this.LL = f;
    }
}
