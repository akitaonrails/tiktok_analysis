package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0pyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532410pyp<T> {
    public final AbstractC1532350pyj<T> LIZ;
    public final AtomicBoolean LIZIZ;
    public final Class<T> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceRefWrapper: ");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1532410pyp(boolean z, AbstractC1532350pyj<T> abstractC1532350pyj) {
        AtomicBoolean atomicBoolean;
        this.LIZ = abstractC1532350pyj;
        if (z) {
            atomicBoolean = new AtomicBoolean();
        } else {
            atomicBoolean = null;
        }
        this.LIZIZ = atomicBoolean;
        this.LIZJ = abstractC1532350pyj.LIZIZ;
    }
}
