package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.EditAutoCutComponent$fakeProgress$1", f = "EditAutoCutComponent.kt", l = {3397}, m = "invokeSuspend")
public final class C353490DtT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1417330mzD LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0MJ9 LLILZIL;
    public final /* synthetic */ Function1<Float, Unit> LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353490DtT(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9, Function1<? super Float, Unit> function1, long j, InterfaceC1364105Vn<? super C353490DtT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1417330mzD;
        this.LLILZ = i;
        this.LLILZIL = c0mj9;
        this.LLILZLL = function1;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353490DtT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EditAutoCutComponent@9215.fakeProgress$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L47
            if (r0 != r4) goto L52
            int r3 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L15:
            int r3 = r3 + 1
        L17:
            r6 = 100
            if (r3 >= r6) goto L4c
            X.0mzD r2 = r8.LLILLL
            X.0mzB r0 = r2.LLLLZ
            if (r0 == 0) goto L4c
            int r1 = r8.LLILZ
            X.0MJ9 r0 = r8.LLILZIL
            boolean r0 = r2.Yc(r1, r0)
            if (r0 == 0) goto L4c
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r2 = r8.LLILZLL
            float r1 = (float) r3
            float r0 = (float) r6
            float r1 = r1 / r0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r1)
            r2.invoke(r0)
            long r0 = r8.LLIZ
            r8.LL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r5) goto L15
            X.C1C7U.LIZIZ(r7)
            return r5
        L47:
            X.C155000ia.LIZIZ(r9)
            r3 = 0
            goto L17
        L4c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353490DtT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
