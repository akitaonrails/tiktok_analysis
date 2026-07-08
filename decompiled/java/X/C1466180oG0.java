package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466180oG0 extends AbstractC2255721DQs<InterfaceC1462260o9g> implements InterfaceC1462260o9g, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final Activity LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465230oET.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444170ngV.class, null);
    public final EnumC1466210oG3[] LLIZ = EnumC1466210oG3.values();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 732));
    public final InterfaceC1462260o9g LLJ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1466180oG0.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1466180oG0.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1466180oG0.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1466180oG0.class, "iEditStickerScene", "getIEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final void T2(StickerModel stickerModel) {
    }

    private final List<MediaLocationMetaDataModel> W2() {
        ArrayList arrayList = new ArrayList();
        if (((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).enableReadLocationMetaData()) {
            ArrayList<ImportVideoInfo> importInfoList = LJJJLIIL().getImportInfoList();
            List<MediaLocationMetaDataModel> list = LJJJLIIL().creativeModel.mediaLocationMetaDataList;
            if (importInfoList != null && !importInfoList.isEmpty() && list != null && !list.isEmpty() && importInfoList != null) {
                for (ImportVideoInfo importVideoInfo : importInfoList) {
                    if (list != null) {
                        Iterator<MediaLocationMetaDataModel> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            MediaLocationMetaDataModel next = it2.next();
                            if (Intrinsics.LJFF(next.originPath, importVideoInfo.getOriginImportPath())) {
                                if (next != null) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                    arrayList.add(new MediaLocationMetaDataModel(importVideoInfo.getOriginImportPath(), null, null, null));
                }
            }
        }
        return arrayList;
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS601S0100000_22(this, 511));
        }
    }

    private final InterfaceC1444170ngV w2() {
        return (InterfaceC1444170ngV) this.LLILZLL.getValue(this, LLJI[3]);
    }

    public final InterfaceC391240FVq G2() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLJI[0]);
    }

    public final C1466200oG2 H2() {
        return (C1466200oG2) this.LLIZLLLIL.getValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJI[1]);
    }

    @Override // X.InterfaceC1462260o9g
    public void ew0() {
        Map<String, String> linkedHashMap;
        Map<String, String> mapZ1 = Z1(LJJJLIIL(), "video_edit_page");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", "video_edit_page");
        linkedHashMap2.put("enter_method", "click_location_sticker");
        linkedHashMap2.put("creation_id", LJJJLIIL().getCreationId());
        linkedHashMap2.put("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        String str = LJJJLIIL().mShootWay;
        if (str == null) {
            str = "";
        }
        linkedHashMap2.put("shoot_way", str);
        linkedHashMap2.put("retag_enter_method", "no_retag");
        linkedHashMap2.putAll(((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ());
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService == null || (linkedHashMap = iPoiService.LLII()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap2.putAll(linkedHashMap);
        C20684815ws.LJIILLIIL("enter_poi_search", linkedHashMap2);
        List<MediaLocationMetaDataModel> listW2 = W2();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLJJLI, "//poi/search");
        smartRouteBuildRoute.withParam("poi_mob_param", new PoiMobParam(LJJJLIIL().getCreationId(), C1428470nHB.LJIILL(LJJJLIIL()), LJJJLIIL().mShootWay, "click_location_sticker", "video_edit_page", null, null, "", false, 0, mapZ1, null, null, null));
        smartRouteBuildRoute.withParam("enable_preload", true);
        smartRouteBuildRoute.withParam("page_scene", EnumC1198680hIY.LOCATION_STICKER);
        smartRouteBuildRoute.withParam("media_location_meta_data_list_json", C08JS.LIZLLL(listW2));
        smartRouteBuildRoute.withParam("retag_enter_method", "no_retag");
        smartRouteBuildRoute.withParam("after_post_days", "");
        smartRouteBuildRoute.open(10003, new C1466770oGx(this, 1));
    }

    public final InterfaceC1465230oET o2() {
        return (InterfaceC1465230oET) this.LLILZIL.getValue(this, LLJI[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LLILLJJLI != null) {
            C0FI2.LJIJJ().LIZLLL("Neon", new C0FVV(AFwS210S0000000_22.get$arr$(253), null), Boolean.valueOf(!C298130BmN.LIZ()));
        }
        Xi();
    }

    public InterfaceC1462260o9g X1() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final EnumC1466210oG3 m3(EnumC1466210oG3 enumC1466210oG3) {
        EnumC1466210oG3[] enumC1466210oG3Arr = this.LLIZ;
        int length = enumC1466210oG3Arr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (enumC1466210oG3 == enumC1466210oG3Arr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        EnumC1466210oG3[] enumC1466210oG3Arr2 = this.LLIZ;
        EnumC1466210oG3 enumC1466210oG32 = (EnumC1466210oG3) C13LQ.LJJIIZ((i + 1) % enumC1466210oG3Arr2.length, enumC1466210oG3Arr2);
        if (enumC1466210oG32 == null) {
            return EnumC1466210oG3.DEFAULT;
        }
        return enumC1466210oG32;
    }

    @Override // X.InterfaceC1462260o9g
    public void Sj2(VideoPublishEditModel videoPublishEditModel) {
        Object c098200Yq;
        try {
            c098200Yq = (InteractStickerStruct) C13LP.LJJJLZIJ(0, C1429860nJQ.LJFF(videoPublishEditModel, 13, EnumC1428480nHC.TRACK_PAGE_EDIT));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) c098200Yq;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, videoPublishEditModel.creativeModel.stickerModel.locationStickerModels);
        if (interactStickerStruct != null && interactStickerStruct.getPoiStickerStruct() != null && objLJJJLZIJ == null) {
            W1(interactStickerStruct, videoPublishEditModel);
        }
    }

    public final void c3(final StickerModel stickerModel) {
        Map<String, String> linkedHashMap;
        Map<String, String> mapZ1 = Z1(LJJJLIIL(), "video_edit_page");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLJJLI, "//poi/search");
        smartRouteBuildRoute.withParam("poi_mob_param", new PoiMobParam(LJJJLIIL().getCreationId(), C1428470nHB.LJIILL(LJJJLIIL()), LJJJLIIL().mShootWay, "click_change_location", "video_edit_page", null, null, "", false, 0, mapZ1, null, null, null));
        smartRouteBuildRoute.withParam("enable_preload", true);
        smartRouteBuildRoute.withParam("page_scene", EnumC1198680hIY.LOCATION_STICKER);
        smartRouteBuildRoute.withParam("retag_enter_method", "no_retag");
        String str = "";
        smartRouteBuildRoute.withParam("after_post_days", "");
        smartRouteBuildRoute.open(10003, new OnActivityResultCallback() { // from class: X.0oG1
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                PoiData poiData;
                LocationStickerModel locationStickerModel;
                LocationStickerModel locationStickerModelCopy;
                InterfaceC391240FVq interfaceC391240FVqG2;
                if (i == 10003 && i2 == -1) {
                    Serializable serializableExtra = intent.getSerializableExtra("poi_data");
                    if ((serializableExtra instanceof PoiData) && (poiData = (PoiData) serializableExtra) != null) {
                        InterfaceC1465230oET interfaceC1465230oETO2 = this.LL.o2();
                        if (interfaceC1465230oETO2 != null) {
                            C1462460oA0.LIZ(interfaceC1465230oETO2, false, 0L, 6);
                        }
                        StickerModel stickerModel2 = stickerModel;
                        if ((stickerModel2 instanceof LocationStickerModel) && (locationStickerModel = (LocationStickerModel) stickerModel2) != null && (locationStickerModelCopy = locationStickerModel.copy(locationStickerModel.baseStickerModel, locationStickerModel.theme, poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle)) != null && (interfaceC391240FVqG2 = this.LL.G2()) != null) {
                            interfaceC391240FVqG2.k3(locationStickerModelCopy, EnumC356070Dxd.COMMIT);
                        }
                    }
                }
            }
        });
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", "video_edit_page");
        linkedHashMap2.put("enter_method", "click_change_location");
        linkedHashMap2.put("creation_id", LJJJLIIL().getCreationId());
        linkedHashMap2.put("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        String str2 = LJJJLIIL().mShootWay;
        if (str2 != null) {
            str = str2;
        }
        linkedHashMap2.put("shoot_way", str);
        linkedHashMap2.put("retag_enter_method", "no_retag");
        if (mapZ1 != null) {
            linkedHashMap2.putAll(mapZ1);
        }
        linkedHashMap2.putAll(((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ());
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService == null || (linkedHashMap = iPoiService.LLII()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap2.putAll(linkedHashMap);
        C20684815ws.LJIILLIIL("enter_poi_search", linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String creationId = LJJJLIIL().getCreationId();
        if (creationId != null) {
            linkedHashMap3.put("creation_id", creationId);
        }
        String str3 = LJJJLIIL().mShootWay;
        if (str3 != null) {
            linkedHashMap3.put("shoot_way", str3);
        }
        C20684815ws.LJIILLIIL("prop_change_location", linkedHashMap3);
    }

    public final void i3(StickerModel stickerModel) {
        LocationStickerModel locationStickerModel;
        if ((stickerModel instanceof LocationStickerModel) && (locationStickerModel = (LocationStickerModel) stickerModel) != null) {
            LocationStickerModel locationStickerModelCopy = locationStickerModel.copy(locationStickerModel.baseStickerModel, m3(locationStickerModel.getTheme()), locationStickerModel.poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle);
            InterfaceC391240FVq interfaceC391240FVqG2 = G2();
            if (interfaceC391240FVqG2 != null) {
                interfaceC391240FVqG2.k3(locationStickerModelCopy, EnumC356070Dxd.COMMIT);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String creationId = LJJJLIIL().getCreationId();
            if (creationId != null) {
                linkedHashMap.put("creation_id", creationId);
            }
            String str = LJJJLIIL().mShootWay;
            if (str != null) {
                linkedHashMap.put("shoot_way", str);
            }
            String strValueOf = String.valueOf(((LocationStickerModel) stickerModel).getStickerType().getType());
            if (strValueOf == null) {
                strValueOf = "";
            }
            linkedHashMap.put("sticker_type", strValueOf);
            C20684815ws.LJIILLIIL("prop_change_style", linkedHashMap);
        }
    }

    public final Map<String, String> q3(MobParam mobParam) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(C7740030o.LIZ().getGson().LJIILL(mobParam))).entrySet()) {
                if (C123100dR.LIZ(entry.getKey()) && C123100dR.LIZ(entry.getValue().toString())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        return (Map) obj2;
    }

    public C1466180oG0(C1DRG c1drg, Activity activity) {
        this.LL = c1drg;
        this.LLILLJJLI = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void W1(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r70, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r71) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466180oG0.W1(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    private final Map<String, String> Z1(VideoPublishEditModel videoPublishEditModel, String str) {
        return q3(C1428470nHB.LJII(videoPublishEditModel, str, "", ""));
    }
}
