package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749140vcO extends LinearLayout implements InterfaceC1237410iJ1 {
    public InterfaceC1237370iIx LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public int LLILZIL;
    public final boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public int LLJIJIL;
    public CharSequence LLJILJIL;
    public CharSequence LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public final int LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;

    public C1749140vcO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC1237410iJ1
    public final void LIZ() {
    }

    public final void LIZIZ() {
        if (this.LLJILLL) {
            setBackground(null);
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(this.LLJJIJI);
        c384050F3z.LIZJ = Float.valueOf(this.LLJ);
        setBackground(c384050F3z.LIZ(getContext()));
    }

    public final void LIZJ() {
        TuxIconView tuxIconView = this.LLILZ;
        if (this.LLILZIL == 0) {
            if (tuxIconView != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, tuxIconView);
                removeView(tuxIconView);
                return;
            }
            return;
        }
        if (!(tuxIconView instanceof TuxIconView)) {
            if (tuxIconView != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, tuxIconView);
                removeView(tuxIconView);
            }
            tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            addView(tuxIconView, 0);
            this.LLILZ = tuxIconView;
        } else if (tuxIconView.getParent() == null) {
            addView(tuxIconView, 0);
        }
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        int i = this.LLJI;
        layoutParams.width = i;
        layoutParams.height = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LLILZIL;
        int i2 = this.LLJIJIL;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        c419910GdJ.LIZLLL = Integer.valueOf(this.LLJJIJIIJIL);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public final void LIZLLL() {
        CharSequence charSequence = this.LLJILJILJ;
        if (charSequence == null || charSequence.length() <= 0) {
            this.LLILLJJLI.setText(this.LLJILJIL);
            this.LLILLJJLI.setTextColor(this.LLJJI);
        } else {
            this.LLILLJJLI.setText(this.LLJILJILJ);
            this.LLILLJJLI.setTextColor(this.LLJJIII);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (this.LLILZLL) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(f);
        }
    }

    public final void setEndIcon(int i) {
        TuxIconView tuxIconView = this.LLILLL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZLLL = Integer.valueOf(this.LLJJIJIL);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public final void setInlineMode(boolean z) {
        this.LLJILLL = z;
        if (z) {
            C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, 26);
            LIZIZ();
            if (this.LLJILLL) {
                setForeground(null);
                C427690Gpr.LJI(this, null);
                return;
            } else {
                setOnTouchListener(null);
                C427690Gpr.LJ(this, this.LLJ);
                return;
            }
        }
        setSizeVariant(this.LLJJ);
    }

    public final void setPlaceholderText(CharSequence charSequence) {
        this.LLJILJIL = charSequence;
        LIZLLL();
    }

    public final void setSizeVariant(int i) {
        C1749150vcP c1749150vcP;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1749150vcP = new C1749150vcP(28, 4, 14, 14, 51, 4);
                    } else {
                        return;
                    }
                } else {
                    c1749150vcP = new C1749150vcP(32, 6, 18, 16, 41, 6);
                }
            } else {
                c1749150vcP = new C1749150vcP(40, 8, 22, 20, 101, 8);
            }
            if (c1749150vcP == null) {
                return;
            }
        } else {
            c1749150vcP = new C1749150vcP(48, 12, 24, 20, 101, 10);
        }
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1749150vcP.LIZ)));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1749150vcP.LIZIZ)));
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1749150vcP.LIZJ)));
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1749150vcP.LIZLLL)));
        this.LLIZLLLIL = c1749150vcP.LJ;
        this.LLJ = C418440Gaw.LIZIZ(Integer.valueOf(c1749150vcP.LJFF));
        this.LLJJ = i;
        this.LLILLJJLI.setTuxFont(this.LLIZLLLIL);
        LIZJ();
        LIZIZ();
        if (this.LLJILLL) {
            setForeground(null);
            C427690Gpr.LJI(this, null);
        } else {
            setOnTouchListener(null);
            C427690Gpr.LJ(this, this.LLJ);
        }
        requestLayout();
    }

    public final void setStartIcon(int i) {
        this.LLILZIL = i;
        LIZJ();
    }

    public final void setText(CharSequence charSequence) {
        this.LLJILJILJ = charSequence;
        LIZLLL();
    }

    @Override // X.InterfaceC1237410iJ1
    public void setTuxFieldContentCallback(InterfaceC1237370iIx interfaceC1237370iIx) {
        this.LL = interfaceC1237370iIx;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLIZ;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1749140vcO(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yp;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSelectField, i2, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxSelectField_tux_selectFieldSizeVariant, 0);
        this.LLJILJIL = C786410Ut5.Yd(typedArrayObtainStyledAttributes, R$styleable.TuxSelectField_tux_selectFieldPlaceholderText);
        this.LLJJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSelectField__tux_selectFieldPlaceholderTextColor, 0);
        this.LLJILJILJ = C786410Ut5.Yd(typedArrayObtainStyledAttributes, R$styleable.TuxSelectField_tux_selectFieldText);
        this.LLJJIII = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSelectField__tux_selectFieldTextColor, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSelectField_tux_selectFieldStartIcon, 0);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSelectField__tux_selectFieldStartIconColor, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSelectField_tux_selectFieldEndIcon, 0);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSelectField_tux_selectFieldEndIconColor, 0);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSelectField__tux_selectFieldBackgroundColor, 0);
        typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSelectField__tux_selectFieldErrorColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZLL = true;
        setOrientation(0);
        setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLJJLI = tuxTextView;
        tuxTextView.setMinTextSize(13.0f);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTextDirection(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        layoutParams.weight = 1.0f;
        addView(tuxTextView, layoutParams);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LLILLL = tuxIconView;
        addView(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        LIZLLL();
        setEndIcon(resourceId);
        setSizeVariant(integer);
    }
}
