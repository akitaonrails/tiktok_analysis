package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797930VRv {
    public static String LIZ;
    public static boolean LIZIZ = true;
    public static int LIZJ;
    public static int LIZLLL;

    public static boolean LIZ() {
        return ((Boolean) C257640A7u.LIZ.getValue()).booleanValue();
    }

    public static final void LIZIZ(String str) {
        if (!LIZ()) {
            return;
        }
        if (a0.LJJIIZI(str, "onRenderFirstFrame", false)) {
            if (LIZJ < 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("no cold cache reason ");
                sbLIZ.append(C1150504el.LIZ().LJJIFFI.getType());
                LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZJ++;
        }
        if (a0.LJJIIZI(str, "onPageSelected", false)) {
            LIZLLL++;
        }
        if ((LIZLLL > 5 || LIZJ > 5) && (a0.LJJIIZI(str, "onPageSelected", false) || a0.LJJIIZI(str, "onRenderFirstFrame", false))) {
            return;
        }
        LIZJ(str);
    }

    public static void LIZJ(String str) throws IOException {
        C844470XAv.LIZ.getClass();
        if (C844470XAv.LIZ() != null) {
            String absolutePath = null;
            try {
                String str2 = LIZ;
                if (str2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(File.separator);
                    sbLIZ.append("feedCacheLog");
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                    if (!c0vsj.exists()) {
                        c0vsj.mkdir();
                    }
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, "coldCacheLogFile");
                    if (!c0vsj2.exists()) {
                        C590420NDs.LIZ.getClass();
                        C590420NDs.LJI().storeInt("key_session_count", 0);
                        c0vsj2.createNewFile();
                    }
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn((File) c0vsj2, true));
                        String str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                        if (LIZIZ) {
                            bufferedWriter.append('\n');
                            LIZIZ = false;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str3);
                        sbLIZ2.append(' ');
                        C590420NDs.LIZ.getClass();
                        sbLIZ2.append(C590420NDs.LJI().getInt("key_session_count", 0));
                        sbLIZ2.append(' ');
                        sbLIZ2.append("");
                        sbLIZ2.append(' ');
                        sbLIZ2.append(str);
                        bufferedWriter.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2)).append('\n');
                        bufferedWriter.close();
                        return;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                File fileX2 = C786410Ut5.x2(C844470XAv.LIZ());
                if (fileX2 != null) {
                    absolutePath = fileX2.getAbsolutePath();
                }
                LIZ = absolutePath;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
