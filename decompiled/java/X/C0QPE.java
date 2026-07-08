package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QPE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPE {
    public static final C0QPE LIZ = new C0QPE();
    public static final Map<String, C0QPF> LIZIZ = new LinkedHashMap();
    public static final List<List<String>> LIZJ = new ArrayList();
    public static final List<List<String>> LIZLLL = new ArrayList();
    public static final List<String> LJ = new ArrayList();
    public static final String LJFF = "";

    public static String LIZLLL(C0QPE c0qpe) {
        c0qpe.getClass();
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (accountUserServiceLJIIJ.isLogin()) {
            return accountUserServiceLJIIJ.getCurUserId();
        }
        return "FAKE_USER";
    }

    public final void LIZ(String str, ISearchMiddleForECService iSearchMiddleForECService, C19EG c19eg) {
        C0QP6.LIZ.getClass();
        if (C0QP6.LIZ(c19eg)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJI(str);
            }
        } else {
            if (str == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZLLL(this));
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Map<String, C0QPF> map = LIZIZ;
            if (!map.containsKey(strLIZIZ)) {
                map.put(strLIZIZ, new C0QPF(null));
            }
            ((LinkedHashMap) map).get(strLIZIZ);
        }
    }

    public final String LIZJ(Fragment fragment, ISearchMiddleForECService iSearchMiddleForECService, C19EG c19eg) {
        C650960Pg6 immutableData;
        C0QP6.LIZ.getClass();
        if (C0QP6.LIZ(c19eg)) {
            if (iSearchMiddleForECService == null) {
                return null;
            }
            return iSearchMiddleForECService.LJIJJ();
        }
        C650950Pg5.Companion.getClass();
        C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(fragment, c19eg);
        if (c650950Pg5LJIIIZ == null || (immutableData = c650950Pg5LJIIIZ.getImmutableData()) == null) {
            return null;
        }
        return LIZIZ(this, immutableData.searchVideoModel.groupId, immutableData.searchCommonModel.enterFrom, null);
    }

    public static String LIZIZ(C0QPE c0qpe, String str, String str2, ISearchMiddleForECService iSearchMiddleForECService) {
        c0qpe.getClass();
        C0QP6.LIZ.getClass();
        if (C0QP6.LIZ(null)) {
            if (iSearchMiddleForECService == null) {
                return null;
            }
            return iSearchMiddleForECService.LJIILL(str, str2);
        }
        if (Intrinsics.LJFF("homepage_friends", str2) || Intrinsics.LJFF("discovery", str2)) {
            return LJFF;
        }
        return str;
    }
}
