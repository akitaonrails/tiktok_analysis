package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.util.LiveBroadcastLogBlockHelper$executeAndBlockRunnable$1$1", f = "LiveBroadcastLogBlockHelper.kt", l = {60, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C21305118Zd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21305318Zf LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21305118Zd(C21305318Zf c21305318Zf, C238400w2 c238400w2, InterfaceC1364105Vn<? super C21305118Zd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21305318Zf;
        this.LLILLL = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21305118Zd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x0078, TryCatch #2 {all -> 0x0078, blocks: (B:13:0x0041, B:15:0x004b, B:18:0x0060), top: B:38:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:38:0x0041). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "LiveBroadcastLogBlockHelper@ad4b.executeAndBlockRunnable$1$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 == r4) goto L1f
            if (r0 != r5) goto L17
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L23
            goto L41
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L23
            goto L60
        L23:
            r3 = move-exception
            goto L79
        L25:
            X.C155000ia.LIZIZ(r12)
            android.os.SystemClock.uptimeMillis()
            X.18Zf r0 = r11.LLILLJJLI
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJFF
            r0.set(r4)
            X.18Zf r2 = r11.LLILLJJLI
            long r0 = com.bytedance.applog.util.BlockHelper.getBlockInterval()
            r2.LJI = r0
            X.18Zf r0 = r11.LLILLJJLI
            long r0 = r0.LIZJ
            com.bytedance.applog.util.BlockHelper.setBlockInterval(r0)
        L41:
            X.00w2 r9 = r11.LLILLL     // Catch: java.lang.Throwable -> L78
            long r2 = r9.element     // Catch: java.lang.Throwable -> L78
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L97
            r0 = -1
            long r2 = r2 + r0
            r9.element = r2     // Catch: java.lang.Throwable -> L78
            com.bytedance.applog.util.BlockHelper.beginBlock()     // Catch: java.lang.Throwable -> L78
            X.18Zf r0 = r11.LLILLJJLI     // Catch: java.lang.Throwable -> L78
            long r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L78
            r11.LL = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)     // Catch: java.lang.Throwable -> L78
            if (r0 != r6) goto L60
            goto L70
        L60:
            com.bytedance.applog.util.BlockHelper.endBlock()     // Catch: java.lang.Throwable -> L78
            X.18Zf r0 = r11.LLILLJJLI     // Catch: java.lang.Throwable -> L78
            long r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L78
            r11.LL = r5     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)     // Catch: java.lang.Throwable -> L78
            if (r0 != r6) goto L41
            goto L74
        L70:
            X.C1C7U.LIZIZ(r10)
            return r6
        L74:
            X.C1C7U.LIZIZ(r10)
            return r6
        L78:
            r3 = move-exception
        L79:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "LiveBroadcastLogBlockHelper"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "TaskExecutor#execute try catch: "
            r1.append(r0)     // Catch: java.lang.Throwable -> La7
            r1.append(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> La7
            X.C20441214yg.LJ(r2, r0)     // Catch: java.lang.Throwable -> La7
            com.bytedance.applog.util.BlockHelper.endBlock()
            X.18Zf r0 = r11.LLILLJJLI
            goto L9c
        L97:
            com.bytedance.applog.util.BlockHelper.endBlock()
            X.18Zf r0 = r11.LLILLJJLI
        L9c:
            long r0 = r0.LJI
            com.bytedance.applog.util.BlockHelper.setBlockInterval(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        La7:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> La7
            com.bytedance.applog.util.BlockHelper.endBlock()
            X.18Zf r0 = r11.LLILLJJLI
            long r0 = r0.LJI
            com.bytedance.applog.util.BlockHelper.setBlockInterval(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21305118Zd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
