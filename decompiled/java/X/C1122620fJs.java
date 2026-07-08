package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122620fJs {
    public final Function1<C1883607Zi, Unit> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Float> LIZJ;
    public boolean LIZLLL;
    public float LJ;

    public final void LIZIZ() {
        if (!this.LIZLLL) {
            C051E.LIZ("interaction.unregister.skip", new Pair("reason", "not_registered"), new Pair("business", "sku_routing_prediction_strategy_v1"));
            return;
        }
        C051E.LIZ("interaction.unregister", new Pair("business", "sku_routing_prediction_strategy_v1"));
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW("sku_routing_prediction_strategy_v1");
        this.LIZLLL = false;
    }

    public final void LIZ(HashMap<String, String> map) {
        Float fLJIIIIZZ;
        String str = map.get("model_score");
        if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            this.LJ = fFloatValue;
            float fFloatValue2 = this.LIZJ.invoke().floatValue();
            C051E.LIZ("interaction.score", new Pair("score", Float.valueOf(fFloatValue)), new Pair("threshold", Float.valueOf(fFloatValue2)));
            if (fFloatValue == -1.0f) {
                C051E.LIZ("interaction.skip", new Pair("reason", "blocked_by_strategy"), new Pair("score", Float.valueOf(fFloatValue)));
                LIZIZ();
                return;
            } else {
                if (fFloatValue <= fFloatValue2) {
                    C051E.LIZ("interaction.skip", new Pair("reason", "score_not_above_threshold"), new Pair("score", Float.valueOf(fFloatValue)), new Pair("threshold", Float.valueOf(fFloatValue2)));
                    return;
                }
                C051E.LIZ("interaction.trigger", new Pair("score", Float.valueOf(fFloatValue)), new Pair("threshold", Float.valueOf(fFloatValue2)));
                LIZIZ();
                if (this.LIZIZ.invoke().booleanValue()) {
                    this.LIZ.invoke(new C1883607Zi(EnumC1122690fJz.INTERACTION, fFloatValue, map));
                    return;
                } else {
                    C051E.LIZ("interaction.skip", new Pair("reason", "frequency_blocked_after_trigger"), new Pair("score", Float.valueOf(fFloatValue)));
                    return;
                }
            }
        }
        C051E.LIZ("interaction.skip", new Pair("reason", "missing_model_score"), new Pair("value_keys", map.keySet()));
    }

    public C1122620fJs(C1122700fK0 c1122700fK0, C1122840fKE c1122840fKE, C1122890fKJ c1122890fKJ) {
        this.LIZ = c1122890fKJ;
        this.LIZIZ = c1122700fK0;
        this.LIZJ = c1122840fKE;
    }
}
