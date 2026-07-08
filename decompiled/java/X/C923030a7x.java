package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0a7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923030a7x {
    public static List LIZ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        String idStr;
        InterfaceC924460aAG interfaceC924460aAGLIZ;
        InterfaceC923040a7y interfaceC923040a7yHe;
        AbstractC923560a8o abstractC923560a8oLIZ;
        List listLJ;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List<LinkPlayerInfo> listLJJIII;
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ2.LJJIII()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIII, 10));
            for (LinkPlayerInfo linkPlayerInfo : listLJJIII) {
                LinkListUser linkListUser = new LinkListUser();
                linkListUser.user = linkPlayerInfo.mUser;
                linkListUser.fanTicket = linkPlayerInfo.mFanTicket;
                linkListUser.linkMicId = linkPlayerInfo.mInteractIdStr;
                arrayList.add(linkListUser);
            }
            return new ArrayList(arrayList);
        }
        if (!C930540aK4.LJJIFFI()) {
            InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (interfaceC917640ZzG == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null) {
                return null;
            }
            return abstractC928510aGnLIZ.LJJIII();
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (idStr = room.getIdStr()) == null || (interfaceC924460aAGLIZ = C923060a80.LIZ(idStr)) == null || (interfaceC923040a7yHe = interfaceC924460aAGLIZ.He()) == null || (abstractC923560a8oLIZ = interfaceC923040a7yHe.LIZ()) == null || (listLJ = abstractC923560a8oLIZ.LJ()) == null) {
            return null;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Iterator it2 = listLJ.iterator();
        while (it2.hasNext()) {
            User user = ((LinkListUser) it2.next()).user;
            if (user != null && user.getId() == currentUserId) {
                it2.remove();
            }
        }
        return listLJ;
    }
}
