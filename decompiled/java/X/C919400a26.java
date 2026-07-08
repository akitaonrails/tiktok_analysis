package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0a26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919400a26 extends AbstractC303101Fl {
    public final DataChannel LL;
    public final InterfaceC917530Zz5 LLILLJJLI;
    public final List<LinkPlayerInfo> LLILLL = new ArrayList();
    public final List<LinkPlayerInfo> LLILZ = new ArrayList();

    public C919400a26(DataChannel dataChannel, InterfaceC917530Zz5 interfaceC917530Zz5) {
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC917530Zz5;
    }

    @Override // X.InterfaceC922630a7J
    public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
        List<LinkPlayerInfo> listLJIILLIIL = interfaceC921200a50.LJIILLIIL();
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : listLJIILLIIL) {
            if (!((ArrayList) this.LLILLL).contains(linkPlayerInfo)) {
                arrayList.add(linkPlayerInfo);
            }
        }
        ((ArrayList) this.LLILZ).addAll(arrayList);
        List<LinkPlayerInfo> list = this.LLILLL;
        ArrayList arrayList2 = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo2 : list) {
            if (!interfaceC921200a50.LJIILLIIL().contains(linkPlayerInfo2)) {
                arrayList2.add(linkPlayerInfo2);
            }
        }
        ((ArrayList) this.LLILZ).removeAll(arrayList2);
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(interfaceC921200a50.LJIILLIIL());
        this.LL.zW(MultiGuestApplicantNumChangedForModeratorChannel.class, Integer.valueOf(((ArrayList) this.LLILZ).size()));
    }
}
