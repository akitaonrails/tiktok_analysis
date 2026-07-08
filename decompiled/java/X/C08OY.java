package X;

import com.ss.android.vesdk.runtime.VESafelyLibsLoader;
import java.util.List;

/* JADX INFO: renamed from: X.08OY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08OY {
    public static final boolean LIZ(List<String> list) {
        System.currentTimeMillis();
        for (String str : list) {
            System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Start loadLibrary ");
            sbLIZ.append(str);
            C971740bOW.LIZ(3, C2188811AlT.LIZIZ(sbLIZ));
            if (!VESafelyLibsLoader.loadLibrary(str, null)) {
                return false;
            }
            System.currentTimeMillis();
        }
        return true;
    }
}
