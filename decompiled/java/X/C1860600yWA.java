package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$fetchInteractiveNovel$1", f = "MessageViewModel.kt", l = {4092}, m = "invokeSuspend")
public final class C1860600yWA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ NovelStatus LLILLL;
    public final /* synthetic */ InterfaceC1859790yUr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860600yWA(MessageViewModel messageViewModel, NovelStatus novelStatus, InterfaceC1859790yUr interfaceC1859790yUr, InterfaceC1364105Vn<? super C1860600yWA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = novelStatus;
        this.LLILZ = interfaceC1859790yUr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860600yWA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[PHI: r2
      0x003c: PHI (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:28:0x005b, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "MessageViewModel@9229.fetchInteractiveNovel$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LL
            r9 = 1
            if (r0 == 0) goto L19
            if (r0 != r9) goto L5e
            X.C155000ia.LIZIZ(r12)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L19:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r11.LLILLJJLI
            X.002o r0 = r0.getState()
            X.0yWs r0 = (X.C1861040yWs) r0
            com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem r7 = r0.LLJILLL
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r11.LLILLJJLI
            X.0yae r6 = r0.LLJJJJ
            if (r6 == 0) goto L13
            com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus r5 = r11.LLILLL
            com.ss.android.ugc.aweme.tako.ccl.model.BotDoc r4 = new com.ss.android.ugc.aweme.tako.ccl.model.BotDoc
            if (r7 == 0) goto L59
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r7.bot
            if (r0 == 0) goto L59
            long r2 = r0.botId
        L38:
            java.lang.String r1 = r7.processId
            if (r1 != 0) goto L3e
        L3c:
            java.lang.String r1 = ""
        L3e:
            if (r7 == 0) goto L57
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r7.bot
            if (r0 == 0) goto L57
            int r0 = r0.botMode
        L46:
            r4.<init>(r2, r1, r0)
            X.0yUr r0 = r11.LLILZ
            r11.LL = r9
            java.lang.Object r0 = r6.LJIIL(r5, r4, r0, r11)
            if (r0 != r8) goto L13
            X.C1C7U.LIZIZ(r10)
            return r8
        L57:
            r0 = -1
            goto L46
        L59:
            r2 = 0
            if (r7 == 0) goto L3c
            goto L38
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860600yWA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
