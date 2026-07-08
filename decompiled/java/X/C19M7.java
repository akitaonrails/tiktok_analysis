package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.19M7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19M7 {
    public static final SparseIntArray LJIILIIL;
    public boolean LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ = 1.0f;
    public float LJFF = 1.0f;
    public float LJI = Float.NaN;
    public float LJII = Float.NaN;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public float LJIIL;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJIILIIL = sparseIntArray;
        sparseIntArray.append(R$styleable.Transform_android_rotation, 1);
        sparseIntArray.append(R$styleable.Transform_android_rotationX, 2);
        sparseIntArray.append(R$styleable.Transform_android_rotationY, 3);
        sparseIntArray.append(R$styleable.Transform_android_scaleX, 4);
        sparseIntArray.append(R$styleable.Transform_android_scaleY, 5);
        sparseIntArray.append(R$styleable.Transform_android_transformPivotX, 6);
        sparseIntArray.append(R$styleable.Transform_android_transformPivotY, 7);
        sparseIntArray.append(R$styleable.Transform_android_translationX, 8);
        sparseIntArray.append(R$styleable.Transform_android_translationY, 9);
        sparseIntArray.append(R$styleable.Transform_android_translationZ, 10);
        sparseIntArray.append(R$styleable.Transform_android_elevation, 11);
    }

    public final void LIZ(C19M7 c19m7) {
        this.LIZ = c19m7.LIZ;
        this.LIZIZ = c19m7.LIZIZ;
        this.LIZJ = c19m7.LIZJ;
        this.LIZLLL = c19m7.LIZLLL;
        this.LJ = c19m7.LJ;
        this.LJFF = c19m7.LJFF;
        this.LJI = c19m7.LJI;
        this.LJII = c19m7.LJII;
        this.LJIIIIZZ = c19m7.LJIIIIZZ;
        this.LJIIIZ = c19m7.LJIIIZ;
        this.LJIIJ = c19m7.LJIIJ;
        this.LJIIJJI = c19m7.LJIIJJI;
        this.LJIIL = c19m7.LJIIL;
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Transform);
        this.LIZ = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (LJIILIIL.get(index)) {
                case 1:
                    this.LIZIZ = typedArrayObtainStyledAttributes.getFloat(index, this.LIZIZ);
                    break;
                case 2:
                    this.LIZJ = typedArrayObtainStyledAttributes.getFloat(index, this.LIZJ);
                    break;
                case 3:
                    this.LIZLLL = typedArrayObtainStyledAttributes.getFloat(index, this.LIZLLL);
                    break;
                case 4:
                    this.LJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJ);
                    break;
                case 5:
                    this.LJFF = typedArrayObtainStyledAttributes.getFloat(index, this.LJFF);
                    break;
                case 6:
                    this.LJI = typedArrayObtainStyledAttributes.getDimension(index, this.LJI);
                    break;
                case 7:
                    this.LJII = typedArrayObtainStyledAttributes.getDimension(index, this.LJII);
                    break;
                case 8:
                    this.LJIIIIZZ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIIIZZ);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    this.LJIIIZ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIIZ);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    this.LJIIJ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIJ);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    this.LJIIJJI = true;
                    this.LJIIL = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIL);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
