package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0oTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474470oTN extends FrameLayout implements InterfaceC2178711AOn {
    public C1A79 LL;
    public ImageView LLILLJJLI;
    public View LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // X.InterfaceC2178711AOn
    public ViewGroup getVideoContainer() {
        return this;
    }

    @Override // X.InterfaceC2178711AOn
    public final void LIZJ() {
        C786410Ut5.LJZI(8, this.LLILLJJLI);
        this.LLILLJJLI.setImageBitmap(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r4 = this;
            X.1A79 r3 = r4.LL
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L79
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "TAH-AN00"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "TAH-N29"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "RLI-AN00"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "RLI-N29"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "TAH-AN00m"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "RHA-AN00m"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "MRX-AL09"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "MRX-AL19"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "MRX-AN19"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "MRX-W09"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "IN2010"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "SM-G9650"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "MRX-W19"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            r1 = 0
        L73:
            r0 = 29
            if (r2 != r0) goto L82
            if (r1 == 0) goto L82
        L79:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7b:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setAlpha(r0)
            return
        L82:
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            goto L7b
        L86:
            r1 = 1
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1474470oTN.LIZLLL():void");
    }

    @Override // X.InterfaceC2178711AOn
    public int getVideoHeight() {
        return this.LL.getVideoHeight();
    }

    @Override // X.InterfaceC2178711AOn
    public int getVideoViewMarginTop() {
        C1A79 c1a79 = this.LL;
        if (c1a79 == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = c1a79.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return -1;
    }

    @Override // X.InterfaceC2178711AOn
    public int getVideoWidth() {
        return this.LL.getVideoWidth();
    }

    @Override // X.InterfaceC2178711AOn
    public View getBlackCoverView() {
        return this.LLILLL;
    }

    public InterfaceC1474480oTO getGestureTargetView() {
        return this.LL;
    }

    @Override // X.InterfaceC2178711AOn
    public int getTextureLayout() {
        return this.LLILZLL;
    }

    public C1A79 getTextureVideoView() {
        return this.LL;
    }

    @Override // X.InterfaceC2178711AOn
    public InterfaceC2178741AOq getVideoView() {
        return this.LL;
    }

    public C1474470oTN(Context context) {
        super(context);
        setClipChildren(false);
        this.LL = new C1A79(context);
        LIZLLL();
        setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LL, layoutParams);
        ImageView imageView = new ImageView(context);
        this.LLILLJJLI = imageView;
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        C12ES.LJIILL(8, this.LLILLJJLI);
        C12ES.LJIILL(8, this.LL);
        View view = new View(context);
        this.LLILLL = view;
        view.setBackgroundColor(-16777216);
        addView(this.LLILLL, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // X.InterfaceC2178711AOn
    public final void LIZ(int i) {
        this.LLILZLL = i;
        C1A79 c1a79 = this.LL;
        if (c1a79 != null) {
            c1a79.LLJ.LJI(i);
        }
    }

    @Override // X.InterfaceC2178711AOn
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null) {
            this.LLILLJJLI.setImageBitmap(bitmap);
            C786410Ut5.LJZI(0, this.LLILLJJLI);
        }
    }

    @Override // X.InterfaceC2178711AOn
    public void setCropStrategy(C1474490oTP c1474490oTP) {
        this.LL.setCropStrategy(c1474490oTP);
    }

    @Override // X.InterfaceC2178711AOn
    public void setOptimizeBlackSide(boolean z) {
        C1A79 c1a79 = this.LL;
        if (c1a79 != null) {
            c1a79.setOptimizeBlackSide(z);
        }
    }

    @Override // X.InterfaceC2178711AOn
    public void setOptimizeNormalFillScreen(boolean z) {
        C1A79 c1a79 = this.LL;
        if (c1a79 != null) {
            c1a79.setOptimizeNormalFillScreen(z);
        }
    }

    public void setTextureLayout(int i) {
        LIZ(i);
    }

    @Override // X.InterfaceC2178711AOn
    public void setZoomingEnabled(boolean z) {
        C1A79 c1a79 = this.LL;
        if (c1a79 != null) {
            c1a79.setZoomingEnabled(z);
        }
    }

    @Override // X.InterfaceC2178711AOn
    public final void setVideoSize(int i, int i2) {
        if (this.LLILZ != i || this.LLILZIL != i2) {
            this.LLILZ = i;
            this.LLILZIL = i2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVideoSize videoWidth:");
            sbLIZ.append(i);
            sbLIZ.append(" videoHeight:");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            C1A79 c1a79 = this.LL;
            if (c1a79 != null) {
                c1a79.LLJ.LJII(i, i2);
            }
        }
    }
}
