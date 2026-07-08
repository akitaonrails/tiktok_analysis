package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681760Qog implements InterfaceC0148002o {
    public final C291001Au<C681900Qou> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C681760Qog) && Intrinsics.LJFF(this.LL, ((C681760Qog) obj).LL);
    }

    public final int hashCode() {
        C291001Au<C681900Qou> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicTrendingState(musicTrendingData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C681760Qog(C291001Au<C681900Qou> c291001Au) {
        this.LL = c291001Au;
    }
}
