package X;

import android.os.Build;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import java.util.Set;

/* JADX INFO: renamed from: X.07MK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MK {
    public static final C07MK LIZ = new C07MK();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"GH", "GE", "QA", "KH", "CZ", "CI", "UG", "HN", "ET", "KG", "JP"});
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C18001073f());

    public static boolean LIZ() {
        if (!C070Q.LIZ() || Build.VERSION.SDK_INT <= 28 || !((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIJIL()) {
            return false;
        }
        C104100aN.LIZ().LJFF();
        return true;
    }
}
