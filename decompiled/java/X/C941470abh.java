package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.PreviewLiveTabCapsuleColorThemeChangeEvent;
import com.bytedance.android.live.broadcast.api.PreviewToolBarTopValueChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0abh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941470abh extends AbstractC941490abj {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public int LLIZ;
    public C957020b0m LLIZLLLIL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetach() {
        /*
            r7 = this;
            super.onDetach()
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            int r0 = r0.getPanelLayoutType()
            r6 = 2
            if (r0 != r6) goto L51
            X.0b0m r0 = r7.LLIZLLLIL
            r5 = 0
            if (r0 == 0) goto L57
            android.view.ViewParent r4 = r0.getParent()
        L1b:
            boolean r0 = r4 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L54
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L55
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
        L27:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L2e
            r5 = r1
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
        L2e:
            r3 = 0
            if (r5 == 0) goto L52
            int r0 = r5.topMargin
        L33:
            int r2 = r7.LLIZ
            int[] r1 = new int[r6]
            r1[r3] = r0
            r0 = 1
            r1[r0] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r1)
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.setDuration(r0)
            Y.AUListenerS214S0200000_2 r1 = new Y.AUListenerS214S0200000_2
            r0 = 6
            r1.<init>(r5, r4, r0)
            r2.addUpdateListener(r1)
            r2.start()
        L51:
            return
        L52:
            r0 = 0
            goto L33
        L54:
            r4 = r5
        L55:
            r1 = r5
            goto L27
        L57:
            r4 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941470abh.onDetach():void");
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.LJIJ(interfaceC940060aZQ);
        this.LLILZLL.BQ2(this, PreviewToolBarTopValueChannel.class, new AwS594S0100000_15(this, 949));
    }

    @Override // X.InterfaceC942100aci
    public final Rect LJIILL(C957020b0m c957020b0m, Rect rect) {
        int iIntValue;
        if (c957020b0m.LLJIJIL) {
            int i = !C941460abg.LIZIZ(c957020b0m, C940770aaZ.LIZ().getDataSource(), this.LLILZIL.getContext(), true) ? 1 : 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("color theme: ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("PreviewLiveWindowFrameChangePlugin", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZLL.zW(PreviewLiveTabCapsuleColorThemeChangeEvent.class, Integer.valueOf(i));
        }
        int panelLayoutType = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
        this.LLIZLLLIL = null;
        if (!c957020b0m.LLJIJIL && panelLayoutType == 2) {
            this.LLIZLLLIL = c957020b0m;
            this.LLIZ = rect.top;
            int[] iArr = new int[2];
            this.LLILZIL.getLocationOnScreen(iArr);
            Integer num = (Integer) this.LLILZLL.gg0(PreviewToolBarTopValueChannel.class);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            int i2 = iIntValue - iArr[1];
            if (i2 > 0) {
                int i3 = rect.bottom - i2;
                Rect rect2 = new Rect(rect);
                rect2.top = rect.top - i3;
                rect2.bottom = rect.bottom - i3;
                return rect2;
            }
            return rect;
        }
        return C941460abg.LIZ(rect, c957020b0m, this.LLILZIL.getContext());
    }

    public C941470abh(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
