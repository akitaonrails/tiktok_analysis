package X;

import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.AVDraftMigrateServiceImpl$observeMigrateFlowStatus$1$1$1$1$1", f = "AVDraftMigrateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05MY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<MigrateTaskStatus, Unit> LL;
    public final /* synthetic */ MigrateTaskStatus LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05MY(Function1<? super MigrateTaskStatus, Unit> function1, MigrateTaskStatus migrateTaskStatus, InterfaceC1364105Vn<? super C05MY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = migrateTaskStatus;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05MY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AVDraftMigrateServiceImpl@f318.observeMigrateFlowStatus$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AVDraftMigrateServiceImpl@f318.observeMigrateFlowStatus$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
