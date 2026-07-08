package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0lIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352710lIz {
    public static final C1352710lIz LIZ = new C1352710lIz();

    public static String LJ() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date());
    }

    public static String LIZIZ(Context context) {
        try {
            C0VSJ c0vsj = new C0VSJ(LJFF(context), "record");
            if (!c0vsj.exists()) {
                c0vsj.mkdir();
            }
            String strLJ = LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJ);
            sbLIZ.append("_record.wav");
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
            c0vsj2.createNewFile();
            return c0vsj2.getPath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZJ(String str) {
        if (str != null && str.length() != 0) {
            try {
                new C0VSJ(str).delete();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static boolean LIZLLL(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                if (!LIZLLL((File) c089e.next())) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static C0VSJ LJFF(Context context) {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "voicecomment");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }

    public static C0VSJ LIZ(Context context, String str) throws IOException {
        String strLJ = LJ();
        C0VSJ c0vsj = new C0VSJ(LJFF(context), "send");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJ);
        sbLIZ.append(".m4a");
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
        c0vsj2.createNewFile();
        VEUtils.transCodeAudio(str, c0vsj2.getAbsolutePath(), -1, -1, -1, "aac");
        return c0vsj2;
    }
}
