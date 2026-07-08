package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZB0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZB0 extends AbstractC895450ZAx {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C0ZB0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZB0)) {
            return false;
        }
        C0ZB0 c0zb0 = (C0ZB0) obj;
        return this.LIZ == c0zb0.LIZ && this.LIZIZ == c0zb0.LIZIZ && this.LIZJ == c0zb0.LIZJ && this.LIZLLL == c0zb0.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxUnReadViewState(badgeBackground=");
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

    public C0ZB0(int i) {
        this.LIZ = R.attr.a04;
        this.LIZIZ = 42;
        this.LIZJ = 52;
        this.LIZLLL = R.attr.a1h;
    }
}
