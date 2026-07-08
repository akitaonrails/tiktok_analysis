package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", l = {316, 318, 319}, m = "invokeSuspend")
public final class C457901qL extends C09AX implements Function2<C094D<? super Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457901qL(long j, long j2, InterfaceC1364105Vn<? super C457901qL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C457901qL c457901qL = new C457901qL(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c457901qL.LLILLJJLI = obj;
        return c457901qL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:13:0x0034). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 == r3) goto L2d
            if (r0 == r4) goto L44
            if (r0 == r5) goto L2d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            X.094D r2 = (X.C094D) r2
            long r0 = r7.LLILLL
            r7.LLILLJJLI = r2
            r7.LL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r6) goto L34
            return r6
        L2d:
            java.lang.Object r2 = r7.LLILLJJLI
            X.094D r2 = (X.C094D) r2
            X.C155000ia.LIZIZ(r8)
        L34:
            r2.getChannel()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r7.LLILLJJLI = r2
            r7.LL = r4
            java.lang.Object r0 = r2.LJIJI(r0, r7)
            if (r0 != r6) goto L4b
            return r6
        L44:
            java.lang.Object r2 = r7.LLILLJJLI
            X.094D r2 = (X.C094D) r2
            X.C155000ia.LIZIZ(r8)
        L4b:
            long r0 = r7.LLILZ
            r7.LLILLJJLI = r2
            r7.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r6) goto L34
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C457901qL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Unit> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
