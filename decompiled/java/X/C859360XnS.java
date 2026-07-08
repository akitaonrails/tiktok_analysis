package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dot.request.RedDotPolling$polling$1", f = "RedDotPolling.kt", l = {99, 101}, m = "invokeSuspend")
public final class C859360XnS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859360XnS(long j, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859360XnS(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    /* JADX WARN: Path cross not found for [B:13:0x0026, B:21:0x0042], limit reached: 29 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003c -> B:26:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004a -> B:26:0x0053). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "RedDotPolling@1325.polling$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L1b
            if (r0 == r7) goto L50
            if (r0 == r8) goto L50
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r12)
        L1e:
            boolean r0 = com.ss.android.ugc.aweme.dot.request.RedDotPolling.LLILZLL
            if (r0 == 0) goto L5c
            boolean r0 = r11.LLILLJJLI
            if (r0 != 0) goto L42
            long r3 = com.ss.android.ugc.aweme.dot.request.RedDotPolling.LLILZ
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L42
            long r1 = r11.LLILLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L42
            com.ss.android.ugc.aweme.dot.request.RedDotPolling.LLILZ = r5
            r11.LL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r11)
            if (r0 != r9) goto L53
            X.C1C7U.LIZIZ(r10)
            return r9
        L42:
            long r0 = r11.LLILLL
            r11.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)
            if (r0 != r9) goto L53
            X.C1C7U.LIZIZ(r10)
            return r9
        L50:
            X.C155000ia.LIZIZ(r12)
        L53:
            com.ss.android.ugc.aweme.dot.request.RedDotPolling r0 = com.ss.android.ugc.aweme.dot.request.RedDotPolling.LL
            r0.getClass()
            com.ss.android.ugc.aweme.dot.request.RedDotPolling.LIZLLL()
            goto L1e
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859360XnS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
