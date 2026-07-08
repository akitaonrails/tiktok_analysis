package Y;

import X.C06W2;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C13LP;
import X.C19EG;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C547980LeO;
import X.InterfaceC1630630sXF;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AICrtInfo;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS111S0000000_8 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public AObjectS111S0000000_8(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS111S0000000_8 aObjectS111S0000000_8, Object obj) {
        C19EG c19eg = (C19EG) obj;
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class);
        if (iCreativeSAAService != null) {
            return iCreativeSAAService.activityGetLifecycleSafely(c19eg);
        }
        return null;
    }

    public static final Object invoke$1(AObjectS111S0000000_8 aObjectS111S0000000_8, Object obj) {
        ((InterfaceC1630630sXF) obj).aD(8);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS111S0000000_8 aObjectS111S0000000_8, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        String str = VideoRecordPermissionActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        c06w2.Dw2(new AObjectS383S0100000_8(c1193630hAP, 15));
        c06w2.Dw2(new AObjectS61S0000000_8(1));
        return null;
    }

    public static final Object invoke$3(AObjectS111S0000000_8 aObjectS111S0000000_8, Object obj) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String str;
        String str2;
        String str3;
        String str4;
        AITheaterModel aITheaterModel = ((CreativeModel) obj).aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel == null) {
            return null;
        }
        AITheaterConsumptionModel consumptionModel = aITheaterModel.getConsumptionModel();
        AITheaterGenerationModel aITheaterGenerationModel = aITheaterModel.getCreationModel().generationModel;
        List<MentionDataItem> listLIZJ = C547980LeO.LIZJ(aITheaterModel);
        String str5 = aITheaterModel.getCreationModel().sessionModel.source;
        AIGCCreationInputInfo aIGCCreationInputInfo = aITheaterModel.getContextModel().aigcCreationInputInfo;
        String strValueOf = String.valueOf(aITheaterGenerationModel.bH().size());
        List<String> listXr = aITheaterGenerationModel.xr();
        if (listXr != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(listXr, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        if (listLIZJ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<MentionDataItem> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                String str6 = it2.next().cameoId;
                if (str6 != null) {
                    arrayList.add(str6);
                }
            }
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            ArrayList arrayList2 = new ArrayList();
            Iterator<MentionDataItem> it3 = listLIZJ.iterator();
            while (it3.hasNext()) {
                String str7 = it3.next().uid;
                if (str7 != null) {
                    arrayList2.add(str7);
                }
            }
            strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ2 = null;
            strLJJLIIIJ3 = null;
        }
        if (consumptionModel != null) {
            str = consumptionModel.firstFollowGid;
            str2 = consumptionModel.remixVideoId;
        } else {
            str = null;
            str2 = null;
        }
        String serverTaskId = aITheaterGenerationModel.getServerTaskId();
        if (aITheaterModel.getContextModel().aigcEntranceInfo.isFirstAISelfAutoCast) {
            str3 = "no_input";
        } else {
            str3 = "button";
        }
        String str8 = aITheaterModel.getContextModel().aigcCreationResultInfo.genType;
        String str9 = aIGCCreationInputInfo.lastFaceIdActFunc;
        String str10 = aIGCCreationInputInfo.lastFaceIdActChnl;
        if (C547980LeO.LJII(aITheaterModel)) {
            str4 = "1";
        } else {
            str4 = "-1";
        }
        return Collections.singletonList(new AICrtInfo(strValueOf, strLJJLIIIJ, null, null, str5, serverTaskId, "manual", "manual", str3, str8, CardStruct.IStatusCode.DEFAULT, "1", null, null, null, null, null, strLJJLIIIJ2, strLJJLIIIJ3, str, str2, str9, str10, str4, null, null, null, null, null, null, null, null, null, aIGCCreationInputInfo.actorsSelectList, aIGCCreationInputInfo.castFaceTps));
    }

    public static final Object invoke$4(AObjectS111S0000000_8 aObjectS111S0000000_8, Object obj) {
        long jLongValue;
        Long lLJIILIIL;
        String str;
        AITheaterModel aITheaterModel = ((CreativeModel) obj).aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel == null) {
            return C2097608Jq.LJ();
        }
        AITheaterConsumptionModel consumptionModel = aITheaterModel.getConsumptionModel();
        AITheaterContextModel contextModel = aITheaterModel.getContextModel();
        AITheaterGenerationModel aITheaterGenerationModel = aITheaterModel.getCreationModel().generationModel;
        List<InputBlock> listH1 = aITheaterGenerationModel.H1();
        ArrayList arrayList = new ArrayList();
        for (InputBlock inputBlock : listH1) {
            if (Intrinsics.LJFF(inputBlock.type, "mention")) {
                arrayList.add(inputBlock);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MentionDataItem mentionDataItem = ((InputBlock) it2.next()).userItem;
            if (mentionDataItem != null && (str = mentionDataItem.cameoId) != null) {
                arrayList2.add(str);
            }
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("prompt_text", aITheaterGenerationModel.getPromptText()), new Pair("cameo_ids", C13LP.LLIIII(arrayList2)), new Pair("task_id", aITheaterGenerationModel.getServerTaskId()), new Pair("is_ref_image", contextModel.aigcCreationInputInfo.isRefImage), new Pair("is_first_ai_self_auto_cast", Integer.valueOf(contextModel.aigcEntranceInfo.isFirstAISelfAutoCast ? 1 : 0)));
        if (consumptionModel != null && consumptionModel.remixVideoId != null) {
            String str2 = consumptionModel.remixVideoId;
            if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            mapLJIIJ.put("orig_item_id", Long.valueOf(jLongValue));
        }
        return C2097908Jt.LIZJ(new Pair("ai_theater_info", GsonProtectorUtils.toJson(new Gson(), mapLJIIJ)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120 A[PHI: r13
      0x0120: PHI (r13v1 java.util.List<java.lang.String>) = (r13v0 java.util.List<java.lang.String>), (r13v9 java.util.List<java.lang.String>) binds: [B:75:0x011d, B:52:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(Y.AObjectS111S0000000_8 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS111S0000000_8.invoke$5(Y.AObjectS111S0000000_8, java.lang.Object):java.lang.Object");
    }
}
