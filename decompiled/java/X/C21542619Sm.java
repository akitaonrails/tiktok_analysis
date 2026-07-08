package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import u4.q0;

/* JADX INFO: renamed from: X.19Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21542619Sm extends C19RT implements InterfaceC21542819So {
    public final C21543019Sq LLILZ;
    public final Rect LLILZIL;
    public final RectF LLILZLL;
    public final SparseArray<TextView> LLIZ;
    public final C20100013kk LLIZLLLIL;
    public final int[] LLJ;
    public final float[] LLJI;
    public final int LLJIJIL;
    public String[] LLJILJIL;
    public float LLJILJILJ;
    public final ColorStateList LLJILLL;

    public final void h0() {
        RectF rectF = this.LLILZ.LLJIJIL;
        for (int i = 0; i < this.LLIZ.size(); i++) {
            TextView textView = this.LLIZ.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.LLILZIL);
                this.LLILZIL.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.LLILZIL);
                this.LLILZLL.set(this.LLILZIL);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.LLILZLL) ? null : new RadialGradient(rectF.centerX() - this.LLILZLL.left, rectF.centerY() - this.LLILZLL.top, 0.5f * rectF.width(), this.LLJ, this.LLJI, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZIZ(1, this.LLJILJIL.length, 1, false));
    }

    public void setHandRotation(float f) {
        this.LLILZ.LIZIZ(f, false);
        h0();
    }

    @Override // X.C19RT
    public void setRadius(int i) {
        if (i != getRadius()) {
            super.setRadius(i);
            C21543019Sq c21543019Sq = this.LLILZ;
            c21543019Sq.LLJJIII = getRadius();
            c21543019Sq.invalidate();
        }
    }

    public C21542619Sm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC21542819So
    public final void LLZZJLIL(float f, boolean z) {
        if (Math.abs(this.LLJILJILJ - f) > 0.001f) {
            this.LLJILJILJ = f;
            h0();
        }
    }

    public final void i0(int i, String[] strArr) {
        this.LLJILJIL = strArr;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        int size = this.LLIZ.size();
        for (int i2 = 0; i2 < Math.max(this.LLJILJIL.length, size); i2++) {
            TextView textView = this.LLIZ.get(i2);
            if (i2 >= this.LLJILJIL.length) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, textView);
                removeView(textView);
                this.LLIZ.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) C786410Ut5.Td(layoutInflaterNe, R.layout.dkr, this, false);
                    this.LLIZ.put(i2, textView);
                    addView(textView);
                }
                C786410Ut5.LLIL(textView, 0);
                textView.setText(this.LLJILJIL[i2]);
                textView.setTag(R.id.o46, Integer.valueOf(i2));
                q0.LJIJ(textView, this.LLIZLLLIL);
                textView.setTextColor(this.LLJILLL);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.LLJILJIL[i2]));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.13kk] */
    public C21542619Sm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.f3s);
        this.LLILZIL = new Rect();
        this.LLILZLL = new RectF();
        this.LLIZ = new SparseArray<>();
        this.LLJI = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, R.attr.f3s, R.style.a6g);
        Resources resources = getResources();
        ColorStateList colorStateListLIZ = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.ClockFaceView_clockNumberTextColor);
        this.LLJILLL = colorStateListLIZ;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dks, this, true);
        C21543019Sq c21543019Sq = (C21543019Sq) findViewById(R.id.o3f);
        this.LLILZ = c21543019Sq;
        this.LLJIJIL = resources.getDimensionPixelSize(R.dimen.a6f);
        int colorForState = colorStateListLIZ.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListLIZ.getDefaultColor());
        this.LLJ = new int[]{colorForState, colorForState, colorStateListLIZ.getDefaultColor()};
        ((ArrayList) c21543019Sq.LLIZ).add(this);
        int defaultColor = C838410Wul.LIZIZ(R.color.q2, context).getDefaultColor();
        ColorStateList colorStateListLIZ2 = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListLIZ2 != null ? colorStateListLIZ2.getDefaultColor() : defaultColor);
        C786410Ut5.y3(getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.19Sn
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (!this.LL.isShown()) {
                    return true;
                }
                C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
                int height = this.LL.getHeight() / 2;
                C21542619Sm c21542619Sm = this.LL;
                c21542619Sm.setRadius((height - c21542619Sm.LLILZ.LLIZLLLIL) - c21542619Sm.LLJIJIL);
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.LLIZLLLIL = new C20094213jo() { // from class: X.13kk
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int iIntValue = ((Integer) view.getTag(R.id.o46)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter(this.LIZ.LLIZ.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(0, 1, iIntValue, 1, view.isSelected()));
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        i0(0, strArr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h0();
    }
}
