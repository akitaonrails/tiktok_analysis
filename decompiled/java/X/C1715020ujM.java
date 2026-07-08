package X;

import com.ss.android.ugc.aweme.verify.pi.VerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ujM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.pi.VerifyViewModel$verify$2", f = "PiVerifyViewModel.kt", l = {143}, m = "invokeSuspend")
public final class C1715020ujM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VerifyViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715020ujM(VerifyViewModel verifyViewModel, String str, InterfaceC1364105Vn<? super C1715020ujM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = verifyViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715020ujM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "VerifyViewModel@4e16.verify$2"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L7d
            if (r0 != r2) goto La0
            X.C155000ia.LIZIZ(r6)
        L13:
            X.0ujW r6 = (X.InterfaceC1715120ujW) r6
        L15:
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r1 = r5.LLILLJJLI
            r0 = 674(0x2a2, float:9.44E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r1.setState(r0)
            boolean r0 = r6 instanceof X.C991740bum
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r2 = r5.LLILLJJLI
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 749(0x2ed, float:1.05E-42)
            r1.<init>(r6, r0)
            r2.setState(r1)
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L36:
            boolean r0 = r6 instanceof X.C1714980ujI
            if (r0 != 0) goto L70
            boolean r0 = r6 instanceof X.C1715280ujm
            if (r0 != 0) goto L70
            boolean r0 = r6 instanceof X.C1715000ujK
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r2 = r5.LLILLJJLI
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 751(0x2ef, float:1.052E-42)
            r1.<init>(r6, r0)
            r2.setState(r1)
            goto L30
        L4f:
            boolean r0 = r6 instanceof X.C991350bu9
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r2 = r5.LLILLJJLI
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 752(0x2f0, float:1.054E-42)
            r1.<init>(r6, r0)
            r2.setState(r1)
            goto L30
        L60:
            boolean r0 = r6 instanceof X.C989690brT
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r1 = r5.LLILLJJLI
            r0 = 675(0x2a3, float:9.46E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r1.setState(r0)
            goto L30
        L70:
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r2 = r5.LLILLJJLI
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 750(0x2ee, float:1.051E-42)
            r1.<init>(r6, r0)
            r2.setState(r1)
            goto L30
        L7d:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r0 = r5.LLILLJJLI
            X.0uh1 r0 = r0.LL
            if (r0 == 0) goto L89
            X.C1714170uhz.LIZ(r0)
        L89:
            com.ss.android.ugc.aweme.verify.pi.VerifyViewModel r0 = r5.LLILLJJLI
            X.0ujF r1 = r0.LLILLJJLI
            if (r1 == 0) goto L9d
            java.lang.String r0 = r5.LLILLL
            r5.LL = r2
            java.lang.Object r6 = r1.LIZIZ(r0, r5)
            if (r6 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L9d:
            r6 = 0
            goto L15
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1715020ujM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
