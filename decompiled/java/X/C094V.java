package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.094V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {424}, m = "invokeSuspend")
public final class C094V extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C094V(InterfaceC346201Wa interfaceC346201Wa, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZIL = j;
        this.LLILZLL = interfaceC346201Wa;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0079 -> B:6:0x0018). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto L7c
            long r3 = r10.LL
            java.lang.Object r9 = r10.LLILZ
            X.0954 r9 = (X.AnonymousClass0954) r9
            java.lang.Object r5 = r10.LLILLL
            X.01Wf r5 = (X.InterfaceC346701Wf) r5
            X.C155000ia.LIZIZ(r11)
        L18:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
            if (r0 != 0) goto L4b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L23:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r4 = r10.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            java.lang.Object r5 = r10.LLILZ
            X.01Wf r5 = (X.InterfaceC346701Wf) r5
            long r2 = r10.LLILZIL
            X.0jzM r0 = X.C19990113Jj.LLILLJJLI
            r0.getClass()
            r0 = 0
            int r0 = X.C19990113Jj.LJI(r2, r0)
            if (r0 <= 0) goto L84
            X.01Wa<java.lang.Object> r2 = r10.LLILZLL
            r1 = 0
            r0 = 2
            X.01Wa r0 = X.C09IC.LIZLLL(r2, r1, r0)
            X.0954 r9 = X.C09IC.LJJIII(r4, r0)
            long r3 = r10.LLILZIL
        L4b:
            X.1DE8 r8 = new X.1DE8
            kotlin.coroutines.CoroutineContext r0 = r10.getContext()
            r8.<init>(r0)
            X.1ArU r2 = r9.LJIIIZ()
            X.094A r1 = new X.094A
            r0 = 0
            r1.<init>(r5, r0)
            r8.LIZJ(r2, r1)
            X.094U r2 = new X.094U
            r2.<init>(r3, r0)
            long r0 = X.AnonymousClass0958.LJ(r3)
            X.C1DEB.LIZ(r8, r0, r2)
            r10.LLILLL = r5
            r10.LLILZ = r9
            r10.LL = r3
            r10.LLILLJJLI = r6
            java.lang.Object r11 = r8.LJII(r10)
            if (r11 != r7) goto L18
            return r7
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L84:
            X.094W r1 = new X.094W
            java.lang.String r0 = "Timed out immediately"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C094V.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long j = this.LLILZIL;
        C094V c094v = new C094V(this.LLILZLL, j, interfaceC1364105Vn);
        c094v.LLILLL = interfaceC497601wk;
        c094v.LLILZ = interfaceC346701Wf;
        return c094v.invokeSuspend(Unit.LIZ);
    }
}
