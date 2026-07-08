package X;

/* JADX INFO: renamed from: X.0Yft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880150Yft {
    public static final C880150Yft LIZLLL = new C880150Yft(0, EnumC880300Yg8.NONE, 0);
    public final int LIZ;
    public final EnumC880300Yg8 LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionUnreadInfo(unreadCountForCell=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unreadTypeForCell=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", unreadCountForInbox=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C880150Yft(int i, EnumC880300Yg8 enumC880300Yg8, int i2) {
        this.LIZ = i;
        this.LIZIZ = enumC880300Yg8;
        this.LIZJ = i2;
    }
}
