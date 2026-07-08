package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914970Zux {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnlargeScreenManageParams enlargeScreenManageParams) {
        long id;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        long ownerUserId = 0;
        if (roomLJJLI != null) {
            id = roomLJJLI.getId();
        } else {
            id = 0;
        }
        enlargeScreenManageParams.roomId = id;
        enlargeScreenManageParams.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        enlargeScreenManageParams.operateUserId = UserService.getInstance().user().getCurrentUserId();
        Room roomLJJLI2 = C500260Jjc.LJJLI();
        if (roomLJJLI2 != null) {
            ownerUserId = roomLJJLI2.getOwnerUserId();
        }
        enlargeScreenManageParams.anchorId = ownerUserId;
    }

    public static long LIZIZ(String str) {
        InterfaceC958070b2T interfaceC958070b2TLLJJ;
        Long lValueOf;
        Long l;
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        User user;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        User user2;
        LinkUser linkUserLJJIFFI;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        Object obj = null;
        if (interfaceC954180awCLLJLL != null) {
            interfaceC958070b2TLLJJ = interfaceC954180awCLLJLL.LLJJ();
        } else {
            interfaceC958070b2TLLJJ = null;
        }
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        if (interfaceC958070b2TLLJJ != null && (linkUserLJJIFFI = interfaceC958070b2TLLJJ.LJJIFFI(str)) != null) {
            l = linkUserLJJIFFI.userId;
        } else {
            l = null;
        }
        if (Intrinsics.LJFF(lValueOf, l)) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if ((objLJIIIZ instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                Iterator it2 = listLJJIII2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((LinkPlayerInfo) next).mInteractIdStr, str)) {
                        obj = next;
                        break;
                    }
                }
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                    return user2.getId();
                }
                return 0L;
            }
            return 0L;
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if ((objLJIIIZ2 instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ2) != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            Iterator it3 = listLJJIII.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (Intrinsics.LJFF(((LinkListUser) next2).linkMicId, str)) {
                    obj = next2;
                    break;
                }
            }
            LinkListUser linkListUser = (LinkListUser) obj;
            if (linkListUser != null && (user = linkListUser.user) != null) {
                return user.getId();
            }
            return 0L;
        }
        return 0L;
    }
}
