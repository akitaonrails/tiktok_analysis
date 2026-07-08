package X;

import kotlin.coroutines.CoroutineContext;
import njp.a;

/* JADX INFO: renamed from: X.094x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC23141094x extends a {
    @Override // njp.a, X.InterfaceC1364105Vn
    public CoroutineContext getContext() {
        return C23271099x.INSTANCE;
    }

    public AbstractC23141094x(InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        if (interfaceC1364105Vn != null && interfaceC1364105Vn.getContext() != C23271099x.INSTANCE) {
            "Coroutines with restricted suspension must have EmptyCoroutineContext".toString();
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }
}
