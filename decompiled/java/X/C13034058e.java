package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.EcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.058e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13034058e {
    public static final C13034058e LIZ = new C13034058e();

    public static void LIZ(EnumC13036058g enumC13036058g, EnumC13035058f enumC13035058f, boolean z, Map map) {
        AnonymousClass0317 anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin;
        String str;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = false;
            anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin = EcUgDependencyService.createIEcUgDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            }
            String name2 = IEcUgDependencyService.class.getName();
            if (anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcUgDependencyService.class);
        }
        IEcUgDependencyService iEcUgDependencyService = (IEcUgDependencyService) anonymousClass0317CreateIEcUgDependencyServicebyMonsterPlugin;
        HashMap map2 = new HashMap();
        map2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map2.put("stage", enumC13036058g.getValue());
        map2.put("sub_stage", enumC13035058f.getValue());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_success", str);
        if (map != null) {
            map2.putAll(map);
        }
        iEcUgDependencyService.trackLogCommon("rd_tiktokec_global_trigger", map2);
    }
}
