package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331380Cyu implements InterfaceC0148002o {
    public final C0SED LL;

    public C331380Cyu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C331380Cyu) && Intrinsics.LJFF(this.LL, ((C331380Cyu) obj).LL);
    }

    public final int hashCode() {
        C0SED c0sed = this.LL;
        if (c0sed == null) {
            return 0;
        }
        return c0sed.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryViewerEntranceState(viewEntranceParam=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C331380Cyu(C0SED c0sed) {
        this.LL = c0sed;
    }
}
