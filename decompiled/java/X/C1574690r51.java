package X;

import com.ss.android.ugc.aweme.minidrama.ab.ShareAwemeFrameworkConfigModel;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0r51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574690r51 {
    public static final C1574690r51 LIZ = new C1574690r51();
    public static final ShareAwemeFrameworkConfigModel LIZIZ;
    public static final ShareAwemeFrameworkConfigModel LIZJ;
    public static final C01GW LIZLLL;

    static {
        ShareAwemeFrameworkConfigModel shareAwemeFrameworkConfigModel = new ShareAwemeFrameworkConfigModel(false, 0, 0, 0, null, 30, null);
        LIZIZ = shareAwemeFrameworkConfigModel;
        LIZJ = shareAwemeFrameworkConfigModel;
        LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(14));
    }

    public static boolean LIZ() {
        return ((ShareAwemeFrameworkConfigModel) LIZLLL.getValue()).enabled;
    }

    public static boolean LIZIZ(AbstractC1574500r4i abstractC1574500r4i) {
        List<String> list = ((ShareAwemeFrameworkConfigModel) LIZLLL.getValue()).disabledScenes;
        if (list.isEmpty()) {
            return true;
        }
        String strLIZ = abstractC1574500r4i.LIZ();
        if (list.isEmpty()) {
            return true;
        }
        for (String str : list) {
            LIZ.getClass();
            if (str.length() != 0 && strLIZ.length() != 0) {
                if (a0.LJJIJ(str, ':')) {
                    if (Intrinsics.LJFF(str, strLIZ)) {
                        return false;
                    }
                } else {
                    if (!Intrinsics.LJFF(str, strLIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(':');
                        if (u.LJJIIJZLJL(strLIZ, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
