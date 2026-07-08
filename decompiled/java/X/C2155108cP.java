package X;

import android.content.Context;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigDomain;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigPayload;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reliability.emergencychannel.EmergencyChannelManager$init$1", f = "EmergencyChannelManager.kt", l = {55}, m = "invokeSuspend")
public final class C2155108cP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2155108cP(Context context, InterfaceC1364105Vn<? super C2155108cP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2155108cP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EmergencyChannelManager@f1.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!((Boolean) C2154408cI.LIZ.getValue()).booleanValue()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EmergencyChannelManager@f1.init$1");
                return unit;
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "emergency_drill_before_bytesync_1", true, false)) {
                C2155608cU.LIZJ("emergency_drill_before_bytesync_1");
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "emergency_drill_before_bytesync_2", true, false)) {
                C2155608cU.LIZJ("emergency_drill_before_bytesync_2");
            }
            Map<EmergencyConfigDomain, C2155708cV> map = C08NF.LIZ;
            Context context = this.LLILLJJLI;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2154908cN(context, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EmergencyChannelManager@f1.init$1");
                return objLJFF;
            }
        }
        EmergencyConfigPayload emergencyConfigPayload = (EmergencyConfigPayload) obj;
        if (emergencyConfigPayload != null) {
            Map<EmergencyConfigDomain, C2155708cV> map2 = C08NF.LIZ;
            EmergencyConfigDomain emergencyConfigDomain = emergencyConfigPayload._domain;
            if (emergencyConfigDomain == null) {
                emergencyConfigDomain = EmergencyConfigDomain.UNKNOWN;
            }
            if (map2.get(emergencyConfigDomain) != null) {
                C2155708cV.LIZIZ = EmergencyConfigPayload.LIZ(emergencyConfigPayload, emergencyConfigPayload.content.LIZJ());
                C2155708cV.LIZ();
                String strName = C2155708cV.LIZJ.name();
                String str = emergencyConfigPayload.configId;
                if (C2155408cS.LIZ() >= 1) {
                    C793770VBv.LJII("emergency_handler_on_load_config", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("domain", strName), new Pair("config_id", str))), null, null);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("init: No handler for domain=");
                EmergencyConfigDomain emergencyConfigDomain2 = emergencyConfigPayload._domain;
                if (emergencyConfigDomain2 == null) {
                    emergencyConfigDomain2 = EmergencyConfigDomain.UNKNOWN;
                }
                sbLIZ.append(emergencyConfigDomain2);
                C2155608cU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "emergency_drill_config_5", true, false)) {
            C2155608cU.LIZJ("emergency_drill_config_5");
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "emergency_drill_config_6", true, false)) {
            C2155608cU.LIZJ("emergency_drill_config_6");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EmergencyChannelManager@f1.init$1");
        return unit2;
    }
}
