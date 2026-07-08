package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0VYF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VYF {
    public C0VYK LIZ;
    public long LIZIZ;
    public int LIZJ;

    public static String LIZ(int i, int i2, long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (C0VXL.LIZ == null) {
            C0VXL.LIZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        sbLIZ.append(C0VXL.LIZ.format(new Date(j)));
        sbLIZ.append(" : ");
        sbLIZ.append(str);
        sbLIZ.append('.');
        sbLIZ.append(C0VYH.LJIIZILJ[i2]);
        sbLIZ.append('@');
        sbLIZ.append(Long.toHexString(i));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
