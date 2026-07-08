package X;

import android.app.Activity;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS106S1200000_23;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506970pJn extends AbstractC1506880pJe {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strLJIJI;
        Activity activityLIZLLL;
        long j;
        Activity activityLIZLLL2;
        C19EG c19eg;
        InterfaceC1506860pJc interfaceC1506860pJc = (InterfaceC1506860pJc) xBaseParamModel;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String str = "";
            InterfaceC1506870pJd interfaceC1506870pJd = (InterfaceC1506870pJd) C1909107dp.LIZJ(InterfaceC1506870pJd.class, "");
            if (!Intrinsics.LJFF(interfaceC1506860pJc.getStatus(), 0) ? (strLJIJI = C497740JfY.LJIJI(2131852200)) != null : (strLJIJI = C497740JfY.LJIJI(2131852199)) != null) {
                str = strLJIJI;
            }
            Number status = interfaceC1506860pJc.getStatus();
            DataChannel dataChannelProvideDataChannel = null;
            if (Intrinsics.LJFF(status, 0)) {
                j = 2;
            } else if (Intrinsics.LJFF(status, 1)) {
                j = 1;
            } else {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
                    C766270U4b.LJIIIZ(C786410Ut5.L3(activityLIZLLL), str);
                }
                C2382909Vj.LIZ(completionBlock, -2, null, null, 6);
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                activityLIZLLL2 = interfaceC634840OvC2.LIZLLL();
            } else {
                activityLIZLLL2 = null;
            }
            if (activityLIZLLL2 instanceof C19EG) {
                c19eg = (C19EG) activityLIZLLL2;
            } else {
                c19eg = null;
            }
            C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(c19eg);
            if (c0ip3LIZIZ != null) {
                dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
            }
            ((IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class)).ia2(room, j, new AwS424S0200000_23(interfaceC1506870pJd, (InterfaceC1506870pJd) completionBlock, (CompletionBlock<InterfaceC1506870pJd>) 11), new AwS106S1200000_23(this, (C1506970pJn) str, (String) completionBlock, (CompletionBlock<InterfaceC1506870pJd>) 1), dataChannelProvideDataChannel);
        }
    }
}
