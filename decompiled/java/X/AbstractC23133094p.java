package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.094p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC23133094p<T> implements InterfaceC23142094y<T> {
    public final int capacity;
    public final CoroutineContext context;
    public final EnumC2252401DDy onBufferOverflow;

    public String additionalToStringProps() {
        return null;
    }

    @Override // X.InterfaceC346201Wa
    public Object collect(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return collect$suspendImpl(this, interfaceC346701Wf, interfaceC1364105Vn);
    }

    public abstract Object collectTo(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public abstract AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy);

    public InterfaceC346201Wa<T> dropChannelOperators() {
        return null;
    }

    public final Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new C23132094o(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strAdditionalToStringProps = additionalToStringProps();
        if (strAdditionalToStringProps != null) {
            arrayList.add(strAdditionalToStringProps);
        }
        if (this.context != C23271099x.INSTANCE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("context=");
            sbLIZ.append(this.context);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.capacity != -3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("capacity=");
            sbLIZ2.append(this.capacity);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.onBufferOverflow != EnumC2252401DDy.SUSPEND) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onBufferOverflow=");
            sbLIZ3.append(this.onBufferOverflow);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(getClass().getSimpleName());
        sbLIZ4.append('[');
        sbLIZ4.append(C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62));
        sbLIZ4.append(']');
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public AnonymousClass0954<T> produceImpl(InterfaceC497601wk interfaceC497601wk) {
        CoroutineContext coroutineContext = this.context;
        int produceCapacity$kotlinx_coroutines_core = getProduceCapacity$kotlinx_coroutines_core();
        EnumC2252401DDy enumC2252401DDy = this.onBufferOverflow;
        C099V c099v = C099V.ATOMIC;
        Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        AnonymousClass0952 anonymousClass0952 = new AnonymousClass0952(C23252099e.LIZIZ(interfaceC497601wk, coroutineContext), C095G.LIZ(produceCapacity$kotlinx_coroutines_core, enumC2252401DDy, 4));
        c099v.invoke(collectToFun$kotlinx_coroutines_core, anonymousClass0952, anonymousClass0952);
        return anonymousClass0952;
    }

    public AbstractC23133094p(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        this.context = coroutineContext;
        this.capacity = i;
        this.onBufferOverflow = enumC2252401DDy;
    }

    public static /* synthetic */ <T> Object collect$suspendImpl(AbstractC23133094p<T> abstractC23133094p, InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJ = C2296808zG.LJ(new C23134094q(abstractC23133094p, interfaceC346701Wf, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[PHI: r1
      0x002f: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v2 int) binds: [B:6:0x000f, B:9:0x0014, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC23142094y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC346201Wa<T> fuse(kotlin.coroutines.CoroutineContext r4, int r5, X.EnumC2252401DDy r6) {
        /*
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            kotlin.coroutines.CoroutineContext r2 = r4.plus(r0)
            X.1DDy r0 = X.EnumC2252401DDy.SUSPEND
            if (r6 != r0) goto L1e
            int r1 = r3.capacity
            r0 = -3
            if (r1 == r0) goto L1c
            if (r5 == r0) goto L2f
            r0 = -2
            if (r1 == r0) goto L1c
            if (r5 == r0) goto L2f
            int r1 = r1 + r5
            if (r1 >= 0) goto L2f
            r5 = 2147483647(0x7fffffff, float:NaN)
        L1c:
            X.1DDy r6 = r3.onBufferOverflow
        L1e:
            kotlin.coroutines.CoroutineContext r0 = r3.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L31
            int r0 = r3.capacity
            if (r5 != r0) goto L31
            X.1DDy r0 = r3.onBufferOverflow
            if (r6 != r0) goto L31
            return r3
        L2f:
            r5 = r1
            goto L1c
        L31:
            X.094p r0 = r3.create(r2, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23133094p.fuse(kotlin.coroutines.CoroutineContext, int, X.1DDy):X.01Wa");
    }
}
