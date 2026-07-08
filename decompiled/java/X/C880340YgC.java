package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0YgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880340YgC extends AbstractC884010Ym7 {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C880340YgC() {
        this(0, R.attr.a04, R.attr.zi);
    }

    public final C880340YgC copy(int i, int i2, int i3) {
        return new C880340YgC(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C880340YgC)) {
            return false;
        }
        C880340YgC c880340YgC = (C880340YgC) obj;
        return this.LL == c880340YgC.LL && this.LLILLJJLI == c880340YgC.LLILLJJLI && this.LLILLL == c880340YgC.LLILLL;
    }

    public int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionUnreadViewNumState(num=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contentColor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC884010Ym7
    public int getBackground() {
        return this.LLILLJJLI;
    }

    public final int getContentColor() {
        return this.LLILLL;
    }

    @Override // X.AbstractC884010Ym7
    public int getNum() {
        return this.LL;
    }

    public C880340YgC(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
