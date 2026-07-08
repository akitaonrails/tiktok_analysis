package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.game.model.DropsRoomInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSchema;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* JADX INFO: renamed from: X.0esy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105940esy implements InterfaceC2762015c {
    public AnonymousClass0956 LIZ;
    public C1295960jpS LIZIZ;
    public boolean LIZLLL;
    public DataChannel LJ;
    public AudienceRoomInfoResponse.DropsInfo LJI;
    public String LIZJ = "";
    public String LJFF = "";
    public final C01GW LJII = C452501pT.LIZIZ(new C1105970et1());
    public final C1105960et0 LJIIIIZZ = new InterfaceC1141530foN() { // from class: X.0et0
        @Override // X.InterfaceC1141530foN
        public final void mh2(C262100zr c262100zr) {
            if (Intrinsics.LJFF(c262100zr.LIZ, "gameAudienceRewardDrops")) {
                InterfaceC772390URp.r0.LIZJ(Boolean.TRUE);
            }
        }
    };

    public static final boolean LIZIZ() {
        return ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).ja0(EnumC1101860emO.NAME, "shortTouchGamePartnershipDrops") != null;
    }

    public static final void LJFF() {
        ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Ud(EnumC1101860emO.NAME, "shortTouchGamePartnershipDrops");
    }

    public final void LJI() {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2 = this.LIZIZ;
        if (c1295960jpS2 == null || c1295960jpS2.getComposition() == null || (c1295960jpS = this.LIZIZ) == null) {
            return;
        }
        c1295960jpS.updateBitmap("image_4", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> LIZJ(com.bytedance.android.livesdkapi.depend.model.live.Room r6) {
        /*
            r5 = this;
            r3 = 1
            if (r6 == 0) goto L6d
            com.bytedance.android.livesdk.game.model.DropsRoomInfo r0 = r6.dropsInfo
            if (r0 == 0) goto L6d
            boolean r0 = r0.dropsListEntrance
            if (r0 != r3) goto L6d
            r1 = 1
        Lc:
            X.0JT6<java.lang.Boolean> r0 = X.InterfaceC772390URp.r0
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L5a
            boolean r0 = r5.LIZLLL
            if (r0 != 0) goto L5a
            if (r1 != 0) goto L5a
            r4 = 0
        L21:
            r3 = 0
            if (r4 == 0) goto L49
        L24:
            java.lang.String r0 = "livesdk_drops_icon_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LJ
            r2.LJIJJLI(r0)
            java.lang.String r1 = "icon_type"
            java.lang.String r0 = "normal"
            r2.LJJII(r0, r1)
            if (r3 == 0) goto L57
            java.lang.String r1 = "1"
        L3a:
            java.lang.String r0 = "is_red_dot"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "drops_id"
            java.lang.String r0 = r5.LIZJ
            r2.LJJII(r0, r1)
            r2.LIZ()
        L49:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        L57:
            java.lang.String r1 = "0"
            goto L3a
        L5a:
            r4 = 1
            X.14i1<java.lang.Boolean> r1 = X.InterfaceC772390URp.q0
            java.lang.Object r0 = r1.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L21
            r1.LJFF(r2)
            goto L24
        L6d:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1105940esy.LIZJ(com.bytedance.android.livesdkapi.depend.model.live.Room):kotlin.Pair");
    }

    public final void LIZLLL(List<PartnershipGameOfflineMessage.OfflineGameInfo> list) {
        for (Object obj : (ArrayList) list) {
            if (Intrinsics.LJFF(((PartnershipGameOfflineMessage.OfflineGameInfo) obj).taskId, this.LIZJ)) {
                if (obj != null) {
                    LJFF();
                    this.LIZJ = "";
                    return;
                }
                return;
            }
        }
    }

    public final void LJ(Context context, boolean z) {
        String str;
        String str2 = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsAudienceList;
        if (str2.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str2);
        String str3 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c760370TsBLIZ.LJJIFFI("is_red_dot", str);
        c760370TsBLIZ.LJJIFFI("drops_id", this.LIZJ);
        c760370TsBLIZ.LJJIFFI("entrance_page", "icon");
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drops_icon_click");
        c474500IjALIZ.LJIJJLI(this.LJ);
        c474500IjALIZ.LJJII("normal", "icon_type");
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_red_dot");
        c474500IjALIZ.LJJII(this.LIZJ, "drops_id");
        c474500IjALIZ.LIZ();
    }

    public final void LJII(final DataChannel dataChannel, DropsRoomInfo dropsRoomInfo) {
        if (!dropsRoomInfo.showClaimDropsGiftNotice) {
            return;
        }
        Boolean boolLIZ = InterfaceC772390URp.s0.LIZ();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLIZ, bool)) {
            return;
        }
        if (!Intrinsics.LJFF(InterfaceC772390URp.r0.LIZ(), bool) && !this.LIZLLL && !dropsRoomInfo.dropsListEntrance) {
            return;
        }
        int iCeil = (int) Math.ceil((((long) dropsRoomInfo.earliestGiftExpireTs) - (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) / 86400.0f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tips days =");
        sbLIZ.append(iCeil);
        C20441214yg.LIZIZ("GameDropsShortCardAgent", C2188811AlT.LIZIZ(sbLIZ));
        View view = EnumC1102750enp.SHARE.getView(dataChannel);
        if (view == null) {
            return;
        }
        C20441214yg.LIZIZ("GameDropsShortCardAgent", "show tips");
        C1105980et2 c1105980et2 = new C1105980et2(view);
        c1105980et2.LJJIIJZLJL = iCeil;
        c1105980et2.LJIILL = new InterfaceC254600ye() { // from class: X.0esz
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                String str;
                String str2;
                String str3;
                C1105940esy c1105940esy = this.LIZ;
                DataChannel dataChannel2 = dataChannel;
                AudienceRoomInfoResponse.DropsInfo dropsInfo = c1105940esy.LJI;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_rewards_unclaim_guide_show");
                c474500IjALIZ.LJIJJLI(dataChannel2);
                String str4 = "";
                if (dropsInfo == null || (str = dropsInfo.promotingDropsId) == null) {
                    str = "";
                }
                c474500IjALIZ.LJJII(str, "drops_id");
                if (dropsInfo == null || (str2 = dropsInfo.gameId) == null) {
                    str2 = "";
                }
                c474500IjALIZ.LJJII(str2, "game_id");
                if (dropsInfo != null && (str3 = dropsInfo.gameName) != null) {
                    str4 = str3;
                }
                c474500IjALIZ.LJJII(str4, "game_name");
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
                c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
                c474500IjALIZ.LIZ();
                InterfaceC772390URp.s0.LIZJ(Boolean.TRUE);
            }
        };
        C1113800f5e.LIZ.LJ(new C1105990et3(c1105980et2), EnumC1120860fH2.GAME_PARTNERSHIP_AUDIENCE_DROPS, dataChannel);
    }

    public final void LJIIIIZZ(Context context, Room room, DataChannel dataChannel) {
        if (this.LIZJ.length() > 0 || this.LIZLLL) {
            LIZ(context, room, dataChannel, this.LIZJ, "rotate");
        }
    }

    @Override // X.InterfaceC2762015c
    public final void LIZ(Context context, Room room, DataChannel dataChannel, String str, String str2) {
        Long lValueOf;
        this.LJ = dataChannel;
        boolean z = false;
        if (str.length() == 0) {
            return;
        }
        C1548820qPI.LIZLLL("gameAudienceRewardDrops", this.LJIIIIZZ);
        GameLivePartnershipDropsSetting gameLivePartnershipDropsSetting = GameLivePartnershipDropsSetting.INSTANCE;
        String str3 = gameLivePartnershipDropsSetting.getConfig().dropsCard;
        if (gameLivePartnershipDropsSetting.getConfig().enable && str3.length() != 0) {
            this.LIZJ = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append("&drops_id=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append("&room_id=");
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append("&load_from=");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LJFF();
            Uri uri = UriProtector.parse(strLIZIZ);
            C20337914i1<Long> c20337914i1 = InterfaceC772390URp.u0;
            Long lLIZIZ = c20337914i1.LIZIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - lLIZIZ.longValue() >= 86400000) {
                c20337914i1.LJFF(Long.valueOf(jCurrentTimeMillis));
                InterfaceC772390URp.t0.LJFF(0L);
            }
            C20337914i1<Long> c20337914i12 = InterfaceC772390URp.t0;
            Long lLIZIZ2 = c20337914i12.LIZIZ();
            if (lLIZIZ2.longValue() < ((Number) this.LJII.getValue()).intValue()) {
                z = true;
                c20337914i12.LJFF(Long.valueOf(lLIZIZ2.longValue() + 1));
            }
            InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(context, uri, null, "shortTouchGamePartnershipDrops", null, true);
            if (interfaceC1085330eLjVd != null) {
                if (z) {
                    C1295960jpS c1295960jpS = new C1295960jpS(context);
                    C786410Ut5.s6(c1295960jpS, new LinearLayout.LayoutParams(C439101nJ.LIZ(70), C439101nJ.LIZ(70)));
                    this.LIZIZ = c1295960jpS;
                } else {
                    this.LIZIZ = null;
                }
                AnonymousClass0956 anonymousClass0956 = this.LIZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LIZ = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C445830He1(z, context, this, interfaceC1085330eLjVd, null), 3);
            }
            this.LIZLLL = true;
            if (!InterfaceC772390URp.q0.LIZIZ().booleanValue()) {
                EnumC1102750enp.SHARE.showRedDot(dataChannel);
            }
            C1878360yyo.LIZLLL("show", str2);
        }
    }
}
