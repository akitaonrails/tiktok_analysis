package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.publish.save.controll.EPModelUpdateExecutor$execute$1$taskFlow$1", f = "EPSyncTaskManager.kt", l = {327}, m = "invokeSuspend")
public final class C353420DtM extends C09AX implements Function2<InterfaceC346701Wf<? super Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC350230DoD LLILLL;
    public final /* synthetic */ C348820Dlw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353420DtM(InterfaceC350230DoD interfaceC350230DoD, C348820Dlw c348820Dlw, InterfaceC1364105Vn<? super C353420DtM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC350230DoD;
        this.LLILZ = c348820Dlw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353420DtM c353420DtM = new C353420DtM(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c353420DtM.LLILLJJLI = obj;
        return c353420DtM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPModelUpdateExecutor@6e21.execute$1$taskFlow$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C350200DoA.LIZIZ(this.LLILLL, this.LLILZ);
            Unit unit = Unit.LIZ;
            this.LL = 1;
            if (interfaceC346701Wf.emit(unit, this) == objLJFF) {
                C1C7U.LIZIZ("EPModelUpdateExecutor@6e21.execute$1$taskFlow$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPModelUpdateExecutor@6e21.execute$1$taskFlow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Unit> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
