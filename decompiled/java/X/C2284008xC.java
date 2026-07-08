package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings.EcSeoDiversionConfigSettings;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2284008xC {
    public static final C2284008xC LIZ = new C2284008xC();

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musically");
        sbLIZ.append("://main");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(Uri uri) {
        EcSeoDiversionConfigSettings.EcSeoDiversionConfigModel ecSeoDiversionConfigModelLIZ = EcSeoDiversionConfigSettings.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("config", ecSeoDiversionConfigModelLIZ.toString());
        if (!Intrinsics.LJFF(C13LP.LJJJLZIJ(0, uri.getPathSegments()), "shop")) {
            linkedHashMap.put("error_info", "Invalid Uri");
            LIZJ(uri);
            return LIZ();
        }
        try {
            String str = (String) C13LP.LJJJLZIJ(0, uri.getPathSegments());
            Uri.Builder builderPath = new Uri.Builder().scheme("musically").authority(str).path(C13LP.LJJLIIIJ(C13LP.LJJJJIZL(uri.getPathSegments(), 1), "/", null, null, 0, null, null, 62));
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null) {
                for (String str2 : queryParameterNames) {
                    builderPath.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                }
            }
            return builderPath.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Uri parse exception: ");
            String message = e.getMessage();
            if (message == null) {
                message = "Empty exception message";
            }
            sbLIZ.append(message);
            linkedHashMap.put("error_info", C2188811AlT.LIZIZ(sbLIZ));
            LIZJ(uri);
            return LIZ();
        }
    }

    public static void LIZJ(Uri uri) {
        C2284808xK c2284808xK = C2284808xK.LIZ;
        C2082708Dx.LIZ.getClass();
        int iLIZJ = C2082708Dx.LIZJ();
        String string = uri.toString();
        c2284808xK.getClass();
        C2284808xK.LIZ(0, "check_seo", "no_route", 0, "", "", 0.0f, iLIZJ, string);
    }
}
