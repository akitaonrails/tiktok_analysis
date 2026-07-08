package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19MT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MT {
    public static final float[][] LJIJJLI = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] LJIL = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public final float[] LJIIJJI = new float[2];
    public float LJIIL;
    public float LJIILIIL;
    public final C21526919Ml LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public boolean LJIIZILJ;
    public float LJIJ;
    public int LJIJI;
    public float LJIJJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" , ");
        sbLIZ.append(this.LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(boolean z) {
        float[][] fArr = LJIJJLI;
        float[][] fArr2 = LJIL;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.LIZ];
        this.LJII = fArr3[0];
        this.LJI = fArr3[1];
        float[] fArr4 = fArr2[this.LIZIZ];
        this.LJIIIIZZ = fArr4[0];
        this.LJIIIZ = fArr4[1];
    }

    public final RectF LIZ(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.LJ;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public C19MT(Context context, C21526919Ml c21526919Ml, XmlPullParser xmlPullParser) {
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = 0.5f;
        this.LJII = 0.5f;
        this.LJIIIZ = 1.0f;
        this.LJIILL = 4.0f;
        this.LJIILLIIL = 1.2f;
        this.LJIIZILJ = true;
        this.LJIJ = 1.0f;
        this.LJIJJ = 10.0f;
        this.LJIILJJIL = c21526919Ml;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.OnSwipe);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.OnSwipe_touchAnchorId) {
                this.LIZLLL = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZLLL);
            } else if (index == R$styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.LIZ);
                this.LIZ = i2;
                float[] fArr = LJIJJLI[i2];
                this.LJII = fArr[0];
                this.LJI = fArr[1];
            } else if (index == R$styleable.OnSwipe_dragDirection) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.LIZIZ);
                this.LIZIZ = i3;
                float[] fArr2 = LJIL[i3];
                this.LJIIIIZZ = fArr2[0];
                this.LJIIIZ = fArr2[1];
            } else if (index == R$styleable.OnSwipe_maxVelocity) {
                this.LJIILL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILL);
            } else if (index == R$styleable.OnSwipe_maxAcceleration) {
                this.LJIILLIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILLIIL);
            } else if (index == R$styleable.OnSwipe_moveWhenScrollAtTop) {
                this.LJIIZILJ = typedArrayObtainStyledAttributes.getBoolean(index, this.LJIIZILJ);
            } else if (index == R$styleable.OnSwipe_dragScale) {
                this.LJIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJ);
            } else if (index == R$styleable.OnSwipe_dragThreshold) {
                this.LJIJJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJJ);
            } else if (index == R$styleable.OnSwipe_touchRegionId) {
                this.LJ = typedArrayObtainStyledAttributes.getResourceId(index, this.LJ);
            } else if (index == R$styleable.OnSwipe_onTouchUp) {
                this.LIZJ = typedArrayObtainStyledAttributes.getInt(index, this.LIZJ);
            } else if (index == R$styleable.OnSwipe_nestedScrollFlags) {
                this.LJIJI = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.OnSwipe_limitBoundsTo) {
                this.LJFF = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
