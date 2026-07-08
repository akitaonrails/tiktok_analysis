package X;

/* JADX INFO: renamed from: X.0Ygo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880720Ygo {
    public static final /* synthetic */ int LIZLLL = 0;
    public final EnumC880480YgQ LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxFilterOption(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleStr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C880720Ygo(EnumC880480YgQ enumC880480YgQ, String str, Integer num) {
        this.LIZ = enumC880480YgQ;
        this.LIZIZ = str;
        this.LIZJ = num;
    }
}
