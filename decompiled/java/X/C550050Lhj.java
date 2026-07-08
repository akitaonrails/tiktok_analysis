package X;

import Y.AObjectS241S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.generate.scene.AIPortraitGenerationRootScene;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550050Lhj extends AbstractC2255721DQs<InterfaceC548670LfV> implements InterfaceC548670LfV, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final boolean LLILLL;
    public C570010MXf LLILZ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C549550Lgv.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC550060Lhk.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC550070Lhl.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), CreativeModel.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), CreativeInfo.class, null);
    public AIPortraitGeneratingModel LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C550050Lhj.class, "loadingSlotHolder", "getLoadingSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/loading/AIGCLoadingScene$AIGCLoadingSlotHolder;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C550050Lhj.class, "draftApi", "getDraftApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitGenerationDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C550050Lhj.class, "generationApi", "getGenerationApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitGenerationLogicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C550050Lhj.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C550050Lhj.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C550050Lhj.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/model/CreativeInfo;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJILJILJ = 8;
    }

    public InterfaceC548670LfV X1() {
        return this;
    }

    private final CreativeInfo Z1() {
        return (CreativeInfo) this.LLJI.getValue(this, LLJILJIL[5]);
    }

    private final <T> T c3() {
        List<Scene> sceneList;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ == null || (sceneList = navigationSceneLIZ.getSceneList()) == null) {
            return null;
        }
        ListIterator<Scene> listIterator = sceneList.listIterator(sceneList.size());
        if (!listIterator.hasPrevious()) {
            Intrinsics.LJIILIIL();
            throw null;
        }
        listIterator.previous();
        Intrinsics.LJIILIIL();
        throw null;
    }

    private final CreativeModel o2() {
        return (CreativeModel) this.LLJ.getValue(this, LLJILJIL[4]);
    }

    public final InterfaceC550070Lhl G2() {
        return (InterfaceC550070Lhl) this.LLIZ.getValue(this, LLJILJIL[2]);
    }

    public final C549550Lgv H2() {
        return (C549550Lgv) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    public final InterfaceC549370Lgd T2() {
        return (InterfaceC549370Lgd) this.LLIZLLLIL.getValue(this, LLJILJIL[3]);
    }

    @Override // X.InterfaceC548670LfV
    public void TH0() {
        List<Scene> sceneList;
        Scene scenePrevious;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ == null || (sceneList = navigationSceneLIZ.getSceneList()) == null) {
            return;
        }
        ListIterator<Scene> listIterator = sceneList.listIterator(sceneList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                scenePrevious = null;
                break;
            } else {
                scenePrevious = listIterator.previous();
                if (scenePrevious instanceof AIPortraitGenerationRootScene) {
                    break;
                }
            }
        }
        AbstractC214814194y abstractC214814194y = (AbstractC214814194y) (scenePrevious instanceof AIPortraitGenerationRootScene ? scenePrevious : null);
        if (abstractC214814194y != null) {
            abstractC214814194y.finish();
        }
    }

    public final InterfaceC550060Lhk w2() {
        return (InterfaceC550060Lhk) this.LLILZLL.getValue(this, LLJILJIL[1]);
    }

    private final AIPortraitEnterParams W1() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        String str;
        AIGCEntranceInfo aIGCEntranceInfoLIZ;
        CreativeModel creativeModelO2 = o2();
        if (creativeModelO2 == null || (aIPortraitModel = creativeModelO2.aigcBusinessModel.aiPortraitModel) == null || (aIPortraitContextModel = aIPortraitModel.contextModel) == null || (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) == null) {
            return null;
        }
        AIGCEntranceInfo aIGCEntranceInfo = aIPortraitContextModel.aigcEntranceInfo;
        List<String> list = aIPortraitInputInfo.cameoIdList;
        if (list == null || (str = (String) C13LP.LJJJLL(list)) == null) {
            str = "";
        }
        List<String> list2 = aIPortraitInputInfo.cameoImageList;
        String str2 = list2 != null ? (String) C13LP.LJJJLL(list2) : null;
        CreativeInfo creativeInfoZ1 = Z1();
        String creationId = creativeInfoZ1 != null ? creativeInfoZ1.getCreationId() : null;
        if (aIGCEntranceInfo != null) {
            aIGCEntranceInfoLIZ = AIGCEntranceInfo.LIZ(aIGCEntranceInfo, null, null, 0, null, null, false, false, false, AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT.INSTANCE, AIGC.RefPageName.ResultLoadingPage.INSTANCE, null, null, null, null, false, false, 1047039);
        } else {
            AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT push_success_no_draft = AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT.INSTANCE;
            AIGC.RefPageName.ResultLoadingPage resultLoadingPage = AIGC.RefPageName.ResultLoadingPage.INSTANCE;
            aIGCEntranceInfoLIZ = C550730Lip.LIZ("", push_success_no_draft, resultLoadingPage, resultLoadingPage.value);
        }
        return new AIPortraitEnterParams(str, str2, creationId, aIGCEntranceInfoLIZ, null, false, null, null);
    }

    private final void i3() {
        InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL;
        InterfaceC548540LfI interfaceC548540LfI;
        LiveEvent<Unit> liveEventV2;
        C549550Lgv c549550LgvH2 = H2();
        if (c549550LgvH2 == null || (interfaceC549570LgxLLLLLJIL = c549550LgvH2.LIZ.LLLLLJIL("title_bar")) == 0 || (interfaceC548540LfI = (InterfaceC548540LfI) interfaceC549570LgxLLLLLJIL.getApi()) == null || (liveEventV2 = interfaceC548540LfI.v2()) == null) {
            return;
        }
        liveEventV2.LIZ(this, new AObjectS241S0100000_8(this, 13));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        super.onCreate();
        CreativeModel creativeModelO2 = o2();
        this.LLJIJIL = (creativeModelO2 == null || (aIPortraitModel = creativeModelO2.aigcBusinessModel.aiPortraitModel) == null || (aIPortraitContextModel = aIPortraitModel.contextModel) == null) ? null : aIPortraitContextModel.generatingModel;
        i3();
    }

    @Override // X.InterfaceC548670LfV
    public void qF2() {
        Activity activityLIZIZ;
        AIPortraitEnterParams aIPortraitEnterParamsW1;
        CreativeModel creativeModelO2 = o2();
        if (creativeModelO2 == null || !creativeModelO2.draftInfoModel.isDraft) {
            TH0();
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (aIPortraitEnterParamsW1 = W1()) == null) {
            return;
        }
        new C568820MSq().openPortraitCustomizeTab(activityLIZIZ, aIPortraitEnterParamsW1);
    }

    public final boolean W2() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void m3(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C570020MXg(R.raw.icon_draft, 2131825813, R.attr.a1h, R.attr.a1h, new AwS552S0100000_8(this, 159), 176));
        arrayList.add(new C570020MXg(R.raw.icon_x_mark_circle, 2131825812, R.attr.a1m, R.attr.a1m, new AwS552S0100000_8(this, 160), 176));
        C570010MXf c570010MXf = new C570010MXf((Context) getDiContainer().LJII(C19EG.class, null), view, arrayList, null, R.attr.a1d, R.attr.a02, 0.4f);
        this.LLILZ = c570010MXf;
        c570010MXf.LIZLLL();
    }

    public C550050Lhj(C19A3 c19a3, C1DRG c1drg, boolean z) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = z;
    }
}
