package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameDropsRedDotUpdateSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.message.PartnershipDropsAnchorMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C443301nz implements InterfaceViewOnClickListenerC1102800enu, OnIMMessageListener {
    public static String LLJIJIL = "";
    public Room LL;
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public long LLILZ;
    public C515301zb LLILZLL;
    public GameTag LLIZ;
    public IMessageManager LLIZLLLIL;
    public boolean LLJI;
    public String LLILZIL = "normal";
    public final C01GW LLJ = C452501pT.LIZIZ(new C5182020e(this, 25));

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "game_drops";
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public final Map<String, String> LIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        HashMap map = new HashMap();
        DataChannel dataChannel = this.LLILLJJLI;
        C443401o0 c443401o0 = dataChannel != null ? (C443401o0) dataChannel.gg0(C754460Tie.class) : null;
        String str5 = "";
        if (c443401o0 == null || (str = c443401o0.LIZ) == null) {
            str = "";
        }
        map.put("is_join_drops", str.length() > 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (c443401o0 == null || (str2 = c443401o0.LIZ) == null) {
            str2 = "";
        }
        map.put("drops_id", str2);
        if (c443401o0 == null || (str3 = c443401o0.LIZJ) == null) {
            str3 = "";
        }
        map.put("game_id", str3);
        if (c443401o0 != null && (str4 = c443401o0.LIZLLL) != null) {
            str5 = str4;
        }
        map.put("game_name", str5);
        return map;
    }

    public final Map<String, String> LIZIZ() {
        LiveMode liveMode;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("live_traffic_source", C0IXW.LIZLLL(this.LLILLJJLI) ? "ad" : "normal");
        pairArr[1] = new Pair("is_host", "1");
        pairArr[2] = new Pair("icon_type", this.LLILZIL);
        pairArr[3] = new Pair("entrance_page", "live_room");
        Room room = this.LL;
        pairArr[4] = new Pair("content_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        pairArr[5] = new Pair("is_landscape", CardStruct.IStatusCode.DEFAULT);
        pairArr[6] = new Pair("drops_id", LLJIJIL);
        pairArr[7] = new Pair("is_red_dot", EnumC1102750enp.ANCHOR_PARTNERSHIP_DROPS.isRedDotShowing(this.LLILLJJLI) ? "1" : CardStruct.IStatusCode.DEFAULT);
        DataChannel dataChannel = this.LLILLJJLI;
        pairArr[8] = new Pair("live_type", (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? "" : C354201Zc.LIZ(liveMode));
        pairArr[9] = new Pair("allow_comments", InterfaceC1106030et7.E4.LIZIZ().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Context context;
        Long l;
        C443401o0 c443401o0;
        String str2;
        String str3;
        C443401o0 c443401o02;
        InterfaceC1106030et7.x4.LJFF(Integer.valueOf(TtliveGameDropsRedDotUpdateSetting.INSTANCE.getValue()));
        if (LLJIJIL.length() == 0) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel == null || (c443401o02 = (C443401o0) dataChannel.gg0(C754460Tie.class)) == null || (str3 = c443401o02.LIZ) == null) {
                str3 = "";
            }
            LLJIJIL = str3;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLILZ < 500) {
            return;
        }
        this.LLILZ = jUptimeMillis;
        DataChannel dataChannel2 = this.LLILLJJLI;
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.ANCHOR_PARTNERSHIP_DROPS;
        if (!enumC1102750enp.isRedDotShowing(dataChannel2)) {
            str = "normal";
        } else {
            str = "red_dot";
        }
        Map<String, String> mapLIZ = LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_drops_icon_click");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII("live_room", "event_page");
        c474500IjALIZ.LJJII(str, "icon_type");
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LIZ();
        if (view != null && (context = view.getContext()) != null) {
            enumC1102750enp.hideRedDot(this.LLILLJJLI);
            this.LLILZIL = "normal";
            C01GU c01guOK0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0();
            if (!Intrinsics.LJFF(InterfaceC1106030et7.w4.LIZ(), Boolean.TRUE)) {
                if (c01guOK0 != null) {
                    C01GU.LIZJ(context, LIZIZ());
                    return;
                }
                return;
            }
            DataChannel dataChannel3 = this.LLILLJJLI;
            Long l2 = null;
            if (dataChannel3 != null && (c443401o0 = (C443401o0) dataChannel3.gg0(C754460Tie.class)) != null && (str2 = c443401o0.LIZ) != null && str2.length() > 1) {
                if (c01guOK0 == null) {
                    return;
                }
                C01GU.LJFF(context, LIZIZ());
                return;
            }
            GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
            if (gameTagLIZIZ != null) {
                l = gameTagLIZIZ.id;
            } else {
                l = null;
            }
            GameTag gameTag = this.LLIZ;
            if (gameTag != null) {
                l2 = gameTag.id;
            }
            if (!(!Intrinsics.LJFF(l, l2)) && ((List) this.LLJ.getValue()).size() <= 1) {
                if (true ^ ((List) this.LLJ.getValue()).isEmpty()) {
                    LLJIJIL = String.valueOf(((Number) ListProtector.get((List) this.LLJ.getValue(), 0)).longValue());
                }
                if (c01guOK0 == null) {
                    return;
                }
                C01GU.LJFF(context, LIZIZ());
                return;
            }
            if (c01guOK0 == null) {
                return;
            }
            C01GU.LIZIZ(context, LIZIZ());
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof PartnershipDropsAnchorMessage) {
            PartnershipDropsAnchorMessage partnershipDropsAnchorMessage = (PartnershipDropsAnchorMessage) iMessage;
            if (partnershipDropsAnchorMessage.anchorJoinDropsNoticeType == 1 && LLJIJIL.length() == 0) {
                String str = partnershipDropsAnchorMessage.dropsId;
                LLJIJIL = str;
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.SX0(C754460Tie.class, new C443401o0(str, partnershipDropsAnchorMessage.dropsName, "", ""));
                }
                C500260Jjc.LJJLIIIJJIZ(new C5182020e(iMessage, 26));
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C515301zb c515301zb = this.LLILZLL;
        if (c515301zb != null) {
            C1548820qPI.LJIIIIZZ("signInPartnershipDropsEvent", c515301zb);
            C1548820qPI.LJIIIIZZ("gameAnchorJoinDrops", c515301zb);
        }
        IMessageManager iMessageManager = this.LLIZLLLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.PARTNERSHIP_DROPS_ANCHOR_MESSAGE.getIntType(), this);
        }
        LLJIJIL = "";
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
        this.LLIZLLLIL = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        this.LL = (Room) dataChannel.gg0(RoomChannel.class);
        dataChannel.gg0(LiveModeChannel.class);
        this.LLILLL = interfaceC1103130eoR;
        C515301zb c515301zb = new C515301zb(this, 3);
        this.LLILZLL = c515301zb;
        C1548820qPI.LIZLLL("signInPartnershipDropsEvent", c515301zb);
        C1548820qPI.LIZLLL("gameAnchorJoinDrops", c515301zb);
        IMessageManager iMessageManager = this.LLIZLLLIL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.PARTNERSHIP_DROPS_ANCHOR_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        if (TtliveGameDropsRedDotUpdateSetting.INSTANCE.getValue() > InterfaceC1106030et7.x4.LIZIZ().intValue()) {
            this.LLILZIL = "red_dot";
            EnumC1102750enp.ANCHOR_PARTNERSHIP_DROPS.showRedDot(this.LLILLJJLI);
        } else {
            this.LLILZIL = "normal";
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        String str = this.LLILZIL;
        Map<String, String> mapLIZ = LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_drops_icon_show");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII("live_room", "event_page");
        c474500IjALIZ.LJJII(str, "icon_type");
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LIZ();
        InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLL;
        if (interfaceC1103130eoR2 != null) {
            interfaceC1103130eoR2.post(new RunnableC514801zW(this, 18));
        }
        this.LLIZ = C754700Tj2.LIZIZ();
    }
}
