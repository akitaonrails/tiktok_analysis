package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;

/* JADX INFO: renamed from: X.19dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21586619dw extends ViewGroup.MarginLayoutParams {
    public final int LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public C21586619dw() {
        super(-1, -1);
    }

    public C21586619dw(C21586619dw c21586619dw) {
        super((ViewGroup.MarginLayoutParams) c21586619dw);
        this.LIZ = c21586619dw.LIZ;
    }

    public C21586619dw(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C21586619dw(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C21586619dw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LLJLILLLLZIIL);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
