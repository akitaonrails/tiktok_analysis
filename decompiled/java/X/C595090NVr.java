package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend")
public final class C595090NVr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC595070NVp LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ InterfaceC595010NVj LLILZLL;
    public final /* synthetic */ AbstractC20072513gJ LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595090NVr(InterfaceC595070NVp interfaceC595070NVp, long j, InterfaceC595010NVj interfaceC595010NVj, AbstractC20072513gJ abstractC20072513gJ, InterfaceC1364105Vn<? super C595090NVr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC595070NVp;
        this.LLILZIL = j;
        this.LLILZLL = interfaceC595010NVj;
        this.LLIZ = abstractC20072513gJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C595090NVr c595090NVr = new C595090NVr(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c595090NVr.LLILLL = obj;
        return c595090NVr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r4 = 5
            r2 = 4
            r5 = 3
            r7 = 2
            r6 = 1
            r13 = 0
            if (r0 == 0) goto L20
            if (r0 == r6) goto L43
            if (r0 == r7) goto L63
            if (r0 == r5) goto L83
            if (r0 == r2) goto Lb7
            if (r0 == r4) goto Lb7
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r15)
            java.lang.Object r0 = r14.LLILLL
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.13gI r8 = new X.13gI
            X.13gJ r9 = r14.LLIZ
            long r10 = r14.LLILZIL
            X.0NVj r12 = r14.LLILZLL
            r8.<init>(r9, r10, r12, r13)
            X.0956 r1 = X.C23250099c.LIZLLL(r0, r13, r13, r8, r5)
            X.0NVp r0 = r14.LLILZ
            r14.LLILLL = r1
            r14.LLILLJJLI = r6
            java.lang.Object r15 = r0.LJJIJIIJIL(r14)
            if (r15 != r3) goto L4a
            return r3
        L43:
            java.lang.Object r1 = r14.LLILLL
            X.09AE r1 = (X.C09AE) r1
            X.C155000ia.LIZIZ(r15)
        L4a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r6 = r15.booleanValue()
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L97
            r14.LLILLL = r13
            r14.LL = r6
            r14.LLILLJJLI = r7
            java.lang.Object r0 = X.C23118094a.LIZLLL(r1, r14)
            if (r0 != r3) goto L68
            return r3
        L63:
            boolean r6 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L68:
            if (r6 == 0) goto Lba
            X.0NW2 r4 = new X.0NW2
            long r0 = r14.LLILZIL
            r4.<init>(r0)
            X.0NVm r1 = new X.0NVm
            r1.<init>(r4)
            X.0NVj r0 = r14.LLILZLL
            r14.LLILLL = r1
            r14.LLILLJJLI = r5
            java.lang.Object r0 = r0.LIZ(r4, r14)
            if (r0 != r3) goto L8a
            return r3
        L83:
            java.lang.Object r1 = r14.LLILLL
            X.0NVm r1 = (X.C595040NVm) r1
            X.C155000ia.LIZIZ(r15)
        L8a:
            X.0NVj r0 = r14.LLILZLL
            r14.LLILLL = r13
            r14.LLILLJJLI = r2
            java.lang.Object r0 = r0.LIZ(r1, r14)
            if (r0 != r3) goto Lba
            return r3
        L97:
            X.13gJ r0 = r14.LLIZ
            X.0NW2 r2 = r0.LLJJL
            if (r2 == 0) goto Lba
            X.0NVj r1 = r14.LLILZLL
            if (r6 == 0) goto Lb1
            X.0NVm r0 = new X.0NVm
            r0.<init>(r2)
        La6:
            r14.LLILLL = r13
            r14.LLILLJJLI = r4
            java.lang.Object r0 = r1.LIZ(r0, r14)
            if (r0 != r3) goto Lba
            return r3
        Lb1:
            X.0NVl r0 = new X.0NVl
            r0.<init>(r2)
            goto La6
        Lb7:
            X.C155000ia.LIZIZ(r15)
        Lba:
            X.13gJ r0 = r14.LLIZ
            r0.LLJJL = r13
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C595090NVr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
