package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterTemperNetDisplaySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AHC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHC extends C1AHE {
    public final ImageView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public int LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    @Override // X.C1AHE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(int r12) {
        /*
            r11 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r11.getDataChannel()
            boolean r0 = X.C500260Jjc.LJJJIL(r0)
            r3 = 2131844557(0x7f115dcd, float:1.932251E38)
            if (r0 == 0) goto L31
            X.16F5 r2 = r11.LLILZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C497740JfY.LJIJI(r3)
            r1.append(r0)
            java.lang.String r0 = ": -"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.setText(r0)
            android.widget.ImageView r0 = r11.LLILLJJLI
            X.C500260Jjc.LJIILIIL(r0)
            X.16F5 r0 = r11.LLILLL
            X.C500260Jjc.LJIILIIL(r0)
            return
        L31:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterTemperNetDisplaySetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterTemperNetDisplaySetting.INSTANCE
            boolean r0 = r0.inExperiment()
            r6 = 0
            if (r0 != 0) goto La1
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r11.getDataChannel()
            if (r1 == 0) goto L9f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r1 = r1.gg0(r0)
        L46:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r1 == r0) goto La1
            android.widget.ImageView r0 = r11.LLILLJJLI
            X.C500260Jjc.LLFFF(r0)
            X.16F5 r0 = r11.LLILLL
            X.C500260Jjc.LLFFF(r0)
        L54:
            long r9 = r11.I5()
            r0 = 3600(0xe10, float:5.045E-42)
            long r0 = (long) r0
            long r4 = r9 / r0
            long r0 = r0 * r4
            long r9 = r9 - r0
            r0 = 60
            long r0 = (long) r0
            long r9 = r9 / r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r7 = 0
            if (r0 <= 0) goto Lac
            X.16F5 r6 = r11.LLILZ
            java.lang.StringBuilder r8 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C497740JfY.LJIJI(r3)
            r8.append(r0)
            java.lang.String r0 = ": "
            r8.append(r0)
            int r3 = (int) r4
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r2[r7] = r0
            r1 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r2[r1] = r0
            r0 = 2131755563(0x7f10022b, float:1.9142009E38)
            java.lang.String r0 = X.C497740JfY.LJIIL(r0, r3, r2)
            r8.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r8)
            r6.setText(r0)
            return
        L9f:
            r1 = r6
            goto L46
        La1:
            android.widget.ImageView r0 = r11.LLILLJJLI
            X.C500260Jjc.LJIILIIL(r0)
            X.16F5 r0 = r11.LLILLL
            X.C500260Jjc.LJIILIIL(r0)
            goto L54
        Lac:
            X.16F5 r3 = r11.LLILZ
            r0 = 2131842899(0x7f115753, float:1.9319147E38)
            java.lang.String r2 = X.C497740JfY.LJIJI(r0)
            if (r2 == 0) goto Lc1
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "{n}"
            java.lang.String r6 = kotlin.text.u.LJJIFFI(r2, r0, r1, r7)
        Lc1:
            r3.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AHC.P5(int):void");
    }

    public C1AHC(View view, C1AHD c1ahd) {
        Object objGg0;
        super(view, c1ahd);
        ImageView imageView = (ImageView) view.findViewById(R.id.w1a);
        this.LLILLJJLI = imageView;
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.w18);
        this.LLILLL = c16f5;
        this.LLILZ = (C16F5) view.findViewById(R.id.mwo);
        this.LLILZIL = -1;
        if (!LiveCenterTemperNetDisplaySetting.INSTANCE.inExperiment()) {
            DataChannel dataChannel = getDataChannel();
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(LiveModeChannel.class);
            } else {
                objGg0 = null;
            }
            if (objGg0 != LiveMode.LIVE_STUDIO) {
                DataChannel dataChannel2 = getDataChannel();
                if (dataChannel2 != null) {
                    dataChannel2.DQ2(BroadcastNetworkStatusChannel.class, this, new AwS612S0100000_33(this, 201));
                    return;
                }
                return;
            }
        }
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        if (c16f5 == null) {
            return;
        }
        C786410Ut5.LLJJJJ(c16f5, 8);
    }
}
