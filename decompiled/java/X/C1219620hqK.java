package X;

import com.bytedance.android.livesdk.guide.model.TaskReportResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$requestTaskReport$2", f = "TaskApiUtils.kt", l = {345}, m = "invokeSuspend")
public final class C1219620hqK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TaskReportResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219620hqK(String str, long j, long j2, int i, InterfaceC1364105Vn<? super C1219620hqK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219620hqK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskReport$2");
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
            C099F c099fLIZIZ = C090F.LIZIZ();
            C1219670hqP.LJII(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, new AwS668S0100000_19(c099fLIZIZ, 41), new AwS633S0100000_19(c099fLIZIZ, 236));
            this.LL = 1;
            obj = c099fLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskReport$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskReport$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TaskReportResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
