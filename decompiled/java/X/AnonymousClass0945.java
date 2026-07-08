package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0945, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0945 extends AnonymousClass0943 {
    public final C19720512Dr LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0945)) {
            return false;
        }
        AnonymousClass0945 anonymousClass0945 = (AnonymousClass0945) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0945.LIZ) && this.LIZIZ == anonymousClass0945.LIZIZ && this.LIZJ == anonymousClass0945.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Show(banner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFirstShow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0945(C19720512Dr c19720512Dr, int i, boolean z) {
        this.LIZ = c19720512Dr;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
