package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560390LyP {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(567));
    public static boolean LIZIZ;

    public static void LIZ() {
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "clearStayTimeInfo");
        LIZIZ().storeString("creation_id", "");
        LIZIZ().storeString("shoot_way", "");
        LIZIZ().storeBoolean("is_draft", false);
        LIZIZ().storeString("enter_way", "");
        LIZIZ().storeLong("enter_time", 0L);
    }

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZJ() {
        if (LIZIZ) {
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "needReportLastExitApp: hasReported");
            return;
        }
        String string = LIZIZ().getString("creation_id", "");
        long j = LIZIZ().getLong("enter_time", 0L);
        if (string == null || string.length() <= 0 || j <= 0) {
            return;
        }
        LIZIZ = true;
        C0CHQ.LIZ().LJJJJZ();
        C804770Vhb c804770Vhb = C804770Vhb.LIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        long jLIZLLL = C804770Vhb.LIZLLL(LIZIZ().getLong("enter_time", 0L), abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZIZ() : null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportLastExitApp: exitTime ");
        sbLIZ.append(jLIZLLL);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (jLIZLLL <= 0) {
            return;
        }
        C560420LyS c560420LyS = C560420LyS.LIZ;
        String string2 = LIZIZ().getString("creation_id", "");
        String string3 = LIZIZ().getString("shoot_way", "");
        boolean z = LIZIZ().getBoolean("is_draft", false);
        String string4 = LIZIZ().getString("enter_way", "");
        long j2 = LIZIZ().getLong("enter_time", 0L);
        c560420LyS.getClass();
        C560420LyS.LIZ(string2, string3, string4, j2, jLIZLLL, z, "app_killed");
        LIZ();
    }
}
