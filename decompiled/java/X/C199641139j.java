package X;

import com.tiktok.ttm.ttmparam.container.TTMContainer;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.139j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199641139j extends PhantomReference<TTMContainer> {
    public final long LIZ;

    public C199641139j(TTMContainer tTMContainer, ReferenceQueue<TTMContainer> referenceQueue) {
        super(tTMContainer, referenceQueue);
        this.LIZ = tTMContainer.getNativeAddress$machine_core_release();
        tTMContainer.hashCode();
    }
}
