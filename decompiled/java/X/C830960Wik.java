package X;

import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ttm.rule.TTMFeatureRule;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830960Wik extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ FeatureItem LLILLJJLI;
    public final /* synthetic */ FeatureItem LLILLL;
    public final /* synthetic */ C0XEJ LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C2344009Gk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C830960Wik(C2344009Gk c2344009Gk, C0XEJ c0xej, FeatureItem featureItem, FeatureItem featureItem2, String str, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = featureItem;
        this.LLILLL = featureItem2;
        this.LLILZ = c0xej;
        this.LLILZIL = z;
        this.LLILZLL = c2344009Gk;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final String str = this.LL;
        C830930Wih c830930Wih = C830910Wif.LIZ;
        final FeatureItem featureItem = this.LLILLJJLI;
        final FeatureItem featureItem2 = this.LLILLL;
        final C0XEJ c0xej = this.LLILZ;
        final boolean z = this.LLILZIL;
        final C2344009Gk c2344009Gk = this.LLILZLL;
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str, null, c830930Wih, new AbstractC830880Wic() { // from class: X.0XEH
            @Override // X.AbstractC830880Wic
            public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                String str2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feature:");
                sbLIZ.append(featureItem2.name);
                sbLIZ.append(" TTMSceneKey:");
                if (interfaceC830890Wid != null) {
                    str2 = ((C830870Wib) interfaceC830890Wid).LIZ;
                } else {
                    str2 = null;
                }
                sbLIZ.append(str2);
                sbLIZ.append(" action result statuscode:");
                sbLIZ.append(interfaceC805220ViK.LIZIZ());
                sbLIZ.append(" errorMsg:");
                sbLIZ.append(interfaceC805220ViK.getErrorMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                EnumC1910390zoT enumC1910390zoTLIZIZ;
                AbstractC2213701BkW abstractC2213701BkWLIZLLL;
                if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                    String str2 = featureItem.name;
                    if (str2 != null) {
                        c0xej.notifyGlobalFeatureChange(str2, 1);
                    }
                    C0XEN.LJIIIIZZ.LJI.add(str);
                    TTMFeatureRule tTMFeatureRule = featureItem2.rule;
                    if (tTMFeatureRule != null && tTMFeatureRule.forceUpdate) {
                        InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, str, new TTMParamData((Map<String, Object>) C2097608Jq.LJ()));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("feature:");
                        sbLIZ.append(featureItem2.name);
                        sbLIZ.append(" forceUpdateScene TTMScene:");
                        sbLIZ.append(interfaceC830890Wid);
                        sbLIZ.append(" stateCode:");
                        if (interfaceC805220ViKRunScene != null) {
                            enumC1910390zoTLIZIZ = interfaceC805220ViKRunScene.LIZIZ();
                        } else {
                            enumC1910390zoTLIZIZ = null;
                        }
                        sbLIZ.append(enumC1910390zoTLIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (interfaceC805220ViKRunScene != null && (abstractC2213701BkWLIZLLL = interfaceC805220ViKRunScene.LIZLLL()) != null) {
                            abstractC2213701BkWLIZLLL.LJ(interfaceC805220ViKRunScene);
                        }
                    }
                } else {
                    Map<String, String> map = C830950Wij.LIZIZ;
                    String str3 = str;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c0xej.LIZLLL);
                    sbLIZ2.append('.');
                    sbLIZ2.append(featureItem.name);
                    map.put(str3, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (z) {
                    c2344009Gk.LJFF("register_scene_state_code", enumC2213771Bkd.toString());
                    c2344009Gk.LIZJ(0, "retry");
                    C20684815ws.LJIILLIIL("ttm_feature_register", c2344009Gk.LIZ);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("feature:");
                sbLIZ3.append(featureItem2.name);
                sbLIZ3.append(" registerSceneResult TTMScene:");
                sbLIZ3.append(interfaceC830890Wid);
                sbLIZ3.append(" stateCode:");
                sbLIZ3.append(enumC2213771Bkd);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        });
        return Unit.LIZ;
    }
}
