package X;

import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.mapbuffer.ReadableCompactArrayBuffer;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.shadow.text.AbsoluteSizeSpan;
import com.lynx.tasm.behavior.shadow.text.LynxStrikethroughSpan;
import com.lynx.tasm.behavior.shadow.text.LynxUnderlineSpan;
import com.lynx.tasm.utils.DeviceUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import j27.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316700kMu {
    public final s LIZ;
    public final SparseArray<Object> LIZIZ = new SparseArray<>();
    public final SparseArray<Object> LIZJ = new SparseArray<>();

    public C1316700kMu(s sVar) {
        this.LIZ = sVar;
    }

    public final float[] LIZ(int i) {
        Set<Map.Entry<Integer, C1316760kN0>> setEntrySet;
        float primaryHorizontal;
        float fLIZIZ;
        C1316920kNG c1316920kNG = (C1316920kNG) this.LIZJ.get(i);
        C1316780kN2 c1316780kN2 = (C1316780kN2) this.LIZIZ.get(i);
        if (c1316920kNG != null && c1316780kN2 != null) {
            ArrayList arrayList = new ArrayList();
            HashMap<Integer, C1316760kN0> map = c1316920kNG.LIZJ;
            if (map != null && !map.isEmpty() && (setEntrySet = c1316920kNG.LIZJ.entrySet()) != null) {
                Layout layout = c1316780kN2.LIZJ;
                HashSet hashSet = new HashSet();
                for (Map.Entry<Integer, C1316760kN0> entry : setEntrySet) {
                    C1316760kN0 value = entry.getValue();
                    if (value.LLJ < layout.getText().length()) {
                        int lineForOffset = layout.getLineForOffset(value.LLJ);
                        primaryHorizontal = layout.getPrimaryHorizontal(value.LLJ) + c1316780kN2.LJ.x;
                        if (layout.isRtlCharAt(value.LLJ)) {
                            primaryHorizontal -= value.LLIZ;
                        }
                        fLIZIZ = value.LIZIZ(layout.getLineTop(lineForOffset), layout.getLineBottom(lineForOffset), layout.getLineAscent(lineForOffset), layout.getLineDescent(lineForOffset)) + c1316780kN2.LJ.y;
                    } else {
                        primaryHorizontal = 0.0f;
                        fLIZIZ = 0.0f;
                    }
                    if (value.LLJ >= layout.getText().length() || layout.getText().charAt(value.LLJ) != "I".charAt(0)) {
                        hashSet.add(entry.getKey());
                    }
                    arrayList.add(Float.valueOf(entry.getKey().intValue()));
                    arrayList.add(Float.valueOf(fLIZIZ));
                    arrayList.add(Float.valueOf(primaryHorizontal));
                }
                c1316780kN2.LIZLLL = hashSet;
                float[] fArr = new float[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    fArr[i2] = ((Float) ListProtector.get(arrayList, i2)).floatValue();
                }
                return fArr;
            }
            return new float[0];
        }
        return new float[0];
    }

    public final C1316720kMw LIZLLL(C1316720kMw c1316720kMw) {
        if (c1316720kMw == null) {
            C1316720kMw c1316720kMw2 = new C1316720kMw();
            c1316720kMw2.LJIILIIL = Math.round(C1311130kDv.LIZIZ(14.0f, this.LIZ.LLJJJ.density));
            return c1316720kMw2;
        }
        return c1316720kMw;
    }

    public final void LIZJ(int i, ReadableCompactArrayBuffer readableCompactArrayBuffer) {
        T t;
        int i2;
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<InterfaceC1311710kEr> it2 = readableCompactArrayBuffer.iterator();
        HashMap<Integer, C1316760kN0> map = new HashMap<>();
        ArrayList arrayList2 = new ArrayList();
        float fRound = Math.round(C1311130kDv.LIZIZ(14.0f, this.LIZ.LLJJJ.density));
        boolean z = true;
        boolean z2 = true;
        C1316890kND c1316890kND = null;
        int iLJFF = -1;
        C1316720kMw c1316720kMwLIZLLL = null;
        int iLJFF2 = 0;
        C1311920kFC c1311920kFC = null;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            float f = 0.0f;
            if (it2.hasNext()) {
                int iLJFF3 = it2.next().LJFF();
                if (iLJFF3 != 99) {
                    switch (iLJFF3) {
                        case 0:
                            iLJFF2 = it2.next().LJFF();
                            c1311920kFC = null;
                            z2 = false;
                            break;
                        case 1:
                            int iLJFF4 = it2.next().LJFF();
                            if (iLJFF != -1) {
                                C1316760kN0 c1316760kN0 = new C1316760kN0();
                                c1316760kN0.LLILZIL = true;
                                if (c1311920kFC != null) {
                                    int i3 = c1311920kFC.LIZ;
                                    float f2 = c1311920kFC.LIZIZ;
                                    c1316760kN0.LL = i3;
                                    c1316760kN0.LLILLJJLI = f2;
                                }
                                arrayList2.add(c1316760kN0);
                                c1316760kN0.LLJ = iLJFF2;
                                arrayList.add(new C1316900kNE(iLJFF2, iLJFF4, c1316760kN0));
                                map.put(Integer.valueOf(iLJFF), c1316760kN0);
                            } else if (c1316890kND != null) {
                                if (c1316890kND.LIZLLL != null) {
                                    final C1315430kKr c1315430kKr = new C1315430kKr(c1316890kND.LIZ, c1316890kND.LIZIZ, c1316890kND.LIZJ);
                                    c1315430kKr.LLILZIL = true;
                                    arrayList2.add(c1315430kKr);
                                    final s sVar = this.LIZ;
                                    C1315680kLG c1315680kLG = new C1315680kLG(sVar) { // from class: X.0kKs
                                        @Override // X.C1315680kLG
                                        public final void LJIIIIZZ(LynxError lynxError, int i4, int i5) {
                                        }

                                        @Override // X.C1315680kLG
                                        public final void LJIIIZ(int i4, int i5) {
                                        }

                                        @Override // X.C1315680kLG
                                        public final void LJ() {
                                            Drawable.Callback callback = c1315430kKr.LLJJ;
                                            if (callback != null) {
                                                callback.invalidateDrawable(this.LLJI);
                                            }
                                        }
                                    };
                                    c1315430kKr.LLJJIII = c1315680kLG;
                                    c1315680kLG.LJIIJ(c1315430kKr.LLIZ, c1315430kKr.LLILZLL, 0, 0, 0, 0);
                                    c1315430kKr.LLJJIII.LLJLILLLLZIIL = true;
                                    c1315680kLG.LJIJJ(c1316890kND.LIZLLL);
                                    if (c1311920kFC != null) {
                                        int i4 = c1311920kFC.LIZ;
                                        float f3 = c1311920kFC.LIZIZ;
                                        c1315430kKr.LL = i4;
                                        c1315430kKr.LLILLJJLI = f3;
                                    }
                                    C1313270kHN c1313270kHN = c1316890kND.LJ;
                                    if (c1313270kHN != null && (t = c1313270kHN.LIZIZ) != 0) {
                                        t.setBounds(0, 0, c1316890kND.LIZ, c1316890kND.LIZIZ);
                                        c1315430kKr.LLJILLL = c1316890kND.LJ;
                                    }
                                    c1315680kLG.LJJ();
                                    if (c1316720kMwLIZLLL != null) {
                                        c1315430kKr.LLJILJILJ = c1316720kMwLIZLLL.LJIILL;
                                    }
                                    arrayList.add(new C1316900kNE(iLJFF2, iLJFF4, c1315430kKr));
                                }
                            } else {
                                LIZIZ(iLJFF2, iLJFF4, arrayList, c1316720kMwLIZLLL, new C1312670kGP(this), false);
                            }
                            iLJFF = -1;
                            c1316890kND = null;
                            c1316720kMwLIZLLL = null;
                            iLJFF2 = 0;
                            z2 = true;
                            break;
                        case 2:
                            String string = it2.next().getString();
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            String strLIZ = C1317660kOS.LIZ(0, string);
                            spannableStringBuilder.append((CharSequence) strLIZ);
                            LIZIZ(0, strLIZ.length(), arrayList, c1316720kMwLIZLLL, new C1312670kGP(this), z ? 1 : 0);
                            break;
                        case 3:
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            float fLIZ = (float) it2.next().LIZ();
                            c1316720kMwLIZLLL.LJIILIIL = fLIZ;
                            fRound = Math.max(fRound, fLIZ);
                            break;
                        case 4:
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            c1316720kMwLIZLLL.LIZJ = Integer.valueOf(it2.next().LJFF());
                            break;
                        case 5:
                            int iLJFF5 = it2.next().LJFF();
                            if (z2) {
                                c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                c1316720kMwLIZLLL.LJIIIIZZ = iLJFF5;
                            }
                            break;
                        case 6:
                            int iLJFF6 = it2.next().LJFF();
                            if (z2) {
                                c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                c1316720kMwLIZLLL.LJIIIZ = iLJFF6;
                            }
                            break;
                        case 7:
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            c1316720kMwLIZLLL.LJI = it2.next().LJFF();
                            break;
                        case 8:
                            int iLJFF7 = it2.next().LJFF();
                            if (iLJFF7 != z && iLJFF7 != 2) {
                                i2 = 0;
                            } else {
                                i2 = 2;
                            }
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            c1316720kMwLIZLLL.LJII = i2;
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            c1316720kMwLIZLLL.LJIJJ = it2.next().getString();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            float fLIZ2 = (float) it2.next().LIZ();
                            if (z2) {
                                c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                if (Float.isNaN(fLIZ2) || fLIZ2 < 0.0f) {
                                    fLIZ2 = 1.0E21f;
                                }
                                c1316720kMwLIZLLL.LJIIJ = fLIZ2;
                            }
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            double dLIZ = it2.next().LIZ();
                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                            c1316720kMwLIZLLL.LJIIJJI = (float) dLIZ;
                            break;
                        default:
                            switch (iLJFF3) {
                                case 14:
                                    int iLJFF8 = it2.next().LJFF();
                                    int iLJFF9 = it2.next().LJFF();
                                    int iLJFF10 = it2.next().LJFF();
                                    c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                    c1316720kMwLIZLLL.LJJIJIL = iLJFF8;
                                    c1316720kMwLIZLLL.LJJIJL = iLJFF9;
                                    c1316720kMwLIZLLL.LJJIJLIJ = iLJFF10;
                                    break;
                                case 15:
                                    int iLJFF11 = it2.next().LJFF();
                                    if (z2) {
                                        c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                        c1316720kMwLIZLLL.LIZLLL = iLJFF11;
                                    }
                                    break;
                                case 16:
                                    c1311920kFC = new C1311920kFC();
                                    c1311920kFC.LIZ = it2.next().LJFF();
                                    c1311920kFC.LIZIZ = (float) it2.next().LIZ();
                                    z3 = true;
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    if (!z2) {
                                        it2.next().LJFF();
                                        it2.next().LIZ();
                                        it2.next().LIZ();
                                        it2.next().LIZ();
                                    } else {
                                        c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                        if (it2.next().LJFF() == 0) {
                                            z = false;
                                        }
                                        float fLIZ3 = (float) it2.next().LIZ();
                                        float fLIZ4 = (float) it2.next().LIZ();
                                        float fLIZ5 = (float) it2.next().LIZ();
                                        c1316720kMwLIZLLL.LJIJJLI = z;
                                        c1316720kMwLIZLLL.LJJ = fLIZ3;
                                        c1316720kMwLIZLLL.LJIL = fLIZ4;
                                        c1316720kMwLIZLLL.LJJI = fLIZ5;
                                    }
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    int iLJFF12 = it2.next().LJFF();
                                    if (!z2) {
                                        for (int i5 = 0; i5 < iLJFF12; i5++) {
                                            it2.next().LIZ();
                                        }
                                    } else {
                                        c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                        if (iLJFF12 <= 0) {
                                            c1316720kMwLIZLLL.LJJIFFI = null;
                                        } else {
                                            float[] fArr = new float[iLJFF12];
                                            int i6 = 0;
                                            do {
                                                fArr[i6] = (float) it2.next().LIZ();
                                                i6++;
                                            } while (i6 < iLJFF12);
                                            c1316720kMwLIZLLL.LJJIFFI = fArr;
                                        }
                                    }
                                    break;
                                case 19:
                                    int iLJFF13 = it2.next().LJFF();
                                    if (!z2) {
                                        for (int i7 = 0; i7 < iLJFF13; i7++) {
                                            it2.next().LJFF();
                                            it2.next().LJFF();
                                            it2.next().LIZ();
                                            it2.next().LIZ();
                                        }
                                    } else {
                                        c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                        if (iLJFF13 <= 0) {
                                            c1316720kMwLIZLLL.LJJII = null;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList(iLJFF13);
                                            int i8 = 0;
                                            do {
                                                arrayList3.add(new C1316830kN7((float) it2.next().LIZ(), (float) it2.next().LIZ(), it2.next().LJFF(), it2.next().LJFF()));
                                                i8++;
                                            } while (i8 < iLJFF13);
                                            if (arrayList3.isEmpty()) {
                                                arrayList3 = null;
                                            }
                                            c1316720kMwLIZLLL.LJJII = arrayList3;
                                        }
                                    }
                                    break;
                                default:
                                    switch (iLJFF3) {
                                        case 101:
                                            c1316890kND = new C1316890kND();
                                            c1316890kND.LIZLLL = it2.next().getString();
                                            z4 = true;
                                            break;
                                        case 102:
                                            iLJFF = it2.next().LJFF();
                                            break;
                                        case 103:
                                            int iLJFF14 = it2.next().LJFF();
                                            int iLJFF15 = it2.next().LJFF();
                                            if (c1316890kND != null) {
                                                c1316890kND.LIZ = iLJFF14;
                                                c1316890kND.LIZIZ = iLJFF15;
                                            }
                                            break;
                                        case 104:
                                            int[] iArr = new int[4];
                                            iArr[0] = it2.next().LJFF();
                                            iArr[z ? 1 : 0] = it2.next().LJFF();
                                            iArr[2] = it2.next().LJFF();
                                            iArr[3] = it2.next().LJFF();
                                            if (c1316890kND != null) {
                                                c1316890kND.LIZJ = iArr;
                                            }
                                            break;
                                        case 105:
                                            double dLIZ2 = it2.next().LIZ();
                                            int iLJFF16 = it2.next().LJFF();
                                            double dLIZ3 = it2.next().LIZ();
                                            int iLJFF17 = it2.next().LJFF();
                                            double dLIZ4 = it2.next().LIZ();
                                            int iLJFF18 = it2.next().LJFF();
                                            double dLIZ5 = it2.next().LIZ();
                                            int iLJFF19 = it2.next().LJFF();
                                            if (c1316890kND != null) {
                                                C1313270kHN c1313270kHN2 = new C1313270kHN(this.LIZ);
                                                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                                                javaOnlyArray.pushDouble(dLIZ2);
                                                javaOnlyArray.pushInt(iLJFF16);
                                                javaOnlyArray.pushDouble(dLIZ2);
                                                javaOnlyArray.pushInt(iLJFF16);
                                                javaOnlyArray.pushDouble(dLIZ3);
                                                javaOnlyArray.pushInt(iLJFF17);
                                                javaOnlyArray.pushDouble(dLIZ3);
                                                javaOnlyArray.pushInt(iLJFF17);
                                                javaOnlyArray.pushDouble(dLIZ4);
                                                javaOnlyArray.pushInt(iLJFF18);
                                                javaOnlyArray.pushDouble(dLIZ4);
                                                javaOnlyArray.pushInt(iLJFF18);
                                                javaOnlyArray.pushDouble(dLIZ5);
                                                javaOnlyArray.pushInt(iLJFF19);
                                                javaOnlyArray.pushDouble(dLIZ5);
                                                javaOnlyArray.pushInt(iLJFF19);
                                                c1313270kHN2.LJIILLIIL(0, javaOnlyArray);
                                                c1316890kND.LJ = c1313270kHN2;
                                            }
                                            break;
                                        case 106:
                                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
                                            javaOnlyArray2.pushDouble(it2.next().LIZ());
                                            int iLJFF20 = it2.next().LJFF();
                                            JavaOnlyArray javaOnlyArray3 = new JavaOnlyArray();
                                            if (iLJFF20 > 0) {
                                                int i9 = 0;
                                                do {
                                                    javaOnlyArray3.pushInt(it2.next().LJFF());
                                                    i9++;
                                                } while (i9 < iLJFF20);
                                            }
                                            javaOnlyArray2.pushArray(javaOnlyArray3);
                                            int iLJFF21 = it2.next().LJFF();
                                            JavaOnlyArray javaOnlyArray4 = new JavaOnlyArray();
                                            if (iLJFF21 > 0) {
                                                int i10 = 0;
                                                do {
                                                    javaOnlyArray4.pushDouble(it2.next().LIZ());
                                                    i10++;
                                                } while (i10 < iLJFF21);
                                            }
                                            javaOnlyArray2.pushArray(javaOnlyArray4);
                                            javaOnlyArray2.pushInt(it2.next().LJFF());
                                            c1316720kMwLIZLLL.LJJJ = new C1315150kKP(javaOnlyArray2);
                                            break;
                                        case 107:
                                            c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                                            JavaOnlyArray javaOnlyArray5 = new JavaOnlyArray();
                                            JavaOnlyArray javaOnlyArray6 = new JavaOnlyArray();
                                            javaOnlyArray6.pushInt(it2.next().LJFF());
                                            int iLJFF22 = it2.next().LJFF();
                                            javaOnlyArray6.pushInt(iLJFF22);
                                            javaOnlyArray6.pushInt(it2.next().LJFF());
                                            javaOnlyArray6.pushDouble(it2.next().LIZ());
                                            javaOnlyArray6.pushInt(it2.next().LJFF());
                                            javaOnlyArray6.pushDouble(it2.next().LIZ());
                                            int i11 = 0;
                                            do {
                                                javaOnlyArray6.pushInt(0);
                                                i11++;
                                            } while (i11 < 4);
                                            if (iLJFF22 == 4) {
                                                javaOnlyArray6.pushDouble(it2.next().LIZ());
                                                javaOnlyArray6.pushInt(it2.next().LJFF());
                                                javaOnlyArray6.pushDouble(it2.next().LIZ());
                                                javaOnlyArray6.pushInt(it2.next().LJFF());
                                            }
                                            javaOnlyArray5.pushArray(javaOnlyArray6);
                                            int iLJFF23 = it2.next().LJFF();
                                            JavaOnlyArray javaOnlyArray7 = new JavaOnlyArray();
                                            if (iLJFF23 > 0) {
                                                int i12 = 0;
                                                do {
                                                    javaOnlyArray7.pushInt(it2.next().LJFF());
                                                    i12++;
                                                } while (i12 < iLJFF23);
                                            }
                                            javaOnlyArray5.pushArray(javaOnlyArray7);
                                            int iLJFF24 = it2.next().LJFF();
                                            JavaOnlyArray javaOnlyArray8 = new JavaOnlyArray();
                                            if (iLJFF24 > 0) {
                                                int i13 = 0;
                                                do {
                                                    javaOnlyArray8.pushDouble(it2.next().LIZ());
                                                    i13++;
                                                } while (i13 < iLJFF24);
                                            }
                                            javaOnlyArray5.pushArray(javaOnlyArray8);
                                            c1316720kMwLIZLLL.LJJJ = new C1315130kKN(javaOnlyArray5);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    int iLJFF25 = it2.next().LJFF();
                    if (z2) {
                        c1316720kMwLIZLLL = LIZLLL(c1316720kMwLIZLLL);
                        c1316720kMwLIZLLL.LIZ = iLJFF25;
                    }
                }
                z = true;
            } else {
                spannableStringBuilder.length();
                for (int size = arrayList.size() - (z ? 1 : 0); size >= 0; size--) {
                    ((C1316900kNE) ListProtector.get(arrayList, size)).LIZ(spannableStringBuilder);
                }
                if (c1316720kMwLIZLLL == null) {
                    return;
                }
                if (z3) {
                    float f4 = (-fRound) * 1.2f * 0.78f;
                    float f5 = fRound * 1.2f;
                    float f6 = 0.22f * f5;
                    float f7 = f5 * 0.5f;
                    float f8 = c1316720kMwLIZLLL.LJIIJ;
                    if (f8 != 1.0E21f) {
                        f = f8;
                    }
                    C1316870kNB c1316870kNB = new C1316870kNB(Arrays.asList(Float.valueOf(f4), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f)));
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        ((AbstractC1316910kNF) ListProtector.get(arrayList2, i14)).LLILZ = c1316870kNB;
                    }
                }
                c1316720kMwLIZLLL.LJIILLIIL = z4;
                c1316720kMwLIZLLL.LJIIZILJ = !map.isEmpty();
                C1316920kNG c1316920kNG = new C1316920kNG(spannableStringBuilder, c1316720kMwLIZLLL);
                if (!map.isEmpty()) {
                    c1316920kNG.LIZJ = map;
                }
                this.LIZJ.put(i, c1316920kNG);
                return;
            }
        }
    }

    public final void LIZIZ(int i, int i2, List<C1316900kNE> list, C1316720kMw c1316720kMw, C1312670kGP c1312670kGP, boolean z) {
        boolean z2;
        boolean z3;
        if (c1316720kMw == null) {
            return;
        }
        if (z && !C1314570kJT.LIZ(c1316720kMw.LJIIJ) && (c1316720kMw.LJIIIIZZ != 1 || c1316720kMw.LJIILLIIL || c1316720kMw.LJIIZILJ)) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, new C1316740kMy(0, c1316720kMw.LJIIJ, true, false)));
        }
        if (c1316720kMw.LJIIJJI != 1.0E21f) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, new C1316880kNC(c1316720kMw.LJIIJJI)));
        }
        if (c1316720kMw.LJJIJL == 4 && c1316720kMw.LJJIJLIJ == 0) {
            if ((c1316720kMw.LJJIJIL & 2) != 0) {
                ((ArrayList) list).add(new C1316900kNE(i, i2, new LynxStrikethroughSpan()));
            }
            if ((c1316720kMw.LJJIJIL & 1) != 0) {
                ((ArrayList) list).add(new C1316900kNE(i, i2, new LynxUnderlineSpan()));
            }
        } else {
            int i3 = c1316720kMw.LJJIJIL;
            if ((i3 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 || z3) {
                ((ArrayList) list).add(new C1316900kNE(i, i2, new C1316930kNH(z2, z3, c1316720kMw.LJJIJL, c1316720kMw.LJJIJLIJ)));
            }
        }
        if (c1316720kMw.LJJJ != null) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, new C1316800kN4(c1316720kMw.LJJJ)));
        }
        if (z) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C1316900kNE(i, i2, new AbsoluteSizeSpan(Math.round(c1316720kMw.LJIILIIL))));
        if (c1316720kMw.LIZJ != null) {
            arrayList.add(new C1316900kNE(i, i2, new C1316790kN3(c1316720kMw.LIZJ.intValue())));
        }
        if (!TextUtils.isEmpty(c1316720kMw.LJIJJ)) {
            Typeface typefaceLJ = C1300980jxY.LJ(0, this.LIZ, c1316720kMw.LJIJJ);
            if (typefaceLJ == null) {
                C1301060jxg.LIZ.LJ(this.LIZ, c1316720kMw.LJIJJ, 0, c1312670kGP);
                typefaceLJ = DeviceUtils.LIZ();
            }
            arrayList.add(new C1316900kNE(i, i2, new C1316960kNK(typefaceLJ)));
        }
        int i4 = c1316720kMw.LJI;
        if (i4 == 1 || ((i4 >= 6 && i4 <= 10) || c1316720kMw.LJII > 0)) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new C1316900kNE(i, i2, new C1316820kN6(c1316720kMw.LJII, c1316720kMw.LJI, c1316720kMw.LJIJJ, c1316720kMw.LIZJ(), c1316720kMw.LJJIIZ, c1316720kMw.LJJIII)));
            } else {
                arrayList.add(new C1316900kNE(i, i2, new StyleSpan(c1316720kMw.LJ())));
            }
        }
        int i5 = c1316720kMw.LIZLLL;
        if (i5 == 2) {
            arrayList.add(new C1316900kNE(i, i2, new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE)));
        } else {
            if (i5 != 1) {
                return;
            }
            arrayList.add(new C1316900kNE(i, i2, new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER)));
        }
    }

    public final float[] LJ(int i, float f, int i2, float f2, int i3, float[] fArr) {
        C1316760kN0 c1316760kN0;
        C1316920kNG c1316920kNG = (C1316920kNG) this.LIZJ.get(i);
        if (c1316920kNG != null) {
            for (int i4 = 0; i4 < fArr.length / 4; i4++) {
                int i5 = (int) fArr[i4 * 4];
                HashMap<Integer, C1316760kN0> map = c1316920kNG.LIZJ;
                if (map != null && (c1316760kN0 = map.get(Integer.valueOf(i5))) != null) {
                    int iCeil = (int) Math.ceil(fArr[r12 + 1]);
                    int iCeil2 = (int) Math.ceil(fArr[r12 + 2]);
                    int iCeil3 = (int) Math.ceil(fArr[r12 + 3]);
                    c1316760kN0.LLIZ = iCeil;
                    c1316760kN0.LLILZLL = iCeil2;
                    c1316760kN0.LLIZLLLIL = iCeil3;
                }
            }
        }
        EnumC1300260jwO enumC1300260jwOFromInt = EnumC1300260jwO.fromInt(i2);
        EnumC1300260jwO enumC1300260jwOFromInt2 = EnumC1300260jwO.fromInt(i3);
        new C1312670kGP(this);
        float[] fArr2 = new float[3];
        C1316920kNG c1316920kNG2 = (C1316920kNG) this.LIZJ.get(i);
        if (c1316920kNG2 != null) {
            C1316730kMx c1316730kMx = new C1316730kMx(this.LIZ, new C1316750kMz(c1316920kNG2.LIZ, c1316920kNG2.LIZIZ, enumC1300260jwOFromInt, enumC1300260jwOFromInt2, f, f2, 0, false, true, true));
            float fLJIIIIZZ = c1316730kMx.LJIIIIZZ();
            float fLJI = c1316730kMx.LJI();
            Layout layout = c1316730kMx.LIZ;
            int lineBaseline = layout.getLineBaseline(0);
            int iLJII = c1316730kMx.LJII();
            float[] fArr3 = new float[(iLJII * 3) + 4];
            fArr3[0] = fLJI;
            fArr3[1] = fLJIIIIZZ;
            fArr3[2] = lineBaseline;
            fArr3[3] = iLJII;
            for (int i6 = 0; i6 < iLJII; i6++) {
                int lineStart = layout.getLineStart(i6);
                int lineEnd = layout.getLineEnd(i6);
                int ellipsisCount = layout.getEllipsisCount(i6);
                int i7 = (i6 * 3) + 4;
                fArr3[i7] = lineStart;
                fArr3[i7 + 1] = lineEnd;
                fArr3[i7 + 2] = ellipsisCount;
            }
            if (iLJII > 0) {
                int length = c1316920kNG2.LIZ.length();
                int i8 = ((iLJII - 1) * 3) + 4;
                int i9 = i8 + 1;
                int i10 = i8 + 2;
                int i11 = (int) fArr3[i9];
                int i12 = (int) fArr3[i10];
                int i13 = c1316730kMx.LIZJ;
                if (i13 > 0) {
                    i12 = i13;
                } else if (iLJII < layout.getLineCount() || c1316920kNG2.LIZIZ.LJIIIZ == 0) {
                    i12 = length - i11;
                }
                fArr3[i10] = i12;
                fArr3[i9] = length;
            }
            C1316780kN2 c1316780kN2 = new C1316780kN2(layout, c1316920kNG2.LIZIZ.LJIILLIIL, null, false);
            c1316780kN2.LJ = new PointF(c1316730kMx.LIZLLL, c1316730kMx.LJ);
            c1316780kN2.LJI = c1316920kNG2.LIZ;
            int i14 = c1316920kNG2.LIZIZ.LJIIIZ;
            int iLJII2 = c1316730kMx.LJII();
            int i15 = c1316730kMx.LIZJ;
            int length2 = c1316920kNG2.LIZ.length();
            float fLIZLLL = c1316730kMx.LIZLLL();
            c1316780kN2.LJIIIZ = i14;
            c1316780kN2.LJII = iLJII2;
            c1316780kN2.LJIIIIZZ = i15;
            c1316780kN2.LJIIJ = length2;
            c1316780kN2.LJIIJJI = fLIZLLL;
            c1316780kN2.LJIIL = true;
            this.LIZIZ.put(i, c1316780kN2);
            return fArr3;
        }
        return fArr2;
    }
}
