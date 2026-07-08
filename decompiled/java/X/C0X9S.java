package X;

import com.bytedance.retrofit2.client.Request;

/* JADX INFO: renamed from: X.0X9S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public interface C0X9S<T> extends Cloneable {
    void cancel();

    C0X9S<T> clone();

    void enqueue(InterfaceC594300NSq<T> interfaceC594300NSq);

    C0X52<T> execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
