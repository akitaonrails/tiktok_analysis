package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Esg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378480Esg {
    public final int LIZ;
    public final String LIZIZ;

    public C378480Esg() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378480Esg)) {
            return false;
        }
        C378480Esg c378480Esg = (C378480Esg) obj;
        return this.LIZ == c378480Esg.LIZ && Intrinsics.LJFF(this.LIZIZ, c378480Esg.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptEditResult(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378480Esg(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
