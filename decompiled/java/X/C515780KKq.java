package X;

/* JADX INFO: renamed from: X.0KKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515780KKq {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeProductGroupingKey(packageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C515780KKq(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
