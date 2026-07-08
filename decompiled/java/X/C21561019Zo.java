package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.19Zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21561019Zo extends C19SB {
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final ArrayList<C807880Vmc> LLILZIL;
    public final RectF LLILZLL;
    public final Rect LLIZ;
    public final Rect LLIZLLLIL;
    public final C21627319kV LLJ;
    public int LLJI;
    public int LLJIJIL;
    public ValueAnimator LLJILJIL;
    public boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final Map<String, Float> LLJJ;
    public final Map<String, Rect> LLJJI;
    public final Map<String, Rect> LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public List<C807880Vmc> LLJJJ;
    public float LLJJJIL;
    public List<C807880Vmc> LLJJJJ;
    public long LLJJJJJIL;

    public C21561019Zo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean getCountDownEnable() {
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
    }

    public final void setAnimatingHide(boolean z) {
    }

    public final int getlyricsLineCount() {
        return this.LLILZIL.size();
    }

    public final int getAddedLines() {
        return this.LLJJIJI;
    }

    public final int getAnimationY() {
        return this.LLJIJIL;
    }

    public final int getCurShowIndex() {
        return this.LLJI;
    }

    public final int getCurToAddLineIndex() {
        return this.LLILZ;
    }

    public final long getCurrMusicProcess() {
        return this.LLILLJJLI;
    }

    @Override // X.C19SB
    public ArrayList<C807880Vmc> getCurrentLyrics() {
        return this.LLILZIL;
    }

    public final RectF getDynamicRectF() {
        return this.LLILZLL;
    }

    public final C21627319kV getFormatter() {
        return this.LLJ;
    }

    public final boolean getInScroll() {
        return this.LLJJIJIL;
    }

    public final long getLastMusicProcess() {
        return this.LLILLL;
    }

    public final ArrayList<C807880Vmc> getLyricsLineInfos() {
        return this.LLILZIL;
    }

    public final Rect getLyricsRect() {
        return this.LLIZ;
    }

    public final int getPrevShowIndex() {
        return this.LLJJIJIIJIL;
    }

    public final long getProgress() {
        return this.LLILLJJLI;
    }

    public final ValueAnimator getScrollAnimator() {
        return this.LLJILJIL;
    }

    public final Map<String, Float> getTextMeasuredLengthMap() {
        return this.LLJJ;
    }

    public final Rect LJ(String str) {
        if (((LinkedHashMap) this.LLJJI).get(str) != null) {
            Rect rect = (Rect) ((LinkedHashMap) this.LLJJI).get(str);
            if (rect == null) {
                return new Rect();
            }
            return rect;
        }
        Rect rect2 = new Rect();
        getConfig().LJFF.getTextBounds(str, 0, str.length(), rect2);
        this.LLJJI.put(str, rect2);
        return rect2;
    }

    public final float LJFF(String str) {
        Float fValueOf;
        if (str != null) {
            if (((LinkedHashMap) this.LLJJ).get(str) != null) {
                fValueOf = (Float) ((LinkedHashMap) this.LLJJ).get(str);
            } else {
                float fMeasureText = getConfig().LJFF.measureText(str);
                this.LLJJ.put(str, Float.valueOf(fMeasureText));
                fValueOf = Float.valueOf(fMeasureText);
            }
            if (fValueOf != null) {
                return fValueOf.floatValue();
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void LJI(String str) {
        getConfig().LIZLLL.LIZ = !this.LLJ.LIZLLL(str);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C807880Vmc c807880Vmc;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null);
        if (this.LLJI < this.LLILZIL.size() && (c807880Vmc = (C807880Vmc) ListProtector.get(this.LLILZIL, this.LLJI)) != null) {
            String str = c807880Vmc.LIZJ;
            if (str == null) {
                str = "";
            }
            this.LLIZ.set(LJ(str));
            C19QP c19qp = getConfig().LIZLLL;
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            float fLIZIZ = c19qp.LIZIZ(measuredWidth);
            C19QP c19qp2 = getConfig().LIZLLL;
            getMeasuredWidth();
            getMeasuredHeight();
            float fLIZJ = c19qp2.LIZJ(this.LLJIJIL, this.LLIZ);
            canvas.drawText(str, fLIZIZ, fLIZJ, getConfig().LJI);
            int i = getConfig().LIZJ + 1;
            for (int i2 = 1; i2 < i; i2++) {
                LIZJ(fLIZIZ, fLIZJ, i2, canvas);
            }
            canvas.restoreToCount(iSaveLayer);
            if (getConfig().LJIIIIZZ == 3) {
                canvas.clipRect(this.LLILZLL);
                canvas.drawText(str, fLIZIZ, fLIZJ, getConfig().LJFF);
            }
        }
    }

    public final void setAddedLines(int i) {
        this.LLJJIJI = i;
    }

    public final void setAnimating(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setAnimationY(int i) {
        this.LLJIJIL = i;
    }

    public final void setCurShowIndex(int i) {
        this.LLJI = i;
    }

    public final void setCurToAddLineIndex(int i) {
        this.LLILZ = i;
    }

    public final void setCurrMusicProcess(long j) {
        this.LLILLJJLI = j;
    }

    public final void setInScroll(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setLastMusicProcess(long j) {
        this.LLILLL = j;
    }

    public final void setPrevShowIndex(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setScrollAnimator(ValueAnimator valueAnimator) {
        this.LLJILJIL = valueAnimator;
    }

    public void LIZ(long j, List list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            this.LLJJJJ = list;
            if (getConfig().LIZ <= 0.0f) {
                if (getWidth() > 0) {
                    getConfig().LIZ = getWidth();
                } else {
                    this.LLJJJ = list;
                    return;
                }
            }
            this.LLJJJJJIL = j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addLyrics inputCount=");
            sbLIZ.append(list.size());
            sbLIZ.append(" offset=");
            sbLIZ.append(j);
            sbLIZ.append(" lyricsType=");
            sbLIZ.append(getConfig().LJIIIIZZ);
            sbLIZ.append(" currProgress=");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("CommonLyricDisplay", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZIL.clear();
            this.LLJJIJI = 0;
            this.LLIZ.setEmpty();
            this.LLILZLL.setEmpty();
            this.LLIZLLLIL.setEmpty();
            ((LinkedHashMap) this.LLJJ).clear();
            ((LinkedHashMap) this.LLJJI).clear();
            ((LinkedHashMap) this.LLJJIII).clear();
            this.LLJI = 0;
            this.LLJJIJIIJIL = -1;
            this.LLJILJILJ = false;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C807880Vmc c807880Vmc = (C807880Vmc) it2.next();
                if (!TextUtils.isEmpty(c807880Vmc.LIZJ)) {
                    float f = getConfig().LIZ;
                    String str = c807880Vmc.LIZJ;
                    Paint paint = getConfig().LJFF;
                    this.LLJJIJI = i;
                    this.LLJJJIL = f;
                    if (paint.measureText(str) <= f) {
                        int i2 = this.LLILZ + 1;
                        this.LLILZ = i2;
                        if (this.LLJJIJI < i2) {
                            this.LLILZIL.add(c807880Vmc);
                        }
                    } else if (getConfig().LJIIIIZZ == 2) {
                        C807880Vmc c807880Vmc2 = new C807880Vmc();
                        C807880Vmc c807880Vmc3 = new C807880Vmc();
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder();
                        String str2 = c807880Vmc.LIZJ;
                        if (str2 != null) {
                            int length = str2.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                char cCharAt = str2.charAt(i3);
                                sb.append(cCharAt);
                                if (paint.measureText(sb.toString()) > f) {
                                    sb3.append(cCharAt);
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            c807880Vmc2.LIZ = c807880Vmc.LIZ;
                            c807880Vmc2.LIZJ = sb2.toString();
                            int i4 = this.LLILZ + 1;
                            this.LLILZ = i4;
                            if (this.LLJJIJI < i4) {
                                this.LLILZIL.add(c807880Vmc2);
                            }
                            c807880Vmc3.LIZ = c807880Vmc.LIZ + 4000;
                            c807880Vmc3.LIZJ = sb3.toString();
                            int i5 = this.LLILZ + 1;
                            this.LLILZ = i5;
                            if (this.LLJJIJI < i5) {
                                this.LLILZIL.add(c807880Vmc3);
                            }
                        }
                    } else if (getConfig().LJIIIIZZ == 3) {
                        C807880Vmc c807880Vmc4 = new C807880Vmc();
                        C807880Vmc c807880Vmc5 = new C807880Vmc();
                        StringBuilder sb4 = new StringBuilder();
                        String[] strArr = c807880Vmc.LIZLLL;
                        if (strArr != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            StringBuilder sb5 = new StringBuilder();
                            StringBuilder sb6 = new StringBuilder();
                            ArrayList arrayList4 = new ArrayList();
                            int i6 = c807880Vmc.LIZ;
                            int length2 = strArr.length;
                            for (int i7 = 0; i7 < length2; i7++) {
                                String str3 = strArr[i7];
                                sb4.append(str3);
                                if (paint.measureText(sb4.toString()) > f) {
                                    arrayList3.add(str3);
                                    sb6.append(str3);
                                    int[] iArr = c807880Vmc.LJ;
                                    if (iArr != null && i7 < iArr.length) {
                                        arrayList4.add(Integer.valueOf(iArr[i7]));
                                    }
                                } else {
                                    arrayList.add(str3);
                                    sb5.append(str3);
                                    int[] iArr2 = c807880Vmc.LJ;
                                    if (iArr2 != null && i7 < iArr2.length) {
                                        arrayList2.add(Integer.valueOf(iArr2[i7]));
                                        i6 += iArr2[i7];
                                    }
                                }
                            }
                            c807880Vmc4.LIZ = c807880Vmc.LIZ;
                            c807880Vmc4.LIZLLL = (String[]) arrayList.toArray(new String[0]);
                            c807880Vmc4.LJ = new int[arrayList2.size()];
                            int size = arrayList2.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                int[] iArr3 = c807880Vmc4.LJ;
                                if (iArr3 != null) {
                                    iArr3[i8] = ((Number) ListProtector.get(arrayList2, i8)).intValue();
                                }
                            }
                            if (this.LLJILLL) {
                                c807880Vmc4.LIZJ = a0.LJLIIIL(sb5.toString()).toString();
                            } else {
                                c807880Vmc4.LIZJ = sb5.toString();
                            }
                            int i9 = this.LLILZ + 1;
                            this.LLILZ = i9;
                            if (this.LLJJIJI < i9) {
                                this.LLILZIL.add(c807880Vmc4);
                            }
                            c807880Vmc5.LIZ = i6;
                            c807880Vmc5.LIZLLL = (String[]) arrayList3.toArray(new String[0]);
                            c807880Vmc5.LJ = new int[arrayList4.size()];
                            int size2 = arrayList4.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                int[] iArr4 = c807880Vmc5.LJ;
                                if (iArr4 != null) {
                                    iArr4[i10] = ((Number) ListProtector.get(arrayList4, i10)).intValue();
                                }
                            }
                            c807880Vmc5.LIZJ = sb6.toString();
                            int i11 = this.LLILZ + 1;
                            this.LLILZ = i11;
                            if (this.LLJJIJI < i11) {
                                this.LLILZIL.add(c807880Vmc5);
                            }
                        }
                    }
                    i = 0;
                }
            }
            long j2 = this.LLILLJJLI;
            if (j2 <= 0) {
                j2 = j;
            }
            this.LLJI = LIZLLL(j2, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addLyrics resolved adjustedCount=");
            sbLIZ2.append(this.LLILZIL.size());
            sbLIZ2.append(" curShowIndex=");
            sbLIZ2.append(this.LLJI);
            sbLIZ2.append(" currentOffset=");
            sbLIZ2.append(j2);
            C20441214yg.LJIIIZ("CommonLyricDisplay", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LIZIZ(long j, Function1<? super String, Unit> function1) {
        float fLJFF;
        int i;
        String str;
        if (this.LLJI >= this.LLILZIL.size()) {
            return;
        }
        C807880Vmc c807880Vmc = (C807880Vmc) ListProtector.get(this.LLILZIL, this.LLJI);
        if (this.LLJJIJIIJIL != this.LLJI) {
            String str2 = c807880Vmc.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            LJI(str2);
            this.LLJJIJIIJIL = this.LLJI;
        }
        float fLJFF2 = LJFF(c807880Vmc.LIZJ);
        long j2 = j - ((long) c807880Vmc.LIZ);
        if (getConfig().LJIIIIZZ == 3) {
            StringBuilder sb = new StringBuilder();
            int[] iArr = c807880Vmc.LJ;
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int[] iArr2 = c807880Vmc.LJFF;
                    if (iArr2 != null) {
                        i = iArr2[i2];
                    } else {
                        i = 0;
                    }
                    long j3 = i;
                    long j4 = ((long) iArr[i2]) + j3;
                    String[] strArr = c807880Vmc.LIZLLL;
                    if (strArr == null || (str = strArr[i2]) == null) {
                        str = "";
                    }
                    if (j2 < j4) {
                        if (j2 >= j3) {
                            fLJFF = (LJFF(str) / iArr[i2]) * (j2 - j3);
                        }
                    } else {
                        sb.append(str);
                        i2++;
                    }
                }
                fLJFF = 0.0f;
            } else {
                fLJFF = 0.0f;
            }
            String string = sb.toString();
            if (function1 != null) {
                function1.invoke(string);
            }
            float fLJFF3 = LJFF(string) + fLJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculateLineProgress[KRC] playTime=");
            sbLIZ.append(j);
            sbLIZ.append(" lineIndex=");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(" lyric=\"");
            sbLIZ.append(c807880Vmc.LIZJ);
            sbLIZ.append("\" start=");
            sbLIZ.append(c807880Vmc.LIZ);
            sbLIZ.append(" completedWords=\"");
            sbLIZ.append(string);
            sbLIZ.append("\" distance=");
            sbLIZ.append(fLJFF3);
            sbLIZ.append(" lineLen=");
            sbLIZ.append(fLJFF2);
            C20441214yg.LIZIZ("CommonLyricDisplay", C2188811AlT.LIZIZ(sbLIZ));
            getConfig().LIZLLL.LIZ(this.LLILZLL, getMeasuredHeight(), getMeasuredWidth(), fLJFF2, fLJFF3);
            return;
        }
        float fIntValue = j2 / ((Number) c807880Vmc.LJI.getValue()).intValue();
        float f = fLJFF2 * fIntValue;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("calculateLineProgress[LRC] playTime=");
        sbLIZ2.append(j);
        sbLIZ2.append(" lineIndex=");
        sbLIZ2.append(this.LLJI);
        sbLIZ2.append(" lyric=\"");
        sbLIZ2.append(c807880Vmc.LIZJ);
        sbLIZ2.append("\" start=");
        sbLIZ2.append(c807880Vmc.LIZ);
        sbLIZ2.append(" end=");
        sbLIZ2.append(c807880Vmc.LIZIZ);
        sbLIZ2.append(" delta=");
        sbLIZ2.append(j2);
        sbLIZ2.append(" duration=");
        sbLIZ2.append(((Number) c807880Vmc.LJI.getValue()).intValue());
        sbLIZ2.append(" distance=");
        sbLIZ2.append(f);
        sbLIZ2.append(" percent=");
        sbLIZ2.append(fIntValue);
        C20441214yg.LIZIZ("CommonLyricDisplay", C2188811AlT.LIZIZ(sbLIZ2));
        getConfig().LIZLLL.LIZ(this.LLILZLL, getMeasuredHeight(), getMeasuredWidth(), fLJFF2, f);
    }

    public final int LIZLLL(long j, Function1<? super String, Unit> function1) {
        int size = this.LLILZIL.size();
        for (int i = 0; i < size; i++) {
            ListProtector.get(this.LLILZIL, i).getClass();
            if (j < ((C807880Vmc) ListProtector.get(this.LLILZIL, 0)).LIZ) {
                return 0;
            }
            if (j < ((C807880Vmc) ListProtector.get(this.LLILZIL, i)).LIZ && i > 0) {
                if (getConfig().LJIIIIZZ == 3 || getConfig().LJIIIIZZ == 2) {
                    LIZIZ(j, function1);
                }
                return i - 1;
            }
            if (i == this.LLILZIL.size() - 1 && j >= ((C807880Vmc) ListProtector.get(this.LLILZIL, i)).LIZ) {
                if (getConfig().LJIIIIZZ == 3 || getConfig().LJIIIIZZ == 2) {
                    LIZIZ(j, function1);
                }
                return this.LLILZIL.size() - 1;
            }
        }
        return 0;
    }

    public C21561019Zo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILZIL = new ArrayList<>();
        this.LLILZLL = new RectF();
        this.LLIZ = new Rect();
        this.LLIZLLLIL = new Rect();
        C497740JfY.LIZ(20.0f);
        this.LLJ = C21627319kV.LIZJ();
        this.LLJILLL = true;
        this.LLJJ = new LinkedHashMap();
        this.LLJJI = new LinkedHashMap();
        this.LLJJIII = new LinkedHashMap();
        this.LLJJIJIIJIL = -1;
    }

    public final void LIZJ(float f, float f2, int i, Canvas canvas) {
        C807880Vmc c807880Vmc;
        if (this.LLJI + i < this.LLILZIL.size() && (c807880Vmc = (C807880Vmc) ListProtector.get(this.LLILZIL, this.LLJI + i)) != null) {
            String str = c807880Vmc.LIZJ;
            if (str == null) {
                str = "";
            }
            float fLIZIZ = f2 + (((int) C497740JfY.LIZIZ(17.0f)) * i);
            getConfig().getClass();
            if ((((int) C497740JfY.LIZIZ(4.0f)) * i) + fLIZIZ < getMeasuredHeight() + this.LLIZLLLIL.height() && canvas != null) {
                getConfig().getClass();
                canvas.drawText(str, f, fLIZIZ + (((int) C497740JfY.LIZIZ(4.0f)) * i), getConfig().LJ);
            }
        }
    }

    @Override // X.C19SB, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        List<C807880Vmc> list;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && ((int) this.LLJJJIL) != i) {
            z = true;
        } else {
            z = false;
        }
        getConfig().LIZ = i;
        if (z && (list = this.LLJJJJ) != null && list.size() > 0) {
            LIZ(this.LLJJJJJIL, this.LLJJJJ);
        }
    }
}
