package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749190vcT extends FrameLayout implements InterfaceC1237370iIx {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final C1754770vlT LLILZIL;
    public final FrameLayout LLILZLL;
    public final FrameLayout LLIZ;
    public final FrameLayout LLIZLLLIL;
    public EnumC1749210vcV LLJ;
    public boolean LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;

    public C1749190vcT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        EnumC1749210vcV enumC1749210vcV = this.LLJ;
        if (enumC1749210vcV == EnumC1749210vcV.FOOTER) {
            LIZLLL(null);
        } else if (enumC1749210vcV == EnumC1749210vcV.HEADER) {
            LJIIIIZZ(null);
        }
    }

    public final void LJI() {
        C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 8);
    }

    public final void LIZIZ(EnumC1749210vcV enumC1749210vcV) {
        if (this.LLJ != enumC1749210vcV) {
            int i = C1749200vcU.LIZ[enumC1749210vcV.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LIZ();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    LIZ();
                    C1749220vcW c1749220vcW = new C1749220vcW(getContext());
                    c1749220vcW.setErrorColor(this.LLJIJIL);
                    LJIIIIZZ(c1749220vcW);
                }
            } else {
                LIZ();
                C1749220vcW c1749220vcW2 = new C1749220vcW(getContext());
                c1749220vcW2.setErrorColor(this.LLJIJIL);
                LIZLLL(c1749220vcW2);
            }
            this.LLJ = enumC1749210vcV;
        }
    }

    public final void LIZJ(CharSequence charSequence) {
        boolean z;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "*").append(charSequence);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = this.LLJILJIL;
            c419910GdJ.LIZLLL = Integer.valueOf(this.LLJIJIL);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, getContext());
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            c419890GdHLIZIZ.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), z);
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
            this.LLILZ.setText(spannableStringBuilder);
            C1754770vlT c1754770vlT = this.LLILZIL;
            int visibility = c1754770vlT.getVisibility();
            c1754770vlT.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1754770vlT);
            return;
        }
        this.LLILZ.setText((CharSequence) null);
        C1754770vlT c1754770vlT2 = this.LLILZIL;
        int visibility2 = c1754770vlT2.getVisibility();
        c1754770vlT2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c1754770vlT2);
    }

    public final void LIZLLL(TuxTextView tuxTextView) {
        C786410Ut5.LJJJJIZL(this.LLIZLLLIL);
        if (tuxTextView != null) {
            this.LLIZLLLIL.addView(tuxTextView);
        }
        this.LLJJI = tuxTextView;
        KeyEvent.Callback callback = this.LLJJIII;
        if (callback instanceof InterfaceC1237410iJ1) {
            ((InterfaceC1237410iJ1) callback).LIZ();
        }
    }

    public final void LJ(CharSequence charSequence) {
        if (charSequence != null && ((String) charSequence).length() > 0) {
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            tuxTextView.setTuxFont(this.LLJILJILJ);
            tuxTextView.setTextColor(this.LLJILLL);
            tuxTextView.setText(charSequence);
            C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
            LIZLLL(tuxTextView);
            return;
        }
        C786410Ut5.LJJJJIZL(this.LLIZLLLIL);
    }

    public final void LJFF(boolean z) {
        if (this.LLJI) {
            if (!z) {
                C1754770vlT c1754770vlT = this.LLILZIL;
                c1754770vlT.LLILLJJLI.reverse();
                c1754770vlT.LLILZIL = true;
            }
        } else if (z) {
            C1754770vlT c1754770vlT2 = this.LLILZIL;
            c1754770vlT2.LLILLJJLI.start();
            c1754770vlT2.LLILZIL = false;
        }
        this.LLJI = z;
    }

    public final void LJII(CharSequence charSequence) {
        LJIIIZ(this.LL, charSequence);
    }

    public final void LJIIIIZZ(C1749220vcW c1749220vcW) {
        C786410Ut5.LJJJJIZL(this.LLILZLL);
        if (c1749220vcW != null) {
            this.LLILZLL.addView(c1749220vcW);
        }
        this.LLJJ = c1749220vcW;
        KeyEvent.Callback callback = this.LLJJIII;
        if (callback instanceof InterfaceC1237410iJ1) {
            ((InterfaceC1237410iJ1) callback).LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFormField(View view) {
        C786410Ut5.LJJJJIZL(this.LLIZ);
        if (view != 0) {
            this.LLIZ.addView(view);
            if (view instanceof InterfaceC1237410iJ1) {
                ((InterfaceC1237410iJ1) view).setTuxFieldContentCallback(this);
            }
        }
        this.LLJJIII = view;
    }

    public static void LJIIIZ(TuxTextView tuxTextView, CharSequence charSequence) {
        tuxTextView.setText(charSequence);
        int i = 0;
        if (charSequence == null || charSequence.length() <= 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }

    @Override // X.InterfaceC1237370iIx
    public final void LJJII(int i, CharSequence charSequence) {
        KeyEvent.Callback callback = this.LLJJ;
        if (callback != null && (callback instanceof InterfaceC1237370iIx)) {
            ((InterfaceC1237370iIx) callback).LJJII(i, charSequence);
        }
        KeyEvent.Callback callback2 = this.LLJJI;
        if (callback2 != null && (callback2 instanceof InterfaceC1237370iIx)) {
            ((InterfaceC1237370iIx) callback2).LJJII(i, charSequence);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1749190vcT(Context context, AttributeSet attributeSet, int i) {
        int i2;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.y0;
        } else {
            i2 = 0;
        }
        super(context, attributeSet2, i2);
        this.LLJ = EnumC1749210vcV.NONE;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g9, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.z0i);
        this.LL = tuxTextView;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.z0g);
        this.LLILLJJLI = tuxIconView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.z0h);
        this.LLILLL = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.z0e);
        this.LLILZ = tuxTextView3;
        C1754770vlT c1754770vlT = (C1754770vlT) findViewById(R.id.hga);
        this.LLILZIL = c1754770vlT;
        this.LLILZLL = (FrameLayout) findViewById(R.id.z0j);
        this.LLIZ = (FrameLayout) findViewById(R.id.z0d);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.z0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.TuxFormView, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFormView__tux_formTitleColor, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formTitleFont, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFormView__tux_formInfoIcon, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formInfoIconColor, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formSubtitleColor, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formSubtitleFont, 0);
        int i7 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formErrorMessageFont, 0);
        int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formErrorMessageColor, 0);
        this.LLJIJIL = i8;
        this.LLJILJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFormView__tux_formErrorIcon, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formFooterTextFont, 0);
        this.LLJILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFormView__tux_formFooterTextColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTuxFont(i3);
        tuxTextView.setTextColor(color);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        tuxIconView.setIconRes(resourceId);
        tuxIconView.setTintColor(i4);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxTextView2.setTuxFont(i6);
        tuxTextView2.setTextColor(i5);
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
        tuxTextView3.setTuxFont(i7);
        tuxTextView3.setTextColor(i8);
        int visibility = c1754770vlT.getVisibility();
        c1754770vlT.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1754770vlT);
    }
}
