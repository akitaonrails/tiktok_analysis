package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushLocalCompensationProcessor$triggerShowMessageRequestAggregatedPush$1", f = "IMInnerPushLocalCompensationProcessor.kt", l = {}, m = "invokeSuspend")
public final class C0YZH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C0Y9G> LL;
    public final /* synthetic */ C876390YZp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YZH(C876390YZp c876390YZp, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c876390YZp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YZH(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[EDGE_INSN: B:28:0x0066->B:15:0x0066 BREAK  A[LOOP:0: B:3:0x002a->B:29:0x002a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002a A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "IMInnerPushLocalCompensationProcessor@8d0b.triggerShowMessageRequestAggregatedPush$1"
            X.C1C7U.LIZ(r12)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r14)
            java.util.List<X.0Y9G> r2 = r13.LL
            Y.AComparatorS33S0000000_14 r1 = new Y.AComparatorS33S0000000_14
            r0 = 29
            r1.<init>(r0)
            java.util.List r0 = X.C13LP.LJLLLL(r1, r2)
            long r10 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r9 = r0.iterator()
        L2a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r9.next()
            X.0Y9G r1 = (X.C0Y9G) r1
            long r7 = r1.LIZLLL
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.lang.String r3 = r1.LIZ
            java.lang.String r0 = "show_as_message_request_aggregated_push_time"
            java.lang.String r0 = X.C0YNP.LJFF(r3, r0)
            if (r0 == 0) goto L8a
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L8a
            int r1 = r0.intValue()
            r0 = 2
            if (r1 >= r0) goto L2a
        L55:
            r4.add(r3)
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)
            r2.put(r3, r0)
            int r1 = r4.size()
            r0 = 3
            if (r1 != r0) goto L2a
        L66:
            X.0YZp r0 = r13.LLILLJJLI
            kotlin.jvm.functions.Function2<java.util.List<java.lang.String>, java.lang.Long, java.lang.Boolean> r1 = r0.LIZLLL
            if (r1 == 0) goto L84
            java.lang.Long r0 = X.C2286608xc.LJFF(r10)
            java.lang.Object r0 = r1.invoke(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L84
            X.0YZp r1 = r13.LLILLJJLI
            X.0Ya4 r0 = X.EnumC876540Ya4.MESSAGE_REQUEST_AGGREGATED
            r1.LIZ(r2, r0)
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        L8a:
            r1 = 0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YZH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
