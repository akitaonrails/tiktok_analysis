package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.EDADataSyncEngine$startDataSyncTaskRunJob$1$1$1$1", f = "EDADataSyncEngine.kt", l = {451}, m = "invokeSuspend")
public final class C096A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EXU LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C096A(C0EXU c0exu, NLEModel nLEModel, InterfaceC1364105Vn<? super C096A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0exu;
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C096A(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EDADataSyncEngine@8a7.startDataSyncTaskRunJob$1$1$1$1");
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
            C0EXU c0exu = this.LLILLJJLI;
            NLEModel nLEModel = c0exu.LLILZLL;
            NLEModel nLEModel2 = this.LLILLL;
            this.LL = 1;
            if (c0exu.k5(nLEModel, nLEModel2, this) == objLJFF) {
                C1C7U.LIZIZ("EDADataSyncEngine@8a7.startDataSyncTaskRunJob$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EDADataSyncEngine@8a7.startDataSyncTaskRunJob$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
