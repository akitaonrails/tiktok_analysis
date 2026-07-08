package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0hMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200940hMC {
    public static final C1200940hMC LIZ = new C1200940hMC();

    public static boolean LIZIZ(Context context) {
        return ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, context);
    }

    public static boolean LIZ(Context context, TokenCert tokenCert) {
        List listLJFF;
        boolean z;
        EnumC1205470hTV enumC1205470hTVLIZIZ;
        boolean z2 = false;
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            if (iLocationServiceForLS != null) {
                enumC1205470hTVLIZIZ = iLocationServiceForLS.LIZIZ(context, tokenCert);
            } else {
                enumC1205470hTVLIZIZ = null;
            }
            if (enumC1205470hTVLIZIZ != EnumC1205470hTV.SUCCESS) {
                return false;
            }
            return true;
        }
        C1207340hWW.LIZ.getClass();
        if (C291220BbE.LIZ()) {
            listLJFF = C1207340hWW.LIZLLL().LJIIIIZZ();
            C1207210hWJ c1207210hWJLIZLLL = C1207340hWW.LIZLLL();
            if (listLJFF != null && !listLJFF.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            c1207210hWJLIZLLL.LIZJ("poi", "", "getScenes", !z, !((ArrayList) C1207340hWW.LJFF()).isEmpty());
        } else {
            listLJFF = C1207340hWW.LJFF();
        }
        if (listLJFF == null || listLJFF.isEmpty()) {
            z2 = true;
        }
        return !z2;
    }
}
