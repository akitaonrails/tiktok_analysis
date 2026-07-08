package X;

/* JADX INFO: renamed from: X.12rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19885612rG {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;

    public static C19889112rp LIZ() {
        return new C19889112rp();
    }

    public final String toString() {
        int i = this.LIZ;
        C19883812qy c19883812qy = EnumC19884212r2.LLILLL;
        Integer numValueOf = Integer.valueOf(i);
        String string = (!c19883812qy.containsKey(numValueOf) ? EnumC19884212r2.RESPONSE_CODE_UNSPECIFIED : (EnumC19884212r2) c19883812qy.get(numValueOf)).toString();
        String str = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response Code: ");
        sbLIZ.append(string);
        sbLIZ.append(", Debug Message: ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
