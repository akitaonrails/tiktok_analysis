package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195630hDd extends FrameLayout {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public final C19M4 LL;
    public View.OnClickListener LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C1195600hDa LLILZIL;

    public final void LIZIZ() {
        C1174900ggC c1174900ggC = this.LLILZIL.LIZLLL;
        if (c1174900ggC != null) {
            C1174890ggB.LIZ("ttls_viewall_click", this, c1174900ggC);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZIL.LIZ();
    }

    public final boolean getAutoReportViewAllShow() {
        return this.LLILZ;
    }

    public final void LIZ(C0V0O c0v0o) {
        setBackground(null);
        setPaddingRelative(0, 0, 0, 0);
        if (c0v0o instanceof C0V0N) {
            this.LL.setText(((C0V0N) c0v0o).LIZ);
            this.LL.setTuxFont(51);
            setTextColorByAttr(R.attr.a1j);
            LIZJ(R.raw.icon_chevron_right_slim_thin_ltr, R.attr.a1j, LLJ, LLJI);
            return;
        }
        if (c0v0o instanceof C0V0M) {
            this.LL.setText(((C0V0M) c0v0o).LIZ);
            this.LL.setTuxFont(51);
            setTextColorByAttr(R.attr.a1h);
            LIZJ(R.raw.icon_chevron_right_slim_thin_ltr, R.attr.a1h, LLJ, LLJI);
            setPaddingRelative(0, LLILZLL, 0, LLIZLLLIL);
            return;
        }
        if (c0v0o instanceof C0V0P) {
            C0V0P c0v0p = (C0V0P) c0v0o;
            this.LL.setText(c0v0p.LIZ);
            this.LL.setTuxFont(51);
            setTextColorByAttr(R.attr.a1h);
            int i = LLJIJIL;
            LIZJ(R.raw.icon_chevron_down_thin, R.attr.a1h, i, i);
            setBackground(c0v0p.LIZIZ);
            setPaddingRelative(0, LLIZ, 0, LLIZLLLIL);
            return;
        }
        throw new C1954807lC();
    }

    public final void LIZLLL(CharSequence charSequence) {
        this.LL.setText(charSequence);
    }

    public final void setAutoReportViewAllShow(boolean z) {
        this.LLILZ = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        ACListenerS153S0100000_18 aCListenerS153S0100000_18;
        this.LLILLJJLI = onClickListener;
        if (onClickListener == null) {
            aCListenerS153S0100000_18 = null;
        } else {
            aCListenerS153S0100000_18 = new ACListenerS153S0100000_18(this, 131);
        }
        super.setOnClickListener(aCListenerS153S0100000_18);
    }

    public final void setTextColorByAttr(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LL.setTextColor(numLIZJ.intValue());
        }
    }

    public final void setTrackParams(C1174900ggC c1174900ggC) {
        C1195600hDa c1195600hDa = this.LLILZIL;
        c1195600hDa.LIZLLL = c1174900ggC;
        c1195600hDa.LIZ();
    }

    public C1195630hDd(Context context, AttributeSet attributeSet) {
        int i;
        C0V0O c0v0m;
        super(context, attributeSet, 0);
        this.LLILZ = true;
        this.LLILZIL = new C1195600hDa(this, EnumC1195620hDc.VIEW_MORE_BUTTON, new C1175160ggc(this));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dk0, this, true);
        C19M4 c19m4 = (C19M4) findViewById(R.id.nt9);
        this.LL = c19m4;
        if (C444960Hcc.LIZJ(context)) {
            i = 4;
        } else {
            i = 3;
        }
        c19m4.setTextDirection(i);
        c19m4.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LsViewMoreButton, 0, 0);
        try {
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LsViewMoreButton_lsViewMoreButtonText);
            strXd = strXd == null ? "" : strXd;
            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.LsViewMoreButton_lsViewMoreButtonStyle, 0);
            if (i2 != 1) {
                if (i2 != 2) {
                    c0v0m = new C0V0N(strXd);
                } else {
                    Drawable background = getBackground();
                    c0v0m = new C0V0P(strXd, background == null ? C420950Gez.LIZ(context) : background);
                }
            } else {
                c0v0m = new C0V0M(strXd);
            }
            typedArrayObtainStyledAttributes.recycle();
            LIZ(c0v0m);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (isShown()) {
            this.LLILZIL.LIZ();
        }
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        C19M4 c19m4 = this.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(i2, getContext());
        c419910GdJ.LIZIZ = i3;
        c419910GdJ.LIZJ = i4;
        c19m4.setEndIcon(c419910GdJ);
    }
}
