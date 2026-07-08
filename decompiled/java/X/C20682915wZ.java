package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15wZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20682915wZ extends AbstractC20655215s6 {
    public InterfaceC830890Wid LIZIZ;
    public InterfaceC830890Wid LIZJ;
    public InterfaceC20683915wj LIZLLL;
    public final String LJ = "outreach_strategy_register_finish";
    public final C830930Wih LJFF;

    @Override // X.AbstractC20655215s6
    public final void LIZIZ() {
    }

    @Override // X.AbstractC20655215s6
    public final String LIZJ() {
        return "PSPInitOperator";
    }

    public C20682915wZ() {
        C830930Wih c830930WihLIZ;
        if (C2357209Lm.LIZ().optThreadPoolSize > 0) {
            ExecutorService executorServiceH4 = C2357209Lm.LIZ().optThreadPoolSize == 1 ? C786410Ut5.h4() : C786410Ut5.d4(C2357209Lm.LIZ().optThreadPoolSize);
            C830920Wig c830920Wig = new C830920Wig();
            c830920Wig.LIZLLL = executorServiceH4;
            c830930WihLIZ = c830920Wig.LIZ();
        } else {
            c830930WihLIZ = null;
        }
        this.LJFF = c830930WihLIZ;
    }

    public final void LJ(InterfaceC20683915wj interfaceC20683915wj) {
        this.LIZLLL = interfaceC20683915wj;
        boolean zLJIIIIZZ = C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "disable_duplicate_scene", false, false);
        C20571615ec.LIZ.getClass();
        C20571615ec.LIZJ("get enable_duplicate_scene:" + zLJIIIIZZ);
        if (zLJIIIIZZ) {
            C20571615ec.LIZIZ("optOutreachScene: register feed_outreach");
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(EnumC1781240wSA.FEED_OUTREACH.getSceneName(), new ArrayList(), this.LJFF, new AbstractC830880Wic() { // from class: X.15wa
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    InterfaceC20683915wj interfaceC20683915wj2 = this.LIZ.LIZLLL;
                    if (interfaceC20683915wj2 != null) {
                        interfaceC20683915wj2.LIZ(interfaceC805220ViK);
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    this.LIZ.LIZLLL(EnumC1781240wSA.FEED_OUTREACH, interfaceC830890Wid, enumC2213771Bkd, true);
                }
            });
        } else {
            C20571615ec.LIZIZ("optOutreachScene: register feed_outreach_cold_start");
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(EnumC1781240wSA.FEED_OUTREACH_COLD_START.getSceneName(), new ArrayList(), this.LJFF, new AbstractC830880Wic() { // from class: X.15wc
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    InterfaceC20683915wj interfaceC20683915wj2 = this.LIZ.LIZLLL;
                    if (interfaceC20683915wj2 != null) {
                        interfaceC20683915wj2.LIZ(interfaceC805220ViK);
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    this.LIZ.LIZLLL(EnumC1781240wSA.FEED_OUTREACH_COLD_START, interfaceC830890Wid, enumC2213771Bkd, true);
                }
            });
        }
    }

    public final void LIZLLL(EnumC1781240wSA enumC1781240wSA, InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd, boolean z) {
        List<InterfaceC830900Wie> listLIZJ;
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("optOutreachScene: register result: ");
        sbLIZ.append(enumC1781240wSA.getSceneName());
        sbLIZ.append(" result: stateCode:");
        sbLIZ.append(enumC2213771Bkd);
        sbLIZ.append(", TTMScene:");
        sbLIZ.append(interfaceC830890Wid);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571615ec.getClass();
        C20571615ec.LIZIZ(strLIZIZ);
        if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
            if (enumC1781240wSA == EnumC1781240wSA.FEED_OUTREACH_COLD_START) {
                this.LIZIZ = interfaceC830890Wid;
                IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
                if (iDowngradeApi != null) {
                    iDowngradeApi.LJI(new AwS575S0100000_31(this, 1545));
                }
            } else {
                this.LIZJ = interfaceC830890Wid;
            }
            if (interfaceC830890Wid != null && (listLIZJ = interfaceC830890Wid.LIZJ()) != null) {
                Iterator<InterfaceC830900Wie> it2 = listLIZJ.iterator();
                while (it2.hasNext()) {
                    AbstractC2213721BkY abstractC2213721BkYLIZIZ = it2.next().LIZIZ();
                    String str = abstractC2213721BkYLIZIZ.LIZ;
                    String str2 = abstractC2213721BkYLIZIZ.LJ;
                    C20571615ec c20571615ec2 = C20571615ec.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("register package: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(str2);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c20571615ec2.getClass();
                    C20571615ec.LIZJ(strLIZIZ2);
                }
            }
            if (z) {
                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream(this.LJ, new JSONObject(), (ExecutorService) null);
                return;
            }
            return;
        }
        if (enumC1781240wSA == EnumC1781240wSA.FEED_OUTREACH_COLD_START) {
            C20571615ec.LIZIZ("optOutreachScene: register feed_outreach");
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(EnumC1781240wSA.FEED_OUTREACH.getSceneName(), new ArrayList(), this.LJFF, new AbstractC830880Wic() { // from class: X.15wb
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid2) {
                    InterfaceC20683915wj interfaceC20683915wj = this.LIZ.LIZLLL;
                    if (interfaceC20683915wj != null) {
                        interfaceC20683915wj.LIZ(interfaceC805220ViK);
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid2, EnumC2213771Bkd enumC2213771Bkd2) {
                    this.LIZ.LIZLLL(EnumC1781240wSA.FEED_OUTREACH, interfaceC830890Wid2, enumC2213771Bkd2, true);
                }
            });
        }
        C20684115wl c20684115wl = new Object() { // from class: X.15wl
        };
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("StateCode=");
        sbLIZ3.append(enumC2213771Bkd);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("create scene ");
        sbLIZ4.append(enumC1781240wSA.getSceneName());
        sbLIZ4.append(" error");
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        c20684115wl.getClass();
        OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
        if (outreachPathEventConfigLIZ != null && !outreachPathEventConfigLIZ.outreachPSPResult) {
            return;
        }
        C20684815ws.LJIILLIIL("outreach_psp_engine", C2097608Jq.LJIIJ(new Pair("error_code", "10005"), new Pair("error_msg", strLIZIZ4), new Pair("extra_info", strLIZIZ3)));
    }
}
