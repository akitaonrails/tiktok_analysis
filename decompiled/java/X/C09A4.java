package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09A4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A4<T> extends AbstractC23140094w implements InterfaceC346701Wf<T> {
    public CoroutineContext LL;
    public InterfaceC1364105Vn<? super Unit> LLILLJJLI;
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final InterfaceC346701Wf<T> collector;

    @Override // njp.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // njp.a, X.InterfaceC23256099i
    public InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn = this.LLILLJJLI;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    @Override // X.AbstractC23140094w, njp.a, X.InterfaceC1364105Vn
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.LL;
        return coroutineContext == null ? C23271099x.INSTANCE : coroutineContext;
    }

    @Override // X.AbstractC23140094w, njp.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // njp.a
    public Object invokeSuspend(Object obj) {
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            this.LL = new C09A3(getContext(), thM5exceptionOrNullimpl);
        }
        InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn = this.LLILLJJLI;
        if (interfaceC1364105Vn != null) {
            interfaceC1364105Vn.resumeWith(obj);
        }
        return C099R.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09A4(InterfaceC346701Wf<? super T> interfaceC346701Wf, CoroutineContext coroutineContext) {
        super(new InterfaceC1364105Vn<Object>() { // from class: X.09A5
            public static final C23271099x LLILLJJLI = C23271099x.INSTANCE;

            @Override // X.InterfaceC1364105Vn
            public final void resumeWith(Object obj) {
            }

            @Override // X.InterfaceC1364105Vn
            public final CoroutineContext getContext() {
                return LLILLJJLI;
            }
        }, C23271099x.INSTANCE);
        this.collector = interfaceC346701Wf;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, AFwS286S0000000_3.get$arr$(19))).intValue();
    }

    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn, T t) {
        CoroutineContext context = interfaceC1364105Vn.getContext();
        C23118094a.LJI(context);
        CoroutineContext coroutineContext = this.LL;
        if (coroutineContext != context) {
            if (!(coroutineContext instanceof C09A3)) {
                if (((Number) context.fold(0, new AwS617S0100000_3(this, (C09A4<?>) 46))).intValue() == this.collectContextSize) {
                    this.LL = context;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Flow invariant is violated:\n\t\tFlow was collected in ");
                    sbLIZ.append(this.collectContext);
                    sbLIZ.append(",\n\t\tbut emission happened in ");
                    sbLIZ.append(context);
                    sbLIZ.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                sbLIZ2.append(((C09A3) coroutineContext).LL);
                sbLIZ2.append(", but then emission attempt of value '");
                sbLIZ2.append(t);
                sbLIZ2.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                strLIZJ.toString();
                throw new IllegalStateException(strLIZJ);
            }
        }
        this.LLILLJJLI = interfaceC1364105Vn;
        Object objInvoke = C1455305mp.LIZ.invoke(this.collector, t, this);
        if (!Intrinsics.LJFF(objInvoke, C099R.LJFF())) {
            this.LLILLJJLI = null;
        }
        return objInvoke;
    }

    @Override // X.InterfaceC346701Wf
    public Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        try {
            Object objLIZ = LIZ(interfaceC1364105Vn, t);
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        } catch (Throwable th) {
            this.LL = new C09A3(interfaceC1364105Vn.getContext(), th);
            throw th;
        }
    }
}
