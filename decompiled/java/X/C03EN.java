package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03EN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EN extends FrameLayout {
    public TuxTextView LL;
    public C418710GbN LLILLJJLI;
    public C418710GbN LLILLL;
    public C418710GbN LLILZ;
    public C418710GbN LLILZIL;
    public C418710GbN LLILZLL;
    public View LLIZ;

    public final C03EO getTitleWrap() {
        return null;
    }

    public final void setTitleWrap(C03EO c03eo) {
    }

    public final View getBgBrowserTitleFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.bwp);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final C418710GbN getBtnShareFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cv0);
            this.LLILZIL = (C418710GbN) callbackFindViewById;
        }
        return (C418710GbN) callbackFindViewById;
    }

    public final C418710GbN getCloseAllWebpageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e1q);
            this.LLILZ = (C418710GbN) callbackFindViewById;
        }
        return (C418710GbN) callbackFindViewById;
    }

    public final C418710GbN getCloseCustomFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e23);
            this.LLILLL = (C418710GbN) callbackFindViewById;
        }
        return (C418710GbN) callbackFindViewById;
    }

    public final C418710GbN getReportAdsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t85);
            this.LLILZLL = (C418710GbN) callbackFindViewById;
        }
        return (C418710GbN) callbackFindViewById;
    }

    public final C418710GbN getRightMenuFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tlq);
            this.LLILLJJLI = (C418710GbN) callbackFindViewById;
        }
        return (C418710GbN) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBackgroundAlpha(float f) {
        C786410Ut5.T4(getBgBrowserTitleFromXml(), f);
    }

    public final void setBgBrowserTitleFromXml(View view) {
        this.LLIZ = view;
    }

    public final void setBtnShareFromXml(C418710GbN c418710GbN) {
        this.LLILZIL = c418710GbN;
    }

    public final void setCloseAllWebpageFromXml(C418710GbN c418710GbN) {
        this.LLILZ = c418710GbN;
    }

    public final void setCloseCustomFromXml(C418710GbN c418710GbN) {
        this.LLILLL = c418710GbN;
    }

    public final void setReportAdsFromXml(C418710GbN c418710GbN) {
        this.LLILZLL = c418710GbN;
    }

    public final void setRightMenuFromXml(C418710GbN c418710GbN) {
        this.LLILLJJLI = c418710GbN;
    }

    public final void setTitle(CharSequence charSequence) {
        getTitleFromXml().setText(charSequence);
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C03EN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ack, this, true);
        setBackgroundResource(R.drawable.au0);
        setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
    }
}
