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

/* JADX INFO: renamed from: X.19Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21526719Mj extends AbstractC21525919Mb {
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
    public float LJIIZILJ = Float.NaN;
    public float LJIJ = Float.NaN;

    public C21526719Mj() {
        this.LIZLLL = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21525919Mb
    public final void LIZ(HashMap<String, C19N0> map) {
        for (String str : map.keySet()) {
            C19N0 c19n0 = map.get(str);
            if (str.startsWith("CUSTOM")) {
                C21526019Mc c21526019Mc = this.LIZLLL.get(str.substring(7));
                if (c21526019Mc != null) {
                    ((C19N3) c19n0).LJFF.append(this.LIZ, c21526019Mc);
                }
            } else {
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX") && !Float.isNaN(this.LJIIIIZZ)) {
                            c19n0.LIZIZ(this.LJIIIIZZ, this.LIZ);
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY") && !Float.isNaN(this.LJIIIZ)) {
                            c19n0.LIZIZ(this.LJIIIZ, this.LIZ);
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX") && !Float.isNaN(this.LJIILL)) {
                            c19n0.LIZIZ(this.LJIILL, this.LIZ);
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY") && !Float.isNaN(this.LJIILLIIL)) {
                            c19n0.LIZIZ(this.LJIILLIIL, this.LIZ);
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ") && !Float.isNaN(this.LJIIZILJ)) {
                            c19n0.LIZIZ(this.LJIIZILJ, this.LIZ);
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress") && !Float.isNaN(this.LJIJ)) {
                            c19n0.LIZIZ(this.LJIJ, this.LIZ);
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX") && !Float.isNaN(this.LJIILIIL)) {
                            c19n0.LIZIZ(this.LJIILIIL, this.LIZ);
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY") && !Float.isNaN(this.LJIILJJIL)) {
                            c19n0.LIZIZ(this.LJIILJJIL, this.LIZ);
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX") && !Float.isNaN(this.LJIIIIZZ)) {
                            c19n0.LIZIZ(this.LJIIJ, this.LIZ);
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY") && !Float.isNaN(this.LJIIIZ)) {
                            c19n0.LIZIZ(this.LJIIJJI, this.LIZ);
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation") && !Float.isNaN(this.LJII)) {
                            c19n0.LIZIZ(this.LJII, this.LIZ);
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation") && !Float.isNaN(this.LJI)) {
                            c19n0.LIZIZ(this.LJI, this.LIZ);
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate") && !Float.isNaN(this.LJIIL)) {
                            c19n0.LIZIZ(this.LJIIL, this.LIZ);
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha") && !Float.isNaN(this.LJFF)) {
                            c19n0.LIZIZ(this.LJFF, this.LIZ);
                        }
                        break;
                }
            }
        }
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
        if (!Float.isNaN(this.LJIIJ)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.LJIIZILJ)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.LJIJ)) {
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
        if (!Float.isNaN(this.LJIIJ)) {
            map.put("transformPivotX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            map.put("transformPivotY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILL)) {
            map.put("translationX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            map.put("translationY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIZILJ)) {
            map.put("translationZ", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIL)) {
            map.put("transitionPathRotate", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            map.put("scaleX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            map.put("scaleY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIJ)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyAttribute);
        SparseIntArray sparseIntArray = C21525719Lz.LIZ;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (C21525719Lz.LIZ.get(index)) {
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
                    this.LJIILIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILIIL);
                    break;
                case 8:
                    this.LJIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIL);
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
                    this.LJIILJJIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILJJIL);
                    break;
                case 15:
                    this.LJIILL = typedArrayObtainStyledAttributes.getDimension(index, this.LJIILL);
                    break;
                case 16:
                    this.LJIILLIIL = typedArrayObtainStyledAttributes.getDimension(index, this.LJIILLIIL);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    this.LJIIZILJ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIZILJ);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    this.LJIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJ);
                    break;
                case 19:
                    this.LJIIJ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIJ);
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    this.LJIIJJI = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIJJI);
                    break;
            }
        }
    }
}
