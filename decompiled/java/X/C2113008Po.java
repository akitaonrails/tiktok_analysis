package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.08Po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113008Po {
    public static final List<String> LIZ;
    public static final StringBuilder LIZIZ;
    public static final Formatter LIZJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append("/VESDK_Demo/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("veimage/");
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append("resource/");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append("filter/");
        C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ2);
        sbLIZ5.append("stickers/");
        C2188811AlT.LIZIZ(sbLIZ5);
        LIZ = new ArrayList();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ);
        sbLIZ6.append("object_tracking/");
        C2188811AlT.LIZIZ(sbLIZ6);
        int i = 1;
        while (true) {
            List<String> list = LIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Filter_0");
            sbLIZ7.append(i);
            ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ7));
            while (true) {
                i++;
                if (i > 19) {
                    new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    LIZIZ = sb;
                    LIZJ = new Formatter(sb, Locale.US);
                    return;
                }
                if (i >= 10) {
                    List<String> list2 = LIZ;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Filter_");
                    sbLIZ8.append(i);
                    ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ8));
                }
            }
        }
    }

    public static long LIZ(File file) {
        long length;
        long j = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    length = LIZ(fileArrListFiles[i]);
                } else {
                    length = fileArrListFiles[i].length();
                }
                j += length;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }

    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                return false;
            }
            if (c0vsj.length() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static String LIZJ(int i) {
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        LIZIZ.setLength(0);
        if (i5 > 0) {
            return LIZJ.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString();
        }
        return LIZJ.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }
}
