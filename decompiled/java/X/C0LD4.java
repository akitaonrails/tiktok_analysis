package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LD4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$fakeProgress$1", f = "AutoCutComponent.kt", l = {1869}, m = "invokeSuspend")
public final class C0LD4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1418150n0X LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<Float, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LD4(C1418150n0X c1418150n0X, long j, Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super C0LD4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1418150n0X;
        this.LLILZ = j;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LD4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[PHI: r3
      0x0027: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:14:0x003f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0039 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AutoCutComponent@2715.fakeProgress$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 100
            r4 = 1
            if (r0 == 0) goto L3f
            if (r0 != r4) goto L4a
            int r3 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r2 = r8.LLILZIL
            float r1 = (float) r3
            float r0 = (float) r5
            float r1 = r1 / r0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r1)
            r2.invoke(r0)
            int r3 = r3 + 1
            if (r3 >= r5) goto L44
        L27:
            X.0n0X r0 = r8.LLILLL
            X.0n0v r0 = r0.LLIZLLLIL
            X.0mzB r0 = r0.LJFF
            if (r0 == 0) goto L44
            long r0 = r8.LLILZ
            r8.LL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L3f:
            X.C155000ia.LIZIZ(r9)
            r3 = 0
            goto L27
        L44:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LD4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
