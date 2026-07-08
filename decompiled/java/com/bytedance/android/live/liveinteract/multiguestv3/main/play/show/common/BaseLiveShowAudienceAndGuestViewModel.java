package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import X.AbstractC303101Fl;
import X.AbstractC928510aGn;
import X.C13BV;
import X.C303001Fk;
import X.C930930aKh;
import X.C930940aKi;
import X.C948450amx;
import X.InterfaceC917640ZzG;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLiveShowAudienceAndGuestViewModel extends BaseLiveShowViewModel {
    public final MutableLiveData<List<LinkPlayerInfo>> LLJILJIL = new MutableLiveData<>(C13BV.INSTANCE);
    public final C303001Fk LLJILJILJ = new AbstractC303101Fl() { // from class: X.01Fk
        @Override // X.AbstractC303101Fl, X.InterfaceC922630a7J
        public final void Ue(Throwable th) {
        }

        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            List<LinkPlayerInfo> value = this.LL.LLJILJIL.getValue();
            if (value != null && value.size() == C921170a4x.LIZJ(interfaceC921200a50)) {
                return;
            }
            MutableLiveData<List<LinkPlayerInfo>> mutableLiveData = this.LL.LLJILJIL;
            List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
            ArrayList arrayList = new ArrayList();
            for (LinkPlayerInfo linkPlayerInfo : listLIZ) {
                LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if ((room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) || linkPlayerInfo2.mUser.getId() != room.getOwnerUserId()) {
                    arrayList.add(linkPlayerInfo);
                }
            }
            mutableLiveData.setValue(arrayList);
        }

        @Override // X.AbstractC303101Fl, X.InterfaceC922630a7J
        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            Long lValueOf;
            List<LinkPlayerInfo> value = this.LL.LLJILJIL.getValue();
            if (value != null && value.size() == C921170a4x.LIZJ(interfaceC921200a50)) {
                return;
            }
            List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
            ArrayList<LinkListUser> arrayList = new ArrayList();
            for (LinkListUser linkListUser : listLIZ) {
                User user = linkListUser.user;
                Long lValueOf2 = null;
                if (user != null) {
                    lValueOf = Long.valueOf(user.getId());
                } else {
                    lValueOf = null;
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room != null || (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) != null) {
                    lValueOf2 = Long.valueOf(room.getOwnerUserId());
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    arrayList.add(linkListUser);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (LinkListUser linkListUser2 : arrayList) {
                LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                linkPlayerInfo.mUser = linkListUser2.user;
                linkPlayerInfo.mInteractIdStr = linkListUser2.linkMicId;
                arrayList2.add(linkPlayerInfo);
            }
            this.LL.LLJILJIL.setValue(arrayList2);
        }
    };

    public final List<LinkPlayerInfo> GQ2() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        ArrayList<LinkListUser> arrayList = null;
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLJJIII) {
                User user = ((LinkListUser) obj).user;
                Long lValueOf = user != null ? Long.valueOf(user.getId()) : null;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (!Intrinsics.LJFF(lValueOf, (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) ? null : Long.valueOf(room.getOwnerUserId()))) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            for (LinkListUser linkListUser : arrayList) {
                LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                linkPlayerInfo.mUser = linkListUser.user;
                linkPlayerInfo.mInteractIdStr = linkListUser.linkMicId;
                arrayList3.add(linkPlayerInfo);
            }
        }
        return arrayList3;
    }
}
