package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0fY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131400fY2 {
    public final InterfaceC1132530fZr LIZ;
    public InterfaceC1132390fZd LIZIZ;
    public final InterfaceC1135310feL LIZJ;
    public final C1131650fYR LIZLLL;

    public final void LIZIZ() {
        DataChannel dataChannelO3;
        DataChannel dataChannelO32;
        IMessageManager iMessageManager;
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        if (interfaceC1132530fZr != null && (dataChannelO32 = interfaceC1132530fZr.o3()) != null && (iMessageManager = (IMessageManager) dataChannelO32.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.GIFT.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.ASSET_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.TRAY_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.GIFT_GLOBAL_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.ACCESS_RECALL_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.EFFECT_PRELOADING_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.MINUTE_GAME_UPDATE_MESSAGE.getIntType(), this.LIZLLL);
        }
        InterfaceC1132530fZr interfaceC1132530fZr2 = this.LIZ;
        if (interfaceC1132530fZr2 == null || (dataChannelO3 = interfaceC1132530fZr2.o3()) == null) {
            return;
        }
        dataChannelO3.zQ2(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0fYR] */
    public C1131400fY2(InterfaceC1132530fZr interfaceC1132530fZr) {
        InterfaceC1135310feL interfaceC1135310feLLIZIZ;
        this.LIZ = interfaceC1132530fZr;
        if (interfaceC1132530fZr != null) {
            interfaceC1135310feLLIZIZ = interfaceC1132530fZr.LIZIZ();
        } else {
            interfaceC1135310feLLIZIZ = null;
        }
        this.LIZJ = interfaceC1135310feLLIZIZ;
        this.LIZLLL = new OnIMMessageListener() { // from class: X.0fYR
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "GiftIMRegister";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue() ? IMListenerType.ASYNC : IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                C1131400fY2 c1131400fY2 = this.LL;
                c1131400fY2.getClass();
                if (iMessage != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onMessage, messageId = ");
                    sbLIZ.append(iMessage.getMessageId());
                    sbLIZ.append(" messageType is = ");
                    sbLIZ.append(iMessage.getIntType());
                    C1133910fc5.LJFF("GiftIMRegister", C2188811AlT.LIZIZ(sbLIZ));
                    if (LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
                        InterfaceC1135310feL interfaceC1135310feL = c1131400fY2.LIZJ;
                        if (interfaceC1135310feL != null) {
                            interfaceC1135310feL.LJ("GiftIMRegister.onMessageReceived", new AwS418S0200000_17(c1131400fY2, iMessage, 5));
                            return;
                        } else {
                            c1131400fY2.LIZ(iMessage);
                            return;
                        }
                    }
                    c1131400fY2.LIZ(iMessage);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.ugc.live.sdk.message.data.IMessage r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "gift_receiving_"
            r1.append(r0)
            java.lang.String r2 = "GiftIMRegister"
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "handleMessageOnWorker"
            X.C1138230fj3.LIZIZ(r1, r0)
            boolean r0 = r4 instanceof com.bytedance.android.livesdk.model.message.GiftMessage
            if (r0 != 0) goto L45
            boolean r0 = r4 instanceof com.bytedance.android.livesdk.model.message.LiveTrayMessage
            if (r0 != 0) goto L45
            boolean r0 = r4 instanceof com.bytedance.android.livesdk.model.message.AssetMessage
            if (r0 != 0) goto L45
            boolean r0 = r4 instanceof com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage
            if (r0 == 0) goto L3f
            X.0fZr r0 = r3.LIZ
            if (r0 == 0) goto L3d
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.o3()
        L2f:
            com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage r4 = (com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage) r4
            boolean r0 = X.C118500ch.LIZ(r0, r4)
        L35:
            if (r0 != 0) goto L3c
        L37:
            java.lang.String r0 = "onMessageReceived error, isHandled = false, please ensure handle this message"
            X.C1133910fc5.LJFF(r2, r0)
        L3c:
            return
        L3d:
            r0 = 0
            goto L2f
        L3f:
            java.lang.String r0 = "onMessageReceived error, message is not support, please ensure handle this message"
            X.C1133910fc5.LJFF(r2, r0)
            goto L37
        L45:
            X.0fZd r0 = r3.LIZIZ
            if (r0 == 0) goto L37
            boolean r0 = r0.LIZ(r4)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131400fY2.LIZ(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
