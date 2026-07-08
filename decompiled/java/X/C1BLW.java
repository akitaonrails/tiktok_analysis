package X;

import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BLW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLW implements InterfaceC202063144n {
    public static final void LIZ(String str) {
        C1BLY c1bly = C1BLO.LIZJ;
        if (c1bly != null) {
            c1bly.LIZJ(Collections.singletonList(str));
        }
        C1BLQ.LJ(str);
        C2203381BLk c2203381BLk = C2203381BLk.LIZ;
        String strLIZ = C1BLT.LIZ(str);
        c2203381BLk.getClass();
        KevaImpl.getRepo("dynamic_task_triggered", 0).erase(strLIZ);
    }

    public static final void LIZIZ(String str, boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            jSONObject.put("name", str);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("df_load_state", i, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZJ(String str, InterfaceC2203391BLl interfaceC2203391BLl) {
        C1BLO.LIZIZ.put(C1BLT.LIZ(str), interfaceC2203391BLl);
    }
}
