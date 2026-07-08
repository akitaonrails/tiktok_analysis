package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {748, 751, 754}, m = "invokeSuspend")
public final class C20082913hz extends C09AX implements Function2<C1395705dD, InterfaceC1364105Vn<? super C1395705dD>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ C20082713hx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20082913hz(C20082713hx c20082713hx, InterfaceC1364105Vn<? super C20082913hz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c20082713hx;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r5 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L3e
            if (r0 == r7) goto L5a
            if (r0 != r5) goto L7a
            long r10 = r12.LL
            long r2 = r12.LLILLL
            X.C155000ia.LIZIZ(r13)
        L18:
            X.05dD r13 = (X.C1395705dD) r13
            long r0 = r13.LIZ
            long r0 = X.C1395705dD.LIZLLL(r10, r0)
            long r1 = X.C1395705dD.LIZLLL(r2, r0)
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r13)
            long r2 = r12.LLILLL
            X.13hx r0 = r12.LLILZ
            X.13iT r0 = r0.LJFF
            r12.LLILLL = r2
            r12.LLILLJJLI = r1
            java.lang.Object r13 = r0.LIZJ(r2, r12)
            if (r13 != r6) goto L43
            return r6
        L3e:
            long r2 = r12.LLILLL
            X.C155000ia.LIZIZ(r13)
        L43:
            X.05dD r13 = (X.C1395705dD) r13
            long r0 = r13.LIZ
            long r0 = X.C1395705dD.LIZLLL(r2, r0)
            X.13hx r4 = r12.LLILZ
            r12.LLILLL = r2
            r12.LL = r0
            r12.LLILLJJLI = r7
            java.lang.Object r13 = r4.LIZIZ(r0, r12)
            if (r13 != r6) goto L61
            return r6
        L5a:
            long r0 = r12.LL
            long r2 = r12.LLILLL
            X.C155000ia.LIZIZ(r13)
        L61:
            X.05dD r13 = (X.C1395705dD) r13
            long r10 = r13.LIZ
            X.13hx r4 = r12.LLILZ
            X.13iT r7 = r4.LJFF
            long r8 = X.C1395705dD.LIZLLL(r0, r10)
            r12.LLILLL = r2
            r12.LL = r10
            r12.LLILLJJLI = r5
            java.lang.Object r13 = r7.LIZ(r8, r10, r12)
            if (r13 != r6) goto L18
            return r6
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20082913hz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20082913hz c20082913hz = new C20082913hz(this.LLILZ, interfaceC1364105Vn);
        c20082913hz.LLILLL = ((C1395705dD) obj).LIZ;
        return c20082913hz;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1395705dD c1395705dD, InterfaceC1364105Vn<? super C1395705dD> interfaceC1364105Vn) {
        return ((a) create(new C1395705dD(c1395705dD.LIZ), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
