package X;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$run$11", f = "HybridKitConfigTask.kt", l = {}, m = "invokeSuspend")
public final class C01WE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ HybridKitConfigTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WE(Context context, HybridKitConfigTask hybridKitConfigTask, InterfaceC1364105Vn<? super C01WE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = hybridKitConfigTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HybridKitConfigTask@bec7.run$11");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((Application) this.LL).registerActivityLifecycleCallbacks(new C01CP());
        HybridKitConfigTask hybridKitConfigTask = this.LLILLJJLI;
        Context context = this.LL;
        hybridKitConfigTask.getClass();
        HybridKitConfigTask.LJIIJ(context);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridKitConfigTask@bec7.run$11");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
