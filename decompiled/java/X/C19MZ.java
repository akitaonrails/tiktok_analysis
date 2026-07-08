package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MZ extends AbstractC21525819Ma {
    public String LJFF;
    public int LJII;
    public int LJIILJJIL;
    public int LJI = -1;
    public float LJIIIIZZ = Float.NaN;
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public final float LJIIL = Float.NaN;
    public final float LJIILIIL = Float.NaN;

    @Override // X.AbstractC21525919Mb
    public final void LIZ(HashMap<String, C19N0> map) {
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyPosition);
        SparseIntArray sparseIntArray = C19M0.LIZ;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (C19M0.LIZ.get(index)) {
                case 1:
                    if (C21526919Ml.LLLLIIL) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZIZ);
                        this.LIZIZ = resourceId;
                        if (resourceId == -1) {
                            this.LIZJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.LIZJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    } else {
                        this.LIZIZ = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZIZ);
                    }
                    break;
                case 2:
                    this.LIZ = typedArrayObtainStyledAttributes.getInt(index, this.LIZ);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.LJFF = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    } else {
                        this.LJFF = C19NB.LIZJ[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.LJ = typedArrayObtainStyledAttributes.getInteger(index, this.LJ);
                    break;
                case 5:
                    this.LJII = typedArrayObtainStyledAttributes.getInt(index, this.LJII);
                    break;
                case 6:
                    this.LJIIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJ);
                    break;
                case 7:
                    this.LJIIJJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJJI);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIZ);
                    this.LJIIIIZZ = f;
                    this.LJIIIZ = f;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    this.LJIILJJIL = typedArrayObtainStyledAttributes.getInt(index, this.LJIILJJIL);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    this.LJI = typedArrayObtainStyledAttributes.getInt(index, this.LJI);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    this.LJIIIIZZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    this.LJIIIZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIZ);
                    break;
            }
        }
    }
}
