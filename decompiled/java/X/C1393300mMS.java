package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393300mMS extends AbstractC1393330mMV {
    public final String LIZJ;
    public final EnumC1392960mLu LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1393300mMS)) {
            return false;
        }
        C1393300mMS c1393300mMS = (C1393300mMS) obj;
        return Intrinsics.LJFF(this.LIZJ, c1393300mMS.LIZJ) && this.LIZLLL == c1393300mMS.LIZLLL;
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MuteTheirAll(uid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1393330mMV
    public final String LIZIZ() {
        return this.LIZJ;
    }

    public C1393300mMS(String str, EnumC1392960mLu enumC1392960mLu) {
        super(str);
        this.LIZJ = str;
        this.LIZLLL = enumC1392960mLu;
    }
}
