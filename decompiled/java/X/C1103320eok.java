package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SMBStateSync;
import com.bytedance.android.livesdkapi.depend.model.live.AggregationData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103320eok implements InterfaceC1102810env, InterfaceC484670IzZ, OnIMMessageListener {
    public Room LL;
    public LiveIconView LLILLJJLI;
    public C16F5 LLILLL;
    public C1103540ep6 LLILZ;
    public long LLILZIL;
    public Context LLILZLL;
    public LifecycleOwner LLIZ;
    public DataChannel LLIZLLLIL;
    public C054G LLJ;
    public InterfaceC785120Ur0 LLJI;
    public IMessageManager LLJIJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public C1107120eus LLJJ;
    public C11JF LLJJI;
    public final C1143920fsE LLJILJIL = new C1143920fsE();
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1103360eoo());

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "PcsToolbarAudienceServicePlusBehavior";
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    public final InterfaceC1103440eow LJFF() {
        C054G c054g;
        String secUid;
        Room room = this.LL;
        if (room == null || (c054g = this.LLJ) == null) {
            return null;
        }
        String strValueOf = String.valueOf(room.getId());
        InterfaceC1097310ef3 interfaceC1097310ef3LIZJ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1().LIZJ();
        User owner = room.getOwner();
        if (owner == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        return interfaceC1097310ef3LIZJ.LJ(secUid, strValueOf, c054g);
    }

    public final void LJIIIZ() {
        Long l;
        long jLongValue = 0;
        if (this.LLJILLL == 0) {
            this.LLJILLL = System.currentTimeMillis();
        }
        LJIIIIZZ("show");
        C1103300eoi.LIZLLL.LJI("smb_viewer_service_plus_entrance_show", Boolean.TRUE);
        InterfaceC513260KAy interfaceC513260KAyLIZIZ = C1826730xdX.LIZIZ();
        if (interfaceC513260KAyLIZIZ != null) {
            int iHashCode = hashCode();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis();
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel != null && (l = (Long) dataChannel.gg0(C781130UkZ.class)) != null) {
                jLongValue = l.longValue();
            }
            C517530KRj c517530KRj = new C517530KRj(iHashCode, 8, jCurrentTimeMillis - jLongValue, "comment_left", linkedHashMap);
            c517530KRj.LIZJ = 0.01d;
            interfaceC513260KAyLIZIZ.LIZLLL("ServicePlusAudienceEntranceInLive", c517530KRj);
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("show_entrance", "live_detail_service_plus", jSONObject);
        C510380Jzw.LJIL("allinone_entrance_show", jSONObject);
    }

    public final void LJIIJ() {
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLJI;
        if (interfaceC785120Ur0 == null) {
            return;
        }
        if (interfaceC785120Ur0.getVisibility() != 0) {
            interfaceC785120Ur0.setVisibility(0);
        }
        if (this.LLJILLL == 0) {
            this.LLJILLL = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.d7f);
        }
        LiveIconView liveIconView2 = this.LLILLJJLI;
        if (liveIconView2 != null) {
            liveIconView2.LJ();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.cze);
        }
        LiveIconView liveIconView2 = this.LLILLJJLI;
        if (liveIconView2 != null) {
            liveIconView2.setIconTintAttr(R.attr.exs);
        }
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 170;
    }

    @Override // X.InterfaceC1102810env
    public final void J() {
        LLILLJJLI();
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FIXED;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LJI(String str) {
        String secUid;
        C0JJO c0jjoXf;
        User owner;
        User owner2;
        Room room = this.LL;
        Long lValueOf = null;
        if (room == null || (owner2 = room.getOwner()) == null || (secUid = owner2.getSecUid()) == null) {
            secUid = "";
        }
        Room room2 = this.LL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            owner.getIdStr();
        }
        Room room3 = this.LL;
        if (room3 != null) {
            lValueOf = Long.valueOf(room3.getId());
        }
        String strValueOf = String.valueOf(lValueOf);
        IPcsService iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class);
        if (iPcsService != null && (c0jjoXf = iPcsService.xf()) != null) {
            c0jjoXf.LJIIJJI(str, secUid, strValueOf, C2097908Jt.LIZJ(new Pair("avatar", C0JLW.LIZJ((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)))), false);
        }
    }

    public final void LJII(String str) {
        boolean z;
        long j;
        long jLongValue;
        Long l;
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLJI;
        if (interfaceC785120Ur0 != null && interfaceC785120Ur0.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        InterfaceC785120Ur0 interfaceC785120Ur02 = this.LLJI;
        if (interfaceC785120Ur02 != null) {
            interfaceC785120Ur02.LIZLLL();
        }
        if (z2 && this.LLJILLL == 0 && !Intrinsics.LJFF(str, "preload_zero_sku")) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.LLJILLL;
        if (j2 == 0) {
            j = 0;
        } else {
            j = jCurrentTimeMillis - j2;
        }
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C781130UkZ.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_sub_perf_entrance_hide");
        c474500IjALIZ.LJJII(Long.valueOf(j), "shown_duration");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - jLongValue), "time_since_mount");
        c474500IjALIZ.LJJII(str, "hide_reason");
        c474500IjALIZ.LIZ();
        this.LLJILLL = 0L;
    }

    public final void LJIIIIZZ(String str) {
        Long lValueOf;
        Long lValueOf2;
        User user;
        UserAttr userAttr;
        String str2;
        int i;
        String str3;
        long jLongValue;
        Long l;
        long jLongValue2;
        Long l2;
        C0IXL c0ixl;
        C752530TfX c752530TfX;
        AggregationData aggregationData;
        User user2;
        UserAttr userAttr2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance");
        c474500IjALIZ.LJIJJLI(this.LLIZLLLIL);
        Room room = this.LL;
        Boolean boolValueOf = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room room2 = this.LL;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "room_id");
        c474500IjALIZ.LJJII("live_detail_service_plus", "show_entrance");
        Room room3 = this.LL;
        if (room3 != null && (aggregationData = room3.aggregationData) != null && (user2 = aggregationData.audience) != null && (userAttr2 = user2.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr2.isAdmin);
        } else {
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel != null && (user = (User) dataChannel.gg0(RoomUserChannel.class)) != null && (userAttr = user.getUserAttr()) != null) {
                boolValueOf = Boolean.valueOf(userAttr.isAdmin);
            }
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str2 = "moderator";
        } else {
            str2 = "audience";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        boolean z = false;
        if (c0ir5 != null && (c752530TfX = c0ir5.LJIILL) != null) {
            i = c752530TfX.LIZ;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_opt_in");
        c474500IjALIZ.LJJII(str, "action_type");
        C0IR5 c0ir52 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir52 == null || (c0ixl = c0ir52.LJFF) == null || (str3 = c0ixl.LJFF) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, "live_action_type");
        if (Intrinsics.LJFF(str, "show")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            DataChannel dataChannel2 = this.LLIZLLLIL;
            if (dataChannel2 != null && (l2 = (Long) dataChannel2.gg0(C781130UkZ.class)) != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - jLongValue2), "show_latency");
        }
        if (Intrinsics.LJFF(str, "click")) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            DataChannel dataChannel3 = this.LLIZLLLIL;
            if (dataChannel3 != null && (l = (Long) dataChannel3.gg0(C781130UkZ.class)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis2 - jLongValue), "click_time");
            if (this.LLILZIL != 0 && System.currentTimeMillis() - this.LLILZIL <= 8000) {
                z = true;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_pin_bubble");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        LJI("live_detail_service_plus");
        LJIIIIZZ("click");
        C1103300eoi c1103300eoi = C1103300eoi.LIZLLL;
        c1103300eoi.getClass();
        c1103300eoi.LIZLLL(1, "smb_viewer_service_plus_click_count_app_session");
        c1103300eoi.LIZLLL(1, "smb_viewer_service_plus_click_count");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        SMBInfo sMBInfo;
        Map<Integer, Integer> map;
        Integer num;
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i = memberMessage.action;
            if ((i == 20 || i == 5) && (map = memberMessage.adminPermissions) != null && map.containsKey(18) && (num = map.get(18)) != null && num.intValue() == 1) {
                LJIIJJI(this.LL, this.LLIZLLLIL);
                return;
            }
            return;
        }
        if (!(iMessage instanceof SMBStateSync) || (sMBInfo = ((SMBStateSync) iMessage).smbInfo) == null || sMBInfo.activeSkuCount != 0) {
            return;
        }
        LJII("room_message_zero_sku");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    @Override // X.InterfaceC1102810env
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1099960ejK r9, X.C945840aik r10) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1103320eok.LIZIZ(X.0ejK, X.0aik):void");
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
        Long lValueOf;
        Long lValueOf2;
        this.LLJILJILJ = false;
        this.LLJILLL = 0L;
        IMessageManager iMessageManager = this.LLJIJIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        this.LLJIJIL = null;
        C11JF c11jf = this.LLJJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJI = null;
        C1107120eus c1107120eus = this.LLJJ;
        if (c1107120eus != null) {
            c1107120eus.LIZJ = false;
        }
        this.LLJJ = null;
        this.LLJILJIL.LIZ();
        this.LLJILJIL.LIZIZ();
        ((Handler) this.LLJJIII.getValue()).removeCallbacksAndMessages(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = this.LL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Boolean bool = Boolean.FALSE;
        dataChannelGlobal.HQ2(PcsAudienceServicePlusIconVisibleGlobalChannel.class, new Pair(lValueOf, bool));
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel != null) {
            Room room2 = this.LL;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
            } else {
                lValueOf2 = null;
            }
            dataChannel.zW(PcsAudienceServicePlusIconVisibleChannel.class, new Pair(lValueOf2, bool));
        }
        dataChannelGlobal.zQ2(this);
        C054G c054g = this.LLJ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LLJ = null;
        this.LLIZ = null;
    }

    public final void LJIIJJI(final Room room, DataChannel dataChannel) {
        View contentView;
        if (room == null || InterfaceC1106030et7.X4.LIZIZ().containsKey(String.valueOf(room.getOwnerUserId()))) {
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131856035);
        EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.VIEWER_GUIDE_MODERATOR_SERVICE_PLUS_PIN;
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLJI;
        if (interfaceC785120Ur0 != null) {
            contentView = interfaceC785120Ur0.getContentView();
        } else {
            contentView = null;
        }
        C785230UrB c785230UrB = new C785230UrB(contentView);
        c785230UrB.LJIJJ = strLJIJI;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0eol
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                this.LIZ.LLILZIL = System.currentTimeMillis();
                InterfaceC1106030et7.X4.LIZIZ().put(String.valueOf(room.getOwnerUserId()), Boolean.TRUE);
                C518990KWz.LIZJ("live_detail_service_plus", "moderator");
            }
        };
        c1113800f5e.LJ(new C785270UrF(c785230UrB), enumC1120860fH2, dataChannel);
    }
}
