package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360150EAb {
    public final boolean LIZ;
    public final C0EB2 LIZIZ;

    public C360150EAb() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C360150EAb)) {
            return false;
        }
        C360150EAb c360150EAb = (C360150EAb) obj;
        return this.LIZ == c360150EAb.LIZ && Intrinsics.LJFF(this.LIZIZ, c360150EAb.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetouchItemSeekBarStatus(isShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", seekBarConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C360150EAb(int i) {
        C0EB2 c0eb2;
        if ((i & 2) != 0) {
            c0eb2 = new C0EB2(0);
        } else {
            c0eb2 = null;
        }
        this(false, c0eb2);
    }

    public static C360150EAb LIZ(C360150EAb c360150EAb) {
        C0EB2 c0eb2 = c360150EAb.LIZIZ;
        c360150EAb.getClass();
        return new C360150EAb(false, c0eb2);
    }

    public C360150EAb(boolean z, C0EB2 c0eb2) {
        this.LIZ = z;
        this.LIZIZ = c0eb2;
    }
}
