package X;

import com.ss.android.ugc.aweme.trace.TraceLogUploadResponse;
import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl$uploadRightNowWith4kbLimit$2", f = "TraceLogImpl.kt", l = {292, 305}, m = "invokeSuspend")
public final class C806110Vjl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TraceLogUploadResponse>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TraceLogImpl LLILZ;
    public final /* synthetic */ List<TraceItem> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806110Vjl(TraceLogImpl traceLogImpl, List<TraceItem> list, InterfaceC1364105Vn<? super C806110Vjl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = traceLogImpl;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C806110Vjl c806110Vjl = new C806110Vjl(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c806110Vjl.LLILLL = obj;
        return c806110Vjl;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "TraceLogImpl@8707.uploadRightNowWith4kbLimit$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            java.lang.String r4 = "-1"
            r6 = 2
            r9 = 1
            if (r0 == 0) goto L35
            if (r0 == r9) goto L32
            if (r0 != r6) goto L97
            long r1 = r11.LL
            java.lang.Object r7 = r11.LLILLL
            X.C155000ia.LIZIZ(r12)
        L1c:
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl r3 = r11.LLILZ
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r7)
            if (r0 == 0) goto L2a
            r3.getClass()
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl.LIZLLL(r1, r4)
        L2a:
            X.00o6 r0 = X.C189200o6.m1boximpl(r7)
            X.C1C7U.LIZIZ(r10)
            return r0
        L32:
            long r1 = r11.LL
            goto L52
        L35:
            X.C155000ia.LIZIZ(r12)
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl r8 = r11.LLILZ
            java.util.List<com.ss.android.ugc.aweme.trace.model.TraceItem> r7 = r11.LLILZIL
            X.0Vjk r3 = new X.0Vjk     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            r3.<init>(r7, r0)     // Catch: java.lang.Throwable -> L5c
            r11.LL = r1     // Catch: java.lang.Throwable -> L5c
            r11.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L5c
            r0 = 3
            java.lang.Object r12 = r8.LJ(r0, r11, r3)     // Catch: java.lang.Throwable -> L5c
            if (r12 != r5) goto L55
            goto L9f
        L52:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L5e
        L55:
            r7 = r12
            com.ss.android.ugc.aweme.trace.TraceLogUploadResponse r7 = (com.ss.android.ugc.aweme.trace.TraceLogUploadResponse) r7     // Catch: java.lang.Throwable -> L5e
            X.C189200o6.m2constructorimpl(r7)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L5c:
            r0 = move-exception
            goto L5f
        L5e:
            r0 = move-exception
        L5f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r7 = new X.00Yq
            r7.<init>(r0)
            X.C189200o6.m2constructorimpl(r7)
        L6a:
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl r3 = r11.LLILZ
            boolean r0 = X.C189200o6.m8isSuccessimpl(r7)
            if (r0 == 0) goto L1c
            r0 = r7
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r0
            if (r0 != 0) goto L90
            r0 = r4
        L78:
            r3.getClass()
            com.ss.android.ugc.aweme.trace.impl.TraceLogImpl.LIZLLL(r1, r0)
            X.0Vjc r0 = r3.LJIIJJI
            r11.LLILLL = r7
            r11.LL = r1
            r11.LLILLJJLI = r6
            java.lang.Object r0 = r0.LIZIZ(r11)
            if (r0 != r5) goto L1c
            X.C1C7U.LIZIZ(r10)
            return r5
        L90:
            int r0 = r0.status_code
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L78
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9f:
            X.C1C7U.LIZIZ(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806110Vjl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TraceLogUploadResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
