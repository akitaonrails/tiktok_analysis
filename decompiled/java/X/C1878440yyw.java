package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.SalesCPSInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.0yyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878440yyw implements InterfaceViewOnClickListenerC1102800enu {
    public Room LL;
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public long LLILZIL;
    public int LLILZLL;
    public BriefGameTask LLJI;
    public final C11NJ LLILZ = new C11NJ();
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public final C515301zb LLJIJIL = new C515301zb(this, 2);

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    public final Map<String, String> LIZIZ() {
        LiveMode liveMode;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("live_traffic_source", C0IXW.LIZLLL(this.LLILLJJLI) ? "ad" : "normal");
        pairArr[1] = new Pair("is_host", "1");
        Room room = this.LL;
        pairArr[2] = new Pair("content_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        pairArr[3] = new Pair("is_landscape", CardStruct.IStatusCode.DEFAULT);
        pairArr[4] = new Pair("cps_click_id", this.LLIZLLLIL);
        DataChannel dataChannel = this.LLILLJJLI;
        pairArr[5] = new Pair("live_type", (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? "" : C354201Zc.LIZ(liveMode));
        return C2097608Jq.LJIIIIZZ(pairArr);
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
        LiveMode liveMode;
        SalesCPSInfo salesCPSInfo;
        PartnershipTask partnershipTask;
        SalesCPSInfo salesCPSInfo2;
        PartnershipTask partnershipTask2;
        DataChannel dataChannel = this.LLILLJJLI;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(C750310Tbx.class) : null;
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("btn_name", "icon");
        BriefGameTask briefGameTask = this.LLJI;
        pairArr[1] = new Pair("btn_type", (briefGameTask == null || (partnershipTask2 = briefGameTask.task) == null || partnershipTask2.taskMode != 40) ? "game_anchor" : "game_props_sale");
        pairArr[2] = new Pair("user_type", "host");
        pairArr[3] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        pairArr[4] = new Pair("user_country_code", ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurrentRegionCode());
        BriefGameTask briefGameTask2 = this.LLJI;
        String strLIZ = "";
        if (briefGameTask2 == null || (salesCPSInfo2 = briefGameTask2.salesCpsInfo) == null || (str = salesCPSInfo2.openId) == null) {
            str = "";
        }
        pairArr[5] = new Pair("open_id", str);
        BriefGameTask briefGameTask3 = this.LLJI;
        if (briefGameTask3 == null || (partnershipTask = briefGameTask3.task) == null || (str2 = partnershipTask.idStr) == null) {
            str2 = "";
        }
        pairArr[6] = new Pair("biz_id", str2);
        BriefGameTask briefGameTask4 = this.LLJI;
        if (briefGameTask4 == null || (salesCPSInfo = briefGameTask4.salesCpsInfo) == null || (str3 = salesCPSInfo.schema) == null) {
            str3 = "";
        }
        pairArr[7] = new Pair("product_link", str3);
        pairArr[8] = new Pair("click_id", this.LLIZLLLIL);
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        pairArr[9] = new Pair("live_type", strLIZ);
        pairArr[10] = new Pair("page_name", "live_detail");
        pairArr[11] = new Pair("org_acc", String.valueOf(objGg0));
        pairArr[12] = new Pair("is_creator_code", String.valueOf(this.LLILZLL));
        pairArr[13] = new Pair("creator_code_type", this.LLIZ);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        InterfaceC1103130eoR interfaceC1103130eoR;
        Context context2;
        Context contextN3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJIIZI(LIZ());
        c474500IjALIZ.LIZ();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLILZIL < 500) {
            return;
        }
        this.LLILZIL = jUptimeMillis;
        String str = this.LLJ;
        if (str != null && str.length() != 0 && (interfaceC1103130eoR = this.LLILLL) != null && (context2 = interfaceC1103130eoR.getContext()) != null && (contextN3 = C786410Ut5.N3(context2)) != null) {
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(this.LLJ);
            c760370TsBLIZ.LJIJJLI("bottom");
            c760370TsBLIZ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), EnumC760350Ts9.DP);
            c760370TsBLIZ.LJJII(LIZIZ());
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextN3, c760370TsBLIZ.LIZ().toString(), null);
            return;
        }
        if (view != null && (context = view.getContext()) != null && ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
            C01GU.LJI(C786410Ut5.N3(context), LIZIZ());
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        dataChannel.zQ2(this);
        this.LLILZ.LJ();
        C1548820qPI.LJIIIIZZ("gamePartnershipFirstHideTask", this.LLJIJIL);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
        this.LL = (Room) dataChannel.gg0(RoomChannel.class);
        dataChannel.gg0(LiveModeChannel.class);
        this.LLILLL = interfaceC1103130eoR;
        Room room = this.LL;
        if (room != null) {
            ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Wo2(room.getId(), new AwS394S0200000_28(this, dataChannel, 6));
        } else {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJIIZI(LIZ());
            c474500IjALIZ.LIZ();
        }
        dataChannel.BQ2(dataChannel.LLILZ, GamePartnershipEntranceHide.class, new AwS383S0200000_17(interfaceC1103130eoR, dataChannel, 12));
        C1548820qPI.LIZLLL("gamePartnershipFirstHideTask", this.LLJIJIL);
        EnumC1102750enp.ANCHOR_PARTNERSHIP.show(dataChannel);
    }
}
