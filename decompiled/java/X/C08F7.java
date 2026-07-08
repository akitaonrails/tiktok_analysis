package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: X.08F7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F7 {
    public static final SimpleDateFormat LJ = new SimpleDateFormat("HH:mm:ss.SSS");
    public final EnumC1474270oT3 LIZ;
    public final String LIZIZ;
    public final Date LIZJ = new Date();
    public final Object LIZLLL;

    public final String toString() {
        String str;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        try {
            str = LJ.format(this.LIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZ.name().toLowerCase());
        if (TextUtils.isEmpty(this.LIZIZ)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", extra='");
            sbLIZ2.append(this.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08F7(EnumC1474270oT3 enumC1474270oT3, String str, Object obj) {
        this.LIZ = enumC1474270oT3;
        this.LIZIZ = str;
        this.LIZLLL = obj;
    }
}
