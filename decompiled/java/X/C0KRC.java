package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KRC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KRC extends C0KRD {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        User owner;
        int pushStatus;
        String strLJ;
        User user;
        C0KRF c0krf = (C0KRF) xBaseParamModel;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        if (room != null && owner != null && owner.getFollowInfo() != null) {
            Number pushStatus2 = c0krf.getPushStatus();
            if (pushStatus2 == null || (pushStatus = pushStatus2.intValue()) <= 0) {
                pushStatus = (int) owner.getFollowInfo().getPushStatus();
            }
            IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.n42(room) && iMicRoomService.TM(room)) {
                OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
                if (officialChannelInfo == null || (user = officialChannelInfo.channelUser) == null) {
                    strLJ = "";
                } else {
                    strLJ = C0KVU.LJ(user);
                }
            } else {
                strLJ = C0KVU.LJ(owner);
            }
            C0IL8 c0il8 = new C0IL8();
            c0il8.LIZIZ = String.valueOf(owner.getId());
            c0il8.LIZ = String.valueOf(room.getId());
            c0il8.LIZJ = "jsb";
            c0il8.LIZLLL = "live_cell";
            ((HashMap) c0il8.LJ).put("event_belong", "live");
            ((HashMap) c0il8.LJ).put("event_page", "notification_setting");
            ((HashMap) c0il8.LJ).put("previous_page", "subscription_benefits_to_do");
            C0KRG c0krg = new C0KRG();
            c0krg.LIZ = c0il8;
            c0krg.LIZIZ = owner;
            c0krg.LIZJ = strLJ;
            c0krg.LIZLLL = pushStatus;
            c0krg.LJ = C0KVU.LIZLLL(owner);
            C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(c0krg, 569));
        }
        C0KRE c0kre = (C0KRE) C1909107dp.LIZJ(C0KRE.class, null);
        c0kre.setCode(1);
        completionBlock.onSuccess(c0kre, "");
    }
}
