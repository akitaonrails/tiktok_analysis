package X;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.11SF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SF {
    public static final C11S0 LIZ = new C11RO() { // from class: X.11S0
        public static final ThreadFactoryC1301810jyt LIZJ = new ThreadFactoryC1301810jyt("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
        public final ThreadFactory LIZIZ = LIZJ;

        @Override // X.C11RO
        public final C11RN LIZ() {
            return new C19502111Rr(this.LIZIZ);
        }
    };
}
