package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.GraphNode$produce$2", f = "FlowGraph.kt", l = {64, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C532400KuM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC532390KuL<Object>>, Object> {
    public int LL;
    public final /* synthetic */ C532440KuQ<Object, Object, Object> LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532400KuM(C532440KuQ<Object, Object, Object> c532440KuQ, Object obj, InterfaceC1364105Vn<? super C532400KuM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532440KuQ;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532400KuM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "GraphNode@7b1c.produce$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L24
            if (r0 == r2) goto L3f
            if (r0 != r3) goto L6e
            X.C155000ia.LIZIZ(r7)
        L16:
            if (r7 != 0) goto L1e
            X.0KuP r0 = X.C532430KuP.LIZ
        L1a:
            X.C1C7U.LIZIZ(r5)
            return r0
        L1e:
            X.0KuN r0 = new X.0KuN
            r0.<init>(r7)
            goto L1a
        L24:
            X.C155000ia.LIZIZ(r7)
            X.0KuQ<java.lang.Object, java.lang.Object, java.lang.Object> r0 = r6.LLILLJJLI
            X.0KuV<IN, OUT> r1 = r0.LIZ
            boolean r0 = r1 instanceof X.InterfaceC532470KuT
            if (r0 == 0) goto L5a
            X.0KuT r1 = (X.InterfaceC532470KuT) r1
            java.lang.Object r0 = r6.LLILLL
            r6.LL = r2
            java.lang.Object r2 = r1.LIZIZ(r0, r6)
            if (r2 != r4) goto L48
            X.C1C7U.LIZIZ(r5)
            return r4
        L3f:
            X.C155000ia.LIZIZ(r7)
            X.00o6 r7 = (X.C189200o6) r7
            java.lang.Object r2 = r7.m10unboximpl()
        L48:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 != 0) goto L54
            X.0KuN r0 = new X.0KuN
            r0.<init>(r2)
            goto L1a
        L54:
            X.0KuO r0 = new X.0KuO
            r0.<init>(r1)
            goto L1a
        L5a:
            boolean r0 = r1 instanceof X.InterfaceC532480KuU
            if (r0 == 0) goto L76
            X.0KuU r1 = (X.InterfaceC532480KuU) r1
            java.lang.Object r0 = r6.LLILLL
            r6.LL = r3
            java.lang.Object r7 = r1.LIZ(r0, r6)
            if (r7 != r4) goto L16
            X.C1C7U.LIZIZ(r5)
            return r4
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FlowGraph node '"
            r1.append(r0)
            X.0KuQ<java.lang.Object, java.lang.Object, java.lang.Object> r0 = r6.LLILLJJLI
            X.0KuV<IN, OUT> r0 = r0.LIZ
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = "' must be created via flowNode/resultFlowNode/actionNode"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532400KuM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC532390KuL<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
