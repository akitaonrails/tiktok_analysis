package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T96, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T96 extends AbstractC1393330mMV {
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T96)) {
            return false;
        }
        C0T96 c0t96 = (C0T96) obj;
        return Intrinsics.LJFF(this.LIZJ, c0t96.LIZJ) && this.LIZLLL == c0t96.LIZLLL;
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivateModeChange(aid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showToast=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1393330mMV
    public final String LIZ() {
        return this.LIZJ;
    }

    public C0T96(String str, boolean z) {
        super(str);
        this.LIZJ = str;
        this.LIZLLL = z;
    }
}
