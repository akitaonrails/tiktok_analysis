package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543300qGO {
    public static boolean LIZ(EnumC1063540dma enumC1063540dma, C1543910qHN c1543910qHN, String str, String str2, String str3) {
        ArrayList<String> arrayList;
        Uri uriBuild;
        ConcurrentHashMap<String, C1543310qGP> concurrentHashMap;
        C1543310qGP c1543310qGPLIZ;
        C1543310qGP c1543310qGP;
        ArrayList<String> arrayList2;
        c1543910qHN.LJJIFFI.LIZ(str3, "jsb_secure_token");
        if (!C1543230qGH.LIZ.LIZ) {
            c1543910qHN.LJJIFFI.LIZ(Boolean.FALSE, "jsb_secure_auth_enable");
        } else {
            c1543910qHN.LJJIFFI.LIZ(enumC1063540dma, "jsb_secure_jsb_permission");
            if (enumC1063540dma == EnumC1063540dma.SECURE) {
                try {
                    uriBuild = UriProtector.parse(str).buildUpon().clearQuery().build();
                    C1543930qHP c1543930qHP = c1543910qHN.LJJIFFI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("original_url: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", auth_url: ");
                    sbLIZ.append(uriBuild);
                    c1543930qHP.LIZ(C2188811AlT.LIZIZ(sbLIZ), "jsb_secure_url_marker");
                    concurrentHashMap = C1544020qHY.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1543910qHN.LJJIFFI.LIZ(e.getMessage(), "jsb_secure_create_or_update_error");
                }
                if (concurrentHashMap.containsKey(uriBuild.toString()) && (c1543310qGP = concurrentHashMap.get(uriBuild.toString())) != null && (arrayList2 = c1543310qGP.LIZ) != null && arrayList2.contains(c1543910qHN.LJFF)) {
                    c1543910qHN.LJJIFFI.LIZ(Boolean.TRUE, "jsb_secure_rule_cache");
                    c1543310qGPLIZ = concurrentHashMap.get(uriBuild.toString());
                } else if (str3.length() > 0) {
                    c1543310qGPLIZ = C1544020qHY.LIZ(c1543910qHN, uriBuild, str3);
                } else {
                    c1543910qHN.LJJIFFI.LIZ(Boolean.TRUE, "jsb_secure_token_is_null_or_empty");
                    arrayList = C1543230qGH.LIZ.LIZIZ;
                    if (arrayList == null && arrayList.contains(str2)) {
                        c1543910qHN.LJJIFFI.LIZ(Boolean.TRUE, "jsb_secure_fallback_method_contains");
                        c1543910qHN.LJJIFFI.LIZIZ(null, "jsb_sdk_error_secure_fallback_method_event", 1);
                        c1543910qHN.LIZJ = Boolean.FALSE;
                        return true;
                    }
                    c1543910qHN.LJJIFFI.LIZ(C1543230qGH.LIZ.LIZIZ, "jsb_secure_all_fallback_method");
                    c1543910qHN.LIZJ = Boolean.FALSE;
                    return false;
                }
                if (c1543310qGPLIZ != null) {
                    C1543930qHP c1543930qHP2 = c1543910qHN.LJJIFFI;
                    Boolean bool = Boolean.TRUE;
                    c1543930qHP2.LIZ(bool, "jsb_secure_auth_success");
                    c1543910qHN.LIZJ = bool;
                    return true;
                }
                arrayList = C1543230qGH.LIZ.LIZIZ;
                if (arrayList == null) {
                }
                c1543910qHN.LJJIFFI.LIZ(C1543230qGH.LIZ.LIZIZ, "jsb_secure_all_fallback_method");
                c1543910qHN.LIZJ = Boolean.FALSE;
                return false;
            }
        }
        return true;
    }
}
