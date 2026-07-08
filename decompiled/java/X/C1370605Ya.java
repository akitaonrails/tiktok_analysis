package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05Ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
public final class C1370605Ya extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C05YY>, Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ int LLILLL;
    public final /* synthetic */ C1370805Yc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370605Ya(C1370805Yc c1370805Yc, InterfaceC1364105Vn<? super C1370605Ya> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c1370805Yc;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r4 = 5
            r6 = 4
            r9 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L85
            if (r0 == r2) goto L42
            if (r0 == r9) goto L5e
            if (r0 == r6) goto L72
            if (r0 == r4) goto L85
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r11)
            X.01Wf r3 = r10.LLILLJJLI
            int r0 = r10.LLILLL
            if (r0 <= 0) goto L33
            X.05YY r0 = X.C05YY.START
            r10.LL = r1
            java.lang.Object r0 = r3.emit(r0, r10)
            if (r0 != r5) goto L88
            return r5
        L33:
            X.05Yc r0 = r10.LLILZ
            long r0 = r0.LIZIZ
            r10.LLILLJJLI = r3
            r10.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r5) goto L47
            return r5
        L42:
            X.01Wf r3 = r10.LLILLJJLI
            X.C155000ia.LIZIZ(r11)
        L47:
            X.05Yc r0 = r10.LLILZ
            long r1 = r0.LIZJ
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L77
            X.05YY r0 = X.C05YY.STOP
            r10.LLILLJJLI = r3
            r10.LL = r9
            java.lang.Object r0 = r3.emit(r0, r10)
            if (r0 != r5) goto L63
            return r5
        L5e:
            X.01Wf r3 = r10.LLILLJJLI
            X.C155000ia.LIZIZ(r11)
        L63:
            X.05Yc r0 = r10.LLILZ
            long r0 = r0.LIZJ
            r10.LLILLJJLI = r3
            r10.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r5) goto L77
            return r5
        L72:
            X.01Wf r3 = r10.LLILLJJLI
            X.C155000ia.LIZIZ(r11)
        L77:
            X.05YY r1 = X.C05YY.STOP_AND_RESET_REPLAY_CACHE
            r0 = 0
            r10.LLILLJJLI = r0
            r10.LL = r4
            java.lang.Object r0 = r3.emit(r1, r10)
            if (r0 != r5) goto L88
            return r5
        L85:
            X.C155000ia.LIZIZ(r11)
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1370605Ya.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C05YY> interfaceC346701Wf, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C1370605Ya c1370605Ya = new C1370605Ya(this.LLILZ, interfaceC1364105Vn);
        c1370605Ya.LLILLJJLI = interfaceC346701Wf;
        c1370605Ya.LLILLL = iIntValue;
        return c1370605Ya.invokeSuspend(Unit.LIZ);
    }
}
