package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748300vb2 extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final CharSequence LLILLL;
    public final String LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final FrameLayout LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public TuxIconView LLJI;
    public View.OnClickListener LLJIJIL;

    public C1748300vb2(Context context) {
        super(context, null, R.attr.xx);
        FrameLayout.inflate(context, R.layout.g5, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxFieldHeader, R.attr.xx, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldHeader__tux_fieldHeaderNameColor, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFieldHeader__tux_fieldHeaderNameFont, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldHeader__tux_fieldHeaderRequiredColor, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFieldHeader__tux_fieldHeaderRequiredFont, 0);
        this.LL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldHeader__tux_fieldHeaderInfoColor, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFieldHeader__tux_fieldHeaderInfoIcon, 0);
        this.LLILLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxFieldHeader__tux_fieldHeaderInfoLabel);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldHeader__tux_fieldHeaderOptionalColor, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFieldHeader__tux_fieldHeaderOptionalFont, 0);
        this.LLILZ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxFieldHeader__tux_fieldHeaderOptionalText);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldHeader__tux_fieldHeaderDescriptionColor, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFieldHeader__tux_fieldHeaderDescriptionFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.hws);
        tuxTextView.setTextColor(color);
        tuxTextView.setTuxFont(i);
        tuxTextView.setMinTextSize(15.0f);
        this.LLILZIL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.hwu);
        tuxTextView2.setTextColor(color2);
        tuxTextView2.setTuxFont(i2);
        this.LLILZLL = tuxTextView2;
        this.LLIZ = (FrameLayout) findViewById(R.id.hwr);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.hwt);
        tuxTextView3.setTextColor(color3);
        tuxTextView3.setTuxFont(i3);
        this.LLIZLLLIL = tuxTextView3;
        TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.hwq);
        tuxTextView4.setTextColor(color4);
        tuxTextView4.setTuxFont(i4);
        this.LLJ = tuxTextView4;
    }

    private final void setCustomInfoIcon(View view) {
        this.LLJI = null;
        LIZ(view);
    }

    public final void LIZ(View view) {
        C786410Ut5.LJJJJIZL(this.LLIZ);
        if (view != null) {
            C786410Ut5.I7(new ACListenerS160S0100000_26(this, 88), view);
            this.LLIZ.addView(view);
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLIZ);
    }

    public final void setDescription(CharSequence charSequence) {
        this.LLJ.setText(charSequence);
        TuxTextView tuxTextView = this.LLJ;
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
    }

    public final void setHasRequiredMark(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LLILZLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
    }

    public final void setInfoIcon(InterfaceC1183104k1 interfaceC1183104k1) {
        if (interfaceC1183104k1 == null) {
            this.LLJI = null;
            LIZ(null);
        } else if (Intrinsics.LJFF(interfaceC1183104k1, C958803ow.LIZ)) {
            LIZIZ(this.LLILLJJLI, this.LLILLL);
        } else if (interfaceC1183104k1 instanceof C1183004k0) {
            LIZIZ(0, null);
        } else {
            if (interfaceC1183104k1 instanceof C1182304jt) {
                setCustomInfoIcon(null);
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void setInfoIconClickListener(View.OnClickListener onClickListener) {
        this.LLJIJIL = onClickListener;
    }

    public final void setName(CharSequence charSequence) {
        this.LLILZIL.setText(charSequence);
        this.LLILZIL.requestLayout();
    }

    public final void setOptionalText(InterfaceC1748310vb3 interfaceC1748310vb3) {
        if (interfaceC1748310vb3 == null) {
            this.LLIZLLLIL.setText((CharSequence) null);
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
        } else if (Intrinsics.LJFF(interfaceC1748310vb3, new InterfaceC1748310vb3() { // from class: X.0vb4
        })) {
            this.LLIZLLLIL.setText(this.LLILZ);
            C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
        } else {
            if (interfaceC1748310vb3 instanceof C049100Ft) {
                this.LLIZLLLIL.setText((CharSequence) null);
                C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void LIZIZ(int i, CharSequence charSequence) {
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
            tuxIconView.setLabel(charSequence);
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        TuxIconView tuxIconView2 = new TuxIconView(getContext(), null, 0, 6, null);
        C786410Ut5.M6(tuxIconView2, new FrameLayout.LayoutParams((iLIZIZ2 * 2) + iLIZIZ, iLIZIZ));
        tuxIconView2.setPadding(iLIZIZ2, 0, iLIZIZ2, 0);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LIZLLL = Integer.valueOf(this.LL);
        c419910GdJ.LJI = charSequence;
        tuxIconView2.setTuxIcon(c419910GdJ);
        this.LLJI = tuxIconView2;
        LIZ(tuxIconView2);
    }
}
