package X;

import Y.AfS2S0000100_12;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0TeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751900TeW {
    public static final ConcurrentHashMap<Long, C11PQ<Long>> LJFF = new ConcurrentHashMap<>();
    public final boolean LIZ;
    public final InterfaceC921620a5g LIZIZ;
    public final ConcurrentHashMap<Long, Boolean> LIZJ = new ConcurrentHashMap<>();
    public final C11NJ LIZLLL = new C11NJ();
    public final C932800aNi LJ = new InterfaceC922630a7J() { // from class: X.0aNi
        @Override // X.InterfaceC922630a7J
        public final void Ue(Throwable th) {
        }

        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            if (this.LL.LIZ) {
                List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
                C751900TeW c751900TeW = this.LL;
                Iterator<LinkPlayerInfo> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    User user = it2.next().mUser;
                    if (user != null) {
                        long id = user.getId();
                        Long l = (Long) C742890TCd.LIZ(id).LJLZ();
                        if (l != null && l.longValue() == -1) {
                            c751900TeW.LIZ(id);
                        }
                    }
                }
            }
        }

        @Override // X.InterfaceC922630a7J
        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            if (!this.LL.LIZ) {
                List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
                C751900TeW c751900TeW = this.LL;
                Iterator<LinkListUser> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    User user = it2.next().user;
                    if (user != null) {
                        long id = user.getId();
                        Long l = (Long) C742890TCd.LIZ(id).LJLZ();
                        if (l != null && l.longValue() == -1) {
                            c751900TeW.LIZ(id);
                        }
                    }
                }
            }
        }
    };

    public final void LIZ(final long j) {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if ((room != null && (owner = room.getOwner()) != null && j == owner.getId()) || j == UserService.getInstance().user().getCurrentUserId() || this.LIZJ.putIfAbsent(Long.valueOf(j), Boolean.TRUE) != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryFollowStatus api call, userId=");
        sbLIZ.append(j);
        sbLIZ.append(", followRequestingMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('.');
        C20441214yg.LJIIIZ("MultiGuestFollowStatusObserverV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL.LIZ(new C11QI(UserService.getInstance().user().LJ(j, "MultiGuestFollowStatusObserverV2_updateFollowStatus", "MultiGuestFollowStatusObserverV2_updateFollowStatus").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS2S0000100_12(j, 5)).LJIIL(new C09JN() { // from class: X.0T7D
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestFollowStatusObserverV2@8748.queryFollowStatus$disposable$2");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("queryUserWithId fail, throwable=");
                sbLIZ2.append(obj);
                sbLIZ2.append('.');
                C20441214yg.LJIIIZ("MultiGuestFollowStatusObserverV2", C2188811AlT.LIZIZ(sbLIZ2));
                C1C7U.LIZIZ("MultiGuestFollowStatusObserverV2@8748.queryFollowStatus$disposable$2");
            }
        }).LJIIJ(new InterfaceC781210Ukh() { // from class: X.0T7G
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                this.LIZ.LIZJ.remove(Long.valueOf(j));
            }
        })).LJIILL().LJIIZILJ());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0aNi] */
    public C751900TeW(boolean z, InterfaceC921620a5g interfaceC921620a5g) {
        this.LIZ = z;
        this.LIZIZ = interfaceC921620a5g;
    }
}
