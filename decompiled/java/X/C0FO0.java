package X;

import Y.ACListenerS109S0200000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FO0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FO0 extends FrameLayout {
    public C1295960jpS LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C197039127h LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public LinearLayout LLIZLLLIL;
    public LinearLayout LLJ;
    public LinearLayout LLJI;

    public final LinearLayout getPanelEmptyGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q1n);
            this.LLJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getPanelEmptyTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q1o);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPanelEmptyTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q1p);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getPanelLoadingGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q20);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1295960jpS getPanelLoadingIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q21);
            this.LL = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final TuxTextView getPanelLoadingTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q22);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getPanelNetErrorGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q24);
            this.LLJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getPanelNetErrorSubTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p4u);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPanelNetErrorTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p4v);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h getPanelRetryBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p4t);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final void LIZ() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        bringToFront();
        C786410Ut5.LJZL(0, getPanelLoadingGroupFromXml());
        C786410Ut5.LJZL(4, getPanelNetErrorGroupFromXml());
        C786410Ut5.LJZL(4, getPanelEmptyGroupFromXml());
        C1295960jpS panelLoadingIconFromXml = getPanelLoadingIconFromXml();
        if (panelLoadingIconFromXml != null) {
            panelLoadingIconFromXml.playAnimation();
        }
    }

    public final void setEmptyTip(String str) {
        getPanelEmptyTipFromXml().setText(str);
    }

    public final void setEmptyTitle(String str) {
        getPanelEmptyTitleFromXml().setText(str);
    }

    public final void setErrorTipSubTitle(String str) {
        getPanelNetErrorSubTitleFromXml().setText(str);
    }

    public final void setErrorTipTitle(String str) {
        getPanelNetErrorTitleFromXml().setText(str);
    }

    public final void setLoadingTip(String str) {
        getPanelLoadingTextFromXml().setText(str);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public final void setOnRetryClick(Function1<? super View, Unit> function1) {
        C786410Ut5.U8(getPanelRetryBtnFromXml(), new ACListenerS109S0200000_5(function1, this, 4));
    }

    public final void setPanelEmptyGroupFromXml(LinearLayout linearLayout) {
        this.LLJI = linearLayout;
    }

    public final void setPanelEmptyTipFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setPanelEmptyTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setPanelLoadingGroupFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setPanelLoadingIconFromXml(C1295960jpS c1295960jpS) {
        this.LL = c1295960jpS;
    }

    public final void setPanelLoadingTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setPanelNetErrorGroupFromXml(LinearLayout linearLayout) {
        this.LLJ = linearLayout;
    }

    public final void setPanelNetErrorSubTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setPanelNetErrorTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setPanelRetryBtnFromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public C0FO0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.t8, C786410Ut5.ne(context), this);
    }
}
