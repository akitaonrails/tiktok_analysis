package X;

import Y.AgS286S0100000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.EDADataSyncEngine$startDataSyncTaskRunJob$1", f = "EDADataSyncEngine.kt", l = {443}, m = "invokeSuspend")
public final class C23185096p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EXU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23185096p(C0EXU c0exu, InterfaceC1364105Vn<? super C23185096p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0exu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23185096p(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EDADataSyncEngine@8a7.startDataSyncTaskRunJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0EXU c0exu = this.LLILLJJLI;
            C05YC<Unit> c05yc = c0exu.LLJLLIL;
            AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(c0exu, 21);
            this.LL = 1;
            if (c05yc.collect(agS286S0100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("EDADataSyncEngine@8a7.startDataSyncTaskRunJob$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
