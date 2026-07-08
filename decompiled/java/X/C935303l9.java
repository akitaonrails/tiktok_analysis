package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03l9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C935303l9 {
    public static final C935303l9 LIZ = new C935303l9();
    public static final Regex LIZIZ = new Regex("\\s");
    public static final String LIZJ = "ecommerce_user_repo";
    public static final String LIZLLL = "ADDRESS_LIST_DIALOG_SHOWED";

    public static Keva LIZ(C935303l9 c935303l9) {
        Object c098200Yq;
        Object c098200Yq2;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        String name;
        c935303l9.getClass();
        Object obj = null;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            c098200Yq = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str = (String) obj;
        if (str == null) {
            if (!C7879035x.LIZLLL()) {
                str = "defaultUID";
            } else {
                throw new IllegalArgumentException("userID is null");
            }
        }
        if (C7879035x.LIZLLL() && LIZIZ.containsMatchIn(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sec uid must not contain spaces: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        String strReplace = LIZIZ.replace(a0.LJLIIIL(str).toString(), "");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZJ);
        sbLIZ2.append(strReplace);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        try {
            c098200Yq2 = Keva.getRepo(strLIZIZ);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            if (!C7879035x.LIZLLL()) {
                c098200Yq2 = Keva.getRepo(LIZJ);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("get keva repo failed : ");
                sbLIZ3.append(strLIZIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return (Keva) c098200Yq2;
    }
}
