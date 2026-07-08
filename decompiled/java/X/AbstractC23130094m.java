package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.094m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC23130094m<S, T> extends AbstractC23133094p<T> {
    public final InterfaceC346201Wa<S> LL;

    public abstract Object LJ(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    @Override // X.AbstractC23133094p
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" -> ");
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC23133094p, X.InterfaceC346201Wa
    public final Object collect(final InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        CoroutineContext coroutineContextLIZ;
        if (this.capacity == -3) {
            CoroutineContext context = interfaceC1364105Vn.getContext();
            CoroutineContext coroutineContext = this.context;
            if (!((Boolean) coroutineContext.fold(Boolean.FALSE, AFwS286S0000000_3.get$arr$(15))).booleanValue()) {
                coroutineContextLIZ = context.plus(coroutineContext);
            } else {
                coroutineContextLIZ = C23252099e.LIZ(context, coroutineContext, false);
            }
            if (Intrinsics.LJFF(coroutineContextLIZ, context)) {
                Object objLJ = LJ(interfaceC346701Wf, interfaceC1364105Vn);
                if (objLJ != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJ;
            }
            C23138094u c23138094u = InterfaceC23139094v.LJJLIIJ;
            if (Intrinsics.LJFF(coroutineContextLIZ.get(c23138094u), context.get(c23138094u))) {
                final CoroutineContext context2 = interfaceC1364105Vn.getContext();
                if (!(interfaceC346701Wf instanceof C094X) && !(interfaceC346701Wf instanceof C23131094n)) {
                    interfaceC346701Wf = (InterfaceC346701Wf<? super T>) new InterfaceC346701Wf<T>(interfaceC346701Wf, context2) { // from class: X.01dY
                        public final CoroutineContext LL;
                        public final Object LLILLJJLI;
                        public final C378501dX LLILLL;

                        {
                            this.LL = context2;
                            this.LLILLJJLI = C09AQ.LIZIZ(context2);
                            this.LLILLL = new C378501dX(interfaceC346701Wf, null);
                        }

                        @Override // X.InterfaceC346701Wf
                        public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn2) {
                            Object objLIZ = C099W.LIZ(this.LL, t, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn2);
                            if (objLIZ == C099R.LJFF()) {
                                return objLIZ;
                            }
                            return Unit.LIZ;
                        }
                    };
                }
                Object objLIZ = C099W.LIZ(coroutineContextLIZ, interfaceC346701Wf, C09AQ.LIZIZ(coroutineContextLIZ), new C382001e6(this, null), interfaceC1364105Vn);
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
                if (objLIZ == C099R.LJFF()) {
                    return objLIZ;
                }
                return Unit.LIZ;
            }
        }
        Object objCollect = super.collect(interfaceC346701Wf, interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public final Object collectTo(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJ = LJ(new C094X(c094d), interfaceC1364105Vn);
        if (objLJ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJ;
    }

    public AbstractC23130094m(int i, CoroutineContext coroutineContext, EnumC2252401DDy enumC2252401DDy, InterfaceC346201Wa interfaceC346201Wa) {
        super(coroutineContext, i, enumC2252401DDy);
        this.LL = interfaceC346201Wa;
    }
}
