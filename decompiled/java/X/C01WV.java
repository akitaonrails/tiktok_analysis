package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.core.linkmic.timer.Timer$createCountdownFlow$1", f = "Timer.kt", l = {58, 59, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C01WV extends C09AX implements Function2<InterfaceC346701Wf<? super Long>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C964680bD8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WV(long j, C964680bD8 c964680bD8, InterfaceC1364105Vn<? super C01WV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c964680bD8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01WV c01wv = new C01WV(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c01wv.LLILLJJLI = obj;
        return c01wv;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:23:0x006d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "Timer@6c79.createCountdownFlow$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r12.LL
            r6 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L1f
            if (r0 == r7) goto L4f
            if (r0 == r8) goto L66
            if (r0 != r6) goto L92
            X.C155000ia.LIZIZ(r13)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r4 = r12.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            long r2 = r12.LLILLL
            X.0bD8 r0 = r12.LLILZ
            kotlin.jvm.functions.Function0<java.lang.Long> r0 = r0.LIZLLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r2 = r2 - r0
        L37:
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L7f
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r12.LLILLJJLI = r4
            r12.LL = r7
            java.lang.Object r0 = r4.emit(r0, r12)
            if (r0 != r5) goto L56
            X.C1C7U.LIZIZ(r11)
            return r5
        L4f:
            java.lang.Object r4 = r12.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.C155000ia.LIZIZ(r13)
        L56:
            r12.LLILLJJLI = r4
            r12.LL = r8
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r12)
            if (r0 != r5) goto L6d
            X.C1C7U.LIZIZ(r11)
            return r5
        L66:
            java.lang.Object r4 = r12.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.C155000ia.LIZIZ(r13)
        L6d:
            long r2 = r12.LLILLL
            X.0bD8 r0 = r12.LLILZ
            kotlin.jvm.functions.Function0<java.lang.Long> r0 = r0.LIZLLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r2 = r2 - r0
            goto L37
        L7f:
            java.lang.Long r1 = X.C2286608xc.LJFF(r9)
            r0 = 0
            r12.LLILLJJLI = r0
            r12.LL = r6
            java.lang.Object r0 = r4.emit(r1, r12)
            if (r0 != r5) goto L19
            X.C1C7U.LIZIZ(r11)
            return r5
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01WV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Long> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
