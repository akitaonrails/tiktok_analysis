package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063104Dt {
    public final View LIZ;

    public C1063104Dt(View view) {
        this.LIZ = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0016, B:8:0x003c, B:9:0x0040), top: B:16:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1063004Ds r6) {
        /*
            r5 = this;
            r4 = 0
            com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor r2 = r6.LJIIIZ     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L40
            X.04Av r1 = X.C1055504Av.LIZ     // Catch: java.lang.Throwable -> L48
            android.view.View r0 = r5.LIZ     // Catch: java.lang.Throwable -> L48
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L48
            r1.getClass()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r3 = X.C1055504Av.LIZLLL(r0, r2)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L40
            int r0 = r3.intValue()     // Catch: java.lang.Throwable -> L48
            android.view.View r2 = r5.LIZ     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            r1.setColor(r0)     // Catch: java.lang.Throwable -> L48
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L48
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Throwable -> L48
            r1.setCornerRadius(r0)     // Catch: java.lang.Throwable -> L48
            r2.setBackground(r1)     // Catch: java.lang.Throwable -> L48
            int r0 = r3.intValue()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L48
        L3c:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L48
            goto L54
        L40:
            android.view.View r0 = r5.LIZ     // Catch: java.lang.Throwable -> L48
            r0.setBackground(r4)     // Catch: java.lang.Throwable -> L48
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L48
            goto L3c
        L48:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L54:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L5f
            android.view.View r0 = r5.LIZ
            r0.setBackground(r4)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1063104Dt.LIZ(X.04Ds):void");
    }

    public final void LIZIZ(C1063004Ds c1063004Ds) {
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            Integer num = c1063004Ds.LJIIJ;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            marginLayoutParams.setMarginStart(iIntValue);
            Integer num2 = c1063004Ds.LJIIJJI;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            marginLayoutParams.setMarginEnd(iIntValue2);
            C786410Ut5.W5(this.LIZ, marginLayoutParams);
        }
        View view = this.LIZ;
        if (Intrinsics.LJFF(c1063004Ds.LJIIL, Boolean.TRUE)) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        C786410Ut5.T4(view, f);
    }
}
