package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0a5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC921620a5g {
    String LIZIZ(long j);

    void LJI(AwS557S0100000_13 awS557S0100000_13);

    void LJIIIZ(long j, String str);

    void LJIIJJI(long j);

    void LJIILIIL(MultiGuestDataHolder multiGuestDataHolder);

    void LJIILJJIL(int i);

    void LJIILLIIL(int i);

    void LJIJJ(long j, String str);

    String LJIL(long j);

    void LJJ(BusinessContent businessContent);

    C11L6 LJJIFFI(GuestApplyStillInLineParams guestApplyStillInLineParams);

    void LJJIIJ(InterfaceC922630a7J interfaceC922630a7J);

    void LJJIJ(String str, int i, Function1<? super InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList>, Unit> function1, Function1<? super InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList>, Unit> function12);

    void LJJIJIL(InterfaceC922630a7J interfaceC922630a7J);

    void init();

    void release();

    void setDataChannel(DataChannel dataChannel);
}
