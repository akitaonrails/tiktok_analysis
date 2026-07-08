package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eN0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086120eN0 implements InterfaceC1087420eP6 {
    public final DataChannel LIZ;
    public volatile boolean LIZIZ;

    @Override // X.InterfaceC1087420eP6
    public final boolean LIZIZ(String str) {
        return true;
    }

    public C1086120eN0(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdvacedMessageDowngrade()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.ADVANCED_MESSAGE_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0eN1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    boolean z;
                    C1086120eN0 c1086120eN0 = this.LIZ;
                    if (((Number) c0is4.LIZ).intValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1086120eN0.LIZIZ = z;
                }
            });
        }
    }

    @Override // X.InterfaceC1087420eP6
    public final boolean LIZ(IMessage iMessage) {
        Long lValueOf;
        InterfaceC2262081DgM currentUser;
        DataChannel dataChannel;
        User user;
        if (this.LIZIZ && (iMessage instanceof PrivilegeAdvanceMessage)) {
            RoomNotifyMessage roomNotifyMessage = ((PrivilegeAdvanceMessage) iMessage).notify;
            Long lValueOf2 = null;
            if (roomNotifyMessage != null) {
                lValueOf = Long.valueOf(roomNotifyMessage.from_user_id);
            } else {
                lValueOf = null;
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUser = interfaceC500940JkiUser.getCurrentUser();
            } else {
                currentUser = null;
            }
            if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                lValueOf2 = Long.valueOf(user.getId());
            }
            if (!Intrinsics.LJFF(lValueOf, lValueOf2) && ((dataChannel = this.LIZ) == null || !Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }
}
