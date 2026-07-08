package X;

/* JADX INFO: renamed from: X.140d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC201949140d {
    public final String LIZ;

    static {
        C547130Ld1.LIZ = C581280Mr0.get$arr$(1);
    }

    public AbstractC201949140d(String str, AbstractC201949140d abstractC201949140d) {
        String strLIZIZ;
        if (abstractC201949140d == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CT.");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(abstractC201949140d.LIZ);
            sbLIZ2.append('.');
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LIZ = strLIZIZ;
    }
}
