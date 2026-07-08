package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0RbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699000RbO implements Comparable<C699000RbO> {
    public final int LL;
    public final String LLILLJJLI;

    public C699000RbO() {
        this(-1, "");
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LL), this.LLILLJJLI);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C699000RbO c699000RbO) {
        if (this.LL >= c699000RbO.LL) {
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C699000RbO)) {
            return false;
        }
        C699000RbO c699000RbO = (C699000RbO) obj;
        if (c699000RbO.LL == this.LL && C504670Jqj.LIZ(c699000RbO.LLILLJJLI, this.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    public C699000RbO(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
