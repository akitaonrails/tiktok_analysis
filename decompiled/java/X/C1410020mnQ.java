package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410020mnQ implements InterfaceC1411260mpQ {
    public final InterfaceC1650230t2r LIZ;
    public final Function0<Effect> LIZIZ;

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "requestEffectInfo";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1410020mnQ(InterfaceC1650230t2r interfaceC1650230t2r, Function0<? extends Effect> function0) {
        this.LIZ = interfaceC1650230t2r;
        this.LIZIZ = function0;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) throws JSONException {
        Effect effectInvoke = this.LIZIZ.invoke();
        if (effectInvoke == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "requestEffectInfo");
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("effect_name", effectInvoke.getName());
        jSONObject2.put("effect_id", effectInvoke.getEffectId());
        jSONObject.put("body", jSONObject2);
        C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(jSONObject));
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }
}
