package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AILiveI2VTask$loopRefreshProgress$1", f = "AILiveI2VTask.kt", l = {480, 483}, m = "invokeSuspend")
public final class C539130LCl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C543160LRy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539130LCl(C543160LRy c543160LRy, InterfaceC1364105Vn<? super C539130LCl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c543160LRy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539130LCl(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AILiveI2VTask@dffe.loopRefreshProgress$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 100
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 == r2) goto L38
            if (r0 != r3) goto L58
            int r0 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L1a:
            if (r0 >= r4) goto L60
        L1c:
            X.0LRy r0 = r7.LLILLL
            X.0LSZ r0 = r0.LIZLLL
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = "STARTED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L60
            X.0LRy r0 = r7.LLILLL
            r7.LLILLJJLI = r2
            java.lang.Object r0 = r0.LJJJJZ(r7)
            if (r0 != r5) goto L3b
            X.C1C7U.LIZIZ(r6)
            return r5
        L38:
            X.C155000ia.LIZIZ(r8)
        L3b:
            X.0LRy r0 = r7.LLILLL
            X.0LSZ r0 = r0.LIZLLL
            int r0 = r0.LJII
            if (r0 >= r4) goto L60
            r7.LL = r0
            r7.LLILLJJLI = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r5
        L53:
            X.C155000ia.LIZIZ(r8)
            r0 = 0
            goto L1a
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L60:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539130LCl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
