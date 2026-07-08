package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkUseRealFirstFrameRenderCallback;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustRTCMsgDispatchSetting;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0201200_35;
import kotlin.jvm.internal.AwS172S0101000_35;
import kotlin.jvm.internal.AwS436S0200000_35;

/* JADX INFO: renamed from: X.1EBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277261EBo implements InterfaceC1274710jHB {
    public static final String LJ;
    public final InterfaceC2277271EBp LIZ;
    public final boolean LIZIZ = MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getSyncNetworkState();
    public final boolean LIZJ = LivesdkUseRealFirstFrameRenderCallback.getValue();
    public final boolean LIZLLL = LinkMicRustRTCMsgDispatchSetting.INSTANCE.enable();

    @Override // X.InterfaceC1274710jHB
    public final /* synthetic */ void LIZJ(InterfaceC1276380jJs interfaceC1276380jJs, LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Callback]");
        sbLIZ.append("DualDeviceRtc");
        LJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2277261EBo(InterfaceC2277271EBp interfaceC2277271EBp) {
        this.LIZ = interfaceC2277271EBp;
    }

    public static void LIZLLL(InterfaceC2277271EBp interfaceC2277271EBp, Function1 function1) {
        C20550083g.LIZ(new AwS436S0200000_35(interfaceC2277271EBp, (InterfaceC2277271EBp) function1, (Function1<? super InterfaceC2277271EBp, Unit>) 80));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0273  */
    @Override // X.InterfaceC1274710jHB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC1276380jJs r23, int r24, long r25, long r27, java.lang.Object... r29) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277261EBo.LIZ(X.0jJs, int, long, long, java.lang.Object[]):void");
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZIZ(InterfaceC1276380jJs interfaceC1276380jJs, int i, long j, long j2, Exception exc) {
        C20550083g.LIZ(new AwS0S0201200_35(i, this, j, j2, exc, 0));
        C176600m4.LIZJ(new AwS172S0101000_35(i, this, j, j2, 6));
    }
}
