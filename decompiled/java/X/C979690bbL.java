package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0bbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979690bbL {
    public final WeakReference<InterfaceC978780bZs> LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractCallbackInfo(interactionPageCallback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playbookId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromBanner=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C979690bbL(WeakReference<InterfaceC978780bZs> weakReference, long j, boolean z) {
        this.LIZ = weakReference;
        this.LIZIZ = j;
        this.LIZJ = z;
    }
}
