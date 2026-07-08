package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0wgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790320wgo<T> {
    public final InterfaceC20236714Gf<T> LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public C1790320wgo(C2252611DEt c2252611DEt) {
        this.LIZ = c2252611DEt;
    }

    public final void LIZ(T t) {
        if (this.LIZIZ.compareAndSet(false, true)) {
            InterfaceC20236714Gf<T> interfaceC20236714Gf = this.LIZ;
            C189200o6.m2constructorimpl(t);
            interfaceC20236714Gf.resumeWith(t);
        }
    }

    public final void LIZIZ(C1790310wgn c1790310wgn) {
        if (this.LIZIZ.compareAndSet(false, true)) {
            InterfaceC20236714Gf<T> interfaceC20236714Gf = this.LIZ;
            C098200Yq c098200Yq = new C098200Yq(c1790310wgn);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
        }
    }
}
