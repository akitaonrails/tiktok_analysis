package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.input.model.TextPublishModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395430mPt {
    public static final C1395430mPt LIZ = new C1395430mPt();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(536));
    public static final Map<String, TextPublishModel> LIZJ = new LinkedHashMap();

    public static String LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
        if (curUserId == null) {
            return "text_publish_cache";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text_publish_cache");
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static TextPublishModel LIZIZ() {
        String strLIZ = LIZ();
        Map<String, TextPublishModel> map = LIZJ;
        TextPublishModel textPublishModel = (TextPublishModel) ((LinkedHashMap) map).get(strLIZ);
        if (textPublishModel != null) {
            return textPublishModel;
        }
        String string = ((Keva) LIZIZ.getValue()).getString(strLIZ, null);
        if (string != null) {
            try {
                Object objLJII = new Gson().LJII(string, TextPublishModel.class);
                map.put(strLIZ, (TextPublishModel) objLJII);
                return (TextPublishModel) objLJII;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
