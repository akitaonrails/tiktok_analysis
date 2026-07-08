package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670600QSc {
    public static HashSet<Long> LIZIZ;
    public static String LJ;
    public static final Keva LIZ = Keva.getRepo("search_hot_tooltips_repo");
    public static long LIZJ = -1;
    public static int LIZLLL = -1;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(599));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(600));

    public static long LIZ() {
        INetwork iNetwork = (INetwork) LJFF.getValue();
        return iNetwork != null ? iNetwork.LIZIZ() : System.currentTimeMillis();
    }

    public static void LIZJ() {
        String[] stringArray = LIZ.getStringArray(LIZIZ("bubble_show_time_set_%s"), new String[0]);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        HashSet hashSetLJJLIIIJLJLI = C13LQ.LJJLIIIJLJLI(stringArray);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSetLJJLIIIJLJLI.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        LIZIZ = C13LP.LLIFFJFJJ(arrayList);
    }

    public static String LIZIZ(String str) {
        String curSecUserId;
        IAccountUserService iAccountUserService = (IAccountUserService) LJI.getValue();
        if (iAccountUserService == null || (curSecUserId = iAccountUserService.getCurSecUserId()) == null) {
            curSecUserId = "";
        }
        return C786410Ut5.j4(str, Arrays.copyOf(new Object[]{curSecUserId}, 1));
    }
}
