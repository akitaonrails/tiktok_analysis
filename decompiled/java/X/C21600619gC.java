package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19gC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21600619gC extends ViewGroup.LayoutParams {
    public boolean LIZ;
    public final int LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;

    public C21600619gC() {
        super(-1, -1);
    }

    public C21600619gC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21600219g8.LLLLLLZ);
        this.LIZIZ = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
