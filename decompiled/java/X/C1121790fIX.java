package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.subscription.LivePCSAnchorTitleAnaliseWithAISetting;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121790fIX {
    public final DataChannel LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r3 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LIZ
            r2 = 0
            if (r1 == 0) goto Ld
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r2 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r2
        Ld:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LIZ
            if (r1 == 0) goto L30
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L30
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.LIZ
            if (r0 == 0) goto L25
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r0)
            if (r0 != 0) goto L27
        L25:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L27:
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L30
        L2f:
            return r0
        L30:
            if (r2 == 0) goto L36
            java.lang.String r0 = r2.mTitle
            if (r0 != 0) goto L2f
        L36:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1121790fIX.LIZ():java.lang.String");
    }

    public C1121790fIX(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fIs] */
    public final void LIZIZ(final IHostPCS iHostPCS, final String str, final String str2, final boolean z, final AwS596S0100000_17 awS596S0100000_17) {
        final String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runModel, title: ");
        sbLIZ.append(str);
        sbLIZ.append(", intro: ");
        sbLIZ.append(str2);
        sbLIZ.append(", hasIntro: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ServicePlusTitleUnderstandingDelegate", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZ());
            sbLIZ2.append(LivePCSAnchorTitleAnaliseWithAISetting.INSTANCE.getInputSeparator());
            sbLIZ2.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = str;
        }
        iHostPCS.b02(new C1121990fIr(iHostPCS, new InterfaceC1123070fKb(strLIZIZ, z, this, str, str2, awS596S0100000_17) { // from class: X.0fIs
            public final String LIZ = LivePCSAnchorTitleAnaliseWithAISetting.INSTANCE.getAndroidScene();
            public final boolean LIZIZ = true;
            public final C1122030fIv LIZJ;
            public final /* synthetic */ String LJ;

            @Override // X.InterfaceC1123070fKb
            public final Map<String, Object> LIZ() {
                return C2097908Jt.LIZJ(new Pair(this.LIZLLL.e60(), this.LJ));
            }

            @Override // X.InterfaceC1123070fKb
            public final String LIZIZ() {
                return this.LIZLLL.F12();
            }

            @Override // X.InterfaceC1123070fKb
            public final Function1<AbstractC1122140fJ6, Unit> LIZJ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1123070fKb
            public final String getScene() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1123070fKb
            public final boolean isActive() {
                return this.LIZIZ;
            }

            {
                this.LIZJ = new C1122030fIv(z, this, str, str2, awS596S0100000_17);
            }
        }, this, str, str2));
    }
}
