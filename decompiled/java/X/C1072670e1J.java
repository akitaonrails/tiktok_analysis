package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0e1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072670e1J {
    public static String LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static C1072670e1J LIZJ;
    public final Keva LIZ;

    public C1072670e1J() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_relation");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("go_through_social_recommend_flow");
        sbLIZ.append(i);
        this.LIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("go_through_social_recommend_flow");
        sbLIZ2.append(i);
        sbLIZ2.append(i2);
        this.LIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("go_through_time_ms");
        sbLIZ3.append(i);
        this.LIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ3), jCurrentTimeMillis);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("go_through_time_ms");
        sbLIZ4.append(i);
        sbLIZ4.append(i2);
        this.LIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ4), jCurrentTimeMillis);
    }
}
