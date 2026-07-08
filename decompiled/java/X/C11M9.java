package X;

/* JADX INFO: renamed from: X.11M9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C11M9<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(C11LR c11lr);
}
