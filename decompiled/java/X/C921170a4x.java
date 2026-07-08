package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFilterCurrentRoomGuestOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0a4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921170a4x {
    public static final InterfaceC921200a50<? extends Object, ? extends Object> LIZ() {
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null) {
                return interfaceC302401Fe.LIZ();
            }
            return null;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            InterfaceC917530Zz5 interfaceC917530Zz5 = (InterfaceC917530Zz5) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (interfaceC917530Zz5 != null) {
                return interfaceC917530Zz5.LIZ();
            }
            return null;
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null) {
            return interfaceC917640ZzG.LIZ();
        }
        return null;
    }

    public static final <T, S> int LIZJ(InterfaceC921200a50<T, S> interfaceC921200a50) {
        if (C917810ZzX.LJIILIIL()) {
            Long lLJIIJ = C930540aK4.LJIIJ();
            List<T> listLIZ = interfaceC921200a50.LIZ();
            ArrayList arrayList = new ArrayList();
            for (T t : listLIZ) {
                if (t instanceof LinkPlayerInfo) {
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) t;
                    if (linkPlayerInfo.mRoleType != 1) {
                        if (LiveSdkFilterCurrentRoomGuestOptSetting.isEnable()) {
                            long j = linkPlayerInfo.LJII;
                            if (lLJIIJ == null || lLJIIJ.longValue() != j) {
                            }
                        }
                        arrayList.add(t);
                    }
                } else {
                    if (t instanceof LinkListUser) {
                        LinkListUser linkListUser = (LinkListUser) t;
                        if (linkListUser.roleType != 1) {
                            if (LiveSdkFilterCurrentRoomGuestOptSetting.isEnable()) {
                                long j2 = linkListUser.LIZIZ;
                                if (lLJIIJ == null || lLJIIJ.longValue() != j2) {
                                }
                            }
                        }
                    }
                    arrayList.add(t);
                }
            }
            return arrayList.size();
        }
        return interfaceC921200a50.LIZ().size() - 1;
    }

    @InterfaceC1294060jmO
    public static final boolean LJIILJJIL(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50) {
        for (LinkListUser linkListUser : interfaceC921200a50.LIZ()) {
            User user = linkListUser.user;
            if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                if (linkListUser != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @InterfaceC1294060jmO
    public static final String LIZIZ(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, long j) {
        String str;
        LinkPlayerInfo linkPlayerInfoLJIIIZ = LJIIIZ(interfaceC921200a50, j);
        if (linkPlayerInfoLJIIIZ == null || (str = linkPlayerInfoLJIIIZ.mInteractIdStr) == null) {
            return "";
        }
        return str;
    }

    @InterfaceC1294060jmO
    public static final Integer LIZLLL(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, long j) {
        List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
        int i = 0;
        if (!(listLIZ instanceof Collection) || !listLIZ.isEmpty()) {
            Iterator<LinkListUser> it2 = listLIZ.iterator();
            i = 0;
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user == null || user.getId() != j) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }

    @InterfaceC1294060jmO
    public static final LinkListUser LJ(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, long j) {
        LinkListUser next;
        Iterator<LinkListUser> it2 = interfaceC921200a50.LIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                User user = next.user;
                if (user != null && user.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @InterfaceC1294060jmO
    public static final LinkPlayerInfo LJFF(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, User user) {
        LinkPlayerInfo linkPlayerInfo = null;
        if (user == null) {
            return null;
        }
        Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkPlayerInfo next = it2.next();
            if (next.mUser.getId() == user.getId()) {
                linkPlayerInfo = next;
                break;
            }
        }
        return linkPlayerInfo;
    }

    @InterfaceC1294060jmO
    public static final LinkPlayerInfo LJI(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, long j) {
        LinkPlayerInfo next;
        Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.mUser.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @InterfaceC1294060jmO
    public static final LinkPlayerInfo LJII(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, String str) {
        LinkPlayerInfo linkPlayerInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkPlayerInfo next = it2.next();
            if (TextUtils.equals(next.mInteractIdStr, str)) {
                linkPlayerInfo = next;
                break;
            }
        }
        return linkPlayerInfo;
    }

    @InterfaceC1294060jmO
    public static final LinkListUser LJIIIIZZ(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, String str) {
        LinkListUser linkListUser = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<LinkListUser> it2 = interfaceC921200a50.LIZIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkListUser next = it2.next();
            if (TextUtils.equals(next.linkMicId, str)) {
                linkListUser = next;
                break;
            }
        }
        return linkListUser;
    }

    @InterfaceC1294060jmO
    public static final LinkPlayerInfo LJIIIZ(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, long j) {
        LinkPlayerInfo next;
        Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.mUser.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @InterfaceC1294060jmO
    public static final LinkPlayerInfo LJIIJ(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, String str) {
        LinkPlayerInfo linkPlayerInfo;
        Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZIZ().iterator();
        while (true) {
            linkPlayerInfo = null;
            String idStr = null;
            if (!it2.hasNext()) {
                break;
            }
            LinkPlayerInfo next = it2.next();
            User user = next.mUser;
            if (user != null) {
                idStr = user.getIdStr();
            }
            if (TextUtils.equals(str, idStr)) {
                linkPlayerInfo = next;
                break;
            }
        }
        return linkPlayerInfo;
    }

    @InterfaceC1294060jmO
    public static final LinkListUser LJIIJJI(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, long j) {
        LinkListUser next;
        Iterator<LinkListUser> it2 = interfaceC921200a50.LIZIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                User user = next.user;
                if (user != null && user.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @InterfaceC1294060jmO
    public static final Long LJIIL(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, String str) {
        User user;
        LinkPlayerInfo linkPlayerInfoLJII = LJII(interfaceC921200a50, str);
        if (linkPlayerInfoLJII != null && (user = linkPlayerInfoLJII.mUser) != null) {
            return Long.valueOf(user.getId());
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static final long LJIILIIL(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, String str) {
        LinkPlayerInfo next;
        User user;
        if (!TextUtils.isEmpty(str)) {
            Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZIZ().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (TextUtils.equals(next.mInteractIdStr, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = next;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                return user.getId();
            }
            return 0L;
        }
        return 0L;
    }

    public static final boolean LJIILL(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, String str) {
        for (LinkPlayerInfo linkPlayerInfo : interfaceC921200a50.LIZ()) {
            if (TextUtils.equals(str, linkPlayerInfo.mInteractIdStr)) {
                if (linkPlayerInfo != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @InterfaceC1294060jmO
    public static final void LJIILLIIL(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, long j) {
        Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LIZIZ().iterator();
        while (it2.hasNext()) {
            if (it2.next().mUser.getId() == j) {
                it2.remove();
            }
        }
    }
}
