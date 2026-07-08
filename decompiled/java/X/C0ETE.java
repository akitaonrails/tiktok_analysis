package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ETE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETE {
    public final C364490EQt LIZ;
    public final EnumC364790ERx LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ETE)) {
            return false;
        }
        C0ETE c0ete = (C0ETE) obj;
        return Intrinsics.LJFF(this.LIZ, c0ete.LIZ) && this.LIZIZ == c0ete.LIZIZ && this.LIZJ == c0ete.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFillerWordHeaderStates(contextData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromEditPanel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ETE(C364490EQt c364490EQt, EnumC364790ERx enumC364790ERx, boolean z) {
        this.LIZ = c364490EQt;
        this.LIZIZ = enumC364790ERx;
        this.LIZJ = z;
    }
}
