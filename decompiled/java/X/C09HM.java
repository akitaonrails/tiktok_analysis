package X;

/* JADX INFO: renamed from: X.09HM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HM<T> implements C09JN {
    public static final C09HM<T> LL = new C09HM<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        C1C7U.LIZ("RxUtilsKt@ff27.ONLY_DEBUG_ERROR_CONSUMER$1");
        Throwable th = (Throwable) obj;
        if (C2219091BtD.LIZIZ()) {
            Thread threadU3 = C786410Ut5.u3();
            threadU3.getUncaughtExceptionHandler().uncaughtException(threadU3, th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
        C1C7U.LIZIZ("RxUtilsKt@ff27.ONLY_DEBUG_ERROR_CONSUMER$1");
    }
}
