package X;

import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.room.BizStrategy;

/* JADX INFO: renamed from: X.0eYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093520eYw extends AbstractC1093440eYo {
    public final C0VMV LJ;

    @Override // X.AbstractC1093440eYo
    public final void LJI() {
    }

    @Override // X.AbstractC1093440eYo
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start strategyId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        C796430VMb c796430VMb = this.LIZ.LIZJ;
        sbLIZ.append(c796430VMb != null ? c796430VMb.LIZIZ : null);
        sbLIZ.append(", strategyKey=");
        C796430VMb c796430VMb2 = this.LIZ.LIZJ;
        sbLIZ.append(c796430VMb2 != null ? c796430VMb2.LIZJ : null);
        C227400uG.LIZ("PitayaStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1092770eXj interfaceC1092770eXjLIZ = this.LJ.LIZ(this.LIZIZ);
        if (interfaceC1092770eXjLIZ != null) {
            interfaceC1092770eXjLIZ.LIZ();
        }
        BizStrategy bizStrategy = this.LIZ.LIZIZ;
        if (bizStrategy != null) {
            LIZLLL(bizStrategy.action);
            C1093270eYX.LIZIZ(this, bizStrategy.triggerEvent, bizStrategy.tickerEventName, Long.valueOf((long) bizStrategy.tickerInterval));
        }
    }

    @Override // X.AbstractC1093440eYo
    public final void LIZIZ(C473440IhS c473440IhS) {
        super.LIZIZ(c473440IhS);
        LJII(c473440IhS);
    }

    public final void LJII(final C473440IhS c473440IhS) {
        String str;
        FinalStrategyConfig finalStrategyConfig = new FinalStrategyConfig("", "", null, null, null, null, null, 1L, 30L, 0L, null, null);
        C0VMQ c0vmq = this.LIZ.LIZLLL;
        if (c0vmq == null || (str = c0vmq.LIZ) == null) {
            str = "";
        }
        finalStrategyConfig.setStrategyName(str);
        finalStrategyConfig.setPendingTimeout(this.LIZ.LIZIZ.timeOut);
        finalStrategyConfig.setType(EnumC1093370eYh.PITAYA.getType());
        ILiveStrategyCenterService iLiveStrategyCenterService = (ILiveStrategyCenterService) C1161920gLG.LIZJ(ILiveStrategyCenterService.class);
        if (iLiveStrategyCenterService != null) {
            iLiveStrategyCenterService.Mf0(new InterfaceC1092770eXj() { // from class: X.0eYv
                @Override // X.InterfaceC1092770eXj
                public final void LIZ() {
                }

                @Override // X.InterfaceC1092770eXj
                public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                }

                @Override // X.InterfaceC1092770eXj
                public final void LIZJ(C477840IoY c477840IoY) {
                    String str2;
                    C1093520eYw c1093520eYw = this.LIZ;
                    InterfaceC1092770eXj interfaceC1092770eXjLIZ = c1093520eYw.LJ.LIZ(c1093520eYw.LIZIZ);
                    if (interfaceC1092770eXjLIZ != null) {
                        interfaceC1092770eXjLIZ.LIZJ(c477840IoY);
                    }
                    C796430VMb c796430VMb = this.LIZ.LIZ.LIZJ;
                    String str3 = c796430VMb.LIZIZ;
                    String str4 = c796430VMb.LIZJ;
                    C473440IhS c473440IhS2 = c473440IhS;
                    if (c473440IhS2 != null) {
                        str2 = c473440IhS2.LJ;
                    } else {
                        str2 = null;
                    }
                    int i = c477840IoY.LIZ;
                    String str5 = c477840IoY.LIZIZ;
                    if (str5 == null) {
                        str5 = "";
                    }
                    C1093620eZ6.LIZJ(new C1093610eZ5(str3, str4, str2, i, str5));
                }

                @Override // X.InterfaceC1092770eXj
                public final void LIZLLL(C1093040eYA c1093040eYA) {
                    Map<String, Object> linkedHashMap;
                    String str2;
                    C796430VMb c796430VMb = this.LIZ.LIZ.LIZJ;
                    C1093140eYK c1093140eYK = new C1093140eYK(c796430VMb.LIZIZ, c796430VMb.LIZJ, c1093040eYA.LIZIZ);
                    C473440IhS c473440IhS2 = c473440IhS;
                    if (c473440IhS2 != null) {
                        linkedHashMap = c473440IhS2.LIZ();
                    } else {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    C1093150eYL c1093150eYL = new C1093150eYL(true, c1093140eYK, null, linkedHashMap, 4);
                    C796430VMb c796430VMb2 = this.LIZ.LIZ.LIZJ;
                    String str3 = c796430VMb2.LIZIZ;
                    String str4 = c796430VMb2.LIZJ;
                    C473440IhS c473440IhS3 = c473440IhS;
                    if (c473440IhS3 != null) {
                        str2 = c473440IhS3.LJ;
                    } else {
                        str2 = null;
                    }
                    C1093620eZ6.LIZJ(new C1093610eZ5(str3, str4, str2));
                    C1093520eYw c1093520eYw = this.LIZ;
                    c1093520eYw.LIZ(c1093150eYL, c1093520eYw.LJ);
                }
            }, finalStrategyConfig);
        }
    }

    public C1093520eYw(C0VMZ c0vmz, C0VMV c0vmv) {
        super(c0vmz);
        this.LJ = c0vmv;
    }

    @Override // X.AbstractC1093440eYo
    public final void LIZJ(C796430VMb c796430VMb, C473440IhS c473440IhS) {
        LJII(c473440IhS);
    }
}
