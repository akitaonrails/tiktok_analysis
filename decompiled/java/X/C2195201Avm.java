package X;

import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Avm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195201Avm {
    public IMiniGameRuntimeAPI LIZ;
    public Function1<? super IMiniGameRuntimeAPI, Unit> LIZJ;
    public boolean LIZIZ = false;
    public final ArrayDeque<JSONObject> LIZLLL = new ArrayDeque<>();
    public final Object LJ = new Object();

    public final List<JSONObject> LIZIZ() {
        synchronized (this.LJ) {
            try {
                if (this.LIZLLL.isEmpty()) {
                    return C13BV.INSTANCE;
                }
                return new ArrayList(this.LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C2195201Avm(IMiniGameRuntimeAPI iMiniGameRuntimeAPI) {
        this.LIZ = iMiniGameRuntimeAPI;
    }

    public final void LIZ(JSONObject jSONObject) {
        synchronized (this.LJ) {
            try {
                if (this.LIZLLL.size() >= 1024) {
                    this.LIZLLL.pollFirst();
                }
                this.LIZLLL.addLast(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
