package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationResultInfo;
import com.ss.android.ugc.aweme.aikit.api.common.AIAlertService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC548480LfC extends AbstractC2255721DQs<InterfaceC548570LfL> implements InterfaceC548570LfL, InterfaceC379610EuV {
    public static final C548560LfK LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), IAITheaterCreationLauncher.EnterParams.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548510LfF.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC548420Lf6.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548460LfA.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C549550Lgv.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    public final InterfaceC546960Lck LLIZLLLIL = new InterfaceC546960Lck() { // from class: X.0LfD
        @Override // X.InterfaceC546960Lck
        public final void onStop() {
        }

        @Override // X.InterfaceC546960Lck
        public final void LIZ(String str) {
            this.LIZ.i3(str);
        }

        @Override // X.InterfaceC546960Lck
        public final void LIZIZ(String str) {
            InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL;
            InterfaceC548530LfH interfaceC548530LfH;
            InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL2;
            InterfaceC548530LfH interfaceC548530LfH2;
            CreativeModel creativeModelZ1;
            AIGCBusinessModelSet aIGCBusinessModelSet;
            AITheaterModel aITheaterModel;
            AITheaterContextModel contextModel;
            AIGCCreationResultInfo aIGCCreationResultInfo;
            String str2;
            if (str != null && (creativeModelZ1 = this.LIZ.Z1()) != null && (aIGCBusinessModelSet = creativeModelZ1.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null && (contextModel = aITheaterModel.getContextModel()) != null && ((aIGCCreationResultInfo = contextModel.aigcCreationResultInfo) == null || (((str2 = aIGCCreationResultInfo.taskId) == null || str2.length() == 0) && contextModel != null))) {
                contextModel.aigcCreationResultInfo = new AIGCCreationResultInfo(null, null, 0L, str, EnumC547660Lds.UNKNOWN.getValue());
            }
            AITheaterCreationModel aITheaterCreationModelX1 = this.LIZ.X1();
            if (aITheaterCreationModelX1 == null) {
                return;
            }
            C549550Lgv c549550LgvH2 = this.LIZ.H2();
            if (c549550LgvH2 != null && (interfaceC549570LgxLLLLLJIL2 = c549550LgvH2.LIZ.LLLLLJIL("generation_loading")) != 0 && (interfaceC548530LfH2 = (InterfaceC548530LfH) interfaceC549570LgxLLLLLJIL2.getApi()) != null) {
                interfaceC548530LfH2.j3(aITheaterCreationModelX1.generationModel.getProgress());
            }
            long jUs = aITheaterCreationModelX1.generationModel.us();
            C547670Ldt c547670Ldt = C547670Ldt.LIZ;
            Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this.LIZ);
            long jT1 = aITheaterCreationModelX1.generationModel.T1();
            c547670Ldt.getClass();
            String strLIZJ = C547670Ldt.LIZJ(contextLJIIIZ, jUs, jT1);
            C549550Lgv c549550LgvH22 = this.LIZ.H2();
            if (c549550LgvH22 != null && (interfaceC549570LgxLLLLLJIL = c549550LgvH22.LIZ.LLLLLJIL("generation_loading")) != 0 && (interfaceC548530LfH = (InterfaceC548530LfH) interfaceC549570LgxLLLLLJIL.getApi()) != null) {
                interfaceC548530LfH.oG0(new Pair<>(Long.valueOf(jUs), strLIZJ));
            }
        }

        @Override // X.InterfaceC546960Lck
        public final void LJIIJ(String str) {
            this.LIZ.m3(str);
        }

        @Override // X.InterfaceC546960Lck
        public final void onSuccess(String str) {
            this.LIZ.q3(str);
        }
    };

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0LfK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC548480LfC.class, "enterParams", "getEnterParams()Lcom/ss/android/ugc/aweme/theater/service/IAITheaterCreationLauncher$EnterParams;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AbstractC548480LfC.class, "taskApi", "getTaskApi()Lcom/ss/android/ugc/aweme/aikit/api/create/generation/AIGCTaskHandleApi;", 0), new C2217381BqS(AbstractC548480LfC.class, "dataApi", "getDataApi()Lcom/ss/android/ugc/aweme/aikit/api/create/generation/AIGCGenerationDataApi;", 0), new C2217381BqS(AbstractC548480LfC.class, "draftApi", "getDraftApi()Lcom/ss/android/ugc/aweme/aikit/api/create/generation/AIGCGenerationDraftApi;", 0), new C2217381BqS(AbstractC548480LfC.class, "loadingSlotHolder", "getLoadingSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/loading/AIGCLoadingScene$AIGCLoadingSlotHolder;", 0), new C2217381BqS(AbstractC548480LfC.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0)};
        LLJ = new Object() { // from class: X.0LfK
        };
    }

    public void Xi() {
    }

    private final InterfaceC549370Lgd T2() {
        return (InterfaceC549370Lgd) this.LLIZ.getValue(this, LLJI[5]);
    }

    public final IAITheaterCreationLauncher.EnterParams G2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLILLJJLI.getValue(this, LLJI[0]);
    }

    public final C549550Lgv H2() {
        return (C549550Lgv) this.LLILZLL.getValue(this, LLJI[4]);
    }

    public final InterfaceC548510LfF W2() {
        return (InterfaceC548510LfF) this.LLILLL.getValue(this, LLJI[1]);
    }

    public final InterfaceC548420Lf6 o2() {
        return (InterfaceC548420Lf6) this.LLILZ.getValue(this, LLJI[2]);
    }

    public final InterfaceC548460LfA w2() {
        return (InterfaceC548460LfA) this.LLILZIL.getValue(this, LLJI[3]);
    }

    public final void W1() {
        AITheaterCreationModel aITheaterCreationModelX1 = X1();
        if (aITheaterCreationModelX1 == null) {
            return;
        }
        if (C546670LcH.LIZIZ(aITheaterCreationModelX1.generationModel)) {
            c3(aITheaterCreationModelX1);
        }
        if (C546670LcH.LIZ(aITheaterCreationModelX1.generationModel)) {
            v3();
        }
    }

    public AITheaterCreationModel X1() {
        AIGCCreationModel aIGCCreationModelVA2 = o2().vA2();
        if (aIGCCreationModelVA2 instanceof AITheaterCreationModel) {
            return (AITheaterCreationModel) aIGCCreationModelVA2;
        }
        return null;
    }

    public CreativeModel Z1() {
        return G2().creativeModel;
    }

    @Override // X.InterfaceC548570LfL
    public void kr() {
        InterfaceC548510LfF interfaceC548510LfFW2;
        AITheaterCreationModel aITheaterCreationModelX1 = X1();
        if (aITheaterCreationModelX1 == null || !C546670LcH.LIZIZ(aITheaterCreationModelX1.generationModel) || (interfaceC548510LfFW2 = W2()) == null) {
            return;
        }
        interfaceC548510LfFW2.EA1(aITheaterCreationModelX1);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC548510LfF interfaceC548510LfFW2 = W2();
        if (interfaceC548510LfFW2 != null) {
            interfaceC548510LfFW2.a30(this.LLIZLLLIL);
        }
        Xi();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // X.InterfaceC548570LfL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qk() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r7 = r10.X1()
            if (r7 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r3 = r10.Z1()
            if (r3 != 0) goto Le
            return
        Le:
            X.0LOK r0 = X.C0LOK.LIZ
            X.0LbZ r1 = X.C546330Lbj.LIZ(r0)
            if (r1 != 0) goto L17
            return
        L17:
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r3.aigcBusinessModel
            com.ss.android.ugc.aweme.theater.model.AITheaterModel r2 = r0.aiTheaterModel
            if (r2 != 0) goto L1e
            return
        L1e:
            com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel r0 = r2.getConsumptionModel()
            if (r0 == 0) goto L58
            X.0Lbf r0 = r1.LJI()
            if (r0 == 0) goto L61
            java.lang.String r5 = r0.LIZLLL
        L2c:
            X.0LbL r4 = r1.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r3.creativeInfo
            java.lang.String r6 = r0.getCreationId()
            if (r5 != 0) goto L38
            java.lang.String r5 = ""
        L38:
            X.0Ldt r1 = X.C547670Ldt.LIZ
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r0 = r10.G2()
            r1.getClass()
            java.util.Map r9 = X.C547670Ldt.LIZIZ(r2, r0)
            X.0LcP r3 = new X.0LcP
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.0LfF r0 = r10.W2()
            if (r0 == 0) goto L54
            r0.iw(r3)
        L54:
            r10.c3(r7)
            return
        L58:
            X.0Lbf r0 = r1.LJI()
            if (r0 == 0) goto L61
            java.lang.String r5 = r0.LIZJ
            goto L2c
        L61:
            r5 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC548480LfC.qk():void");
    }

    public final void v3() {
        Integer numValueOf;
        String step;
        AITheaterGenerationModel aITheaterGenerationModel;
        AITheaterCreationModel aITheaterCreationModelX1 = X1();
        String failReasonMsg = null;
        if (aITheaterCreationModelX1 == null || (aITheaterGenerationModel = aITheaterCreationModelX1.generationModel) == null) {
            numValueOf = null;
            step = null;
        } else {
            numValueOf = Integer.valueOf(aITheaterGenerationModel.getErrorCode());
            step = aITheaterGenerationModel.getStep();
            failReasonMsg = aITheaterGenerationModel.getFailReasonMsg();
        }
        C547860LeC.LIZ.getClass();
        AIAlertService aIAlertServiceLIZJ = C547860LeC.LIZJ();
        C547670Ldt.LIZ.getClass();
        aIAlertServiceLIZJ.LIZIZ(8011, C547670Ldt.LIZ(numValueOf, step, failReasonMsg), false);
        InterfaceC549370Lgd interfaceC549370LgdT2 = T2();
        if (interfaceC549370LgdT2 != null) {
            interfaceC549370LgdT2.x22();
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC548480LfC(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void c3(AIGCCreationModel aIGCCreationModel) {
        String clientTaskId = aIGCCreationModel.ZG().getClientTaskId();
        if (clientTaskId == null) {
            return;
        }
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeWorkflowState, taskId: ");
        sbLIZ.append(clientTaskId);
        c547140Ld2.LIZJ("AITheaterGenerationLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC548510LfF interfaceC548510LfFW2 = W2();
        if (interfaceC548510LfFW2 != null) {
            interfaceC548510LfFW2.av1(clientTaskId, aIGCCreationModel);
        }
    }

    public void i3(String str) {
        String serverTaskId;
        InterfaceC549370Lgd interfaceC549370LgdT2;
        AITheaterGenerationModel aITheaterGenerationModel;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        CreativeModel creativeModelZ1 = Z1();
        if (creativeModelZ1 != null && (aIGCBusinessModelSet = creativeModelZ1.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null) {
            C547980LeO.LJIIIZ(aITheaterModel);
        }
        AITheaterCreationModel aITheaterCreationModelX1 = X1();
        if (aITheaterCreationModelX1 != null && (aITheaterGenerationModel = aITheaterCreationModelX1.generationModel) != null) {
            serverTaskId = aITheaterGenerationModel.getServerTaskId();
        } else {
            serverTaskId = null;
        }
        if (C548360Lf0.LIZ(str, serverTaskId) && (interfaceC549370LgdT2 = T2()) != null) {
            interfaceC549370LgdT2.EP0(true, "", 0);
        }
    }

    public void m3(String str) {
        C549550Lgv c549550LgvH2;
        InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL;
        InterfaceC548530LfH interfaceC548530LfH;
        AITheaterCreationModel aITheaterCreationModelX1 = X1();
        if (aITheaterCreationModelX1 != null && (c549550LgvH2 = H2()) != null && (interfaceC549570LgxLLLLLJIL = c549550LgvH2.LIZ.LLLLLJIL("generation_loading")) != 0 && (interfaceC548530LfH = (InterfaceC548530LfH) interfaceC549570LgxLLLLLJIL.getApi()) != null) {
            interfaceC548530LfH.j3(aITheaterCreationModelX1.generationModel.getProgress());
        }
    }

    public void q3(String str) {
        CreativeInfo creativeInfo;
        String creationId;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        CreativeModel creativeModelZ1 = Z1();
        if (creativeModelZ1 != null && (aIGCBusinessModelSet = creativeModelZ1.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null) {
            C547980LeO.LJIIIZ(aITheaterModel);
        }
        CreativeModel creativeModelZ12 = Z1();
        if (creativeModelZ12 != null && (creativeInfo = creativeModelZ12.creativeInfo) != null && (creationId = creativeInfo.getCreationId()) != null && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
            C0LCT.LIZLLL(creationId, true);
        }
    }
}
