package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$innerCarryInAndAskQuestion$1", f = "MessageViewModel.kt", l = {3786, 3788}, m = "invokeSuspend")
public final class C1861500yXc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863340yaa LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861500yXc(C1863340yaa c1863340yaa, MessageViewModel messageViewModel, String str, String str2, boolean z, InterfaceC1364105Vn<? super C1861500yXc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1863340yaa;
        this.LLILLL = messageViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861500yXc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r11 = "MessageViewModel@9229.innerCarryInAndAskQuestion$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r19
            int r0 = r7.LL
            r5 = 2
            r10 = 0
            r9 = 1
            if (r0 == 0) goto L1f
            if (r0 == r9) goto L4a
            if (r0 != r5) goto L98
            X.C155000ia.LIZIZ(r20)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r20)
            X.0yaa r0 = r7.LLILLJJLI
            X.0yY5 r1 = r0.LJ
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L19
            long r0 = r1.LIZ
            java.lang.Long r8 = X.C2286608xc.LJFF(r0)
            long r3 = r8.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4d
            long r0 = r8.longValue()
            r7.LL = r9
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r6) goto L4d
            X.C1C7U.LIZIZ(r11)
            return r6
        L4a:
            X.C155000ia.LIZIZ(r20)
        L4d:
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r7.LLILLL
            X.0yae r12 = r0.LLJJJJ
            if (r12 == 0) goto L19
            X.0yaa r13 = r7.LLILLJJLI
            java.lang.String r14 = r7.LLILZ
            java.lang.String r15 = r7.LLILZIL
            boolean r4 = r7.LLILZLL
            com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc r3 = new com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc
            X.002o r0 = r0.getState()
            X.0yWs r0 = (X.C1861040yWs) r0
            com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem r0 = r0.LLJ
            if (r0 == 0) goto L6d
            long r0 = r0.id
            java.lang.Long r10 = X.C2286608xc.LJFF(r0)
        L6d:
            long r0 = X.C0R2Q.LIZIZ(r10)
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r2 = r7.LLILLL
            X.002o r2 = r2.getState()
            X.0yWs r2 = (X.C1861040yWs) r2
            com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem r2 = r2.LLJ
            if (r2 == 0) goto L81
            java.lang.String r2 = r2.processId
            if (r2 != 0) goto L83
        L81:
            java.lang.String r2 = ""
        L83:
            r3.<init>(r0, r2)
            r7.LL = r5
            r17 = r3
            r18 = r7
            r16 = r4
            java.lang.Object r0 = r12.LJFF(r13, r14, r15, r16, r17, r18)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r11)
            return r6
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1861500yXc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
