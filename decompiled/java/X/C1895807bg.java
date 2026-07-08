package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1895807bg {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1895807bg)) {
            return false;
        }
        C1895807bg c1895807bg = (C1895807bg) obj;
        return Intrinsics.LJFF(this.LIZ, c1895807bg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1895807bg.LIZIZ) && this.LIZJ == c1895807bg.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleStates(titleContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitleContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showSubtitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1895807bg(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
