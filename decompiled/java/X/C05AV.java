package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.RecordTimerKt$RecordTimer$1$1$1$1", f = "RecordTimer.kt", l = {41, 44}, m = "invokeSuspend")
public final class C05AV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C05P0<Long> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AV(C05P0<Boolean> c05p0, C05P0<Long> c05p02, InterfaceC1364105Vn<? super C05AV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:7:0x0016). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "RecordTimerKt@721f.RecordTimer$1$1$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r8.LL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L3b
            if (r1 == r0) goto L4c
            if (r1 != r2) goto L57
            X.C155000ia.LIZIZ(r9)
        L16:
            X.05P0<java.lang.Long> r6 = r8.LLILLL
            java.lang.Object r0 = r6.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r0 = 100
            long r0 = (long) r0
            long r4 = r4 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r6.setValue(r0)
        L2d:
            r8.LL = r2
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r7)
            return r3
        L3b:
            X.C155000ia.LIZIZ(r9)
            r8.LL = r0
            r0 = 250(0xfa, double:1.235E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r3) goto L4f
            X.C1C7U.LIZIZ(r7)
            return r3
        L4c:
            X.C155000ia.LIZIZ(r9)
        L4f:
            X.05P0<java.lang.Boolean> r1 = r8.LLILLJJLI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            goto L2d
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05AV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
