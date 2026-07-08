package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1027260cq4 extends AbstractC1027370cqF {
    public static final String LIZJ;

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
        c1027460cqO.LJI("ad_lynx_download_LocalOpenUrlHandler_doHandle", "begin", String.valueOf(LJ().LIZ.LIZJ));
        Uri uri = UriProtector.parse(LJ().LIZJ.LIZ);
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            return false;
        }
        String string = uri.buildUpon().appendQueryParameter("source_aid", LJ().LIZ.LJIIIIZZ).build().toString();
        String scheme2 = UriProtector.parse(string).getScheme();
        String lowerCase = scheme2 != null ? scheme2.toLowerCase(Locale.ROOT) : null;
        if (LJI(lowerCase)) {
            c1027460cqO.LIZ(string);
            c1027460cqO.LJI("ad_lynx_download_LocalOpenUrlHandler_doHandle", "startAdsAppActivity", String.valueOf(LJ().LIZ.LIZJ));
            return c1027460cqO.LIZJ(LIZLLL(), string);
        }
        if (!Intrinsics.LJFF(lowerCase, "aweme")) {
            c1027460cqO.LJI("ad_lynx_download_LocalOpenUrlHandler_doHandle", "fail", String.valueOf(LJ().LIZ.LIZJ));
            return false;
        }
        c1027460cqO.LJI("ad_lynx_download_LocalOpenUrlHandler_doHandle", "open", String.valueOf(LJ().LIZ.LIZJ));
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
        if (iEcUgVSAService == null || (!iEcUgVSAService.LIZJ(string) && !iEcUgVSAService.LJIIIZ(string) && !iEcUgVSAService.LJFF(string))) {
            IFeedAdShoppingService.LIZ.getClass();
            if (!u.LJJIIJZLJL(string, "aweme://ec/sku?", false) && !u.LJJIIJZLJL(string, "aweme://ec/order_submit_v2?", false)) {
                if (a0.LJJIIZI(string, "aweme://commerce/jsb/direct_message", false)) {
                    IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                    return c1027460cqO.LJII(-1, LIZLLL(), iAwemeService != null ? iAwemeService.zr(String.valueOf(LJ().LIZ.LIZJ)) : null, false);
                }
                AwemeRawAd awemeRawAd = LJ().LIZ.LIZ;
                return (awemeRawAd == null || awemeRawAd.getAdUrlType() != 1) ? c1027460cqO.open(string) : c1027460cqO.open(LJ().LIZJ.LIZ);
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(LIZLLL());
        return c19egLIZIZ != null ? c1027460cqO.LJIIIZ(c19egLIZIZ, string) : c1027460cqO.open(string);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJIIJ);
        LIZJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        if (TextUtils.isEmpty(LJ().LIZJ.LIZ) || C1030670cvZ.LIZ(LJ().LIZJ.LIZ)) {
            return false;
        }
        String scheme = UriProtector.parse(LJ().LIZJ.LIZ).getScheme();
        String lowerCase = scheme != null ? scheme.toLowerCase(Locale.ROOT) : null;
        return LJI(lowerCase) || Intrinsics.LJFF(lowerCase, "aweme");
    }

    public static boolean LJI(String str) {
        if (str != null) {
            if (!TextUtils.equals("sslocal", str) && !TextUtils.equals("localsdk", str)) {
                if (((Boolean) C105500ab.LIZ.getValue()).booleanValue() && TextUtils.equals(LIZJ, str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
