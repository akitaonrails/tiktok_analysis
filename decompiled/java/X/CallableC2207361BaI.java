package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: X.1BaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class CallableC2207361BaI implements Callable<Integer> {
    public final C2207331BaF LL;
    public ScheduledFuture<Integer> LLILLJJLI;

    public CallableC2207361BaI(C2207331BaF c2207331BaF) {
        this.LL = c2207331BaF;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        C2207331BaF c2207331BaF = this.LL;
        EnumC2207371BaJ enumC2207371BaJ = c2207331BaF.LLIZLLLIL;
        if (enumC2207371BaJ != EnumC2207371BaJ.USER_CANCEL && enumC2207371BaJ != EnumC2207371BaJ.USE_PROVIDERS) {
            c2207331BaF.LLILZLL = true;
            C2207431BaP.LIZIZ().LIZ(this.LL);
        }
        C2207281BaA.LIZ.LIZIZ(this.LL, true);
        return null;
    }
}
