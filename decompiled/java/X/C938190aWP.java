package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aWP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938190aWP extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ() {
        /*
            r7 = this;
            com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting r4 = com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting.INSTANCE
            boolean r0 = r4.isOptimizeMultiGuest()
            if (r0 == 0) goto L8b
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            int r1 = r0.LJII()
            r0 = 3
            r3 = 4
            if (r1 == r0) goto Lb3
            if (r1 == r3) goto Lb3
            r2 = 0
        L1b:
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            java.util.List r0 = r0.LJIIIZ()
            int r5 = r0.size()
            if (r5 <= r3) goto La0
            if (r2 == 0) goto Lac
            boolean r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting.isSmallTrayOnWindow()
            if (r0 == 0) goto L8c
            X.0Ili r0 = X.EnumC476080Ili.SMALL_TRAY_ON_WINDOW
            int r4 = r0.getValue()
        L3b:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLILZLL
            java.lang.Class<com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel> r0 = com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel.class
            java.lang.Object r6 = r1.gg0(r0)
            X.0aWQ r6 = (X.C938200aWQ) r6
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "post MultiGuestSceneGiftPanelChangeChannel isInGridLayout:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = "live_host_change"
            X.C20441214yg.LJIIIZ(r2, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "windowNum  "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " , optType "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r2, r0)
            if (r6 == 0) goto L8b
            int r0 = r6.LIZ
            if (r0 != r4) goto L7f
            int r0 = r6.LIZIZ
            if (r0 == r3) goto L8b
        L7f:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r7.LLILZLL
            java.lang.Class<com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel> r1 = com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel.class
            X.0aWQ r0 = new X.0aWQ
            r0.<init>(r4, r3)
            r2.zW(r1, r0)
        L8b:
            return
        L8c:
            boolean r0 = r4.isSmallTrayOnPublicScreen()
            if (r0 == 0) goto L99
            X.0Ili r0 = X.EnumC476080Ili.SMALL_TRAY_ON_PUBLIC_SCREEN
            int r4 = r0.getValue()
            goto L3b
        L99:
            X.0Ili r0 = X.EnumC476080Ili.NORMAL_TRAY
            int r4 = r0.getValue()
            goto L3b
        La0:
            r0 = 2
            if (r5 <= r0) goto Lac
            if (r2 == 0) goto Lac
            X.0Ili r0 = X.EnumC476080Ili.SMALL_TRAY_ON_WINDOW
            int r4 = r0.getValue()
            goto L3b
        Lac:
            X.0Ili r0 = X.EnumC476080Ili.NORMAL_TRAY
            int r4 = r0.getValue()
            goto L3b
        Lb3:
            r2 = 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938190aWP.LJJ():void");
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.LJIJ(interfaceC940060aZQ);
        this.LLILZLL.BQ2(this, MultiGuestLayoutRenderV2.SwitchLayoutEvent.class, new AwS594S0100000_15(this, 934));
        this.LLILZLL.BQ2(this, PIPModeChangeEvent.class, new AwS594S0100000_15(this, 935));
    }

    public C938190aWP(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
