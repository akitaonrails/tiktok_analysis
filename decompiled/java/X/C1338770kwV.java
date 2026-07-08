package X;

import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338770kwV extends ConstraintLayout implements InterfaceC1338780kwW {
    public final C1338700kwO LL;
    public int[] LLILLJJLI;

    @Override // X.InterfaceC1338780kwW
    public final void LJJJJJL(GodaV2Style godaV2Style) {
        HandlerHook.viewPost(this, new ARunnableS89S0200000_20(godaV2Style, this, 53));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.LL.LJ(canvas, getWidth(), getHeight(), new AwS599S0100000_20(this, 18));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.LJ(canvas, getWidth(), getHeight(), new AwS599S0100000_20(this, 19));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            C1338700kwO c1338700kwO = this.LL;
            int width = getWidth();
            int height = getHeight();
            c1338700kwO.getClass();
            C1338700kwO.LJFF(width, height, view);
        }
    }

    public C1338770kwV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1338770kwV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1338700kwO c1338700kwO = new C1338700kwO(this);
        this.LL = c1338700kwO;
        this.LLILLJJLI = new int[]{0, 0, 0, 0};
        c1338700kwO.LJI();
    }

    public final void h0(int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMargins(i, i2, i3, i4);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(marginLayoutParams);
            this.LLILLJJLI = new int[]{i, i2, i3, i4};
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.LL.LJII();
        }
    }
}
