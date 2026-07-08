package X;

import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048190dNp {
    public static final C1048190dNp LIZ = new C1048190dNp();

    public static boolean LIZ() {
        List<String> list = AdAutofillConfigSettings.LIZ().channelList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        boolean zLIZIZ = false;
        for (String str : list) {
            if (a0.LJJIIZI(AdAutofillConfigSettings.LIZ().autofillPopupSchema, str, false)) {
                C988570bpf.LIZ.getClass();
                zLIZIZ = C1041070dCL.LIZIZ() != null ? C1552050qUV.LIZIZ(((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("global"), str) : false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adLandPagePreloadDepend is ext ");
                sbLIZ.append(C1041070dCL.LIZIZ() != null);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return zLIZIZ;
    }
}
