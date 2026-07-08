package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {512}, m = "invokeSuspend")
public final class C1394405d0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC20074613ge LLILLL;
    public final /* synthetic */ InterfaceC1369205Xm LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<C20066813fO, C20066813fO, C1378605aS, Unit> LLILZIL;
    public final /* synthetic */ Function1<C20066813fO, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Boolean> LLIZLLLIL;
    public final /* synthetic */ Function2<C20066813fO, C1378605aS, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1394405d0(AbstractC20074613ge abstractC20074613ge, InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1631620sYq<? super C20066813fO, ? super C20066813fO, ? super C1378605aS, Unit> interfaceC1631620sYq, Function1<? super C20066813fO, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super C20066813fO, ? super C1378605aS, Unit> function2, InterfaceC1364105Vn<? super C1394405d0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC20074613ge;
        this.LLILZ = interfaceC1369205Xm;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = function1;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1394405d0 c1394405d0 = new C1394405d0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1394405d0.LLILLJJLI = obj;
        return c1394405d0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LL
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 != r1) goto L13
            java.lang.Object r3 = r11.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r12)     // Catch: java.util.concurrent.CancellationException -> L3f
            goto L55
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r3 = r11.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.13ge r0 = r11.LLILLL     // Catch: java.util.concurrent.CancellationException -> L3d
            X.0tvN r9 = r0.LLJJIII     // Catch: java.util.concurrent.CancellationException -> L3d
            X.05Xm r4 = r11.LLILZ     // Catch: java.util.concurrent.CancellationException -> L3d
            X.0sYq<X.13fO, X.13fO, X.05aS, kotlin.Unit> r5 = r11.LLILZIL     // Catch: java.util.concurrent.CancellationException -> L3d
            kotlin.jvm.functions.Function1<X.13fO, kotlin.Unit> r6 = r11.LLILZLL     // Catch: java.util.concurrent.CancellationException -> L3d
            kotlin.jvm.functions.Function0<kotlin.Unit> r7 = r11.LLIZ     // Catch: java.util.concurrent.CancellationException -> L3d
            kotlin.jvm.functions.Function0<java.lang.Boolean> r8 = r11.LLIZLLLIL     // Catch: java.util.concurrent.CancellationException -> L3d
            kotlin.jvm.functions.Function2<X.13fO, X.05aS, kotlin.Unit> r10 = r11.LLJ     // Catch: java.util.concurrent.CancellationException -> L3d
            r11.LLILLJJLI = r3     // Catch: java.util.concurrent.CancellationException -> L3d
            r11.LL = r1     // Catch: java.util.concurrent.CancellationException -> L3d
            java.lang.Object r0 = X.C05ZZ.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L3d
            if (r0 != r2) goto L55
            return r2
        L3d:
            r2 = move-exception
            goto L40
        L3f:
            r2 = move-exception
        L40:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.13ge r0 = r11.LLILLL
            X.095E<X.05d3> r1 = r0.LLJJJ
            if (r1 == 0) goto L4e
            X.05d6 r0 = X.C1395005d6.LIZ
            r1.LJIIIIZZ(r0)
        L4e:
            boolean r0 = X.C2296808zG.LJI(r3)
            if (r0 != 0) goto L55
            throw r2
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394405d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
