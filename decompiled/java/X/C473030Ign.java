package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0Ign, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473030Ign {
    public final C11NJ LIZ = new C11NJ();

    public final void LIZ(long j, Room room, String str, final InterfaceC465100ILs interfaceC465100ILs, boolean z, Map<String, String> map) {
        boolean z2;
        String str2;
        String str3;
        if (room == null) {
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099430eiT c1099430eiT = new C1099430eiT();
        c1099430eiT.LIZIZ(j);
        room.getRequestId();
        c1099430eiT.LIZLLL();
        C1099430eiT c1099430eiT2 = c1099430eiT;
        c1099430eiT2.LIZLLL();
        c1099430eiT2.LJ(0L);
        room.getLabels();
        c1099430eiT2.LIZLLL();
        interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099430eiT2)).LIZIZ(new InterfaceC626120Oh8<FollowPair>() { // from class: X.0ILt
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                InterfaceC465100ILs interfaceC465100ILs2 = interfaceC465100ILs;
                if (interfaceC465100ILs2 != null) {
                    interfaceC465100ILs2.LIZIZ(th);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(FollowPair followPair) {
                FollowPair followPair2 = followPair;
                InterfaceC465100ILs interfaceC465100ILs2 = interfaceC465100ILs;
                if (interfaceC465100ILs2 != null) {
                    interfaceC465100ILs2.LIZ(followPair2);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LLILLJJLI.LIZ.LIZ(interfaceC420801kM);
            }
        });
        if (room.getOwner() != null && room.getOwner().getId() == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            HashMap map2 = new HashMap();
            map2.put("growth_deepevent", String.valueOf(1));
            if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
                map2.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
            }
            w.LIZ.getClass();
            String strLJIILJJIL = w.LJIILJJIL();
            String str4 = "1";
            if (!TextUtils.isEmpty(strLJIILJJIL) && "click_push_live_cd_user".equals(strLJIILJJIL)) {
                map2.put("is_subscribe", "1");
            } else {
                map2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            String str5 = "live_anchor_c_audience";
            if (z2) {
                str5 = "live_over";
            }
            if (str != null && (str.contains("carousel_audience_c") || str.contains("loyal_audience_c"))) {
                str5 = str;
            }
            if (C497740JfY.LJIL()) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            map2.put("room_orientation", str2);
            if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
                int followStatus = (int) room.getOwner().getFollowInfo().getFollowStatus();
                if (followStatus != 1 && followStatus != 3) {
                    str3 = "single";
                } else {
                    str3 = "mutual";
                }
                map2.put("follow_type", str3);
            }
            if ("manual_pk".equals(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType())) {
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                    map2.put("match_status", "pk_phase");
                } else {
                    map2.put("match_status", LiveCenterMockToolSwitch.PUNISH);
                }
                map2.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
            map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
            map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            String strNo2 = " ";
            if (C1161920gLG.LIZJ(IInteractService.class) != null) {
                strNo2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2();
            }
            map2.put("multi_tool", strNo2);
            if (!z) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_half_screen", str4);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("follow");
            c474500IjALIZ.LJIILLIIL(new C474130IiZ(str5, j));
            c474500IjALIZ.LJIIJJI("live_interact");
            c474500IjALIZ.LJIILL("core");
            c474500IjALIZ.LJIILJJIL("live_detail");
            if (z) {
                if (map != null && !map.isEmpty()) {
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LJJII(1, "is_half_screen");
                }
            } else {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(map2);
                c474500IjALIZ.LJJII(0, "is_half_screen");
            }
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
