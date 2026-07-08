package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.FilePlatformMiscMultithread$onExit$1", f = "FilePlatformMiscMultithread.kt", l = {242}, m = "invokeSuspend")
public final class C445001oG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C09AE LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445001oG(long j, long j2, C09AE c09ae, InterfaceC1364105Vn<? super C445001oG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c09ae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445001oG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FilePlatformMiscMultithread@6f22.onExit$1");
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
            long jNanoTime = (this.LLILLJJLI - (System.nanoTime() - this.LLILLL)) / 1000000;
            if (jNanoTime < 0) {
                jNanoTime = 0;
            }
            C444901oF c444901oF = new C444901oF(this.LLILZ, null);
            this.LL = 1;
            obj = C099A.LIZJ(jNanoTime, c444901oF, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.onExit$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.onExit$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
