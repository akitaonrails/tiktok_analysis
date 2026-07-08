package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {354, 355, 360}, m = "invokeSuspend")
public final class C1369605Xq extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function2<C20066813fO, C1378605aS, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369605Xq(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function0 function02, Function1 function1, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = function1;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1369605Xq c1369605Xq = new C1369605Xq(interfaceC1364105Vn, this.LLILZIL, this.LLILZLL, this.LLILZ, this.LLIZ);
        c1369605Xq.LLILLL = obj;
        return c1369605Xq;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[Catch: CancellationException -> 0x00af, TryCatch #0 {CancellationException -> 0x00af, blocks: (B:26:0x0078, B:27:0x007b, B:29:0x0083, B:31:0x008f, B:33:0x009b, B:34:0x009e, B:35:0x00a1, B:36:0x00a7, B:20:0x004f, B:21:0x0052, B:23:0x0056, B:16:0x003d, B:17:0x0040, B:13:0x0030), top: B:42:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: CancellationException -> 0x00af, TryCatch #0 {CancellationException -> 0x00af, blocks: (B:26:0x0078, B:27:0x007b, B:29:0x0083, B:31:0x008f, B:33:0x009b, B:34:0x009e, B:35:0x00a1, B:36:0x00a7, B:20:0x004f, B:21:0x0052, B:23:0x0056, B:16:0x003d, B:17:0x0040, B:13:0x0030), top: B:42:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7 A[Catch: CancellationException -> 0x00af, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00af, blocks: (B:26:0x0078, B:27:0x007b, B:29:0x0083, B:31:0x008f, B:33:0x009b, B:34:0x009e, B:35:0x00a1, B:36:0x00a7, B:20:0x004f, B:21:0x0052, B:23:0x0056, B:16:0x003d, B:17:0x0040, B:13:0x0030), top: B:42:0x000a }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r8 = X.C099R.LJFF()
            int r1 = r9.LLILLJJLI
            r5 = 0
            r7 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L24
            if (r1 == r2) goto L1f
            if (r1 != r7) goto L17
            java.lang.Object r6 = r9.LLILLL
            X.05ZT r6 = (X.C05ZT) r6
            goto L78
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            java.lang.Object r6 = r9.LLILLL
            X.05ZT r6 = (X.C05ZT) r6
            goto L4f
        L24:
            java.lang.Object r6 = r9.LLILLL
            X.05ZT r6 = (X.C05ZT) r6
            goto L3d
        L29:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r6 = r9.LLILLL
            X.05ZT r6 = (X.C05ZT) r6
            r9.LLILLL = r6     // Catch: java.util.concurrent.CancellationException -> Laf
            r9.LLILLJJLI = r0     // Catch: java.util.concurrent.CancellationException -> Laf
            X.13fE r0 = X.EnumC20065813fE.Main     // Catch: java.util.concurrent.CancellationException -> Laf
            java.lang.Object r10 = X.C1374405Zm.LIZIZ(r6, r5, r0, r9)     // Catch: java.util.concurrent.CancellationException -> Laf
            if (r10 != r8) goto L40
            return r8
        L3d:
            X.C155000ia.LIZIZ(r10)     // Catch: java.util.concurrent.CancellationException -> Laf
        L40:
            X.13fO r10 = (X.C20066813fO) r10     // Catch: java.util.concurrent.CancellationException -> Laf
            long r0 = r10.LIZ     // Catch: java.util.concurrent.CancellationException -> Laf
            r9.LLILLL = r6     // Catch: java.util.concurrent.CancellationException -> Laf
            r9.LLILLJJLI = r2     // Catch: java.util.concurrent.CancellationException -> Laf
            java.lang.Object r10 = X.C05ZZ.LIZIZ(r6, r0, r9)     // Catch: java.util.concurrent.CancellationException -> Laf
            if (r10 != r8) goto L52
            return r8
        L4f:
            X.C155000ia.LIZIZ(r10)     // Catch: java.util.concurrent.CancellationException -> Laf
        L52:
            X.13fO r10 = (X.C20066813fO) r10     // Catch: java.util.concurrent.CancellationException -> Laf
            if (r10 == 0) goto Lac
            kotlin.jvm.functions.Function1<X.05aS, kotlin.Unit> r3 = r9.LLILZ     // Catch: java.util.concurrent.CancellationException -> Laf
            long r1 = r10.LIZJ     // Catch: java.util.concurrent.CancellationException -> Laf
            X.05aS r0 = new X.05aS     // Catch: java.util.concurrent.CancellationException -> Laf
            r0.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> Laf
            r3.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> Laf
            long r3 = r10.LIZ     // Catch: java.util.concurrent.CancellationException -> Laf
            kotlin.jvm.internal.AwS581S0100000_2 r2 = new kotlin.jvm.internal.AwS581S0100000_2     // Catch: java.util.concurrent.CancellationException -> Laf
            kotlin.jvm.functions.Function2<X.13fO, X.05aS, kotlin.Unit> r1 = r9.LLIZ     // Catch: java.util.concurrent.CancellationException -> Laf
            r0 = 491(0x1eb, float:6.88E-43)
            r2.<init>(r1, r0)     // Catch: java.util.concurrent.CancellationException -> Laf
            r9.LLILLL = r6     // Catch: java.util.concurrent.CancellationException -> Laf
            r9.LLILLJJLI = r7     // Catch: java.util.concurrent.CancellationException -> Laf
            java.lang.Object r10 = X.C05ZZ.LJ(r6, r3, r2, r9)     // Catch: java.util.concurrent.CancellationException -> Laf
            if (r10 != r8) goto L7b
            return r8
        L78:
            X.C155000ia.LIZIZ(r10)     // Catch: java.util.concurrent.CancellationException -> Laf
        L7b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.util.concurrent.CancellationException -> Laf
            boolean r0 = r10.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Laf
            if (r0 == 0) goto La7
            X.13fT r0 = r6.LJJJJJL()     // Catch: java.util.concurrent.CancellationException -> Laf
            java.util.List<X.13fO> r3 = r0.LIZ     // Catch: java.util.concurrent.CancellationException -> Laf
            int r2 = r3.size()     // Catch: java.util.concurrent.CancellationException -> Laf
        L8d:
            if (r5 >= r2) goto La1
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r5)     // Catch: java.util.concurrent.CancellationException -> Laf
            X.13fO r1 = (X.C20066813fO) r1     // Catch: java.util.concurrent.CancellationException -> Laf
            boolean r0 = X.C05ZS.LIZIZ(r1)     // Catch: java.util.concurrent.CancellationException -> Laf
            if (r0 == 0) goto L9e
            r1.LIZ()     // Catch: java.util.concurrent.CancellationException -> Laf
        L9e:
            int r5 = r5 + 1
            goto L8d
        La1:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r9.LLILZIL     // Catch: java.util.concurrent.CancellationException -> Laf
            r0.invoke()     // Catch: java.util.concurrent.CancellationException -> Laf
            goto Lac
        La7:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r9.LLILZLL     // Catch: java.util.concurrent.CancellationException -> Laf
            r0.invoke()     // Catch: java.util.concurrent.CancellationException -> Laf
        Lac:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Laf:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r9.LLILZLL
            r0.invoke()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369605Xq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
