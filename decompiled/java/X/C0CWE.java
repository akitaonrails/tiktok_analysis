package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$fetchSubConversationList$2", f = "MessageViewModel.kt", l = {4046, 4051}, m = "invokeSuspend")
public final class C0CWE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<FetchSubConversationListResponse, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CWE(MessageViewModel messageViewModel, long j, int i, Function1<? super FetchSubConversationListResponse, Unit> function1, InterfaceC1364105Vn<? super C0CWE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "MessageViewModel@9229.fetchSubConversationList$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L38
            if (r0 != r5) goto L54
            X.C155000ia.LIZIZ(r10)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r9.LLILLJJLI
            X.0yae r3 = r0.LLJJJJ
            if (r3 == 0) goto L36
            long r1 = r9.LLILLL
            int r0 = r9.LLILZ
            r9.LL = r4
            java.lang.Object r10 = r3.LJIILJJIL(r0, r1, r9)
            if (r10 != r7) goto L3b
            X.C1C7U.LIZIZ(r8)
            return r7
        L36:
            r10 = r6
            goto L3d
        L38:
            X.C155000ia.LIZIZ(r10)
        L3b:
            com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse r10 = (com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse) r10
        L3d:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CWF r1 = new X.0CWF
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse, kotlin.Unit> r0 = r9.LLILZIL
            r1.<init>(r0, r10, r6)
            r9.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r7) goto L17
            X.C1C7U.LIZIZ(r8)
            return r7
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CWE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
