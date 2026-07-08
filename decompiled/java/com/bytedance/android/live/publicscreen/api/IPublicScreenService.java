package com.bytedance.android.live.publicscreen.api;

import X.AbstractC1110520f0M;
import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.AnonymousClass0127;
import X.C006A;
import X.C0DT5;
import X.C1109070ey1;
import X.C1109240eyI;
import X.C1109290eyN;
import X.C1109560eyo;
import X.C1109600eys;
import X.C1109770ez9;
import X.C1112330f3H;
import X.C1112740f3w;
import X.C1113350f4v;
import X.C1113360f4w;
import X.C1113380f4y;
import X.C1113410f51;
import X.C1113480f58;
import X.C1113690f5T;
import X.C1114400f6c;
import X.C20516015Pq;
import X.C520890Kbn;
import X.C755050Tjb;
import X.C777030Udx;
import X.C779390Uhl;
import X.C784630UqD;
import X.InterfaceC1109090ey3;
import X.InterfaceC1109310eyP;
import X.InterfaceC1112060f2q;
import X.InterfaceC1112400f3O;
import X.InterfaceC1294060jmO;
import X.InterfaceC776970Udr;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.LiveChatMessageSEI;
import com.bytedance.android.livesdkapi.message.LiveChatMsgSequenceSEI;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface IPublicScreenService extends C006A {
    void Ac2(Room room);

    C1109600eys<? extends InterfaceC1112060f2q> CD2(long j, C1109240eyI c1109240eyI, boolean z);

    Class<? extends LiveRecyclableWidget> Cr1();

    Class<? extends LiveRecyclableWidget> Ey0(CaptionInfo captionInfo);

    void Fe1(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage);

    @InterfaceC1294060jmO
    C1109290eyN Fo2();

    void GA1(long j, C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, Object obj);

    void Gn1(long j, long j2, AbstractC1110520f0M abstractC1110520f0M);

    List<InterfaceC1109090ey3> IS0();

    Class<? extends LiveRecyclableWidget> IU0();

    void Jf0(long j, AbstractC1136060ffY abstractC1136060ffY, boolean z, C1114400f6c c1114400f6c);

    void Jl2();

    void KN1(String str);

    void KR(DataChannel dataChannel);

    void LLLF(Room room, DataChannel dataChannel);

    C1113350f4v LR();

    Class<? extends IPublicScreenContextWidget> M60();

    void NF0();

    void NL0(long j, long j2, AbstractC1136060ffY abstractC1136060ffY);

    C1113360f4w NY1();

    C1113380f4y NZ1();

    float Nz1(Context context);

    void OT0(long j, InterfaceC1112060f2q interfaceC1112060f2q);

    InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY);

    void Qq1(boolean z, boolean z2);

    void RZ0(long j, AbstractC1110520f0M abstractC1110520f0M);

    long Rd2(long j);

    void T60(long j, Text text, long j2, PunishEventInfo punishEventInfo, int i, int i2, String str, Integer num);

    C1112740f3w TK1();

    Integer TL1();

    void Tn2(long j, AbstractC1110800f0o abstractC1110800f0o);

    void UE2(long j, InterfaceC1112060f2q interfaceC1112060f2q, Object obj);

    void V70();

    void VW1();

    void X30(C1109770ez9 c1109770ez9, EmoteModel emoteModel, long j, long j2, long j3, int i);

    void XK(long j, C1112330f3H c1112330f3H);

    C0DT5 Xo();

    C1109070ey1 YM0(LifecycleOwner lifecycleOwner, Context context, ChatMessage chatMessage);

    C755050Tjb Ya();

    List<InterfaceC1112400f3O> Z51(int i);

    void Z71(DataChannel dataChannel);

    void Zi0(long j);

    InterfaceC1112060f2q aA1(int i, long j, long j2);

    void aD2(long j, String str);

    Class<? extends LiveRecyclableWidget> aF();

    void aJ2();

    void bQ1(int i, InterfaceC1112400f3O interfaceC1112400f3O);

    float bY(Context context);

    void bh0(long j, LiveChatMessageSEI liveChatMessageSEI, LiveChatMsgSequenceSEI liveChatMsgSequenceSEI);

    InterfaceC1109310eyP bv2(DataChannel dataChannel, boolean z);

    Class<? extends LiveRecyclableWidget> c32();

    void cL0(int i, InterfaceC1112400f3O interfaceC1112400f3O);

    void eW(TextView textView, boolean z);

    Long er1();

    GiftHistoryWidgetHelper f50(LifecycleOwner lifecycleOwner, DataChannel dataChannel, TextView textView, C20516015Pq c20516015Pq, boolean z, C1113690f5T c1113690f5T);

    void gC(long j);

    boolean gh2(long j, long j2);

    void gu(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    void gu1(Room room, DataChannel dataChannel);

    void hS(long j, long j2);

    AnonymousClass0127 ia0(DataChannel dataChannel);

    C779390Uhl jC1(DataChannel dataChannel);

    BottomMessage jK0(long j);

    void jc0(InterfaceC1109090ey3 interfaceC1109090ey3);

    ChatMessage jw2(long j, String str, User user, int i, C520890Kbn c520890Kbn, boolean z);

    C1109600eys<? extends InterfaceC1112060f2q> kX1(AbstractC1136060ffY abstractC1136060ffY);

    void ke0(long j, long j2, C1113480f58 c1113480f58);

    Class<? extends LiveRecyclableWidget> l12();

    Long lM(long j);

    Class<? extends LiveRecyclableWidget> nw1();

    boolean ol2(C1109770ez9 c1109770ez9, AbstractC1136060ffY abstractC1136060ffY);

    void q51(long j);

    boolean qD(Room room);

    void qu2(InterfaceC1112060f2q interfaceC1112060f2q);

    int rT0(Context context);

    void rf2(int i);

    C1113410f51 s71();

    void sy(long j, C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, boolean z);

    void tV1(long j, C1109560eyo c1109560eyo);

    ChatMessage v41(long j, String str, User user, C520890Kbn c520890Kbn, Long l);

    Class<? extends LiveRecyclableWidget> v80();

    Class<? extends IPublicScreenHolderWidget> wL();

    void wc1(AbstractC1136060ffY abstractC1136060ffY);

    Class<? extends IPublicScreenHolderWidget> yO(boolean z);

    void yu();

    C784630UqD zL(Context context, InterfaceC776970Udr interfaceC776970Udr, C777030Udx c777030Udx, DataChannel dataChannel);
}
