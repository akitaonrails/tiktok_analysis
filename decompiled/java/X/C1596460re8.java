package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0re8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596460re8 implements InterfaceC1596210rdj {
    @Override // X.InterfaceC1596210rdj
    public final boolean LJIILLIIL() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIIJ();
    }

    @Override // X.InterfaceC1596210rdj
    public final boolean LJIJJLI() {
        return C1601110rld.LIZ();
    }

    @Override // X.InterfaceC1596210rdj
    public final void LJIL(Context context, List<FollowingInterestUser> list) {
        long jLongValue;
        List<String> arrayList;
        int size;
        String nickname;
        String next;
        SlimRoom.LinkMic linkMic;
        List<User> list2;
        User user;
        SlimRoom.LinkMic linkMic2;
        List<User> list3;
        Long lLJIILIIL;
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        int size2 = list.size();
        int i = 4;
        if (size2 > 4) {
            size2 = 4;
        }
        c0j9aV3.LJJIIZ(size2);
        if (list.size() > 0 && LJIILLIIL()) {
            ListProtector.add(list, 0, new FollowingInterestUser(new com.ss.android.ugc.aweme.profile.model.User(), false, null, 0, null));
        }
        boolean zLJIJI = c0j9aV3.LJIJI();
        if (c0j9aV3.getIsFollowWidgetExp() && zLJIJI) {
            C1597740rgC.LIZ.getClass();
            C1597740rgC.LJIILL = list;
            C0J9A c0j9aV32 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
            ArrayList arrayList2 = new ArrayList();
            int size3 = list.size();
            if (size3 <= 4) {
                i = size3;
            }
            Gson gsonLIZIZ = C08JS.LIZIZ();
            for (int i2 = 0; i2 < i; i2++) {
                FollowingInterestUser followingInterestUser = (FollowingInterestUser) ListProtector.get(list, i2);
                long j = followingInterestUser.getUser().roomId;
                c0j9aV32.LJIL(i2, j, GsonProtectorUtils.toJson(gsonLIZIZ, followingInterestUser));
                String uid = followingInterestUser.getUser().getUid();
                if (uid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                UrlModel avatarThumb = followingInterestUser.getUser().getAvatarThumb();
                if (avatarThumb == null || (arrayList = avatarThumb.getUrlList()) == null) {
                    arrayList = new ArrayList<>();
                }
                C1597740rgC.LIZ.getClass();
                SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser);
                if (slimRoomLJII != null && (linkMic2 = slimRoomLJII.getLinkMic()) != null && (list3 = linkMic2.followedList) != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                if (size >= 2) {
                    if (slimRoomLJII == null || (linkMic = slimRoomLJII.getLinkMic()) == null || (list2 = linkMic.followedList) == null || (user = (User) ListProtector.get(list2, 0)) == null) {
                        nickname = "";
                    } else {
                        C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                        String username = user.getUsername();
                        String nickName = user.getNickName();
                        c1243240iSQ.getClass();
                        nickname = C1243240iSQ.LIZLLL(username, nickName);
                    }
                } else {
                    C1243240iSQ c1243240iSQ2 = C1243240iSQ.LIZ;
                    com.ss.android.ugc.aweme.profile.model.User user2 = followingInterestUser.getUser();
                    c1243240iSQ2.getClass();
                    nickname = user2.getNickname();
                    if (nickname == null) {
                        nickname = "";
                    }
                }
                String str = followingInterestUser.getUser().signature;
                if (str == null) {
                    str = "";
                }
                Iterator<String> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = "";
                        break;
                    } else {
                        next = it2.next();
                        if (!TextUtils.isEmpty(next)) {
                            break;
                        }
                    }
                }
                arrayList2.add(new C0KZ1(j, jLongValue, next, nickname, str));
            }
            c0j9aV32.LJJIIJ(i, context, arrayList2);
        }
    }
}
