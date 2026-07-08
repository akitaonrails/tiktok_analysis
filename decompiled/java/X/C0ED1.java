package X;

import Y.ACListenerS109S0200000_5;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ED1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ED1 extends FrameLayout {
    public TuxIconView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public LinearLayout LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    private final ObjectAnimator getLoadingAnim() {
        return (ObjectAnimator) this.LLJI.getValue();
    }

    public final LinearLayout getPanelEmptyGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q1n);
            this.LLJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getPanelEmptyTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q1o);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPanelEmptyTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q1p);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getPanelLoadingGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q20);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getPanelLoadingIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q21);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPanelLoadingTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q22);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getPanelNetErrorGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q24);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getPanelNetErrorIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q25);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPanelNetErrorTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q26);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ObjectAnimator getRetryAnim() {
        return (ObjectAnimator) this.LLJIJIL.getValue();
    }

    public final void LIZ() {
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
        getLoadingAnim().cancel();
        getRetryAnim().cancel();
    }

    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        bringToFront();
        C786410Ut5.LJZL(4, getPanelLoadingGroupFromXml());
        C786410Ut5.LJZL(4, getPanelNetErrorGroupFromXml());
        C786410Ut5.LJZL(0, getPanelEmptyGroupFromXml());
        getLoadingAnim().cancel();
        getRetryAnim().cancel();
    }

    public final void LIZJ() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        bringToFront();
        C786410Ut5.LJZL(0, getPanelLoadingGroupFromXml());
        C786410Ut5.LJZL(4, getPanelNetErrorGroupFromXml());
        C786410Ut5.LJZL(4, getPanelEmptyGroupFromXml());
        C786410Ut5.Pd(getLoadingAnim());
        getRetryAnim().cancel();
    }

    public final void LIZLLL() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        bringToFront();
        C786410Ut5.LJZL(4, getPanelLoadingGroupFromXml());
        C786410Ut5.LJZL(0, getPanelNetErrorGroupFromXml());
        C786410Ut5.LJZL(4, getPanelEmptyGroupFromXml());
        getLoadingAnim().cancel();
        getRetryAnim().cancel();
    }

    public final void LJ(Activity activity) {
        String string;
        C01GW c01gw = C560970LzL.LIZ;
        boolean zIsFakeNetwork = ((INetworkStateService) c01gw.getValue()).isFakeNetwork();
        boolean zIsWeakNetwork = ((INetworkStateService) c01gw.getValue()).isWeakNetwork();
        boolean zLIZIZ = C0XF1.LIZIZ(activity);
        if (zIsFakeNetwork) {
            string = getContext().getString(2131850741);
        } else if (!zIsWeakNetwork && zLIZIZ) {
            string = getContext().getString(2131850737);
        } else {
            string = getContext().getString(2131850739);
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C1390380mHk.LIZ(activity, 6001, creativeToastBuilder);
    }

    public final void setEmptyTip(String str) {
        getPanelEmptyTipFromXml().setText(str);
    }

    public final void setEmptyTitle(String str) {
        getPanelEmptyTitleFromXml().setText(str);
    }

    public final void setErrorTip(String str) {
        getPanelNetErrorTextFromXml().setText(str);
    }

    public final void setLoadingTip(String str) {
        getPanelLoadingTextFromXml().setText(str);
    }

    public final void setOnRetryClick(Function1<? super View, Unit> function1) {
        C786410Ut5.R7(getPanelNetErrorGroupFromXml(), new ACListenerS109S0200000_5(this, function1, 11));
    }

    public final void setPanelEmptyGroupFromXml(LinearLayout linearLayout) {
        this.LLJ = linearLayout;
    }

    public final void setPanelEmptyTipFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setPanelEmptyTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setPanelLoadingGroupFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void setPanelLoadingIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setPanelLoadingTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setPanelNetErrorGroupFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setPanelNetErrorIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setPanelNetErrorTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public C0ED1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 817));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 818));
        C786410Ut5.Sd(R.layout.t7, C786410Ut5.ne(context), this);
    }
}
