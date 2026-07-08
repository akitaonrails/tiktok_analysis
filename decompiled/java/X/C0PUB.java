package X;

/* JADX INFO: renamed from: X.0PUB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUB {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickSearchMobData(cardRegion=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickButtonType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PUB(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
