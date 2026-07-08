package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
public final class C322701Mz extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<Object>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322701Mz(Function2<Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> function2, InterfaceC1364105Vn<? super C322701Mz> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            Function2<Object, InterfaceC1364105Vn<Object>, Object> function2 = this.LLILZ;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = function2.invoke(obj2, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C322701Mz c322701Mz = new C322701Mz(this.LLILZ, interfaceC1364105Vn);
        c322701Mz.LLILLJJLI = interfaceC346701Wf;
        c322701Mz.LLILLL = obj;
        return c322701Mz.invokeSuspend(Unit.LIZ);
    }
}
