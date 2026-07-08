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

/* JADX INFO: renamed from: X.19Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21528119Mx extends AbstractC21525919Mb {
    public int LJ;
    public float LJII;
    public int LJFF = -1;
    public float LJI = Float.NaN;
    public float LJIIIIZZ = Float.NaN;
    public int LJIIIZ = -1;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public float LJIIL = Float.NaN;
    public float LJIILIIL = Float.NaN;
    public float LJIILJJIL = Float.NaN;
    public float LJIILL = Float.NaN;
    public float LJIILLIIL = Float.NaN;
    public float LJIIZILJ = Float.NaN;
    public float LJIJ = Float.NaN;
    public float LJIJI = Float.NaN;
    public float LJIJJ = Float.NaN;

    public C21528119Mx() {
        this.LIZLLL = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21525919Mb
    public final void LIZ(HashMap<String, C19N0> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add ");
        sbLIZ.append(map.size());
        sbLIZ.append(" values");
        C2188811AlT.LIZIZ(sbLIZ);
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(2, stackTrace.length - 1);
        String strLIZIZ = " ";
        for (int i = 1; i <= iMin; i++) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(".(");
            sbLIZ2.append(stackTrace[i].getFileName());
            sbLIZ2.append(":");
            sbLIZ2.append(stackTrace[i].getLineNumber());
            sbLIZ2.append(") ");
            sbLIZ2.append(stackTrace[i].getMethodName());
            C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        for (String str : map.keySet()) {
            C19N0 c19n0 = map.get(str);
            str.getClass();
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c19n0.LIZIZ(this.LJIILJJIL, this.LIZ);
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c19n0.LIZIZ(this.LJIILL, this.LIZ);
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c19n0.LIZIZ(this.LJIJ, this.LIZ);
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c19n0.LIZIZ(this.LJIJI, this.LIZ);
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c19n0.LIZIZ(this.LJIJJ, this.LIZ);
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c19n0.LIZIZ(this.LJIIIIZZ, this.LIZ);
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c19n0.LIZIZ(this.LJIILLIIL, this.LIZ);
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c19n0.LIZIZ(this.LJIIZILJ, this.LIZ);
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c19n0.LIZIZ(this.LJIIL, this.LIZ);
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c19n0.LIZIZ(this.LJIIJJI, this.LIZ);
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c19n0.LIZIZ(this.LJIILIIL, this.LIZ);
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c19n0.LIZIZ(this.LJIIJ, this.LIZ);
                    }
                    break;
                case 156108012:
                    if (str.equals("waveOffset")) {
                        c19n0.LIZIZ(this.LJII, this.LIZ);
                    }
                    break;
            }
        }
    }

    @Override // X.AbstractC21525919Mb
    public final void LIZIZ(HashSet<String> hashSet) {
        if (!Float.isNaN(this.LJIIJ)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.LJIIZILJ)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.LJIJ)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.LJIJI)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.LJIJJ)) {
            hashSet.add("translationZ");
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
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyCycle);
        SparseIntArray sparseIntArray = C21525519Lx.LIZ;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (C21525519Lx.LIZ.get(index)) {
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
                    C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 4:
                    this.LJ = typedArrayObtainStyledAttributes.getInteger(index, this.LJ);
                    break;
                case 5:
                    this.LJFF = typedArrayObtainStyledAttributes.getInt(index, this.LJFF);
                    break;
                case 6:
                    this.LJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJI);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.LJII = typedArrayObtainStyledAttributes.getDimension(index, this.LJII);
                    } else {
                        this.LJII = typedArrayObtainStyledAttributes.getFloat(index, this.LJII);
                    }
                    break;
                case 8:
                    this.LJIIIZ = typedArrayObtainStyledAttributes.getInt(index, this.LJIIIZ);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    this.LJIIJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIJ);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    this.LJIIJJI = typedArrayObtainStyledAttributes.getDimension(index, this.LJIIJJI);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    this.LJIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIL);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    this.LJIILJJIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILJJIL);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    this.LJIILL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILL);
                    break;
                case 14:
                    this.LJIILIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILIIL);
                    break;
                case 15:
                    this.LJIILLIIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJIILLIIL);
                    break;
                case 16:
                    this.LJIIZILJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIZILJ);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    this.LJIJ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIJ);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    this.LJIJI = typedArrayObtainStyledAttributes.getDimension(index, this.LJIJI);
                    break;
                case 19:
                    this.LJIJJ = typedArrayObtainStyledAttributes.getDimension(index, this.LJIJJ);
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    this.LJIIIIZZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                    break;
            }
        }
    }
}
