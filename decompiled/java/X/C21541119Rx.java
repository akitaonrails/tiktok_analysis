package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21541119Rx extends C19V8 {
    public Integer LLLIL;

    @Override // X.C19V8, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZJ(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C21539119Rd.LIZIZ(this, f);
    }

    @Override // X.C19V8
    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.LLLIL) != null) {
            C16GF.LJI(drawable, num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.LLLIL = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public C21541119Rx(Context context, AttributeSet attributeSet) {
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.fuo, R.style.a6l), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.MaterialToolbar, R.attr.fuo, R.style.a6l, new int[0]);
        if (typedArrayLIZLLL.hasValue(R$styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayLIZLLL.getColor(R$styleable.MaterialToolbar_navigationIconTint, -1));
        }
        typedArrayLIZLLL.recycle();
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        C21538919Rb c21538919Rb = new C21538919Rb();
        c21538919Rb.LJIIJJI(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
        c21538919Rb.LJIIIIZZ(context2);
        c21538919Rb.LJIIJ(C14K9.LJIIIIZZ(this));
        setBackground(c21538919Rb);
    }
}
