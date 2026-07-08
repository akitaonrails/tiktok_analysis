package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftFileRestoreHandlers$restore$2$deferredList$1$1", f = "IDraftFileRestoreHandler.kt", l = {133, 135, 139, 140}, m = "invokeSuspend")
public final class C366730EZj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftFileRestoreResult>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC365900EWe LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C0LQ2 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366730EZj(InterfaceC365900EWe interfaceC365900EWe, C118300cf c118300cf, int i, C0LQ2 c0lq2, InterfaceC1364105Vn<? super C366730EZj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC365900EWe;
        this.LLILZ = c118300cf;
        this.LLILZIL = i;
        this.LLILZLL = c0lq2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366730EZj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "DraftFileRestoreHandlers@aee8.restore$2$deferredList$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r6 = 0
            r8 = 4
            r2 = 3
            r1 = 2
            r7 = 1
            if (r0 == 0) goto L23
            if (r0 == r7) goto L34
            if (r0 == r1) goto L9e
            if (r0 == r2) goto L6e
            if (r0 != r8) goto L96
            java.lang.Object r0 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L1f:
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.C155000ia.LIZIZ(r11)
            X.0EWe r0 = r10.LLILLL
            r10.LLILLJJLI = r7
            java.lang.Object r11 = r0.LIZJ(r10)
            if (r11 != r5) goto L37
            X.C1C7U.LIZIZ(r9)
            return r5
        L34:
            X.C155000ia.LIZIZ(r11)
        L37:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L60
            X.00cf r4 = r10.LLILZ
            int r3 = r10.LLILZIL
            X.0LQ2 r2 = r10.LLILZLL
            r10.LLILLJJLI = r1
            X.08ps r1 = X.C2108108Nr.LIZ
            X.0EZk r0 = new X.0EZk
            r0.<init>(r4, r3, r2, r6)
            java.lang.Object r1 = X.C23250099c.LJI(r10, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L5a
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L5a:
            if (r1 != r5) goto La1
            X.C1C7U.LIZIZ(r9)
            return r5
        L60:
            X.0EWe r0 = r10.LLILLL
            r10.LLILLJJLI = r2
            java.lang.Object r11 = r0.LJFF(r10)
            if (r11 != r5) goto L71
            X.C1C7U.LIZIZ(r9)
            return r5
        L6e:
            X.C155000ia.LIZIZ(r11)
        L71:
            X.00cf r4 = r10.LLILZ
            int r3 = r10.LLILZIL
            X.0LQ2 r2 = r10.LLILZLL
            r10.LL = r11
            r10.LLILLJJLI = r8
            X.08ps r1 = X.C2108108Nr.LIZ
            X.0EZk r0 = new X.0EZk
            r0.<init>(r4, r3, r2, r6)
            java.lang.Object r1 = X.C23250099c.LJI(r10, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L8e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L8e:
            if (r1 != r5) goto L94
            X.C1C7U.LIZIZ(r9)
            return r5
        L94:
            r0 = r11
            goto L1f
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            X.C155000ia.LIZIZ(r11)
        La1:
            com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult[] r1 = new com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult[r7]
            com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult r2 = new com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult
            X.0EWe r0 = r10.LLILLL
            int r3 = r0.LIZIZ()
            X.0EWe r0 = r10.LLILLL
            int r4 = r0.getPriority()
            r5 = 0
            com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException r7 = new com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException
            r6 = 0
            java.lang.String r0 = "Unknown"
            r7.<init>(r6, r5, r0)
            r2.<init>(r3, r4, r5, r6, r7)
            r1[r6] = r2
            java.util.ArrayList r0 = X.C1697810uHb.LJ(r1)
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366730EZj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftFileRestoreResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
