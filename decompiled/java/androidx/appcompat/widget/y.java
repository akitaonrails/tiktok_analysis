package androidx.appcompat.widget;

import X.C1855960yOg;
import X.C21370318k9;
import X.C21410318qb;
import X.C2188811AlT;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes33.dex */
public class y {
    public static final RectF LJIIJJI = new RectF();
    public static final ConcurrentHashMap<String, Method> LJIIL = new ConcurrentHashMap<>();
    public int LIZ;
    public boolean LIZIZ;
    public float LIZJ = -1.0f;
    public float LIZLLL = -1.0f;
    public float LJ = -1.0f;
    public int[] LJFF = new int[0];
    public boolean LJI;
    public TextPaint LJII;
    public final TextView LJIIIIZZ;
    public final Context LJIIIZ;
    public final C21370318k9 LJIIJ;

    public final boolean LJII() {
        boolean z = this.LJFF.length > 0;
        this.LJI = z;
        if (z) {
            this.LIZ = 1;
            this.LIZLLL = r4[0];
            this.LJ = r4[r3 - 1];
            this.LIZJ = -1.0f;
        }
        return z;
    }

    public final boolean LJIIIIZZ() {
        return !(this.LJIIIIZZ instanceof C21410318qb);
    }

    public final void LIZ() {
        if (!LJIIIIZZ() || this.LIZ == 0) {
            return;
        }
        if (this.LIZIZ) {
            if (this.LJIIIIZZ.getMeasuredHeight() <= 0 || this.LJIIIIZZ.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.LJIIJ.LIZIZ(this.LJIIIIZZ) ? 1048576 : (this.LJIIIIZZ.getMeasuredWidth() - this.LJIIIIZZ.getTotalPaddingLeft()) - this.LJIIIIZZ.getTotalPaddingRight();
            int height = (this.LJIIIIZZ.getHeight() - this.LJIIIIZZ.getCompoundPaddingBottom()) - this.LJIIIIZZ.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = LJIIJJI;
            synchronized (rectF) {
                try {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fLIZJ = LIZJ(rectF);
                    if (fLIZJ != this.LJIIIIZZ.getTextSize()) {
                        LJFF(fLIZJ, 0);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZIZ = true;
    }

    public final boolean LJI() {
        if (LJIIIIZZ() && this.LIZ == 1) {
            if (!this.LJI || this.LJFF.length == 0) {
                int iFloor = ((int) Math.floor((this.LJ - this.LIZLLL) / this.LIZJ)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.LIZLLL + (i * this.LIZJ));
                }
                this.LJFF = LIZIZ(iArr);
            }
            this.LIZIZ = true;
        } else {
            this.LIZIZ = false;
        }
        return this.LIZIZ;
    }

    public y(TextView textView) {
        this.LJIIIIZZ = textView;
        this.LJIIIZ = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.LJIIJ = new C21370318k9() { // from class: X.18kA
                @Override // X.C1856340yPI
                public boolean LIZIZ(TextView textView2) {
                    return textView2.isHorizontallyScrollable();
                }

                @Override // X.C21370318k9, X.C1856340yPI
                public void LIZ(StaticLayout.Builder builder, TextView textView2) {
                    builder.setTextDirection(textView2.getTextDirectionHeuristic());
                }
            };
        } else {
            this.LJIIJ = new C21370318k9();
        }
    }

    public static int[] LIZIZ(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < length);
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) ListProtector.get(arrayList, i3)).intValue();
        }
        return iArr2;
    }

    public static Method LIZLLL(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = LJIIL;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final int LIZJ(RectF rectF) {
        CharSequence transformation;
        int length = this.LJFF.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.LJFF[i4];
                CharSequence text = this.LJIIIIZZ.getText();
                TransformationMethod transformationMethod = this.LJIIIIZZ.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.LJIIIIZZ)) != null) {
                    text = transformation;
                }
                int maxLines = this.LJIIIIZZ.getMaxLines();
                TextPaint textPaint = this.LJII;
                if (textPaint == null) {
                    this.LJII = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.LJII.set(this.LJIIIIZZ.getPaint());
                this.LJII.setTextSize(i5);
                StaticLayout staticLayoutLIZ = C1855960yOg.LIZ(text, (Layout.Alignment) LJ(this.LJIIIIZZ, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.LJIIIIZZ, this.LJII, this.LJIIJ);
                if ((maxLines != -1 && (staticLayoutLIZ.getLineCount() > maxLines || staticLayoutLIZ.getLineEnd(staticLayoutLIZ.getLineCount() - 1) != text.length())) || staticLayoutLIZ.getHeight() > rectF.bottom) {
                    i3 = i4 - 1;
                    i = i3;
                } else {
                    i3 = i2;
                    i2 = i4 + 1;
                }
            }
            return this.LJFF[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void LJFF(float f, int i) {
        Resources resources;
        Context context = this.LJIIIZ;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (fApplyDimension != this.LJIIIIZZ.getPaint().getTextSize()) {
            this.LJIIIIZZ.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.LJIIIIZZ.isInLayout();
            if (this.LJIIIIZZ.getLayout() != null) {
                this.LIZIZ = false;
                try {
                    Method methodLIZLLL = LIZLLL("nullLayouts");
                    if (methodLIZLLL != null) {
                        methodLIZLLL.invoke(this.LJIIIIZZ, new Object[0]);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!zIsInLayout) {
                    this.LJIIIIZZ.requestLayout();
                } else {
                    this.LJIIIIZZ.forceLayout();
                }
                this.LJIIIIZZ.invalidate();
            }
        }
    }

    public static <T> T LJ(Object obj, String str, T t) {
        try {
            try {
                t = (T) LIZLLL(str).invoke(obj, new Object[0]);
                return t;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return t;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public final void LJIIIZ(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.LIZ = 1;
                    this.LIZLLL = f;
                    this.LJ = f2;
                    this.LIZJ = f3;
                    this.LJI = false;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("The auto-size step granularity (");
                sbLIZ.append(f3);
                sbLIZ.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Maximum auto-size text size (");
            sbLIZ2.append(f2);
            sbLIZ2.append("px) is less or equal to minimum auto-size text size (");
            sbLIZ2.append(f);
            sbLIZ2.append("px)");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Minimum auto-size text size (");
        sbLIZ3.append(f);
        sbLIZ3.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
