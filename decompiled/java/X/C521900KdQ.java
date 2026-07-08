package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.usermanage.BanCapabilityParams;
import com.bytedance.android.live.usermanage.ILiveBanCapabilityApi;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.LoadUserAttrSuccess;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0KdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521900KdQ implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    public static final void onSubscribe$0(C521900KdQ c521900KdQ, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
        }
    }

    public C521900KdQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C521900KdQ c521900KdQ, Throwable th) {
        C0ILP c0ilp = (C0ILP) c521900KdQ.l0;
        if (c0ilp != null) {
            c0ilp.getClass();
        }
    }

    public static final void onError$1(C521900KdQ c521900KdQ, Throwable th) {
        C501470JlZ c501470JlZ;
        if ((th instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th) != null) {
            ((C0KXC) c521900KdQ.l0).LIZLLL(c501470JlZ);
        }
    }

    public static final void onSubscribe$1(C521900KdQ c521900KdQ, InterfaceC420801kM interfaceC420801kM) {
        ((C0KXC) c521900KdQ.l0).LIZJ.LIZ(interfaceC420801kM);
    }

    public static final void onSuccess$0(C521900KdQ c521900KdQ, Object obj) {
        User user = (User) obj;
        C0ILP c0ilp = (C0ILP) c521900KdQ.l0;
        if (c0ilp != null) {
            C0ILN c0iln = (C0ILN) c0ilp;
            if (user != null && user.getFollowInfo() != null) {
                c0iln.LIZ.NR((int) user.getFollowInfo().getPushStatus());
            }
        }
    }

    public static final void onSuccess$1(C521900KdQ c521900KdQ, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        InterfaceC2262081DgM interfaceC2262081DgM = (InterfaceC2262081DgM) obj;
        if (((C0KXC) c521900KdQ.l0).LIZ.isViewValid()) {
            C0KXC c0kxc = (C0KXC) c521900KdQ.l0;
            User user = (User) interfaceC2262081DgM;
            c0kxc.getClass();
            UserAttr userAttr = null;
            if (user != null && user.getUserAttr() != null && (interfaceC500940JkiUser = UserService.getInstance().user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                if (user != null) {
                    userAttr = user.getUserAttr();
                }
                currentUser.setUserAttr(userAttr);
            }
            DataChannel dataChannel = c0kxc.LIZIZ;
            if (user != null) {
                dataChannel.zW(RoomUserChannel.class, user);
            }
            C0KXB.LIZ.setValue((User) interfaceC2262081DgM);
            InterfaceC1094160eZy.X0.LJFF(Boolean.FALSE);
            UserAttr userAttr2 = user.getUserAttr();
            if (userAttr2 != null) {
                DataChannel dataChannel2 = ((C0KXC) c521900KdQ.l0).LIZIZ;
                boolean z4 = userAttr2.isMuted;
                long j = userAttr2.muteDuration;
                if (j == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dataChannel2.LC0(BanTalkEvent.class, new C0KXH(z4, z2, j));
                ((C0KXC) c521900KdQ.l0).LIZIZ.LC0(LoadUserAttrSuccess.class, userAttr2);
                DataChannel dataChannel3 = ((C0KXC) c521900KdQ.l0).LIZIZ;
                boolean z5 = userAttr2.isMuted;
                long j2 = userAttr2.muteDuration;
                if (j2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                dataChannel3.LC0(BanTalkEvent.class, new C0KXH(z5, z3, j2));
            }
            IBrowserService iBrowserService = (IBrowserService) C1161920gLG.LIZJ(IBrowserService.class);
            if (userAttr2 != null && userAttr2.isMuted) {
                z = true;
            } else {
                z = false;
            }
            iBrowserService.Eu2(z);
            if (userAttr2 != null && userAttr2.isAdmin) {
                C0KXC c0kxc2 = (C0KXC) c521900KdQ.l0;
                Room room = (Room) c0kxc2.LIZIZ.gg0(RoomChannel.class);
                if (room != null) {
                    long ownerUserId = room.getOwnerUserId();
                    long id = room.getId();
                    List listLJIIJJI = C1697810uHb.LJIIJJI(14, 15);
                    C480460Ism.LIZ().getClass();
                    ((ILiveBanCapabilityApi) C480460Ism.LIZLLL(ILiveBanCapabilityApi.class)).getLiveBanCapability(new BanCapabilityParams(listLJIIJJI, id, ownerUserId)).LJL(C11S5.LIZ()).LJJLL(new AfS176S0100000_7(c0kxc2, 240), new AfS176S0100000_7(c0kxc2, 241));
                }
            }
        }
    }
}
