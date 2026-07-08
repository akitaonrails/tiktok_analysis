package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1735506qv implements InterfaceC1735006qq {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1735506qv)) {
            return false;
        }
        C1735506qv c1735506qv = (C1735506qv) obj;
        return Intrinsics.LJFF(this.LIZ, c1735506qv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1735506qv.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedLeadInfoData(displayText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leadType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1735506qv() {
        this("", "");
    }

    @Override // X.InterfaceC1735006qq
    public final String LIZ() {
        return this.LIZ;
    }

    public C1735506qv(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
