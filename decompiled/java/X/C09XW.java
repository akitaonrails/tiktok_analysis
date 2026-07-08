package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$onClickItem$1$tasks$1", f = "DraftFragment.kt", l = {1312}, m = "invokeSuspend")
public final class C09XW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<AwemeDraft> LLILLJJLI;
    public final /* synthetic */ DraftFragment LLILLL;
    public final /* synthetic */ C0M0P LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XW(C259800zU<AwemeDraft> c259800zU, DraftFragment draftFragment, C0M0P c0m0p, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C09XW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = draftFragment;
        this.LLILZ = c0m0p;
        this.LLILZIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.ss.android.ugc.aweme.draft.model.AwemeDraft] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "DraftFragment@975a.onClickItem$1$tasks$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LL
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 != r2) goto Lb4
            X.C155000ia.LIZIZ(r11)
        L13:
            X.C1C7U.LIZIZ(r9)
            return r11
        L17:
            X.C155000ia.LIZIZ(r11)
            X.00zU<com.ss.android.ugc.aweme.draft.model.AwemeDraft> r4 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r0 = r10.LLILLL
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = r0.PR()
            X.0Lzc r1 = r0.LLJIJIL
            X.0M0P r0 = r10.LLILZ
            java.lang.String r0 = r0.LJ
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r1.LIZ(r0)
            r4.element = r0
            X.00zU<java.lang.String> r5 = r10.LLILZIL
            com.ss.android.ugc.aweme.tools.draft.DraftFragment r1 = r10.LLILLL
            X.00zU<com.ss.android.ugc.aweme.draft.model.AwemeDraft> r0 = r10.LLILLJJLI
            T r8 = r0.element
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r8 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r8
            X.0M0P r4 = r10.LLILZ
            r1.getClass()
            X.00zU r6 = new X.00zU
            r6.<init>()
            java.lang.String r0 = ""
            r6.element = r0
            r11 = 0
            if (r8 == 0) goto L97
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJIZL
            java.lang.String r1 = r0.videoCoverPath
            if (r1 != 0) goto L51
            java.lang.String r1 = r4.LJFF
        L51:
            r6.element = r1
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 == 0) goto L5b
            java.lang.String r1 = r4.LJFF
        L5b:
            r6.element = r1
            int r0 = r1.length()
            r7 = 0
            if (r0 != 0) goto L97
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0MZB r0 = r0.LJIILLIIL()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r0.LJII(r8)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0MZB r1 = r0.LJIILLIIL()
            r0 = -1
            boolean r0 = r1.LJIIIIZZ(r4, r0)
            if (r0 == 0) goto L97
            X.0MH8 r0 = X.C0MH8.LIZ
            java.lang.String r1 = r0.LJII(r4, r7)
            if (r1 == 0) goto Lb1
            boolean r0 = X.C123100dR.LIZ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb1
        L95:
            r6.element = r1
        L97:
            T r0 = r6.element
            r5.element = r0
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = X.C09BV.LIZ()
            if (r1 == 0) goto L13
            X.0M0P r0 = r10.LLILZ
            java.lang.String r0 = r0.LJ
            r10.LL = r2
            java.lang.Object r11 = r1.LJJIJLIJ(r0, r10)
            if (r11 != r3) goto L13
            X.C1C7U.LIZIZ(r9)
            return r3
        Lb1:
            T r1 = r6.element
            goto L95
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09XW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
