package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0X55, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X55 {
    public static final C0X55 LIZ = new C0X55();
    public static final String[] LIZIZ = {".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".byteoversea.com", ".tiktokglobalshop.com", ".byteintl.com", ".capcut.net", ".faceueditor.com", ".ibytedtos.com", ".immers.page", ".isnssdk.com", ".sgsnssdk.com", ".tiktokv-eu.com", ".tiktokv-us.com", ".tiktokcdn-us.com", ".byteintlapi.com", ".ttwstatic.com", ".ttlstatic.com", ".oecstatic.com", "m.tiktok.shop", ".tiktokw.us", ".tiktokv.us", ".tiktokw.eu", ".tiktokv.eu", ".tiktokcdn-eu.com", ".tiktok-row.net", ".ttadsmanager.com", ".tiktokshop.com", ".tt.inc", ".tt.online", ".tt.fun", ".tt.site", ".tiktokimgcdn.com", ".tiktokimg-eu.com", ".tiktokimg-us.com", ".tiktokadawardssea.com", ".tiktok-global.com", ".tiktok-intl.com", ".tiktoklinksafety.com", ".tiktoklinksafety.us", ".tiktoklinksafety.eu", ".byteintl.net"};

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        IClientSecurityService iClientSecurityService = (IClientSecurityService) PluggableExtentionKt.pluggableSpi$default(IClientSecurityService.class, false, false, false, 14, null);
        if (iClientSecurityService != null && iClientSecurityService.LJIILL()) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Object[] objArr = LIZIZ;
        Object[] objArr2 = (Object[]) settingsManagerLIZLLL.LJIIIIZZ("pns_inner_domains", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        return !C1942007j8.LIZJ(UriProtector.parse(str), Arrays.asList(objArr));
    }
}
