package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadPhases;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.perf.lynxpreload.PdpLynxPreloadSparkManager$triggerContainerPreCreate$1$1", f = "PdpLynxPreloadSparkManager.kt", l = {122}, m = "invokeSuspend")
public final class C1165330gQl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreloadTrigger LLILLJJLI;
    public final /* synthetic */ PreloadSchema LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165330gQl(int i, PreloadSchema preloadSchema, PreloadTrigger preloadTrigger, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = preloadTrigger;
        this.LLILLL = preloadSchema;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        PreloadTrigger preloadTrigger = this.LLILLJJLI;
        return new C1165330gQl(this.LLILZ, this.LLILLL, preloadTrigger, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PreloadPhases preloadPhases;
        PreloadAction preloadAction;
        C1C7U.LIZ("PdpLynxPreloadSparkManager@fd56.triggerContainerPreCreate$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.delayMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PdpLynxPreloadSparkManager@fd56.triggerContainerPreCreate$1$1");
                return objLJFF;
            }
        }
        C1546400qLO c1546400qLO = C1546400qLO.LIZ;
        PreloadSchema preloadSchema = this.LLILLL;
        int i2 = this.LLILZ;
        c1546400qLO.getClass();
        String str = preloadSchema.url;
        if (str != null && str.length() != 0 && (preloadPhases = preloadSchema.preload) != null && (preloadAction = preloadPhases.containerPrecreate) != null && Intrinsics.LJFF(preloadAction.enabled, Boolean.TRUE)) {
            C1546360qLK c1546360qLK = C1546360qLK.LIZ;
            String str2 = preloadSchema.url;
            Integer num = preloadAction.asyncCreateContainer;
            if (num == null || num.intValue() <= 1) {
                z = false;
            }
            int i3 = preloadAction.count;
            c1546360qLK.getClass();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            C113000bo c113000bo = new C113000bo(z, str2);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(c113000bo);
            C1546360qLK.LIZJ(i2, i3, str2, z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpLynxPreloadSparkManager@fd56.triggerContainerPreCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
