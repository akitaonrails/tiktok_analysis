package X;

import com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel$hideMaskWithDelay$1", f = "EcPiPViewModel.kt", l = {270}, m = "invokeSuspend")
public final class C1056130dad extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcPiPViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056130dad(EcPiPViewModel ecPiPViewModel, InterfaceC1364105Vn<? super C1056130dad> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecPiPViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056130dad(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "EcPiPViewModel@7771.hideMaskWithDelay$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto L55
            X.C155000ia.LIZIZ(r10)
        L13:
            com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel r2 = r9.LLILLJJLI
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 92
            r1.<init>(r2, r0)
            r2.withState(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L25:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel r0 = r9.LLILLJJLI
            X.0d8N r0 = r0.LLILLJJLI
            if (r0 == 0) goto L52
            X.0d8M r0 = r0.LIZIZ
            if (r0 == 0) goto L52
            long r0 = r0.LIZIZ
            java.lang.Long r5 = X.C2286608xc.LJFF(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L52
            long r0 = r5.longValue()
        L46:
            r9.LL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r6) goto L13
            X.C1C7U.LIZIZ(r8)
            return r6
        L52:
            r0 = 2000(0x7d0, double:9.88E-321)
            goto L46
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056130dad.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
