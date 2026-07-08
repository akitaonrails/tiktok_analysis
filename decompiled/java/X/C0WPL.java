package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WPL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPL extends AbstractC199490133o<Void> implements Runnable {
    public final Runnable LLILZIL;

    @Override // X.AbstractC199488133m
    public final String LJIILIIL() {
        String strValueOf = String.valueOf(this.LLILZIL);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append(e3.f);
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask@cd1f.run");
        try {
            this.LLILZIL.run();
            C1C7U.LIZIZ("MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask@cd1f.run");
        } finally {
        }
    }

    public C0WPL(Runnable runnable) {
        runnable.getClass();
        this.LLILZIL = runnable;
    }
}
