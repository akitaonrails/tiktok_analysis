package X;

import Y.AComparatorS41S0000000_22;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0nIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429420nIi {
    public static final C1429420nIi LIZ = new C1429420nIi();
    public static final ArrayList<CreateAnchorInfo> LIZIZ = new ArrayList<>();

    public static List LIZJ() {
        return LIZIZ;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, List list, boolean z) {
        if ((!TextUtils.isEmpty(videoPublishEditModel.getStickers()) && !TextUtils.isEmpty(videoPublishEditModel.getPropSource())) || C1416310mxZ.LJJJJJ(videoPublishEditModel)) {
            C1429600nJ0.LIZJ(list, videoPublishEditModel);
        }
        C1429600nJ0.LIZIZ(list, videoPublishEditModel);
        C1429450nIl.LJII(videoPublishEditModel, list, false);
        C1429450nIl.LJIIJJI(videoPublishEditModel, list, false);
        C1429450nIl.LJIILL(videoPublishEditModel, list, false);
        C1429600nJ0.LIZLLL(list, videoPublishEditModel);
        if (VoiceConversionRecordService.LJ().LIZJ()) {
            C1429600nJ0.LJ(list, videoPublishEditModel);
        }
        if (C294110Bft.LIZ() == 4) {
            C1429450nIl.LJIJ(list, videoPublishEditModel);
        }
        C1429450nIl.LJIJJLI(list, videoPublishEditModel);
        C1429450nIl.LJIL(list, videoPublishEditModel);
        C1429450nIl.LJJII(list, videoPublishEditModel);
        C1429450nIl.LJ(list, videoPublishEditModel);
        C1429450nIl.LIZ(list, videoPublishEditModel);
        C1429450nIl.LJIIL(videoPublishEditModel, list, false);
        C1429450nIl.LJIIIIZZ(videoPublishEditModel, list, false);
        C1429450nIl.LIZLLL(list, videoPublishEditModel, null, null, z, 12);
        C1429450nIl.LJIILIIL(videoPublishEditModel, list, false);
        C1429450nIl.LJFF(list, videoPublishEditModel, null);
        C1429450nIl.LJIILLIIL(list, videoPublishEditModel);
        C1429450nIl.LJIIJ(list, videoPublishEditModel, null);
        ArrayList arrayList = new ArrayList();
        if (videoPublishEditModel.getMainBusinessContext() != null) {
            List listLJ = C1429860nJQ.LJ(videoPublishEditModel.getMainBusinessContext(), EnumC1428480nHC.TRACK_PAGE_EDIT);
            if (listLJ == null) {
                listLJ = new ArrayList();
            }
            ((ArrayList) list).addAll(C123P.LJIIJ(listLJ));
            arrayList.addAll(C123P.LJ(listLJ));
        }
        if (!videoPublishEditModel.creativeModel.stickerModel.donationStickers.isEmpty()) {
            C1465030oE9 c1465030oE9 = C1465030oE9.LIZ;
            StickerNewEngineModel stickerNewEngineModel = videoPublishEditModel.creativeModel.stickerModel;
            c1465030oE9.getClass();
            arrayList.addAll(C1465030oE9.LJFF(stickerNewEngineModel));
        }
        C1465030oE9.LIZ.getClass();
        arrayList.addAll(C1465030oE9.LJ(videoPublishEditModel));
        if (arrayList.size() >= 1) {
            ((ArrayList) list).add(C13LP.LJJLIIIJJI(arrayList));
        }
        if (videoPublishEditModel.getPoiData() != null) {
            try {
                C1429430nIj.LIZ.getClass();
                C1429430nIj.LIZ(list, videoPublishEditModel);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJFF("poi", "add poi params failed");
            }
        }
        Iterator<InterfaceC1413210msZ> it2 = o.LJIILJJIL.LIZJ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(videoPublishEditModel, new LinkedHashMap<>(), list);
        }
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.aiSelfModel.styleName)) {
            C1429450nIl.LJI(list, videoPublishEditModel);
        }
        Map<? extends Object, Integer> map = C1430360nKE.LIZ;
        Collections.reverse(list);
        if (((ArrayList) list).size() > 1) {
            C08XD.LJJ(list, new AComparatorS41S0000000_22(5));
        }
    }

    public static Map LIZIZ(C1429420nIi c1429420nIi, VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, int i) {
        Map<String, String> mapLJJJJL;
        String strLIZ;
        int type;
        String keyword;
        String subtype;
        CreateAnchorInfo createAnchorInfo;
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c1429420nIi.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LIZ(videoPublishEditModel, arrayList, z2);
        if (!arrayList.isEmpty()) {
            linkedHashMap.put("anchor_type", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(299), 30));
            if (((CreateAnchorInfo) C13LP.LJJJJZI(arrayList)).getType() != EnumC1430380nKG.THIRD_PART_GENERAL.getTYPE() || (createAnchorInfo = (CreateAnchorInfo) C13LP.LJJJJZI(arrayList)) == null || (strLIZ = createAnchorInfo.getSubtype()) == null) {
                strLIZ = C1429500nIq.LIZ(((CreateAnchorInfo) C13LP.LJJJJZI(arrayList)).getType());
            }
            linkedHashMap.put("main_anchor_type", strLIZ);
            linkedHashMap.put("anchor_name", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 30));
            CreateAnchorInfo createAnchorInfo2 = (CreateAnchorInfo) C13LP.LJJJLL(arrayList);
            if (createAnchorInfo2 != null) {
                type = createAnchorInfo2.getType();
            } else {
                type = EnumC1430380nKG.NO_TYPE.getTYPE();
            }
            if (C1067090dsJ.LIZ(type)) {
                if (createAnchorInfo2 != null) {
                    subtype = createAnchorInfo2.getSubtype();
                } else {
                    subtype = null;
                }
                if (Intrinsics.LJFF(subtype, "lemon8_general_create_post")) {
                    keyword = "Lemon8 | create";
                } else {
                    keyword = "Lemon8 | app";
                }
            } else if (createAnchorInfo2 == null || (keyword = createAnchorInfo2.getKeyword()) == null) {
                keyword = "";
            }
            linkedHashMap.put("main_anchor_name", keyword);
            if (arrayList.size() > 1) {
                i2 = 1;
            }
            linkedHashMap.put("multi_anchor", String.valueOf(i2));
        }
        linkedHashMap.put("anchor_number", String.valueOf(arrayList.size()));
        if (z && (!arrayList.isEmpty())) {
            Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(arrayList);
            arrayList.clear();
            arrayList.add(objLJJLIIIJJI);
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        if (iECommerceAnchorService != null && (mapLJJJJL = iECommerceAnchorService.LJJJJL(arrayList)) != null) {
            linkedHashMap.putAll(mapLJJJJL);
        }
        return linkedHashMap;
    }
}
