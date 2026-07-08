package X;

import Y.AObjectS241S0100000_8;
import Y.ARunnableS108S0100000_8;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem;
import com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550110Lhp extends AbstractC2255721DQs<InterfaceC550070Lhl> implements InterfaceC550070Lhl, InterfaceC379610EuV {
    public static final C550220Li0 LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final AbstractC214814194y LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), C549550Lgv.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC550060Lhk.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC550170Lhv.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC550180Lhw.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548670LfV.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), CreativeModel.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), CreativeInfo.class, null);
    public final C550120Lhq LLJI = new InterfaceC553590LnR() { // from class: X.0Lhq
        @Override // X.InterfaceC553590LnR
        public final void onStop() {
            C201955140j.LIZIZ(C545870Laz.LIZIZ.LIZ, "AIPortraitGenerationLogicComponent -> onStop");
        }

        @Override // X.InterfaceC553590LnR
        public final void LJIIJ(String str) {
            AIPortraitModel aIPortraitModel;
            AIPortraitContextModel aIPortraitContextModel;
            AIPortraitGeneratingModel aIPortraitGeneratingModel;
            if (str == null) {
                InterfaceC550180Lhw interfaceC550180LhwG2 = this.LIZ.G2();
                if (interfaceC550180LhwG2 != null) {
                    interfaceC550180LhwG2.db2(EnumC550140Lhs.SUBMIT_WORKFLOW_FAILED);
                    return;
                }
                return;
            }
            InterfaceC550180Lhw interfaceC550180LhwG22 = this.LIZ.G2();
            if (interfaceC550180LhwG22 != null) {
                interfaceC550180LhwG22.R82();
            }
            CreativeModel creativeModelZ1 = this.LIZ.Z1();
            if (creativeModelZ1 != null && (aIPortraitModel = creativeModelZ1.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
                aIPortraitGeneratingModel.clientWorkflowId = str;
                aIPortraitGeneratingModel.status = GenerateStatus.GENERATING;
            }
            InterfaceC550170Lhv interfaceC550170LhvT2 = this.LIZ.T2();
            if (interfaceC550170LhvT2 != null) {
                interfaceC550170LhvT2.KW(str);
            }
        }

        @Override // X.InterfaceC553590LnR
        public final void onProgress(int i) {
            AIPortraitModel aIPortraitModel;
            AIPortraitContextModel aIPortraitContextModel;
            AIPortraitGeneratingModel aIPortraitGeneratingModel;
            CreativeModel creativeModelZ1 = this.LIZ.Z1();
            if (creativeModelZ1 != null && (aIPortraitModel = creativeModelZ1.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
                aIPortraitGeneratingModel.progress = Integer.valueOf(i);
            }
            InterfaceC550180Lhw interfaceC550180LhwG2 = this.LIZ.G2();
            if (interfaceC550180LhwG2 != null) {
                interfaceC550180LhwG2.j3(i);
            }
        }

        @Override // X.InterfaceC553590LnR
        public final void onSuccess(List<AIPortraitResultItem> list) {
            AIPortraitModel aIPortraitModel;
            AIPortraitGeneratingModel aIPortraitGeneratingModel;
            C545870Laz c545870Laz = C545870Laz.LIZIZ;
            C201955140j.LIZIZ(c545870Laz.LIZ, "AIPortraitGenerationLogicComponent -> onSuccess");
            InterfaceC550180Lhw interfaceC550180LhwG2 = this.LIZ.G2();
            if (interfaceC550180LhwG2 != null) {
                interfaceC550180LhwG2.rR0();
            }
            CreativeModel creativeModelZ1 = this.LIZ.Z1();
            if (creativeModelZ1 != null && (aIPortraitModel = creativeModelZ1.aigcBusinessModel.aiPortraitModel) != null) {
                aIPortraitModel.creationModel = new AIPortraitCreationModel(list, false, false, false, false);
                AIPortraitContextModel aIPortraitContextModel = aIPortraitModel.contextModel;
                if (aIPortraitContextModel != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
                    aIPortraitGeneratingModel.status = GenerateStatus.SUCCESS;
                }
            }
            String str = c545870Laz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIPortraitGenerationLogicComponent -> onSuccess, result = ");
            sbLIZ.append(list);
            C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            new C568820MSq().enterPhotoEditPageAfterSuccess((C19EG) this.LIZ.getDiContainer().LJII(C19EG.class, null), this.LIZ.X1(), this.LIZ.Z1(), false, new AwS552S0100000_8(this.LIZ, 158));
        }

        @Override // X.InterfaceC553590LnR
        public final void onFail(int i, String str) {
            EnumC550140Lhs enumC550140Lhs;
            AIPortraitModel aIPortraitModel;
            AIPortraitContextModel aIPortraitContextModel;
            AIPortraitGeneratingModel aIPortraitGeneratingModel;
            C1920207fc c1920207fcLIZIZ = C1920107fb.LIZIZ(str);
            if (!Intrinsics.LJFF(c1920207fcLIZIZ.LIZ, "violation") && !Intrinsics.LJFF(c1920207fcLIZIZ.LIZLLL, "violation")) {
                enumC550140Lhs = EnumC550140Lhs.OTHERS;
            } else {
                enumC550140Lhs = EnumC550140Lhs.TNS_INTERCEPT;
            }
            CreativeModel creativeModelZ1 = this.LIZ.Z1();
            if (creativeModelZ1 != null && (aIPortraitModel = creativeModelZ1.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
                aIPortraitGeneratingModel.status = GenerateStatus.FAILED;
                aIPortraitGeneratingModel.failedInfo = new GenerateFailedInfo(enumC550140Lhs, i);
            }
            new C550130Lhr().reportCreateButtonResult(this.LIZ.Z1());
            InterfaceC550180Lhw interfaceC550180LhwG2 = this.LIZ.G2();
            if (interfaceC550180LhwG2 != null) {
                interfaceC550180LhwG2.db2(enumC550140Lhs);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Li0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C550110Lhp.class, "loadingSlotHolder", "getLoadingSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/loading/AIGCLoadingScene$AIGCLoadingSlotHolder;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C550110Lhp.class, "draftApi", "getDraftApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitGenerationDraftApi;", 0), new C2217381BqS(C550110Lhp.class, "workflowApi", "getWorkflowApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitWorkflowApi;", 0), new C2217381BqS(C550110Lhp.class, "loadingApi", "getLoadingApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitLoadingApi;", 0), new C2217381BqS(C550110Lhp.class, "exitApi", "getExitApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitLoadingExitApi;", 0), new C2217381BqS(C550110Lhp.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0), new C2217381BqS(C550110Lhp.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/model/CreativeInfo;", 0)};
        LLJIJIL = new Object() { // from class: X.0Li0
        };
        LLJILJILJ = 8;
    }

    public InterfaceC550070Lhl W1() {
        return this;
    }

    private final C549550Lgv H2() {
        return (C549550Lgv) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final InterfaceC550180Lhw G2() {
        return (InterfaceC550180Lhw) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    public final InterfaceC550170Lhv T2() {
        return (InterfaceC550170Lhv) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    public final CreativeInfo X1() {
        return (CreativeInfo) this.LLJ.getValue(this, LLJILJIL[6]);
    }

    public final CreativeModel Z1() {
        return (CreativeModel) this.LLIZLLLIL.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC550060Lhk o2() {
        return (InterfaceC550060Lhk) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC548670LfV w2() {
        return (InterfaceC548670LfV) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    private final void W2() {
        InterfaceC550170Lhv interfaceC550170LhvT2 = T2();
        if (interfaceC550170LhvT2 != null) {
            interfaceC550170LhvT2.oc1(this.LLJI);
        }
    }

    private final void Xi() {
        InterfaceC549570Lgx<InterfaceC548550LfJ> interfaceC549570LgxLIZ;
        InterfaceC548550LfJ interfaceC548550LfJ;
        LiveEvent<Unit> liveEventLLLLIILLL;
        InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL;
        InterfaceC548540LfI interfaceC548540LfI;
        LiveEvent<Unit> liveEventLLLLIILLL2;
        C549550Lgv c549550LgvH2 = H2();
        if (c549550LgvH2 != null && (interfaceC549570LgxLLLLLJIL = c549550LgvH2.LIZ.LLLLLJIL("title_bar")) != 0 && (interfaceC548540LfI = (InterfaceC548540LfI) interfaceC549570LgxLLLLLJIL.getApi()) != null && (liveEventLLLLIILLL2 = interfaceC548540LfI.LLLLIILLL()) != null) {
            liveEventLLLLIILLL2.LIZ(this, new AObjectS241S0100000_8(this, 11));
        }
        C549550Lgv c549550LgvH22 = H2();
        if (c549550LgvH22 == null || (interfaceC549570LgxLIZ = c549550LgvH22.LIZ()) == null || (interfaceC548550LfJ = (InterfaceC548550LfJ) interfaceC549570LgxLIZ.getApi()) == null || (liveEventLLLLIILLL = interfaceC548550LfJ.LLLLIILLL()) == null) {
            return;
        }
        liveEventLLLLIILLL.LIZ(this, new AObjectS241S0100000_8(this, 12));
    }

    @Override // X.InterfaceC550070Lhl
    public void Iz1() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        CreativeModel creativeModelZ1 = Z1();
        if (creativeModelZ1 != null && (aIPortraitModel = creativeModelZ1.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null) {
            aIPortraitContextModel.mobParams.isRetry = true;
            aIPortraitContextModel.generatingModel.startTime = System.currentTimeMillis();
        }
        InterfaceC550170Lhv interfaceC550170LhvT2 = T2();
        if (interfaceC550170LhvT2 != null) {
            interfaceC550170LhvT2.eB2();
        }
    }

    @Override // X.InterfaceC550070Lhl
    public void kr() {
        InterfaceC550170Lhv interfaceC550170LhvT2 = T2();
        if (interfaceC550170LhvT2 != null) {
            interfaceC550170LhvT2.Jw0();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W2();
        Xi();
        C19EG fragmentActivity = this.LL.getFragmentActivity();
        if (fragmentActivity != null) {
            HandlerHook.viewPost(fragmentActivity.getWindow().getDecorView(), new ARunnableS108S0100000_8(fragmentActivity, 12));
        }
        qk();
    }

    @Override // X.InterfaceC550070Lhl
    public void qk() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        String str;
        AIPortraitModel aIPortraitModel2;
        AIPortraitContextModel aIPortraitContextModel2;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        AIPortraitModel aIPortraitModel3;
        AIPortraitContextModel aIPortraitContextModel3;
        AIPortraitGeneratingModel aIPortraitGeneratingModel2;
        String str2;
        InterfaceC550170Lhv interfaceC550170LhvT2;
        AIPortraitModel aIPortraitModel4;
        AIPortraitContextModel aIPortraitContextModel4;
        AIPortraitGeneratingModel aIPortraitGeneratingModel3;
        CreativeModel creativeModelZ1 = Z1();
        GenerateStatus generateStatus = null;
        if (creativeModelZ1 != null && (aIPortraitModel4 = creativeModelZ1.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel4 = aIPortraitModel4.contextModel) != null && (aIPortraitGeneratingModel3 = aIPortraitContextModel4.generatingModel) != null) {
            generateStatus = aIPortraitGeneratingModel3.status;
        }
        if (generateStatus != GenerateStatus.NOT_START) {
            CreativeModel creativeModelZ12 = Z1();
            if (creativeModelZ12 == null || (aIPortraitModel3 = creativeModelZ12.aigcBusinessModel.aiPortraitModel) == null || (aIPortraitContextModel3 = aIPortraitModel3.contextModel) == null || (aIPortraitGeneratingModel2 = aIPortraitContextModel3.generatingModel) == null || (str2 = aIPortraitGeneratingModel2.clientWorkflowId) == null || (interfaceC550170LhvT2 = T2()) == null) {
                return;
            }
            interfaceC550170LhvT2.KW(str2);
            return;
        }
        CreativeModel creativeModelZ13 = Z1();
        if (creativeModelZ13 == null || (aIPortraitModel = creativeModelZ13.aigcBusinessModel.aiPortraitModel) == null || (aIPortraitContextModel = aIPortraitModel.contextModel) == null || (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) == null || (str = aIPortraitInputInfo.referenceImageUploadId) == null || str.length() == 0) {
            xl1();
            return;
        }
        CreativeModel creativeModelZ14 = Z1();
        if (creativeModelZ14 != null && (aIPortraitModel2 = creativeModelZ14.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel2 = aIPortraitModel2.contextModel) != null && (aIPortraitGeneratingModel = aIPortraitContextModel2.generatingModel) != null) {
            aIPortraitGeneratingModel.status = GenerateStatus.GENERATING;
        }
        c3(str);
    }

    public final void xl1() {
        InterfaceC550170Lhv interfaceC550170LhvT2 = T2();
        if (interfaceC550170LhvT2 != null) {
            interfaceC550170LhvT2.xl1();
        } else {
            C201955140j.LIZIZ(C545870Laz.LIZIZ.LIZ, "submitWorkflow-> startGeneration: workflowApi is null");
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final void c3(String str) {
        String str2 = C545870Laz.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitGenerationLogicComponent -> startGeneration wait image upload result, uploadId=");
        sbLIZ.append(str);
        C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C550190Lhx(str, this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0Lhq] */
    public C550110Lhp(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = c1drg;
    }
}
