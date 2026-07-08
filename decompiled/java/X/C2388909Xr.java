package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.epaigctask.EditorProAIGCServiceImpl$onAIPlaygroundAsyncTaskClicked$1$2", f = "EditorProAIGCServiceImpl.kt", l = {182}, m = "invokeSuspend")
public final class C2388909Xr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2388909Xr(Activity activity, AwemeDraft awemeDraft, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = awemeDraft;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C2388909Xr(this.LLILZ, this.LLILLL, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "EditorProAIGCServiceImpl@dfdd.onAIPlaygroundAsyncTaskClicked$1$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L67
            if (r0 != r3) goto L81
            X.C155000ia.LIZIZ(r14)
        L14:
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L7e
            java.util.Iterator r5 = r14.iterator()
        L1c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.0LSZ r3 = (X.C0LSZ) r3
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = r3.LJIIL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDIT_AI_PLAYGROUND
            if (r1 != r0) goto L1c
            java.lang.String r1 = r3.LIZLLL
            X.0LQP r0 = X.C0LQP.EDITOR_PRO_AIGC_T2V
            java.lang.String r0 = r0.getTypeName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1c
        L3d:
            X.0LSZ r4 = (X.C0LSZ) r4
            if (r4 == 0) goto L7e
            int r0 = r4.LJIILL
            java.lang.Integer r8 = X.C2286608xc.LJ(r0)
            java.lang.String r9 = r4.LJIJ
        L49:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.09aq r7 = new X.09aq
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r10 = r13.LLILLL
            android.app.Activity r11 = r13.LLILZ
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r2, r2, r7, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L65:
            r4 = r2
            goto L3d
        L67:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = X.C09BV.LIZ()
            if (r1 == 0) goto L7e
            java.lang.String r0 = r13.LLILLJJLI
            r13.LL = r3
            java.lang.Object r14 = r1.LJJIJLIJ(r0, r13)
            if (r14 != r4) goto L14
            X.C1C7U.LIZIZ(r6)
            return r4
        L7e:
            r8 = r2
            r9 = r2
            goto L49
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2388909Xr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
