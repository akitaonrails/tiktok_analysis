package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895470ZAz extends AbstractC895450ZAx {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C895470ZAz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895470ZAz)) {
            return false;
        }
        C895470ZAz c895470ZAz = (C895470ZAz) obj;
        return this.LIZ == c895470ZAz.LIZ && this.LIZIZ == c895470ZAz.LIZIZ && this.LIZJ == c895470ZAz.LIZJ && this.LIZLLL == c895470ZAz.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxNormalViewState(badgeBackground=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleTuxFont=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentTuxFont=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentTuxColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC895450ZAx
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC895450ZAx
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC895450ZAx
    public final int LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC895450ZAx
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C895470ZAz(int i) {
        this.LIZ = R.attr.a04;
        this.LIZIZ = 41;
        this.LIZJ = 51;
        this.LIZLLL = R.attr.a1k;
    }
}
