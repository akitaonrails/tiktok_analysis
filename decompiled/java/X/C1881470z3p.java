package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.additional.GameInfoAdditionalCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.download.DownloadCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameinfo.GameInfoCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameProfileIntroCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms.GamePlatformsCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister.GamePreRegisterCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881470z3p extends AbstractC1882430z5N implements InterfaceC1581200rFW {
    public final long LLJILJILJ;
    public JSONObject LLJILLL;
    public boolean LLJJ;
    public volatile boolean LLJJI;
    public volatile RawGameDetailHomeResponse$ResponseData LLJJIII;
    public GameStationAttributionInfo LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public GameStationGameInfo LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C1881500z3s LLJJJJ;

    @Override // X.AbstractC1882430z5N
    public final void LJIIJ(Object obj, String str) {
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIIJJI(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
    }

    @Override // X.InterfaceC1581200rFW
    public final void d() {
        this.LLJJIII = null;
        this.LLJJ = false;
        LJJI();
    }

    public final void LJJI() {
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881550z3x(this, null), 2);
    }

    public final void LJJIFFI() {
        JSONObject jSONObject;
        try {
            Object objOpt = this.LLJILLL.opt("attribution_info");
            String strJ3 = null;
            if ((objOpt instanceof JSONObject) && (jSONObject = (JSONObject) objOpt) != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            this.LLJJIJI = (GameStationAttributionInfo) C293501Bt.LIZ().LJII(strJ3, GameStationAttributionInfo.class);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJII() {
        GameCTAInfo gameCTAInfo;
        GameCTAInfo gameCTAInfo2;
        try {
            Object objOpt = this.LLJILLL.opt("game_info");
            String strValueOf = String.valueOf(objOpt instanceof JSONObject ? (JSONObject) objOpt : null);
            boolean z = false;
            GameStationGameInfo gameStationGameInfo = (GameStationGameInfo) (strValueOf.length() != 0 ? C293501Bt.LIZ().LJIIIIZZ(strValueOf, new TypeToken<GameStationGameInfo>() { // from class: X.0z3u
            }.getType()) : null);
            this.LLJJIJIL = gameStationGameInfo;
            if (gameStationGameInfo != null) {
                C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(LJIIIZ()), "game_info", gameStationGameInfo);
            }
            GameStationGameInfo gameStationGameInfo2 = this.LLJJIJIL;
            if (gameStationGameInfo2 != null && (gameCTAInfo = gameStationGameInfo2.gameCtaInfo) != null && gameCTAInfo.ctaType == 1) {
                C1882410z5L c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(LJIIIZ());
                GameStationGameInfo gameStationGameInfo3 = this.LLJJIJIL;
                if (gameStationGameInfo3 != null && (gameCTAInfo2 = gameStationGameInfo3.gameCtaInfo) != null && gameCTAInfo2.isRegisteredUser) {
                    z = true;
                }
                C1882380z5I.LJI(c1882410z5LLJIIIIZZ, "is_registered_user", Boolean.valueOf(z));
            }
            C1882380z5I.LJI(LJIIIIZZ(), "page_type", C1880070z1Z.LIZIZ(LJIIIZ(), this.LLJJIJIL));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILIIL() {
        super.LJIILIIL();
        C1881500z3s c1881500z3s = this.LLJJJJ;
        if (c1881500z3s != null) {
            ((InterfaceC1880780z2i) this.LLJJJ.getValue()).LIZ(c1881500z3s);
            ((InterfaceC1880940z2y) this.LLJJJIL.getValue()).LIZ(c1881500z3s);
        }
        this.LLJJJJ = null;
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLJJJ.getValue());
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLJJJIL.getValue());
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLJJJ.getValue());
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLJJJIL.getValue());
        C1881500z3s c1881500z3s = new C1881500z3s(this);
        this.LLJJJJ = c1881500z3s;
        ((InterfaceC1880780z2i) this.LLJJJ.getValue()).LIZIZ(c1881500z3s);
        ((InterfaceC1880940z2y) this.LLJJJIL.getValue()).LIZIZ(c1881500z3s);
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        LJJI();
    }

    public final void LJIL(RawGameDetailHomeResponse$ResponseData rawGameDetailHomeResponse$ResponseData) {
        try {
            LJJII();
            LJJIFFI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameProfileMixPageHost", "parseRespDataJson error", e);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        String str = rawGameDetailHomeResponse$ResponseData.dsl;
        if (str == null) {
            str = "";
        }
        LJIJ(C1881030z37.LIZIZ(new C1881820z4O(str, this.LLJILLL)), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:63:0x015f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881470z3p.LJJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[PHI: r10
      0x0065: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:27:0x0063, B:25:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1581200rFW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r16) throws java.lang.Throwable {
        /*
            r15 = this;
            r4 = 0
            if (r16 == 0) goto L9f
            boolean r0 = r15.LLJJ
            if (r0 != 0) goto L9f
            com.bytedance.android.livesdk.game.model.GameStationAttributionInfo r0 = r15.LLJJIJI
            if (r0 == 0) goto L9f
            java.lang.String r0 = r0.viewThroughUrl
            r1 = 1
            if (r0 == 0) goto L9f
            int r0 = r0.length()
            if (r0 == 0) goto L9f
            r15.LLJJ = r1
            X.0z5L r1 = r15.LJII()
            java.lang.String r0 = "task_id"
            java.lang.String r6 = X.C1882380z5I.LJFF(r1, r0)
            X.0z5L r1 = r15.LJII()
            java.lang.String r0 = "room_id"
            java.lang.String r5 = X.C1882380z5I.LJFF(r1, r0)
            X.0z5L r1 = r15.LJII()
            java.lang.String r0 = "src_id"
            X.C1882380z5I.LJFF(r1, r0)
            X.0z5L r1 = r15.LJII()
            java.lang.String r0 = "site_id"
            X.C1882380z5I.LJFF(r1, r0)
            X.0X8u r2 = new X.0X8u
            com.bytedance.android.livesdk.game.model.GameStationAttributionInfo r0 = r15.LLJJIJI
            java.lang.String r11 = ""
            if (r0 == 0) goto L4a
            java.lang.String r3 = r0.viewThroughUrl
            if (r3 != 0) goto L4b
        L4a:
            r3 = r11
        L4b:
            long r0 = r15.LLJILJILJ
            java.lang.String r7 = java.lang.String.valueOf(r0)
            com.bytedance.android.livesdk.game.model.GameStationGameInfo r0 = r15.LLJJIJIL
            if (r0 == 0) goto L59
            java.lang.String r8 = r0.idStr
            if (r8 != 0) goto L5a
        L59:
            r8 = r11
        L5a:
            java.lang.String r9 = ""
            if (r0 == 0) goto L62
            java.lang.String r10 = r0.androidPackage
            if (r10 != 0) goto L65
        L62:
            r10 = r11
            if (r0 == 0) goto L6a
        L65:
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L6a
            r11 = r0
        L6a:
            X.0z3c r0 = r15.LJIIIZ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            java.lang.String r0 = "enter_from_id"
            java.lang.String r12 = X.C1882380z5I.LJFF(r1, r0)
            X.0z3c r0 = r15.LJIIIZ()
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            java.lang.String r0 = "promote_ad_type"
            java.lang.String r13 = X.C1882380z5I.LJFF(r1, r0)
            r14 = 2
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService) r0
            if (r0 == 0) goto L9f
            X.0X8s r1 = r0.Je0()
            if (r1 == 0) goto L9f
            android.content.Context r0 = r15.LL
            r1.LJIIL(r0, r2, r4)
        L9f:
            X.0z3c r0 = r15.LJIIIZ()
            X.0z5u r1 = r0.getEventCenter()
            java.lang.String r0 = "GameProfilePageShow"
            r1.LIZIZ(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881470z3p.f(boolean):void");
    }

    public C1881470z3p(long j, Context context) {
        super(context, "game_profile");
        this.LLJILJILJ = j;
        C1882380z5I.LJI(LJII(), "entrance_type", "game_profile");
        C1882380z5I.LJI(LJII(), "author_id", String.valueOf(j));
        C1882380z5I.LJI(LJII(), Scene.SCENE_SERVICE, 16);
        C1881880z4U c1881880z4ULJI = LJIIIZ().LJI();
        c1881880z4ULJI.LIZIZ("appinfo_card", GameInfoCard.class, null);
        c1881880z4ULJI.LIZIZ("appinfo_additional_card", GameInfoAdditionalCard.class, null);
        c1881880z4ULJI.LIZIZ("support_platforms_card", GamePlatformsCard.class, null);
        c1881880z4ULJI.LIZIZ("pre_register_card", GamePreRegisterCard.class, null);
        c1881880z4ULJI.LIZIZ("download_card", DownloadCard.class, null);
        c1881880z4ULJI.LIZIZ("profile_info_card", GameProfileIntroCard.class, null);
        c1881880z4ULJI.LIZIZ("videos_card", VideoFeedCard.class, null);
        c1881880z4ULJI.LIZIZ("live_card", GameLiveCard.class, null);
        C1882380z5I.LJI(LJII(), "log_extra", "{\"game_first_scene\":\"1005\",\"game_second_scene\":\"10050002\"}");
        this.LLJILLL = new JSONObject();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1884110z85());
        this.LLJJJ = C452501pT.LIZIZ(new C1881010z35(this));
        this.LLJJJIL = C452501pT.LIZIZ(new C1880990z33(this));
    }

    @Override // X.AbstractC1882430z5N, X.InterfaceC1882450z5P
    public final View LIZIZ(ViewGroup viewGroup, C1883300z6m c1883300z6m) {
        View viewLIZIZ = super.LIZIZ(viewGroup, c1883300z6m);
        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(400)), viewLIZIZ);
        return viewLIZIZ;
    }

    @Override // X.InterfaceC1581200rFW
    public final void g(Object obj, String str) {
        C1882380z5I.LJI(LJIIIIZZ(), str, obj);
    }
}
