package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.MultiGuestApplyCountChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAgreeGuideEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RequestFrequencyEndEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0a6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922200a6c extends AbstractC303101Fl implements C0TBL {
    public final LifecycleOwner LL;
    public final DataChannel LLILLJJLI;
    public final InterfaceC302401Fe LLILLL;
    public final List<LinkPlayerInfo> LLILZ = new ArrayList();
    public final List<LinkPlayerInfo> LLILZIL = new ArrayList();
    public final C01GW LLILZLL;

    public final void LIZ() {
        InterfaceC302401Fe interfaceC302401Fe = this.LLILLL;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIJIL(this);
        }
        this.LLILLJJLI.BQ2(this.LL, ResetRedDotNumEvent.class, new AwS594S0100000_15(this, 732));
        if (this.LLILLJJLI.gg0(LiveModeChannel.class) != LiveMode.LIVE_VOICE) {
            this.LLILLJJLI.BQ2(this.LL, MultiGuestAgreeGuideEvent.class, new AwS594S0100000_15(this, 733));
        }
    }

    public final void LIZIZ() {
        InterfaceC302401Fe interfaceC302401Fe = this.LLILLL;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIIJ(this);
        }
        ((ArrayList) this.LLILZIL).clear();
        this.LLILLJJLI.zW(MultiGuestAudienceNumChangedEvent.class, Integer.valueOf(((ArrayList) this.LLILZIL).size()));
    }

    @Override // X.C0TBL
    public final void LJJII(User user) {
        this.LLILLJJLI.zW(RequestFrequencyEndEvent.class, user);
    }

    @Override // X.InterfaceC922630a7J
    public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        List<LinkPlayerInfo> listLJI = interfaceC921200a50.LJI();
        ArrayList<LinkPlayerInfo> arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : listLJI) {
            if (!((ArrayList) this.LLILZ).contains(linkPlayerInfo)) {
                arrayList.add(linkPlayerInfo);
            }
        }
        ((ArrayList) this.LLILZIL).addAll(arrayList);
        for (LinkPlayerInfo linkPlayerInfo2 : arrayList) {
            InterfaceC922160a6Y interfaceC922160a6Y = (InterfaceC922160a6Y) this.LLILZLL.getValue();
            if (interfaceC922160a6Y != null) {
                interfaceC922160a6Y.LIZ(linkPlayerInfo2.mUser);
            }
        }
        List<LinkPlayerInfo> list = this.LLILZ;
        ArrayList<LinkPlayerInfo> arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!interfaceC921200a50.LJI().contains(obj)) {
                arrayList2.add(obj);
            }
        }
        ((ArrayList) this.LLILZIL).removeAll(arrayList2);
        for (LinkPlayerInfo linkPlayerInfo3 : arrayList2) {
            InterfaceC922160a6Y interfaceC922160a6Y2 = (InterfaceC922160a6Y) this.LLILZLL.getValue();
            if (interfaceC922160a6Y2 != null) {
                interfaceC922160a6Y2.LIZJ(linkPlayerInfo3.mUser);
            }
        }
        ((ArrayList) this.LLILZ).clear();
        ((ArrayList) this.LLILZ).addAll(interfaceC921200a50.LJI());
        int size = ((ArrayList) this.LLILZIL).size();
        if (C922770a7X.LIZ() && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold > 0) {
            List<LinkPlayerInfo> listLJI2 = interfaceC921200a50.LJI();
            size = 0;
            if (((Number) C500260Jjc.LJI(listLJI2, AFwS250S0000000_15.get$arr$(166)).getSecond()).intValue() != -1) {
                for (LinkPlayerInfo linkPlayerInfo4 : listLJI2) {
                    if (((ArrayList) this.LLILZIL).contains(linkPlayerInfo4)) {
                        size++;
                    }
                    if (linkPlayerInfo4.isLastMeetGiftScoreThresholdApplier) {
                        break;
                    }
                }
            }
        }
        if (C917860Zzc.LIZIZ()) {
            this.LLILLJJLI.zW(MultiGuestApplyNumChangedEvent.class, new C927390aEz(size, ((ArrayList) this.LLILZIL).size()));
            this.LLILLJJLI.zW(MultiGuestApplyCountChannel.class, Integer.valueOf(((ArrayList) this.LLILZIL).size()));
        } else {
            this.LLILLJJLI.zW(MultiGuestAudienceNumChangedEvent.class, Integer.valueOf(((ArrayList) this.LLILZIL).size()));
        }
    }

    public C922200a6c(LifecycleOwner lifecycleOwner, DataChannel dataChannel, InterfaceC302401Fe interfaceC302401Fe) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC302401Fe;
        new ArrayList();
        new ArrayList();
        this.LLILZLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 646));
    }
}
