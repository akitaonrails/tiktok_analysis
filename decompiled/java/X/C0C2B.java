package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C2B, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2B {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0C2B)) {
            return false;
        }
        C0C2B c0c2b = (C0C2B) obj;
        return Intrinsics.LJFF(this.LIZ, c0c2b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0c2b.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewUserGuideContent(matchContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", renderContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0C2B(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
