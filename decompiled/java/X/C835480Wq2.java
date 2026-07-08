package X;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0Wq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835480Wq2 implements InterfaceC835740WqS, InterfaceC835730WqR, InterfaceC835710WqP {
    public final CountDownLatch LIZ = new CountDownLatch(1);

    @Override // X.InterfaceC835740WqS
    public final void onCanceled() {
        this.LIZ.countDown();
    }

    @Override // X.InterfaceC835730WqR
    public final void onFailure(Exception exc) {
        this.LIZ.countDown();
    }

    @Override // X.InterfaceC835710WqP
    public final void onSuccess(Object obj) {
        this.LIZ.countDown();
    }
}
