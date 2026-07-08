package X;

import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelperKt$getFeaturesExtraction$3$1$1", f = "AutoCutHelper.kt", l = {2443}, m = "invokeSuspend")
public final class C2262308th extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends FeatureExtraction, ? extends Integer>>>, Object> {
    public int LL;
    public final /* synthetic */ List<C2262608tk> LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262308th(List<C2262608tk> list, Set<String> set, InterfaceC1364105Vn<? super C2262308th> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2262308th(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutHelperKt@3851.getFeaturesExtraction$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        List list = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class);
            List<C2262608tk> list2 = this.LLILLJJLI;
            Set<String> set = this.LLILLL;
            C2263508tt c2263508tt = new C2263508tt("autocut", null, null, 12);
            this.LL = 1;
            obj = iMixEditingFeatureExtractionService.LJII(list2, set, "item", c2263508tt, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoCutHelperKt@3851.getFeaturesExtraction$3$1$1");
                return objLJFF;
            }
        }
        List<Pair> list3 = (List) obj;
        if (list3 != null) {
            for (Pair pair : list3) {
                FeatureExtraction featureExtraction = (FeatureExtraction) pair.getFirst();
                Map<String, ? extends List<String>> map = ((FeatureExtraction) pair.getFirst()).algorithm;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                    if (entry.getValue() != null && (!r0.isEmpty())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                featureExtraction.algorithm = linkedHashMap;
            }
            list = list3;
        }
        C1C7U.LIZIZ("AutoCutHelperKt@3851.getFeaturesExtraction$3$1$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends FeatureExtraction, ? extends Integer>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
