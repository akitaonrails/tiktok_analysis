package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.19Mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21526819Mk extends AbstractC21525919Mb {
    public int LJIIZILJ;
    public float LJIJI;
    public int LJ = -1;
    public float LJFF = Float.NaN;
    public float LJI = Float.NaN;
    public float LJII = Float.NaN;
    public float LJIIIIZZ = Float.NaN;
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public float LJIIL = Float.NaN;
    public float LJIILIIL = Float.NaN;
    public float LJIILJJIL = Float.NaN;
    public float LJIILL = Float.NaN;
    public float LJIILLIIL = Float.NaN;
    public float LJIJ = Float.NaN;

    public C21526819Mk() {
        this.LIZLLL = new HashMap<>();
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZ(HashMap<String, C19N0> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZIZ(HashSet<String> hashSet) {
        if (!Float.isNaN(this.LJFF)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.LJI)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.LJII)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.LJIIIIZZ)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.LJIIIZ)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.LJIIJ)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            hashSet.add("progress");
        }
        if (this.LIZLLL.size() > 0) {
            for (String str : this.LIZLLL.keySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CUSTOM,");
                sbLIZ.append(str);
                hashSet.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZLLL(HashMap<String, Integer> map) {
        if (this.LJ == -1) {
            return;
        }
        if (!Float.isNaN(this.LJFF)) {
            map.put("alpha", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJI)) {
            map.put("elevation", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJII)) {
            map.put("rotation", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIIIZZ)) {
            map.put("rotationX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIIZ)) {
            map.put("rotationY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            map.put("translationX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            map.put("translationY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILL)) {
            map.put("translationZ", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJ)) {
            map.put("transitionPathRotate", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            map.put("scaleX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            map.put("scaleY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            map.put("progress", Integer.valueOf(this.LJ));
        }
        if (this.LIZLLL.size() > 0) {
            for (String str : this.LIZLLL.keySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CUSTOM,");
                sbLIZ.append(str);
                map.put(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(this.LJ));
            }
        }
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTimeCycle);
        SparseIntArray sparseIntArray = C21525619Ly.LIZ;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (C21525619Ly.LIZ.get(index)) {
                case 1:
                    this.LJFF = typedArrayObtainStyledAttributes.getFloat(index, this.LJFF);
                    break;
                case 2:
                    this.LJI = typedArrayObtainStyledAttributes.getDimension(index, this.LJI);
                    break;
                case 4:
                    this.LJII = typedArrayObtainStyledAttributes.getFloat(index, this.LJII);
                    break;
                case 5:
                    this.LJIIIIZZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                    break;
                case 6:
                    this.LJIIIZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIZ);
                    break;
                case 7:
                    this.LJIIJJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJJI);
                    break;
                case 8:
                    this.LJIIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJ);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
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
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    this.LIZ = typedArrayObtainStyledAttributes.getInt(index, this.LIZ);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    this.LJ = typedArrayObtainStyledAttributes.getInteger(index, this.LJ);
                    break;
                case 14:
                    this.LJIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIL);
                    break;
                case 15:
                    this.LJIILIIL = typedArrayObtainStyledAttributes.getDimension(index, this.LJIILIIL);
                    break;
                case 16:
                    this.LJIILJJIL = typedArrayObtainStyledAttributes.getDimension(index, this.LJIILJJIL);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    this.LJIILL = typedArrayObtainStyledAttributes.getDimension(index, this.LJIILL);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    this.LJIILLIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILLIIL);
                    break;
                case 19:
                    this.LJIIZILJ = typedArrayObtainStyledAttributes.getInt(index, this.LJIIZILJ);
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    this.LJIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJ);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.LJIJI = typedArrayObtainStyledAttributes.getDimension(index, this.LJIJI);
                    } else {
                        this.LJIJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJI);
                    }
                    break;
            }
        }
    }
}
