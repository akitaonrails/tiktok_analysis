package X;

import com.bytedance.android.livesdk.performancetune.strategy.model.PspStrategyInputConfig;
import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0eaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094760eaw extends AbstractC1094770eax<PspStrategyInputConfig> {
    public final ConcurrentHashMap<String, InterfaceC830890Wid> LIZLLL;

    public final InterfaceC830890Wid LIZ(final String str) {
        InterfaceC830890Wid interfaceC830890Wid = this.LIZLLL.get(str);
        if (interfaceC830890Wid == null) {
            ((ILiveStrategyCenterService) C1161920gLG.LIZJ(ILiveStrategyCenterService.class)).G2(new InterfaceC1092770eXj() { // from class: X.0eav
                @Override // X.InterfaceC1092770eXj
                public final void LIZ() {
                }

                @Override // X.InterfaceC1092770eXj
                public final void LIZJ(C477840IoY c477840IoY) {
                    this.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("registerStrategyWithTriggerConfig: fail = ");
                    sbLIZ.append(c477840IoY);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1092770eXj
                public final void LIZLLL(C1093040eYA c1093040eYA) {
                    this.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("registerStrategyWithTriggerConfig: result = ");
                    sbLIZ.append(c1093040eYA);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1092770eXj
                public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid2, EnumC2213771Bkd enumC2213771Bkd) {
                    if (interfaceC830890Wid2 != null) {
                        C1094760eaw c1094760eaw = this.LIZ;
                        c1094760eaw.LIZLLL.put(str, interfaceC830890Wid2);
                    }
                    this.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on register scene success: scene = ");
                    sbLIZ.append(interfaceC830890Wid2);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }, new TriggerStrategyConfig(str, "", 1L, EnumC1093190eYP.PSP_CEP.getType(), null, null, null, null, null, null, null, null, null));
        }
        return interfaceC830890Wid;
    }

    public C1094760eaw(InterfaceC1094820eb2 interfaceC1094820eb2, InterfaceC292601Bk interfaceC292601Bk, InterfaceC1094860eb6 interfaceC1094860eb6) {
        super(interfaceC1094820eb2, interfaceC292601Bk, interfaceC1094860eb6);
        this.LIZLLL = new ConcurrentHashMap<>();
    }
}
