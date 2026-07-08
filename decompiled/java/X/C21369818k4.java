package X;

import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.18k4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21369818k4 {
    public final TuxTextView LIZ;
    public boolean LIZIZ;
    public TextPaint LJI;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public final RectF LJ = new RectF();
    public int[] LJFF = new int[0];
    public final C21370218k8 LJII = new C21370218k8();

    public C21369818k4(C21369118jx c21369118jx) {
        this.LIZ = c21369118jx;
    }

    public final void LIZ(int i) {
        Object objA0;
        int measuredWidth;
        Method methodLIZ;
        if (this.LIZIZ) {
            if (this.LIZ.getMeasuredHeight() > 0 && this.LIZ.getMeasuredWidth() > 0) {
                TuxTextView tuxTextView = this.LIZ;
                Object obj = Boolean.FALSE;
                try {
                    try {
                        methodLIZ = C788330UwB.LIZ("getHorizontallyScrolling");
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (methodLIZ != null) {
                    objA0 = C2204961BRm.a0(methodLIZ, tuxTextView, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQCsbA87ez4xhfL6qbpEBI0S1UX/xxqUUyptuSF1igIaQ==", null));
                } else {
                    objA0 = obj;
                }
                if (objA0 != null) {
                    obj = objA0;
                }
                if (((Boolean) obj).booleanValue()) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.LIZ.getMeasuredWidth() - this.LIZ.getTotalPaddingLeft()) - this.LIZ.getTotalPaddingRight();
                }
                int height = (this.LIZ.getHeight() - this.LIZ.getCompoundPaddingBottom()) - this.LIZ.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    synchronized (this.LJ) {
                        try {
                            this.LJ.setEmpty();
                            RectF rectF = this.LJ;
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float fLIZIZ = LIZIZ(rectF, i);
                            if (fLIZIZ != this.LIZ.getTextSize()) {
                                LIZJ(fLIZIZ);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.LIZIZ = true;
    }

    public final void LIZJ(float f) throws Throwable {
        if (f != this.LIZ.getPaint().getTextSize()) {
            this.LIZ.getPaint().setTextSize(f);
            try {
                Field declaredField = TuxTextView.class.getDeclaredField("LLIZLLLIL");
                declaredField.setAccessible(true);
                declaredField.set(this.LIZ, Integer.valueOf(C814420VxA.LIZ(((double) f) * 1.3d)));
                TuxTextView tuxTextView = this.LIZ;
                tuxTextView.setText(tuxTextView.getText());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            boolean zIsInLayout = this.LIZ.isInLayout();
            if (this.LIZ.getLayout() != null) {
                this.LIZIZ = false;
                try {
                    Method methodLIZ = C788330UwB.LIZ("nullLayouts");
                    if (methodLIZ != null) {
                        C2204961BRm.a0(methodLIZ, this.LIZ, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQCsbA87ez4xhfL6qbpEBI0S1UX5whrf0ypmujZ5LZIHIcjcqs=", null));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (!zIsInLayout) {
                    this.LIZ.requestLayout();
                } else {
                    this.LIZ.forceLayout();
                }
                this.LIZ.invalidate();
            }
        }
    }

    public final int LIZIZ(RectF rectF, int i) {
        CharSequence transformation;
        if (i == 3 && this.LJII.LIZIZ(rectF.right, this.LIZJ, this.LIZLLL, this.LIZ)) {
            return this.LJII.LJIILJJIL;
        }
        int length = this.LJFF.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                int i6 = this.LJFF[i5];
                CharSequence text = this.LIZ.getText();
                TransformationMethod transformationMethod = this.LIZ.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.LIZ)) != null) {
                    text = transformation;
                }
                int maxLines = this.LIZ.getMaxLines();
                TextPaint textPaint = this.LJI;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                }
                this.LJI = textPaint;
                StaticLayout staticLayoutLIZLLL = C20588115hH.LIZLLL(this.LIZ, text, textPaint, C814420VxA.LIZIZ(rectF.right), Float.valueOf(i6), true);
                if ((maxLines != -1 && (staticLayoutLIZLLL.getLineCount() > maxLines || staticLayoutLIZLLL.getLineEnd(staticLayoutLIZLLL.getLineCount() - 1) != text.length())) || staticLayoutLIZLLL.getHeight() > rectF.bottom) {
                    i4 = i5 - 1;
                    i2 = i4;
                } else {
                    i4 = i3;
                    i3 = i5 + 1;
                }
            }
            this.LJII.LIZ(this.LJFF[i4], rectF.right, this.LIZJ, this.LIZLLL, this.LIZ);
            return this.LJFF[i4];
        }
        "No available text sizes to choose from.".toString();
        throw new IllegalStateException("No available text sizes to choose from.");
    }
}
