package X;

/* JADX INFO: renamed from: X.0OYH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OYH extends C0OYE {
    public final C0OY7 LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OYH)) {
            return false;
        }
        C0OYH c0oyh = (C0OYH) obj;
        return this.LL == c0oyh.LL && this.LLILLJJLI == c0oyh.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentFoldFooterItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", foldCommentCursor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OYH(C0OY7 c0oy7, int i) {
        this.LL = c0oy7;
        this.LLILLJJLI = i;
    }
}
