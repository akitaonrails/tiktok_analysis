package X;

import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aiuikit.api.pages.creation.input.AiCreationCameoImageModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.common.PromptJsonModel;
import com.ss.android.ugc.aweme.creative.model.mention.MentionData;
import com.ss.android.ugc.aweme.creative.model.mention.MentionResponse;
import com.ss.android.ugc.aweme.creative.model.mention.NetworkMentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.RecommendMentionAndPrompt;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoMetricsInfo;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549180LgK extends AbstractC2255721DQs<InterfaceC549260LgS> implements InterfaceC549260LgS, InterfaceC379610EuV {
    public static final C549250LgR LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final MutableLiveData<InterfaceC549270LgT> LLILLL;
    public final LiveData<EnumC549220LgO> LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final MutableLiveData<RecommendMentionAndPrompt> LLILZLL;
    public final InterfaceC549260LgS LLIZ = this;
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C549540Lgu.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), AITheaterModel.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), IAITheaterCreationLauncher.EnterParams.class, null);

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0LgR] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C549180LgK.class, "creationSlotHolder", "getCreationSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/AICreationScene$CreationSlotHolder;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C549180LgK.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0), new C2217381BqS(C549180LgK.class, "aiTheaterModel", "getAiTheaterModel()Lcom/ss/android/ugc/aweme/theater/model/AITheaterModel;", 0), new C2217381BqS(C549180LgK.class, "enterParams", "getEnterParams()Lcom/ss/android/ugc/aweme/theater/service/IAITheaterCreationLauncher$EnterParams;", 0)};
        LLJILJIL = new Object() { // from class: X.0LgR
        };
    }

    private final void B3() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        List<CameoInfo> list;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.LJI()) {
            return;
        }
        CreativeModel creativeModel = w2().creativeModel;
        if (C866950Xzh.LIZIZ((creativeModel == null || (aIGCBusinessModelSet = creativeModel.aigcBusinessModel) == null || (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) == null || (creationModel = aITheaterModel.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null) ? null : aITheaterGenerationModel.H1())) {
            return;
        }
        AITheaterConsumptionModel aITheaterConsumptionModel = w2().consumptionModel;
        if ((aITheaterConsumptionModel == null || (list = aITheaterConsumptionModel.cameoInfos) == null || list.isEmpty()) && 1 != 0) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C549190LgL(this, null), 3);
        } else {
            this.LLILZLL.postValue(new RecommendMentionAndPrompt(null, null));
        }
    }

    public final InterfaceC549370Lgd G2() {
        return (InterfaceC549370Lgd) this.LLJ.getValue(this, LLJILJILJ[1]);
    }

    public final AITheaterProfileService H2() {
        AITheaterProfileService.LIZ.getClass();
        return C563290M7j.LIZ();
    }

    public final void T2() {
        AIGC.AICreationSceneName aICreationSceneName;
        Activity activity = this.LL.mActivity;
        if (activity == null) {
            return;
        }
        C537540L6i.LIZ.LIZJ("AITheaterCameoControlComponent", "navigateToProfileScreen to manage");
        AITheaterProfileService aITheaterProfileServiceH2 = H2();
        if (aITheaterProfileServiceH2 != null) {
            C0LQY c0lqy = C0LQY.AI_THEATER;
            CreativeInfo creativeInfo = w2().creativeInfo;
            String creationId = creativeInfo != null ? creativeInfo.getCreationId() : null;
            AIGCEntranceInfo aIGCEntranceInfo = w2().entranceInfo;
            aITheaterProfileServiceH2.Y8(activity, new C531080KsE(true, "ai_theater_profile_management", null, 12001, null, new AITheaterProfileEventModel(c0lqy, null, "create_video", null, null, null, (aIGCEntranceInfo == null || (aICreationSceneName = aIGCEntranceInfo.sceneName) == null) ? null : aICreationSceneName.getValue(), null, creationId, null, null, false, 3770), false, false, false, null, 980), null);
        }
        this.LLILZIL.postValue(Boolean.TRUE);
    }

    public final AITheaterModel X1() {
        return (AITheaterModel) this.LLJI.getValue(this, LLJILJILJ[2]);
    }

    public final C549540Lgu o2() {
        return (C549540Lgu) this.LLIZLLLIL.getValue(this, LLJILJILJ[0]);
    }

    public final IAITheaterCreationLauncher.EnterParams w2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJIJIL.getValue(this, LLJILJILJ[3]);
    }

    private final void v3() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C317630Ccj(this, null), 3);
        Yt2();
    }

    @Override // X.InterfaceC549260LgS
    public void Yt2() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C317620Cci(this, null), 3);
    }

    public final void c3() {
        Context sceneContext;
        InterfaceC550750Lir interfaceC550750LirG9;
        AITheaterCameoMetricsInfo aITheaterCameoMetricsInfoLJIILJJIL;
        AITheaterProfileService aITheaterProfileServiceH2 = H2();
        Integer retakeCnt = (aITheaterProfileServiceH2 == null || (interfaceC550750LirG9 = aITheaterProfileServiceH2.g9()) == null || (aITheaterCameoMetricsInfoLJIILJJIL = interfaceC550750LirG9.LJIILJJIL()) == null) ? null : aITheaterCameoMetricsInfoLJIILJJIL.getRetakeCnt();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZLLL(retakeCnt, "retake_cnt");
        c0lab.LJ("scene_name", "retake_pop");
        C2341909Fp.LIZ("ttcrt_aitheater_retake_pop_show", c0lab.LIZ);
        AITheaterProfileService aITheaterProfileServiceH22 = H2();
        if (aITheaterProfileServiceH22 == null || (sceneContext = this.LL.getSceneContext()) == null) {
            return;
        }
        aITheaterProfileServiceH22.a9(sceneContext, new AwS409S0200000_8(retakeCnt, this, 71));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC549200LgM interfaceC549200LgM;
        LiveData<C537550L6j> liveDataU5;
        InterfaceC549200LgM interfaceC549200LgM2;
        LiveData<C551290Ljj> liveDataXa;
        InterfaceC549200LgM interfaceC549200LgM3;
        LiveData<C549360Lgc> liveDataIj;
        super.onCreate();
        v3();
        B3();
        this.LLILZ.observe(this, new AObjectS241S0100000_8(this, 33));
        InterfaceC549570Lgx<InterfaceC549200LgM> interfaceC549570LgxLIZ = o2().LIZ();
        if (interfaceC549570LgxLIZ != null && (interfaceC549200LgM3 = (InterfaceC549200LgM) interfaceC549570LgxLIZ.getApi()) != null && (liveDataIj = interfaceC549200LgM3.Ij()) != null) {
            liveDataIj.observe(this, new AObserverS212S0100000_8(this, 53));
        }
        InterfaceC549570Lgx<InterfaceC549200LgM> interfaceC549570LgxLIZ2 = o2().LIZ();
        if (interfaceC549570LgxLIZ2 != null && (interfaceC549200LgM2 = (InterfaceC549200LgM) interfaceC549570LgxLIZ2.getApi()) != null && (liveDataXa = interfaceC549200LgM2.Xa()) != null) {
            liveDataXa.observe(this, new AObserverS212S0100000_8(this, 54));
        }
        InterfaceC549570Lgx<InterfaceC549200LgM> interfaceC549570LgxLIZ3 = o2().LIZ();
        if (interfaceC549570LgxLIZ3 != null && (interfaceC549200LgM = (InterfaceC549200LgM) interfaceC549570LgxLIZ3.getApi()) != null && (liveDataU5 = interfaceC549200LgM.u5()) != null) {
            liveDataU5.observe(this, new AObjectS241S0100000_8(this, 34));
        }
        C0LPI.LIZ.getClass();
        MutableLiveData mutableLiveDataLJ = C0LPI.LIZ().LJ();
        if (mutableLiveDataLJ != null) {
            mutableLiveDataLJ.observe(this, new AObserverS212S0100000_8(this, 55));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (Intrinsics.LJFF(this.LLILZIL.getValue(), Boolean.TRUE)) {
            Yt2();
            this.LLILZIL.postValue(Boolean.FALSE);
        }
    }

    public InterfaceC549260LgS Z1() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final AiCreationCameoImageModel m3(AITheaterCameoImageModel aITheaterCameoImageModel) {
        return new AiCreationCameoImageModel(aITheaterCameoImageModel.getUri(), aITheaterCameoImageModel.getUrlList(), aITheaterCameoImageModel.getDataSize(), aITheaterCameoImageModel.getWidth(), aITheaterCameoImageModel.getHeight(), aITheaterCameoImageModel.getUrlKey(), aITheaterCameoImageModel.getFileHash(), aITheaterCameoImageModel.getFileChecksum(), aITheaterCameoImageModel.getPlayerAccessKey());
    }

    public final RecommendMentionAndPrompt W1(MentionResponse mentionResponse) {
        MentionData mentionData;
        List<NetworkMentionDataItem> list;
        ArrayList arrayList;
        String str;
        List list2;
        List<NetworkMentionDataItem> list3;
        ArrayList arrayList2 = null;
        if (mentionResponse == null || (mentionData = mentionResponse.data) == null || (list = mentionData.mentionData) == null || list.isEmpty()) {
            return null;
        }
        MentionData mentionData2 = mentionResponse.data;
        if (mentionData2 != null && (list3 = mentionData2.mentionData) != null) {
            arrayList = new ArrayList();
            Iterator<NetworkMentionDataItem> it2 = list3.iterator();
            while (it2.hasNext()) {
                MentionDataItem mentionDataItemLIZ = it2.next().LIZ();
                if (mentionDataItemLIZ != null) {
                    arrayList.add(mentionDataItemLIZ);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!C549450Lgl.LIZIZ((MentionDataItem) it3.next())) {
                        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createRecommendMentionAndPrompt has invalid mention ");
                        sbLIZ.append(arrayList);
                        c547140Ld2.LIZIZ("AITheaterCameoControlComponent", C2188811AlT.LIZIZ(sbLIZ), null);
                        return null;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        C547670Ldt c547670Ldt = C547670Ldt.LIZ;
        MentionData mentionData3 = mentionResponse.data;
        if (mentionData3 != null) {
            str = mentionData3.prompt;
        } else {
            str = null;
        }
        if (arrayList == null) {
            list2 = C13BV.INSTANCE;
        } else {
            list2 = arrayList;
        }
        c547670Ldt.getClass();
        if (str != null && !a0.LJJJIL(str)) {
            try {
                List<PromptJsonModel> listLIZLLL = C2292508yZ.LIZLLL(PromptJsonModel[].class, str);
                ArrayList arrayList3 = new ArrayList();
                for (PromptJsonModel promptJsonModel : listLIZLLL) {
                    C547670Ldt.LIZ.getClass();
                    InputBlock inputBlockLJ = C547670Ldt.LJ(promptJsonModel, list2);
                    if (inputBlockLJ != null) {
                        arrayList3.add(inputBlockLJ);
                    }
                }
                arrayList2 = arrayList3;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new RecommendMentionAndPrompt(arrayList, arrayList2);
    }

    public final void W2(boolean z) {
        String str;
        String creationId;
        AIGC.AICreationSceneName aICreationSceneName;
        String str2;
        String str3;
        Activity activity = this.LL.mActivity;
        if (activity == null) {
            return;
        }
        C537540L6i.LIZ.LIZJ("AITheaterCameoControlComponent", "navigateToProfileScreen to intro");
        AITheaterProfileService aITheaterProfileServiceH2 = H2();
        if (aITheaterProfileServiceH2 != null) {
            C0LQY c0lqy = C0LQY.AI_THEATER;
            String strLIZ = C528840Koc.LIZ();
            AIGCEntranceInfo aIGCEntranceInfo = w2().entranceInfo;
            if (aIGCEntranceInfo != null) {
                str = aIGCEntranceInfo.shootWay;
            } else {
                str = null;
            }
            CreativeInfo creativeInfo = w2().creativeInfo;
            if (creativeInfo != null) {
                creationId = creativeInfo.getCreationId();
            } else {
                creationId = null;
            }
            AIGCEntranceInfo aIGCEntranceInfo2 = w2().entranceInfo;
            if (aIGCEntranceInfo2 != null) {
                aICreationSceneName = aIGCEntranceInfo2.sceneName;
            } else {
                aICreationSceneName = null;
            }
            if (Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE.INSTANCE)) {
                str2 = "ai_theatre_proactive_crt_create";
            } else if (Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE)) {
                str2 = "ai_theatre_proactive_crt_post";
            } else if (Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.DISSUPPORT_REMIX_CAST.INSTANCE)) {
                str2 = "ai_theatre_dissupport_remix_cast";
            } else if (!Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.SUPPORT_REMIX_ANCHOR.INSTANCE) && !Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.REMIX_FEED_POST.INSTANCE) && !Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.REMIX_FEED_STORY.INSTANCE)) {
                if (Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.PROFILE_CAMEO_TAB.INSTANCE)) {
                    str2 = "ai_theatre_profile_cast_tab";
                } else {
                    str2 = null;
                }
            } else {
                str2 = "ai_theatre_follow_crt";
            }
            if (z) {
                str3 = "retake";
            } else {
                str3 = null;
            }
            aITheaterProfileServiceH2.Y8(activity, new C531080KsE(true, "ai_theater_profile_intro", null, 12001, null, new AITheaterProfileEventModel(c0lqy, strLIZ, "create_video", str2, str3, str, "create_video_no_yours", null, creationId, null, null, false, 3712), false, false, false, null, 980), null);
        }
        this.LLILZIL.postValue(Boolean.TRUE);
    }

    public final InterfaceC549270LgT q3(InterfaceC549230LgP interfaceC549230LgP) {
        int iIntValue;
        if (interfaceC549230LgP instanceof C558690Lvf) {
            return C549340Lga.LIZ;
        }
        if (interfaceC549230LgP instanceof C549290LgV) {
            C549290LgV c549290LgV = (C549290LgV) interfaceC549230LgP;
            return new C549280LgU(c549290LgV.LIZ, m3(c549290LgV.LIZIZ), c549290LgV.LIZLLL, c549290LgV.LJ);
        }
        if (interfaceC549230LgP instanceof C316340Cae) {
            Integer num = ((C316340Cae) interfaceC549230LgP).LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return new C549300LgW(iIntValue);
        }
        if (interfaceC549230LgP instanceof C549350Lgb) {
            return C549330LgZ.LIZ;
        }
        if (interfaceC549230LgP instanceof C557300LtQ) {
            return new InterfaceC549270LgT() { // from class: X.0LgY
                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C549320LgY);
                }

                public final int hashCode() {
                    return -1049050227;
                }

                public final String toString() {
                    return "Empty";
                }

                @Override // X.InterfaceC549270LgT
                public final int LIZ() {
                    return C549310LgX.LIZ(this);
                }
            };
        }
        throw new C1954807lC();
    }

    public final void i3(MentionDataItem mentionDataItem, C0LRE c0lre, Integer num) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C546050LbH(this, mentionDataItem, c0lre, num, null), 2);
    }

    public C549180LgK(C19A3 c19a3, C1DRG c1drg, MutableLiveData<InterfaceC549270LgT> mutableLiveData, LiveData<EnumC549220LgO> liveData, MutableLiveData<Boolean> mutableLiveData2, MutableLiveData<RecommendMentionAndPrompt> mutableLiveData3) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = mutableLiveData;
        this.LLILZ = liveData;
        this.LLILZIL = mutableLiveData2;
        this.LLILZLL = mutableLiveData3;
    }
}
