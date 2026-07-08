package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LOB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$navigateCloudDraft$1", f = "NavigateServiceImpl.kt", l = {115, 116, 125, 126, 127}, m = "invokeSuspend")
public final class C0LOB extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NavigateServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIGCDraft LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOB(NavigateServiceImpl navigateServiceImpl, Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super C0LOB> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = navigateServiceImpl;
        this.LLILLL = context;
        this.LLILZ = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "NavigateServiceImpl@832b.navigateCloudDraft$1"
            X.C1C7U.LIZ(r12)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r6 = 5
            r5 = 4
            r4 = 3
            r10 = 2
            r9 = 1
            if (r0 == 0) goto L24
            if (r0 == r9) goto L39
            if (r0 == r10) goto L7b
            if (r0 == r4) goto Lbe
            if (r0 == r5) goto Lbe
            if (r0 == r6) goto Lbe
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L24:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.aigc.NavigateServiceImpl r2 = r13.LLILLJJLI
            android.content.Context r1 = r13.LLILLL
            com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r0 = r13.LLILZ
            r13.LL = r9
            java.lang.Object r14 = r2.LJ(r1, r0, r13)
            if (r14 != r3) goto L3c
            X.C1C7U.LIZIZ(r12)
            return r3
        L39:
            X.C155000ia.LIZIZ(r14)
        L3c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            if (r0 != 0) goto L4a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        L4a:
            X.0LfN r0 = X.C548590LfN.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService r11 = X.C548590LfN.LIZ()
            com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r0 = r13.LLILZ
            X.0LbL r8 = r0.businessKey
            java.lang.String r7 = r0.serverTaskId
            X.0LOJ r2 = new X.0LOJ
            boolean r0 = r0.success
            r1 = r0 ^ 1
            boolean r0 = X.C306490Bzr.LIZ()
            if (r0 != 0) goto L6c
            com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r0 = r13.LLILZ
            boolean r0 = r0.success
            if (r0 == 0) goto L6c
            r9 = 0
        L6c:
            r2.<init>(r1, r9)
            r13.LL = r10
            java.lang.Object r14 = r11.LJII(r8, r7, r2, r13)
            if (r14 != r3) goto L7e
            X.C1C7U.LIZIZ(r12)
            return r3
        L7b:
            X.C155000ia.LIZIZ(r14)
        L7e:
            boolean r0 = r14 instanceof com.ss.android.ugc.aweme.draft.model.AwemeDraft
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r14 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r14
        L84:
            com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r2 = r13.LLILZ
            boolean r0 = r2.success
            if (r0 != 0) goto L9c
            com.ss.android.ugc.aweme.aigc.NavigateServiceImpl r1 = r13.LLILLJJLI
            android.content.Context r0 = r13.LLILLL
            r13.LL = r4
            java.lang.Object r0 = r1.LJIIIIZZ(r0, r2, r14, r13)
            if (r0 != r3) goto Lc1
            X.C1C7U.LIZIZ(r12)
            return r3
        L9a:
            r14 = 0
            goto L84
        L9c:
            if (r14 == 0) goto Lae
            com.ss.android.ugc.aweme.aigc.NavigateServiceImpl r1 = r13.LLILLJJLI
            android.content.Context r0 = r13.LLILLL
            r13.LL = r5
            java.lang.Object r0 = r1.LJII(r0, r2, r14, r13)
            if (r0 != r3) goto Lc1
            X.C1C7U.LIZIZ(r12)
            return r3
        Lae:
            com.ss.android.ugc.aweme.aigc.NavigateServiceImpl r1 = r13.LLILLJJLI
            android.content.Context r0 = r13.LLILLL
            r13.LL = r6
            java.lang.Object r0 = r1.LJIIJ(r0, r2, r13)
            if (r0 != r3) goto Lc1
            X.C1C7U.LIZIZ(r12)
            return r3
        Lbe:
            X.C155000ia.LIZIZ(r14)
        Lc1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LOB.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
