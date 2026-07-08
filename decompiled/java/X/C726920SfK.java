package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726920SfK implements InterfaceC1259230isD {
    public static final C726920SfK LIZ = new C726920SfK();
    public static final Map<String, Set<InterfaceC727210Sfn>> LIZIZ = new LinkedHashMap();
    public static final Map<InterfaceC727210Sfn, String> LIZJ = new LinkedHashMap();
    public static final Map<LifecycleOwner, Set<InterfaceC727210Sfn>> LIZLLL = new LinkedHashMap();

    public static boolean LIZJ() {
        return Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread());
    }

    public static void LIZLLL(InterfaceC727210Sfn interfaceC727210Sfn) throws IllegalAccessException {
        Integer numValueOf;
        if (LIZJ()) {
            Map<InterfaceC727210Sfn, String> map = LIZJ;
            String str = (String) ((LinkedHashMap) map).get(interfaceC727210Sfn);
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregister: uid: ");
                sbLIZ.append(str);
                sbLIZ.append(", views: ");
                Map<String, Set<InterfaceC727210Sfn>> map2 = LIZIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
                Set set = (Set) linkedHashMap.get(str);
                Boolean boolValueOf = null;
                if (set != null) {
                    numValueOf = Integer.valueOf(set.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", contains target: ");
                Set set2 = (Set) linkedHashMap.get(str);
                if (set2 != null) {
                    boolValueOf = Boolean.valueOf(set2.contains(interfaceC727210Sfn));
                }
                sbLIZ.append(boolValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                Set set3 = (Set) linkedHashMap.get(str);
                if (set3 != null) {
                    set3.remove(interfaceC727210Sfn);
                    if (set3.isEmpty()) {
                        map2.remove(str);
                    }
                }
                map.remove(interfaceC727210Sfn);
                return;
            }
            return;
        }
        throw new IllegalAccessException("should unregister in main thread");
    }

    @Override // X.InterfaceC1259230isD
    public final boolean LIZIZ(User user) {
        if (user == null || user.getUid() == null || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(user.getUid(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
        if ((user.getStoryStatus() >= 1 || (zLJFF && !C729220Sj2.LL.LJIIIZ().isEmpty())) && C1601110rld.LIZ() && !user.isAdFake() && !user.isBlock && !user.isBlocked()) {
            if (C10EU.LJIILL(user, zLJFF) && user.getFollowStatus() != 1 && user.getFollowStatus() != 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1259230isD
    public final void LIZ(String str, String str2, User user, String str3) {
        int i;
        String uid = user.getUid();
        if (user.getFollowStatus() == 2) {
            i = 2;
        } else if (user.getFollowStatus() == 1) {
            i = 1;
        } else if (user.getFollowerStatus() == 1) {
            i = 3;
        } else {
            i = 0;
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(str2, "enter_from");
        pairArr[1] = new Pair(uid, "author_id");
        pairArr[2] = new Pair(Integer.valueOf(i), "follow_status");
        if (str3 == null) {
            str3 = "";
        }
        pairArr[3] = new Pair(str3, "req_id");
        pairArr[4] = new Pair("video_cover", "enter_method");
        C20684815ws.LJIJI(str, pairArr);
    }
}
