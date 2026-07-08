package X;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0KRV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KRV {
    public static final String LIZ() {
        String str = new SimpleDateFormat("yyyyMMddHHmmSSS", Locale.getDefault()).format(Long.valueOf(C158B.LIZ()));
        int iNextInt = new SecureRandom().nextInt(4095);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(C786410Ut5.j4("%03X", Arrays.copyOf(new Object[]{Integer.valueOf(iNextInt)}, 1)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("CLIENT");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
