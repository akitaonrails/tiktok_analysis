package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.BulletinDataCenter$1", f = "BulletinDataCenter.kt", l = {65}, m = "invokeSuspend")
public final class C605860NpY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0OI4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605860NpY(C0OI4 c0oi4, InterfaceC1364105Vn<? super C605860NpY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0oi4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605860NpY(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "BulletinDataCenter@f17c.<init>$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L5d
            if (r0 != r5) goto L8f
            X.0WWy r7 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L15:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L89
            java.lang.Object r2 = r7.next()
            X.0Npa r2 = (X.InterfaceC605880Npa) r2
            boolean r0 = r2 instanceof X.C605890Npb
            r4 = 0
            if (r0 == 0) goto L7b
            X.0OI4 r3 = r9.LLILLL
            r3.getClass()
            X.0Npb[] r1 = new X.C605890Npb[r5]
            r0 = 0
            r1[r0] = r2
            java.util.List r2 = X.C1697810uHb.LJIILJJIL(r1)
        L36:
            X.1DEK r0 = r3.LJFF
            java.lang.Object r0 = r0.LJIIJ()
            java.lang.Object r1 = X.C094N.LIZIZ(r0)
            X.0Npa r1 = (X.InterfaceC605880Npa) r1
            if (r1 != 0) goto L55
            r3.LIZ(r2)
        L47:
            r9.LL = r7
            r9.LLILLJJLI = r5
            java.lang.Object r10 = r7.LIZ(r9)
            if (r10 != r6) goto L15
            X.C1C7U.LIZIZ(r8)
            return r6
        L55:
            boolean r0 = r1 instanceof X.C605890Npb
            if (r0 == 0) goto L6d
            r2.add(r1)
            goto L36
        L5d:
            X.C155000ia.LIZIZ(r10)
            X.0OI4 r0 = r9.LLILLL
            X.1DEK r0 = r0.LJFF
            r0.getClass()
            X.1DEL r7 = new X.1DEL
            r7.<init>(r0)
            goto L47
        L6d:
            boolean r0 = r1 instanceof X.C605870NpZ
            if (r0 == 0) goto L75
            r3.LIZ(r2)
            throw r4
        L75:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L7b:
            boolean r0 = r2 instanceof X.C605870NpZ
            if (r0 == 0) goto L83
            r2.getClass()
            throw r4
        L83:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L89:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605860NpY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
