package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0c01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994990c01 extends FrameLayout {
    public final C1751490vgB LL;

    public final C1751490vgB getCouponItemView() {
        return this.LL;
    }

    public C994990c01(Context context) {
        super(context, null, 0);
        C1751490vgB c1751490vgB = new C1751490vgB(0, context, null, new AwS595S0100000_16(context, 473));
        this.LL = c1751490vgB;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        addView(c1751490vgB, layoutParams);
    }
}
