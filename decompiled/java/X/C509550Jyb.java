package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Jyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509550Jyb extends ConstraintLayout {
    public final int LL;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBackground(com.bytedance.android.livesdk.subscribe.model.BannerBackground r9) {
        /*
            r8 = this;
            r3 = 0
            if (r9 == 0) goto L29
            com.bytedance.android.live.base.model.ImageModel r0 = r9.backgroundImage
            if (r0 == 0) goto L26
            r0 = 2131392634(0x7f0a787a, float:1.8405901E38)
            android.view.View r2 = r8.findViewById(r0)
            X.0JBN r1 = X.C1819620xS4.LIZ()
            com.bytedance.android.live.base.model.ImageModel r0 = r9.backgroundImage
            X.0kZf r0 = r1.LJIIIZ(r0)
            r0.LJJI(r2)
        L1b:
            java.lang.String r2 = r9.leftBackgroundColor
            java.lang.String r3 = r9.rightBackgroundColor
        L1f:
            r1 = 9
            r5 = 1
            r7 = 0
            if (r2 == 0) goto L35
            goto L2b
        L26:
            if (r9 == 0) goto L29
            goto L1b
        L29:
            r2 = r3
            goto L1f
        L2b:
            int r0 = r2.length()     // Catch: java.lang.Exception -> La2
            if (r0 != r1) goto L35
            java.lang.String r2 = X.C0JS0.LIZLLL(r2)     // Catch: java.lang.Exception -> La2
        L35:
            if (r3 == 0) goto L41
            int r0 = r3.length()     // Catch: java.lang.Exception -> La2
            if (r0 != r1) goto L41
            java.lang.String r3 = X.C0JS0.LIZLLL(r3)     // Catch: java.lang.Exception -> La2
        L41:
            int r6 = X.C0JS0.LIZJ(r2)     // Catch: java.lang.Exception -> La2
            int r2 = X.C0JS0.LIZJ(r3)     // Catch: java.lang.Exception -> La2
            boolean r0 = X.C497740JfY.LJJ()     // Catch: java.lang.Exception -> La2
            r4 = 2
            if (r0 == 0) goto L6a
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Exception -> La2
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR     // Catch: java.lang.Exception -> La2
            int[] r0 = new int[r4]     // Catch: java.lang.Exception -> La2
            r0[r7] = r2     // Catch: java.lang.Exception -> La2
            r0[r5] = r6     // Catch: java.lang.Exception -> La2
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> La2
        L5d:
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = X.C497740JfY.LIZIZ(r0)     // Catch: java.lang.Exception -> La2
            int r0 = (int) r0     // Catch: java.lang.Exception -> La2
            float r1 = (float) r0     // Catch: java.lang.Exception -> La2
            int r0 = r8.LL     // Catch: java.lang.Exception -> La2
            if (r0 == 0) goto L98
            goto L78
        L6a:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Exception -> La2
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch: java.lang.Exception -> La2
            int[] r0 = new int[r4]     // Catch: java.lang.Exception -> La2
            r0[r7] = r6     // Catch: java.lang.Exception -> La2
            r0[r5] = r2     // Catch: java.lang.Exception -> La2
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> La2
            goto L5d
        L78:
            if (r0 != r5) goto L9b
            r0 = 8
            float[] r2 = new float[r0]     // Catch: java.lang.Exception -> La2
            r2[r7] = r1     // Catch: java.lang.Exception -> La2
            r2[r5] = r1     // Catch: java.lang.Exception -> La2
            r2[r4] = r1     // Catch: java.lang.Exception -> La2
            r0 = 3
            r2[r0] = r1     // Catch: java.lang.Exception -> La2
            r0 = 4
            r1 = 0
            r2[r0] = r1     // Catch: java.lang.Exception -> La2
            r0 = 5
            r2[r0] = r1     // Catch: java.lang.Exception -> La2
            r0 = 6
            r2[r0] = r1     // Catch: java.lang.Exception -> La2
            r0 = 7
            r2[r0] = r1     // Catch: java.lang.Exception -> La2
            r3.setCornerRadii(r2)     // Catch: java.lang.Exception -> La2
            goto L9b
        L98:
            r3.setCornerRadius(r1)     // Catch: java.lang.Exception -> La2
        L9b:
            r8.setBackground(r3)     // Catch: java.lang.Exception -> La2
            r8.setBackground(r3)     // Catch: java.lang.Exception -> La2
            return
        La2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C509550Jyb.setBackground(com.bytedance.android.livesdk.subscribe.model.BannerBackground):void");
    }

    public C509550Jyb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RtlAwareSubFestBanner);
        this.LL = typedArrayObtainStyledAttributes.getInt(R$styleable.RtlAwareSubFestBanner_rounded_corners, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
