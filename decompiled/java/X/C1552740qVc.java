package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552740qVc {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1552740qVc)) {
            return false;
        }
        C1552740qVc c1552740qVc = (C1552740qVc) obj;
        return Intrinsics.LJFF(this.LIZ, c1552740qVc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1552740qVc.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('/');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1552740qVc(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
