package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ms8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412940ms8 {
    public static final C1412940ms8 LIZ = new C1412940ms8();
    public static final Map<String, C1412950ms9> LIZIZ = new LinkedHashMap();
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static long LIZIZ(C1412860ms0 c1412860ms0) {
        if (((Boolean) C263160ATa.LIZ.getValue()).booleanValue()) {
            AbstractC1412880ms2 abstractC1412880ms2 = c1412860ms0.LIZIZ;
            if (abstractC1412880ms2 == null) {
                return 0L;
            }
            return abstractC1412880ms2.LIZIZ();
        }
        Long dep_resources_total_size = c1412860ms0.LIZ.getBusiness_extra().getDep_resources_total_size();
        if (dep_resources_total_size != null && dep_resources_total_size.longValue() > 0) {
            return dep_resources_total_size.longValue();
        }
        AbstractC1412880ms2 abstractC1412880ms22 = c1412860ms0.LIZIZ;
        if (abstractC1412880ms22 == null) {
            return 0L;
        }
        return abstractC1412880ms22.LIZIZ();
    }

    public static void LIZJ(C1412860ms0 c1412860ms0, boolean z) {
        Integer numValueOf;
        int iIntValue;
        String asset_id = c1412860ms0.LIZ.getAsset_id();
        Map<String, C1412950ms9> map = LIZIZ;
        if (!map.containsKey(asset_id)) {
            INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
            if (iNetworkStateService != null) {
                numValueOf = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType());
            } else {
                numValueOf = null;
            }
            c1412860ms0.LIZ.getAsset_parent_type();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            map.put(asset_id, new C1412950ms9(jCurrentTimeMillis, z, iIntValue));
        }
    }

    public static void LIZ(C1412940ms8 c1412940ms8, C1412860ms0 c1412860ms0, boolean z, int i, VideoPublishEditModel videoPublishEditModel) {
        Boolean boolValueOf;
        int iLJIIIIZZ;
        NLEModel nleModel;
        EnumC1412640mre enumC1412640mreLIZLLL;
        c1412940ms8.getClass();
        Map<String, C1412950ms9> map = LIZIZ;
        C1412950ms9 c1412950ms9 = (C1412950ms9) ((LinkedHashMap) map).get(c1412860ms0.LIZ.getAsset_id());
        if (c1412950ms9 != null) {
            map.remove(c1412860ms0.LIZ.getAsset_id());
            NLEModel nleModel2 = videoPublishEditModel.getNleModel();
            AbstractC1412880ms2 abstractC1412880ms2 = c1412860ms0.LIZIZ;
            if (abstractC1412880ms2 instanceof C1413040msI) {
                nleModel2 = ((C1413040msI) abstractC1412880ms2).LIZIZ;
            }
            Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
            int iIntValue = pairLJJIIZ.getFirst().intValue();
            int iIntValue2 = pairLJJIIZ.getSecond().intValue();
            Integer numValueOf = null;
            if (nleModel2 != null) {
                boolValueOf = Boolean.valueOf(C0EYQ.LIZJ(nleModel2));
            } else {
                boolValueOf = null;
            }
            long jLIZIZ = LIZIZ(c1412860ms0) / ((long) 1024);
            String strLIZ = C1412420mrI.LIZ(c1412860ms0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(jCurrentTimeMillis - c1412950ms9.LIZ, "duration");
            c0lab.LJ(Scene.SCENE_SERVICE, "edit_mixed_asset_carousel");
            c0lab.LIZ(z ? 1 : 0, "hit_cache");
            c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c0lab.LJ("resource_type", strLIZ);
            AssetType assetType = AssetPanelModelKt.toAssetType(c1412860ms0.LIZ.getAsset_type());
            if (assetType != null && (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) != null) {
                numValueOf = Integer.valueOf(enumC1412640mreLIZLLL.getValue());
            }
            c0lab.LIZLLL(numValueOf, "template_type");
            c0lab.LJFF("is_preload", c1412950ms9.LIZIZ);
            c0lab.LJ("resource_id", c1412860ms0.LIZ.getAsset_id());
            c0lab.LJ("creation_id", LIZJ);
            c0lab.LJ("shoot_way", LIZLLL);
            c0lab.LIZ(c1412950ms9.LIZJ, "launch_network_status");
            c0lab.LIZIZ(LIZIZ(c1412860ms0), "file_size");
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LIZ(iIntValue, "video_cnt");
            c0lab.LIZ(iIntValue2, "pic_cnt");
            c0lab.LJ("template_resize_optimized", String.valueOf(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0));
            c0lab.LIZIZ(jLIZIZ, "template_zip_size");
            c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            EnumC1412640mre enumC1412640mreLIZ = C1412250mr1.LIZ(c1412860ms0.LIZ);
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.ALGORITHM_TEMPLATE;
            if (enumC1412640mreLIZ == enumC1412640mre || C1412250mr1.LIZ(c1412860ms0.LIZ) == EnumC1412640mre.CUT_SAME) {
                if (C1412250mr1.LIZ(c1412860ms0.LIZ) != enumC1412640mre && (nleModel = videoPublishEditModel.getNleModel()) != null) {
                    iLJIIIIZZ = C0EYQ.LJIIIIZZ(nleModel);
                } else {
                    iLJIIIIZZ = iIntValue + iIntValue2;
                }
                c0lab.LIZ(iLJIIIIZZ, "template_mutable_slot_count");
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
            if (Intrinsics.LJFF(strLIZ, "effect")) {
                C305790Byj.LIZ(Long.valueOf(c1412950ms9.LIZ), Long.valueOf(jCurrentTimeMillis - c1412950ms9.LIZ));
            }
        }
    }
}
