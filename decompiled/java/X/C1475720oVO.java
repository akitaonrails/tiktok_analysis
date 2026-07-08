package X;

/* JADX INFO: renamed from: X.0oVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475720oVO {
    public static <T> T LIZ(String str, InterfaceC1475730oVP<T> interfaceC1475730oVP) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        T tExecute = interfaceC1475730oVP.execute();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("time cost too mush! ");
            sbLIZ.append(str);
            sbLIZ.append(", time:");
            sbLIZ.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return tExecute;
    }
}
