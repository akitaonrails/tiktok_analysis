package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338730kwR extends ConstraintLayout implements InterfaceC1761600vwU {
    public final C1338690kwN LL;

    @Override // X.InterfaceC1761600vwU
    public final void LJJJJJL(GodaV2Style godaV2Style) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        ArrayList<Float> arrayList = null;
        if (godaV2Style != null) {
            arrayList = godaV2Style.margin;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            float fFloatValue4 = 0.0f;
            if (arrayList != null && (f4 = (Float) C13LP.LJJJLZIJ(0, arrayList)) != null) {
                fFloatValue = f4.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            int iLIZ = C1338790kwX.LIZ(fFloatValue);
            if (arrayList != null && (f3 = (Float) C13LP.LJJJLZIJ(1, arrayList)) != null) {
                fFloatValue2 = f3.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            int iLIZ2 = C1338790kwX.LIZ(fFloatValue2);
            if (arrayList != null && (f2 = (Float) C13LP.LJJJLZIJ(2, arrayList)) != null) {
                fFloatValue3 = f2.floatValue();
            } else {
                fFloatValue3 = 0.0f;
            }
            int iLIZ3 = C1338790kwX.LIZ(fFloatValue3);
            if (arrayList != null && (f = (Float) C13LP.LJJJLZIJ(3, arrayList)) != null) {
                fFloatValue4 = f.floatValue();
            }
            int iLIZ4 = C1338790kwX.LIZ(fFloatValue4);
            if (marginLayoutParams.leftMargin != iLIZ4 || marginLayoutParams.topMargin != iLIZ || marginLayoutParams.rightMargin != iLIZ2 || marginLayoutParams.bottomMargin != iLIZ3) {
                marginLayoutParams.setMargins(iLIZ4, iLIZ, iLIZ2, iLIZ3);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(marginLayoutParams);
            }
        }
        this.LL.LIZLLL(godaV2Style);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.LL.LJ(canvas, getWidth(), getHeight(), new AwS599S0100000_20(this, 22));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.LJ(canvas, getWidth(), getHeight(), new AwS599S0100000_20(this, 23));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            C1338690kwN c1338690kwN = this.LL;
            int width = getWidth();
            int height = getHeight();
            c1338690kwN.getClass();
            C1338690kwN.LJFF(width, height, view);
        }
    }

    public C1338730kwR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1338730kwR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1338690kwN c1338690kwN = new C1338690kwN(context, this);
        this.LL = c1338690kwN;
        c1338690kwN.LJI();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.LL.LJII();
        }
    }
}
