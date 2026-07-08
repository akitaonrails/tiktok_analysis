package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.19My, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21528219My extends AbstractC21525919Mb {
    public String LJ;
    public String LJI;
    public String LJII;
    public View LJIIJ;
    public Method LJIILLIIL;
    public Method LJIIZILJ;
    public Method LJIJ;
    public float LJIJI;
    public boolean LJIJJ;
    public int LJFF = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public float LJIIJJI = 0.1f;
    public boolean LJIIL = true;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;
    public float LJIILL = Float.NaN;
    public final RectF LJIJJLI = new RectF();
    public final RectF LJIL = new RectF();

    @Override // X.AbstractC21525919Mb
    public final void LIZ(HashMap<String, C19N0> map) {
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZIZ(HashSet<String> hashSet) {
    }

    public C21528219My() {
        this.LIZLLL = new HashMap<>();
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTrigger);
        SparseIntArray sparseIntArray = C19M1.LIZ;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (C19M1.LIZ.get(index)) {
                case 1:
                    this.LJI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 2:
                    this.LJII = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 4:
                    this.LJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 5:
                    this.LJIIJJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJJI);
                    break;
                case 6:
                    this.LJIIIIZZ = typedArrayObtainStyledAttributes.getResourceId(index, this.LJIIIIZZ);
                    break;
                case 7:
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
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.LIZ);
                    this.LIZ = integer;
                    this.LJIILL = (integer + 0.5f) / 100.0f;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    this.LJIIIZ = typedArrayObtainStyledAttributes.getResourceId(index, this.LJIIIZ);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    this.LJIJJ = typedArrayObtainStyledAttributes.getBoolean(index, this.LJIJJ);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    this.LJFF = typedArrayObtainStyledAttributes.getResourceId(index, this.LJFF);
                    break;
            }
        }
    }

    public static void LJ(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
