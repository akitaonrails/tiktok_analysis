package X;

/* JADX INFO: renamed from: X.0j02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1264080j02<T> {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C1264090j03();
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageResult -> ");
        if (this instanceof C1265700j2e) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Success, hasMore: true, data size: ");
            sbLIZ2.append(((C1265700j2e) this).LIZLLL.size());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (this instanceof C1264100j04) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Fail, exception message: ");
            sbLIZ3.append(((C1264100j04) this).LIZIZ.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (this instanceof C1264120j06) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Complete, data size: ");
            sbLIZ4.append(((C1264120j06) this).LIZIZ.size());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            if (!(this instanceof C1264110j05)) {
                throw new C1954807lC();
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Cancelled, reason: ");
            sbLIZ5.append(((C1264110j05) this).LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
