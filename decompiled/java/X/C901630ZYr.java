package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMVoicePreloader$executeDownload$3", f = "IMVoicePreloader.kt", l = {421}, m = "invokeSuspend")
public final class C901630ZYr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C901600ZYo LLILLJJLI;
    public final /* synthetic */ C901670ZYv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901630ZYr(C901600ZYo c901600ZYo, C901670ZYv c901670ZYv, InterfaceC1364105Vn<? super C901630ZYr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c901600ZYo;
        this.LLILLL = c901670ZYv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901630ZYr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        C1C7U.LIZ("IMVoicePreloader@97ac.executeDownload$3");
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
            long j = this.LLILLJJLI.LIZ.LIZIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IMVoicePreloader@97ac.executeDownload$3");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LIZJ.containsKey(this.LLILLL.LIZ)) {
            IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
            if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
                interfaceC1335605KoLIZIZ.LIZ(this.LLILLL.LIZ);
            }
            this.LLILLJJLI.LJJIIJ(this.LLILLL.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMVoicePreloader@97ac.executeDownload$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
