package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0T57, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T57 extends WeakReference<C0T59> {
    public volatile int LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableHolder(referenceCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T57(C0T59 c0t59) {
        super(c0t59);
        this.LIZ = 1;
    }
}
