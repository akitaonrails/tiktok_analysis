package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.live.leadgen.pincard.CountDownTextView$startCountDown$1", f = "CountDownTextView.kt", l = {51, 52}, m = "invokeSuspend")
public final class C347301Wl extends C09AX implements Function2<InterfaceC346701Wf<? super Long>, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C347301Wl(long j, long j2, InterfaceC1364105Vn<? super C347301Wl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = j;
        this.LLIZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C347301Wl c347301Wl = new C347301Wl(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c347301Wl.LLILZIL = obj;
        return c347301Wl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r7 <= r5) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:7:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:7:0x0024). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.String r13 = "CountDownTextView@8a2b.startCountDown$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r9 = X.C099R.LJFF()
            r10 = r20
            int r0 = r10.LLILZ
            r16 = 0
            r12 = 2
            r11 = 1
            if (r0 == 0) goto L6a
            if (r0 == r11) goto L43
            if (r0 != r12) goto L86
            long r7 = r10.LLILLL
            long r5 = r10.LLILLJJLI
            long r3 = r10.LL
            java.lang.Object r2 = r10.LLILZIL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r21)
        L24:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L8e
            long r5 = r5 + r3
            r16 = 0
        L2b:
            java.lang.Long r0 = X.C2286608xc.LJFF(r5)
            r10.LLILZIL = r2
            r10.LL = r3
            r10.LLILLJJLI = r5
            r10.LLILLL = r7
            r10.LLILZ = r11
            java.lang.Object r0 = r2.emit(r0, r10)
            if (r0 != r9) goto L50
            X.C1C7U.LIZIZ(r13)
            return r9
        L43:
            long r7 = r10.LLILLL
            long r5 = r10.LLILLJJLI
            long r3 = r10.LL
            java.lang.Object r2 = r10.LLILZIL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r21)
        L50:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L24
            long r0 = r10.LLILZLL
            r10.LLILZIL = r2
            r10.LL = r3
            r10.LLILLJJLI = r5
            r10.LLILLL = r7
            r10.LLILZ = r12
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r9) goto L24
            X.C1C7U.LIZIZ(r13)
            return r9
        L6a:
            X.C155000ia.LIZIZ(r21)
            java.lang.Object r2 = r10.LLILZIL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            long r0 = r10.LLILZLL
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 <= 0) goto L94
            long r3 = -r0
            long r14 = r10.LLIZ
            r5 = r14
            r18 = r3
            long r7 = X.C0GYY.LIZIZ(r14, r16, r18)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L8e
            goto L2b
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L94:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Step must be positive, was: "
            r2.append(r0)
            long r0 = r10.LLILZLL
            r2.append(r0)
            r0 = 46
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347301Wl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Long> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
