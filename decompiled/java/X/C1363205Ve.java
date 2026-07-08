package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {58, 61}, m = "invokeSuspend")
public final class C1363205Ve extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1363205Ve(Function1<? super C1378605aS, Unit> function1, InterfaceC1364105Vn<? super C1363205Ve> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1363205Ve c1363205Ve = new C1363205Ve(this.LLILZ, interfaceC1364105Vn);
        c1363205Ve.LLILLL = obj;
        return c1363205Ve;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILLJJLI
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L1b
            if (r1 == r0) goto L2d
            if (r1 != r5) goto L55
            X.C155000ia.LIZIZ(r8)
        L11:
            X.13fO r8 = (X.C20066813fO) r8
            if (r8 == 0) goto L18
            r8.LIZ()
        L18:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1b:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r4 = r7.LLILLL
            X.05ZT r4 = (X.C05ZT) r4
            r7.LLILLL = r4
            r7.LLILLJJLI = r0
            java.lang.Object r8 = X.C1363505Vh.LIZ(r4, r7)
            if (r8 != r6) goto L34
            return r6
        L2d:
            java.lang.Object r4 = r7.LLILLL
            X.05ZT r4 = (X.C05ZT) r4
            X.C155000ia.LIZIZ(r8)
        L34:
            X.13fO r8 = (X.C20066813fO) r8
            r8.LIZ()
            kotlin.jvm.functions.Function1<X.05aS, kotlin.Unit> r3 = r7.LLILZ
            long r1 = r8.LIZJ
            X.05aS r0 = new X.05aS
            r0.<init>(r1)
            r3.invoke(r0)
            r0 = 0
            r7.LLILLL = r0
            r7.LLILLJJLI = r5
            X.05V7 r0 = X.C1374405Zm.LIZ
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r8 = X.C1374405Zm.LJIIIIZZ(r4, r0, r7)
            if (r8 != r6) goto L11
            return r6
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363205Ve.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
