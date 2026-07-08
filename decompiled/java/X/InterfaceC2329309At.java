package X;

/* JADX INFO: renamed from: X.09At, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2329309At<T> {
    boolean isDisposed();

    void onError(Throwable th);

    void onSuccess(T t);

    void setCancellable(C11KX c11kx);

    boolean tryOnError(Throwable th);
}
