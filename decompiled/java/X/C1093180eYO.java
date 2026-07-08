package X;

import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093180eYO {
    public static AnonymousClass0956 LIZ;
    public static InterfaceC830890Wid LIZIZ;
    public static Function1<Object, Unit> LIZJ;

    public static void LIZIZ() {
        LIZJ = null;
        ((ILiveStrategyCenterService) C1161920gLG.LIZJ(ILiveStrategyCenterService.class)).T4(new TriggerStrategyConfig("live_smb_host_room", "", 1L, EnumC1093190eYP.PSP_CEP.getType(), null, null, null, null, null, null, LIZIZ, null, null));
        AnonymousClass0956 anonymousClass0956 = LIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static void LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send pin card guide strategy register log, group=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("PcsPinCardGuideClientAIStrategy", C2188811AlT.LIZIZ(sbLIZ));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance_pin_card_guidance_register");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "group");
        c474500IjALIZ.LIZ();
    }
}
