package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19M9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19M9 {
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL = 1.0f;
    public float LJ = Float.NaN;

    public final void LIZ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PropertySet);
        this.LIZ = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.PropertySet_android_alpha) {
                this.LIZLLL = typedArrayObtainStyledAttributes.getFloat(index, this.LIZLLL);
            } else if (index == R$styleable.PropertySet_android_visibility) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.LIZIZ);
                this.LIZIZ = i2;
                this.LIZIZ = C19MB.LIZLLL[i2];
            } else if (index == R$styleable.PropertySet_visibilityMode) {
                this.LIZJ = typedArrayObtainStyledAttributes.getInt(index, this.LIZJ);
            } else if (index == R$styleable.PropertySet_motionProgress) {
                this.LJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJ);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
