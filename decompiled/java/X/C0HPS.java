package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HPS {
    public final C0HZV<InterfaceC440050HNj> LIZ;
    public final C0HZV<InterfaceC440050HNj> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HPS)) {
            return false;
        }
        C0HPS c0hps = (C0HPS) obj;
        return Intrinsics.LJFF(this.LIZ, c0hps.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hps.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0hps.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HomePageElementRow(topRow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomRow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textInputPlaceholder=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HPS(C0HZV<InterfaceC440050HNj> c0hzv, C0HZV<InterfaceC440050HNj> c0hzv2, String str) {
        this.LIZ = c0hzv;
        this.LIZIZ = c0hzv2;
        this.LIZJ = str;
    }
}
