package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417890n07 extends C096H {
    public final int LIZ = 8;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1417890n07)) {
            return false;
        }
        C1417890n07 c1417890n07 = (C1417890n07) obj;
        return this.LIZ == c1417890n07.LIZ && this.LIZIZ == c1417890n07.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1417890n07.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnTemplateFailure(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1417890n07(int i, String str) {
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
