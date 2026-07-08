package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679690QlL extends AbstractC679700QlM {
    public final TuxTextView LL;
    public final LinearLayoutCompat LLILLJJLI;
    public final C1390410mHn LLILLL;
    public final EnumC438650HHz LLILZ;
    public CharSequence LLILZIL;
    public CharSequence LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public MovementMethod LLJIJIL;
    public MovementMethod LLJILJIL;
    public View.OnClickListener LLJILJILJ;
    public View.OnClickListener LLJILLL;

    public final void LIZ() {
        C1390410mHn c1390410mHn = this.LLILLL;
        if (c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        C786410Ut5.LLLZZIL(this.LLILLL, 8);
        LIZLLL(this.LLILZLL, this.LLJILJIL, this.LLJILLL, this.LLJI, this.LLJ);
    }

    public final void LIZIZ() {
        C786410Ut5.LLILLIZIL(this.LLILLJJLI, 8);
        C786410Ut5.LLLZZIL(this.LLILLL, 0);
        this.LLILLL.LIZJ();
    }

    public final MovementMethod getEmptyMovementMethod() {
        return this.LLJIJIL;
    }

    public final View.OnClickListener getEmptyOnClickListener() {
        return this.LLJILJILJ;
    }

    public final CharSequence getEmptyText() {
        return this.LLILZIL;
    }

    public final int getEmptyTextColor() {
        return this.LLIZ;
    }

    public final int getEmptyTextFont() {
        return this.LLIZLLLIL;
    }

    public final MovementMethod getErrorMovementMethod() {
        return this.LLJILJIL;
    }

    public final View.OnClickListener getErrorOnClickListener() {
        return this.LLJILLL;
    }

    public final CharSequence getErrorText() {
        return this.LLILZLL;
    }

    public final int getErrorTextColor() {
        return this.LLJ;
    }

    public final int getErrorTextFont() {
        return this.LLJI;
    }

    @Override // X.AbstractC679700QlM
    public EnumC438650HHz getVariant() {
        return this.LLILZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C679690QlL(final Context context) {
        final AttributeSet attributeSet = null;
        final int i = R.attr.yy;
        new LinearLayout(context, attributeSet, i) { // from class: X.0QlM
            public abstract EnumC438650HHz getVariant();
        };
        this.LLILZ = EnumC438650HHz.STATUS;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gq, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.olu);
        this.LL = tuxTextView;
        this.LLILLJJLI = (LinearLayoutCompat) findViewById(R.id.okr);
        this.LLILLL = (C1390410mHn) findViewById(R.id.nle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxStatusFooter, R.attr.yy, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxStatusFooter__tux_tableFooterStatusEmptyTextColor, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusFooter__tux_tableFooterStatusEmptyTextFont, 0);
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxStatusFooter__tux_tableFooterStatusErrorTextColor, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusFooter__tux_tableFooterStatusErrorTextFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }

    public final void LIZJ(boolean z) {
        C1390410mHn c1390410mHn = this.LLILLL;
        if (c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        C786410Ut5.LLLZZIL(this.LLILLL, 8);
        if (!z) {
            LIZLLL(this.LLILZIL, this.LLJIJIL, this.LLJILJILJ, this.LLIZLLLIL, this.LLIZ);
        } else {
            C786410Ut5.LLILLIZIL(this.LLILLJJLI, 8);
        }
    }

    public final void setEmptyMovementMethod(MovementMethod movementMethod) {
        this.LLJIJIL = movementMethod;
    }

    public final void setEmptyOnClickListener(View.OnClickListener onClickListener) {
        this.LLJILJILJ = onClickListener;
    }

    public final void setEmptyText(CharSequence charSequence) {
        this.LLILZIL = charSequence;
    }

    public final void setEmptyTextColor(int i) {
        this.LLIZ = i;
    }

    public final void setEmptyTextFont(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setErrorMovementMethod(MovementMethod movementMethod) {
        this.LLJILJIL = movementMethod;
    }

    public final void setErrorOnClickListener(View.OnClickListener onClickListener) {
        this.LLJILLL = onClickListener;
    }

    public final void setErrorText(CharSequence charSequence) {
        this.LLILZLL = charSequence;
    }

    public final void setErrorTextColor(int i) {
        this.LLJ = i;
    }

    public final void setErrorTextFont(int i) {
        this.LLJI = i;
    }

    public final void LIZLLL(CharSequence charSequence, MovementMethod movementMethod, View.OnClickListener onClickListener, int i, int i2) {
        if (charSequence != null) {
            TuxTextView tuxTextView = this.LL;
            tuxTextView.setText(charSequence);
            tuxTextView.setTuxFont(i);
            tuxTextView.setTextColor(i2);
            tuxTextView.setMovementMethod(movementMethod);
            C786410Ut5.h9(tuxTextView, onClickListener);
            if (onClickListener == null) {
                tuxTextView.setOnTouchListener(null);
            } else {
                C427690Gpr.LJI(tuxTextView, null);
            }
            C786410Ut5.LLILLIZIL(this.LLILLJJLI, 0);
            return;
        }
        C786410Ut5.LLILLIZIL(this.LLILLJJLI, 8);
    }
}
