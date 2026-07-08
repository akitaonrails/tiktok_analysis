package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

/* JADX INFO: renamed from: X.19gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21601919gP extends ViewGroup.LayoutParams {
    public boolean LIZ;
    public final int LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;

    public C21601919gP() {
        super(-1, -1);
    }

    public C21601919gP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.a);
        this.LIZIZ = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
