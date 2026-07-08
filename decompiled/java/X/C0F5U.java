package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F5U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.CaptionLoadingPresenter$createTipsFlow$1", f = "CaptionLoadingPresenter.kt", l = {326, 327, 328}, m = "invokeSuspend")
public final class C0F5U extends C09AX implements Function2<InterfaceC346701Wf<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0F5B LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F5U(C0F5B c0f5b, boolean z, InterfaceC1364105Vn<? super C0F5U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0f5b;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0F5U c0f5u = new C0F5U(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0f5u.LLILLL = obj;
        return c0f5u;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "CaptionLoadingPresenter@3ec5.createTipsFlow$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L6c
            if (r0 == r7) goto L89
            if (r0 != r5) goto La7
            X.C155000ia.LIZIZ(r10)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r2 = r9.LLILLL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.String[] r3 = new java.lang.String[r5]
            X.0F5B r0 = r9.LLILZ
            X.0F5K r0 = r0.LIZ
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment r1 = r0.LIZ
            r0 = 2131833314(0x7f1131e2, float:1.9299707E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            r3[r0] = r1
            X.0F5B r0 = r9.LLILZ
            X.0F5K r0 = r0.LIZ
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment r1 = r0.LIZ
            r0 = 2131833313(0x7f1131e1, float:1.9299705E38)
            java.lang.String r0 = r1.getString(r0)
            r3[r6] = r0
            X.0F5B r0 = r9.LLILZ
            X.0F5K r0 = r0.LIZ
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment r1 = r0.LIZ
            r0 = 2131833315(0x7f1131e3, float:1.9299709E38)
            java.lang.String r0 = r1.getString(r0)
            r3[r7] = r0
            boolean r0 = r9.LLILZIL
            r0 = r0 ^ 1
            r0 = r3[r0]
            r9.LLILLL = r2
            r9.LL = r3
            r9.LLILLJJLI = r6
            java.lang.Object r0 = r2.emit(r0, r9)
            if (r0 != r4) goto L77
            X.C1C7U.LIZIZ(r8)
            return r4
        L6c:
            java.lang.Object r3 = r9.LL
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r2 = r9.LLILLL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r10)
        L77:
            r9.LLILLL = r2
            r9.LL = r3
            r9.LLILLJJLI = r7
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r4) goto L94
            X.C1C7U.LIZIZ(r8)
            return r4
        L89:
            java.lang.Object r3 = r9.LL
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r2 = r9.LLILLL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r10)
        L94:
            r1 = r3[r6]
            r0 = 0
            r9.LLILLL = r0
            r9.LL = r0
            r9.LLILLJJLI = r5
            java.lang.Object r0 = r2.emit(r1, r9)
            if (r0 != r4) goto L19
            X.C1C7U.LIZIZ(r8)
            return r4
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F5U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super String> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
