package com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor;

import X.AbstractC922600a7G;
import X.AbstractC928510aGn;
import X.C01GW;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C917810ZzX;
import X.C917860Zzc;
import X.C922760a7W;
import X.C923390a8X;
import X.C924630aAX;
import X.C930540aK4;
import X.C931800aM6;
import X.InterfaceC302401Fe;
import X.InterfaceC948500an2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicInviteGroupChatSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
public final class AnchorBusinessUserManager extends AbstractC922600a7G implements InterfaceC302401Fe {
    public final C01GW LLJJIII;

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return null;
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJJ(LinkMessage linkMessage) {
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJLI() {
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJLL() {
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJZ(C923390a8X c923390a8X) {
    }

    public final AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> LJJJLZIJ() {
        return (AbstractC928510aGn) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC302401Fe
    public final AbstractC928510aGn LIZ() {
        return LJJJLZIJ();
    }

    @Override // X.AbstractC922600a7G
    public final AbstractC928510aGn LJJJI() {
        return LJJJLZIJ();
    }

    @Override // X.AbstractC922600a7G, X.InterfaceC921620a5g
    public final void init() {
        super.init();
        LJJIJ("enter_room", 8, null, null);
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return InterfaceC302401Fe.class;
    }

    @Override // X.InterfaceC921620a5g
    public final void LJIILLIIL(int i) {
        LJJJLL(i);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJ(Throwable th) {
        super.LJJJJ(th);
        C924630aAX.LJJIJIL(th, true);
    }

    @Override // X.AbstractC922600a7G
    public final List<Integer> LJJJJL(String str) {
        int i;
        ArrayList arrayList;
        Integer numInvoke;
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        ArrayList arrayList2;
        MultiGuestDataHolder multiGuestDataHolder2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable()) {
            if (C917810ZzX.LJIIIZ()) {
                C931800aM6.LIZ.getClass();
                if (C931800aM6.LIZIZ()) {
                    i = 0;
                } else {
                    C20441214yg.LIZIZ("LinkUserInfoCenter", "getUserManagerScene for union session is false");
                    i = this.LLIZ;
                }
            } else if (C917810ZzX.LJIIIIZZ() && !C917810ZzX.LJIIJJI()) {
                i = 2;
            } else if (C917810ZzX.LJIIIIZZ() && C917810ZzX.LJIIJJI()) {
                i = 1;
            } else {
                C20441214yg.LIZIZ("LinkUserInfoCenter", "getUserManagerScene else branch.");
                i = this.LLIZ;
            }
        } else {
            i = this.LLIZ;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    arrayList = new ArrayList();
                    arrayList.add(1);
                    arrayList.add(2);
                    arrayList.add(3);
                    C20441214yg.LIZIZ("LinkUserInfoCenter", "listType else");
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(1);
                    if (!C930540aK4.LJJIJ() && ((C922760a7W.LIZIZ() || C922760a7W.LIZJ()) && (multiGuestDataHolder2 = this.LLJILLL) != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder2.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ2.applierSortSetting == 1)) {
                        arrayList.add(6);
                    } else {
                        arrayList.add(2);
                    }
                    arrayList.add(3);
                    arrayList.add(5);
                }
            } else {
                arrayList = new ArrayList();
                arrayList.add(5);
                arrayList.add(3);
                C20441214yg.LIZIZ("LinkUserInfoCenter", "listType SCENE_CO_HOST");
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(1);
            if (!C930540aK4.LJJIJ() && ((C922760a7W.LIZIZ() || C922760a7W.LIZJ()) && (multiGuestDataHolder = this.LLJILLL) != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting == 1)) {
                arrayList.add(6);
            } else {
                arrayList.add(2);
            }
            arrayList.add(3);
            if (C917860Zzc.LIZIZ()) {
                arrayList.add(5);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listType source:");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("LinkUserInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
            Function0<Integer> function0 = this.LLIZLLLIL;
            if (function0 != null) {
                numInvoke = function0.invoke();
            } else {
                numInvoke = null;
            }
            if (Intrinsics.LJFF(str, "FETCH_ON_ADD_FRIENDS_LIST")) {
                if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup()) {
                    arrayList.add(4);
                    C20441214yg.LIZIZ("LinkUserInfoCenter", "listType add NOT_VIEWER_FRIENDS");
                }
            } else if (numInvoke != null && numInvoke.intValue() == 1) {
                arrayList.clear();
                arrayList.add(1);
                arrayList.add(4);
                C20441214yg.LIZIZ("LinkUserInfoCenter", "listType only NOT_VIEWER_FRIENDS");
            }
            if (!((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS() && !C930540aK4.LJJIJ() && LinkMicInviteGroupChatSetting.INSTANCE.enable()) {
                arrayList.add(7);
            }
            if (!C930540aK4.LJJIJ()) {
                arrayList.add(9);
                arrayList.add(12);
            }
            if (!((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS() && !C930540aK4.LJJIJ()) {
                arrayList.add(8);
            }
        }
        AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> abstractC928510aGnLJJJLZIJ = LJJJLZIJ();
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup()) {
            arrayList2 = arrayList;
        } else {
            arrayList2 = new ArrayList();
        }
        ((ArrayList) abstractC928510aGnLJJJLZIJ.LJIILL).clear();
        ((ArrayList) abstractC928510aGnLJJJLZIJ.LJIILL).addAll(arrayList2);
        return arrayList;
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJI(MultiLiveGuestInfoList multiLiveGuestInfoList, String str) {
        super.LJJJJI(multiLiveGuestInfoList, str);
        C924630aAX.LJJIJL(LJJJLZIJ().LJIJJLI(), true);
    }

    public /* synthetic */ AnchorBusinessUserManager(Room room, long j, IMessageManager iMessageManager) {
        this(room, j, iMessageManager, null);
    }

    @Override // X.AbstractC922600a7G
    public final void LJJJJIZL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        LJJIJ("message_linked_list_change", 1, null, null);
    }

    public AnchorBusinessUserManager(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, iMessageManager, lifecycleOwner);
        this.LLJJIII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(133));
    }
}
