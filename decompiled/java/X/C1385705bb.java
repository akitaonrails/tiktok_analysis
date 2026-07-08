package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.ModuleStayTimeTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.ModuleStayTimeTracker$start$1", f = "ModuleStayTimeTracker.kt", l = {64}, m = "invokeSuspend")
public final class C1385705bb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ModuleStayTimeTracker LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385705bb(ModuleStayTimeTracker moduleStayTimeTracker, InterfaceC1364105Vn<? super C1385705bb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = moduleStayTimeTracker;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1385705bb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:6:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "ModuleStayTimeTracker@35d1.start$1"
            X.C1C7U.LIZ(r12)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r13.LL
            r6 = 1
            if (r0 == 0) goto L8a
            if (r0 != r6) goto L9b
            X.C155000ia.LIZIZ(r14)
        L13:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.ModuleStayTimeTracker r10 = r13.LLILLJJLI
            boolean r0 = r10.LLILZIL
            if (r0 != 0) goto L8d
            java.util.Map<java.lang.String, X.05mv> r5 = r10.LLILLJJLI
            int r4 = r10.LLILLL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r10.LLILZLL
            java.util.Set r1 = r0.keySet()
            java.util.Set r0 = r5.keySet()
            java.util.Set r0 = X.C15442062u.LJII(r1, r0)
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r10.LLILZLL
            r0.remove(r1)
            goto L2f
        L3f:
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r11 = r0.iterator()
        L47:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r9 = r11.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r8 = r10.LLILZLL
            java.lang.Object r0 = r8.get(r9)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L6a
            long r2 = r0.longValue()
        L5f:
            r0 = 1
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.put(r9, r0)
            goto L47
        L6a:
            r2 = 0
            goto L5f
        L6d:
            java.util.HashMap r2 = new java.util.HashMap
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r10.LLILZLL
            r2.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList<X.05bc> r0 = r10.LLIZ
            java.util.Iterator r1 = r0.iterator()
        L7a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r1.next()
            X.05bc r0 = (X.InterfaceC1385805bc) r0
            r0.c9(r4, r2, r5)
            goto L7a
        L8a:
            X.C155000ia.LIZIZ(r14)
        L8d:
            r13.LL = r6
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r13)
            if (r0 != r7) goto L13
            X.C1C7U.LIZIZ(r12)
            return r7
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1385705bb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
