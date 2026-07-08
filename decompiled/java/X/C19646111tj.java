package X;

import Y.ACListenerS130S0200000_28;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19646111tj extends ConstraintLayout {
    public static final /* synthetic */ int LLJJIII = 0;
    public Drawable LL;
    public Drawable LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final View LLILZIL;
    public final RemoteImageView LLILZLL;
    public final C19655911vJ LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final TuxTextView LLJIJIL;
    public final View LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxTextView LLJJ;
    public final TuxTextView LLJJI;

    public final void i0() {
        Integer numLIZJ;
        setEnabled(false);
        C19655911vJ c19655911vJ = this.LLIZ;
        c19655911vJ.setEnabled(false);
        Context context = c19655911vJ.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
            c19655911vJ.setTextColor(numLIZJ.intValue());
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19655911vJ);
            c19655911vJ.setAlpha(0.13f);
        }
    }

    public final View getBtnPreviewLink() {
        return this.LLJILJIL;
    }

    public final C19655911vJ getEditor() {
        return this.LLIZ;
    }

    public final TuxIconView getEndIcon() {
        return this.LLILZ;
    }

    public final View getInputContainer() {
        return this.LLILZIL;
    }

    public final Drawable getInputDefaultBackground() {
        return this.LL;
    }

    public final TuxTextView getInputEndAction() {
        return this.LLJIJIL;
    }

    public final Drawable getInputErrorBackground() {
        return this.LLILLJJLI;
    }

    public final TuxTextView getTvSubTitle() {
        return this.LLJJI;
    }

    public final TuxTextView getTvTitle() {
        return this.LLILLL;
    }

    @InterfaceC1294060jmO
    public final void setErrorMsg(String str) {
        j0(EnumC1153550g7l.ERROR, str, false);
    }

    public final void setInputDefaultBackground(Drawable drawable) {
        this.LL = drawable;
    }

    public final void setInputErrorBackground(Drawable drawable) {
        this.LLILLJJLI = drawable;
    }

    public final void setState(EnumC19646311tl enumC19646311tl) {
        this.LLILZIL.setBackground(this.LL);
        C995130c0F.LIZLLL(this.LLIZLLLIL, false);
        C995130c0F.LIZLLL(this.LLJ, false);
        C995130c0F.LIZLLL(this.LLJI, false);
        int i = C19646211tk.LIZ[enumC19646311tl.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C995130c0F.LIZLLL(this.LLJI, true);
                        this.LLILZIL.setBackground(this.LLILLJJLI);
                        return;
                    }
                    return;
                }
                C995130c0F.LIZLLL(this.LLIZLLLIL, true);
                return;
            }
            C995130c0F.LIZLLL(this.LLJ, true);
            return;
        }
        C995130c0F.LIZLLL(this.LLJI, true);
    }

    @InterfaceC1294060jmO
    public final void setWarningMsg(String str) {
        j0(EnumC1153550g7l.WARNING, str, false);
    }

    public C19646111tj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C800330VaR.LIZIZ(context, R.drawable.cpt);
        this.LLILLJJLI = C800330VaR.LIZIZ(context, R.drawable.cps);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dsy, this, true);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tv_title);
        this.LLILZ = (TuxIconView) viewTd.findViewById(R.id.h4q);
        this.LLILZLL = (RemoteImageView) viewTd.findViewById(R.id.lll);
        this.LLIZ = (C19655911vJ) viewTd.findViewById(R.id.gt_);
        this.LLILZIL = viewTd.findViewById(R.id.kqm);
        this.LLIZLLLIL = viewTd.findViewById(R.id.jvj);
        this.LLJ = viewTd.findViewById(R.id.jwd);
        View viewFindViewById = viewTd.findViewById(R.id.coo);
        C786410Ut5.I7(new ACListenerS130S0200000_28(this, context, 30), viewFindViewById);
        this.LLJI = viewFindViewById;
        this.LLJIJIL = (TuxTextView) viewTd.findViewById(R.id.zr1);
        this.LLJJI = (TuxTextView) viewTd.findViewById(R.id.tv_sub_title);
        this.LLJILJIL = viewTd.findViewById(R.id.ctk);
        this.LLJILJILJ = (TuxIconView) viewTd.findViewById(R.id.k26);
        this.LLJILLL = (TuxTextView) viewTd.findViewById(R.id.zy3);
        this.LLJJ = (TuxTextView) viewTd.findViewById(R.id.zpk);
        setState(EnumC19646311tl.NONE);
    }

    public final void h0(final int i, final boolean z) {
        TuxTextView tuxTextView = this.LLJJ;
        C995130c0F.LIZLLL(tuxTextView, true);
        tuxTextView.setText(e0(String.valueOf(C2204961BRm.c(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTU5qLglE6Or4xDtyojXJOk7czBAhz04UHJyiKMPJvVp53n6GUxiu5iu", null))).length(), i, z));
        this.LLIZ.addTextChangedListener(new TextWatcher() { // from class: X.11tm
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C19646111tj c19646111tj = this.LL;
                c19646111tj.LLJJ.setText(c19646111tj.e0(String.valueOf(editable).length(), i, z));
            }
        });
    }

    public final CharSequence e0(int i, int i2, boolean z) {
        String strLIZIZ;
        int length;
        String strValueOf = String.valueOf(i);
        String strValueOf2 = String.valueOf(i2);
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        if (!C426750GoL.LIZLLL(C844470XAv.LIZ())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strValueOf);
            sbLIZ.append('/');
            sbLIZ.append(strValueOf2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strValueOf2);
            sbLIZ2.append('/');
            sbLIZ2.append(strValueOf);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (i > i2) {
            C444910HcX c444910HcX = new C444910HcX(strLIZIZ);
            c444910HcX.LIZ(61);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                int length2 = 0;
                if (z) {
                    C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(iIntValue), 0, strLIZIZ.length(), 17);
                } else {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
                    c844470XAv.getClass();
                    if (!(!C426750GoL.LIZLLL(C844470XAv.LIZ()))) {
                        length2 = strValueOf2.length() + 1;
                    }
                    c844470XAv.getClass();
                    if (!C426750GoL.LIZLLL(C844470XAv.LIZ())) {
                        length = strValueOf.length();
                    } else {
                        length = strLIZIZ.length();
                    }
                    C786410Ut5.s2(c444910HcX, foregroundColorSpan, length2, length, 18);
                    return c444910HcX;
                }
            }
            return c444910HcX;
        }
        return strLIZIZ;
    }

    public final void j0(EnumC1153550g7l enumC1153550g7l, String str, boolean z) {
        Integer numLIZJ;
        Drawable drawable;
        if (z) {
            View view = this.LLILZIL;
            if (enumC1153550g7l == EnumC1153550g7l.ERROR && str != null && (!a0.LJJJIL(str))) {
                drawable = this.LLILLJJLI;
            } else {
                drawable = this.LL;
            }
            view.setBackground(drawable);
        }
        if (enumC1153550g7l == EnumC1153550g7l.ERROR) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, getContext());
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        }
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            boolean zLJ = C1533950q1J.LJ(str);
            TuxTextView tuxTextView = this.LLJILLL;
            C995130c0F.LIZLLL(tuxTextView, zLJ);
            tuxTextView.setText(str);
            tuxTextView.setTextColor(iIntValue);
            TuxIconView tuxIconView = this.LLJILJILJ;
            C995130c0F.LIZLLL(tuxIconView, zLJ);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_exclamation_mark_triangle_inline;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZLLL = Integer.valueOf(iIntValue);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }
}
