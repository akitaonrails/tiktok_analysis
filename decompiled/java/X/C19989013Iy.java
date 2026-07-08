package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.13Iy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19989013Iy<T, R> extends C13JB<T, R> implements InterfaceC1364105Vn<R> {
    public final InterfaceC1631620sYq<? super C13JB<?, ?>, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> LL;
    public Object LLILLJJLI;
    public InterfaceC1364105Vn<Object> LLILLL = this;
    public Object LLILZ = C13JG.LIZ;

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return C23271099x.INSTANCE;
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        this.LLILLL = null;
        this.LLILZ = obj;
    }

    public C19989013Iy(Unit unit, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = unit;
    }

    @Override // X.C13JB
    public final Object LIZ(Unit unit, C13J0 c13j0) {
        this.LLILLL = c13j0;
        this.LLILLJJLI = unit;
        Object objLJFF = C099R.LJFF();
        if (objLJFF == C099R.LJFF()) {
            C099Q.LIZJ(c13j0);
        }
        return objLJFF;
    }
}
