package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894970Z9b implements C0Z9J {
    public static final C894970Z9b LL = new C894970Z9b();

    @Override // X.C0Z9J
    public final void LJIJI(String str, boolean z) {
        String lightInteractionName;
        String strValueOf = String.valueOf(C0YNP.LJII(str));
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
        if (z) {
            lightInteractionName = EnumC895010Z9f.SPARK_BACK_V1.getLightInteractionName();
        } else {
            lightInteractionName = EnumC895010Z9f.SPARK_V1.getLightInteractionName();
        }
        iLightInteractionPlatformService.LJJLIIIJILLIZJL(lightInteractionName, str, strValueOf, C2097608Jq.LJIIJ(new Pair("enter_from", EnumC1908380zlE.INNER_PUSH.getValue()), new Pair("enter_method", EnumC1908370zlD.CELL.getValue()), new Pair("message_from", "spark")), null, null, null, null, null, null, null);
    }
}
