package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestInvitePreApprovedChannel;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInvitePreApproveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS328S0000000_3;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925320aBe {
    public static final C925320aBe LIZ = new C925320aBe();
    public static int LIZIZ = 2;

    public static boolean LIZIZ() {
        boolean zBooleanValue;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            boolean booleanValue = LiveAbLabelSetting.INSTANCE.getBooleanValue("mg_enable_anchor_full_seat_accept_invite");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getExpValue: anchorSetting=");
            sbLIZ.append(booleanValue);
            C20441214yg.LIZIZ("MultiGuestInvitePreApproveHelper", C2188811AlT.LIZIZ(sbLIZ));
            return booleanValue;
        }
        Boolean boolLIZLLL = C931820aM8.LIZLLL("mg_enable_anchor_full_seat_accept_invite");
        boolean z = false;
        if (boolLIZLLL != null) {
            zBooleanValue = boolLIZLLL.booleanValue();
            if (zBooleanValue && MultiGuestInvitePreApproveSetting.isEnabled()) {
                z = true;
            }
        } else {
            zBooleanValue = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getExpValue: guestSetting=");
        sbLIZ2.append(zBooleanValue);
        C20441214yg.LIZIZ("MultiGuestInvitePreApproveHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public static boolean LIZLLL() {
        return LIZIZ() && !C917810ZzX.LJII();
    }

    public static boolean LIZJ(DataChannel dataChannel) {
        Object objGg0;
        if (dataChannel != null && (objGg0 = dataChannel.gg0(MultiGuestInvitePreApprovedChannel.class)) != null && LIZLLL() && objGg0 != EnumC922400a6w.NONE) {
            return true;
        }
        return false;
    }

    public static void LJFF(DataChannel dataChannel) {
        C20441214yg.LIZIZ("MultiGuestInvitePreApproveHelper", "resetState");
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestInvitePreApprovedChannel.class, EnumC922400a6w.NONE);
        }
    }

    public static void LIZ(Context context, DataChannel dataChannel, boolean z) {
        Room room;
        EnumC922400a6w enumC922400a6w;
        C926050aCp c926050aCpLJ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (enumC922400a6w = (EnumC922400a6w) dataChannel.gg0(MultiGuestInvitePreApprovedChannel.class)) != null) {
            int i = C922390a6v.LIZ[enumC922400a6w.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    InterfaceC925430aBp interfaceC925430aBpLIZ = C925970aCh.LIZ();
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    long j = LIZIZ;
                    InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
                    if (interfaceC925800aCQLIZIZ != null) {
                        c926050aCpLJ = interfaceC925800aCQLIZIZ.LJ();
                    } else {
                        c926050aCpLJ = null;
                    }
                    interfaceC925430aBpLIZ.LIZ(new C949770ap5(id, ownerUserId, j, c926050aCpLJ), new C925920aCc(new AwS594S0100000_15(dataChannel, 7), AFwS328S0000000_3.get$arr$(0)));
                    return;
                }
                return;
            }
            if (z) {
                return;
            }
            C950850aqp c950850aqp = new C950850aqp(room.getId(), room.getOwnerUserId(), 2, new BizReplyParams(LIZIZ, 0), 0L, 48);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null) {
                return;
            }
            interfaceC954180awCLLJLL.LLFII(c950850aqp, new C987180bnQ(context, dataChannel, 0));
        }
    }

    public static void LJ(int i, DataChannel dataChannel, boolean z) {
        EnumC922400a6w enumC922400a6w;
        if (LIZLLL()) {
            C20441214yg.LIZIZ("MultiGuestInvitePreApproveHelper", "onPreApproveSuccess");
            LIZIZ = i;
            if (dataChannel != null) {
                if (z) {
                    enumC922400a6w = EnumC922400a6w.OUTROOM_INVITE_PRE_APPROVE;
                } else {
                    enumC922400a6w = EnumC922400a6w.INROOM_INVITE_PRE_APPROVE;
                }
                dataChannel.zW(MultiGuestInvitePreApprovedChannel.class, enumC922400a6w);
                return;
            }
            return;
        }
        C20441214yg.LJ("MultiGuestInvitePreApproveHelper", "onPreApproveSuccess error return");
    }
}
