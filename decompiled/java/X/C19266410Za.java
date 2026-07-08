package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1841100y0i
public final class C19266410Za {
    public static final C19266810Ze Companion = new C19266810Ze();
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19266410Za)) {
            return false;
        }
        C19266410Za c19266410Za = (C19266410Za) obj;
        return Intrinsics.LJFF(this.LIZ, c19266410Za.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19266410Za.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19266410Za.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("L2SResponse(shortenUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19266410Za() {
        this.LIZ = "";
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    public /* synthetic */ C19266410Za(int i, String str, Integer num, String str2) {
        if (0 == 0) {
            this.LIZ = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.LIZIZ = null;
            } else {
                this.LIZIZ = num;
            }
            if ((i & 4) == 0) {
                this.LIZJ = null;
                return;
            } else {
                this.LIZJ = str2;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13IN.LIZ.getDescriptor());
        throw null;
    }
}
