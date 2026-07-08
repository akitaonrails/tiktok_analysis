package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FQC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.EffectRestoreNodesKt$magicTemplateNode$1", f = "EffectRestoreNodes.kt", l = {118}, m = "invokeSuspend")
public final class C0FQC extends C09AX implements Function2<C0FQD, InterfaceC1364105Vn<? super C189200o6<? extends C0FQF>>, Object> {
    public CreativeModel LL;
    public Object LLILLJJLI;
    public C357450Dzr LLILLL;
    public C0FQS LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;

    public C0FQC(InterfaceC1364105Vn<? super C0FQC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FQC c0fqc = new C0FQC(interfaceC1364105Vn);
        c0fqc.LLILZLL = obj;
        return c0fqc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLETemplateModel nLETemplateModel;
        CreativeModel creativeModel;
        boolean z;
        Map linkedHashMap;
        C357450Dzr c357450Dzr;
        C0FQS c0fqs;
        Object objLJJIIZ = obj;
        C1C7U.LIZ("EffectRestoreNodesKt@b332.magicTemplateNode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                c0fqs = this.LLILZ;
                c357450Dzr = this.LLILLL;
                linkedHashMap = (Map) this.LLILLJJLI;
                creativeModel = this.LL;
                nLETemplateModel = (NLETemplateModel) this.LLILZLL;
                try {
                    C155000ia.LIZIZ(objLJJIIZ);
                } catch (CancellationException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    c357450Dzr.cancel();
                    throw e;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJIIZ);
            C0FQD c0fqd = (C0FQD) this.LLILZLL;
            nLETemplateModel = c0fqd.LIZ;
            creativeModel = c0fqd.LIZLLL;
            SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(c0fqd.LIZIZ.templateId);
            if (summaryDataLIZIZ != null && C532250Ku7.LIZ(summaryDataLIZIZ)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                creativeModel.pugcTemplateData.magicDependencyRes.clear();
            }
            boolean zLJIIIIZZ = C377880Eri.LJIIIIZZ(nLETemplateModel, false);
            if (!z && !zLJIIIIZZ) {
                c0fqs = null;
                c357450Dzr = null;
                linkedHashMap = null;
                C0FQF c0fqf = new C0FQF(nLETemplateModel, linkedHashMap, c357450Dzr, c0fqs);
                C189200o6.m2constructorimpl(c0fqf);
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c0fqf);
                C1C7U.LIZIZ("EffectRestoreNodesKt@b332.magicTemplateNode$1");
                return c189200o6M1boximpl;
            }
            if (C0E3A.LJ(nLETemplateModel)) {
                C531740KtI c531740KtI = C0FQG.LIZ;
                linkedHashMap = new LinkedHashMap();
                C348210Dkx.LIZ(nLETemplateModel, new AwS619S0100000_5(linkedHashMap, (Map<String, NLEVideoEffect>) 45));
            } else {
                linkedHashMap = null;
            }
            CreativeInfo creativeInfo = c0fqd.LIZJ;
            String strLIZ = C0FQG.LIZ(c0fqd.LIZIZ);
            int value = c0fqd.LIZIZ.templateType.getValue();
            TemplateConsumeCoreParam templateConsumeCoreParam = c0fqd.LIZIZ;
            String str = templateConsumeCoreParam.dispatchType.LIZ;
            List<String> list = creativeModel.pugcTemplateData.featureList;
            c357450Dzr = c357450Dzr;
            C357450Dzr c357450Dzr2 = new C357450Dzr(creativeInfo, templateConsumeCoreParam.templateId, C2286608xc.LJ(value), strLIZ, str, creativeModel, true);
            c0fqs = new C0FQS();
            c0fqs.LIZIZ = new C0F1S(creativeInfo.getCreationId(), creativeInfo.getVersion(), creativeInfo.getSessionId());
            c0fqs.LJ = c0fqd.LIZIZ.templateId;
            c0fqs.LJII = C2286608xc.LJ(value);
            c0fqs.LJIIL = str;
            c0fqs.LJI = strLIZ;
            c0fqs.LJIIJ = nLETemplateModel;
            c0fqs.LJIIIZ = list;
            c0fqs.LIZJ = c0fqd.LJ;
            c0fqs.LJJIIJZLJL = true;
            try {
                AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(421);
                this.LLILZLL = nLETemplateModel;
                this.LL = creativeModel;
                this.LLILLJJLI = linkedHashMap;
                this.LLILLL = c357450Dzr;
                this.LLILZ = c0fqs;
                this.LLILZIL = 1;
                objLJJIIZ = c357450Dzr.LJJIIZ(c0fqs, aFwS234S0000000_5, this);
                if (objLJJIIZ == objLJFF) {
                    C1C7U.LIZIZ("EffectRestoreNodesKt@b332.magicTemplateNode$1");
                    return objLJFF;
                }
            } catch (CancellationException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                c357450Dzr.cancel();
                throw e;
            }
        }
        C358620E4e c358620E4e = (C358620E4e) objLJJIIZ;
        if (c0fqs.LJIJI.LIZIZ) {
            C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(C0FQL.LIZIZ("magic i2v fail"));
            C1C7U.LIZIZ("EffectRestoreNodesKt@b332.magicTemplateNode$1");
            return c189200o6M1boximpl2;
        }
        if (C358630E4f.LIZ()) {
            creativeModel.pugcTemplateData.combineEffectNLETemplateModel = nLETemplateModel.store();
        }
        List<String> list2 = c358620E4e.LIZIZ;
        if (list2 != null) {
            if (!(!list2.isEmpty())) {
                list2 = null;
            }
            if (list2 != null) {
                Set<String> set = creativeModel.pugcTemplateData.magicDependencyRes;
                set.clear();
                Boolean.valueOf(set.addAll(list2));
            }
        }
        C0FQF c0fqf2 = new C0FQF(nLETemplateModel, linkedHashMap, c357450Dzr, c0fqs);
        C189200o6.m2constructorimpl(c0fqf2);
        C189200o6 c189200o6M1boximpl3 = C189200o6.m1boximpl(c0fqf2);
        C1C7U.LIZIZ("EffectRestoreNodesKt@b332.magicTemplateNode$1");
        return c189200o6M1boximpl3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0FQD c0fqd, InterfaceC1364105Vn<? super C189200o6<? extends C0FQF>> interfaceC1364105Vn) {
        return ((a) create(c0fqd, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
