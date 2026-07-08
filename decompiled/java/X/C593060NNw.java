package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadModule$startIdleCheckPolling$1", f = "CommerceIDLEPreloadModule.kt", l = {92, 105}, m = "invokeSuspend")
public final class C593060NNw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C593080NNy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593060NNw(C593080NNy c593080NNy, InterfaceC1364105Vn<? super C593060NNw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c593080NNy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C593060NNw c593060NNw = new C593060NNw(this.LLILLL, interfaceC1364105Vn);
        c593060NNw.LLILLJJLI = obj;
        return c593060NNw;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0065 -> B:7:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:7:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "CommerceIDLEPreloadModule@18dd.startIdleCheckPolling$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L97
            if (r0 == r3) goto L32
            if (r0 != r4) goto La6
            java.lang.Object r0 = r9.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r10)
        L1a:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto La0
            X.0NNy r1 = r9.LLILLL
            long r1 = r1.LJIILIIL
            r9.LLILLJJLI = r0
            r9.LL = r3
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r9)
            if (r1 != r5) goto L39
            X.C1C7U.LIZIZ(r8)
            return r5
        L32:
            java.lang.Object r0 = r9.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r10)
        L39:
            X.0NNy r1 = r9.LLILLL
            X.0cIt r1 = r1.LJIIL
            boolean r1 = r1.LIZ()
            r7 = 0
            if (r1 == 0) goto L70
            X.0NNy r2 = r9.LLILLL
            int r1 = r2.LJII
            int r1 = r1 + 1
            r2.LJII = r1
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "checkResAvailable consecutiveIdlePolls = "
            r2.append(r1)
            X.0NNy r1 = r9.LLILLL
            int r1 = r1.LJII
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            X.0NNy r6 = r9.LLILLL
            int r2 = r6.LJII
            int r1 = r6.LJIILJJIL
            if (r2 < r1) goto L1a
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.LJI
            r1.set(r7)
            r6.LJFF()
            goto L1a
        L70:
            X.0NNy r1 = r9.LLILLL
            r1.LJII = r7
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "check Res unavailable consecutiveIdlePolls = "
            r2.append(r1)
            X.0NNy r1 = r9.LLILLL
            int r1 = r1.LJII
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            X.0NNy r1 = r9.LLILLL
            r9.LLILLJJLI = r0
            r9.LL = r4
            java.lang.Object r1 = r1.LIZ(r9)
            if (r1 != r5) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r5
        L97:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r0 = r9.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L1a
        La0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593060NNw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
