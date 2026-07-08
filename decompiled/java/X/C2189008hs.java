package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.DraftBoxCleanStorageHintComponent$tryShowCleanStorageUI$1", f = "DraftBoxCleanStorageHintComponent.kt", l = {82}, m = "invokeSuspend")
public final class C2189008hs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C561580M0u LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189008hs(Activity activity, C561580M0u c561580M0u, InterfaceC1364105Vn<? super C2189008hs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = activity;
        this.LLILZ = c561580M0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2189008hs c2189008hs = new C2189008hs(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2189008hs.LLILLJJLI = obj;
        return c2189008hs;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:19:0x004e, B:20:0x0051, B:9:0x0020, B:11:0x0026, B:15:0x0038), top: B:25:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "DraftBoxCleanStorageHintComponent@1396.tryShowCleanStorageUI$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L11
            goto L4e
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r10)
            android.app.Activity r5 = r9.LLILLL
            X.0M0u r4 = r9.LLILZ
            boolean r0 = X.C571820Mbk.LIZ(r5)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L38
            X.0C64 r3 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "draft_box_mock_show_storage_notice"
            r0 = 31744(0x7c00, float:4.4483E-41)
            r1 = 0
            int r0 = r3.LJIJ(r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r0 != r6) goto L36
            r1 = 1
        L36:
            if (r1 == 0) goto L51
        L38:
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L57
            X.08pq r2 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L57
            X.0M0p r1 = new X.0M0p     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r1.<init>(r5, r4, r0)     // Catch: java.lang.Throwable -> L57
            r9.LL = r6     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)     // Catch: java.lang.Throwable -> L57
            if (r0 != r7) goto L51
            X.C1C7U.LIZIZ(r8)
            return r7
        L4e:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L57
        L51:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L57
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L57
            goto L63
        L57:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2189008hs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
