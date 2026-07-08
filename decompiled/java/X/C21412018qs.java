package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.w;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21412018qs extends RadioButton implements InterfaceC21412618qy {
    public final C21412218qu LL;
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

    public ColorStateList getSupportButtonTintList() {
        C21412218qu c21412218qu = this.LL;
        if (c21412218qu != null) {
            return c21412218qu.LIZIZ;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C21412218qu c21412218qu = this.LL;
        if (c21412218qu != null) {
            return c21412218qu.LIZJ;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.LLILLL.LIZLLL();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.LLILLL.LJ();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.LLILLJJLI;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        w wVar = this.LLILLL;
        if (wVar != null) {
            wVar.LIZIZ();
        }
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C21412218qu c21412218qu = this.LL;
        if (c21412218qu != null) {
            if (c21412218qu.LJFF) {
                c21412218qu.LJFF = false;
            } else {
                c21412218qu.LJFF = true;
                c21412218qu.LIZ();
            }
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C21412218qu c21412218qu = this.LL;
        if (c21412218qu != null) {
            c21412218qu.LIZIZ = colorStateList;
            c21412218qu.LIZLLL = true;
            c21412218qu.LIZ();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C21412218qu c21412218qu = this.LL;
        if (c21412218qu != null) {
            c21412218qu.LIZJ = mode;
            c21412218qu.LJ = true;
            c21412218qu.LIZ();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C14MI.LIZ(getContext(), i));
    }

    public C21412018qs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.fdd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21412018qs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.LIZ(context);
        C786410Ut5.t3(getContext());
        C21412218qu c21412218qu = new C21412218qu(this);
        this.LL = c21412218qu;
        c21412218qu.LIZIZ(attributeSet, i);
        C21411318ql c21411318ql = new C21411318ql(this);
        this.LLILLJJLI = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        this.LLILLL = new w(this);
        this.LLILLL.LJFF(attributeSet, i);
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
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
