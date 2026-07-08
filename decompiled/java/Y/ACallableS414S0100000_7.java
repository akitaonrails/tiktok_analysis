package Y;

import X.C09BC;
import X.C0IHH;
import X.C0IJT;
import X.C0IS1;
import X.C0IS4;
import X.C0IT5;
import X.C0ITF;
import X.C0J0Q;
import X.C1058250de3;
import X.C1090000eTG;
import X.C1161920gLG;
import X.C19719512Dh;
import X.C1C7U;
import X.C2188811AlT;
import X.C293501Bt;
import X.C467220ITw;
import X.C474500IjA;
import X.EnumC1094630eaj;
import X.InterfaceC466570IRj;
import X.InterfaceC480510Isr;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.feed.LiveRecoInfoFeatureSetting;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import webcast.api.feed.SortStatsTag;

/* JADX INFO: loaded from: classes8.dex */
public class ACallableS414S0100000_7 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        Map concurrentHashMap;
        C1090000eTG c1090000eTGO3;
        C1C7U.LIZ("FeedLiveEpiDecisionFeatureManager@6f5c.updateEpiDecisions$1");
        for (Map.Entry entry : ((Map) aCallableS414S0100000_7.l0).entrySet()) {
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
            Object obj = null;
            if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, "feed_epi_decision", str)) != null) {
                obj = c1090000eTGO3.LIZJ;
            }
            if (!C19719512Dh.LJII(obj) || (concurrentHashMap = (Map) obj) == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
            concurrentHashMap.putAll(map);
            ILiveFeatureCenterService iLiveFeatureCenterService2 = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
            if (iLiveFeatureCenterService2 != null) {
                iLiveFeatureCenterService2.bg(C0J0Q.APP, str, concurrentHashMap, "feed_epi_decision", false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLiveEpiDecisionFeatureManager@6f5c.updateEpiDecisions$1");
        return unit;
    }

    public static final Object call$1(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        Map concurrentHashMap;
        String str;
        LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig;
        C1090000eTG c1090000eTGO3;
        C1C7U.LIZ("LiveFeedRecInfoManager@aada.updateRecoInfo$1");
        for (Map.Entry entry : ((Map) aCallableS414S0100000_7.l0).entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList<LiveRoomStatesTag> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Map) C0ITF.LIZIZ.getValue()).containsKey(((LiveRoomStatesTag) obj).tagKey)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                Object obj2 = null;
                if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, "feed_service_sort", str2)) != null) {
                    obj2 = c1090000eTGO3.LIZJ;
                }
                if (!C19719512Dh.LJII(obj2) || (concurrentHashMap = (Map) obj2) == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                for (LiveRoomStatesTag liveRoomStatesTag : arrayList) {
                    String str3 = liveRoomStatesTag.tagKey;
                    if (str3 != null && (str = liveRoomStatesTag.tagValue) != null && (recoInfoFeatureSaveConfig = (LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig) ((Map) C0ITF.LIZIZ.getValue()).get(str3)) != null) {
                        if (recoInfoFeatureSaveConfig.getFeatureSaveEnable()) {
                            concurrentHashMap.put(recoInfoFeatureSaveConfig.getRecoInfoKey(), str);
                        }
                        try {
                            n nVar = (n) C293501Bt.LIZ().LJII(str, n.class);
                            for (String str4 : recoInfoFeatureSaveConfig.getSubFeatureSaveList()) {
                                String strLJIL = nVar.LJJIIZ(str4).LJIL();
                                if (strLJIL.length() > 0) {
                                    concurrentHashMap.put(str4, strLJIL);
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                ILiveFeatureCenterService iLiveFeatureCenterService2 = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                if (iLiveFeatureCenterService2 != null) {
                    iLiveFeatureCenterService2.bg(C0J0Q.APP, str2, concurrentHashMap, "feed_service_sort", false);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveFeedRecInfoManager@aada.updateRecoInfo$1");
        return unit;
    }

    public static final Object call$2(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        Map concurrentHashMap;
        C1090000eTG c1090000eTGO3;
        C1C7U.LIZ("LiveRecoInfoManager@8a3b.updateRecoInfo$1");
        for (Map.Entry entry : ((Map) aCallableS414S0100000_7.l0).entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList<SortStatsTag> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Map) C0IT5.LIZIZ.getValue()).containsKey(((SortStatsTag) obj).key)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                Object obj2 = null;
                if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, "service_sort", str)) != null) {
                    obj2 = c1090000eTGO3.LIZJ;
                }
                if (!C19719512Dh.LJII(obj2) || (concurrentHashMap = (Map) obj2) == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                for (SortStatsTag sortStatsTag : arrayList) {
                    String str2 = sortStatsTag.key;
                    String str3 = sortStatsTag.value;
                    LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig = (LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig) ((Map) C0IT5.LIZIZ.getValue()).get(str2);
                    if (recoInfoFeatureSaveConfig != null) {
                        if (recoInfoFeatureSaveConfig.getFeatureSaveEnable()) {
                            concurrentHashMap.put(recoInfoFeatureSaveConfig.getRecoInfoKey(), str3);
                        }
                        try {
                            n nVar = (n) C293501Bt.LIZ().LJII(str3, n.class);
                            for (String str4 : recoInfoFeatureSaveConfig.getSubFeatureSaveList()) {
                                String strLJIL = nVar.LJJIIZ(str4).LJIL();
                                if (strLJIL.length() > 0) {
                                    concurrentHashMap.put(str4, strLJIL);
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                ILiveFeatureCenterService iLiveFeatureCenterService2 = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                if (iLiveFeatureCenterService2 != null) {
                    iLiveFeatureCenterService2.bg(C0J0Q.APP, str, concurrentHashMap, "service_sort", false);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecoInfoManager@8a3b.updateRecoInfo$1");
        return unit;
    }

    public static final Object call$3(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        InterfaceC480510Isr interfaceC480510Isr = (InterfaceC480510Isr) aCallableS414S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        C1C7U.LIZ("LivePlayFragment@afba.captureFrameBitmap$1L");
        C0IHH c0ihh = new C0IHH(C09BC.LIZ(0.5f, interfaceC480510Isr.LJIJI(true)));
        C1C7U.LIZIZ("LivePlayFragment@afba.captureFrameBitmap$1L");
        return c0ihh;
    }

    public static final Object call$4(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        InterfaceC480510Isr interfaceC480510Isr = (InterfaceC480510Isr) aCallableS414S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        C1C7U.LIZ("LivePlayFragment@afba.captureFrameBitmapWithBlackFrameCheck$1L");
        Bitmap bitmapLJIJI = interfaceC480510Isr.LJIJI(true);
        int width = bitmapLJIJI.getWidth();
        int height = bitmapLJIJI.getHeight();
        if (width > 0 && height > 0) {
            int iMax = (int) Math.max(64, (long) (((long) width) * ((long) height) * 0.025d));
            int iSqrt = (int) Math.sqrt((((double) iMax) * ((double) width)) / ((double) height));
            if (iSqrt < 1) {
                iSqrt = 1;
            }
            int i = width / iSqrt;
            if (i < 1) {
                i = 1;
            }
            int i2 = iMax / (width / i);
            if (i2 < 1) {
                i2 = 1;
            }
            int iMax2 = Math.max(1, i2);
            int[] iArr = new int[width];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i4 < iMax) {
                int i6 = i5;
                int[] iArr2 = iArr;
                bitmapLJIJI.getPixels(iArr, 0, width, 0, i5, width, 1);
                int i7 = 0;
                while (i4 < iMax) {
                    int i8 = iArr2[i7];
                    if ((((((i8 >>> 16) & 255) * 30) + (((i8 >>> 8) & 255) * 59)) + ((i8 & 255) * 11)) / 100 <= 20) {
                        i3++;
                    }
                    i4++;
                    i7 += i;
                    if (i7 >= width) {
                        break;
                    }
                }
                i5 = i6 + iMax2;
                iArr = iArr2;
                if (i5 >= height) {
                    break;
                }
            }
            if (i4 != 0 && ((double) i3) / ((double) i4) < 0.95d) {
                C0IHH c0ihh = new C0IHH(C09BC.LIZ(0.5f, bitmapLJIJI));
                C1C7U.LIZIZ("LivePlayFragment@afba.captureFrameBitmapWithBlackFrameCheck$1L");
                return c0ihh;
            }
        }
        C0IHH c0ihh2 = new C0IHH(null);
        C1C7U.LIZIZ("LivePlayFragment@afba.captureFrameBitmapWithBlackFrameCheck$1L");
        return c0ihh2;
    }

    public static final Object call$5(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        Object objLIZLLL;
        String str;
        C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.reportSummary$1");
        try {
            objLIZLLL = C1058250de3.LIZLLL((Map) aCallableS414S0100000_7.l0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error when encode summary: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            objLIZLLL = Unit.LIZ;
        }
        LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline2 = LiveInnerFlowDowngradePipeline.LIZ;
        Objects.toString(objLIZLLL);
        boolean zZK2 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).ZK2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_unify_downgrade_event");
        c474500IjALIZ.LJJII(objLIZLLL, "downgrade_summary_info");
        c474500IjALIZ.LJJII("inner_room_downgrade_scene", Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII("3", "report_type");
        if (LiveInnerFlowDowngradePipeline.LJIJJ) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "default_status");
        c474500IjALIZ.LJJII(Integer.valueOf(LiveInnerFlowDowngradePipeline.LJIJJLI), "status_change_count");
        c474500IjALIZ.LJJII(Integer.valueOf(zZK2 ? 1 : 0), "bright_changed_manual");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.reportSummary$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$6(ACallableS414S0100000_7 aCallableS414S0100000_7) {
        Object obj;
        int iLongValue;
        InterfaceC466570IRj interfaceC466570IRj;
        Long l;
        C1C7U.LIZ("LiveUltraLiteModeManager@c4c7.playerDowngradeAction$1$onDowngradeStatusChanged$1");
        Map<String, ? extends Object> map = ((C0IS4) aCallableS414S0100000_7.l0).LIZJ;
        Unit unit = null;
        if (map != null) {
            obj = map.get("result_new_single_level");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        C0IS1<InterfaceC466570IRj> c0is1 = C467220ITw.LJ;
        if (c0is1 != null && (interfaceC466570IRj = (InterfaceC466570IRj) c0is1.LIZLLL()) != null) {
            interfaceC466570IRj.LIZ(((Number) ((C0IS4) aCallableS414S0100000_7.l0).LIZ).intValue(), iLongValue, GsonProtectorUtils.toJson(C293501Bt.LIZ(), ((C0IS4) aCallableS414S0100000_7.l0).LIZJ));
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("LiveUltraLiteModeManager@c4c7.playerDowngradeAction$1$onDowngradeStatusChanged$1");
        return unit;
    }

    public ACallableS414S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
