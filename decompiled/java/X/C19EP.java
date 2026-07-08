package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.19EP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19EP {
    public final Runnable LIZ;
    public final CopyOnWriteArrayList<InterfaceC21506819Es> LIZIZ = new CopyOnWriteArrayList<>();
    public final Map<InterfaceC21506819Es, C21506219Em> LIZJ = new HashMap();

    public C19EP(Runnable runnable) {
        this.LIZ = runnable;
    }

    public final void LIZ(InterfaceC21506819Es interfaceC21506819Es) {
        this.LIZIZ.remove(interfaceC21506819Es);
        C21506219Em c21506219Em = (C21506219Em) ((HashMap) this.LIZJ).remove(interfaceC21506819Es);
        if (c21506219Em != null) {
            c21506219Em.LIZ.removeObserver(c21506219Em.LIZIZ);
            c21506219Em.LIZIZ = null;
        }
        this.LIZ.run();
    }
}
