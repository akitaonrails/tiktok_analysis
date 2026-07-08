package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231930iAB extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C0HZQ LLILZ;
    public FrameLayout LLILZIL;
    public boolean LLILZLL;
    public InterfaceC1231950iAD LLIZ;

    public final C0HZQ getCheckBoxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dq1);
            this.LLILZ = (C0HZQ) callbackFindViewById;
        }
        return (C0HZQ) callbackFindViewById;
    }

    public final FrameLayout getCheckBoxHotspotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dq4);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getCheckBoxTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dq5);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getDescViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fob);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getHeaderViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jl0);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setCheckBoxFromXml(C0HZQ c0hzq) {
        this.LLILZ = c0hzq;
    }

    public final void setCheckBoxHotspotFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setCheckBoxTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setDescViewFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setHeaderViewFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setOnCheckedListener(InterfaceC1231950iAD interfaceC1231950iAD) {
        this.LLIZ = interfaceC1231950iAD;
    }

    public C1231930iAB(Context context, C1231920iAA c1231920iAA) {
        super(context, null, 0);
        this.LLILZLL = true;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.eca, this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
            setOrientation(1);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            setOrientation(1);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        getHeaderViewFromXml().setText(c1231920iAA.LIZ);
        getDescViewFromXml().setText(c1231920iAA.LIZIZ);
        getCheckBoxTextFromXml().setText(c1231920iAA.LIZJ);
        getCheckBoxFromXml().setChecked(this.LLILZLL);
        C786410Ut5.O7(getCheckBoxHotspotFromXml(), new ACListenerS154S0100000_19(this, 190));
        getCheckBoxFromXml().setInterceptToggleListener(new AwS563S0100000_19(this, 2691));
    }
}
