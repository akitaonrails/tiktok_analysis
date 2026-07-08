package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.newprompt.functions.AILiveWritingComponent$generate$2$1$1", f = "AILiveWritingComponent.kt", l = {117}, m = "invokeSuspend")
public final class C564720MCw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C564710MCv LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC2329309At<C0MD3> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564720MCw(C564710MCv c564710MCv, String str, String str2, String str3, InterfaceC2329309At<C0MD3> interfaceC2329309At, InterfaceC1364105Vn<? super C564720MCw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c564710MCv;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564720MCw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AILiveWritingComponent@eca8.generate$2$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 1
            if (r0 == 0) goto L9b
            if (r0 != r4) goto Lb6
            X.C155000ia.LIZIZ(r9)
            X.00o6 r9 = (X.C189200o6) r9
            java.lang.Object r6 = r9.m10unboximpl()
        L19:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            r3 = 0
            if (r0 == 0) goto L21
            r6 = r3
        L21:
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePromptRewriteResponse r6 = (com.ss.android.ugc.gamora.editor.ailive.repo.AILivePromptRewriteResponse) r6
            X.0L76 r2 = X.C0L76.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "generate: taskId="
            r1.append(r0)
            java.lang.String r0 = r8.LLILZIL
            r1.append(r0)
            java.lang.String r0 = ",response="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AILiveWritingComponent"
            X.C201955140j.LIZLLL(r2, r0, r1)
            r5 = 0
            if (r6 == 0) goto L99
            int r1 = r6.statusCode
            r0 = 3003029(0x2dd295, float:4.20814E-39)
            if (r1 != r0) goto L99
            r0 = 1
        L4f:
            r2 = 2
            if (r0 == 0) goto L6c
            X.0MD3 r1 = new X.0MD3
            r0 = 4001(0xfa1, float:5.607E-42)
            r1.<init>(r0, r3, r2)
        L59:
            X.09At<X.0MD3> r0 = r8.LLILZLL
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L66
            X.09At<X.0MD3> r0 = r8.LLILZLL
            r0.onSuccess(r1)
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L6c:
            if (r6 == 0) goto L91
            int r1 = r6.statusCode
            r0 = 3019014(0x2e1106, float:4.23054E-39)
            if (r1 != r0) goto L7d
            X.0MD3 r1 = new X.0MD3
            r0 = 4002(0xfa2, float:5.608E-42)
            r1.<init>(r0, r3, r2)
            goto L59
        L7d:
            int r0 = r6.statusCode
            if (r0 != 0) goto L91
            java.lang.String r0 = r6.rewritedPrompt
            int r0 = r0.length()
            if (r0 <= 0) goto L91
            X.0MD3 r1 = new X.0MD3
            java.lang.String r0 = r6.rewritedPrompt
            r1.<init>(r5, r0, r4)
            goto L59
        L91:
            X.0MD3 r1 = new X.0MD3
            r0 = 3003(0xbbb, float:4.208E-42)
            r1.<init>(r0, r3, r2)
            goto L59
        L99:
            r0 = 0
            goto L4f
        L9b:
            X.C155000ia.LIZIZ(r9)
            X.0MCv r0 = r8.LLILLJJLI
            X.0MCp r3 = r0.W1()
            java.lang.String r2 = r8.LLILLL
            java.lang.String r1 = r8.LLILZ
            java.lang.String r0 = r8.LLILZIL
            r8.LL = r4
            java.lang.Object r6 = r3.LIZIZ(r2, r1, r0, r8)
            if (r6 != r5) goto L19
            X.C1C7U.LIZIZ(r7)
            return r5
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C564720MCw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
