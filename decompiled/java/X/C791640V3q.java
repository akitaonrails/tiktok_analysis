package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791640V3q implements C0V4C {
    public final /* synthetic */ EnumC792960V8s LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Runnable runnable = this.LLILLJJLI;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C791610V3n.LIZ.LIZ("APM_INNER_ERROR_async_task", th);
        }
    }

    @Override // X.C0V4C
    public final EnumC792960V8s getTaskType() {
        return this.LL;
    }

    public C791640V3q(EnumC792960V8s enumC792960V8s, Runnable runnable, String str) {
        this.LL = enumC792960V8s;
        this.LLILLJJLI = runnable;
    }
}
