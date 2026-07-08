package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489980osO extends AbstractC1489970osN {
    public final C1489950osL LJ = new C1489950osL();
    public final Set<String> LJFF = new CopyOnWriteArraySet();
    public final Set<String> LJI = new CopyOnWriteArraySet();
    public final Set<String> LJII = new CopyOnWriteArraySet();
    public int LJIIIIZZ = 5000;
    public int LJIIIZ = 5000;
    public final AtomicLong LJIIJ = new AtomicLong(0);
    public final Set<Request> LJIIJJI = new CopyOnWriteArraySet();

    @Override // X.AbstractC1489970osN
    public final void LJI() {
        super.LJI();
        this.LIZ.LIZJ();
    }

    @Override // X.AbstractC1489970osN
    public final EnumC1489930osJ LJII() {
        return EnumC1489930osJ.RUNTIME_DELAY;
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZJ(Request request) {
        if (LJIIIIZZ(request)) {
            this.LIZ.LJ(request, false, true, this.LJIIIZ);
        }
    }

    @Override // X.AbstractC1489970osN, X.InterfaceC1489890osF
    public final void LIZLLL(final Request request) {
        C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS() { // from class: X.0osP
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ModeRuntimeDelay@d444.notifyRequestCompleted$1");
                try {
                    if (((CopyOnWriteArraySet) this.LLILLJJLI.LJIIJJI).remove(request) && ((CopyOnWriteArraySet) this.LLILLJJLI.LJIIJJI).size() == 0) {
                        this.LLILLJJLI.LIZ.LIZJ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ModeRuntimeDelay@d444.notifyRequestCompleted$1");
            }
        });
    }

    @Override // X.AbstractC1489970osN
    public final boolean LJ(JSONObject jSONObject) {
        super.LJ(jSONObject);
        this.LJ.LIZ(jSONObject);
        this.LIZ.LIZIZ(this.LIZIZ, jSONObject);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("p0");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    ((CopyOnWriteArraySet) this.LJFF).add(strOptString);
                }
            }
        }
        if (((CopyOnWriteArraySet) this.LJ.LIZ).size() <= 0 && ((CopyOnWriteArraySet) this.LJFF).isEmpty()) {
            return false;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("bl_for_runtime");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(strOptString2)) {
                    ((CopyOnWriteArraySet) this.LJI).add(strOptString2);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("wl_for_runtime");
        if (jSONArrayOptJSONArray3 != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                String strOptString3 = jSONArrayOptJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(strOptString3)) {
                    ((CopyOnWriteArraySet) this.LJII).add(strOptString3);
                }
            }
        }
        this.LJIIIIZZ = jSONObject.optInt("p0_check_max_ms", 5000);
        this.LJIIIZ = jSONObject.optInt("p1_wait_max_ms", 5000);
        return true;
    }

    public final boolean LJIIIIZZ(Request request) {
        this.LJ.LIZIZ(request);
        boolean z = false;
        if (C1489880osE.LJII(request.getPath(), this.LJFF)) {
            this.LJIIJ.set(System.currentTimeMillis());
            ((CopyOnWriteArraySet) this.LJIIJJI).add(request);
            return false;
        }
        if (System.currentTimeMillis() - this.LJIIJ.get() <= this.LJIIIIZZ && !((CopyOnWriteArraySet) this.LJIIJJI).isEmpty()) {
            if (!((CopyOnWriteArraySet) this.LJI).isEmpty()) {
                return C1489880osE.LJII(request.getPath(), this.LJI);
            }
            z = true;
            if (!((CopyOnWriteArraySet) this.LJII).isEmpty()) {
                return !C1489880osE.LJII(request.getPath(), this.LJII);
            }
        }
        return z;
    }

    @Override // X.InterfaceC1489890osF
    public final boolean LIZIZ(Request request, Executor executor, C1494560ozm c1494560ozm) {
        if (LJIIIIZZ(request)) {
            return this.LIZ.LIZLLL(request, false, this.LJIIIZ, c1494560ozm, executor);
        }
        return false;
    }
}
