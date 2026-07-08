package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;
import com.bytedance.common.utility.Logger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A7P, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7P extends C1A7N {
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.C1A7N
    public final Pair<Integer, Integer> LIZIZ() {
        if (LJIIIZ() || this.LIZIZ || this.LJIIIZ) {
            return null;
        }
        return this.LJI;
    }

    @Override // X.C1A7N
    public final Integer LIZJ() {
        return LJIIIZ() ? null : 48;
    }

    @Override // X.C1A7N
    public final Integer LIZLLL() {
        return (LJIIIZ() || this.LIZIZ || this.LJIIIZ) ? null : 48;
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
            } else {
                this.LJII = null;
                this.LJIIIZ = true;
            }
            if (layoutParams2.leftMargin < 0) {
                this.LJIIIZ = true;
            }
        }
    }

    @Override // X.C1A7N
    public final void LJII(int i, int i2) {
        if (this.LJIIIIZZ) {
            return;
        }
        super.LJII(i, i2);
    }

    @Override // X.C1A7N
    public final void LIZ(int i, int i2, ViewGroup viewGroup) {
        LJI(new AwS577S0100000_33(this, 4194), viewGroup, i, i2, new AwS577S0100000_33(this, 4195));
    }

    @Override // X.C1A7N
    public final void LJFF(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, int i, int i2) {
        Integer numValueOf;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("measureStreamSmallerRenderView layoutParams:");
        Integer numValueOf2 = null;
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.width);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('x');
        if (layoutParams != null) {
            numValueOf2 = Integer.valueOf(layoutParams.height);
        }
        sbLIZ.append(numValueOf2);
        Logger.d("InsideAboveSmoothEnterHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.topMargin < 0) {
                layoutParams2.gravity = 17;
                this.LJII = 17;
            } else {
                layoutParams2.gravity = 48;
                this.LJII = 48;
            }
            if (layoutParams2.topMargin < 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIIZ = z;
        }
        LJI(new AwS577S0100000_33(this, 4196), viewGroup, i, i2, new AwS577S0100000_33(this, 4197));
    }
}
