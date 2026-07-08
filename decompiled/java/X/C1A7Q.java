package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A7Q, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7Q extends C1A7N {
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    @Override // X.C1A7N
    public final Pair<Integer, Integer> LIZIZ() {
        if (LJIIIZ() || this.LIZIZ || this.LJIIIIZZ) {
            return null;
        }
        return this.LJI;
    }

    @Override // X.C1A7N
    public final Integer LIZJ() {
        return (LJIIIZ() || this.LJIIJ || this.LIZIZ || this.LJIIIIZZ) ? null : 17;
    }

    @Override // X.C1A7N
    public final Integer LIZLLL() {
        if (LJIIIZ()) {
            return null;
        }
        if (this.LJIIJ) {
            return 48;
        }
        return (this.LIZIZ || this.LJIIIIZZ) ? null : 17;
    }

    @Override // X.C1A7N
    public final boolean LJIIIIZZ() {
        return LJIIIZ();
    }

    public final boolean LJIIIZ() {
        boolean zIsAudienceEnable = LinkMicRtcRatioOptimize.isAudienceEnable();
        if (this.LIZJ) {
            zIsAudienceEnable = true;
        }
        if (this.LIZIZ) {
            zIsAudienceEnable = true;
        }
        return this.LJFF || zIsAudienceEnable;
    }

    @Override // X.C1A7N
    public final void LJ(ViewGroup.LayoutParams layoutParams) {
        if (!LJIIIZ() && (layoutParams instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.topMargin >= 0) {
                layoutParams2.gravity = 48;
                this.LJII = 48;
                this.LJIIJ = true;
            } else {
                this.LJII = null;
                this.LJIIIIZZ = true;
            }
            if (layoutParams2.leftMargin < 0) {
                this.LJIIIIZZ = true;
            }
        }
    }

    @Override // X.C1A7N
    public final void LJII(int i, int i2) {
        if (LJIIIZ() || this.LJIIIZ) {
            return;
        }
        super.LJII(i, i2);
    }

    @Override // X.C1A7N
    public final void LIZ(int i, int i2, ViewGroup viewGroup) {
        LJI(new AwS577S0100000_33(this, 4198), viewGroup, i, i2, new AwS577S0100000_33(this, 4199));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    @Override // X.C1A7N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.view.ViewGroup.LayoutParams r9, android.view.ViewGroup r10, int r11, int r12) {
        /*
            r8 = this;
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "measureStreamSmallerRenderView layoutParams:"
            r2.append(r0)
            r1 = 0
            if (r9 == 0) goto L76
            int r0 = r9.width
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L12:
            r2.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r2.append(r0)
            if (r9 == 0) goto L22
            int r0 = r9.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L22:
            r2.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "InsideCenterSmoothEnterHandler"
            com.bytedance.common.utility.Logger.d(r0, r1)
            boolean r0 = r9 instanceof android.widget.FrameLayout.LayoutParams
            r2 = r8
            if (r0 == 0) goto L51
            boolean r0 = r2.LJIIJ
            if (r0 != 0) goto L68
            r1 = r9
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r1.topMargin
            if (r0 < 0) goto L68
            r0 = 17
            r1.gravity = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJII = r0
        L48:
            android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9
            int r0 = r9.topMargin
            if (r0 >= 0) goto L66
            r0 = 1
        L4f:
            r2.LJIIIIZZ = r0
        L51:
            kotlin.jvm.internal.AwS577S0100000_33 r3 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 4200(0x1068, float:5.885E-42)
            r3.<init>(r2, r0)
            kotlin.jvm.internal.AwS577S0100000_33 r7 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 4201(0x1069, float:5.887E-42)
            r7.<init>(r2, r0)
            r6 = r12
            r5 = r11
            r4 = r10
            r2.LJI(r3, r4, r5, r6, r7)
            return
        L66:
            r0 = 0
            goto L4f
        L68:
            r1 = r9
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 48
            r1.gravity = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJII = r0
            goto L48
        L76:
            r0 = r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A7Q.LJFF(android.view.ViewGroup$LayoutParams, android.view.ViewGroup, int, int):void");
    }
}
