package X;

import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl$startUploadTimer$1", f = "TraceLogImpl.kt", l = {238, 239}, m = "invokeSuspend")
public final class C806060Vjg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TraceLogImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806060Vjg(TraceLogImpl traceLogImpl, InterfaceC1364105Vn<? super C806060Vjg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = traceLogImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806060Vjg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003d -> B:9:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "TraceLogImpl@8707.startUploadTimer$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L32
            if (r0 == r3) goto L1b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r7)
        L1e:
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl r0 = r6.LLILLJJLI
            boolean r0 = r0.LJ
            if (r0 == 0) goto L43
            r6.LL = r2
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L35
            X.C1C7U.LIZIZ(r5)
            return r4
        L32:
            X.C155000ia.LIZIZ(r7)
        L35:
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl r0 = r6.LLILLJJLI
            r6.LL = r3
            java.lang.Object r0 = r0.LJI(r6)
            if (r0 != r4) goto L1e
            X.C1C7U.LIZIZ(r5)
            return r4
        L43:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806060Vjg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
