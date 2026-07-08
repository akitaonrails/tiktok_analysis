package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e2D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.common.RelationAuthDialogCenter$check$1", f = "RelationAuthDialogCenter.kt", l = {61}, m = "invokeSuspend")
public final class C1073230e2D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC1073390e2T LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1073210e2B LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073230e2D(C1073210e2B c1073210e2B, C013C c013c, InterfaceC1364105Vn<? super C1073230e2D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1073210e2B;
        this.LLILZIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1073230e2D(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:8:0x002e, B:15:0x007a], limit reached: 25 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089 A[PHI: r4
      0x0089: PHI (r4v1 java.util.Iterator<X.0e2T>) = (r4v0 java.util.Iterator<X.0e2T>), (r4v2 java.util.Iterator<X.0e2T>) binds: [B:16:0x007c, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a3 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "RelationAuthDialogCenter@5a87.check$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r2 = 1
            if (r0 == 0) goto L7c
            if (r0 != r2) goto La9
            X.0e2T r1 = r8.LLILLJJLI
            java.lang.Object r4 = r8.LL
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.C155000ia.LIZIZ(r9)
        L19:
            X.0e22 r9 = (X.C1073120e22) r9
            X.0e2B r6 = r8.LLILZ
            X.0e2V r0 = r6.LIZIZ
            X.0dzd r5 = r0.LIZ
            X.0e2V r0 = new X.0e2V
            r0.<init>(r5, r9)
            r6.LIZIZ = r0
            X.013C r5 = r8.LLILZIL
            boolean r0 = r5.element
            if (r0 == 0) goto L7a
            boolean r0 = r9.LIZ
            if (r0 == 0) goto L7a
            r0 = 1
        L33:
            r5.element = r0
            X.01GW r0 = r6.LIZJ
            java.lang.Object r5 = r0.getValue()
            X.0zpH r5 = (X.C1910890zpH) r5
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "check: current task: "
            r6.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            r6.append(r0)
            java.lang.String r0 = ", output: "
            r6.append(r0)
            r6.append(r9)
            java.lang.String r0 = ", needPop "
            r6.append(r0)
            X.013C r0 = r8.LLILZIL
            boolean r0 = r0.element
            r6.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r6)
            java.lang.String r0 = "AuthPopup"
            r5.LIZ(r0, r1)
            X.013C r0 = r8.LLILZIL
            boolean r0 = r0.element
            if (r0 != 0) goto L89
        L74:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L7a:
            r0 = 0
            goto L33
        L7c:
            X.C155000ia.LIZIZ(r9)
            X.0e2B r0 = r8.LLILZ
            java.util.List r0 = r0.LIZ(r2)
            java.util.Iterator r4 = r0.iterator()
        L89:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r4.next()
            X.0e2T r1 = (X.InterfaceC1073390e2T) r1
            X.0e2B r0 = r8.LLILZ
            X.0e2V r0 = r0.LIZIZ
            r8.LL = r4
            r8.LLILLJJLI = r1
            r8.LLILLL = r2
            java.lang.Object r9 = r1.LIZ(r0, r8)
            if (r9 != r3) goto L19
            X.C1C7U.LIZIZ(r7)
            return r3
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1073230e2D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
