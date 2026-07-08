package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.SocialAsyncTaskScheduler$start$runTasks$job$1$result$1", f = "SocialAsyncTaskScheduler.kt", l = {173}, m = "invokeSuspend")
public final class C20169413vw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C20170413w6>, Object> {
    public int LL;
    public final /* synthetic */ C20169913w1<Object> LLILLJJLI;
    public final /* synthetic */ C20169813w0<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20169413vw(C20169913w1<Object> c20169913w1, C20169813w0<Object> c20169813w0, InterfaceC1364105Vn<? super C20169413vw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20169913w1;
        this.LLILLL = c20169813w0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20169413vw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1$result$1");
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
            C20169913w1<Object> c20169913w1 = this.LLILLJJLI;
            C20169813w0<Object> c20169813w0 = this.LLILLL;
            this.LL = 1;
            obj = c20169913w1.LJ(c20169813w0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAsyncTaskScheduler@5632.start$runTasks$job$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
