package com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest;

import X.AbstractC1143290frD;
import X.AbstractC922600a7G;
import X.AbstractC928510aGn;
import X.C01GW;
import X.C1143300frE;
import X.C15438062q;
import X.C1697810uHb;
import X.C1AZW;
import X.C20631086j;
import X.C20632086k;
import X.C2188811AlT;
import X.C452501pT;
import X.C500260Jjc;
import X.C921170a4x;
import X.C923390a8X;
import X.C923430a8b;
import X.C923440a8c;
import X.C923450a8d;
import X.C924660aAa;
import X.C924810aAp;
import X.C930540aK4;
import X.C948450amx;
import X.C957010b0l;
import X.EnumC1303240k1C;
import X.InterfaceC917640ZzG;
import X.InterfaceC922630a7J;
import X.InterfaceC923400a8Y;
import X.InterfaceC948500an2;
import X.InterfaceC951900asW;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.SelfOnlineStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFilterCurrentRoomGuestOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLivePlayLogMigrate;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS131S1200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
public class GuestBusinessUserManager extends AbstractC922600a7G implements InterfaceC917640ZzG {
    public final Room LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return null;
    }

    public final AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> LJJJLZIJ() {
        return (AbstractC928510aGn) this.LLJJJ.getValue();
    }

    public final AbstractC928510aGn<LinkListUser, LinkMessage> LJJJZ() {
        return (AbstractC928510aGn) this.LLJJIJIL.getValue();
    }

    @Override // X.InterfaceC917640ZzG
    public final AbstractC928510aGn LIZ() {
        return LJJJZ();
    }

    @Override // X.InterfaceC917640ZzG
    public final AbstractC928510aGn LIZLLL() {
        return LJJJLZIJ();
    }

    @Override // X.AbstractC922600a7G
    public final AbstractC928510aGn LJJJI() {
        return LJJJLZIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    @Override // X.AbstractC922600a7G, X.InterfaceC921620a5g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init() {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager.init():void");
    }

    @Override // X.AbstractC922600a7G, X.InterfaceC921620a5g
    public final void release() {
        super.release();
        ((InterfaceC923400a8Y) this.LLJJJIL.getValue()).dispose();
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return InterfaceC917640ZzG.class;
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIILLIIL(int i) {
        LJJLI(i);
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
                LinkListUser linkListUser = new LinkListUser();
                linkListUser.linkMicId = entry.getValue().linkmicIdStr;
                User user = new User();
                user.setId(entry.getKey().longValue());
                user.setIdStr(entry.getValue().userIdStr);
                user.setNickName(entry.getValue().nickname);
                user.setDisplayId(entry.getValue().displayId);
                user.setAvatarThumb(entry.getValue().avatarThumb);
                User.EnigmaInfo enigmaInfo = new User.EnigmaInfo();
                enigmaInfo.isEnigmaMaskOn = entry.getValue().isEnigma;
                user.enigmaInfo = enigmaInfo;
                linkListUser.user = user;
                linkListUser.LIZIZ = entry.getValue().roomId;
                linkListUser.roleType = 2;
                linkListUser.LIZ = 2;
                arrayList.add(linkListUser);
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
                        long j = ((LinkListUser) obj).LIZIZ;
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
                LinkListUser linkListUser2 = new LinkListUser();
                linkListUser2.linkMicId = "";
                User user2 = new User();
                user2.setId(entry2.getKey().longValue());
                user2.setIdStr(entry2.getValue().userIdStr);
                user2.setNickName(entry2.getValue().nickname);
                user2.setDisplayId(entry2.getValue().displayId);
                user2.setAvatarThumb(entry2.getValue().avatarThumb);
                linkListUser2.user = user2;
                linkListUser2.roleType = 1;
                linkListUser2.LIZ = 2;
                arrayList2.add(linkListUser2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        if (arrayList2 != null) {
            arrayList4.addAll(arrayList2);
        }
        List<LinkListUser> listLJJIII = LJJJZ().LJJIII();
        listLJJIII.clear();
        listLJJIII.addAll(arrayList4);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJJ(LinkMessage linkMessage) {
        boolean z;
        long id;
        LJJJLZIJ().LJJIJIL();
        LJJJZ().LJJIJIIJIL(linkMessage);
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        if (C921170a4x.LIZJ(LJJJZ()) > 0) {
            z = true;
        } else {
            z = false;
        }
        c924810aApLJ.LJIIIZ(z);
        C924810aAp.LJ().LJIIL(C921170a4x.LIZJ(LJJJZ()));
        MultiGuestDataHolder multiGuestDataHolder = this.LLJILLL;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJIII(C921170a4x.LIZJ(LJJJZ()));
        }
        if (this.LLJILLL != null) {
            C921170a4x.LIZJ(LJJJZ());
        }
        for (LinkListUser linkListUser : LJJJZ().LJIJJLI()) {
            C20631086j c20631086j = C20632086k.LIZ;
            User user = linkListUser.user;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            c20631086j.LIZLLL(id, linkListUser.linkMicId);
            if (linkListUser.roleType == 1) {
                C924810aAp.LJ().LJIILJJIL = linkListUser.linkMicId;
            }
        }
        LJJL(C921170a4x.LIZJ(LJJJZ()), "afterIMSourcePrepare", false);
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("GuestBusinessUserManager", "guest and audience handleListChangeMessage");
        ((InterfaceC923400a8Y) this.LLJJJIL.getValue()).LIZJ();
        LJJLI(2);
    }

    @Override // X.AbstractC922600a7G
    public final List<Integer> LJJJJL(String str) {
        return C1697810uHb.LJIIJJI(1, 2);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJZ(C923390a8X c923390a8X) {
        int i;
        Long lValueOf;
        List<C923440a8c> list = c923390a8X.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C923440a8c> it2 = list.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            C923440a8c next = it2.next();
            LinkListUser linkListUser = new LinkListUser();
            String str2 = next.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            linkListUser.linkMicId = str;
            User user = new User();
            user.setId(next.LIZ);
            user.setIdStr(String.valueOf(next.LIZ));
            user.setNickName(next.LIZLLL);
            user.setDisplayId(next.LJFF);
            user.setAvatarThumb(next.LJ);
            linkListUser.user = user;
            Long l = next.LIZJ;
            if (l != null) {
                linkListUser.LIZIZ = l.longValue();
            }
            linkListUser.roleType = 2;
            linkListUser.LIZ = 2;
            arrayList.add(linkListUser);
        }
        if (LiveSdkFilterCurrentRoomGuestOptSetting.isEnable()) {
            Long lLJIIJ = C930540aK4.LJIIJ();
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    long j = ((LinkListUser) obj).LIZIZ;
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
            LinkListUser linkListUser2 = new LinkListUser();
            String str3 = c923430a8b.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            linkListUser2.linkMicId = str3;
            User user2 = new User();
            user2.setId(c923430a8b.LIZ);
            user2.setIdStr(String.valueOf(c923430a8b.LIZ));
            user2.setNickName(c923430a8b.LIZLLL);
            user2.setDisplayId(c923430a8b.LJFF);
            user2.setAvatarThumb(c923430a8b.LJ);
            linkListUser2.user = user2;
            Long l2 = c923430a8b.LIZJ;
            if (l2 != null) {
                linkListUser2.LIZIZ = l2.longValue();
            }
            linkListUser2.roleType = 1;
            linkListUser2.LIZ = 2;
            arrayList3.add(linkListUser2);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList3);
        arrayList4.addAll(arrayList);
        List<LinkListUser> listLJJIII = LJJJZ().LJJIII();
        listLJJIII.clear();
        listLJJIII.addAll(arrayList4);
        List<C923440a8c> list3 = c923390a8X.LIZ;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            i = 0;
        } else {
            Iterator<C923440a8c> it3 = list3.iterator();
            i = 0;
            while (it3.hasNext()) {
                Long l3 = it3.next().LIZJ;
                DataChannel dataChannel = this.LLJ;
                if (dataChannel != null) {
                    lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
                } else {
                    lValueOf = null;
                }
                if (Intrinsics.LJFF(l3, lValueOf) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        LJJL(i, "onMixModeListChange", false);
    }

    public final void LJJLI(int i) {
        ((InterfaceC923400a8Y) this.LLJJJIL.getValue()).LIZ();
        Iterator<InterfaceC922630a7J> it2 = LJJJIL().iterator();
        while (it2.hasNext()) {
            it2.next().rn(LJJJZ(), i);
        }
        ((InterfaceC923400a8Y) this.LLJJJIL.getValue()).dispose();
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJI(MultiLiveGuestInfoList multiLiveGuestInfoList, String str) {
        InterfaceC951900asW interfaceC951900asW;
        LJJJZ().LJJIJIL();
        LinkMessage linkMessage = new LinkMessage();
        LinkerListChangeContent linkerListChangeContent = new LinkerListChangeContent();
        linkMessage.mListChangeContent = linkerListChangeContent;
        ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList.onLineUsers;
        if (arrayList != null) {
            Iterator<LinkPlayerInfo> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkerListChangeContent.onLineUsers.add(C930540aK4.LIZIZ(it2.next()));
            }
        }
        ArrayList<LinkPlayerInfo> arrayList2 = multiLiveGuestInfoList.waitingUsers;
        if (arrayList2 != null) {
            Iterator<LinkPlayerInfo> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                linkerListChangeContent.waitingUsers.add(C930540aK4.LIZIZ(it3.next()));
            }
        }
        LJJJZ().LJJIJIIJIL(linkMessage);
        super.LJJJJI(multiLiveGuestInfoList, str);
        boolean zEquals = TextUtils.equals(str, "enter_room");
        if (zEquals) {
            if (C924810aAp.LJ().LJJII > 0 && !LinkMicLivePlayLogMigrate.INSTANCE.enable()) {
                C924660aAa.LJIIJ(C924810aAp.LJ().LJJII, this.LLJ, "live_play", null, "GuestBusinessUserManager#handleFetchResult-enterRoom");
                DataChannel dataChannel = this.LLJ;
                if (dataChannel != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
                    interfaceC951900asW.LJIJJ();
                }
            }
            ListByTypeResponse.HostDisplayInfo hostDisplayInfo = multiLiveGuestInfoList.hostDisplayInfo;
            if (hostDisplayInfo != null) {
                DataChannel dataChannel2 = this.LLJ;
                HostDisplayResponse.DisplayInfo displayInfo = new HostDisplayResponse.DisplayInfo();
                displayInfo.hostIconUrl = hostDisplayInfo.hostIconUrl;
                displayInfo.hostIconBackgroundUrl = hostDisplayInfo.hostIconBackgroundUrl;
                displayInfo.hostColor = hostDisplayInfo.hostColor;
                displayInfo.iconLinkUrl = hostDisplayInfo.iconLinkUrl;
                displayInfo.hostType = hostDisplayInfo.hostType;
                C923450a8d.LIZLLL(dataChannel2, displayInfo);
            }
        }
        LJJL(C921170a4x.LIZJ(LJJJZ()), "handleFetchResult", zEquals);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJIZL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        LJJJLZIJ().LJJIJIL();
        ((InterfaceC923400a8Y) this.LLJJJIL.getValue()).LIZIZ();
        LJJLI(2);
    }

    public final void LJJL(int i, String str, boolean z) {
        Lifecycle lifecycle;
        DataChannel dataChannel;
        Lifecycle lifecycle2;
        List<LinkListUser> listLJJIII = LJJJZ().LJJIII();
        boolean z2 = false;
        if (!(listLJJIII instanceof Collection) || !listLJJIII.isEmpty()) {
            Iterator<LinkListUser> it2 = listLJJIII.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                User user = it2.next().user;
                if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                    z2 = true;
                    break;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_GuestBusinessUserManager_");
        sbLIZ.append(217);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("logGuestConnStatus logMigrate: ");
        LinkMicLivePlayLogMigrate linkMicLivePlayLogMigrate = LinkMicLivePlayLogMigrate.INSTANCE;
        sbLIZ2.append(linkMicLivePlayLogMigrate.enable());
        sbLIZ2.append(", isCurrentUserOnline: ");
        sbLIZ2.append(z2);
        sbLIZ2.append(", isEnterRoom: ");
        sbLIZ2.append(z);
        sbLIZ2.append(", preGuestCount: ");
        sbLIZ2.append(this.LLJJIJI);
        sbLIZ2.append(", currentGuestCount: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", trigger: ");
        sbLIZ2.append(C924660aAa.LJ);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        if (!linkMicLivePlayLogMigrate.enable() && this.LLJJIJI > 0 && i == 0) {
            C924660aAa.LJIJJLI("connection_over");
            LifecycleOwner lifecycleOwner = this.LLILZ;
            if (lifecycleOwner != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(lifecycle2, this, 62));
            } else {
                C924660aAa.LJIIIZ(null, Integer.valueOf(this.LLJJIJI), null, null, this.LLJ, 189);
            }
        } else if (!linkMicLivePlayLogMigrate.enable() && this.LLJJIJI <= 0 && i > 0 && !z) {
            LifecycleOwner lifecycleOwner2 = this.LLILZ;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS131S1200000_15(lifecycle, this, str, 4));
            } else {
                DataChannel dataChannel2 = this.LLJ;
                int i2 = C924810aAp.LJ().LJJII;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append("-GuestBusinessUserManager#logGuestConnStatus");
                C924660aAa.LJIIJ(i2, dataChannel2, "connection_start", null, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        if (this.LLJJIJIIJIL != z2 && (dataChannel = this.LLJ) != null) {
            dataChannel.zW(SelfOnlineStateChannel.class, new Pair(Boolean.valueOf(z2), Integer.valueOf(i)));
        }
        this.LLJJIJIIJIL = z2;
        this.LLJJIJI = i;
    }

    public GuestBusinessUserManager(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, iMessageManager, lifecycleOwner);
        this.LLJJIII = room;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(136));
        this.LLJJJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(134));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(135));
    }
}
