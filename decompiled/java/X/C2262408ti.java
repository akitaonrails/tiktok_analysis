package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionServiceKt$getLocalFeatures$1$1$1$localFeatureResults$1", f = "MixEditingFeatureExtractionService.kt", l = {870}, m = "invokeSuspend")
public final class C2262408ti extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends FeatureExtraction, ? extends Integer>>>, Object> {
    public int LL;
    public final /* synthetic */ List<C2262608tk> LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262408ti(List<C2262608tk> list, Set<String> set, String str, String str2, String str3, InterfaceC1364105Vn<? super C2262408ti> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = set;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2262408ti(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionServiceKt@6aea.getLocalFeatures$1$1$1$localFeatureResults$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class);
                List<C2262608tk> list = this.LLILLJJLI;
                Set<String> set = this.LLILLL;
                String str = this.LLILZ;
                C2263508tt c2263508tt = new C2263508tt(this.LLILZIL, this.LLILZLL, null, 12);
                this.LL = 1;
                obj = iMixEditingFeatureExtractionService.LJII(list, set, str, c2263508tt, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.getLocalFeatures$1$1$1$localFeatureResults$1");
                    return objLJFF;
                }
            }
            obj2 = obj;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", e);
            if (C2263008to.LIZ()) {
                throw e;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.getLocalFeatures$1$1$1$localFeatureResults$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends FeatureExtraction, ? extends Integer>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
