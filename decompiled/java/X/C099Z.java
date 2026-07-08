package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.099Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C099Z<T> extends C099D<T> implements InterfaceC23256099i {
    public final InterfaceC1364105Vn<T> LLILZ;

    @Override // kotlinx.coroutines.JobSupport
    public final boolean LJJLIIIIJ() {
        return true;
    }

    @Override // X.InterfaceC23256099i
    public final InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZ;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void LJJIII(Object obj) {
        C2252641DEw.LIZ(C23248099a.LIZ(obj), null, C099M.LIZLLL(this.LLILZ));
    }

    @Override // X.C099D
    public void LJLIL(Object obj) {
        this.LLILZ.resumeWith(C23248099a.LIZ(obj));
    }

    public C099Z(InterfaceC1364105Vn interfaceC1364105Vn, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.LLILZ = interfaceC1364105Vn;
    }
}
