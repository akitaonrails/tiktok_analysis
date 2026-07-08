package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionServiceKt$reuseAIMusicUploadedResult$3", f = "MixEditingFeatureExtractionService.kt", l = {1026}, m = "invokeSuspend")
public final class C2268808uk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268808uk(List list, int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C2268808uk(this.LLILZ, this.LLILLL, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2268608ui c2268608ui;
        Object obj2 = obj;
        C1C7U.LIZ("MixEditingFeatureExtractionServiceKt@6aea.reuseAIMusicUploadedResult$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj2);
                c2268608ui = obj2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj2);
            IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureExtractionService.class, false, false, false, 14, null);
            if (iMixEditingFeatureExtractionService != null) {
                String str = this.LLILLJJLI;
                int i2 = this.LLILLL;
                List<String> list = this.LLILZ;
                this.LL = 1;
                Object objLJIILIIL = iMixEditingFeatureExtractionService.LJIILIIL(list, i2, str, this);
                c2268608ui = objLJIILIIL;
                if (objLJIILIIL == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.reuseAIMusicUploadedResult$3");
                    return objLJFF;
                }
            }
            c2268608ui = new C2268608ui(null, false, null, null, null, 16383);
            List<String> list2 = this.LLILZ;
            c2268608ui.LIZ = "empty";
            c2268608ui.LIZJ = true;
            c2268608ui.LJIIJ = C2268608ui.LIZLLL(list2);
            C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.reuseAIMusicUploadedResult$3");
            return c2268608ui;
        }
        if (c2268608ui == 0) {
            c2268608ui = new C2268608ui(null, false, null, null, null, 16383);
            List<String> list22 = this.LLILZ;
            c2268608ui.LIZ = "empty";
            c2268608ui.LIZJ = true;
            c2268608ui.LJIIJ = C2268608ui.LIZLLL(list22);
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.reuseAIMusicUploadedResult$3");
        return c2268608ui;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
