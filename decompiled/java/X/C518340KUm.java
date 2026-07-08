package X;

import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518340KUm {
    public final Room LIZ;
    public final C19EG LIZIZ;
    public final DataChannel LIZJ;

    public final void LIZ(long j) {
        String str;
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII;
        IHostShare iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
        C19EG c19eg = this.LIZIZ;
        String strValueOf = String.valueOf(j);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C0IJT.LIZ("").LJIIZILJ());
        Room room = this.LIZ;
        C1106200etO c1106200etOLJII = C481180Itw.LJII(room, this.LIZJ, C481180Itw.LIZJ(room.getOwner(), "multi_guest_invite_guest_invite_friend"), "invitation_tab_friends", linkedHashMap);
        boolean z = true;
        c1106200etOLJII.LJJJI = true;
        c1106200etOLJII.LJJJJLI = "multi_guest_invite_guest_invite_friend";
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        RoomAuthStatus roomAuthStatus = this.LIZ.mRoomAuthStatus;
        if (roomAuthStatus == null || !roomAuthStatus.isEnablePromote()) {
            z = false;
        }
        linkedHashMap2.put("param_broadcast_room_auth_promote_bool", Boolean.valueOf(z));
        ((ArrayList) c1106200etOLJII.LJJ).addAll(((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).getLiveShareSheetAction(linkedHashMap2, EnumC756810TmR.SLOT_BROADCAST_SHARE));
        ((ArrayList) c1106200etOLJII.LJJ).addAll(((IShareService) C1161920gLG.LIZJ(IShareService.class)).fK2(LiveMode.VIDEO, this.LIZ, this.LIZJ));
        if (C0IXW.LJII(this.LIZJ) != null && (adLiveEnterRoomConfigLJII = C0IXW.LJII(this.LIZJ)) != null) {
            str = adLiveEnterRoomConfigLJII.aid;
        } else {
            str = null;
        }
        c1106200etOLJII.LJJIJL = str;
        c1106200etOLJII.LJJIZ = C0IXW.LIZLLL(this.LIZJ);
        c1106200etOLJII.LJJJ = C0IXW.LJII(this.LIZJ);
        c1106200etOLJII.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        c1106200etOLJII.LIZ(Boolean.TRUE, "show_cancel");
        c1106200etOLJII.LIZIZ("layout_scene_version", String.valueOf(C915980Zwa.LJIIIIZZ().ln1()));
        iHostShare.shareSingleMessage(c19eg, strValueOf, new C1106210etP(c1106200etOLJII), new C09JN() { // from class: X.00Ji
            public final /* synthetic */ boolean LL = true;

            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestSendMessageHelper@7d25.sendImPush$1");
                if (Intrinsics.LJFF(obj, Boolean.TRUE) && this.LL) {
                    C20441214yg.LIZIZ("sujunjie", "send success");
                }
                C1C7U.LIZIZ("MultiGuestSendMessageHelper@7d25.sendImPush$1");
            }
        });
    }

    public C518340KUm(Room room, C19EG c19eg, DataChannel dataChannel) {
        this.LIZ = room;
        this.LIZIZ = c19eg;
        this.LIZJ = dataChannel;
    }
}
