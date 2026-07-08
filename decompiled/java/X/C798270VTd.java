package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798270VTd {
    public static void LIZ(String str, Exception exc) {
        C1AF0.LJFF(exc, str);
        C2344809Gs.LJI(exc);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", exc.getMessage());
            jSONObject.put("bridge_type", str);
            JSONObject jSONObjectLJ = C2241008qG.LJFF(jSONObject).LJ();
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("get_search_history_exception", 0, jSONObjectLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
