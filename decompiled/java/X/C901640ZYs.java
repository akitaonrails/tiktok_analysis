package X;

import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMVoicePreloader$refreshMessageAndRetryPreload$1$onSuccess$1", f = "IMVoicePreloader.kt", l = {}, m = "invokeSuspend")
public final class C901640ZYs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ C901600ZYo LLILLJJLI;
    public final /* synthetic */ C901670ZYv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901640ZYs(C869590Y9l c869590Y9l, C901600ZYo c901600ZYo, C901670ZYv c901670ZYv, InterfaceC1364105Vn<? super C901640ZYs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = c901600ZYo;
        this.LLILLL = c901670ZYv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901640ZYs(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        C1C7U.LIZ("IMVoicePreloader@97ac.refreshMessageAndRetryPreload$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
        C869590Y9l c869590Y9l = this.LL;
        iMVoiceMessageUtil.getClass();
        String strLIZIZ = IMVoiceMessageUtil.LIZIZ(c869590Y9l);
        C901600ZYo c901600ZYo = this.LLILLJJLI;
        C869590Y9l c869590Y9l2 = this.LL;
        c901600ZYo.getClass();
        String strLJFF = C901600ZYo.LJFF(c869590Y9l2);
        if (strLJFF != null && strLJFF.length() != 0) {
            this.LLILLJJLI.LJIIIIZZ(new C901670ZYv(this.LL, this.LLILLL.LIZ, strLIZIZ, strLJFF), strLJFF);
        } else {
            IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
            if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
                interfaceC1335605KoLIZIZ.onFailed(this.LLILLL.LIZ);
            }
            this.LLILLJJLI.LJI(this.LLILLL.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMVoicePreloader@97ac.refreshMessageAndRetryPreload$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
