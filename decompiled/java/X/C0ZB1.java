package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZB1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZB1 extends AbstractC895450ZAx {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C0ZB1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZB1)) {
            return false;
        }
        C0ZB1 c0zb1 = (C0ZB1) obj;
        return this.LIZ == c0zb1.LIZ && this.LIZIZ == c0zb1.LIZIZ && this.LIZJ == c0zb1.LIZJ && this.LIZLLL == c0zb1.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxMuteViewState(badgeBackground=");
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

    public C0ZB1(int i) {
        this.LIZ = R.attr.a1p;
        this.LIZIZ = 41;
        this.LIZJ = 51;
        this.LIZLLL = R.attr.a1k;
    }
}
