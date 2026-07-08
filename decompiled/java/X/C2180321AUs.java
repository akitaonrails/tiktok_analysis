package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180321AUs {
    public static C2180331AUt LIZ() {
        boolean z;
        if (C2180331AUt.LJIIL == null) {
            synchronized (C2180331AUt.LIZJ) {
                try {
                    if (C2180331AUt.LJIIL == null) {
                        if (C275810ArT.LIZJ()) {
                            z = !C2180331AUt.LIZLLL.isEmpty();
                        } else if (C275810ArT.LIZLLL()) {
                            z = C2180331AUt.LJ.getValue().getBoolean("long_term_bg_play_enable", false);
                        }
                        if (z) {
                            C2180331AUt.LJIIL = new C2180331AUt();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C2180331AUt.LJIIL;
    }

    public static boolean LIZJ(Aweme aweme, String str, String str2) {
        IECommerceAnchorService iECommerceAnchorService;
        if (!C2180331AUt.LJIIJJI.contains(str)) {
            return false;
        }
        if ((Intrinsics.LJFF(str, "search_result") && !Intrinsics.LJFF(str2, "video")) || aweme.isAd() || C1017070cZd.LLIIIJ(aweme) || C729510SjV.LJJIJIL(aweme) || aweme.isPaidContent || AwemeSaaSExtKt.isLive(aweme) || AwemeExtKt.isPhotoMode(aweme) || C0NC0.LIZ(aweme) || ((iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)) != null && iECommerceAnchorService.LJJJIL(aweme))) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str, String str2, String str3, Aweme aweme) {
        String aid = aweme.getAid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C275810ArT.LIZJ()) {
            return Intrinsics.LJFF(((LinkedHashMap) C2180331AUt.LIZLLL).get(strLIZIZ), aid);
        }
        if (!C275810ArT.LIZLLL() || !C2180331AUt.LJ.getValue().getBoolean("long_term_bg_play_enable", false) || !LIZJ(aweme, str, str3)) {
            return false;
        }
        return true;
    }
}
