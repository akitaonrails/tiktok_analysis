package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCOriginInfo;
import com.ss.android.ugc.aweme.creative.model.common.PromptJsonModel;
import com.ss.android.ugc.aweme.feed.model.CameoAssetInfo;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548760Lfe {
    public static final Gson LIZ = new e().LIZ();

    public static final int LIZ(String str) {
        List<PromptJsonModel> list;
        int length;
        String str2;
        int i = 0;
        if (str != null) {
            try {
                list = (List) LIZ.LJIIIIZZ(str, new TypeToken<List<? extends PromptJsonModel>>() { // from class: X.0LO2
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                list = C13BV.INSTANCE;
            }
            if (list != null) {
                i = 0;
                for (PromptJsonModel promptJsonModel : list) {
                    if (Intrinsics.LJFF(promptJsonModel.type, C0LXI.TEXT.getValue()) && (str2 = promptJsonModel.content) != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    i += length;
                }
            }
        }
        return i;
    }

    public static final AIGCOriginInfo LIZIZ(AITheaterConsumptionModel aITheaterConsumptionModel) {
        boolean z;
        String userId;
        UserBaseInfo userBaseInfo;
        CameoAssetInfo cameoAssetInfo;
        String cameoId;
        UserBaseInfo userBaseInfo2;
        String userId2;
        List<CameoInfo> list = aITheaterConsumptionModel.cameoInfos;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str = aITheaterConsumptionModel.serverTaskId;
        if (str == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        for (CameoInfo cameoInfo : list) {
            if (cameoInfo != null && (userBaseInfo2 = cameoInfo.getUserBaseInfo()) != null && (userId2 = userBaseInfo2.getUserId()) != null) {
                arrayList.add(userId2);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        int size = list.size();
        String str2 = aITheaterConsumptionModel.actorsShipList;
        ArrayList arrayList2 = new ArrayList();
        for (CameoInfo cameoInfo2 : list) {
            if (cameoInfo2 != null && (cameoAssetInfo = cameoInfo2.getCameoAssetInfo()) != null && (cameoId = cameoAssetInfo.getCameoId()) != null) {
                arrayList2.add(cameoId);
            }
        }
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        if (!list.isEmpty()) {
            for (CameoInfo cameoInfo3 : list) {
                if (cameoInfo3 != null && (userBaseInfo = cameoInfo3.getUserBaseInfo()) != null) {
                    userId = userBaseInfo.getUserId();
                } else {
                    userId = null;
                }
                if (Intrinsics.LJFF(userId, aITheaterConsumptionModel.authorId)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return new AIGCOriginInfo(str, strLJJLIIIJ, Integer.valueOf(size), str2, aITheaterConsumptionModel.originActorsSelectList, strLJJLIIIJ2, Boolean.valueOf(z), Integer.valueOf(LIZ(aITheaterConsumptionModel.prompt)), EnumC549040Lg6.EDIT_NOW, aITheaterConsumptionModel.isRefImage);
    }
}
