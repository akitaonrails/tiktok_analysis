package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602030rn7 {
    public final AbstractActivityC1602020rn6 LIZ;
    public String LIZIZ;

    public C1602030rn7(AbstractActivityC1602020rn6 abstractActivityC1602020rn6) {
        this.LIZ = abstractActivityC1602020rn6;
    }

    public final void LIZIZ(int i, String str, String str2) {
        InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ(this.LIZ);
        if (interfaceC214902198iLIZJ instanceof MainRootFragment) {
            C0S78.LIZLLL(true, new C1602090rnD(this, interfaceC214902198iLIZJ, i, str, str2));
        } else {
            LIZ(interfaceC214902198iLIZJ, i, str, str2);
        }
    }

    public static void LIZ(InterfaceC214902198i interfaceC214902198i, int i, String str, String str2) {
        String simpleName;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_recreate", i);
            if (interfaceC214902198i == null) {
                simpleName = null;
            } else {
                simpleName = interfaceC214902198i.getClass().getSimpleName();
            }
            jSONObject.put("top_page", simpleName);
            if (str != null) {
                jSONObject.put("payload1", str);
            }
            if (str2 != null) {
                jSONObject.put("payload2", str2);
            }
            AppLogNewUtils.onEventV3("main_activity_saf_recreate_monitor", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
