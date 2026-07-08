package com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.moderator;

import X.AbstractC922600a7G;
import X.AbstractC928510aGn;
import X.C01GW;
import X.C15438062q;
import X.C452501pT;
import X.C917810ZzX;
import X.C923390a8X;
import X.C923430a8b;
import X.C923440a8c;
import X.C923450a8d;
import X.C924630aAX;
import X.C930540aK4;
import X.C948450amx;
import X.InterfaceC917530Zz5;
import X.InterfaceC948500an2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorPanelExpandInviteTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFilterCurrentRoomGuestOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER")
public final class ModeratorBusinessUserManager extends AbstractC922600a7G implements InterfaceC917530Zz5 {
    public long LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return null;
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJJ(LinkMessage linkMessage) {
    }

    @Override // X.AbstractC922600a7G
    public final boolean LJJJJJL() {
        return false;
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJLI() {
        LJJIJ("fetch_on_mix_mode_moderator_by_apply_message", 0, null, null);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJLL() {
        LJJIJ("fetch_on_mix_mode_moderator_by_cancel_apply_message", 0, null, null);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJLIIL() {
        LJJIJ("fetch_on_mix_mode_moderator_by_permit_apply_message", 0, null, null);
    }

    public final AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> LJJJLZIJ() {
        return (AbstractC928510aGn) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC917530Zz5
    public final AbstractC928510aGn LIZ() {
        return LJJJLZIJ();
    }

    @Override // X.AbstractC922600a7G
    public final AbstractC928510aGn LJJJI() {
        return LJJJLZIJ();
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJZI() {
        if (C917810ZzX.LJIIIIZZ()) {
            LJJIJ("fetch_on_mix_mode_p2p_group_chg_msg_receive", 0, null, null);
        }
    }

    @Override // X.AbstractC922600a7G, X.InterfaceC921620a5g
    public final void init() {
        super.init();
        LJJIJ("fetch_on_moderator_init", 1003, null, null);
    }

    @Override // X.InterfaceC917530Zz5
    public final long LJFF() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return InterfaceC917530Zz5.class;
    }

    @Override // X.InterfaceC921620a5g
    public final void LJJ(BusinessContent businessContent) {
        Map<Long, GuestUserInfo> map;
        ArrayList arrayList;
        CohostContent cohostContent;
        ListChangeBizContent listChangeBizContent;
        Map<Long, CohostUserInfo> map2;
        CohostContent cohostContent2;
        ListChangeBizContent listChangeBizContent2;
        ArrayList arrayList2 = null;
        if (businessContent != null && (cohostContent2 = businessContent.cohostContent) != null && (listChangeBizContent2 = cohostContent2.listChangeBizContent) != null) {
            map = listChangeBizContent2.guestUserInfos;
        } else {
            map = null;
        }
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<Long, GuestUserInfo> entry : map.entrySet()) {
                LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                linkPlayerInfo.mInteractIdStr = entry.getValue().linkmicIdStr;
                User user = new User();
                user.setId(entry.getKey().longValue());
                user.setIdStr(entry.getValue().userIdStr);
                user.setNickName(entry.getValue().nickname);
                user.setDisplayId(entry.getValue().displayId);
                user.setAvatarThumb(entry.getValue().avatarThumb);
                User.EnigmaInfo enigmaInfo = new User.EnigmaInfo();
                enigmaInfo.isEnigmaMaskOn = entry.getValue().isEnigma;
                user.enigmaInfo = enigmaInfo;
                linkPlayerInfo.mUser = user;
                linkPlayerInfo.LJII = entry.getValue().roomId;
                linkPlayerInfo.mRoleType = 2;
                linkPlayerInfo.LIZ = 2;
                arrayList.add(linkPlayerInfo);
            }
        } else {
            arrayList = null;
        }
        if (LiveSdkFilterCurrentRoomGuestOptSetting.isEnable()) {
            Long lLJIIJ = C930540aK4.LJIIJ();
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder != null) {
                int size = 0;
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList) {
                        long j = ((LinkPlayerInfo) obj).LJII;
                        if (lLJIIJ != null && j == lLJIIJ.longValue()) {
                            arrayList3.add(obj);
                        }
                    }
                    size = arrayList3.size();
                }
                multiGuestDataHolder.LJJIII(size);
            }
        } else if (arrayList != null) {
            int size2 = arrayList.size();
            MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder2.LJJIII(size2);
            }
        }
        if (businessContent != null && (cohostContent = businessContent.cohostContent) != null && (listChangeBizContent = cohostContent.listChangeBizContent) != null && (map2 = listChangeBizContent.userInfos) != null) {
            arrayList2 = new ArrayList(map2.size());
            for (Map.Entry<Long, CohostUserInfo> entry2 : map2.entrySet()) {
                LinkPlayerInfo linkPlayerInfo2 = new LinkPlayerInfo();
                linkPlayerInfo2.mInteractIdStr = "";
                User user2 = new User();
                user2.setId(entry2.getKey().longValue());
                user2.setIdStr(entry2.getValue().userIdStr);
                user2.setNickName(entry2.getValue().nickname);
                user2.setDisplayId(entry2.getValue().displayId);
                user2.setAvatarThumb(entry2.getValue().avatarThumb);
                linkPlayerInfo2.mUser = user2;
                linkPlayerInfo2.mRoleType = 1;
                linkPlayerInfo2.LIZ = 2;
                arrayList2.add(linkPlayerInfo2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        if (arrayList2 != null) {
            arrayList4.addAll(arrayList2);
        }
        List<LinkPlayerInfo> listLJJIII = LJJJLZIJ().LJJIII();
        listLJJIII.clear();
        listLJJIII.addAll(arrayList4);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJ(Throwable th) {
        super.LJJJJ(th);
        C924630aAX.LJJIJIL(th, false);
    }

    @Override // X.AbstractC922600a7G
    public final List<Integer> LJJJJL(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        if (LinkMicModeratorPanelExpandInviteTypeSetting.INSTANCE.enable() && !C917810ZzX.LJIIIIZZ() && !C930540aK4.LJJIJ()) {
            arrayList.add(4);
            arrayList.add(8);
        }
        return arrayList;
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJZ(C923390a8X c923390a8X) {
        List<C923440a8c> list = c923390a8X.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C923440a8c> it2 = list.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            C923440a8c next = it2.next();
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            String str2 = next.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            linkPlayerInfo.mInteractIdStr = str;
            User user = new User();
            user.setId(next.LIZ);
            user.setIdStr(String.valueOf(next.LIZ));
            user.setNickName(next.LIZLLL);
            user.setDisplayId(next.LJFF);
            user.setAvatarThumb(next.LJ);
            linkPlayerInfo.mUser = user;
            Long l = next.LIZJ;
            if (l != null) {
                linkPlayerInfo.LJII = l.longValue();
            }
            linkPlayerInfo.mRoleType = 2;
            linkPlayerInfo.LIZ = 2;
            arrayList.add(linkPlayerInfo);
        }
        if (LiveSdkFilterCurrentRoomGuestOptSetting.isEnable()) {
            Long lLJIIJ = C930540aK4.LJIIJ();
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    long j = ((LinkPlayerInfo) obj).LJII;
                    if (lLJIIJ != null && j == lLJIIJ.longValue()) {
                        arrayList2.add(obj);
                    }
                }
                multiGuestDataHolder.LJJIII(arrayList2.size());
            }
        } else {
            int size = arrayList.size();
            MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder2.LJJIII(size);
            }
        }
        List<C923430a8b> list2 = c923390a8X.LIZIZ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C923430a8b c923430a8b : list2) {
            LinkPlayerInfo linkPlayerInfo2 = new LinkPlayerInfo();
            String str3 = c923430a8b.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            linkPlayerInfo2.mInteractIdStr = str3;
            User user2 = new User();
            user2.setId(c923430a8b.LIZ);
            user2.setIdStr(String.valueOf(c923430a8b.LIZ));
            user2.setNickName(c923430a8b.LIZLLL);
            user2.setDisplayId(c923430a8b.LJFF);
            user2.setAvatarThumb(c923430a8b.LJ);
            linkPlayerInfo2.mUser = user2;
            Long l2 = c923430a8b.LIZJ;
            if (l2 != null) {
                linkPlayerInfo2.LJII = l2.longValue();
            }
            linkPlayerInfo2.mRoleType = 1;
            linkPlayerInfo2.LIZ = 2;
            arrayList3.add(linkPlayerInfo2);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList3);
        arrayList4.addAll(arrayList);
        List<LinkPlayerInfo> listLJJIII = LJJJLZIJ().LJJIII();
        listLJJIII.clear();
        listLJJIII.addAll(arrayList4);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJI(MultiLiveGuestInfoList multiLiveGuestInfoList, String str) {
        ListByTypeResponse.HostDisplayInfo hostDisplayInfo;
        this.LLJJIII = multiLiveGuestInfoList.requestUserGiftScore;
        super.LJJJJI(multiLiveGuestInfoList, str);
        if (Intrinsics.LJFF(str, "enter_room") && (hostDisplayInfo = multiLiveGuestInfoList.hostDisplayInfo) != null) {
            DataChannel dataChannel = this.LLJ;
            HostDisplayResponse.DisplayInfo displayInfo = new HostDisplayResponse.DisplayInfo();
            displayInfo.hostIconUrl = hostDisplayInfo.hostIconUrl;
            displayInfo.hostIconBackgroundUrl = hostDisplayInfo.hostIconBackgroundUrl;
            displayInfo.hostColor = hostDisplayInfo.hostColor;
            displayInfo.iconLinkUrl = hostDisplayInfo.iconLinkUrl;
            displayInfo.hostType = hostDisplayInfo.hostType;
            C923450a8d.LIZLLL(dataChannel, displayInfo);
        }
        C924630aAX.LJJIJL(LJJJLZIJ().LJIJJLI(), false);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJIZL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        LJJIJ("fetch_on_moderator_by_message", LSPassThroughRecordSizeConfig.DEFAULT, null, null);
    }

    public ModeratorBusinessUserManager(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, iMessageManager, lifecycleOwner);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(137));
    }
}
