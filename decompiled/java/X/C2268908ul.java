package X;

import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$reuseAIMusicUploadedResult$2", f = "MixEditingFeatureExtractionService.kt", l = {410, 481}, m = "invokeSuspend")
public final class C2268908ul extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268908ul(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, String str, int i, List<String> list, InterfaceC1364105Vn<? super C2268908ul> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixEditingFeatureExtractionService;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2268908ul c2268908ul = new C2268908ul(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2268908ul.LLILLJJLI = obj;
        return c2268908ul;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
            return obj;
        }
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        String strLIZIZ = C2275708vr.LIZIZ();
        C099G c099g = this.LLILLL.LJIIIZ;
        obj = null;
        if (c099g != null) {
            MixEditingFeatureExtractionService mixEditingFeatureExtractionService = this.LLILLL;
            if (c099g.isActive()) {
                this.LL = 1;
                obj = c099g.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
                    return objLJFF;
                }
                C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
                return obj;
            }
            if (c099g.isCompleted() && !c099g.isCancelled()) {
                C2268608ui c2268608ui = (C2268608ui) c099g.LJJJIL();
                if (C2269608us.LIZ()) {
                    String str = c2268608ui.LIZ;
                    if ((Intrinsics.LJFF(str, strLIZIZ) || Intrinsics.LJFF(c2268608ui.LIZJ, true) || Intrinsics.LJFF(str, "empty")) && !Intrinsics.LJFF(c2268608ui.LIZJ, true) && str != null && str.length() != 0 && !Intrinsics.LJFF(str, "empty")) {
                        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
                        return c2268608ui;
                    }
                    mixEditingFeatureExtractionService.LJIIIZ = null;
                } else {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
                    return c2268608ui;
                }
            }
        }
        MixEditingFeatureExtractionService mixEditingFeatureExtractionService2 = this.LLILLL;
        String str2 = this.LLILZ;
        mixEditingFeatureExtractionService2.LJIIIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2269008um(this.LLILZLL, this.LLILZIL, str2, null), 3);
        C099G c099g2 = this.LLILLL.LJIIIZ;
        if (c099g2 != null) {
            this.LL = 2;
            obj = c099g2.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
