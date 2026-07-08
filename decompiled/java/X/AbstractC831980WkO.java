package X;

import X.InterfaceC832870Wlp;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: X.0WkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831980WkO<R extends InterfaceC832870Wlp, A> extends BasePendingResult<R> implements C0WAH<R> {
    public final C832160Wkg LJIILJJIL;
    public final C832010WkR<?> LJIILL;

    public abstract void LJIILIIL(InterfaceC831160Wj4 interfaceC831160Wj4);

    public final void LJIILJJIL(Status status) {
        C0W3J.LIZ("Failed result must not be success", !status.LJLZ());
        LIZ(LJ(status));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC831980WkO(C832010WkR<?> c832010WkR, AbstractC831960WkM abstractC831960WkM) {
        super(abstractC831960WkM);
        C0W3J.LJIIIZ(abstractC831960WkM, "GoogleApiClient must not be null");
        C0W3J.LJIIIZ(c832010WkR, "Api must not be null");
        this.LJIILJJIL = c832010WkR.LIZIZ;
        this.LJIILL = c832010WkR;
    }
}
