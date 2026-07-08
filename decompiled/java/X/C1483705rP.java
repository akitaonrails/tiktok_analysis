package X;

import com.ss.android.ugc.aweme.cubes.GoogleCubesService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cubes.GoogleCubesService$init$1$onInitSuccess$1", f = "GoogleCubesService.kt", l = {60}, m = "invokeSuspend")
public final class C1483705rP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GoogleCubesService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483705rP(GoogleCubesService googleCubesService, InterfaceC1364105Vn<? super C1483705rP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = googleCubesService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1483705rP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoogleCubesService@1ca4.init$1$onInitSuccess$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setup launch task: ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C2188811AlT.LIZIZ(sbLIZ);
            long millis = TimeUnit.MINUTES.toMillis(8L);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(millis, this) == objLJFF) {
                C1C7U.LIZIZ("GoogleCubesService@1ca4.init$1$onInitSuccess$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ(EnumC1483805rQ.UPDATE_BY_LAUNCH, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoogleCubesService@1ca4.init$1$onInitSuccess$1");
        return unit;
    }
}
