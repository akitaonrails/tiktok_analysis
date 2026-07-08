package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import qo2.w;

/* JADX INFO: renamed from: X.0eP5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087410eP5 implements OnIMMessageListener {
    public final DataChannel LL;
    public final Context LLILLJJLI;
    public C1086150eN3 LLILLL;
    public final IMessageManager LLILZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "PrivilegeAdvancedMessageListener";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC1087420eP6[] interfaceC1087420eP6Arr;
        String str;
        String str2;
        String str3;
        String str4;
        if (iMessage != 0 && (iMessage instanceof PrivilegeAdvanceMessage)) {
            DataChannel dataChannel = this.LL;
            PrivilegeAdvanceMessage privilegeAdvanceMessage = (PrivilegeAdvanceMessage) iMessage;
            if (dataChannel != null) {
                try {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_advanced_message_receive_im");
                    c474500IjALIZ.LJIIIIZZ();
                    C1087430eP7.LIZ(c474500IjALIZ, dataChannel, privilegeAdvanceMessage);
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                        c474500IjALIZ.LJIJJLI(dataChannel);
                        c474500IjALIZ.LIZ();
                    } else {
                        c474500IjALIZ.LJJIJLIJ();
                        c474500IjALIZ.LJIIIIZZ();
                        w wVar = w.LIZ;
                        wVar.getClass();
                        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                        c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
                        c474500IjALIZ.LIZ();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            long j = 0;
            C1087430eP7.LIZIZ(EnumC1087450eP9.RECEIVE, this.LL, privilegeAdvanceMessage, 0L);
            C1086150eN3 c1086150eN3 = this.LLILLL;
            int i = 0;
            if (c1086150eN3 != null && (interfaceC1087420eP6Arr = c1086150eN3.LIZ) != null) {
                for (InterfaceC1087420eP6 interfaceC1087420eP6 : interfaceC1087420eP6Arr) {
                    if (interfaceC1087420eP6.LIZIZ(privilegeAdvanceMessage.subType) && interfaceC1087420eP6.LIZ(iMessage)) {
                        DataChannel dataChannel2 = this.LL;
                        if (dataChannel2 != null) {
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_advanced_message_intercept");
                            C1087430eP7.LIZ(c474500IjALIZ2, dataChannel2, privilegeAdvanceMessage);
                            c474500IjALIZ2.LJJII(C1087430eP7.LIZ, "reason");
                            RoomNotifyMessage roomNotifyMessage = privilegeAdvanceMessage.notify;
                            if (roomNotifyMessage != null) {
                                j = roomNotifyMessage.from_user_id;
                            }
                            c474500IjALIZ2.LJJII(Long.valueOf(j), "message_trigger_userid");
                            c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                            c474500IjALIZ2.LJJII(privilegeAdvanceMessage.scene, "biz_scenario");
                            PrivilegeLogExtra privilegeLogExtra = privilegeAdvanceMessage.privilegeLogExtra;
                            String str5 = "";
                            if (privilegeLogExtra == null || (str = privilegeLogExtra.privilege_id) == null) {
                                str = "";
                            }
                            c474500IjALIZ2.LJJII(str, "privilege_id");
                            PrivilegeLogExtra privilegeLogExtra2 = privilegeAdvanceMessage.privilegeLogExtra;
                            if (privilegeLogExtra2 == null || (str2 = privilegeLogExtra2.privilege_order_id) == null) {
                                str2 = "";
                            }
                            c474500IjALIZ2.LJJII(str2, "privilege_order_id");
                            PrivilegeLogExtra privilegeLogExtra3 = privilegeAdvanceMessage.privilegeLogExtra;
                            if (privilegeLogExtra3 == null || (str3 = privilegeLogExtra3.privilege_version) == null) {
                                str3 = "";
                            }
                            c474500IjALIZ2.LJJII(str3, "privilege_version_id");
                            PrivilegeLogExtra privilegeLogExtra4 = privilegeAdvanceMessage.privilegeLogExtra;
                            if (privilegeLogExtra4 != null && (str4 = privilegeLogExtra4.data_version) != null) {
                                str5 = str4;
                            }
                            c474500IjALIZ2.LJJII(str5, "data_version_id");
                            c474500IjALIZ2.LIZ();
                            return;
                        }
                        return;
                    }
                }
            }
            EnumC1087550ePJ enumC1087550ePJ = EnumC1087550ePJ.INSTANCE;
            BaseMessage baseMessage = (BaseMessage) iMessage;
            DisplayControl displayControl = privilegeAdvanceMessage.control;
            if (displayControl != null) {
                i = displayControl.priority;
            }
            enumC1087550ePJ.add(baseMessage, i);
        }
    }

    public C1087410eP5(Context context, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        this.LL = dataChannel;
        this.LLILLJJLI = context;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILZ = iMessageManager;
    }
}
