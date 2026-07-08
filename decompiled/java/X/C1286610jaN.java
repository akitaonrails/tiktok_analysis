package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttm.player.x;
import com.ss.ttm.vcshared.VCBaseKitLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286610jaN {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static int LIZLLL;
    public static String LJ;

    static {
        new Object() { // from class: X.0jaO
        };
        LIZ = false;
        LIZIZ = false;
        LIZJ = null;
        LIZLLL = 0;
        LJ = "";
    }

    public static final synchronized void LIZ() {
        try {
            if (LIZLLL == 0) {
                LIZLLL = x.LIZJ(13, 0) / LSPassThroughRecordSizeConfig.DEFAULT;
            }
            VCBaseKitLoader.LIZ();
            boolean z = LIZLLL == 2925;
            if (x.LJ(3)) {
                if (!z) {
                    if (!x.LJ(30)) {
                        LoadSoLancet.LIZJ("c++_shared");
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Librarian.LJFF("c++_shared");
                        LoadSoLancet.LJ(jUptimeMillis, "c++_shared");
                        LoadSoLancet.LIZLLL(jUptimeMillis, "c++_shared");
                        LoadSoLancet.LIZIZ("c++_shared");
                    }
                    LoadSoLancet.LIZJ("audioeffect");
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    Librarian.LJFF("audioeffect");
                    LoadSoLancet.LJ(jUptimeMillis2, "audioeffect");
                    LoadSoLancet.LIZLLL(jUptimeMillis2, "audioeffect");
                    LoadSoLancet.LIZIZ("audioeffect");
                    if (!x.LJ(28)) {
                        LIZJ("ttcrypto");
                        LIZJ("ttboringssl");
                    }
                    LIZJ("ByteVC1_dec");
                    LIZJ("byteVC2dec");
                    LIZJ("ttffmpeg");
                    LIZJ("ttdemux");
                    LIZJ("ttr");
                }
                if (x.LJ(29)) {
                    if (LIZJ("ttmplayerbeta")) {
                        LJ = "ttmplayerbeta";
                    } else {
                        LIZIZ = !LIZJ("ttmplayer");
                    }
                } else if (!LIZJ("ttmplayer")) {
                    LIZIZ = true;
                }
                if (!LIZIZ && LJ.isEmpty()) {
                    LJ = "ttmplayer";
                }
            } else {
                ArrayList arrayList = new ArrayList();
                if (!z) {
                    if (!x.LJ(30)) {
                        arrayList.add("c++_shared");
                    }
                    arrayList.add("audioeffect");
                    if (!x.LJ(28)) {
                        arrayList.add("ttcrypto");
                        arrayList.add("ttboringssl");
                    }
                    arrayList.add("ByteVC1_dec");
                    arrayList.add("byteVC2dec");
                    arrayList.add("ttffmpeg");
                    arrayList.add("ttdemux");
                    arrayList.add("ttr");
                }
                if (x.LJ(29)) {
                    boolean z2 = !LIZIZ(arrayList, false);
                    LIZIZ = z2;
                    if (!z2) {
                        arrayList.clear();
                        arrayList.add("ttmplayerbeta");
                        boolean z3 = LIZIZ(arrayList, true) ? false : true;
                        LIZIZ = z3;
                        if (z3) {
                            arrayList.clear();
                            arrayList.add("ttmplayer");
                            LIZIZ = !LIZIZ(arrayList, true);
                        } else {
                            LJ = "ttmplayerbeta";
                        }
                    }
                } else {
                    arrayList.add("ttmplayer");
                    LIZIZ = !LIZIZ(arrayList, false);
                }
                if (!LIZIZ && LJ.isEmpty()) {
                    LJ = "ttmplayer";
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load default library error.");
            sbLIZ.append(th.toString());
            LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static boolean LIZJ(String str) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lib");
        sbLIZ.append(str);
        sbLIZ.append(".so");
        try {
            x.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (x.LIZ == null) {
                x.LIZ = x.LIZIZ(null);
            }
            if (x.LIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(x.LIZ);
                sbLIZ2.append(File.separatorChar);
                sbLIZ2.append(x.LIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (strLIZIZ != null) {
                    if (!new C0VSJ(strLIZIZ).exists()) {
                        strLIZIZ = null;
                    } else {
                        System.load(strLIZIZ);
                    }
                }
            } else {
                strLIZIZ = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("load path library error.");
            sbLIZ3.append(th.toString());
            LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
            strLIZIZ = null;
        }
        if (strLIZIZ == null) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                LIZIZ(arrayList, true);
                LIZJ = null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(List<String> list, boolean z) {
        boolean z2 = true;
        boolean z3 = LIZ;
        if ((!z) & z3) {
            return z3;
        }
        for (String str : (ArrayList) list) {
            try {
                LoadSoLancet.LIZJ(str);
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF(str);
                LoadSoLancet.LJ(jUptimeMillis, str);
                LoadSoLancet.LIZLLL(jUptimeMillis, str);
                LoadSoLancet.LIZIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZJ = th.getMessage();
                z2 = false;
            }
        }
        LIZ = z2;
        return z2;
    }
}
