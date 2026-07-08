package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19M8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19M8 extends View {
    public C21533419Oy LL;

    public final C21533419Oy getSkeletonElement() {
        return this.LL;
    }

    public final void setSkeletonElement(C21533419Oy c21533419Oy) {
        this.LL = c21533419Oy;
    }

    public C19M8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C21533419Oy();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.commerce_SkeletonView);
            this.LL.LIZLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_SkeletonView_commerce_skeleton_color1, -3355444);
            this.LL.LJ = typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_SkeletonView_commerce_skeleton_color2, -7829368);
            C21533419Oy c21533419Oy = this.LL;
            typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_SkeletonView_commerce_skeleton_color3, -3355444);
            c21533419Oy.getClass();
            this.LL.LIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_SkeletonView_commerce_skeleton_radius, 0);
            C21533419Oy c21533419Oy2 = this.LL;
            c21533419Oy2.LIZIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_SkeletonView_commerce_skeleton_radius_x, c21533419Oy2.LIZ);
            C21533419Oy c21533419Oy3 = this.LL;
            c21533419Oy3.LIZJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_SkeletonView_commerce_skeleton_radius_y, c21533419Oy3.LIZ);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
