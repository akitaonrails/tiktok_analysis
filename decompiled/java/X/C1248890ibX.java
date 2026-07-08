package X;

import com.ss.android.ugc.profile.platform.ab.ProfileWhiteComponent;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248890ibX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(692));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(691));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(690));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(688));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(689));

    public static boolean LIZ(String str) {
        return ((List) LIZJ.getValue()).contains(str);
    }

    public static boolean LIZIZ(String str, String str2) {
        List list = (List) C2207051BZn.LIZIZ.getValue();
        if (list != null) {
            for (Object obj : list) {
                if (Intrinsics.LJFF(((ProfileWhiteComponent) obj).getName(), str)) {
                    if (obj != null && !LIZ(str2)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
