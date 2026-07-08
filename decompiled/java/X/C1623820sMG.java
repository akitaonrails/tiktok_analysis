package X;

import com.benchmark.strategy.nativePort.ByteBenchFeatureCenterPort;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.AwS386S0200000_20;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623820sMG implements InterfaceC1622080sJS {
    public final HashMap<String, JSONObject> LL = new HashMap<>();

    public final void LIZ() {
        if (InterfaceC1625730sPL.LJIILIIL.enableUseDynamicEffectLabel()) {
            this.LL.clear();
            LIZJ(null);
        }
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    public static final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectLabelHandler ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(Effect effect) {
        List listSingletonList = Collections.singletonList("effect_label");
        if (C21309718aN.LJIIZILJ.LIZIZ()) {
            ByteBenchFeatureCenterPort.LIZJ(listSingletonList);
        }
        if (effect == null) {
            LIZIZ("unregister effect label");
            AFwS258S0000000_20 aFwS258S0000000_20 = AFwS258S0000000_20.get$arr$(9);
            JSONObject jSONObject = new JSONObject();
            aFwS258S0000000_20.invoke(jSONObject);
            if (C21309718aN.LJIIZILJ.LIZIZ()) {
                ByteBenchFeatureCenterPort.LIZ(jSONObject);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register effect label: ");
        sbLIZ.append(effect.getServer_extra());
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        AwS386S0200000_20 awS386S0200000_20 = new AwS386S0200000_20(this, effect, 3);
        JSONObject jSONObject2 = new JSONObject();
        awS386S0200000_20.invoke(jSONObject2);
        if (!C21309718aN.LJIIZILJ.LIZIZ()) {
            return;
        }
        ByteBenchFeatureCenterPort.LIZ(jSONObject2);
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        String server_extra;
        if (!InterfaceC1625730sPL.LJIILIIL.enableUseDynamicEffectLabel()) {
            LIZIZ("not hit experiment - EnableUseDynamicEffectLabel");
            return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect ppi: ");
        Effect effectLIZ = abstractC1627380sS0.LIZ();
        if (effectLIZ != null) {
            server_extra = effectLIZ.getServer_extra();
        } else {
            server_extra = null;
        }
        sbLIZ.append(server_extra);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            LIZJ(((C1627370sRz) abstractC1627380sS0).LIZ);
        } else if (abstractC1627380sS0 instanceof C1627360sRy) {
            LIZJ(null);
        }
        return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
    }
}
