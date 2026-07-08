package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtAuthorPanelVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtAuthorPanelVM$onDeleteClicked$1", f = "SocialThoughtAuthorPanelVM.kt", l = {89, 98, 108}, m = "invokeSuspend")
public final class C0DZ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ThoughtInfo LLILZ;
    public final /* synthetic */ SocialThoughtAuthorPanelVM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZ1(String str, ThoughtInfo thoughtInfo, SocialThoughtAuthorPanelVM socialThoughtAuthorPanelVM, InterfaceC1364105Vn<? super C0DZ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = thoughtInfo;
        this.LLILZIL = socialThoughtAuthorPanelVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0DZ1 c0dz1 = new C0DZ1(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0dz1.LLILLJJLI = obj;
        return c0dz1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "SocialThoughtAuthorPanelVM@9a9d.onDeleteClicked$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 3
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L1f
            if (r0 == r9) goto L2f
            if (r0 == r5) goto L70
            if (r0 != r8) goto La4
            X.C155000ia.LIZIZ(r12)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r12)
            java.lang.String r1 = r11.LLILLL
            com.ss.android.ugc.aweme.social.thought.api.ThoughtApi r0 = com.ss.android.ugc.aweme.social.thought.api.ThoughtApi.LIZIZ     // Catch: java.lang.Throwable -> L38
            r11.LL = r9     // Catch: java.lang.Throwable -> L38
            java.lang.Object r12 = r0.deleteThought(r1, r11)     // Catch: java.lang.Throwable -> L38
            if (r12 != r7) goto L32
            goto Lac
        L2f:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L38
        L32:
            com.ss.android.ugc.aweme.social.thought.api.model.DeleteThoughtResponse r12 = (com.ss.android.ugc.aweme.social.thought.api.model.DeleteThoughtResponse) r12     // Catch: java.lang.Throwable -> L38
            X.C189200o6.m2constructorimpl(r12)     // Catch: java.lang.Throwable -> L38
            goto L44
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r12 = new X.00Yq
            r12.<init>(r0)
            X.C189200o6.m2constructorimpl(r12)
        L44:
            r6 = r12
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r4 = r11.LLILZ
            com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtAuthorPanelVM r3 = r11.LLILZIL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r6)
            if (r0 == 0) goto L75
            X.0DZg r0 = X.C341220DZg.LIZ
            java.lang.String r2 = r3.LL
            java.lang.String r1 = r3.LLILLJJLI
            r0.getClass()
            r0 = 0
            X.C341220DZg.LJIIJJI(r4, r2, r1, r9, r0)
            X.1DDr r1 = r3.LLILZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r11.LLILLJJLI = r6
            r11.LL = r5
            java.lang.Object r0 = r1.emit(r0, r11)
            if (r0 != r7) goto L75
            X.C1C7U.LIZIZ(r10)
            return r7
        L70:
            java.lang.Object r6 = r11.LLILLJJLI
            X.C155000ia.LIZIZ(r12)
        L75:
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r5 = r11.LLILZ
            com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtAuthorPanelVM r4 = r11.LLILZIL
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r6)
            if (r1 == 0) goto L19
            X.0DZg r0 = X.C341220DZg.LIZ
            java.lang.String r3 = r4.LL
            java.lang.String r2 = r4.LLILLJJLI
            java.lang.String r1 = r1.getMessage()
            r0.getClass()
            r0 = 0
            X.C341220DZg.LJIIJJI(r5, r3, r2, r0, r1)
            X.1DDr r1 = r4.LLILZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.LLILLJJLI = r6
            r11.LL = r8
            java.lang.Object r0 = r1.emit(r0, r11)
            if (r0 != r7) goto L19
            X.C1C7U.LIZIZ(r10)
            return r7
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lac:
            X.C1C7U.LIZIZ(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DZ1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
