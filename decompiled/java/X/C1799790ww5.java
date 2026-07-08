package X;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS155S0400000_27;

/* JADX INFO: renamed from: X.0ww5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799790ww5 extends AbstractC1799750ww1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        C0IP3 c0ip3LIZIZ;
        DataChannel dataChannelProvideDataChannel;
        FragmentManager fragmentManager;
        InterfaceC1799770ww3 interfaceC1799770ww3 = (InterfaceC1799770ww3) xBaseParamModel;
        Room room = null;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1799760ww2.class, null);
        try {
            interfaceC1799770ww3.getScene();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                activityLIZLLL = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            if (activityLIZLLL instanceof C19EG) {
                c19eg = (C19EG) activityLIZLLL;
            } else {
                c19eg = null;
            }
            c0ip3LIZIZ = C475510Ikn.LIZIZ(c19eg);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("OpenStickerPanelMethod", e);
        }
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
            if (dataChannelProvideDataChannel != null) {
                fragmentManager = (FragmentManager) dataChannelProvideDataChannel.gg0(C748880TZe.class);
                room = (Room) dataChannelProvideDataChannel.gg0(RoomChannel.class);
            }
            C500260Jjc.LJJLIIIJILLIZJL(new AwS155S0400000_27(interfaceC1799770ww3, dataChannelProvideDataChannel, fragmentManager, room, 6));
            completionBlock.onSuccess(xBaseResultModel, "");
        }
        dataChannelProvideDataChannel = null;
        fragmentManager = null;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS155S0400000_27(interfaceC1799770ww3, dataChannelProvideDataChannel, fragmentManager, room, 6));
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
