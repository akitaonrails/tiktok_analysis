package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0rjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh.AlgoRefreshManager$monitorRefreshStatus$1", f = "AlgoRefreshManager.kt", l = {57}, m = "invokeSuspend")
public final class C1600060rjw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15XY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600060rjw(C15XY c15xy, InterfaceC1364105Vn<? super C1600060rjw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15xy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1600060rjw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        b bVarLJII;
        C1C7U.LIZ("AlgoRefreshManager@cd33.monitorRefreshStatus$1");
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
            C15XY c15xy = this.LLILLJJLI;
            if (c15xy != null && (bVarLJII = c15xy.LJII(C15Y5.ALGO_REFRESH_STATUS)) != null) {
                Object obj2 = new InterfaceC346701Wf() { // from class: X.0rjr
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                        C1593970ra7 c1593970ra7 = C1593970ra7.LIZ;
                        boolean zLJFF = Intrinsics.LJFF(obj3, true);
                        c1593970ra7.getClass();
                        C1593970ra7.LIZLLL(zLJFF);
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (bVarLJII.collect(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("AlgoRefreshManager@cd33.monitorRefreshStatus$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlgoRefreshManager@cd33.monitorRefreshStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
