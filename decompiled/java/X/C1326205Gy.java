package X;

import com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel$startRetryCountdown$1", f = "SentInvitePageViewModel.kt", l = {79}, m = "invokeSuspend")
public final class C1326205Gy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SentInvitePageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326205Gy(SentInvitePageViewModel sentInvitePageViewModel, InterfaceC1364105Vn<? super C1326205Gy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sentInvitePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326205Gy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "SentInvitePageViewModel@7b52.startRetryCountdown$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L47
            if (r0 != r2) goto L51
            X.C155000ia.LIZIZ(r6)
        L13:
            com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel r0 = r5.LLILLJJLI
            X.1DDq r1 = r0.LLILLL
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.setValue(r0)
        L29:
            com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel r0 = r5.LLILLJJLI
            X.1DDq r0 = r0.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L4b
            r5.LL = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L47:
            X.C155000ia.LIZIZ(r6)
            goto L29
        L4b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326205Gy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
