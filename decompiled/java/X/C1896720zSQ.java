package X;

import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.touchpoint.core.experiment.IncentiveNewUserActivityConfig;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896720zSQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpecActServiceImpl LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C2189821An6 LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1896720zSQ(SpecActServiceImpl specActServiceImpl, Aweme aweme, String str, C2189821An6 c2189821An6, int i) {
        super(0);
        this.LL = specActServiceImpl;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = c2189821An6;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IWatchVideoService iWatchVideoService;
        String eventType;
        this.LL.LJ = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderFirstFrame ...");
        Aweme aweme = this.LL.LJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1895700zQm c1895700zQm = C1895700zQm.LIZ;
        Aweme aweme2 = this.LLILLJJLI;
        String str = this.LLILLL;
        C2189821An6 c2189821An6 = this.LLILZ;
        int i = this.LLILZIL;
        c1895700zQm.getClass();
        C1895700zQm.LIZIZ = null;
        C1895720zQo.LIZLLL();
        Iterator it2 = ((ArrayList) C1895720zQo.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1895740zQq) it2.next()).LJII();
        }
        C01GW<C1896490zS3> c01gw = C1896490zS3.LLJJIII;
        C1896490zS3 c1896490zS3LIZ = C739370SzP.LIZ();
        if (!c1896490zS3LIZ.LLILZ.isEmpty()) {
            c1896490zS3LIZ.LLJJ.LIZJ();
        }
        if (aweme2 != null && (Intrinsics.LJFF(C1895700zQm.LJ, "fyp") || Intrinsics.LJFF(C1895700zQm.LJ, "follow") || Intrinsics.LJFF(C1895700zQm.LJ, "popular") || Intrinsics.LJFF(C1895700zQm.LJ, "nearby"))) {
            Map<String, String> map = C1895700zQm.LIZJ;
            String str2 = (String) ((LinkedHashMap) map).get(C1895700zQm.LJ);
            if (str2 == null || str2.length() == 0) {
                String str3 = C1895700zQm.LJ;
                String aid = aweme2.getAid();
                if (aid == null) {
                    aid = "";
                }
                map.put(str3, aid);
            } else {
                String str4 = C1895700zQm.LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(',');
                sbLIZ2.append(aweme2.getAid());
                map.put(str4, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (aweme2 != null) {
            aweme2.getAid();
            Video video = aweme2.getVideo();
            if (video != null) {
                video.getDuration();
            }
        }
        if (aweme2 != null && (iWatchVideoService = (IWatchVideoService) PluggableExtentionKt.pluggableSpi$default(IWatchVideoService.class, false, false, false, 14, null)) != null) {
            C1895700zQm.LIZ.getClass();
            String strLIZ = C1895700zQm.LIZ(str);
            C1896810zSZ c1896810zSZ = new C1896810zSZ();
            c1896810zSZ.LIZ = C1896750zST.LIZIZ(i);
            if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
                eventType = "";
            }
            if (Intrinsics.LJFF(eventType, "paid_series_detail_page")) {
                c1896810zSZ.LIZ = "drama";
            }
            c1896810zSZ.LIZIZ = aweme2.isAd();
            c1896810zSZ.LIZJ = aweme2.getAwemeType();
            c1896810zSZ.LIZLLL = false;
            c1896810zSZ.LJII = aweme2.getVideo() != null ? r0.getDuration() : 0L;
            c1896810zSZ.LJ = strLIZ;
            String aid2 = aweme2.getAid();
            c1896810zSZ.LJIIJ = aid2 != null ? aid2 : "";
            iWatchVideoService.LIZLLL(c1896810zSZ);
        }
        C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
        SpecActPendantManager specActPendantManagerLIZ = C1894330zOZ.LIZ();
        if (specActPendantManagerLIZ.LL != null) {
            ArrayList<InterfaceC1896760zSU> arrayList = C1897010zSt.LIZ;
            InterfaceC1896860zSe interfaceC1896860zSeLJIIJJI = specActPendantManagerLIZ.LJIIJJI();
            if (interfaceC1896860zSeLJIIJJI != null && interfaceC1896860zSeLJIIJJI.isBound() && interfaceC1896860zSeLJIIJJI.isPendantShowing()) {
                C1897010zSt.LIZJ++;
                if (!C1897010zSt.LIZLLL || !C1897010zSt.LJ) {
                    Iterator<InterfaceC1896760zSU> it3 = C1897010zSt.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        InterfaceC1896760zSU next = it3.next();
                        if (!next.LIZLLL() && !(next instanceof C1897150zT7) && !(next instanceof C1897130zT5)) {
                            if (!next.LIZLLL()) {
                                if (!C1897010zSt.LIZLLL && next.LIZ(interfaceC1896860zSeLJIIJJI, C1897010zSt.LIZJ)) {
                                    C1897010zSt.LIZLLL = true;
                                    break;
                                }
                            } else if (!C1897010zSt.LJ && next.LIZ(interfaceC1896860zSeLJIIJJI, C1897010zSt.LIZJ)) {
                                C1897010zSt.LJ = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (C1893590zNN.LIZLLL) {
            C1893590zNN.LIZLLL = false;
            C1893590zNN.LIZJ = System.currentTimeMillis();
        }
        C1895040zPi.LIZLLL = true;
        if (C1895040zPi.LJ != null && !C1895040zPi.LIZJ) {
            C1895040zPi.LIZ();
        }
        this.LL.getClass();
        C1895760zQs.LL.init();
        if (!C1896740zSS.LIZIZ) {
            long jLongValue = ((Number) C267110AdR.LIZ.getValue()).longValue();
            if (jLongValue == -1) {
                jLongValue = ((Keva) C1896790zSX.LIZ.getValue()).getLong("key_first_launch_time", 0L);
            }
            if (System.currentTimeMillis() - jLongValue <= 86400000) {
                C01GW c01gw3 = C1896770zSV.LIZIZ;
                if (((IncentiveNewUserActivityConfig) c01gw3.getValue()).enableOnelinkPopupRequest || ((IncentiveNewUserActivityConfig) c01gw3.getValue()).enableOnelinkPopupCancel) {
                    TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("ug_incentive_onelink_retry", null, null, new AbstractC830880Wic() { // from class: X.0zSR
                        @Override // X.AbstractC830880Wic
                        public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                            String str5 = interfaceC805220ViK.LIZLLL().LIZIZ;
                            if (interfaceC805220ViK.LIZIZ() == EnumC1910390zoT.CepResult && Intrinsics.LJFF(interfaceC805220ViK.LIZJ(), Boolean.TRUE)) {
                                if (Intrinsics.LJFF(str5, "inc_request_onelink_popup")) {
                                    if (((IncentiveNewUserActivityConfig) C1896770zSV.LIZIZ.getValue()).enableOnelinkPopupRequest) {
                                        C1895370zQF.LIZIZ(C1895370zQF.LIZ, 17);
                                    }
                                } else if (Intrinsics.LJFF(str5, "inc_cancel_onelink_popup") && ((IncentiveNewUserActivityConfig) C1896770zSV.LIZIZ.getValue()).enableOnelinkPopupCancel) {
                                    C1896740zSS.LIZLLL = true;
                                }
                                C20684815ws.LJIILLIIL("incentive_strategy_execute_finish", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "ug_incentive_onelink_retry"), new Pair("key", str5)));
                                interfaceC805220ViK.LIZLLL().LIZ();
                            }
                        }

                        @Override // X.AbstractC830880Wic
                        public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                            if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                C1896740zSS.LIZ = interfaceC830890Wid;
                                C20684815ws.LJIILLIIL("incentive_strategy_register_success", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "ug_incentive_onelink_retry")));
                                for (Map.Entry entry : ((LinkedHashMap) C1896740zSS.LIZJ).entrySet()) {
                                    if (entry.getValue() != null) {
                                        C01U6.LIZIZ(new AwS546S0100000_2(entry, (Map.Entry<String, Map<String, String>>) 1051));
                                    }
                                }
                                ((LinkedHashMap) C1896740zSS.LIZJ).clear();
                                C1896740zSS.LIZIZ = true;
                            }
                        }
                    });
                }
            }
        }
        if (!C1896840zSc.LIZJ && ((Boolean) C286270BJx.LIZ.getValue()).booleanValue()) {
            C1896840zSc.LIZJ = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C01OU(null), 3);
        }
        return Unit.LIZ;
    }
}
