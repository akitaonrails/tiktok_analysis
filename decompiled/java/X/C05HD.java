package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.usecase.AIGCWaitingTimeCalculationUseCase$start$1", f = "AIGCWaitingTimeCalculationUseCase.kt", l = {61, 67}, m = "invokeSuspend")
public final class C05HD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0LY2 LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HD(C0LY2 c0ly2, C238400w2 c238400w2, boolean z, long j, InterfaceC1364105Vn<? super C05HD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0ly2;
        this.LLILZ = c238400w2;
        this.LLILZIL = z;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HD(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003a -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r14 = "AIGCWaitingTimeCalculationUseCase@fd8.start$1"
            X.C1C7U.LIZ(r14)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r15.LLILLJJLI
            r6 = 60000(0xea60, double:2.9644E-319)
            r12 = 0
            r10 = 60
            r8 = 2
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 == r3) goto L6c
            if (r0 != r8) goto L9b
            X.C155000ia.LIZIZ(r16)
        L1d:
            X.00w2 r4 = r15.LLILZ
            long r2 = r4.element
            long r0 = (long) r10
            long r2 = r2 - r0
            r4.element = r2
        L25:
            X.00w2 r0 = r15.LLILZ
            long r0 = r0.element
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L7d
            X.0LY2 r3 = r15.LLILLL
            boolean r2 = r15.LLILZIL
            r3.LIZJ(r0, r2)
            r15.LLILLJJLI = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r6, r15)
            if (r0 != r9) goto L1d
            X.C1C7U.LIZIZ(r14)
            return r9
        L40:
            X.C155000ia.LIZIZ(r16)
            X.0LY2 r4 = r15.LLILLL
            X.00w2 r0 = r15.LLILZ
            long r0 = r0.element
            boolean r2 = r15.LLILZIL
            r4.LIZJ(r0, r2)
            long r0 = r15.LLILZLL
            long r4 = (long) r10
            long r0 = r0 % r4
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L67
            r4 = 60000(0xea60, double:2.9644E-319)
        L59:
            r15.LL = r4
            r15.LLILLJJLI = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r4, r15)
            if (r0 != r9) goto L71
            X.C1C7U.LIZIZ(r14)
            return r9
        L67:
            long r4 = r4 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            goto L59
        L6c:
            long r4 = r15.LL
            X.C155000ia.LIZIZ(r16)
        L71:
            X.00w2 r11 = r15.LLILZ
            long r2 = r11.element
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            long r2 = r2 - r4
            r11.element = r2
            goto L25
        L7d:
            X.0LY2 r0 = r15.LLILLL
            X.1DDq r3 = r0.LIZIZ
            kotlin.Pair r2 = new kotlin.Pair
            r0 = 1
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            boolean r0 = r15.LLILZIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r1, r0)
            r3.setValue(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r14)
            return r0
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05HD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
