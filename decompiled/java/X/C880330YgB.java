package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0YgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880330YgB extends AbstractC884010Ym7 {
    public final int LL;
    public final int LLILLJJLI;

    public C880330YgB() {
        this(0, R.attr.a04);
    }

    public final C880330YgB copy(int i, int i2) {
        return new C880330YgB(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C880330YgB)) {
            return false;
        }
        C880330YgB c880330YgB = (C880330YgB) obj;
        return this.LL == c880330YgB.LL && this.LLILLJJLI == c880330YgB.LLILLJJLI;
    }

    public int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionUnreadViewDotState(num=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC884010Ym7
    public int getBackground() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC884010Ym7
    public int getNum() {
        return this.LL;
    }

    public C880330YgB(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
