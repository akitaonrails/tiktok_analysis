package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FQB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.EffectRestoreNodesKt$mattingTemplateNode$1", f = "EffectRestoreNodes.kt", l = {207}, m = "invokeSuspend")
public final class C0FQB extends C09AX implements Function2<C0FQE, InterfaceC1364105Vn<? super C189200o6<? extends NLETemplateModel>>, Object> {
    public PUgcTemplateData LL;
    public C354610DvH LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;

    public C0FQB(InterfaceC1364105Vn<? super C0FQB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FQB c0fqb = new C0FQB(interfaceC1364105Vn);
        c0fqb.LLILZ = obj;
        return c0fqb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PUgcTemplateData pUgcTemplateData;
        boolean z;
        C354610DvH c354610DvH;
        NLEModel nLEModel;
        C1C7U.LIZ("EffectRestoreNodesKt@b332.mattingTemplateNode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c354610DvH = this.LLILLJJLI;
                pUgcTemplateData = this.LL;
                NLEModel nLEModel2 = (NLEModel) this.LLILZ;
                try {
                    C155000ia.LIZIZ(obj);
                    nLEModel = nLEModel2;
                    c354610DvH = c354610DvH;
                } catch (CancellationException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    c354610DvH.cancel();
                    throw e;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0FQE c0fqe = (C0FQE) this.LLILZ;
            NLETemplateModel nLETemplateModel = c0fqe.LIZ;
            pUgcTemplateData = c0fqe.LIZLLL.pugcTemplateData;
            SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(c0fqe.LIZIZ.templateId);
            if (summaryDataLIZIZ != null && C532250Ku7.LIZIZ(summaryDataLIZIZ)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C189200o6.m2constructorimpl(nLETemplateModel);
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(nLETemplateModel);
                C1C7U.LIZIZ("EffectRestoreNodesKt@b332.mattingTemplateNode$1");
                return c189200o6M1boximpl;
            }
            pUgcTemplateData.mattingDependencyRes.clear();
            pUgcTemplateData.mattingCachedRes.clear();
            CreativeInfo creativeInfo = c0fqe.LIZJ;
            TemplateConsumeCoreParam templateConsumeCoreParam = c0fqe.LIZIZ;
            c354610DvH = new C354610DvH(creativeInfo, templateConsumeCoreParam.templateId, C2286608xc.LJ(templateConsumeCoreParam.templateType.getValue()), C0FQG.LIZ(c0fqe.LIZIZ), c0fqe.LIZIZ.dispatchType.LIZ, true, 32);
            try {
                AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(422);
                this.LLILZ = nLETemplateModel;
                this.LL = pUgcTemplateData;
                this.LLILLJJLI = c354610DvH;
                this.LLILLL = 1;
                obj = c354610DvH.LJJIJIIJIL(nLETemplateModel, aFwS234S0000000_5, this);
                nLEModel = nLETemplateModel;
                c354610DvH = c354610DvH;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectRestoreNodesKt@b332.mattingTemplateNode$1");
                    return objLJFF;
                }
            } catch (CancellationException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                c354610DvH.cancel();
                throw e;
            }
        }
        C354700DvQ c354700DvQ = (C354700DvQ) obj;
        if (!c354700DvQ.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("matting failed: code=");
            sbLIZ.append(c354700DvQ.LIZJ);
            sbLIZ.append(", msg=");
            sbLIZ.append(c354700DvQ.LIZLLL);
            C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(C0FQL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ)));
            C1C7U.LIZIZ("EffectRestoreNodesKt@b332.mattingTemplateNode$1");
            return c189200o6M1boximpl2;
        }
        C531740KtI c531740KtI = C0FQG.LIZ;
        if (nLEModel != null) {
            C348740Dlo.LIZ(nLEModel, new AwS584S0100000_5(pUgcTemplateData, 884));
        }
        C189200o6.m2constructorimpl(nLEModel);
        C189200o6 c189200o6M1boximpl3 = C189200o6.m1boximpl(nLEModel);
        C1C7U.LIZIZ("EffectRestoreNodesKt@b332.mattingTemplateNode$1");
        return c189200o6M1boximpl3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0FQE c0fqe, InterfaceC1364105Vn<? super C189200o6<? extends NLETemplateModel>> interfaceC1364105Vn) {
        return ((a) create(c0fqe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
