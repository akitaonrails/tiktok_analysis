package X;

import kotlin.coroutines.CoroutineContext;
import njp.a;

/* JADX INFO: renamed from: X.094w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC23140094w extends a {
    public final CoroutineContext _context;
    public transient InterfaceC1364105Vn<Object> intercepted;

    public final InterfaceC1364105Vn<Object> intercepted() {
        InterfaceC1364105Vn<Object> interfaceC1364105VnInterceptContinuation = this.intercepted;
        if (interfaceC1364105VnInterceptContinuation == null) {
            InterfaceC23139094v interfaceC23139094v = (InterfaceC23139094v) getContext().get(InterfaceC23139094v.LJJLIIJ);
            if (interfaceC23139094v == null || (interfaceC1364105VnInterceptContinuation = interfaceC23139094v.interceptContinuation(this)) == null) {
                interfaceC1364105VnInterceptContinuation = this;
            }
            this.intercepted = interfaceC1364105VnInterceptContinuation;
        }
        return interfaceC1364105VnInterceptContinuation;
    }

    @Override // njp.a
    public void releaseIntercepted() {
        InterfaceC1364105Vn<?> interfaceC1364105Vn = this.intercepted;
        if (interfaceC1364105Vn != null && interfaceC1364105Vn != this) {
            ((InterfaceC23139094v) getContext().get(InterfaceC23139094v.LJJLIIJ)).releaseInterceptedContinuation(interfaceC1364105Vn);
        }
        this.intercepted = new InterfaceC1364105Vn<Object>() { // from class: X.01Bb
            public String toString() {
                return "This continuation is already complete";
            }

            @Override // X.InterfaceC1364105Vn
            public CoroutineContext getContext() {
                "This continuation is already complete".toString();
                throw new IllegalStateException("This continuation is already complete");
            }

            @Override // X.InterfaceC1364105Vn
            public void resumeWith(Object obj) {
                "This continuation is already complete".toString();
                throw new IllegalStateException("This continuation is already complete");
            }
        };
    }

    @Override // njp.a, X.InterfaceC1364105Vn
    public CoroutineContext getContext() {
        return this._context;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC23140094w(InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        CoroutineContext context;
        if (interfaceC1364105Vn != null) {
            context = interfaceC1364105Vn.getContext();
        } else {
            context = null;
        }
        this(interfaceC1364105Vn, context);
    }

    public AbstractC23140094w(InterfaceC1364105Vn<Object> interfaceC1364105Vn, CoroutineContext coroutineContext) {
        super(interfaceC1364105Vn);
        this._context = coroutineContext;
    }
}
