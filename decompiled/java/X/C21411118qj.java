package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.w;

/* JADX INFO: renamed from: X.18qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21411118qj extends MultiAutoCompleteTextView implements InterfaceC21412618qy {
    public static final int[] LLILZ = {R.attr.popupBackground};
    public final C21411318ql LL;
    public final w LLILLJJLI;
    public final C21401818pE LLILLL;

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.LLILLJJLI.LIZLLL();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.LLILLJJLI.LJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C21412318qv.LIZ(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.LLILLL.LIZJ(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C14MI.LIZ(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.LLILLL.LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.LLILLL.LIZ(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.LLILLJJLI.LJIIJ(colorStateList);
        this.LLILLJJLI.LIZIZ();
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.LLILLJJLI.LJIIJJI(mode);
        this.LLILLJJLI.LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21411118qj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zhiliaoapp.musically.R.attr.b_j);
        t0.LIZ(context);
        C786410Ut5.t3(getContext());
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(getContext(), attributeSet, LLILZ, com.zhiliaoapp.musically.R.attr.b_j, 0);
        if (c21411918qrLJIILIIL.LJIIJJI(0)) {
            setDropDownBackgroundDrawable(c21411918qrLJIILIIL.LJ(0));
        }
        c21411918qrLJIILIIL.LJIILJJIL();
        C21411318ql c21411318ql = new C21411318ql(this);
        this.LL = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, com.zhiliaoapp.musically.R.attr.b_j);
        w wVar = new w(this);
        this.LLILLJJLI = wVar;
        this.LLILLJJLI.LJFF(attributeSet, com.zhiliaoapp.musically.R.attr.b_j);
        wVar.LIZIZ();
        C21401818pE c21401818pE = new C21401818pE(this);
        this.LLILLL = c21401818pE;
        c21401818pE.LIZIZ(attributeSet, com.zhiliaoapp.musically.R.attr.b_j);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = isFocusable();
            boolean zIsClickable = isClickable();
            boolean zIsLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener keyListenerLIZ = c21401818pE.LIZ(keyListener);
            if (keyListenerLIZ != keyListener) {
                super.setKeyListener(keyListenerLIZ);
                setRawInputType(inputType);
                setFocusable(zIsFocusable);
                setClickable(zIsClickable);
                setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LJI(i, context);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }
}
