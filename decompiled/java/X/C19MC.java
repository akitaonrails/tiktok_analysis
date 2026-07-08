package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19MC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MC {
    public static final SparseIntArray LJII;
    public boolean LIZ;
    public String LIZJ;
    public int LJ;
    public int LIZIZ = -1;
    public int LIZLLL = -1;
    public float LJFF = Float.NaN;
    public float LJI = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJII = sparseIntArray;
        sparseIntArray.append(R$styleable.Motion_motionPathRotate, 1);
        sparseIntArray.append(R$styleable.Motion_pathMotionArc, 2);
        sparseIntArray.append(R$styleable.Motion_transitionEasing, 3);
        sparseIntArray.append(R$styleable.Motion_drawPath, 4);
        sparseIntArray.append(R$styleable.Motion_animate_relativeTo, 5);
        sparseIntArray.append(R$styleable.Motion_motionStagger, 6);
    }

    public final void LIZ(C19MC c19mc) {
        this.LIZ = c19mc.LIZ;
        this.LIZIZ = c19mc.LIZIZ;
        this.LIZJ = c19mc.LIZJ;
        this.LIZLLL = c19mc.LIZLLL;
        this.LJ = c19mc.LJ;
        this.LJI = c19mc.LJI;
        this.LJFF = c19mc.LJFF;
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Motion);
        this.LIZ = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (LJII.get(index)) {
                case 1:
                    this.LJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJI);
                    break;
                case 2:
                    this.LIZLLL = typedArrayObtainStyledAttributes.getInt(index, this.LIZLLL);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.LIZJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    } else {
                        this.LIZJ = C19NB.LIZJ[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.LJ = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.LIZIZ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LIZIZ);
                    break;
                case 6:
                    this.LJFF = typedArrayObtainStyledAttributes.getFloat(index, this.LJFF);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
