package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09X3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$initData$1", f = "DraftFragment.kt", l = {724, 730, 731}, m = "invokeSuspend")
public final class C09X3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DraftFragment LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09X3(DraftFragment draftFragment, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = draftFragment;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09X3 c09x3 = new C09X3(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c09x3.LLILLJJLI = obj;
        return c09x3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "DraftFragment@975a.initData$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 3
            r3 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L20
            if (r0 == r7) goto L70
            if (r0 == r3) goto L87
            if (r0 != r6) goto La3
            X.C155000ia.LIZIZ(r10)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r2 = r9.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r9.LLILLL
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r1 = r0.PR()
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r9.LLILLL
            X.0M3k r0 = r0.LLJ
            r1.CQ2(r0)
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r1 = r9.LLILLL
            X.0M3k r0 = r1.LLJ
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = r1.PR()
            r0.AQ2()
        L41:
            boolean r0 = X.C09X9.LIZ()
            if (r0 == 0) goto L73
            X.09Wz r1 = new X.09Wz
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r9.LLILLL
            r1.<init>(r0, r4)
            X.C23250099c.LIZIZ(r2, r4, r4, r1, r6)
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r9.LLILLL
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = r0.PR()
            int r0 = r0.LLJJ
            if (r0 != 0) goto L73
            X.08pq r2 = X.C2107308Nj.LIZ
            X.09X5 r1 = new X.09X5
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r9.LLILLL
            r1.<init>(r0, r4)
            r9.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r5) goto L73
            X.C1C7U.LIZIZ(r8)
            return r5
        L70:
            X.C155000ia.LIZIZ(r10)
        L73:
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r2 = r9.LLILLL
            android.content.Context r1 = r2.getContext()
            r9.LL = r3
            java.lang.String r0 = "initData"
            java.lang.Object r0 = r2.gS(r1, r0, r9)
            if (r0 != r5) goto L8a
            X.C1C7U.LIZIZ(r8)
            return r5
        L87:
            X.C155000ia.LIZIZ(r10)
        L8a:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.09X4 r2 = new X.09X4
            boolean r1 = r9.LLILZ
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r9.LLILLL
            r2.<init>(r0, r4, r1)
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r3, r2)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r5
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09X3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
