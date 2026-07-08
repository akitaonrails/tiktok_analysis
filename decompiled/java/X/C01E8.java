package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: renamed from: X.01E8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01E8 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LJFF() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    public static boolean LJI() {
        C930480aJy.LIZ.getClass();
        return ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).py0();
    }

    public static long LIZLLL() {
        String strU3;
        Long lLJIILIIL;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) == null) {
                return 0L;
            }
            return lLJIILIIL.longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static C299601Ec LIZ(C01E5 c01e5) {
        CountdownContent countdownContent;
        CountdownUser countdownUser;
        CountdownConfig countdownConfig;
        if (c01e5 == null || (countdownContent = c01e5.LIZ) == null || (countdownUser = countdownContent.countdownUser) == null || (countdownConfig = countdownContent.countdownConfig) == null) {
            return null;
        }
        long j = countdownContent.countdownId;
        C01EB c01ebLIZ = C01EF.LIZ(countdownContent.status);
        long j2 = countdownContent.startTime;
        LinkerMediaChangeOperator linkerMediaChangeOperator = c01e5.LIZJ;
        return new C299601Ec(countdownUser.userId, j, countdownUser.linkmicId, c01ebLIZ, countdownConfig.duration, j2, countdownUser.score, countdownConfig.targetScore, countdownUser.completionProgressPercent, countdownConfig, linkerMediaChangeOperator, c01e5.LIZLLL);
    }

    public static C01E9 LIZIZ(CountdownContent countdownContent) {
        CountdownConfig countdownConfig;
        CountdownUser countdownUser = countdownContent.countdownUser;
        if (countdownUser == null || (countdownConfig = countdownContent.countdownConfig) == null) {
            return null;
        }
        return new C01E9(countdownUser.userId, countdownContent.countdownId, countdownConfig.targetScore, countdownUser.score, countdownUser.completionProgressPercent, countdownUser.linkmicId);
    }

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C01E9 c01e9LIZIZ = LIZIZ((CountdownContent) it2.next());
            if (c01e9LIZIZ != null) {
                arrayList.add(c01e9LIZIZ);
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    public static String LJ(String str) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUserLJIIIIZZ;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfoLJII;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        c930480aJy.getClass();
        User user = null;
        if (C930480aJy.LJIJI(userLJIJJLI)) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if ((objLJIIIZ instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfoLJII = C921170a4x.LJII(abstractC928510aGnLIZ2, str)) != null) {
                user = linkPlayerInfoLJII.mUser;
            }
            return C0KVU.LIZ(user);
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if ((objLJIIIZ2 instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ2) != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUserLJIIIIZZ = C921170a4x.LJIIIIZZ(abstractC928510aGnLIZ, str)) != null) {
            user = linkListUserLJIIIIZZ.user;
        }
        return C0KVU.LIZ(user);
    }
}
