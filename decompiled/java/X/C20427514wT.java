package X;

import Y.ACListenerS133S0200000_31;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20427514wT extends AbstractC960470b6L<C20427714wV> {
    public final Function1<C20427614wU, Unit> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C20427514wT(View view, Function1<? super C20427614wU, Unit> function1) {
        super(view);
        this.LL = function1;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int i2;
        final C20427714wV c20427714wV = (C20427714wV) obj;
        View viewFindViewById = this.itemView.findViewById(R.id.vwc);
        View viewFindViewById2 = this.itemView.findViewById(R.id.bwa);
        C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(c20427714wV.LIZ));
        c1324610kZfLJIIJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLJIIJ.LJIJI(Float.valueOf(C497740JfY.LIZIZ(8)));
        c1324610kZfLJIIJ.LJJI(viewFindViewById);
        if (viewFindViewById2 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke((int) C497740JfY.LIZIZ(2.0f), C497740JfY.LIZLLL(R.attr.ey7, this.itemView.getContext()));
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(10.0f));
            viewFindViewById2.setBackground(gradientDrawable);
            if (c20427714wV.LIZIZ) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        }
        C786410Ut5.I7(new ACListenerS133S0200000_31(this, c20427714wV, 1), this.itemView);
        this.itemView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.13jw
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(c20427714wV.LJ);
            }
        });
    }
}
