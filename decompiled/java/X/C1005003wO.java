package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.03wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1005003wO extends AbstractC1335900krs {
    public final View LL;

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
    }

    public C1005003wO(View view) {
        this.LL = view;
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        int i;
        int iLIZIZ;
        Number numberValueOf;
        int i2 = 90;
        if (c428600GrK != null) {
            i2 = c428600GrK.LIZIZ;
        }
        if (c428600GrK != null) {
            i = c428600GrK.LIZ;
        } else {
            i = 64;
        }
        float f = i2 / i;
        double d = f;
        if (d > 1.7d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        } else if (d >= 1.4d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        } else if (d >= 1.2d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        float f2 = iLIZIZ * f;
        if (f2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
            numberValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
        } else {
            numberValueOf = Float.valueOf(f2);
        }
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = numberValueOf.intValue();
        C786410Ut5.W5(this.LL, layoutParams);
    }
}
