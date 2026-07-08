package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$checkLawful$1", f = "OrderSubmitAssemViewModel.kt", l = {1844}, m = "invokeSuspend")
public final class C825903Kn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PhoneCredit LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825903Kn(PhoneCredit phoneCredit, OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C825903Kn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = phoneCredit;
        this.LLILLL = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825903Kn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:15:0x003a, B:16:0x003d, B:19:0x0043, B:21:0x0047, B:23:0x004d, B:25:0x0065, B:27:0x0069, B:28:0x006b, B:24:0x0059, B:9:0x001d, B:11:0x002e), top: B:33:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:15:0x003a, B:16:0x003d, B:19:0x0043, B:21:0x0047, B:23:0x004d, B:25:0x0065, B:27:0x0069, B:28:0x006b, B:24:0x0059, B:9:0x001d, B:11:0x002e), top: B:33:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "OrderSubmitAssemViewModel@f79d.checkLawful$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L12
            goto L3a
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest     // Catch: java.lang.Throwable -> L72
            java.lang.Integer r1 = X.C2286608xc.LJ(r4)     // Catch: java.lang.Throwable -> L72
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit r0 = r7.LLILLJJLI     // Catch: java.lang.Throwable -> L72
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L72
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r7.LLILLL     // Catch: java.lang.Throwable -> L72
            X.03WX r0 = r0.LLLJIL     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L40
            r7.LL = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = X.C03WX.LJJIL(r2, r7)     // Catch: java.lang.Throwable -> L72
            if (r8 != r5) goto L3d
            X.C1C7U.LIZIZ(r6)
            return r5
        L3a:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L72
        L3d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulResponse r8 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulResponse) r8     // Catch: java.lang.Throwable -> L72
            goto L41
        L40:
            r8 = r3
        L41:
            if (r8 == 0) goto L59
            java.lang.Integer r0 = r8.code     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L59
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L59
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r1 = r7.LLILLL     // Catch: java.lang.Throwable -> L72
            r0 = 483(0x1e3, float:6.77E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)     // Catch: java.lang.Throwable -> L72
            r1.setState(r0)     // Catch: java.lang.Throwable -> L72
            goto L65
        L59:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r2 = r7.LLILLL     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1     // Catch: java.lang.Throwable -> L72
            r0 = 421(0x1a5, float:5.9E-43)
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L72
            r2.setState(r1)     // Catch: java.lang.Throwable -> L72
        L65:
            X.03O0 r0 = X.C03O0.LIZ     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L6b
            java.lang.Integer r3 = r8.code     // Catch: java.lang.Throwable -> L72
        L6b:
            r0.getClass()     // Catch: java.lang.Throwable -> L72
            X.C03O0.LJLLL(r3)     // Catch: java.lang.Throwable -> L72
            goto L93
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = "check lawful Fail"
            X.C1AF0.LIZJ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r1 = r7.LLILLL
            r0 = 484(0x1e4, float:6.78E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r1.setState(r0)
            X.03O0 r1 = X.C03O0.LIZ
            r0 = -1
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.getClass()
            X.C03O0.LJLLL(r0)
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825903Kn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
