package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745220TLc {
    public static final C745220TLc LIZIZ = new C745220TLc(-1);
    public static final C745220TLc LIZJ = new C745220TLc(-2);
    public final long LIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MuteDuration(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C745220TLc(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(C745220TLc.class, cls) && this.LIZ == ((C745220TLc) obj).LIZ) {
            return true;
        }
        return false;
    }
}
