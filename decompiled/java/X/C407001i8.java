package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01i8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutTemplateComponent$fakeProgress$1", f = "AutoCutTemplateComponent.kt", l = {325}, m = "invokeSuspend")
public final class C407001i8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0L7H LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<Float, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C407001i8(C0L7H c0l7h, long j, Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super C407001i8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0l7h;
        this.LLILZ = j;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C407001i8(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025 A[PHI: r2
      0x0025: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:14:0x003b, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "AutoCutTemplateComponent@6a42.fakeProgress$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L46
            int r2 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L15:
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r1 = r6.LLILZIL
            float r0 = (float) r2
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)
            r1.invoke(r0)
            int r2 = r2 + 1
            r0 = 100
            if (r2 >= r0) goto L40
        L25:
            X.0L7H r0 = r6.LLILLL
            java.lang.String r0 = r0.LLILZIL
            if (r0 == 0) goto L40
            long r0 = r6.LLILZ
            r6.LL = r2
            r6.LLILLJJLI = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L15
            X.C1C7U.LIZIZ(r5)
            return r4
        L3b:
            X.C155000ia.LIZIZ(r7)
            r2 = 0
            goto L25
        L40:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C407001i8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
