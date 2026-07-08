package X;

import Y.AObjectS245S0100000_22;
import android.content.Context;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.switchmode.payload.MixEditingMaterialItemPayload;
import com.ss.android.ugc.aweme.image.switchmode.payload.MixEditingMaterialPayload;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicLogIdInput;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.FromAssetInfo;
import com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414720mv0 extends AbstractC2255721DQs<InterfaceC1413730mtP> implements InterfaceC379610EuV, InterfaceC1413730mtP {
    public static final C1414790mv7 LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1414800mv8 LLILLL;
    public volatile InterfaceC1414530muh LLJJIJI;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJLIIL;
    public final h0<Boolean> LLILZ = new h0<>(Boolean.FALSE);
    public final h0<Boolean> LLILZIL = new h0<>(Boolean.TRUE);
    public final h0<List<C1412800mru>> LLILZLL = new h0<>(C13BV.INSTANCE);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1635410sex.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1410280mnq.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), C1439810nZT.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1203040hPa.class, null);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 615));
    public final h0<String> LLJILJIL = new h0<>(null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1414530muh.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C1412740mro.class, null);
    public final AtomicReference<C1406430mhd> LLJJIJIIJIL = new AtomicReference<>(null);
    public final AtomicReference<Boolean> LLJJIJIL = new AtomicReference<>(null);
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 614));
    public final boolean LLJJJJJIL = C2263008to.LIZ();
    public final InterfaceC2188711AlJ LLJJL = new InterfaceC2188711AlJ() { // from class: X.0mv3
        @Override // X.InterfaceC2188711AlJ
        public final void LIZ(C1768270w7F c1768270w7F) {
            C1414720mv0 c1414720mv0 = this.LIZ;
            c1414720mv0.LLJJJJLIIL = true;
            c1414720mv0.P4("isLowMemory");
        }
    };

    private final void T4() {
        if (!this.LLILZLL.LIZJ().isEmpty()) {
            this.LLILZLL.LJII(C13BV.INSTANCE);
            K4(false);
            zf1(false, true, false, false, null);
        }
    }

    public InterfaceC1413730mtP T2() {
        return this;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (this.LLJJJJ) {
            this.LLJJJJ = false;
            P4("onResume fetchPanelData again");
            zf1(false, false, true, false, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0mv7] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1414720mv0.class, "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1414720mv0.class, "switchModeSwitchPayloadProviderApi", "getSwitchModeSwitchPayloadProviderApi()Lcom/ss/android/ugc/aweme/image/switchmode/payload/ImageModeSwitchPayloadProviderApi;", 0), new C2217381BqS(C1414720mv0.class, "imageEditData", "getImageEditData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0), new C2217381BqS(C1414720mv0.class, "scheduleTaskDelegateLogicApi", "getScheduleTaskDelegateLogicApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ScheduleTaskDelegateLogicApi;", 0), new C2217381BqS(C1414720mv0.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1414720mv0.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1414720mv0.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C1414720mv0.class, "mixEditingAssetsApi", "getMixEditingAssetsApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0), new C2217381BqS(C1414720mv0.class, "videoPicCountHolder", "getVideoPicCountHolder()Lcom/ss/android/ugc/gamora/editor/mixediting/eventtrack/MixEditingCurrentEditModelVideoPicCountHolder;", 0)};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0mv7
        };
        LLJLIL = 8;
    }

    private final void H2() {
        C01TT.LIZIZ(3000L, new AwS566S0100000_22(this, 616));
    }

    private final InterfaceC1203040hPa H3() {
        return (InterfaceC1203040hPa) this.LLJI.getValue(this, LLJL[3]);
    }

    private final InterfaceC1410280mnq O3() {
        return (InterfaceC1410280mnq) this.LLIZLLLIL.getValue(this, LLJL[1]);
    }

    private final List<Integer> X1() {
        ArrayList arrayList = new ArrayList();
        if (!C1417160myw.LJIJJ(null, getEditModel())) {
            arrayList.add(Integer.valueOf(AssetType.CAPCUT_TEMPLATE.getValue()));
            arrayList.add(Integer.valueOf(AssetType.AUTOCUT_AI_TEMPLATE_V2.getValue()));
        }
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c1414930mvL.getClass();
        MixEditingPathKeys mixEditingPathKeysLJIIJJI = C1414930mvL.LJIIJJI(editModel);
        if (!C1414940mvM.LIZIZ()) {
            arrayList.add(Integer.valueOf(AssetType.AIGT.getValue()));
        }
        List<Integer> list = mixEditingPathKeysLJIIJJI.filterAssetTypeList;
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : list) {
            if (!arrayList.contains(Integer.valueOf(num.intValue()))) {
                arrayList2.add(num);
            }
        }
        arrayList.addAll(arrayList2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private final boolean c3() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    private final C1439810nZT v3() {
        return (C1439810nZT) this.LLJ.getValue(this, LLJL[2]);
    }

    public final InterfaceC1414530muh B3() {
        return (InterfaceC1414530muh) this.LLJJI.getValue(this, LLJL[7]);
    }

    public final String E3() {
        if (!((Boolean) C265390Aaf.LIZ.getValue()).booleanValue()) {
            return null;
        }
        if (C1697810uHb.LJIIJJI("single_song", "shoot_page_recommend", "shoot_page_recommend_favourite", "shoot_page_recent", "shoot_page_search", "edit_page_recommend", "edit_page_recommend_favourite", "edit_page_recent", "edit_page_search").contains(getEditModel().getMusicOrigin())) {
            return getEditModel().getMusicId();
        }
        return null;
    }

    public final boolean F4() {
        if (this.LLJJJJLIIL) {
            return true;
        }
        C844470XAv.LIZ.getClass();
        return C2188561Al4.LJIIJ(C844470XAv.LIZ());
    }

    public final void O4() {
        this.LLILZ.LJFF(Boolean.FALSE);
        List<C1412800mru> listLIZJ = this.LLILZLL.LIZJ();
        if (listLIZJ == null || listLIZJ.isEmpty()) {
            K4(false);
        }
    }

    public final C1414840mvC W2() {
        return (C1414840mvC) this.LLJJJ.getValue();
    }

    public final List<FromAssetInfo> Z1() {
        ArrayList arrayList = new ArrayList();
        String musicId = getEditModel().getMusicId();
        if (Intrinsics.LJFF(getEditModel().creativeModel.musicBuzModel.musicOrigin, "single_song") && musicId != null && musicId.length() != 0) {
            arrayList.add(new FromAssetInfo(musicId, 3));
        }
        String str = getEditModel().fromPropId;
        if (getEditModel().isDefaultProp && str != null && str.length() != 0) {
            arrayList.add(new FromAssetInfo(str, 1));
        }
        C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(getEditModel());
        boolean z = Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LIZJ) || Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJ) || Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LIZLLL) || Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LIZIZ) || Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJIILL);
        boolean zLJFF = Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJI);
        boolean zLJFF2 = Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJIIJ);
        String strLJJIJ = C1416310mxZ.LJJIJ(getEditModel(), false);
        if ((z || zLJFF || zLJFF2) && strLJJIJ != null && strLJJIJ.length() != 0) {
            arrayList.add(new FromAssetInfo(strLJJIJ, 2));
        }
        return arrayList;
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJL[4]);
    }

    public final InterfaceC1453200nv4 i3() {
        return (InterfaceC1453200nv4) this.LLJJ.getValue(this, LLJL[6]);
    }

    public final InterfaceC1455860nzM m3() {
        return (InterfaceC1455860nzM) this.LLJILLL.getValue(this, LLJL[5]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r5.add(new com.ss.android.ugc.effectmanager.effect.model.FromAssetInfo(r3, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        r5.add(new com.ss.android.ugc.effectmanager.effect.model.FromAssetInfo(r3, 1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.effectmanager.effect.model.FromAssetInfo> o2() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414720mv0.o2():java.util.List");
    }

    public final C1412740mro o4() {
        return (C1412740mro) this.LLJJIII.getValue(this, LLJL[8]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1415760mwg interfaceC1415760mwg;
        InterfaceC1415760mwg interfaceC1415760mwg2;
        C385670FAf<SwitchModePayload> c385670FAfB31;
        C1414720mv0 c1414720mv0 = this;
        super.onCreate();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            C579830Mof.LIZIZ(c1414720mv0.getDiContainer(), InterfaceC1414530muh.class, new AwS601S0100000_22(c1414720mv0, 419));
        }
        InterfaceC1410280mnq interfaceC1410280mnqO3 = c1414720mv0.O3();
        SwitchModePayload switchModePayloadLIZJ = (interfaceC1410280mnqO3 == null || (c385670FAfB31 = interfaceC1410280mnqO3.B31()) == null) ? null : c385670FAfB31.LIZJ();
        if (c1414720mv0.LLILLL.LIZIZ) {
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "MixEditingMaterialComponent", "onCreate -> don't fetchPanelData, only fetch data when fetchPanelData is called");
            c1414720mv0.Z4();
        } else if (c1414720mv0.H4()) {
            C1414740mv2 c1414740mv2 = C1414040mtu.LIZ;
            if (c1414740mv2 != null) {
                c1414720mv0.LLILZLL.LJFF(c1414740mv2.LIZ);
                c1414720mv0.LLILZIL.LJFF(Boolean.valueOf(c1414740mv2.LIZIZ));
                c1414720mv0.LLJJJIL = c1414740mv2.LIZJ;
                c1414720mv0.LLJILJIL.LJFF(c1414740mv2.LIZLLL);
            }
            C201955140j.LIZJ(C0MJ8.LIZIZ, "clearLastMixEditingInfo");
            C1414040mtu.LIZ = null;
            C1414620muq c1414620muq = C1414620muq.LIZ;
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1414720mv0, 621);
            c1414620muq.getClass();
            C1414620muq.LIZIZ(0L, 0, null, null, awS566S0100000_22);
            if (c1414720mv0.getEditModel().creativeModel.imageEditModel.fromBenchmark) {
                if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                    InterfaceC1414530muh interfaceC1414530muh = c1414720mv0.LLJJIJI;
                    if (!(interfaceC1414530muh instanceof InterfaceC1415760mwg) || interfaceC1414530muh == null) {
                        c1414720mv0.LLJJIJIIJIL.set(new C1406430mhd(null, null));
                    } else {
                        interfaceC1414530muh.tC(true);
                    }
                } else {
                    InterfaceC1414530muh interfaceC1414530muhB3 = c1414720mv0.B3();
                    if ((interfaceC1414530muhB3 instanceof InterfaceC1415760mwg) && interfaceC1414530muhB3 != null) {
                        interfaceC1414530muhB3.tC(true);
                    }
                }
            }
        } else if (switchModePayloadLIZJ instanceof MixEditingMaterialPayload) {
            h0<List<C1412800mru>> h0Var = c1414720mv0.LLILZLL;
            MixEditingMaterialPayload mixEditingMaterialPayload = (MixEditingMaterialPayload) switchModePayloadLIZJ;
            List<MixEditingMaterialItemPayload> list = mixEditingMaterialPayload.mixEditingDataList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (MixEditingMaterialItemPayload mixEditingMaterialItemPayload : list) {
                arrayList.add(new C1412800mru(mixEditingMaterialItemPayload.type, mixEditingMaterialItemPayload.name, mixEditingMaterialItemPayload.icon, mixEditingMaterialItemPayload.originAsset, null, mixEditingMaterialItemPayload.fromRecommend, null, null, null, false, null, 0, null, false, null, null, 65488));
            }
            h0Var.LJII(arrayList);
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                InterfaceC1414530muh interfaceC1414530muh2 = c1414720mv0.LLJJIJI;
                if (!(interfaceC1414530muh2 instanceof InterfaceC1415760mwg) || (interfaceC1415760mwg2 = (InterfaceC1415760mwg) interfaceC1414530muh2) == null) {
                    c1414720mv0.LLJJIJIIJIL.set(new C1406430mhd(Integer.valueOf(mixEditingMaterialPayload.bottomMargin), Integer.valueOf(mixEditingMaterialPayload.selectedIndex)));
                } else {
                    interfaceC1415760mwg2.tC(true);
                    interfaceC1415760mwg2.Bd(mixEditingMaterialPayload.bottomMargin);
                    interfaceC1415760mwg2.i01(mixEditingMaterialPayload.selectedIndex);
                }
            } else {
                InterfaceC1414530muh interfaceC1414530muhB32 = c1414720mv0.B3();
                if ((interfaceC1414530muhB32 instanceof InterfaceC1415760mwg) && (interfaceC1415760mwg = (InterfaceC1415760mwg) interfaceC1414530muhB32) != null) {
                    interfaceC1415760mwg.tC(true);
                    interfaceC1415760mwg.Bd(mixEditingMaterialPayload.bottomMargin);
                    interfaceC1415760mwg.i01(mixEditingMaterialPayload.selectedIndex);
                }
            }
        } else {
            if (c1414720mv0.c3()) {
                c1414720mv0.Z4();
            }
            if (c1414720mv0.c3()) {
                C1414930mvL c1414930mvL = C1414930mvL.LIZ;
                VideoPublishEditModel editModel = c1414720mv0.getEditModel();
                c1414930mvL.getClass();
                if ((C1414930mvL.LJIIJJI(editModel).delayShowContainer == 1 || ((Number) C288120BRa.LIZ.getValue()).intValue() == 1) && ((!((Boolean) C2268308uf.LIZ.getValue()).booleanValue() || !C263180ATc.LIZ()) && !((Boolean) C2268408ug.LIZ.getValue()).booleanValue())) {
                    VideoPublishEditModel editModel2 = c1414720mv0.getEditModel();
                    Set<String> setLIZIZ = C2295608z4.LIZIZ();
                    if (editModel2 != null && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_enable_extract_visual_features", true, false)) {
                        String str = editModel2.mShootWay;
                        String strLJIILIIL = C1428470nHB.LJIILIIL(editModel2);
                        List<C2262608tk> listLIZ = C0MH3.LIZ(editModel2, Intrinsics.LJFF("list", "list"));
                        if (listLIZ != null) {
                            ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIIIIZZ(listLIZ, setLIZIZ, new C2263508tt(str, strLJIILIIL, null, 12));
                        }
                    }
                }
            } else {
                c1414720mv0 = c1414720mv0;
                c1414720mv0.zf1(false, false, true, false, null);
            }
        }
        c1414720mv0.o4().LIZIZ(c1414720mv0.getEditModel());
        ConcurrentHashMap<String, InterfaceC1412480mrO> concurrentHashMap = C1412510mrR.LIZ;
        C1412510mrR.LIZ.put("mix_sync_page_recommend", new InterfaceC1412480mrO() { // from class: X.0mrW
            public static final Map<String, String> LIZ = new LinkedHashMap();

            @Override // X.InterfaceC1412480mrO
            public final String LIZ(ShortVideoContext shortVideoContext) {
                String str2 = shortVideoContext.creativeModel.mixEditingModel.requestId;
                if (str2 == null) {
                    return "";
                }
                return str2;
            }

            @Override // X.InterfaceC1412480mrO
            public final String LIZIZ(VideoPublishEditModel videoPublishEditModel, MusicLogIdInput musicLogIdInput) {
                String strLIZJ;
                String imprId;
                AVMusic aVMusicExtractAVMusic;
                LogPbBean logPb;
                C1412860ms0 c1412860ms0LIZ;
                Asset asset;
                MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                if (musicBuzModel == null) {
                    strLIZJ = "";
                } else {
                    strLIZJ = C1429680nJ8.LIZJ(musicBuzModel);
                }
                if (musicLogIdInput instanceof C1412500mrQ) {
                    C1412800mru c1412800mru = ((C1412500mrQ) musicLogIdInput).LIZ;
                    if (c1412800mru == null || (c1412860ms0LIZ = c1412800mru.LIZ()) == null || (asset = c1412860ms0LIZ.LIZ) == null) {
                        return "";
                    }
                    C1412870ms1.LIZ.getClass();
                    MixEditingMaterialType mixEditingMaterialTypeLIZJ = C1412870ms1.LIZJ(asset);
                    if (!C1533950q1J.LJ(asset.getBusiness_extra().getMusic_id()) && mixEditingMaterialTypeLIZJ != MixEditingMaterialType.SOUND_SYNC && mixEditingMaterialTypeLIZJ != MixEditingMaterialType.AI_TEMPLATE) {
                        return "";
                    }
                    String str2 = videoPublishEditModel.creativeModel.mixEditingModel.requestId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (C1533950q1J.LJ(strLIZJ)) {
                        Map<String, String> map = LIZ;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        if (linkedHashMap.get(strLIZJ) != null) {
                            String str3 = (String) linkedHashMap.get(strLIZJ);
                            if (str3 == null) {
                                return "";
                            }
                            return str3;
                        }
                        map.put(strLIZJ, str2);
                    }
                    return str2;
                }
                MusicBuzModel musicBuzModel2 = videoPublishEditModel.creativeModel.musicBuzModel;
                if (musicBuzModel2 == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel2)) == null || (logPb = aVMusicExtractAVMusic.getLogPb()) == null || (imprId = logPb.getImprId()) == null || imprId.length() == 0) {
                    imprId = videoPublishEditModel.creativeModel.mixEditingModel.requestId;
                }
                if (C1533950q1J.LJ(strLIZJ)) {
                    Map<String, String> map2 = LIZ;
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                    if (linkedHashMap2.get(strLIZJ) != null) {
                        String str4 = (String) linkedHashMap2.get(strLIZJ);
                        if (str4 == null) {
                            return "";
                        }
                        return str4;
                    }
                    map2.put(strLIZJ, imprId);
                }
                if (imprId == null) {
                    return "";
                }
                return imprId;
            }
        });
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        InterfaceC2188711AlJ interfaceC2188711AlJ = c1414720mv0.LLJJL;
        c2188561Al4.getClass();
        C2188561Al4.LJII(interfaceC2188711AlJ);
        c1414720mv0.z4();
    }

    public final InterfaceC1635410sex q3() {
        return (InterfaceC1635410sex) this.LLIZ.getValue(this, LLJL[0]);
    }

    private final List<C1412800mru> G2() {
        List<C1412800mru> listNx2;
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            return B3().nx2();
        }
        InterfaceC1414530muh interfaceC1414530muh = this.LLJJIJI;
        return (interfaceC1414530muh == null || (listNx2 = interfaceC1414530muh.nx2()) == null) ? C13BV.INSTANCE : listNx2;
    }

    private final boolean H4() {
        C1439820nZU c1439820nZU;
        return getEditModel().getEnterFromImageSwitch() && (c1439820nZU = v3().LIZIZ) != null && c1439820nZU.LJFF > 1 && C1414040mtu.LIZ != null;
    }

    private final int Q3() {
        InterfaceC1452170ntP value = m3().g().getValue();
        if (value != null) {
            return value.getDuration();
        }
        return 0;
    }

    private final NLETrack Rn() {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP value = m3().g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return null;
        }
        return nLEModelLIZ.getMainTrack(true);
    }

    private final void Z4() {
        Pair<Integer, String> pairW2 = w2();
        this.LLJJJIL = pairW2.getFirst().intValue();
        this.LLJILJIL.LJII(pairW2.getSecond());
    }

    @InterfaceC1294060jmO
    private final Pair<Integer, String> w2() {
        Object next;
        InterfaceC1452170ntP value = m3().g().getValue();
        if (value == null) {
            return new Pair<>(0, null);
        }
        NLEModel nLEModelLIZ = C352130DrH.LIZ(value);
        if (nLEModelLIZ == null) {
            return new Pair<>(0, null);
        }
        NLETrack mainTrack = nLEModelLIZ.getMainTrack(true);
        if (mainTrack == null) {
            return new Pair<>(0, null);
        }
        ArrayList<String> arrayListLJJL = C351220Dpo.LJJL(mainTrack);
        if (arrayListLJJL == null) {
            return new Pair<>(0, null);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLJJL, 10));
        Iterator<String> it2 = arrayListLJJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().hashCode()));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            while (it3.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() ^ ((Number) it3.next()).intValue());
            }
        } else {
            next = null;
        }
        Integer num = (Integer) next;
        return new Pair<>(Integer.valueOf(arrayListLJJL.size()), num != null ? num.toString() : null);
    }

    private final void z4() {
        C385670FAf<Pair<String, String>> c385670FAfFJ2;
        InterfaceC1203040hPa interfaceC1203040hPaH3 = H3();
        if (interfaceC1203040hPaH3 == null || (c385670FAfFJ2 = interfaceC1203040hPaH3.FJ2()) == null) {
            return;
        }
        c385670FAfFJ2.LIZ(this, new AObjectS245S0100000_22(this, 162));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        InterfaceC2188711AlJ interfaceC2188711AlJ = this.LLJJL;
        c2188561Al4.getClass();
        C09QK.LIZ(interfaceC2188711AlJ);
    }

    @Override // X.InterfaceC1413730mtP
    public C1414840mvC qm1() {
        return W2();
    }

    @Override // X.InterfaceC1413730mtP
    public void yc1() {
        Pair<Integer, String> pairW2 = w2();
        if (!getEditModel().getEditorProModel().isAdvancedEdit() || Intrinsics.LJFF(this.LLJILJIL.LIZJ(), pairW2.getSecond())) {
            return;
        }
        this.LLJILJIL.LJII(pairW2.getSecond());
        T4();
        getEditModel().creativeModel.mixEditingModel.uploadAssetsParams = null;
        getEditModel().creativeModel.mixEditingModel.hasModifiedMediaListInEP = true;
    }

    @Override // X.InterfaceC1413730mtP
    public C385670FAf<Boolean> Qf2() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        T2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1413730mtP
    public C385670FAf<Boolean> getHasMore() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1413730mtP
    public C385670FAf<List<C1412800mru>> j70() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1413730mtP
    public C385670FAf<String> lN0() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1413730mtP
    public int xv2() {
        return this.LLJJJIL;
    }

    public static boolean W1(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private final List<Integer> e4(C1414520mug c1414520mug) {
        int i;
        List<Integer> listLJIIJJI;
        int i2 = 0;
        if (c1414520mug != null && c1414520mug.LIZIZ >= 0 && (i = c1414520mug.LIZ) >= 0 && (listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(c1414520mug.LIZIZ), Integer.valueOf(c1414520mug.LIZJ))) != null) {
            return listLJIIJJI;
        }
        C1412740mro c1412740mroO4 = o4();
        Integer[] numArr = new Integer[3];
        numArr[0] = Integer.valueOf(c1412740mroO4.LIZ);
        int i3 = c1412740mroO4.LIZIZ - c1412740mroO4.LIZJ;
        if (i3 >= 0) {
            i2 = i3;
        }
        numArr[1] = Integer.valueOf(i2);
        numArr[2] = Integer.valueOf(c1412740mroO4.LIZJ);
        return C1697810uHb.LJIIJJI(numArr);
    }

    public final void K4(boolean z) {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            InterfaceC1414530muh interfaceC1414530muh = this.LLJJIJI;
            if (interfaceC1414530muh != null) {
                interfaceC1414530muh.tC(z);
                return;
            } else {
                this.LLJJIJIL.set(Boolean.valueOf(z));
                return;
            }
        }
        B3().tC(z);
    }

    public final void P4(String str) {
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "MixEditingMaterialComponent", str);
    }

    public C1414720mv0(C19A3 c19a3, C1DRG c1drg, C1414800mv8 c1414800mv8) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c1414800mv8;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[PHI: r31
      0x013a: PHI (r31v1 boolean) = (r31v0 boolean), (r31v3 boolean) binds: [B:53:0x0136, B:31:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0273  */
    @Override // X.InterfaceC1413730mtP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zf1(boolean r44, boolean r45, final boolean r46, boolean r47, X.C1414520mug r48) {
        /*
            Method dump skipped, instruction units count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414720mv0.zf1(boolean, boolean, boolean, boolean, X.0mug):void");
    }
}
