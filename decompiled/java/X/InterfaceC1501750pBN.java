package X;

import okhttp3.Request;

/* JADX INFO: renamed from: X.0pBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1501750pBN<T> extends Cloneable {
    void LLIIIJ(InterfaceC1500240p8w<T> interfaceC1500240p8w);

    void cancel();

    InterfaceC1501750pBN<T> clone();

    C1500770p9n<T> execute();

    boolean isCanceled();

    Request request();
}
