package X;

import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0fPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126250fPj extends FrameLayout {
    public final C13E8<C1126540fQC> LL;

    public C1126250fPj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C13E8<>();
    }

    public final void LIZ(float f, boolean z) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRippleLayerAnimation: viewNum ");
        sbLIZ.append(this.LL.size());
        C20441214yg.LJIIIZ("GiftComboRippleView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.size() >= 4) {
            C1126540fQC c1126540fQCRemoveFirst = this.LL.removeFirst();
            c1126540fQCRemoveFirst.LIZLLL();
            if (indexOfChild(c1126540fQCRemoveFirst) > 0) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1126540fQCRemoveFirst);
                removeView(c1126540fQCRemoveFirst);
            }
        }
        final C1126540fQC c1126540fQC = new C1126540fQC(getContext());
        if (!z) {
            C786410Ut5.g5(c1126540fQC, f);
        }
        this.LL.addLast(c1126540fQC);
        addView(c1126540fQC);
        if (z) {
            str = "gift_combo_ripple_layer_1.webp";
        } else {
            str = "gift_combo_ripple_layer_2.webp";
        }
        c1126540fQC.LLJILJIL = C1143780fs0.LJIIJ("tiktok_live_revenue_demand_5", str);
        c1126540fQC.LLJJIII = true;
        c1126540fQC.LLJILJILJ = new C0I9J() { // from class: X.0GkF
            public long LIZ;

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
                Integer numValueOf;
                this.LIZ = System.currentTimeMillis();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GiftComboRippleView onAnimationStart: total ");
                if (animatedDrawable2 != null) {
                    numValueOf = Integer.valueOf(animatedDrawable2.LIZJ());
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                C20441214yg.LJIIIZ("GiftComboRippleView", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GiftComboRippleView onAnimationStop: timeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee ");
                sbLIZ2.append(System.currentTimeMillis() - this.LIZ);
                C20441214yg.LJIIIZ("GiftComboRippleView", C2188811AlT.LIZIZ(sbLIZ2));
                if (this.LIZIZ.indexOfChild(c1126540fQC) >= 0) {
                    C1126250fPj c1126250fPj = this.LIZIZ;
                    HandlerHook.viewPost(c1126250fPj, new ARunnableS75S0200000_6(c1126250fPj, c1126540fQC, 83));
                }
            }
        };
        c1126540fQC.LJII();
    }
}
