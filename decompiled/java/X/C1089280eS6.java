package X;

import Y.AfS182S0100000_13;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.clientstrategy.StrategyParamsApi;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import com.bytedance.android.livesdk.signal.LiveEpiExpandLifecycleSetting;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS596S0100000_17;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089280eS6 {
    public final InterfaceC1089270eS5 LIZ;
    public long LIZIZ;
    public final C1089290eS7 LIZJ;
    public final C1089870eT3 LIZLLL;
    public C11JF LJFF;
    public C11JF LJI;
    public final String LJIIIIZZ;
    public boolean LJ = true;
    public final ILiveDecisionService LJII = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);

    public final UploadFeatureRequest LIZ() {
        AbstractC1088350eQb abstractC1088350eQb;
        Map<String, String> mapLJI;
        Object objLIZ;
        AbstractC1088350eQb abstractC1088350eQb2;
        Map<String, String> mapLJI2;
        UploadFeatureRequest uploadFeatureRequest = new UploadFeatureRequest();
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            LIZJ((List) this.LIZLLL.LJIIIIZZ.getValue(), uploadFeatureRequest.userAction);
            LIZJ((List) this.LIZLLL.LJIIIZ.getValue(), uploadFeatureRequest.baseInfo);
            LIZJ((List) this.LIZLLL.LJIIJ.getValue(), uploadFeatureRequest.performance);
            LIZJ((List) this.LIZLLL.LJIIJJI.getValue(), uploadFeatureRequest.userProfile);
            LIZJ((List) this.LIZLLL.LJIIL.getValue(), uploadFeatureRequest.roomFeature);
            Iterator<T> it2 = this.LIZ.LIZLLL().iterator();
            while (it2.hasNext()) {
                C443120HZe c443120HZe = (C443120HZe) it2.next();
                Object obj = (AbstractC1089300eS8) c443120HZe.getThird();
                if (obj instanceof AbstractC1088350eQb) {
                    if (obj instanceof InterfaceC1088470eQn) {
                        objLIZ = ((InterfaceC1088470eQn) obj).LIZ();
                    } else {
                        C1090000eTG c1090000eTGO3 = this.LJII.O3(EnumC1094630eaj.DEFAULT, EnumC467180ITs.EPI.getGroupName(), ((AbstractC1089300eS8) c443120HZe.getThird()).LL.LIZ);
                        if (c1090000eTGO3 != null) {
                            objLIZ = c1090000eTGO3.LIZJ;
                        }
                    }
                    if (objLIZ != null && (mapLJI2 = (abstractC1088350eQb2 = (AbstractC1088350eQb) obj).LJI(uploadFeatureRequest)) != null) {
                        mapLJI2.put(abstractC1088350eQb2.LL.LIZ, objLIZ.toString());
                    }
                }
            }
        } else {
            Map<String, Object> mapLJII = this.LIZ.LJII();
            LIZIZ((List) this.LIZLLL.LJIIIIZZ.getValue(), mapLJII, uploadFeatureRequest.userAction);
            LIZIZ((List) this.LIZLLL.LJIIIZ.getValue(), mapLJII, uploadFeatureRequest.baseInfo);
            LIZIZ((List) this.LIZLLL.LJIIJ.getValue(), mapLJII, uploadFeatureRequest.performance);
            LIZIZ((List) this.LIZLLL.LJIIJJI.getValue(), mapLJII, uploadFeatureRequest.userProfile);
            LIZIZ((List) this.LIZLLL.LJIIL.getValue(), mapLJII, uploadFeatureRequest.roomFeature);
            Iterator<T> it3 = this.LIZ.LIZLLL().iterator();
            while (it3.hasNext()) {
                C443120HZe c443120HZe2 = (C443120HZe) it3.next();
                Object obj2 = (AbstractC1089300eS8) c443120HZe2.getThird();
                if (obj2 instanceof AbstractC1088350eQb) {
                    Object objLIZ2 = obj2 instanceof InterfaceC1088470eQn ? ((InterfaceC1088470eQn) obj2).LIZ() : mapLJII.get(((AbstractC1089300eS8) c443120HZe2.getThird()).LL.LIZ);
                    if (objLIZ2 != null && (mapLJI = (abstractC1088350eQb = (AbstractC1088350eQb) obj2).LJI(uploadFeatureRequest)) != null) {
                        mapLJI.put(abstractC1088350eQb.LL.LIZ, objLIZ2.toString());
                    }
                }
            }
        }
        return uploadFeatureRequest;
    }

    public final void LIZLLL(boolean z) {
        InterfaceC420801kM interfaceC420801kMLJJLL;
        IBroadcastService iBroadcastService;
        boolean zLJI = MethodIDManager.LJI(137683);
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            C1089290eS7 c1089290eS7 = this.LIZJ;
            String str = this.LJIIIIZZ;
            UploadFeatureRequest uploadFeatureRequestLIZ = LIZ();
            if (!((ArrayList) c1089290eS7.LIZJ).isEmpty()) {
                uploadFeatureRequestLIZ.roomFeature.put("strategy_state", C1089290eS7.LIZJ(c1089290eS7.LIZJ));
                ((ArrayList) c1089290eS7.LIZJ).clear();
            }
            if ((!c1089290eS7.LIZ || C1089290eS7.LIZIZ(uploadFeatureRequestLIZ, c1089290eS7.LIZIZ)) && ((iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)) == null || !iBroadcastService.isBackgroundPauseRequest())) {
                c1089290eS7.LIZIZ = uploadFeatureRequestLIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(uploadFeatureRequestLIZ.userAction);
                linkedHashMap.putAll(uploadFeatureRequestLIZ.baseInfo);
                linkedHashMap.putAll(uploadFeatureRequestLIZ.performance);
                linkedHashMap.putAll(uploadFeatureRequestLIZ.userProfile);
                linkedHashMap.putAll(uploadFeatureRequestLIZ.roomFeature);
                linkedHashMap.putAll(uploadFeatureRequestLIZ.bizParams);
                C0J6B.LIZ(str, linkedHashMap);
            }
            if (this.LJ && z) {
                LJ(this.LIZIZ, true);
            }
        } else {
            C1089290eS7 c1089290eS72 = this.LIZJ;
            UploadFeatureRequest uploadFeatureRequestLIZ2 = LIZ();
            AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 584);
            c1089290eS72.getClass();
            boolean zLJI2 = MethodIDManager.LJI(202182);
            if (!((ArrayList) c1089290eS72.LIZJ).isEmpty()) {
                uploadFeatureRequestLIZ2.roomFeature.put("strategy_state", C1089290eS7.LIZJ(c1089290eS72.LIZJ));
                ((ArrayList) c1089290eS72.LIZJ).clear();
            }
            if (c1089290eS72.LIZ && !C1089290eS7.LIZIZ(uploadFeatureRequestLIZ2, c1089290eS72.LIZIZ)) {
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            } else {
                IBroadcastService iBroadcastService2 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                if (iBroadcastService2 != null && iBroadcastService2.isBackgroundPauseRequest()) {
                    if (zLJI2) {
                        MethodIDManager.LJ();
                    }
                } else {
                    c1089290eS72.LIZIZ = uploadFeatureRequestLIZ2;
                    C480460Ism.LIZ().getClass();
                    interfaceC420801kMLJJLL = ((StrategyParamsApi) C480460Ism.LIZLLL(StrategyParamsApi.class)).upload(uploadFeatureRequestLIZ2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS182S0100000_13(awS596S0100000_17, 109), new C09JN() { // from class: X.00ms
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("StrategyParamsUploader@5f8c.uploadParams$2");
                            C1CC2.LIZ("strategyParams_uploader_error", (Throwable) obj);
                            C1C7U.LIZIZ("StrategyParamsUploader@5f8c.uploadParams$2");
                        }
                    });
                    if (zLJI2) {
                        MethodIDManager.LJ();
                    }
                    this.LJI = (C11JF) interfaceC420801kMLJJLL;
                    if (this.LJ && z) {
                        LJ(this.LIZIZ, true);
                    }
                }
            }
            interfaceC420801kMLJJLL = null;
            this.LJI = (C11JF) interfaceC420801kMLJJLL;
            if (this.LJ) {
                LJ(this.LIZIZ, true);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZJ(List<String> list, Map<String, String> map) {
        C1090000eTG c1090000eTGO3;
        Object obj;
        for (String str : list) {
            ILiveDecisionService iLiveDecisionService = this.LJII;
            EnumC1094630eaj enumC1094630eaj = EnumC1094630eaj.DEFAULT;
            C1090000eTG c1090000eTGO32 = iLiveDecisionService.O3(enumC1094630eaj, EnumC467180ITs.EPI.getGroupName(), str);
            if ((c1090000eTGO32 != null && (obj = c1090000eTGO32.LIZJ) != null) || ((c1090000eTGO3 = this.LJII.O3(enumC1094630eaj, EnumC467180ITs.DEFAULT.getGroupName(), str)) != null && (obj = c1090000eTGO3.LIZJ) != null)) {
                map.put(str, obj.toString());
            }
        }
    }

    public final void LJ(long j, final boolean z) {
        C11JF c11jf = this.LJFF;
        if (c11jf != null && !c11jf.isDisposed()) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
        this.LJFF = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0eSg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("StrategyParamsUploadController@5298.uploadScheduleNext$1");
                this.LL.LIZLLL(z);
                C1C7U.LIZIZ("StrategyParamsUploadController@5298.uploadScheduleNext$1");
            }
        }, new C09JN() { // from class: X.0eSc
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("StrategyParamsUploadController@5298.uploadScheduleNext$2");
                C1CC2.LIZ("adapt strategy timer error", (Throwable) obj);
                C1C7U.LIZIZ("StrategyParamsUploadController@5298.uploadScheduleNext$2");
            }
        });
    }

    public final void LIZIZ(List<String> list, Map<String, ? extends Object> map, Map<String, String> map2) {
        Object objLIZ;
        for (String str : list) {
            Object objLIZIZ = this.LIZ.LIZIZ(str);
            if (objLIZIZ != null) {
                if (objLIZIZ instanceof AbstractC1088350eQb) {
                    if (objLIZIZ instanceof InterfaceC1088470eQn) {
                        objLIZ = ((InterfaceC1088470eQn) objLIZIZ).LIZ();
                    } else {
                        objLIZ = map.get(str);
                    }
                }
            } else {
                objLIZ = map.get(str);
            }
            if (objLIZ != null) {
                map2.put(str, objLIZ.toString());
            }
        }
    }

    public C1089280eS6(boolean z, InterfaceC1089270eS5 interfaceC1089270eS5, long j, C1089290eS7 c1089290eS7, C1089870eT3 c1089870eT3) {
        String str;
        this.LIZ = interfaceC1089270eS5;
        this.LIZIZ = j;
        this.LIZJ = c1089290eS7;
        this.LIZLLL = c1089870eT3;
        if (z) {
            str = "epi_host_trigger";
        } else {
            str = "epi_trigger";
        }
        this.LJIIIIZZ = str;
    }
}
