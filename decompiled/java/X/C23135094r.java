package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.094r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C23135094r<T> extends AbstractC23133094p<T> {
    public final Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> LL;

    @Override // X.AbstractC23133094p
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("block[");
        sbLIZ.append(this.LL);
        sbLIZ.append("] -> ");
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC23133094p
    public Object collectTo(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objInvoke = this.LL.invoke(c094d, interfaceC1364105Vn);
        if (objInvoke != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objInvoke;
    }

    @Override // X.AbstractC23133094p
    public AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new C23135094r(this.LL, coroutineContext, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23135094r(Function2<? super C094D<? super T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        super(coroutineContext, i, enumC2252401DDy);
        this.LL = function2;
    }
}
