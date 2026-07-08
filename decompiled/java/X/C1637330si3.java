package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0si3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637330si3 implements InterfaceC1622330sJr {
    public final C1DRG LIZ;
    public final Function0<Boolean> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 994));

    public final C2344009Gk LIZ() {
        return (C2344009Gk) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1622330sJr
    public final void onShow(boolean z) {
        Effect effectLLILIL;
        Boolean bool;
        boolean zBooleanValue;
        InterfaceC1647890sz5 interfaceC1647890sz5 = (InterfaceC1647890sz5) this.LIZ.LJIIL(null, InterfaceC1647890sz5.class);
        if (interfaceC1647890sz5 != null) {
            interfaceC1647890sz5.t82(z);
            if (this.LIZIZ.invoke().booleanValue()) {
                return;
            } else {
                interfaceC1647890sz5.m10(!z);
            }
        }
        q qVar = (q) this.LIZ.LJIIL(null, q.class);
        if (qVar != null && (effectLLILIL = qVar.C0().LLILIL()) != null) {
            if (!C1449600npG.LJII(effectLLILIL)) {
                DiyPropParser.EffectExtraMET effectExtraMETLJIILIIL = DiyPropParser.LJIILIIL(effectLLILIL);
                if (effectExtraMETLJIILIIL != null) {
                    Boolean bool2 = effectExtraMETLJIILIIL.allowExporting;
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        DiyPropParser.Editor editor = effectExtraMETLJIILIIL.editor;
                        if (editor == null || (bool = editor.allowExporting) == null) {
                            return;
                        } else {
                            zBooleanValue = bool.booleanValue();
                        }
                    }
                    if (!zBooleanValue) {
                        return;
                    }
                } else {
                    return;
                }
            }
            LIZ().LJFF("template_name", effectLLILIL.getName());
            LIZ().LJFF("template_id", effectLLILIL.getId());
            C2344009Gk c2344009GkLIZ = LIZ();
            DiyPropParser.LJIIJJI(effectLLILIL);
            c2344009GkLIZ.LJFF("is_reuse_create_effect", CardStruct.IStatusCode.DEFAULT);
            C2344009Gk c2344009GkLIZ2 = LIZ();
            DiyPropParser.LJIIJJI(effectLLILIL);
            c2344009GkLIZ2.LJFF("reuse_effect_id", "");
            if (z) {
                C1449260noi.LJ("mobile_effect_text_prompt_click", LIZ().LIZ);
            } else {
                C1449260noi.LJ("mobile_effect_customized_text_prompt", LIZ().LIZ);
            }
        }
    }

    public C1637330si3(C1DRG c1drg, Function0<Boolean> function0) {
        this.LIZ = c1drg;
        this.LIZIZ = function0;
    }
}
