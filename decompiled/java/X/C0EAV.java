package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EAV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.retouch.common.logic.AutoRetouchApplier$applyAutoRetouch$5", f = "AutoRetouchApplier.kt", l = {252}, m = "invokeSuspend")
public final class C0EAV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0EAU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EAV(C0EAU c0eau, InterfaceC1364105Vn<? super C0EAV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0eau;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EAV(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003f -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AutoRetouchApplier@fc75.applyAutoRetouch$5"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 60
            r4 = 1
            if (r0 == 0) goto L45
            if (r0 != r4) goto L54
            X.00cf r0 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L17:
            int r1 = r0.element
            int r1 = r1 + 5
            r0.element = r1
            X.0EAU r1 = r8.LLILLL
            X.0EAO r3 = r1.LJII
            kotlin.jvm.internal.AwS584S0100000_5 r2 = new kotlin.jvm.internal.AwS584S0100000_5
            r1 = 1145(0x479, float:1.604E-42)
            r2.<init>(r0, r1)
            r3.LIZ(r2)
            int r1 = r0.element
            if (r1 <= r5) goto L31
            r0.element = r5
        L31:
            int r1 = r0.element
            if (r1 >= r5) goto L4e
            r8.LL = r0
            r8.LLILLJJLI = r4
            r1 = 50
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r8)
            if (r1 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L45:
            X.C155000ia.LIZIZ(r9)
            X.00cf r0 = new X.00cf
            r0.<init>()
            goto L31
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EAV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
