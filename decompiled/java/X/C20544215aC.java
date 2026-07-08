package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.widget.CountdownLoadingButton$startCountdown$1", f = "CountdownLoadingButton.kt", l = {104}, m = "invokeSuspend")
public final class C20544215aC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20544115aB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20544215aC(C20544115aB c20544115aB, InterfaceC1364105Vn<? super C20544215aC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20544115aB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20544215aC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0030 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "CountdownLoadingButton@2f7c.startCountdown$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L66
            X.C155000ia.LIZIZ(r7)
        L13:
            X.15aB r1 = r6.LLILLJJLI
            int r0 = r1.LLLIIL
            int r0 = r0 + (-1)
            r1.LLLIIL = r0
        L1b:
            X.15aB r2 = r6.LLILLJJLI
            int r1 = r2.LLLIIL
            if (r1 <= 0) goto L3a
            X.15aD r0 = r2.LLLLII
            if (r0 == 0) goto L28
            r0.LIZIZ(r1)
        L28:
            r6.LL = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L36:
            X.C155000ia.LIZIZ(r7)
            goto L1b
        L3a:
            r1 = 0
            r2.LLLIILIL = r1
            r0 = 0
            r2.LLLILZJ = r0
            r2.setButtonVariant(r1)
            android.animation.ValueAnimator r0 = r2.LLLILZLLLI
            if (r0 == 0) goto L4a
            r0.cancel()
        L4a:
            r1 = 0
            r2.LLLILZLLLI = r1
            X.054G r0 = r2.LLLJL
            if (r0 == 0) goto L54
            X.C2296808zG.LIZJ(r0, r1)
        L54:
            r2.LLLJL = r1
            X.15aD r0 = r2.LLLLII
            if (r0 == 0) goto L5d
            r0.LIZ()
        L5d:
            r2.invalidate()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20544215aC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
