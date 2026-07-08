package X;

/* JADX INFO: renamed from: X.13oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20125413oq extends AbstractC20125613os {
    public String LIZ;
    public Long LIZIZ;
    public EnumC20126113ox LIZJ;

    public final C20127013p6 LIZ() {
        String strLIZIZ = "";
        if (this.LIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" tokenExpirationTimestamp");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLIZIZ.isEmpty()) {
            return new C20127013p6(this.LIZ, this.LIZIZ.longValue(), this.LIZJ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Missing required properties:");
        sbLIZ2.append(strLIZIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
