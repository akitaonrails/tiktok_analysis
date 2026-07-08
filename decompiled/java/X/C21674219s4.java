package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: renamed from: X.19s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21674219s4 extends C21674119s3 {
    public final C01GW LJIILL;
    public float LJIILLIIL;

    public C21674219s4(Context context) {
        super(context);
        this.LJIILL = C452501pT.LIZIZ(new AwS423S0200000_22(this, context, 59));
        this.LJIILLIIL = 1.0f;
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        return (int) Math.ceil(Math.abs(i) * this.LJIILLIIL);
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        int width;
        RecyclerView.LayoutManager layoutManager = this.LIZJ;
        int height = 0;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - marginLayoutParams.leftMargin;
            int decoratedRight = layoutManager.getDecoratedRight(view) + marginLayoutParams.rightMargin;
            int paddingLeft = layoutManager.getPaddingLeft();
            width = ((int) (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - paddingLeft) / 2.0f)) - (decoratedLeft + ((int) ((decoratedRight - decoratedLeft) / 2.0f)));
        } else {
            width = 0;
        }
        RecyclerView.LayoutManager layoutManager2 = this.LIZJ;
        if (layoutManager2 != null && layoutManager2.canScrollVertically()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int decoratedTop = layoutManager2.getDecoratedTop(view) - marginLayoutParams2.topMargin;
            int decoratedBottom = layoutManager2.getDecoratedBottom(view) + marginLayoutParams2.bottomMargin;
            int paddingTop = layoutManager2.getPaddingTop();
            height = ((int) (((layoutManager2.getHeight() - layoutManager2.getPaddingBottom()) - paddingTop) / 2.0f)) - (decoratedTop + ((int) ((decoratedBottom - decoratedTop) / 2.0f)));
        }
        float f = width;
        float f2 = f * 1.0f * f;
        float f3 = height;
        int iLJIIL = LJIIL((int) Math.sqrt(f2 + (1.0f * f3 * f3)));
        if (iLJIIL > 0) {
            c21675319sF.LIZIZ(-width, -height, this.LJIIIIZZ, iLJIIL);
        }
    }
}
