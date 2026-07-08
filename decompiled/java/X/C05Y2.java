package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Y2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {87, 91}, m = "invokeSuspend")
public final class C05Y2 extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20066813fO LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C05ZY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Y2(C05ZY c05zy, InterfaceC1364105Vn<? super C05Y2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c05zy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05Y2 c05y2 = new C05Y2(this.LLILZIL, interfaceC1364105Vn);
        c05y2.LLILZ = obj;
        return c05y2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0042 -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r8 = X.C099R.LJFF()
            int r1 = r12.LLILLL
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L48
            if (r1 == r0) goto L5d
            if (r1 != r7) goto L75
            X.13fO r11 = r12.LLILLJJLI
            java.lang.Object r2 = r12.LLILZ
            X.05ZT r2 = (X.C05ZT) r2
            X.C155000ia.LIZIZ(r13)
        L17:
            X.13fT r13 = (X.C20067313fT) r13
            java.util.List<X.13fO> r10 = r13.LIZ
            int r9 = r10.size()
            r6 = 0
        L20:
            if (r6 >= r9) goto L6d
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r6)
            X.13fO r5 = (X.C20066813fO) r5
            long r3 = r5.LIZ
            long r0 = r11.LIZ
            boolean r0 = X.C05U1.LIZ(r3, r0)
            if (r0 == 0) goto L45
            boolean r0 = r5.LIZLLL
            if (r0 == 0) goto L45
        L36:
            r12.LLILZ = r2
            r12.LLILLJJLI = r11
            r12.LLILLL = r7
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r13 = r2.LJJIJIL(r0, r12)
            if (r13 != r8) goto L17
            return r8
        L45:
            int r6 = r6 + 1
            goto L20
        L48:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r2 = r12.LLILZ
            X.05ZT r2 = (X.C05ZT) r2
            r12.LLILZ = r2
            r12.LLILLL = r0
            r1 = 0
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r13 = X.C1374405Zm.LIZIZ(r2, r1, r0, r12)
            if (r13 != r8) goto L64
            return r8
        L5d:
            java.lang.Object r2 = r12.LLILZ
            X.05ZT r2 = (X.C05ZT) r2
            X.C155000ia.LIZIZ(r13)
        L64:
            X.13fO r13 = (X.C20066813fO) r13
            X.05ZY r0 = r12.LLILZIL
            r0.LIZ()
            r11 = r13
            goto L36
        L6d:
            X.05ZY r0 = r12.LLILZIL
            r0.LIZJ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05Y2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
