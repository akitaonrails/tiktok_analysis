package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QDK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDK {
    public static Boolean LIZIZ;
    public static final Keva LIZ = Keva.getRepo("search_middle_photo_search_repo");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(723));

    public static String LIZ() {
        String curSecUserId;
        IAccountUserService iAccountUserService = (IAccountUserService) LIZJ.getValue();
        if (iAccountUserService == null || (curSecUserId = iAccountUserService.getCurSecUserId()) == null) {
            curSecUserId = "";
        }
        return C786410Ut5.j4("has_shown_middle_photo_search_guide_%s", Arrays.copyOf(new Object[]{curSecUserId}, 1));
    }
}
