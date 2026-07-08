package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338310DOb implements InterfaceC0148002o {
    public final String LL;

    public C338310DOb() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C338310DOb) && Intrinsics.LJFF(this.LL, ((C338310DOb) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileSchoolState(currentSchool=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C338310DOb(String str) {
        this.LL = str;
    }
}
