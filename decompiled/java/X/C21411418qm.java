package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.w;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.18qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21411418qm extends CheckedTextView implements InterfaceC21412618qy {
    public final C21411618qo LL;
    public final C21411318ql LLILLJJLI;
    public final w LLILLL;
    public C21402418pK LLILZ;

    private C21402418pK getEmojiTextViewHelper() {
        if (this.LLILZ == null) {
            this.LLILZ = new C21402418pK(this);
        }
        return this.LLILZ;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C21411618qo c21411618qo = this.LL;
        if (c21411618qo != null) {
            return c21411618qo.LIZIZ;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C21411618qo c21411618qo = this.LL;
        if (c21411618qo != null) {
            return c21411618qo.LIZJ;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.LLILLL.LIZLLL();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.LLILLL.LJ();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.LLILLL;
        if (wVar != null) {
            wVar.LIZIZ();
        }
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        C21411618qo c21411618qo = this.LL;
        if (c21411618qo != null) {
            c21411618qo.LIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C21382118m3.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C21412318qv.LIZ(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C21411618qo c21411618qo = this.LL;
        if (c21411618qo != null) {
            if (c21411618qo.LJFF) {
                c21411618qo.LJFF = false;
            } else {
                c21411618qo.LJFF = true;
                c21411618qo.LIZ();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C21382118m3.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C21411618qo c21411618qo = this.LL;
        if (c21411618qo != null) {
            c21411618qo.LIZIZ = colorStateList;
            c21411618qo.LIZLLL = true;
            c21411618qo.LIZ();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C21411618qo c21411618qo = this.LL;
        if (c21411618qo != null) {
            c21411618qo.LIZJ = mode;
            c21411618qo.LJ = true;
            c21411618qo.LIZ();
        }
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.LLILLL.LJIIJ(colorStateList);
        this.LLILLL.LIZIZ();
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.LLILLL.LJIIJJI(mode);
        this.LLILLL.LIZIZ();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C14MI.LIZ(getContext(), i));
    }

    public C21411418qm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bg5);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.LLILLL;
        if (wVar != null) {
            wVar.LJI(i, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21411418qm(Context context, AttributeSet attributeSet, int i) {
        int iLJIIIIZZ;
        int iLJIIIIZZ2;
        super(context, attributeSet, i);
        t0.LIZ(context);
        C786410Ut5.t3(getContext());
        w wVar = new w(this);
        this.LLILLL = wVar;
        this.LLILLL.LJFF(attributeSet, i);
        wVar.LIZIZ();
        C21411318ql c21411318ql = new C21411318ql(this);
        this.LLILLJJLI = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        C21411618qo c21411618qo = new C21411618qo(this);
        this.LL = c21411618qo;
        Context context2 = getContext();
        int[] iArr = R$styleable.CheckedTextView;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context2, attributeSet, iArr, i, 0);
        q0.LJIIZILJ(this, getContext(), iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        try {
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CheckedTextView_checkMarkCompat) && (iLJIIIIZZ2 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(C14MI.LIZ(getContext(), iLJIIIIZZ2));
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CheckedTextView_android_checkMark)) {
                        CheckedTextView checkedTextView = c21411618qo.LIZ;
                        checkedTextView.setCheckMarkDrawable(C14MI.LIZ(checkedTextView.getContext(), iLJIIIIZZ));
                    }
                }
            } else if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CheckedTextView_android_checkMark) && (iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView2 = c21411618qo.LIZ;
                checkedTextView2.setCheckMarkDrawable(C14MI.LIZ(checkedTextView2.getContext(), iLJIIIIZZ));
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CheckedTextView_checkMarkTint)) {
                c21411618qo.LIZ.setCheckMarkTintList(c21411918qrLJIILIIL.LIZIZ(R$styleable.CheckedTextView_checkMarkTint));
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CheckedTextView_checkMarkTintMode)) {
                c21411618qo.LIZ.setCheckMarkTintMode(C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.CheckedTextView_checkMarkTintMode, -1), null));
            }
            c21411918qrLJIILIIL.LJIILJJIL();
            getEmojiTextViewHelper().LIZIZ(attributeSet, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c21411918qrLJIILIIL.LJIILJJIL();
            throw th;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLL;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLL;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }
}
