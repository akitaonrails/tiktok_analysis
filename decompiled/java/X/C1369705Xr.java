package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {510, 513, 521}, m = "invokeSuspend")
public final class C1369705Xr extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C817403Hg LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZIL;
    public final /* synthetic */ Function2<C20066813fO, Float, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369705Xr(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function0 function02, Function1 function1, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = function1;
        this.LLILZLL = function2;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1369705Xr c1369705Xr = new C1369705Xr(interfaceC1364105Vn, this.LLIZ, this.LLIZLLLIL, this.LLILZIL, this.LLILZLL);
        c1369705Xr.LLILZ = obj;
        return c1369705Xr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r12.LLILLL
            r4 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 == r0) goto L3f
            if (r1 == r2) goto L65
            if (r1 != r4) goto La2
            X.C155000ia.LIZIZ(r13)
        L14:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L24
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r12.LLIZ
            r0.invoke()
        L21:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L24:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r12.LLIZLLLIL
            r0.invoke()
            goto L21
        L2a:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r7 = r12.LLILZ
            X.05ZT r7 = (X.C05ZT) r7
            r12.LLILZ = r7
            r12.LLILLL = r0
            r1 = 0
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r13 = X.C1374405Zm.LIZIZ(r7, r1, r0, r12)
            if (r13 != r5) goto L46
            return r5
        L3f:
            java.lang.Object r7 = r12.LLILZ
            X.05ZT r7 = (X.C05ZT) r7
            X.C155000ia.LIZIZ(r13)
        L46:
            X.13fO r13 = (X.C20066813fO) r13
            X.03Hg r6 = new X.03Hg
            r6.<init>()
            long r8 = r13.LIZ
            int r10 = r13.LJIIIIZZ
            kotlin.jvm.internal.AwS616S0100000_2 r11 = new kotlin.jvm.internal.AwS616S0100000_2
            r0 = 105(0x69, float:1.47E-43)
            r11.<init>(r6, r0)
            r12.LLILZ = r7
            r12.LLILLJJLI = r6
            r12.LLILLL = r2
            java.lang.Object r13 = X.C05ZZ.LIZJ(r7, r8, r10, r11, r12)
            if (r13 != r5) goto L6e
            return r5
        L65:
            X.03Hg r6 = r12.LLILLJJLI
            java.lang.Object r7 = r12.LLILZ
            X.05ZT r7 = (X.C05ZT) r7
            X.C155000ia.LIZIZ(r13)
        L6e:
            X.13fO r13 = (X.C20066813fO) r13
            if (r13 == 0) goto L21
            kotlin.jvm.functions.Function1<X.05aS, kotlin.Unit> r3 = r12.LLILZIL
            long r0 = r13.LIZJ
            X.05aS r2 = new X.05aS
            r2.<init>(r0)
            r3.invoke(r2)
            kotlin.jvm.functions.Function2<X.13fO, java.lang.Float, kotlin.Unit> r1 = r12.LLILZLL
            float r0 = r6.element
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)
            r1.invoke(r13, r0)
            long r1 = r13.LIZ
            kotlin.jvm.internal.AwS581S0100000_2 r6 = new kotlin.jvm.internal.AwS581S0100000_2
            kotlin.jvm.functions.Function2<X.13fO, java.lang.Float, kotlin.Unit> r3 = r12.LLILZLL
            r0 = 492(0x1ec, float:6.9E-43)
            r6.<init>(r3, r0)
            r0 = 0
            r12.LLILZ = r0
            r12.LLILLJJLI = r0
            r12.LLILLL = r4
            java.lang.Object r13 = X.C05ZZ.LJII(r7, r1, r6, r12)
            if (r13 != r5) goto L14
            return r5
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369705Xr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
