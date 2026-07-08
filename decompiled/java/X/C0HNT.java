package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HNT implements InterfaceC0148002o {
    public final C291001Au<C440120HNq> LL;
    public final C291001Au<C440130HNr> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HNT)) {
            return false;
        }
        C0HNT c0hnt = (C0HNT) obj;
        return Intrinsics.LJFF(this.LL, c0hnt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hnt.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAwemeIdDatabaseState(showExplosionEffect=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showVideoRainEffect=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HNT(C291001Au<C440120HNq> c291001Au, C291001Au<C440130HNr> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
