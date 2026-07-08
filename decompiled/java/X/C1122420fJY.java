package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivesdkDmGuidancePredictionStrategySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122420fJY {
    public final Function1<HashMap<String, String>, Unit> LIZ;
    public final Function0<Boolean> LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        if (this.LIZJ) {
            return;
        }
        C20441214yg.LIZIZ("DM_guidance", "registerStrategy: dm_guidance_prediction_strategy_v1");
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).fR1(new InterfaceC1092860eXs() { // from class: X.0fJX
            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                Object obj;
                InterfaceC805220ViK interfaceC805220ViK;
                String str;
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                HashMap<String, String> mapLIZ = null;
                if (c0j0m != null) {
                    obj = c0j0m.LIZ;
                } else {
                    obj = null;
                }
                if ((obj instanceof InterfaceC805220ViK) && (interfaceC805220ViK = (InterfaceC805220ViK) obj) != null) {
                    C1122420fJY c1122420fJY = this.LIZ;
                    try {
                        AbstractC2213701BkW abstractC2213701BkWLIZLLL = interfaceC805220ViK.LIZLLL();
                        if (abstractC2213701BkWLIZLLL != null) {
                            str = abstractC2213701BkWLIZLLL.LIZIZ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, "dm_guidance_prediction_strategy_v1")) {
                            Object objLIZJ = interfaceC805220ViK.LIZJ();
                            if (objLIZJ != null) {
                                mapLIZ = C328030CtV.LIZ(objLIZJ);
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("strategy value = ");
                            sbLIZ.append(mapLIZ);
                            C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
                            if (mapLIZ != null) {
                                c1122420fJY.LIZ(mapLIZ);
                            }
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str, C477840IoY c477840IoY) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("strategy error = ");
                sbLIZ.append(c477840IoY);
                C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
            }
        }, new C1092980eY4().LIZIZ(), null, "dm_guidance_prediction_strategy_v1");
        this.LIZJ = true;
    }

    public final void LIZJ() {
        if (this.LIZJ) {
            C20441214yg.LIZIZ("DM_guidance", "unregisterStrategy: dm_guidance_prediction_strategy_v1");
            ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW("dm_guidance_prediction_strategy_v1");
            this.LIZJ = false;
        }
    }

    public final void LIZ(HashMap<String, String> map) {
        Float fLJIIIIZZ;
        String str = map.get("model_score");
        if (str != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str);
        } else {
            fLJIIIIZZ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modelScore=");
        sbLIZ.append(fLJIIIIZZ);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
        if (fLJIIIIZZ != null) {
            fLJIIIIZZ.floatValue();
            if (Intrinsics.LIZLLL(fLJIIIIZZ, -1.0f)) {
                C20441214yg.LIZIZ("DM_guidance", "blocked");
                LIZJ();
            } else {
                if (fLJIIIIZZ.floatValue() <= LivesdkDmGuidancePredictionStrategySetting.INSTANCE.getValue()) {
                    C20441214yg.LIZIZ("DM_guidance", "non target");
                    return;
                }
                C20441214yg.LIZIZ("DM_guidance", "checkFrequency");
                LIZJ();
                if (!this.LIZIZ.invoke().booleanValue()) {
                    return;
                }
                C20441214yg.LIZIZ("DM_guidance", "showToolTip");
                this.LIZ.invoke(map);
            }
        }
    }

    public C1122420fJY(C1122550fJl c1122550fJl, C1122820fKC c1122820fKC) {
        this.LIZ = c1122550fJl;
        this.LIZIZ = c1122820fKC;
    }
}
