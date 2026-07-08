package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.07MF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MF {
    public static final List<String> LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("aweme_base_conf.common_param_enabled_hosts", String[].class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String[] strArr = (String[]) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        boolean z = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z = false;
            }
        }
        return z ? C1697810uHb.LJIIJJI(".tiktok.com", ".tiktokv.com", ".musical.ly") : C13LQ.LJJLL(strArr);
    }
}
