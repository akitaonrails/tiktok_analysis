package X;

import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl$processAllTasks$1", f = "ChatRoomAdaptiveRequestManagerImpl.kt", l = {154, 155}, m = "invokeSuspend")
public final class C859140Xn6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ChatRoomAdaptiveRequestManagerImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859140Xn6(ChatRoomAdaptiveRequestManagerImpl chatRoomAdaptiveRequestManagerImpl, InterfaceC1364105Vn<? super C859140Xn6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = chatRoomAdaptiveRequestManagerImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859140Xn6 c859140Xn6 = new C859140Xn6(this.LLILLL, interfaceC1364105Vn);
        c859140Xn6.LLILLJJLI = obj;
        return c859140Xn6;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "ChatRoomAdaptiveRequestManagerImpl@8a72.processAllTasks$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LL
            r5 = 0
            r8 = 2
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L26
            if (r0 == r7) goto L21
            if (r0 != r8) goto L19
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L89
            goto L63
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            java.lang.Object r1 = r11.LLILLJJLI
            X.09AE r1 = (X.C09AE) r1
            goto L52
        L26:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r4 = r11.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.0Xn4 r1 = new X.0Xn4     // Catch: java.lang.Throwable -> L89
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL     // Catch: java.lang.Throwable -> L89
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> L89
            r3 = 3
            X.0956 r2 = X.C23250099c.LIZLLL(r4, r6, r6, r1, r3)     // Catch: java.lang.Throwable -> L89
            X.0Xn5 r1 = new X.0Xn5     // Catch: java.lang.Throwable -> L89
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL     // Catch: java.lang.Throwable -> L89
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> L89
            X.0956 r1 = X.C23250099c.LIZLLL(r4, r6, r6, r1, r3)     // Catch: java.lang.Throwable -> L89
            r11.LLILLJJLI = r1     // Catch: java.lang.Throwable -> L89
            r11.LL = r7     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r2.LJJZ(r11)     // Catch: java.lang.Throwable -> L89
            if (r0 != r9) goto L55
            X.C1C7U.LIZIZ(r10)
            return r9
        L52:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L89
        L55:
            r11.LLILLJJLI = r6     // Catch: java.lang.Throwable -> L89
            r11.LL = r8     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r1.LJJZ(r11)     // Catch: java.lang.Throwable -> L89
            if (r0 != r9) goto L63
            X.C1C7U.LIZIZ(r10)
            return r9
        L63:
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJIIJ
            r0.set(r5)
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL
            java.util.concurrent.ConcurrentLinkedQueue<X.0Xng<?>> r0 = r0.LJIIIIZZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL
            java.util.concurrent.ConcurrentLinkedQueue<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r0.LJIIIZ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L83
        L7e:
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL
            r0.LIZJ()
        L83:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L89:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L89
            com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl r0 = r11.LLILLL
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJIIJ
            r0.set(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859140Xn6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
