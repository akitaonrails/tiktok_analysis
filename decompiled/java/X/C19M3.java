package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19M3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19M3 extends C19ME {
    public final float LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;

    public C19M3(int i) {
        super(i, -2);
        this.LIZ = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 1.0f;
    }

    public C19M3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.ConstraintSet_android_alpha) {
                this.LIZ = typedArrayObtainStyledAttributes.getFloat(index, this.LIZ);
            } else if (index == R$styleable.ConstraintSet_android_elevation) {
                this.LIZJ = typedArrayObtainStyledAttributes.getFloat(index, this.LIZJ);
                this.LIZIZ = true;
            } else if (index == R$styleable.ConstraintSet_android_rotationX) {
                this.LJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJ);
            } else if (index == R$styleable.ConstraintSet_android_rotationY) {
                this.LJFF = typedArrayObtainStyledAttributes.getFloat(index, this.LJFF);
            } else if (index == R$styleable.ConstraintSet_android_rotation) {
                this.LIZLLL = typedArrayObtainStyledAttributes.getFloat(index, this.LIZLLL);
            } else if (index == R$styleable.ConstraintSet_android_scaleX) {
                this.LJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJI);
            } else if (index == R$styleable.ConstraintSet_android_scaleY) {
                this.LJII = typedArrayObtainStyledAttributes.getFloat(index, this.LJII);
            } else if (index == R$styleable.ConstraintSet_android_transformPivotX) {
                this.LJIIIIZZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
            } else if (index == R$styleable.ConstraintSet_android_transformPivotY) {
                this.LJIIIZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIZ);
            } else if (index == R$styleable.ConstraintSet_android_translationX) {
                this.LJIIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJ);
            } else if (index == R$styleable.ConstraintSet_android_translationY) {
                this.LJIIJJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJJI);
            } else if (index == R$styleable.ConstraintSet_android_translationZ) {
                this.LJIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIL);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
