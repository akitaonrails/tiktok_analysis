package X;

import android.app.Activity;
import com.bytedance.android.live.broadcast.api.OpenMorePanelAndScrollEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0Tnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757750Tnx extends AbstractC757760Tny {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        InterfaceC1088880eRS interfaceC1088880eRSMn1;
        DataChannel dataChannelProvideDataChannel = null;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC757780To0.class, null);
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
        C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(c19eg);
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
        }
        if (C0UIM.LJFF() || ((interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannelProvideDataChannel)) != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES))) {
            if (dataChannelProvideDataChannel != null) {
                dataChannelProvideDataChannel.FQ2(OpenMorePanelAndScrollEvent.class);
            }
        } else if (dataChannelProvideDataChannel != null) {
            dataChannelProvideDataChannel.FQ2(ShowInteractionFeatureDialogEvent.class);
        }
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
