package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15nU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20626615nU extends AbstractC20627515nd {
    public static final List<C20626715nV> LLJJIJI = Collections.singletonList(new C20626715nV(1.0f));
    public static final C1428010nGR LLJJIJIIJIL;
    public List<? extends AbstractC20626815nW> LLJILLL;
    public C1428010nGR LLJJ;
    public List<Float> LLJJI;
    public final Rect LLJJIII;

    public C20626615nU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    static {
        Paint paint = new Paint();
        paint.setTextSize(15.0f);
        LLJJIJIIJIL = new C1428010nGR(18.0f, paint);
    }

    public final C1428010nGR LJFF() {
        C1428010nGR c1428010nGR = this.LLJJ;
        if (c1428010nGR != null) {
            return c1428010nGR;
        }
        TextView textViewLIZ = C2193208iY.LIZ(this);
        if (textViewLIZ == null) {
            return LLJJIJIIJIL;
        }
        return new C1428010nGR(textViewLIZ.getLineHeight(), textViewLIZ.getPaint());
    }

    public final C1428010nGR getFontConfig() {
        return this.LLJJ;
    }

    public final List<AbstractC20626815nW> getPlaceholderConfig() {
        return this.LLJILLL;
    }

    public final void setFontConfig(C1428010nGR c1428010nGR) {
        this.LLJJ = c1428010nGR;
        requestLayout();
    }

    public final void setPlaceholderConfig(List<? extends AbstractC20626815nW> list) {
        this.LLJILLL = list;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float fMeasureText;
        if (!LIZJ()) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        C1428010nGR c1428010nGRLJFF = LJFF();
        int iMax = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        List<? extends AbstractC20626815nW> list = this.LLJILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AbstractC20626815nW abstractC20626815nW : list) {
            if (abstractC20626815nW instanceof C20627115nZ) {
                fMeasureText = ((C20627115nZ) abstractC20626815nW).LIZIZ;
            } else if (abstractC20626815nW instanceof C20626715nV) {
                fMeasureText = ((C20626715nV) abstractC20626815nW).LIZIZ * iMax;
            } else if (abstractC20626815nW instanceof C20627015nY) {
                C20627015nY c20627015nY = (C20627015nY) abstractC20626815nW;
                fMeasureText = c20627015nY.LIZJ * c1428010nGRLJFF.LIZ.measureText(c20627015nY.LIZIZ);
            } else {
                throw new C1954807lC();
            }
            arrayList.add(Float.valueOf(fMeasureText));
        }
        this.LLJJI = arrayList;
        if (mode != 1073741824) {
            Iterator it2 = arrayList.iterator();
            float f = 0.0f;
            while (it2.hasNext()) {
                float fFloatValue = ((Number) it2.next()).floatValue();
                if (fFloatValue > f) {
                    f = fFloatValue;
                }
            }
            iMax = (int) Math.ceil(f);
        }
        int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
        if (mode2 != 1073741824) {
            if (this.LLJJI.isEmpty()) {
                paddingTop = 0;
            } else {
                int size3 = (this.LLJJI.size() - 1) * ((int) c1428010nGRLJFF.LIZIZ);
                Paint.FontMetricsInt fontMetricsInt = c1428010nGRLJFF.LIZ.getFontMetricsInt();
                paddingTop = size3 + (fontMetricsInt.bottom - fontMetricsInt.top);
            }
        }
        setMeasuredDimension(paddingLeft, paddingTop + getPaddingTop() + getPaddingBottom());
        LIZLLL(this.LLJJI.size());
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        C1428010nGR c1428010nGRLJFF2 = LJFF();
        Paint.FontMetrics fontMetrics = c1428010nGRLJFF2.LIZ.getFontMetrics();
        float fMin = Math.min(c1428010nGRLJFF2.LIZ.getTextSize(), c1428010nGRLJFF2.LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        int i3 = 0;
        for (Float f2 : this.LLJJI) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                float fFloatValue2 = f2.floatValue();
                Rect rect = this.LLJJIII;
                int i5 = (int) (paddingTop2 + (fontMetrics.ascent - fontMetrics.top) + (i3 * c1428010nGRLJFF2.LIZIZ));
                rect.top = i5;
                rect.bottom = (int) (i5 + fMin);
                if (getLayoutDirection() == 1) {
                    Rect rect2 = this.LLJJIII;
                    rect2.right = measuredWidth;
                    rect2.left = (int) (measuredWidth - fFloatValue2);
                } else {
                    Rect rect3 = this.LLJJIII;
                    rect3.left = paddingLeft2;
                    rect3.right = (int) (paddingLeft2 + fFloatValue2);
                }
                ((Drawable) ListProtector.get(getPlaceholders(), i3)).setBounds(this.LLJJIII);
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20626615nU(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLJILLL = LLJJIJI;
        this.LLJJI = C13BV.INSTANCE;
        this.LLJJIII = new Rect();
        setPlaceholderConfig(new C20626915nX("100%,20dp,'hello skeleton',40%").LIZIZ());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSkeletonText, 0, 0);
        int i2 = R$styleable.TuxSkeletonText_tux_skeletonPlaceholder;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i2);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, i2);
            if (strXd != null) {
                setPlaceholderConfig(new C20626915nX(strXd).LIZIZ());
            } else {
                "Attribute value could not be coerced to String.".toString();
                throw new IllegalStateException("Attribute value could not be coerced to String.");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
