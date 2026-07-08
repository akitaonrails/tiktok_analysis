package X;

/* JADX INFO: renamed from: X.0OYD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OYD extends C0OYE {
    public final C0OY7 LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0OYD) && this.LL == ((C0OYD) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentTextFooterItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OYD(C0OY7 c0oy7) {
        this.LL = c0oy7;
    }
}
