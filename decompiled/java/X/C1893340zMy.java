package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893340zMy implements InterfaceC1893530zNH {
    public static final C1893340zMy LL = new C1893340zMy();

    public static String LIZIZ(Uri uri) {
        String strLJJII;
        Uri uri2;
        String path;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP == null || (strLJJII = abstractC1896090zRP.LJJII()) == null) {
            strLJJII = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && (path = uri2.getPath()) != null) {
            String strLIZ = C200700px.LIZ(path);
            if (strLIZ != null) {
                path = strLIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(path);
            sbLIZ.append('_');
            sbLIZ.append(strLJJII);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public static String LIZJ(String str) {
        String strLJJII;
        if (str.length() == 0) {
            return null;
        }
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP == null || (strLJJII = abstractC1896090zRP.LJJII()) == null) {
            strLJJII = "";
        }
        String strLIZ = C200700px.LIZ(str);
        if (strLIZ != null) {
            str = strLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(strLJJII);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(SparkContext sparkContext) {
        String str;
        Object obj = sparkContext.extraRuntimeInfo.get((Object) "_pa_inc_api_cache_data");
        Integer numValueOf = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GP memory data length of ");
        sbLIZ.append("_pa_inc_api_cache_data");
        sbLIZ.append(" is : ");
        if (str != null) {
            numValueOf = Integer.valueOf(str.length());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && str.length() > 0) {
            sparkContext.LJJLIIIJ("", "_pa_inc_api_cache_data");
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    @Override // X.InterfaceC1893530zNH
    public final void LIZ(SparkContext sparkContext) {
        Uri uri = UriProtector.parse(sparkContext.LJJIL());
        if (C1893350zMz.LIZ(sparkContext) && ((Boolean) AnonymousClass0510.LIZLLL.getValue()).booleanValue()) {
            C259800zU c259800zU = new C259800zU();
            ?? LIZIZ = LIZIZ(uri);
            if (LIZIZ != 0) {
                c259800zU.element = LIZIZ;
                C01U6.LIZIZ(new AwS429S0200000_28(sparkContext, c259800zU, 152));
            }
        }
    }
}
