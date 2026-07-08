package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcPdpDenyCrossModuleCommonEvent;
import java.util.Set;
import kotlin.jvm.internal.AwS0S2500100_9;

/* JADX INFO: renamed from: X.0Nf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599320Nf0 {
    public static final void LIZ(String str, EnumC599500NfI enumC599500NfI, EnumC599160Nek enumC599160Nek, EnumC599330Nf1 enumC599330Nf1, Object obj, String str2, EnumC586340MzA enumC586340MzA, long j) {
        Set set;
        EnumC599340Nf2 enumC599340Nf2;
        EcPdpDenyCrossModuleCommonEvent.CrossModuleCommonEventDenyList crossModuleCommonEventDenyList = (EcPdpDenyCrossModuleCommonEvent.CrossModuleCommonEventDenyList) SettingsManager.LIZLLL().LJIIIIZZ("ec_pdp_deny_cross_module_common_event", EcPdpDenyCrossModuleCommonEvent.CrossModuleCommonEventDenyList.class, EcPdpDenyCrossModuleCommonEvent.LIZ);
        if (crossModuleCommonEventDenyList == null || (set = crossModuleCommonEventDenyList.denyList) == null) {
            set = C08CX.INSTANCE;
        }
        if (set.contains(enumC599160Nek.getValue())) {
            return;
        }
        if (obj instanceof InterfaceC634840OvC) {
            enumC599340Nf2 = EnumC599340Nf2.LYNX_AIR;
        } else {
            enumC599340Nf2 = EnumC599340Nf2.NATIVE;
        }
        C1018703yb.LIZLLL("rd_tiktokec_cross_module_common", new AwS0S2500100_9(str, enumC599500NfI, enumC599160Nek, enumC599340Nf2, enumC599330Nf1, str2, enumC586340MzA, j, 1));
    }
}
