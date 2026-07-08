package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$tickerFlow$1", f = "MinisFpsMonitorAssem.kt", l = {205, 206}, m = "invokeSuspend")
public final class C396701gT extends C09AX implements Function2<InterfaceC346701Wf<? super Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C396701gT(long j, InterfaceC1364105Vn<? super C396701gT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C396701gT c396701gT = new C396701gT(this.LLILLL, interfaceC1364105Vn);
        c396701gT.LLILLJJLI = obj;
        return c396701gT;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MinisFpsMonitorAssem@393b.tickerFlow$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L34
            if (r0 != r4) goto L59
            java.lang.Object r2 = r7.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r8)
        L1a:
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            boolean r0 = X.C23118094a.LJIIIIZZ(r0)
            if (r0 == 0) goto L53
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r7.LLILLJJLI = r2
            r7.LL = r3
            java.lang.Object r0 = r2.emit(r0, r7)
            if (r0 != r5) goto L3b
            X.C1C7U.LIZIZ(r6)
            return r5
        L34:
            java.lang.Object r2 = r7.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r8)
        L3b:
            long r0 = r7.LLILLL
            r7.LLILLJJLI = r2
            r7.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r5
        L4b:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            goto L1a
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C396701gT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Unit> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
