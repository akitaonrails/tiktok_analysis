package X;

import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: renamed from: X.099o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23262099o {
    public static final ThreadLocal<AbstractC2252601DEs> LIZ = new ThreadLocal<>();

    public static AbstractC2252601DEs LIZ() {
        ThreadLocal<AbstractC2252601DEs> threadLocal = LIZ;
        AbstractC2252601DEs abstractC2252601DEs = threadLocal.get();
        if (abstractC2252601DEs != null) {
            return abstractC2252601DEs;
        }
        final Thread threadU3 = C786410Ut5.u3();
        EventLoopImplBase eventLoopImplBase = new EventLoopImplBase(threadU3) { // from class: X.099p
            public final Thread LL;

            @Override // X.AbstractC2252541DEm
            public final Thread getThread() {
                return this.LL;
            }

            {
                this.LL = threadU3;
            }
        };
        threadLocal.set(eventLoopImplBase);
        return eventLoopImplBase;
    }
}
