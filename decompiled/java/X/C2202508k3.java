package X;

import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08k3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$uploadFrames$2$2$framePackageTask$1", f = "MixEditingFeatureExtractionService.kt", l = {363}, m = "invokeSuspend")
public final class C2202508k3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public int LL;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILLJJLI;
    public final /* synthetic */ C2268608ui LLILLL;
    public final /* synthetic */ List<C2262608tk> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2263508tt LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2202508k3(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, C2263508tt c2263508tt, C2268608ui c2268608ui, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixEditingFeatureExtractionService;
        this.LLILLL = c2268608ui;
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MixEditingFeatureExtractionService mixEditingFeatureExtractionService = this.LLILLJJLI;
        C2268608ui c2268608ui = this.LLILLL;
        List<C2262608tk> list = this.LLILZ;
        return new C2202508k3(mixEditingFeatureExtractionService, this.LLILZLL, c2268608ui, this.LLILZIL, list, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MixEditingFeatureExtractionService@fa48.uploadFrames$2$2$framePackageTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MixEditingFeatureExtractionService mixEditingFeatureExtractionService = this.LLILLJJLI;
            C2268608ui c2268608ui = this.LLILLL;
            List<C2262608tk> list = this.LLILZ;
            String str = this.LLILZIL;
            C2263508tt c2263508tt = this.LLILZLL;
            this.LL = 1;
            obj = mixEditingFeatureExtractionService.LJIILLIIL(c2268608ui, list, str, c2263508tt, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.uploadFrames$2$2$framePackageTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.uploadFrames$2$2$framePackageTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
