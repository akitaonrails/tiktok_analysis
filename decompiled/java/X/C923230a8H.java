package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0a8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C923230a8H extends C2217421BqW implements InterfaceC1631620sYq<LinkPlayerInfo, Integer, Integer, Unit> {
    public C923230a8H(Object obj) {
        super(3, obj, MultiLiveAsAnchorListDialogV2.class, "onRecentJoinedUserExposed", "onRecentJoinedUserExposed(Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo;II)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(LinkPlayerInfo linkPlayerInfo, Integer num, Integer num2) {
        String str;
        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        this.receiver.getClass();
        long id = linkPlayerInfo2.mUser.getId();
        if (id > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invite_all_recent_guest_");
            sbLIZ.append(id);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
            if (!C924950aB3.LIZ(strLIZIZ)) {
                int i = linkPlayerInfo2.userType;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            str = "";
                        } else {
                            str = "outroom_recommend_user";
                        }
                    } else {
                        str = "outroom_friend";
                    }
                } else {
                    str = "room_viewer";
                }
                String strValueOf = String.valueOf(id);
                Long lValueOf = Long.valueOf(linkPlayerInfo2.mUser.getFollowInfo().getFollowStatus());
                String strLIZ = C923240a8I.LIZ(Long.valueOf(linkPlayerInfo2.linkTypePermission));
                String strLJIILJJIL = C930540aK4.LJIILJJIL(linkPlayerInfo2);
                Map<String, String> mapLJ = linkPlayerInfo2.trackMap;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                C924950aB3.LIZLLL(new C924960aB4(str, "show", iIntValue2, iIntValue, "normal", strValueOf, null, null, null, null, null, null, lValueOf, strLIZ, null, null, null, null, null, strLJIILJJIL, C2097608Jq.LJIIL(mapLJ, C2097908Jt.LIZJ(new Pair("is_by_invite_all", "1"))), Boolean.TRUE, 1986496));
            }
        }
        return Unit.LIZ;
    }
}
