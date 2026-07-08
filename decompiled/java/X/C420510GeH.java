package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;

/* JADX INFO: renamed from: X.0GeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420510GeH extends FrameLayout {
    public final ImageView LL;
    public final AvatarComponentView LLILLJJLI;
    public final ImageView LLILLL;

    public C420510GeH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LL = imageView;
        AvatarComponentView avatarComponentView = new AvatarComponentView(context, null, 14);
        this.LLILLJJLI = avatarComponentView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLILLL = imageView2;
        addView(imageView);
        addView(avatarComponentView);
        addView(imageView2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            int r7 = android.view.View.MeasureSpec.getMode(r11)
            int r2 = android.view.View.MeasureSpec.getSize(r11)
            int r6 = android.view.View.MeasureSpec.getMode(r12)
            int r4 = android.view.View.MeasureSpec.getSize(r12)
            r9 = 1133117440(0x438a0000, float:276.0)
            r5 = 1124859904(0x430c0000, float:140.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 != r3) goto L68
            if (r6 != r3) goto L84
            r8 = r2
        L1b:
            r0 = r4
        L1c:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r1) goto L66
            if (r0 <= r4) goto L66
            if (r7 == r3) goto L64
            float r0 = (float) r4
            float r0 = r0 * r9
            float r0 = r0 / r5
            int r8 = (int) r0
        L28:
            if (r7 != r1) goto L64
            if (r8 <= r2) goto L64
            if (r6 == r3) goto L32
            float r0 = (float) r2
            float r0 = r0 * r5
            float r0 = r0 / r9
            int r4 = (int) r0
        L32:
            r10.setMeasuredDimension(r2, r4)
            float r0 = (float) r2
            float r0 = r0 * r5
            float r1 = (float) r4
            float r1 = r1 * r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r1 = r1 / r5
            int r2 = (int) r1
        L3f:
            float r4 = (float) r2
            float r5 = r5 * r4
            float r5 = r5 / r9
            int r0 = (int) r5
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            android.widget.ImageView r0 = r10.LL
            r0.measure(r2, r1)
            android.widget.ImageView r0 = r10.LLILLL
            r0.measure(r2, r1)
            r0 = 1051858499(0x3eb21643, float:0.3478261)
            float r4 = r4 * r0
            int r0 = (int) r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r0 = r10.LLILLJJLI
            r0.measure(r1, r1)
            return
        L64:
            r2 = r8
            goto L32
        L66:
            r4 = r0
            goto L28
        L68:
            if (r7 == r3) goto L84
            if (r6 != r3) goto L71
            float r0 = (float) r4
            float r0 = r0 * r9
            float r0 = r0 / r5
            int r8 = (int) r0
            goto L1b
        L71:
            r0 = 276(0x114, float:3.87E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r8 = X.C814420VxA.LIZIZ(r0)
            float r0 = (float) r8
            float r0 = r0 * r5
            float r0 = r0 / r9
            int r0 = (int) r0
            goto L1c
        L84:
            float r0 = (float) r2
            float r0 = r0 * r5
            float r0 = r0 / r9
            int r0 = (int) r0
            r8 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C420510GeH.onMeasure(int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight() * 276.0f;
        if (measuredWidth * 140.0f >= measuredHeight) {
            measuredWidth = (int) (measuredHeight / 140.0f);
        }
        float f = measuredWidth;
        int i5 = (int) ((140.0f * f) / 276.0f);
        int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
        int measuredHeight2 = (getMeasuredHeight() - i5) / 2;
        int i6 = measuredWidth2 + measuredWidth;
        int i7 = i5 + measuredHeight2;
        this.LL.layout(measuredWidth2, measuredHeight2, i6, i7);
        this.LLILLL.layout(measuredWidth2, measuredHeight2, i6, i7);
        int i8 = (int) (0.3478261f * f);
        int i9 = measuredWidth2 + ((measuredWidth - i8) / 2);
        int i10 = measuredHeight2 + ((int) (f * 0.10869565f));
        this.LLILLJJLI.layout(i9, i10, i9 + i8, i8 + i10);
    }
}
