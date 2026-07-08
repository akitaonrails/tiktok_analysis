package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.bytedance.touchpoint.core.feedbanner.manager.SpecialCardPictureManager$loadImgFile$1", f = "SpecialCardPictureManager.kt", l = {715}, m = "invokeSuspend")
public final class C708570Rqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1897290zTL LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1322110kVd LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708570Rqp(String str, C1897290zTL c1897290zTL, String str2, C1322110kVd c1322110kVd, InterfaceC1364105Vn<? super C708570Rqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1897290zTL;
        this.LLILZ = str2;
        this.LLILZIL = c1322110kVd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708570Rqp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "SpecialCardPictureManager@8a59.loadImgFile$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto L4f
            X.C155000ia.LIZIZ(r10)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L19:
            X.C155000ia.LIZIZ(r10)
            java.lang.String r0 = r9.LLILLJJLI
            if (r0 != 0) goto L33
            X.0zTL r0 = r9.LLILLL
            r0.getClass()
            java.lang.String r0 = r0.LJJIIJZLJL
            X.0zTH r1 = X.C0T82.LIZJ(r0)
            java.lang.String r0 = r9.LLILZ
            java.lang.String r0 = r1.LJIILJJIL(r0)
            if (r0 == 0) goto L13
        L33:
            java.lang.String r5 = r9.LLILLJJLI
            X.0kVd r4 = r9.LLILZIL
            X.0zTL r3 = r9.LLILLL
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Rqq r1 = new X.0Rqq
            r0 = 0
            r1.<init>(r5, r4, r3, r0)
            r9.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r6) goto L13
            X.C1C7U.LIZIZ(r8)
            return r6
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C708570Rqp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
