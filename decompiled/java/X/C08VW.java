package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08VW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.resourcemanage.initializer.DMResourcePerformanceOptInitializer$CommonPerformanceOptTask$1$4$1", f = "DMResourcePerformanceOptInitializer.kt", l = {61}, m = "invokeSuspend")
public final class C08VW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AtomicBoolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VW(AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C08VW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08VW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMResourcePerformanceOptInitializer$CommonPerformanceOptTask@3592.1$4$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("DMResourcePerformanceOptInitializer$CommonPerformanceOptTask@3592.1$4$1");
                return objLJFF;
            }
        }
        JatoXL.resetPriority(Process.myTid());
        JatoXL.resetRenderThread();
        this.LLILLJJLI.set(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMResourcePerformanceOptInitializer$CommonPerformanceOptTask@3592.1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
