package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
public final class C1379305aZ extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1380005ag LLILZ;
    public final /* synthetic */ C1379505ab LLILZIL;
    public final /* synthetic */ C05ZY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1379305aZ(InterfaceC1380005ag interfaceC1380005ag, C1379505ab c1379505ab, C05ZY c05zy, InterfaceC1364105Vn<? super C1379305aZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC1380005ag;
        this.LLILZIL = c1379505ab;
        this.LLILZLL = c05zy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1379305aZ c1379305aZ = new C1379305aZ(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1379305aZ.LLILLL = obj;
        return c1379305aZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r9.LLILLJJLI
            r8 = 3
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L19
            if (r1 == r0) goto L2b
            if (r1 == r7) goto L7d
            if (r1 == r8) goto L7d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r6 = r9.LLILLL
            X.05ZT r6 = (X.C05ZT) r6
            r9.LLILLL = r6
            r9.LLILLJJLI = r0
            java.lang.Object r10 = X.C1379605ac.LIZ(r6, r9)
            if (r10 != r4) goto L32
            return r4
        L2b:
            java.lang.Object r6 = r9.LLILLL
            X.05ZT r6 = (X.C05ZT) r6
            X.C155000ia.LIZIZ(r10)
        L32:
            X.13fT r10 = (X.C20067313fT) r10
            boolean r0 = X.C1379605ac.LIZLLL(r10)
            r5 = 0
            if (r0 == 0) goto L6a
            int r0 = r10.LIZJ
            r0 = r0 & 33
            if (r0 == 0) goto L6a
            java.util.List<X.13fO> r3 = r10.LIZ
            int r2 = r3.size()
            r1 = 0
        L48:
            if (r1 >= r2) goto L5b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZIZ()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6a
            int r1 = r1 + 1
            goto L48
        L5b:
            X.05ag r1 = r9.LLILZ
            X.05ab r0 = r9.LLILZIL
            r9.LLILLL = r5
            r9.LLILLJJLI = r7
            java.lang.Object r0 = X.C1379605ac.LIZIZ(r6, r1, r0, r10, r9)
            if (r0 != r4) goto L80
            return r4
        L6a:
            boolean r0 = X.C1379605ac.LIZLLL(r10)
            if (r0 != 0) goto L80
            X.05ZY r0 = r9.LLILZLL
            r9.LLILLL = r5
            r9.LLILLJJLI = r8
            java.lang.Object r0 = X.C1379605ac.LIZJ(r6, r0, r10, r9)
            if (r0 != r4) goto L80
            return r4
        L7d:
            X.C155000ia.LIZIZ(r10)
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379305aZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
