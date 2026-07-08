package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.ProfileDraftTaskProgress$restoreDraftProgressWithAsyncTask$1", f = "ProfileDraftTaskProgress.kt", l = {119, 120, 123}, m = "invokeSuspend")
public final class C545880Lb0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C545930Lb5 LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILZ;
    public final /* synthetic */ AwemeDraft LLILZIL;
    public final /* synthetic */ C553680Lna LLILZLL;
    public final /* synthetic */ Function1<C553680Lna, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C545880Lb0(C545930Lb5 c545930Lb5, List<String> list, ICreationAsyncTaskManager iCreationAsyncTaskManager, AwemeDraft awemeDraft, C553680Lna c553680Lna, Function1<? super C553680Lna, Unit> function1, InterfaceC1364105Vn<? super C545880Lb0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c545930Lb5;
        this.LLILLL = list;
        this.LLILZ = iCreationAsyncTaskManager;
        this.LLILZIL = awemeDraft;
        this.LLILZLL = c553680Lna;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545880Lb0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r16
            java.lang.String r8 = "ProfileDraftTaskProgress@1fb5.restoreDraftProgressWithAsyncTask$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r15.LL
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L21
            if (r0 == r6) goto L47
            if (r0 == r7) goto L5a
            if (r0 != r5) goto L87
            X.C155000ia.LIZIZ(r9)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L21:
            X.C155000ia.LIZIZ(r9)
            X.0Lb5 r1 = r15.LLILLJJLI
            java.util.List<java.lang.String> r0 = r15.LLILLL
            r1.getClass()
            java.lang.String r3 = "ProfileDraftTaskProgress"
            X.AnonymousClass0913.LIZ(r3, r0)
            r1.LJFF = r0
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = r15.LLILZ
            java.util.List<java.lang.String> r1 = r15.LLILLL
            X.0Lb5 r0 = r15.LLILLJJLI
            r0.getClass()
            r15.LL = r6
            java.lang.Object r0 = r2.LJIJI(r3, r1, r15)
            if (r0 != r4) goto L4a
            X.C1C7U.LIZIZ(r8)
            return r4
        L47:
            X.C155000ia.LIZIZ(r9)
        L4a:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = r15.LLILZ
            java.util.List<java.lang.String> r0 = r15.LLILLL
            r15.LL = r7
            X.01Wa r9 = r1.LJJIIZI(r0)
            if (r9 != r4) goto L5d
            X.C1C7U.LIZIZ(r8)
            return r4
        L5a:
            X.C155000ia.LIZIZ(r9)
        L5d:
            X.01Wa r9 = (X.InterfaceC346201Wa) r9
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r3 = r15.LLILZ
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r2 = r15.LLILZIL
            X.0Mqp r1 = new X.0Mqp
            r0 = 1
            r1.<init>(r9, r3, r2, r0)
            X.01Wa r0 = X.C09IC.LJIILL(r1)
            Y.AgS74S0400000_8 r9 = new Y.AgS74S0400000_8
            X.0Lb5 r10 = r15.LLILLJJLI
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r11 = r15.LLILZIL
            X.0Lna r12 = r15.LLILZLL
            kotlin.jvm.functions.Function1<X.0Lna, kotlin.Unit> r13 = r15.LLIZ
            r14 = 2
            r9.<init>(r10, r11, r12, r13, r14)
            r15.LL = r5
            java.lang.Object r0 = r0.collect(r9, r15)
            if (r0 != r4) goto L1b
            X.C1C7U.LIZIZ(r8)
            return r4
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545880Lb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
