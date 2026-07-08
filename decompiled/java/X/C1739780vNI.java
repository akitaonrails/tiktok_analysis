package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.libra.NativePrefetchConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.prefetch.manager.NativePerfetchManager$startPrefetch$job$1", f = "NativePerfetchManager.kt", l = {173}, m = "invokeSuspend")
public final class C1739780vNI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1739860vNQ LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<C1739860vNQ, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739780vNI(C1739860vNQ c1739860vNQ, String str, String str2, String str3, Map map, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1739860vNQ;
        this.LLILZ = map;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C1739780vNI(this.LLILLL, str, this.LLILZIL, this.LLILZLL, this.LLILZ, interfaceC1364105Vn, this.LLIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NativePrefetchConfig.NativePrefetchConfigModel nativePrefetchConfigModel;
        long jLongValue;
        C1C7U.LIZ("NativePerfetchManager@9cd3.startPrefetch$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                try {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    nativePrefetchConfigModel = NativePrefetchConfig.LIZ;
                    NativePrefetchConfig.NativePrefetchConfigModel nativePrefetchConfigModel2 = (NativePrefetchConfig.NativePrefetchConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_ug_native_prefetch_config", NativePrefetchConfig.NativePrefetchConfigModel.class, nativePrefetchConfigModel);
                    if (nativePrefetchConfigModel2 != null) {
                        nativePrefetchConfigModel = nativePrefetchConfigModel2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    nativePrefetchConfigModel = NativePrefetchConfig.LIZ;
                }
                Long l = nativePrefetchConfigModel.networkTimeout;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 10000;
                }
                C1739990vNd c1739990vNd = new C1739990vNd(this.LLILLL, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLILZ, null, this.LLIZ);
                this.LL = 1;
                if (C099A.LIZIZ(jLongValue, c1739990vNd, this) == objLJFF) {
                    C1C7U.LIZIZ("NativePerfetchManager@9cd3.startPrefetch$job$1");
                    return objLJFF;
                }
            }
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            C1739950vNZ c1739950vNZ = C1739950vNZ.LIZ;
            String str = this.LLILLJJLI;
            c1739950vNZ.getClass();
            C1739950vNZ.LIZ("prefetch_timeout", null, str);
            this.LLILLL.LIZJ("request_timeout", true, true);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1739950vNZ c1739950vNZ2 = C1739950vNZ.LIZ;
            String message = e2.getMessage();
            String str2 = this.LLILLJJLI;
            c1739950vNZ2.getClass();
            C1739950vNZ.LIZ("prefetch_exception", message, str2);
            this.LLILLL.LIZJ(e2.getMessage(), false, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NativePerfetchManager@9cd3.startPrefetch$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
