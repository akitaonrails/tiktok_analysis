package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824430WVt {
    public static final String[] LIZ = new String[0];

    public static String[] LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("tt_dm_illegal_schema", String[].class, strArr);
        return strArr2 != null ? strArr2 : strArr;
    }

    public static boolean LIZIZ(String str) {
        Uri uri;
        String[] strArrLIZ = LIZ();
        if (strArrLIZ.length != 0 && str != null && str.length() != 0 && (uri = UriProtector.parse(str)) != null) {
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                for (String str2 : strArrLIZ) {
                    if (u.LJIJI(scheme, str2, true)) {
                        if (str2 == null) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static String LIZJ(String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (LIZ().length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (str != null && str.length() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                try {
                    Uri uri = UriProtector.parse(str);
                    String scheme = uri.getScheme();
                    if (scheme == null || scheme.length() == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        if (z) {
                            IMHostApi.LIZ.getClass();
                            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                            if (iMHostApiLIZ != null) {
                                iMHostApiLIZ.LJ();
                            }
                        }
                        str = uri.buildUpon().scheme("tiktok").build().toString();
                        return str;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("replaceIllegalScheme failed ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return str;
    }
}
