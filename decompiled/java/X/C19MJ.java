package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19MJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MJ extends C19MI {
    public int LIZIZ;

    public C19MJ() {
        this.LIZ = 8388627;
    }

    public C19MJ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public C19MJ(C19MJ c19mj) {
        super((C19MI) c19mj);
        this.LIZIZ = c19mj.LIZIZ;
    }

    public C19MJ(C19MI c19mi) {
        super(c19mi);
    }

    public C19MJ(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C19MJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
