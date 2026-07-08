package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0K0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510610K0t extends ConstraintLayout {
    public final int LL;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBackground(com.bytedance.android.livesdk.subscribe.model.BannerBackground r9) {
        /*
            r8 = this;
            r3 = 0
            if (r9 == 0) goto L2d
            com.bytedance.android.live.base.model.ImageModel r0 = r9.backgroundImage
            if (r0 == 0) goto L2a
            r0 = 2131392634(0x7f0a787a, float:1.8405901E38)
            android.view.View r2 = r8.findViewById(r0)
            X.0K4T r0 = X.C511420K3w.LJIIJ
            r0.getClass()
            X.0K3w r1 = new X.0K3w
            r1.<init>()
            com.bytedance.android.live.base.model.ImageModel r0 = r9.backgroundImage
            r1.LIZ = r0
            r1.LIZ(r2)
        L1f:
            java.lang.String r2 = r9.leftBackgroundColor
            java.lang.String r3 = r9.rightBackgroundColor
        L23:
            r1 = 9
            r5 = 1
            r7 = 0
            if (r2 == 0) goto L3e
            goto L2f
        L2a:
            if (r9 == 0) goto L2d
            goto L1f
        L2d:
            r2 = r3
            goto L23
        L2f:
            int r0 = r2.length()     // Catch: java.lang.Exception -> Lb2
            if (r0 != r1) goto L3e
            X.0K1Z r0 = X.C0K1Z.LIZ     // Catch: java.lang.Exception -> Lb2
            r0.getClass()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = X.C0K1Z.LJ(r2)     // Catch: java.lang.Exception -> Lb2
        L3e:
            if (r3 == 0) goto L4f
            int r0 = r3.length()     // Catch: java.lang.Exception -> Lb2
            if (r0 != r1) goto L4f
            X.0K1Z r0 = X.C0K1Z.LIZ     // Catch: java.lang.Exception -> Lb2
            r0.getClass()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = X.C0K1Z.LJ(r3)     // Catch: java.lang.Exception -> Lb2
        L4f:
            X.0K1Z r0 = X.C0K1Z.LIZ     // Catch: java.lang.Exception -> Lb2
            r0.getClass()     // Catch: java.lang.Exception -> Lb2
            int r6 = X.C0K1Z.LIZLLL(r2)     // Catch: java.lang.Exception -> Lb2
            int r2 = X.C0K1Z.LIZLLL(r3)     // Catch: java.lang.Exception -> Lb2
            boolean r0 = X.C511520K4g.LJIIIZ()     // Catch: java.lang.Exception -> Lb2
            r4 = 2
            if (r0 == 0) goto L7d
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Exception -> Lb2
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR     // Catch: java.lang.Exception -> Lb2
            int[] r0 = new int[r4]     // Catch: java.lang.Exception -> Lb2
            r0[r7] = r2     // Catch: java.lang.Exception -> Lb2
            r0[r5] = r6     // Catch: java.lang.Exception -> Lb2
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> Lb2
        L70:
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = X.C511520K4g.LIZ(r0)     // Catch: java.lang.Exception -> Lb2
            int r0 = (int) r0     // Catch: java.lang.Exception -> Lb2
            float r1 = (float) r0     // Catch: java.lang.Exception -> Lb2
            int r0 = r8.LL     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto Lab
            goto L8b
        L7d:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Exception -> Lb2
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch: java.lang.Exception -> Lb2
            int[] r0 = new int[r4]     // Catch: java.lang.Exception -> Lb2
            r0[r7] = r6     // Catch: java.lang.Exception -> Lb2
            r0[r5] = r2     // Catch: java.lang.Exception -> Lb2
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> Lb2
            goto L70
        L8b:
            if (r0 != r5) goto Lae
            r0 = 8
            float[] r2 = new float[r0]     // Catch: java.lang.Exception -> Lb2
            r2[r7] = r1     // Catch: java.lang.Exception -> Lb2
            r2[r5] = r1     // Catch: java.lang.Exception -> Lb2
            r2[r4] = r1     // Catch: java.lang.Exception -> Lb2
            r0 = 3
            r2[r0] = r1     // Catch: java.lang.Exception -> Lb2
            r0 = 4
            r1 = 0
            r2[r0] = r1     // Catch: java.lang.Exception -> Lb2
            r0 = 5
            r2[r0] = r1     // Catch: java.lang.Exception -> Lb2
            r0 = 6
            r2[r0] = r1     // Catch: java.lang.Exception -> Lb2
            r0 = 7
            r2[r0] = r1     // Catch: java.lang.Exception -> Lb2
            r3.setCornerRadii(r2)     // Catch: java.lang.Exception -> Lb2
            goto Lae
        Lab:
            r3.setCornerRadius(r1)     // Catch: java.lang.Exception -> Lb2
        Lae:
            r8.setBackground(r3)     // Catch: java.lang.Exception -> Lb2
            return
        Lb2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C510610K0t.setBackground(com.bytedance.android.livesdk.subscribe.model.BannerBackground):void");
    }

    public C510610K0t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RtlAwareSubFestBanner);
        this.LL = typedArrayObtainStyledAttributes.getInt(R$styleable.RtlAwareSubFestBanner_rounded_corners, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
