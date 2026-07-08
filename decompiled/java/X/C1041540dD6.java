package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041540dD6 extends FrameLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public View LLILZIL;
    public TuxIconView LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public View LLJ;
    public InterfaceC1041830dDZ LLJI;
    public C1041660dDI LLJIJIL;

    public final View getBgBrowserTitleFromXml() {
        View view = this.LLJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.bwp);
        this.LLJ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getBtnShareFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cv0);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getCloseAllWebpageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e1q);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getCloseCustomFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e23);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getLineFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.moq);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getReportAdsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t85);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getReportNormalFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t8x);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getRightMenuFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tlq);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1041660dDI getCrossPlatformParams() {
        return this.LLJIJIL;
    }

    public final InterfaceC1041830dDZ getTitleWrap() {
        return this.LLJI;
    }

    public final void setBackgroundAlpha(float f) {
        C786410Ut5.T4(getBgBrowserTitleFromXml(), f);
    }

    public final void setBgBrowserTitleFromXml(View view) {
        this.LLJ = view;
    }

    public final void setBtnShareFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setCloseAllWebpageFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setCloseCustomFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setCrossPlatformParams(C1041660dDI c1041660dDI) {
        String string;
        int i;
        this.LLJIJIL = c1041660dDI;
        if (c1041660dDI != null) {
            TuxTextView titleFromXml = getTitleFromXml();
            if (TextUtils.isEmpty(c1041660dDI.LIZJ.LJ)) {
                string = getContext().getString(2131848751);
            } else {
                string = c1041660dDI.LIZJ.LJ;
            }
            titleFromXml.setText(string);
            C786410Ut5.a9(getRightMenuFromXml(), new ACListenerS151S0100000_16(this, 36));
            C786410Ut5.a9(getCloseCustomFromXml(), new ACListenerS151S0100000_16(this, 37));
            C786410Ut5.a9(getCloseAllWebpageFromXml(), new ACListenerS151S0100000_16(this, 38));
            if (c1041660dDI.LIZJ.LIZJ) {
                C786410Ut5.LLLLLLZZ(getRightMenuFromXml(), 8);
            }
            View lineFromXml = getLineFromXml();
            if (c1041660dDI.LIZJ.LJJIIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, lineFromXml);
            C786410Ut5.a9(getBtnShareFromXml(), new ACListenerS151S0100000_16(this, 39));
            if (TextUtils.equals(c1041660dDI.LIZJ.LJIIIZ, "1")) {
                C786410Ut5.LLLLLLZZ(getCloseCustomFromXml(), 8);
            } else {
                C786410Ut5.LLLLLLZZ(getCloseCustomFromXml(), 0);
            }
            if (c1041660dDI.LIZJ.LJFF != -2) {
                getTitleFromXml().setBackground(new ColorDrawable(c1041660dDI.LIZJ.LJFF));
                setBackgroundColor(c1041660dDI.LIZJ.LJFF);
            }
            if (c1041660dDI.LIZJ.LJII != -2) {
                getTitleFromXml().setTextColor(c1041660dDI.LIZJ.LJII);
                Context context = getContext();
                if (context != null) {
                    C19LH c19lhLIZ = C19LH.LIZ(context.getResources(), R.drawable.bfx, context.getTheme());
                    if (c19lhLIZ != null) {
                        c19lhLIZ.setTint(c1041660dDI.LIZJ.LJII);
                    }
                    getCloseCustomFromXml().setImageDrawable(c19lhLIZ);
                }
            }
            if (c1041660dDI.LIZJ.LIZJ) {
                C786410Ut5.LLLLLLZZ(getBtnShareFromXml(), 8);
            }
            if (c1041660dDI.LIZJ.LIZLLL) {
                if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(c1041660dDI.LIZ.LJI) != null) {
                    C786410Ut5.LLLLLLZZ(getReportAdsFromXml(), 0);
                    C786410Ut5.a9(getReportAdsFromXml(), new ACListenerS151S0100000_16(this, 40));
                }
                C786410Ut5.LLLLLLZZ(getBtnShareFromXml(), 8);
            }
            int i2 = c1041660dDI.LIZJ.LJJII;
            if (i2 == 2) {
                C786410Ut5.LLLLLLZZ(getBtnShareFromXml(), 0);
                C786410Ut5.LLLLLLZZ(getReportAdsFromXml(), 8);
            } else if (i2 == 1) {
                C786410Ut5.LLLLLLZZ(getBtnShareFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getReportAdsFromXml(), 0);
            }
            if (!TextUtils.isEmpty(c1041660dDI.LIZ.LJIIJ)) {
                C786410Ut5.LLLLLLZZ(getReportNormalFromXml(), 0);
                C786410Ut5.a9(getReportNormalFromXml(), new ACListenerS151S0100000_16(this, 41));
                C786410Ut5.LLLLLLZZ(getReportAdsFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getBtnShareFromXml(), 8);
            }
            if (C1041780dDU.LIZ(c1041660dDI)) {
                C786410Ut5.LLLLLLZZ(getCloseAllWebpageFromXml(), 0);
                C786410Ut5.LLLLLLZZ(getCloseCustomFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getRightMenuFromXml(), 0);
                C786410Ut5.a9(getRightMenuFromXml(), new ACListenerS119S0200000_16(c1041660dDI, this, 8));
                C786410Ut5.LLLLLLZZ(getReportNormalFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getReportAdsFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getBtnShareFromXml(), 8);
            }
        }
    }

    public final void setLineFromXml(View view) {
        this.LLILZIL = view;
    }

    public final void setReportAdsFromXml(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setReportNormalFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setRightMenuFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setTitle(CharSequence charSequence) {
        getTitleFromXml().setText(charSequence);
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTitleWrap(InterfaceC1041830dDZ interfaceC1041830dDZ) {
        this.LLJI = interfaceC1041830dDZ;
    }

    public C1041540dD6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.biu, this, true);
        setBackgroundResource(R.drawable.cf9);
        setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
    }
}
