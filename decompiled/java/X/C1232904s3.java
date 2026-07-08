package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232904s3 implements InterfaceC1233004s4 {
    public final String LIZ;
    public final Set<Long> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1232904s3)) {
            return false;
        }
        C1232904s3 c1232904s3 = (C1232904s3) obj;
        return Intrinsics.LJFF(this.LIZ, c1232904s3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1232904s3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Avatar(messageUuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", readers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1233004s4
    public final String LIZ() {
        return this.LIZ;
    }

    public C1232904s3(String str, Set<Long> set) {
        this.LIZ = str;
        this.LIZIZ = set;
    }
}
