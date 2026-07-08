package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1DoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267061DoO implements InterfaceC2267321Doo {
    public Object LIZ;
    public final C2267051DoN LIZIZ;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJJIIZI;
    public Object LJJIJ;
    public Object LJJIJIIJI;
    public Object LJJIJIIJIL;
    public Object LJJIJIL;
    public Object LJJIJL;
    public Object LJJIJLIJ;
    public Object LJJIL;
    public Object LJJIZ;
    public Object LJJJ;
    public Object LJJJI;
    public Object LJJJIL;
    public Object LJJJJ;
    public Object LJJJJI;
    public Object LJJJJIZL;
    public Object LJJJJJ;
    public float LJJJJJL;
    public EnumC2267251Doh LJJJJL;
    public Object LJJJJZ;
    public C2267081DoQ LJJJJZI;
    public float LIZJ = -1.0f;
    public float LIZLLL = -1.0f;
    public float LJ = 0.5f;
    public float LJFF = 0.5f;
    public float LJIJJ = Float.NaN;
    public float LJIJJLI = Float.NaN;
    public float LJIL = Float.NaN;
    public float LJJ = Float.NaN;
    public float LJJI = Float.NaN;
    public float LJJIFFI = Float.NaN;
    public float LJJII = Float.NaN;
    public float LJJIII = Float.NaN;
    public float LJJIIJ = Float.NaN;
    public float LJJIIJZLJL = Float.NaN;
    public float LJJIIZ = Float.NaN;
    public C2267031DoL LJJJJLI = C2267031DoL.LIZ();
    public C2267031DoL LJJJJLL = C2267031DoL.LIZ();
    public final HashMap<String, Integer> LJJJLIIL = new HashMap<>();
    public HashMap<String, Float> LJJJLL = new HashMap<>();

    @Override // X.InterfaceC2267321Doo
    public final InterfaceC2267411Dox getFacade() {
        return null;
    }

    @Override // X.InterfaceC2267321Doo
    public void apply() {
        if (this.LJJJJZI == null) {
            return;
        }
        this.LJJJJLI.LIZJ(this.LJJJJZI, 0);
        this.LJJJJLL.LIZJ(this.LJJJJZI, 1);
        this.LJJIJ = LJII(this.LJJIJ);
        this.LJJIJIIJI = LJII(this.LJJIJIIJI);
        this.LJJIJIIJIL = LJII(this.LJJIJIIJIL);
        this.LJJIJIL = LJII(this.LJJIJIL);
        this.LJJIJL = LJII(this.LJJIJL);
        this.LJJIJLIJ = LJII(this.LJJIJLIJ);
        this.LJJIL = LJII(this.LJJIL);
        this.LJJIZ = LJII(this.LJJIZ);
        this.LJJJ = LJII(this.LJJJ);
        this.LJJJI = LJII(this.LJJJI);
        this.LJJJIL = LJII(this.LJJJIL);
        this.LJJJJ = LJII(this.LJJJJ);
        this.LJJJJI = LJII(this.LJJJJI);
        this.LJJJJIZL = LJII(this.LJJJJIZL);
        this.LJJJJJ = LJII(this.LJJJJJ);
        LIZIZ(this.LJJJJZI, this.LJJIJ, EnumC2267251Doh.LEFT_TO_LEFT);
        LIZIZ(this.LJJJJZI, this.LJJIJIIJI, EnumC2267251Doh.LEFT_TO_RIGHT);
        LIZIZ(this.LJJJJZI, this.LJJIJIIJIL, EnumC2267251Doh.RIGHT_TO_LEFT);
        LIZIZ(this.LJJJJZI, this.LJJIJIL, EnumC2267251Doh.RIGHT_TO_RIGHT);
        LIZIZ(this.LJJJJZI, this.LJJIJL, EnumC2267251Doh.START_TO_START);
        LIZIZ(this.LJJJJZI, this.LJJIJLIJ, EnumC2267251Doh.START_TO_END);
        LIZIZ(this.LJJJJZI, this.LJJIL, EnumC2267251Doh.END_TO_START);
        LIZIZ(this.LJJJJZI, this.LJJIZ, EnumC2267251Doh.END_TO_END);
        LIZIZ(this.LJJJJZI, this.LJJJ, EnumC2267251Doh.TOP_TO_TOP);
        LIZIZ(this.LJJJJZI, this.LJJJI, EnumC2267251Doh.TOP_TO_BOTTOM);
        LIZIZ(this.LJJJJZI, this.LJJJIL, EnumC2267251Doh.BOTTOM_TO_TOP);
        LIZIZ(this.LJJJJZI, this.LJJJJ, EnumC2267251Doh.BOTTOM_TO_BOTTOM);
        LIZIZ(this.LJJJJZI, this.LJJJJI, EnumC2267251Doh.BASELINE_TO_BASELINE);
        LIZIZ(this.LJJJJZI, this.LJJJJIZL, EnumC2267251Doh.BASELINE_TO_TOP);
        LIZIZ(this.LJJJJZI, this.LJJJJJ, EnumC2267251Doh.BASELINE_TO_BOTTOM);
        LIZIZ(this.LJJJJZI, null, EnumC2267251Doh.CIRCULAR_CONSTRAINT);
        float f = this.LIZJ;
        if (f != -1.0f) {
            this.LJJJJZI.LJJLIIIJILLIZJL[0] = f;
        }
        float f2 = this.LIZLLL;
        if (f2 != -1.0f) {
            this.LJJJJZI.LJJLIIIJILLIZJL[1] = f2;
        }
        C2267081DoQ c2267081DoQ = this.LJJJJZI;
        c2267081DoQ.LJJJLL = this.LJ;
        c2267081DoQ.LJJJLZIJ = this.LJFF;
        C2262541Dh6 c2262541Dh6 = c2267081DoQ.LJIIJ;
        c2262541Dh6.LJFF = this.LJIJJ;
        c2262541Dh6.LJI = this.LJIJJLI;
        c2262541Dh6.LJII = this.LJIL;
        c2262541Dh6.LJIIIIZZ = this.LJJ;
        c2262541Dh6.LJIIIZ = this.LJJI;
        c2262541Dh6.LJIIJ = this.LJJIFFI;
        c2262541Dh6.LJIIJJI = this.LJJII;
        c2262541Dh6.LJIIL = this.LJJIII;
        c2262541Dh6.LJIILIIL = this.LJJIIJZLJL;
        c2262541Dh6.LJIILJJIL = this.LJJIIZ;
        c2262541Dh6.LJIILL = this.LJJIIJ;
        int i = this.LJJIIZI;
        c2262541Dh6.LJIIZILJ = i;
        c2267081DoQ.LJJL = i;
        HashMap<String, Integer> map = this.LJJJLIIL;
        if (map != null) {
            for (String str : map.keySet()) {
                Integer num = this.LJJJLIIL.get(str);
                C2262541Dh6 c2262541Dh62 = this.LJJJJZI.LJIIJ;
                int iIntValue = num.intValue();
                if (c2262541Dh62.LJIJ.containsKey(str)) {
                    c2262541Dh62.LJIJ.get(str).LIZJ = iIntValue;
                } else {
                    c2262541Dh62.LJIJ.put(str, new C2255501DPw(str, iIntValue));
                }
            }
        }
        HashMap<String, Float> map2 = this.LJJJLL;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                float fFloatValue = this.LJJJLL.get(str2).floatValue();
                C2262541Dh6 c2262541Dh63 = this.LJJJJZI.LJIIJ;
                if (c2262541Dh63.LJIJ.containsKey(str2)) {
                    c2262541Dh63.LJIJ.get(str2).LIZLLL = fFloatValue;
                } else {
                    c2262541Dh63.LJIJ.put(str2, new C2255501DPw(fFloatValue, str2));
                }
            }
        }
    }

    @Override // X.InterfaceC2267321Doo
    public C2267081DoQ getConstraintWidget() {
        if (this.LJJJJZI == null) {
            C2267081DoQ c2267081DoQ = new C2267081DoQ(this.LJJJJLI.LIZLLL, this.LJJJJLL.LIZLLL);
            this.LJJJJZI = c2267081DoQ;
            c2267081DoQ.LJJJZ = this.LJJJJZ;
        }
        return this.LJJJJZI;
    }

    @Override // X.InterfaceC2267321Doo
    public final Object getKey() {
        return this.LIZ;
    }

    public C2267061DoO(C2267051DoN c2267051DoN) {
        this.LIZIZ = c2267051DoN;
    }

    @Override // X.InterfaceC2267321Doo
    public final void LIZ(C2267081DoQ c2267081DoQ) {
        if (c2267081DoQ == null) {
            return;
        }
        this.LJJJJZI = c2267081DoQ;
        c2267081DoQ.LJJJZ = this.LJJJJZ;
    }

    public final void LIZJ(Object obj) {
        this.LJJJJL = EnumC2267251Doh.BASELINE_TO_BASELINE;
        this.LJJJJI = obj;
    }

    public final void LIZLLL(Object obj) {
        this.LJJJJL = EnumC2267251Doh.BOTTOM_TO_BOTTOM;
        this.LJJJJ = obj;
    }

    public final void LJ(Object obj) {
        this.LJJJJL = EnumC2267251Doh.BOTTOM_TO_TOP;
        this.LJJJIL = obj;
    }

    public final void LJFF(Object obj) {
        this.LJJJJL = EnumC2267251Doh.END_TO_END;
        this.LJJIZ = obj;
    }

    public final void LJI(Object obj) {
        this.LJJJJL = EnumC2267251Doh.END_TO_START;
        this.LJJIL = obj;
    }

    public final Object LJII(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof C2267061DoO)) {
            return this.LIZIZ.LIZ.get(obj);
        }
        return obj;
    }

    public C2267061DoO LJIIIIZZ(int i) {
        EnumC2267251Doh enumC2267251Doh = this.LJJJJL;
        if (enumC2267251Doh != null) {
            switch (C2267241Dog.LIZ[enumC2267251Doh.ordinal()]) {
                case 1:
                case 2:
                    this.LJI = i;
                    break;
                case 3:
                case 4:
                    this.LJII = i;
                    break;
                case 5:
                case 6:
                    this.LJIIIIZZ = i;
                    break;
                case 7:
                case 8:
                    this.LJIIIZ = i;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    this.LJIIJ = i;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    this.LJIIJJI = i;
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                    this.LJIJ = i;
                    break;
                case 16:
                    this.LJJJJJL = i;
                    break;
            }
            return this;
        }
        this.LJI = i;
        this.LJII = i;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i;
        this.LJIIJ = i;
        this.LJIIJJI = i;
        return this;
    }

    public C2267061DoO LJIIIZ(Object obj) {
        LJIIIIZZ(this.LIZIZ.LIZIZ(obj));
        return this;
    }

    public final void LJIIJ(int i) {
        EnumC2267251Doh enumC2267251Doh = this.LJJJJL;
        if (enumC2267251Doh != null) {
            switch (C2267241Dog.LIZ[enumC2267251Doh.ordinal()]) {
                case 1:
                case 2:
                    this.LJIIL = i;
                    break;
                case 3:
                case 4:
                    this.LJIILIIL = i;
                    break;
                case 5:
                case 6:
                    this.LJIILJJIL = i;
                    break;
                case 7:
                case 8:
                    this.LJIILL = i;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    this.LJIILLIIL = i;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    this.LJIIZILJ = i;
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                    this.LJIJI = i;
                    break;
            }
            return;
        }
        this.LJIIL = i;
        this.LJIILIIL = i;
        this.LJIILJJIL = i;
        this.LJIILL = i;
        this.LJIILLIIL = i;
        this.LJIIZILJ = i;
    }

    public final void LJIIJJI(Object obj) {
        this.LJJJJL = EnumC2267251Doh.START_TO_END;
        this.LJJIJLIJ = obj;
    }

    public final void LJIIL(Object obj) {
        this.LJJJJL = EnumC2267251Doh.START_TO_START;
        this.LJJIJL = obj;
    }

    public final void LJIILIIL(Object obj) {
        this.LJJJJL = EnumC2267251Doh.TOP_TO_BOTTOM;
        this.LJJJI = obj;
    }

    public final void LJIILJJIL(Object obj) {
        this.LJJJJL = EnumC2267251Doh.TOP_TO_TOP;
        this.LJJJ = obj;
    }

    public final void LIZIZ(C2267081DoQ c2267081DoQ, Object obj, EnumC2267251Doh enumC2267251Doh) {
        C2267081DoQ constraintWidget;
        if ((obj instanceof InterfaceC2267321Doo) && (constraintWidget = ((InterfaceC2267321Doo) obj).getConstraintWidget()) != null) {
            int[] iArr = C2267241Dog.LIZ;
            enumC2267251Doh.ordinal();
            switch (iArr[enumC2267251Doh.ordinal()]) {
                case 1:
                    EnumC2266931DoB enumC2266931DoB = EnumC2266931DoB.LEFT;
                    c2267081DoQ.LJI(enumC2266931DoB).LIZ(constraintWidget.LJI(enumC2266931DoB), this.LJI, this.LJIIL, false);
                    break;
                case 2:
                    c2267081DoQ.LJI(EnumC2266931DoB.LEFT).LIZ(constraintWidget.LJI(EnumC2266931DoB.RIGHT), this.LJI, this.LJIIL, false);
                    break;
                case 3:
                    c2267081DoQ.LJI(EnumC2266931DoB.RIGHT).LIZ(constraintWidget.LJI(EnumC2266931DoB.LEFT), this.LJII, this.LJIILIIL, false);
                    break;
                case 4:
                    EnumC2266931DoB enumC2266931DoB2 = EnumC2266931DoB.RIGHT;
                    c2267081DoQ.LJI(enumC2266931DoB2).LIZ(constraintWidget.LJI(enumC2266931DoB2), this.LJII, this.LJIILIIL, false);
                    break;
                case 5:
                    EnumC2266931DoB enumC2266931DoB3 = EnumC2266931DoB.LEFT;
                    c2267081DoQ.LJI(enumC2266931DoB3).LIZ(constraintWidget.LJI(enumC2266931DoB3), this.LJIIIIZZ, this.LJIILJJIL, false);
                    break;
                case 6:
                    c2267081DoQ.LJI(EnumC2266931DoB.LEFT).LIZ(constraintWidget.LJI(EnumC2266931DoB.RIGHT), this.LJIIIIZZ, this.LJIILJJIL, false);
                    break;
                case 7:
                    c2267081DoQ.LJI(EnumC2266931DoB.RIGHT).LIZ(constraintWidget.LJI(EnumC2266931DoB.LEFT), this.LJIIIZ, this.LJIILL, false);
                    break;
                case 8:
                    EnumC2266931DoB enumC2266931DoB4 = EnumC2266931DoB.RIGHT;
                    c2267081DoQ.LJI(enumC2266931DoB4).LIZ(constraintWidget.LJI(enumC2266931DoB4), this.LJIIIZ, this.LJIILL, false);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    EnumC2266931DoB enumC2266931DoB5 = EnumC2266931DoB.TOP;
                    c2267081DoQ.LJI(enumC2266931DoB5).LIZ(constraintWidget.LJI(enumC2266931DoB5), this.LJIIJ, this.LJIILLIIL, false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    c2267081DoQ.LJI(EnumC2266931DoB.TOP).LIZ(constraintWidget.LJI(EnumC2266931DoB.BOTTOM), this.LJIIJ, this.LJIILLIIL, false);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    c2267081DoQ.LJI(EnumC2266931DoB.BOTTOM).LIZ(constraintWidget.LJI(EnumC2266931DoB.TOP), this.LJIIJJI, this.LJIIZILJ, false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    EnumC2266931DoB enumC2266931DoB6 = EnumC2266931DoB.BOTTOM;
                    c2267081DoQ.LJI(enumC2266931DoB6).LIZ(constraintWidget.LJI(enumC2266931DoB6), this.LJIIJJI, this.LJIIZILJ, false);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    c2267081DoQ.LJIILLIIL(EnumC2266931DoB.BASELINE, constraintWidget, EnumC2266931DoB.BOTTOM, this.LJIJ, this.LJIJI);
                    break;
                case 14:
                    c2267081DoQ.LJIILLIIL(EnumC2266931DoB.BASELINE, constraintWidget, EnumC2266931DoB.TOP, this.LJIJ, this.LJIJI);
                    break;
                case 15:
                    EnumC2266931DoB enumC2266931DoB7 = EnumC2266931DoB.BASELINE;
                    c2267081DoQ.LJIILLIIL(enumC2266931DoB7, constraintWidget, enumC2266931DoB7, this.LJIJ, this.LJIJI);
                    break;
                case 16:
                    int i = (int) this.LJJJJJL;
                    c2267081DoQ.getClass();
                    EnumC2266931DoB enumC2266931DoB8 = EnumC2266931DoB.CENTER;
                    c2267081DoQ.LJIILLIIL(enumC2266931DoB8, constraintWidget, enumC2266931DoB8, i, 0);
                    c2267081DoQ.LJJIIZ = 0.0f;
                    break;
            }
        }
    }
}
