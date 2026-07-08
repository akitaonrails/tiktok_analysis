package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.analytics.userexperience.PerformanceTaggingProvider$triggerTimeoutMechanism$1", f = "PerformanceTaggingProvider.kt", l = {167}, m = "invokeSuspend")
public final class C1495005tE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1495105tF LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495005tE(C1495105tF c1495105tF, String str, InterfaceC1364105Vn<? super C1495005tE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1495105tF;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1495005tE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PerformanceTaggingProvider@3113.triggerTimeoutMechanism$1");
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
            long j = ((AtomicLong) this.LLILLJJLI.LIZLLL.getValue()).get();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PerformanceTaggingProvider@3113.triggerTimeoutMechanism$1");
                return objLJFF;
            }
        }
        if (!Intrinsics.LJFF(((AtomicReference) this.LLILLJJLI.LJI.getValue()).get(), this.LLILLL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PerformanceTaggingProvider@3113.triggerTimeoutMechanism$1");
            return unit;
        }
        if (((AtomicBoolean) this.LLILLJJLI.LJII.getValue()).compareAndSet(false, true)) {
            Map<String, String> mapLIZLLL = C1495105tF.LIZLLL(this.LLILLJJLI);
            if (mapLIZLLL.isEmpty()) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PerformanceTaggingProvider@3113.triggerTimeoutMechanism$1");
                return unit2;
            }
            ((InterfaceC1493105sv) this.LLILLJJLI.LJIIIIZZ.getValue()).sendEvent(this.LLILLJJLI.LIZ, mapLIZLLL);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("PerformanceTaggingProvider@3113.triggerTimeoutMechanism$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("PerformanceTaggingProvider@3113.triggerTimeoutMechanism$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
