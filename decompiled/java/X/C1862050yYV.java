package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$fetchSearchLandingPage$1", f = "MessageViewModel.kt", l = {4701}, m = "invokeSuspend")
public final class C1862050yYV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ C665120Q7a LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862050yYV(String str, MessageViewModel messageViewModel, C665120Q7a c665120Q7a, InterfaceC1364105Vn<? super C1862050yYV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = messageViewModel;
        this.LLILZ = c665120Q7a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1862050yYV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0, r2) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MessageViewModel@9229.fetchSearchLandingPage$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r2 = 0
            r5 = 1
            if (r0 == 0) goto L42
            if (r0 != r5) goto L8f
            X.C155000ia.LIZIZ(r9)
        L14:
            com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse r9 = (com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse) r9
            if (r9 == 0) goto L36
        L18:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.data
            if (r0 == 0) goto L36
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            if (r9 == 0) goto L30
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r2 = r8.LLILLL
            kotlin.jvm.internal.AwS606S0100000_27 r1 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 24
            r1.<init>(r9, r0)
            r2.setState(r1)
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L36:
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r1 = r8.LLILLL
            r0 = 18
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r1.setState(r0)
            goto L30
        L42:
            X.C155000ia.LIZIZ(r9)
            android.content.SharedPreferences r0 = X.C1864000ybe.LIZ
            java.lang.String r0 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse r9 = X.C1864000ybe.LIZ(r0)
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r8.LLILLL
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r1 = r0.LLILLL
            if (r9 == 0) goto L61
            java.lang.String r0 = r9.LIZ
            if (r1 == 0) goto L5b
            java.lang.String r2 = r1.getDataRepeatKey()
        L5b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L18
        L61:
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r1 = r8.LLILLL
            r0 = 19
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r1.setState(r0)
            X.0ybc r4 = X.C1863980ybc.LIZ
            X.0Q7a r0 = r8.LLILZ
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.requestMap
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "inspire_card_landing_scene"
            java.lang.String r0 = "tako"
            r2.<init>(r1, r0)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r2)
            java.util.Map r0 = X.C2097608Jq.LJIIL(r3, r0)
            r8.LL = r5
            java.lang.Object r9 = r4.LJJIII(r0, r8)
            if (r9 != r6) goto L14
            X.C1C7U.LIZIZ(r7)
            return r6
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1862050yYV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
