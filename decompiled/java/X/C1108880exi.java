package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.event.LiveIsHavingPinCardData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0exi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108880exi implements InterfaceC1107910ew9, InterfaceC1141530foN {
    public DataChannel LL;
    public LifecycleOwner LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(289));
    public Room LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Boolean boolValueOf;
        Integer numValueOf;
        if (Intrinsics.LJFF("live_goal_update_event", c262100zr.LIZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            DataChannel dataChannel = null;
            if (interfaceC1107590evd != null) {
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd, "pinned", false));
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "goalStatus", 0));
            } else {
                boolValueOf = null;
                numValueOf = null;
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel = dataChannel2;
            }
            if (C500260Jjc.LJIIZILJ(dataChannel) && Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                int code = EnumC2636010g.ONGOING.getCode();
                if (numValueOf != null && numValueOf.intValue() == code && ((IPinCardService) this.LLILLL.getValue()).Qi(EnumC1107860ew4.LIVE_GOAL) && !this.LLILZIL) {
                    new CountDownTimerC511401yy(this, 1).start();
                    this.LLILZIL = true;
                }
            }
        }
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C1108900exk c1108900exk = (C1108900exk) dataChannelGlobal.gg0(LiveGiftShowPinCardEvent.class);
        if (c1108900exk == null || (str = c1108900exk.LJFF) == null) {
            str = "";
        }
        C389001fE.LIZJ("lynx_pin_card_closed", new Pair[]{new Pair("name", str)});
        dataChannelGlobal.HQ2(LiveIsHavingPinCardData.class, Boolean.FALSE);
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        DataChannelGlobal.LLILZ.zQ2(this);
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZJ(EnumC1107860ew4 enumC1107860ew4, boolean z) {
        DataChannelGlobal.LLILZ.HQ2(LiveIsHavingPinCardData.class, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        DataChannel dataChannel = c1107460evQ.LIZJ;
        this.LL = dataChannel;
        this.LLILLJJLI = c1107460evQ.LIZIZ;
        LifecycleOwner lifecycleOwner = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        this.LLILZ = (Room) dataChannel.gg0(RoomChannel.class);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(LiveGiftShowPinCardEvent.class, this, new AwS596S0100000_17(this, 609));
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
        if (lifecycleOwner2 != null) {
            lifecycleOwner = lifecycleOwner2;
        }
        dataChannel2.EQ2(lifecycleOwner, SubOnlyLiveAudienceStatusChannel.class, new AwS596S0100000_17(this, 610));
        dataChannelGlobal.HQ2(LiveIsHavingPinCardData.class, Boolean.FALSE);
        C1548820qPI.LIZLLL("live_goal_update_event", this);
    }

    @Override // X.InterfaceC1107910ew9
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        view.setBackgroundColor(0);
        DataChannelGlobal.LLILZ.HQ2(LiveIsHavingPinCardData.class, Boolean.TRUE);
    }
}
