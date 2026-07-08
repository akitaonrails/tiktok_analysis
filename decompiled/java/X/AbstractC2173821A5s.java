package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1A5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2173821A5s {
    public boolean LIZ;
    public final CopyOnWriteArrayList<InterfaceC2173851A5v> LIZIZ = new CopyOnWriteArrayList<>();
    public C2217421BqW LIZJ;

    public void LIZ() {
    }

    public abstract void LIZIZ();

    public void LIZJ(C1776540wKa c1776540wKa) {
    }

    public void LIZLLL() {
    }

    public final void LJ() {
        Iterator<InterfaceC2173851A5v> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    public AbstractC2173821A5s(boolean z) {
        this.LIZ = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BqW, kotlin.jvm.functions.Function0] */
    public final void LJFF(boolean z) {
        this.LIZ = z;
        ?? r0 = this.LIZJ;
        if (r0 != 0) {
            r0.invoke();
        }
    }
}
