package X;

import Y.ARunnableS12S1100000_7;
import Y.AfS176S0100000_7;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.room.RefreshUserInRoomEvent;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeratorQuitEvent;
import com.bytedance.android.livesdk.dataChannel.LoginDataChannel;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.QueryUserFailEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KXC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXC implements InterfaceC781200Ukg {
    public final BaseFragment LIZ;
    public final DataChannel LIZIZ;
    public final C11NJ LIZJ;
    public final C521900KdQ LIZLLL;

    @Override // X.InterfaceC781200Ukg
    public final void LIZ(String str) {
        if (UserService.getInstance().user().isLogin()) {
            C486790J7d.LIZJ(new ARunnableS12S1100000_7(this, str, 12));
        }
    }

    public final void LIZLLL(C501470JlZ c501470JlZ) {
        int errorCode = c501470JlZ.getErrorCode();
        if (errorCode != 30003) {
            if (errorCode != 30005) {
                if (errorCode == 30006) {
                    if (((Boolean) this.LIZIZ.gg0(UserIsAnchorChannel.class)).booleanValue()) {
                        return;
                    }
                    C784440Upu.LIZ().LIZIZ(new C465900IOu(20));
                    return;
                } else {
                    switch (errorCode) {
                        case 50001:
                            this.LIZIZ.LC0(BanTalkEvent.class, new C0KXH(true));
                            break;
                        case 50002:
                            C784440Upu.LIZ().LIZIZ(new C465900IOu(10));
                            break;
                    }
                    return;
                }
            }
            if (!this.LIZ.isViewValid()) {
                return;
            }
            C19GO c19go = new C19GO(this.LIZ.getActivity());
            c19go.LJI(2131853529);
            c19go.LIZIZ(2131853429);
            c19go.LJ(2131853451, new DialogInterface.OnClickListener() { // from class: X.0KXG
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }, false);
            c19go.LJIIZILJ = new DialogInterface.OnDismissListener() { // from class: X.0KXF
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
                }
            };
            C786410Ut5.M4(c19go.LIZ());
            return;
        }
        C784440Upu.LIZ().LIZIZ(new C465900IOu(7, 10011));
    }

    public final void LJ(String str) {
        String secUid;
        String string;
        long id;
        Room room = (Room) this.LIZIZ.gg0(RoomChannel.class);
        if (room == null) {
            return;
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("target_uid", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        String str2 = "";
        if (currentUser == null || (secUid = currentUser.getSecUid()) == null) {
            secUid = "";
        }
        pairArr[1] = new Pair("sec_target_uid", secUid);
        pairArr[2] = new Pair("packed_level", "2");
        pairArr[3] = new Pair("request_from", "admin");
        pairArr[4] = new Pair("current_room_id", String.valueOf(room.getId()));
        User owner = room.getOwner();
        if (owner == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = "";
        }
        pairArr[5] = new Pair("anchor_id", string);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        User owner2 = room.getOwner();
        if (owner2 != null) {
            id = owner2.getId();
        } else {
            id = 0;
        }
        String strLJIJ = interfaceC500940JkiUser.LJIJ(id);
        if (strLJIJ != null) {
            str2 = strLJIJ;
        }
        pairArr[6] = new Pair("sec_anchor_id", str2);
        UserService.getInstance().user().LJIIJ(str, C2097608Jq.LJI(pairArr)).LJJIJIIJI(C11S5.LIZ()).LIZ(this.LIZLLL);
    }

    public final void LJFF(User user) {
        if (UserService.getInstance().user().isLogin()) {
            UserService.getInstance().user().LJIILIIL(user).LIZ(this.LIZLLL);
        }
    }

    public final void onEvent(C0KXI c0kxi) {
        this.LIZIZ.zW(LoginDataChannel.class, c0kxi);
    }

    public final void LIZJ(String str, boolean z) {
        ((IBrowserService) C1161920gLG.LIZJ(IBrowserService.class)).Eu2(z);
        User user = (User) this.LIZIZ.gg0(RoomUserChannel.class);
        if (user != null) {
            UserAttr userAttr = user.getUserAttr();
            if (userAttr == null) {
                userAttr = new UserAttr();
                user.setUserAttr(userAttr);
            }
            userAttr.isMuted = z;
            JSONObject jSONObject = new JSONObject();
            C0K04.LIZLLL(0, "error_code", jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is ban: ");
            sbLIZ.append(z);
            C0K04.LJFF("error_msg", C2188811AlT.LIZIZ(sbLIZ), jSONObject);
            C1CC2.LJIIIIZZ("ttlive_audience_ban_talk", 0, jSONObject);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("memberMsg_");
        sbLIZ2.append(str);
        LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C0KXC(BaseFragment baseFragment, DataChannel dataChannel, C11NJ c11nj) {
        this.LIZ = baseFragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = c11nj;
        ((C0J1N) C784440Upu.LIZ().LJ(C0KXI.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(baseFragment))).LIZJ(new AfS176S0100000_7(this, 239));
        dataChannel.BQ2(baseFragment, QueryUserFailEvent.class, new C0KXE(this));
        dataChannel.CQ2(MemberMessageChannel.class, baseFragment, new C0KXD(this));
        dataChannel.BQ2(baseFragment, RefreshUserInRoomEvent.class, new AwS586S0100000_7(this, 456));
        dataChannel.CQ2(LoginDataChannel.class, baseFragment, new AwS586S0100000_7(this, 457));
        dataChannel.BQ2(baseFragment, LiveModeratorQuitEvent.class, new AwS586S0100000_7(this, 458));
        this.LIZLLL = new C521900KdQ(this, 1);
    }

    public final void LIZIZ(Boolean bool, String str, Map map) {
        UserAttr userAttrLIZ = C0KXJ.LIZ();
        if (userAttrLIZ != null) {
            userAttrLIZ.adminPermissions = map;
        }
        User user = (User) this.LIZIZ.gg0(RoomUserChannel.class);
        if (user != null) {
            if (user.getUserAttr() == null) {
                user.setUserAttr(new UserAttr());
            }
            if (bool != null) {
                user.getUserAttr().isAdmin = bool.booleanValue();
            }
            user.getUserAttr().adminPermissions = map;
            DataChannel dataChannel = this.LIZIZ;
            if (map == null) {
                map = C2097608Jq.LJ();
            }
            dataChannel.zW(AdminPermissionUpdateChannel.class, map);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("memberMsg_");
        sbLIZ.append(str);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
