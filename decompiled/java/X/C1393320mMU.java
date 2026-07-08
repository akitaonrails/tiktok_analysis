package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mMU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393320mMU extends AbstractC1393330mMV {
    public final String LIZJ;
    public final EnumC1392960mLu LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1393320mMU)) {
            return false;
        }
        C1393320mMU c1393320mMU = (C1393320mMU) obj;
        return Intrinsics.LJFF(this.LIZJ, c1393320mMU.LIZJ) && this.LIZLLL == c1393320mMU.LIZLLL;
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MuteTheirStory(uid=");
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

    public C1393320mMU(String str, EnumC1392960mLu enumC1392960mLu) {
        super(str);
        this.LIZJ = str;
        this.LIZLLL = enumC1392960mLu;
    }
}
