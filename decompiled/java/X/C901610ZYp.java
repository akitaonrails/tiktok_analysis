package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMVoicePreloader$awaitMdlWarmCompletion$1", f = "IMVoicePreloader.kt", l = {302}, m = "invokeSuspend")
public final class C901610ZYp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C901600ZYo LLILLL;
    public final /* synthetic */ C901670ZYv LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901610ZYp(C901600ZYo c901600ZYo, C901670ZYv c901670ZYv, String str, String str2, InterfaceC1364105Vn<? super C901610ZYp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c901600ZYo;
        this.LLILZ = c901670ZYv;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901610ZYp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        C1C7U.LIZ("IMVoicePreloader@97ac.awaitMdlWarmCompletion$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                jCurrentTimeMillis = System.currentTimeMillis() + this.LLILLL.LIZ.LIZIZ;
            }
            while (System.currentTimeMillis() < jCurrentTimeMillis) {
                if (!this.LLILLL.LJII.containsKey(this.LLILZ.LIZ)) {
                    Unit unit = Unit.LIZ;
                    this.LLILLL.LJIIIIZZ.remove(this.LLILZ.LIZ);
                    C1C7U.LIZIZ("IMVoicePreloader@97ac.awaitMdlWarmCompletion$1");
                    return unit;
                }
                if (this.LLILLL.LJII(this.LLILZIL, this.LLILZLL)) {
                    C901600ZYo c901600ZYo = this.LLILLL;
                    String str = this.LLILZ.LIZ;
                    c901600ZYo.getClass();
                    IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
                    if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
                        interfaceC1335605KoLIZIZ.LIZJ(str);
                    }
                    this.LLILLL.LJII.remove(this.LLILZ.LIZ);
                    this.LLILLL.LJI(this.LLILZ.LIZ);
                    Unit unit2 = Unit.LIZ;
                    this.LLILLL.LJIIIIZZ.remove(this.LLILZ.LIZ);
                    C1C7U.LIZIZ("IMVoicePreloader@97ac.awaitMdlWarmCompletion$1");
                    return unit2;
                }
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                    C1C7U.LIZIZ("IMVoicePreloader@97ac.awaitMdlWarmCompletion$1");
                    return objLJFF;
                }
            }
            this.LLILLL.LJII.remove(this.LLILZ.LIZ);
            this.LLILLL.LJI(this.LLILZ.LIZ);
            this.LLILLL.LJIIIIZZ.remove(this.LLILZ.LIZ);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("IMVoicePreloader@97ac.awaitMdlWarmCompletion$1");
            return unit3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LJIIIIZZ.remove(this.LLILZ.LIZ);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
