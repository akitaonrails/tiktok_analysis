package X;

import Y.AObjectS239S0100000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09FY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FY extends AbstractC1622390sJx implements InterfaceC1623110sL7 {
    public final ShortVideoContext LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C05YD<Boolean> LLILZ;
    public final AbstractC2252651DEx LLILZIL;
    public String LLILZLL;
    public final ConcurrentHashMap<String, Object> LLIZ;
    public String LLIZLLLIL;

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILZLL = null;
        this.LLIZLLLIL = null;
        this.LLIZ.clear();
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILZLL = c1627370sRz.LIZ.getEffectId();
    }

    public C09FY(ShortVideoContext shortVideoContext, LifecycleOwner lifecycleOwner, InterfaceC332260D0u interfaceC332260D0u, InterfaceC1648570t0B interfaceC1648570t0B) {
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = interfaceC332260D0u;
        this.LLILZIL = C0PEM.LIZ;
        LiveEvent<TimeSpeedModelExtension> liveEventYM2 = interfaceC1648570t0B.yM2();
        Lifecycle.State state = Lifecycle.State.CREATED;
        liveEventYM2.LJII(lifecycleOwner, state, new AObjectS239S0100000_3(this, 4));
        interfaceC1648570t0B.Ia0().LJII(lifecycleOwner, state, new AObjectS239S0100000_3(this, 5));
        interfaceC1648570t0B.ca2().LJII(lifecycleOwner, state, new AObjectS239S0100000_3(this, 6));
        if (((Boolean) C09FZ.LIZ.getValue()).booleanValue()) {
            C201955140j.LIZIZ("MEMORY_LEAK", "EffectMessagePassThroughHandler coroutine context change ");
            this.LLILZIL = C2107308Nj.LIZ.LLIILII();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), this.LLILZIL, null, new C09FX(this, null), 2);
        this.LLIZ = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) throws JSONException {
        String str2 = this.LLILZLL;
        if (i == 24577 && str != null && str2 != null && this.LLILZ.getValue().booleanValue()) {
            if (C2340509Fb.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C19744512Mx.LIZ), null, null, new C320701Mf(new C09FW(str, this, str2, null), null), 3);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            String strOptString = new JSONObject(str).optString("params");
            if (strOptString.length() <= 0) {
                return;
            }
            jSONObject.put("effect_id", str2);
            jSONObject.put("effect_state_json", strOptString);
            this.LLIZLLLIL = C786410Ut5.J3(jSONObject);
        }
    }
}
